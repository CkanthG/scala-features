package messaging

import akka.actor.Actor
import messaging.AkkaMessagingSystem.{messageBroker, publisher1, publisher2}

// Define an actor to perform a task
class TaskActor extends Actor {
  def receive: Receive = {
    case ExecuteTask =>
      // Task logic goes here
      publisher1 ! Publish("topic1", s"Hello from Publisher 1!")
      publisher2 ! Publish("topic2", s"Hello from Publisher 2!")
      messageBroker ! Publish("topicN", s"Hello from MessageBroker!")
  }
}
