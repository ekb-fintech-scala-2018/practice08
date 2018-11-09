package fintech.lesson08.examples

import java.time.LocalDate

object Example14ForOption extends App {

  def flatMap[A, B](fa: Option[A])(f: A => Option[B]): Option[B] =
    fa match {
      case Some(a) => f(a) // : Option[B]
      case None => None
    }

  case class Person(name: String, birthday: Option[LocalDate])

  val people = List(
    Person("Alice", Some(LocalDate.of(1970, 1, 1))),
    Person("Bob", Some(LocalDate.of(1981, 5, 12))),
//    Person("Charlie", Some(LocalDate.of(1981, 5, 12))),
    Person("Charlie", None)
  )

  val charliesAgeInDays = for {
    charlie <- people.find(_.name == "Charlie")
    birthday <- charlie.birthday
  } yield LocalDate.now().toEpochDay - birthday.toEpochDay

  // выглядит как:

  // val charlie = people.find(_.name == "Charlie")
  // val birthday = charlie.birthday
  // return LocalDate.now().toEpochDay - birthday.toEpochDay

  // но все результаты функций завернуты в Option
  // и нам не пришлось их обрабатывать

  println(charliesAgeInDays)

}
