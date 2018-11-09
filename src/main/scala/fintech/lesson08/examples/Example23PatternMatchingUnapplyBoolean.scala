package fintech.lesson08.examples

object Example23PatternMatchingUnapplyBoolean extends App {

  object Even {
    def unapply(i: Int): Boolean = i % 2 == 0
  }

  val i: Int = 12

  i match {
    case Even() => println(s"$i is even")
    case odd => println(s"$odd is odd")
  }

}
