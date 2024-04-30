package messaging

import akka.actor.Actor

// Define message broker actor
class MessageBroker extends Actor {
  def receive: Receive = {
    case msg@Publish(topic, _) =>
      println(s"Topic: $topic -> Message: $msg")
      context.children.foreach(_.forward(msg))
  }
}
