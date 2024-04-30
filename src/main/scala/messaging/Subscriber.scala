package messaging

import akka.actor.Actor

// Define subscriber actor
class Subscriber extends Actor {
  private val subscribedTopics: Set[String] = Set[String]()

  def receive: Receive = onMessage(subscribedTopics)

  private def onMessage(subscribedTopics: Set[String]): Receive = {
    case Subscribe(topic) =>
      println(s"Subscriber ${self.path.name} subscribed to topic $topic")
      context.become(onMessage(subscribedTopics + topic))
    case Unsubscribe(topic) =>
      println(s"Subscriber ${self.path.name} unsubscribed from topic $topic")
      context.become(onMessage(subscribedTopics - topic))
    case Message(topic, content) if subscribedTopics.contains(topic) =>
      println(s"Subscriber ${self.path.name} received message on topic $topic: $content")
  }
}
