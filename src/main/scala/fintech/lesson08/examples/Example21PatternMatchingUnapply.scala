package fintech.lesson08.examples

object Example21PatternMatchingUnapply extends App {

  object Double {
    def unapply(i: Int): Option[Int] = if (i % 2 == 0) Some(i / 2) else None
  }

  val i: Int = 12

  i match {
    case Double(n) => println(s"$i is double of $n")
    case odd => println(s"$odd is odd")
  }


}
