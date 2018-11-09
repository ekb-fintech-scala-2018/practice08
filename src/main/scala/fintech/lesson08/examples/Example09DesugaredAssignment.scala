package fintech.lesson08.examples

object Example09DesugaredAssignment extends App {

  val ints = List(1, 2, 3, 4)
  val strings = List("one", "two", "three", "four")

  val products = for {
    i <- ints
    square = i * i
    s <- strings
  } yield (s, square)

  // ==

  val desugaredProducts =
    ints
      .map(x => (x * x, x))
      .flatMap { case (square, i) =>
        strings.map(s => (s, square))
      }


  println(desugaredProducts)

}
