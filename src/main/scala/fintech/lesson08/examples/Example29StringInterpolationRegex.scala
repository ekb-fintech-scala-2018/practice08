package fintech.lesson08.examples

import java.time.LocalDate

import fintech.lesson08.examples.Example14ForOption.Person

import scala.util.matching.Regex

object Example29StringInterpolationRegex extends App {

  implicit class RegexInterpolation(private val sc: StringContext) extends AnyVal {
    def r: Regex = sc.parts.mkString.r
  }

  val string = "Alice, 1970-01-01"

  val parsedPerson = string match {
    case r"""(.*?)$name, (\d{4})$year-(\d{2})$month-(\d{2})$day""" =>
      Person(name, Some(LocalDate.of(year.toInt, month.toInt, day.toInt)))
  }

  println(parsedPerson)
}
