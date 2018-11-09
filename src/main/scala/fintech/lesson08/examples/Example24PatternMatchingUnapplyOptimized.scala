package fintech.lesson08.examples

object Example24PatternMatchingUnapplyOptimized extends App {

  class Double(private val i: Int) extends AnyVal {
    def get: Int = i / 2
    def isEmpty: Boolean = i % 2 != 0
  }

  object Double {
    def unapply(i: Int): Double = new Double(i)
  }

  val i: Int = 12

  i match {
    case Double(n) => println(s"$i is double of $n")
    case odd => println(s"$odd is odd")
  }

}
