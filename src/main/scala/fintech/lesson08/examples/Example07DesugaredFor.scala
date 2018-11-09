package fintech.lesson08.examples

object Example07DesugaredFor extends App {

  val ints = List(1, 2, 3, 4)
  val strings = List("one", "two", "three", "four")

  for (i <- ints) println(i)
  // ==
  ints.foreach { i =>
    println(i)
  }

  println

  for {
    i <- ints
    s <- strings
  } println(s * i)
  // ==
  ints.foreach { i =>
    strings.foreach { s =>
      println(s * i)
    }
  }


}
