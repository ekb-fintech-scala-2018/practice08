package fintech.lesson08.examples

object Example03ForAssignment extends App {

  val ints = List(1, 2, 3, 4)
  val strings = List("one", "two", "three", "four")

  val products = for {
    i <- ints
    square = i * i
    s <- strings
  } yield (s, square)

  println(products)

}
