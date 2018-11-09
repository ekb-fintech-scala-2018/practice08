package fintech.lesson08.examples

object Example10DesugaredFilter extends App {

  val ints = List(1, 2, 3, 4)

  val products = for {
    i <- ints if i % 2 == 0
  } yield i
  // ==
  val productsDesugared =
    ints
      .withFilter(i => i % 2 == 0) // lazy filter
      .map(i => i)

  println(products)

}
