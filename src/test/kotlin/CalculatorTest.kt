import io.kotlintest.specs.ShouldSpec
import java.time.LocalDate
import java.time.Month

class MyTests : ShouldSpec() {
    init {
        should("findFoundingEntries") {
            CompanyFoundingProcessor.findFoundingEntries() should
                    contain(Entry(
                            Person("Person V"),
                            Company("Company A"),
                            LocalDate.of(2016, Month.JANUARY, 1)))
        }
    }
}