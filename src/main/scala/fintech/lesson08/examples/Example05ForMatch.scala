package fintech.lesson08.examples

object Example05ForMatch extends App {

  val tuples = List((1, 3), (4, 5), (6, 10), (10, 12))

  val products = for {
    (start, end) <- tuples
  } yield end - start

  println(products)

}
