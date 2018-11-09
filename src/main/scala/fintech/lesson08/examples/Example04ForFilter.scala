package fintech.lesson08.examples

object Example04ForFilter extends App {

  val ints = List(1, 2, 3, 4)
  val strings = List("one", "two", "three", "four")

  val products = for {
    i <- ints if i % 2 == 0
    s <- strings
  } yield s * i

  println(products)

}
