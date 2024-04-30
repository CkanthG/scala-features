package service

import java.net.URL
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration.DurationInt
import scala.concurrent.{Await, Future, Promise}
import scala.io.Source
import scala.util.{Failure, Success, Using}

object WebServiceExample extends App {

  private def callWebService(url: String): Future[String] = {
    val promise = Promise[String]()

    // Start a new thread to perform the web service call
    val thread = new Thread {
      override def run(): Unit = {
        try {
          // Make the web service call
          val response = Using(Source.fromURL(new URL(url))) { source =>
            source.mkString
          }.get
          promise.success(response)
        } catch {
          case e: Exception => promise.failure(e)
        }
      }
    }
    thread.start()
    promise.future
  }

  // Define URLs for the web service calls
  private val url1 = "https://api.nasa.gov/planetary/apod?api_key=DEMO_KEY"
  private val url2 = "https://jsonplaceholder.typicode.com/posts"

  // Make the first web service call
  private val future1 = callWebService(url1)

  // Make the second web service call
  private val future2 = callWebService(url2)

  // Combine the results of the two web service calls
  private val combinedResult = for {
    result1 <- future1
    result2 <- future2
  } yield (result1, result2)

  // Process the combined result
  combinedResult.onComplete {
    case Success((result1, result2)) =>
      println(s"Result from service 1: $result1")
      println(s"Result from service 2: $result2")
    case Failure(exception) =>
      println(s"An error occurred: ${exception.getMessage}")
  }
  Await.result(future1, 1.seconds)
  Await.result(future2, 1.seconds)
}

