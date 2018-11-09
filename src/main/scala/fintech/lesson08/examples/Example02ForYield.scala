package fintech.lesson08.examples

object Example02ForYield extends App {

  val ints = List(1, 2, 3, 4)
  val strings = List("one", "two", "three", "four")

  val squares = for (i <- ints) yield i * i // squares: List[Int]

  println(squares)

  val products = for {
    i <- ints
    s <- strings
  } yield s * i

  println(products)

}
