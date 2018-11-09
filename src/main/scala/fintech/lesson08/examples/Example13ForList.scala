package fintech.lesson08.examples

object Example13ForList extends App {

  def flatMap[A, B](fa: List[A])(f: A => List[B]): List[B] =
    fa match {
      case x :: xs => f(x) ::: xs.flatMap(f)
      case Nil => Nil
    }

}
