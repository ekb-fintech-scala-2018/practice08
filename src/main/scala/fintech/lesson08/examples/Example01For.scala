package fintech.lesson08.examples



object Example01For extends App {

  val ints = List(1, 2, 3, 4)
  val strings = List("one", "two", "three", "four")

  for (i <- ints) println(i)

  println

  for {
    i <- ints
    s <- strings
  } println(s * i)



}
