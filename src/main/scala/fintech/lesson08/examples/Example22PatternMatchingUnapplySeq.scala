package fintech.lesson08.examples

object Example22PatternMatchingUnapplySeq extends App {

  object Divisors {
    def unapplySeq(i: Int): Option[Seq[Int]] = if (i >= 1) Some((1 to i).filter(n => i % n == 0)) else None
  }

  12 match {
    case Divisors(d1, d2, d3, d4, _*) => println(s"First 4 divisors are: $d1, $d2, $d3, $d4")
  }

  List(3, 4, 5, 6) match {
    case Seq(i1, i2, _*) => println(s"Seq($i1, $i2, ...)") // opposite for vararg syntax

  }
}
