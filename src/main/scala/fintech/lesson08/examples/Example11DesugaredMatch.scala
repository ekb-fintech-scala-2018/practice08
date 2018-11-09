package fintech.lesson08.examples

object Example11DesugaredMatch extends App {

  val tuples = List((1, 3), (4, 5), (6, 10), (10, 12))

  val products = for {
    (start, end) <- tuples
  } yield end - start

  // ==
  val desugaredProducts =
    tuples.map { case (start, end) => end - start }
  // добавляет withFilter в случае если паттерн-матчинг может сфейлится,
  // так что он никогда не кидается исключениями (зато требует withFilter)

  println(desugaredProducts)

}
