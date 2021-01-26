package lecture

import scala.util.Try

object playground extends App{
  // `Try.apply` is the functional way of wrapping things in try-catch
  def first(list: List[Int]): Try[Int] = Try { list.head }

  val first3 = first(List.empty)    // Failure(...)
  val first4 = first(List(1, 2, 3)) // Success(1)

  println(first3.get)           // Will throw the caught exception
  println(first3.getOrElse(-1)) // -1

}
