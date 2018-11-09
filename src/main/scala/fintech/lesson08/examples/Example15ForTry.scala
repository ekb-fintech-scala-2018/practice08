package fintech.lesson08.examples


object Example15ForTry extends App {

//  sealed trait Try[+T]
//  final case class Success[T](value: T) extends Try[T]
//  final case class Failure[T](error: Throwable) extends Try[T]
  import scala.util.{Failure, Success, Try}

  def flatMap[A, B](fa: Try[A])(f: A => Try[B]): Try[B] =
    fa match {
      case Success(a) => f(a) // : Try[B]
      case Failure(e) => Failure(e)
    }

  def doSomeCalculation(i: Int): Try[Int] = ???
  def doSomethingElse(i: Int): Try[String] = ???
  def doSomeMore(s: String): Try[Double] = ???


  for {
    i <- doSomeCalculation(10)
    s <- doSomethingElse(i)
    d <- doSomeMore(s)
  } yield d
}
