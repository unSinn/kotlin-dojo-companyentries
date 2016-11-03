import java.time.LocalDate
import java.time.LocalDate.of
import java.time.Month.JANUARY

data class Founding(val company: Company, val date: LocalDate)

data class Entry(val person: Person,
                 val company: Company,
                 val date: LocalDate)

data class Company(val name: String)

data class Person(val name: String)

object Data {

    val cA = Company("Company A")
    val cB = Company("Company B")
    val cC = Company("Company C")

    val pV = Person("Person V")
    val pW = Person("Person W")
    val pX = Person("Person X")
    val pY = Person("Person Y")
    val pZ = Person("Person Z")

    val pU = pZ.copy(name = "Hannes")


    val foundings = arrayOf(
            Founding(cA, of(2016, JANUARY, 1)),
            Founding(cB, of(2016, JANUARY, 5)),
            Founding(cC, of(2016, JANUARY, 10))
    )

    val entries = arrayOf(
            Entry(pV, cA, of(2016, JANUARY, 1)),
            Entry(pW, cB, of(2016, JANUARY, 3)),
            Entry(pX, cB, of(2016, JANUARY, 5)),
            Entry(pY, cB, of(2016, JANUARY, 5)),
            Entry(pZ, cC, of(2016, JANUARY, 4))
    )

}