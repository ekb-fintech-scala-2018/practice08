package fintech.lesson08.exercises

object Exercise01 {

  // Нужно реализовать методы map и flatMap так, чтобы Payment можно было использовать в for

  case class Payment[A](moneyAmount: Int, o: A) {
//    def map
//    def flatMap
  }

  def main(args: Array[String]): Unit = {
    case class Donut(size: Int)
    case class Coffee(size: Int)

    def buyDonut: Payment[Donut] = Payment(10, Donut(size = 5))

    def buyCoffee(donutSize: Int): Payment[Coffee] = {
      val coffeeSize = donutSize / 2
      Payment(coffeeSize * 3, Coffee(coffeeSize))
    }

    def pay[R](payment: Payment[R]): R = {
      println(s"Making payment: ${payment.moneyAmount}")
      payment.o
    }

//    val breakfast = for {
//      donut <- buyDonut
//      coffee <- buyCoffee(donut.size)
//    } yield (donut, coffee)
//
//    val result = pay(breakfast)
//    println(result)
  }
}
