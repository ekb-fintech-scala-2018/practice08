package fintech.lesson08.examples

import java.time.LocalDate

import fintech.lesson08.examples.Example14ForOption.Person

object Example27StringInterpolationDesugared extends App {

  val person =
    Person("Charlie", Some(LocalDate.of(1975, 2, 15)))

  val string = s"This is ${person.name}, he was born ${person.birthday.fold("n/a")(_.toString)}"

  val stringDesugared =
    StringContext("This is ", ", he was born ", "").s(person.name, person.birthday.fold("n/a")(_.toString))

  println(string)
}
