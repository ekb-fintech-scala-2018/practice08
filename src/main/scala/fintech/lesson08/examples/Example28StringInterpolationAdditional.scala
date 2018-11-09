package fintech.lesson08.examples

object Example28StringInterpolationAdditional extends App {

  case class SqlFragment(template: String, params: Seq[Any])

  val name = "Charlie"
  val age = 20

  val handWrittenSql = SqlFragment("SELECT * FROM users WHERE name = ? AND age > ?", List(name, age))
  // нужно самому контролировать что все параметры присутствуют

  implicit class SqlInterpolation(private val sc: StringContext) extends AnyVal {
    def sql(parts: Any*): SqlFragment =
      SqlFragment(
        template = sc.parts.mkString("?"),
        params = parts
      )
  }

  val sql = sql"SELECT * FROM users WHERE name = $name AND age > $age"

  println(sql)
  println(sql == handWrittenSql)
}
