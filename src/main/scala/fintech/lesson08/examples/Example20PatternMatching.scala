package fintech.lesson08.examples

object Example20PatternMatching extends App {

  sealed trait Shape
  case class Circle(r: Double) extends Shape
  case class Square(x: Double) extends Shape

  val i = 12
  i match {
    case 1 => println("small")
    case 11 | 12 => println("big")
  }

  val s: Shape = Circle(5)

  s match {
    case s: Square => println(s"Square: ${s.x}") // type matching
    case c: Circle if c.r < 2 => println("Small circle") // if statement
    case Circle(r) => println(s"Circle, r=$r") // "deconstruction"
    case bigCircle @ Circle(r) if r >= 5 => println(s"Big circle: $bigCircle") // binding with deconstruction
  }
}
