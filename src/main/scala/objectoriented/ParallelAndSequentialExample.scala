package objectoriented

import scala.collection.parallel.CollectionConverters.ImmutableIterableIsParallelizable
import scala.collection.parallel.mutable.ParArray

object ParallelAndSequentialExample extends App {

  // Define a list of integers
  val numbers = (1 to 1000000).toList

  // Sequential processing
  val startTimeSeq = System.currentTimeMillis()
  val sequentialResult = numbers.map(_ * 2)
  val endTimeSeq = System.currentTimeMillis()
  println(s"Sequential processing time: ${endTimeSeq - startTimeSeq} ms")

  // Parallel processing
  val startTimeParallel = System.currentTimeMillis()
  val parallelResult = numbers.par.map(_ * 2)
  val endTimeParallel = System.currentTimeMillis()
  println(s"Parallel processing time: ${endTimeParallel - startTimeParallel} ms")

  // Parallel processing
  val startTimeParallel1 = System.currentTimeMillis()
  val parallelResult1 = ParArray.tabulate(numbers.length)(_ * 2)
  val endTimeParallel1 = System.currentTimeMillis()
  println(s"Parallel processing time: ${endTimeParallel1 - startTimeParallel1} ms")

}

