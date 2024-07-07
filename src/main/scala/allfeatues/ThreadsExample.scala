package allfeatues

class MyThread extends Thread {
  override def run(): Unit = {
    println(s"Thread : ${Thread.currentThread().getName}")
  }
  def task(): Unit = {
    for (i <- 1 to 2) {
      println(s"task thread:$i")
      Thread.sleep(50)
    }
  }
}

class ThreadExe extends Runnable {
  override def run(): Unit = {
    println(s"Thread : ${Thread.currentThread().getName}")
  }
}

object ThreadsExample {
  def main(args: Array[String]): Unit = {
    println("Thread creation by extends Thread Class")
    for (x <- 1 to 5) {
      val thread = new MyThread()
      thread.setName(x.toString)
      thread.start()
      thread.task()
      val th = new Thread(new MyThread)
      th.setName("00-"+x)
      th.start()
    }
    Thread.sleep(400)
    println("Thread creation by extends Runnable interface")
    for (x <- 6 to 10) {
      val thread = new Thread(new ThreadExe())
      thread.setName(x.toString)
      thread.start()
    }
  }
}
