package objectoriented

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.{Await, Future}
import scala.concurrent.duration.Duration
import scala.concurrent.stm._

// Define a case class to represent a bank account
case class Account(id: String, var balance: Ref[Int])

// Define a method to transfer money between two accounts using STM
class Money() {
  def transferMoney(from: Account, to: Account, amount: Int): Boolean = {
    atomic { implicit txn =>
      if (from.balance.get >= amount) {
        from.balance -= amount
        to.balance += amount
        true // Transfer successful
      } else {
        false // Insufficient funds
      }
    }
  }
}


object STMExample extends App {
  // Create two accounts with initial balances
  private val account1 = Account("A1", Ref(1000))
  private val account2 = Account("A2", Ref(2000))

  // Print initial balances
  println(s"Initial balance of ${account1.id}: ${account1.balance.single()}")
  println(s"Initial balance of ${account2.id}: ${account2.balance.single()}")

  // Transfer money from account1 to account2 concurrently
  private val transfer1 = Future {
    new Money().transferMoney(account1, account2, 500)
  }
  private val transfer2 = Future {
    new Money().transferMoney(account2, account1, 700)
  }

  // Wait for both transfers to complete
  Await.result(transfer1, Duration.Inf)
  Await.result(transfer2, Duration.Inf)

  // Print final balances after transfers
  println(s"Final balance of ${account1.id}: ${account1.balance.single()}")
  println(s"Final balance of ${account2.id}: ${account2.balance.single()}")
}

