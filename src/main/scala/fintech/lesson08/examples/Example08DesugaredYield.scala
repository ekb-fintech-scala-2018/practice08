package fintech.lesson08.examples

object Example08DesugaredYield extends App {

  val ints = List(1, 2, 3, 4)
  val strings = List("one", "two", "three", "four")

  val squares = for (i <- ints) yield i * i // squares: List[Int]
  // ==
  val squaresDesugared =
    ints.map(i => i * i)

  println(squaresDesugared)

  val products = for {
    i <- ints
    s <- strings
  } yield s * i
  // ==
  val productsDesugared =
    ints.flatMap { i =>
      strings.map(s => s * i)
    }

  println(productsDesugared)

}
