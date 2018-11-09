package fintech.lesson08.examples

import java.time.LocalDate

import fintech.lesson08.examples.Example14ForOption.Person

object Example25PatternMatchingUnapplyRegex extends App {

  val personRegex = """(.*?), (\d{4})-(\d{2})-(\d{2})""".r

  val string = "Alice, 1970-01-01"

  val parsedPerson = string match {
    case personRegex(name, year, month, day) =>
      Person(name, Some(LocalDate.of(year.toInt, month.toInt, day.toInt)))
  }

  println(parsedPerson)

}
