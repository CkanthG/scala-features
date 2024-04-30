package messaging

import akka.actor.Actor

// Define publisher actor
class Publisher extends Actor {
  def receive: Receive = {
    case Publish(topic, message) =>
      println(s"Publisher ${self.path.name} publishing message to topic $topic: $message")
      context.system.eventStream.publish(Message(topic, message))
  }
}
