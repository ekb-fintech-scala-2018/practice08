package fintech.lesson08.examples

object Example12ForGeneralized extends App {

  trait C[A] {
    def map[B](f: A => B): C[B]
    def flatMap[B](f: A => C[B]): C[B]
    def withFilter(p: A => Boolean): C[A]
    def foreach(b: A => Unit): Unit
  }

}
