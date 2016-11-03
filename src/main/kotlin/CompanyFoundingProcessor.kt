object CompanyFoundingProcessor {

    fun findFoundingEntries(): List<Entry> {
        val founders: MutableList<Entry> = arrayListOf()

        for (founding in Data.foundings) {
            Data.entries
                    .filter { entry -> isFoundingEntry(entry, founding) }
                    .forEach { founder -> founders.add(founder) }
        }
        return founders
    }

    private fun isFoundingEntry(entry: Entry, founding: Founding) =
            (entry.company == founding.company
            && entry.date == founding.date)
}