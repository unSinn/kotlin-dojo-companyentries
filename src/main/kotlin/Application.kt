fun main(args: Array<String>) {

    CompanyFoundingProcessor.findFoundingEntries(inYear)
            .groupBy(Entry::company)
            .forEach {
                it ->
                val company = it.key.name
                val founders = it.value.map(Entry::person)
                println("$company with founders $founders")
            }
}