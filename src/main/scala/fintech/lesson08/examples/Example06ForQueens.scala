package fintech.lesson08.examples

object Example06ForQueens extends App {

  def queens(n: Int): List[List[(Int, Int)]] = {
    def placeQueens(k: Int): List[List[(Int, Int)]] =
      if (k == 0)
        List(List())
      else
        for {
          queens <- placeQueens(k - 1)
          column <- 1 to n
          queen = (k, column)
          if isSafe(queen, queens)
        } yield queen :: queens

    placeQueens(n)
  }

  def isSafe(queen: (Int, Int), queens: List[(Int, Int)]): Boolean =
    queens.forall(q => !inCheck(queen, q))

  def inCheck(q1: (Int, Int), q2: (Int, Int)): Boolean =
    q1._1 == q2._1 /*same row*/ || q1._2 == q2._2 /*same column*/ ||
      (q1._1 - q2._1).abs == (q1._2 - q2._2).abs /*on diagonal*/


//  def prettyPrintBoard(n: Int, qs: List[(Int, Int)]): String = {
//    def prettyPrintLine(n: Int, xs: List[Int]): String =
//      (1 to n).map(x => if (xs.contains(x)) "#" else " ").mkString("|", "|", "|")
//
//    (1 to n).map(y => prettyPrintLine(n, qs.collect { case (x, `y`) => x })).mkString("\n", "\n", "\n")
//  }
//
//
//  val n = 4
//  for {
//    qs <- queens(n)
//  } println(prettyPrintBoard(n, qs))
}
