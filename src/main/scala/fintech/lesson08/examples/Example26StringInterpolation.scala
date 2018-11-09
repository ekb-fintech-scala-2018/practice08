package fintech.lesson08.examples

import java.time.LocalDate

import fintech.lesson08.examples.Example14ForOption.Person

object Example26StringInterpolation extends App {

  val person =
    Person("Charlie", Some(LocalDate.of(1975, 2, 15)))

  val string = s"This is ${person.name}, he was born ${person.birthday.fold("n/a")(_.toString)}"

  println(string)
}
