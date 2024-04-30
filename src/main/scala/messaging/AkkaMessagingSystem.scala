package messaging

import akka.actor._

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration.DurationInt

object AkkaMessagingSystem extends App {
  val system = ActorSystem("AkkaMessagingSystem")

  // Create message broker actor
  val messageBroker = system.actorOf(Props[MessageBroker], "messageBroker")

  // Create publisher actors
  val publisher1 = system.actorOf(Props[Publisher], "publisher1")
  val publisher2 = system.actorOf(Props[Publisher], "publisher2")

  // Create subscriber actors
  private val subscriber1 = system.actorOf(Props[Subscriber], "subscriber1")
  private val subscriber2 = system.actorOf(Props[Subscriber], "subscriber2")

  // Subscribe subscribers to topics
  subscriber1 ! Subscribe("topic1")
  subscriber2 ! Subscribe("topic2")

  // Define an actor to execute a task
  private val taskActor = system.actorOf(Props[TaskActor], "taskActor")

  // Define the initial delay and the interval between executions
  private val initialDelay = 0.seconds
  private val interval = 1.second

  // Schedule the task with fixed delay
  private val scheduledTask = system.scheduler.scheduleWithFixedDelay(initialDelay, interval, taskActor, ExecuteTask)

  // Uncomment to stop the scheduled task after 5 seconds
  system.scheduler.scheduleOnce(5.seconds) {
    scheduledTask.cancel()

  }(system.dispatcher)

  // Terminate the actor system after 10 seconds
  system.scheduler.scheduleOnce(10.seconds) {
    system.terminate()
  }(system.dispatcher)
}
