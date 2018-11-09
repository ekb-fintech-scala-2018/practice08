package fintech.lesson08.examples

object Example16ForReader extends App {

  trait Storage {
    def get(key: String): String
    def store(key: String, value: String): Unit
  }

  case class StorageOp[A](run: Storage => A) {
    def map[B](f: A => B): StorageOp[B] = StorageOp(s => f(run(s)))

    def flatMap[B](f: A => StorageOp[B]): StorageOp[B] =
      StorageOp(s => f(run(s)).run(s))
  }

  def doSomeCalculation(i: Int): StorageOp[Int] = StorageOp { s =>
    s.get(i.toString).toInt
  }

  def doSomethingElse(i: Int): StorageOp[String] = ???
  def doSomeMore(s: String): StorageOp[Double] = ???


  val program/*: StorageOp[Double]*/ = for {
    i <- doSomeCalculation(10)
    s <- doSomethingElse(i)
    d <- doSomeMore(s)
  } yield d

  val storage: Storage = ???
  val result: Double = program.run(storage)
}
