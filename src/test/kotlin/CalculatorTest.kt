import io.kotlintest.specs.ShouldSpec

class MyTests : ShouldSpec() {
    init {
        should("add two ints") {
            Calculator.add(2, 3) shouldBe 5
        }
    }
}