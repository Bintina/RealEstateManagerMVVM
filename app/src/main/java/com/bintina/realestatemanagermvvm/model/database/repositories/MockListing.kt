package com.bintina.realestatemanagermvvm.model.database.repositories

import com.bintina.realestatemanagermvvm.model.LocalListing

data class MockListing(override val size: Int): List<LocalListing> {
    val mockLocalListing: List<LocalListing?> by lazy {
        generateMockListings()
    }

    private fun generateMockListings(): List<LocalListing?> {

        return listOf(
            LocalListing("101", "Bungalo", 12.00, 3.00, 3, "Spacious Three bedroom on the beach","sampleurl.com","Diani Beach Road, behind Bazaar", listOf("spacious","incredible view", "all rooms ensuite"),true, "01.03.2024", null),
            LocalListing("102", "Bungalo", 12.00, 3.00, 3, "Spacious Three bedroom on the beach","sampleurl.com","Diani Beach Road, behind Bazaar", listOf("spacious","incredible view", "all rooms ensuite"),true, "01.03.2024", null),
            LocalListing("103", "Bungalo", 12.00, 3.00, 3, "Spacious Three bedroom on the beach","sampleurl.com","Diani Beach Road, behind Bazaar", listOf("spacious","incredible view", "all rooms ensuite"),true, "01.03.2024", null),
            LocalListing("104", "Bungalo", 12.00, 3.00, 3, "Spacious Three bedroom on the beach","sampleurl.com","Diani Beach Road, behind Bazaar", listOf("spacious","incredible view", "all rooms ensuite"),true, "01.03.2024", null),
        )
    }
    override fun contains(element: LocalListing): Boolean {
        TODO("Not yet implemented")
    }

    override fun containsAll(elements: Collection<LocalListing>): Boolean {
        TODO("Not yet implemented")
    }

    override fun get(index: Int): LocalListing {
        TODO("Not yet implemented")
    }

    override fun isEmpty(): Boolean {
        TODO("Not yet implemented")
    }

    override fun iterator(): Iterator<LocalListing> {
        TODO("Not yet implemented")
    }

    override fun listIterator(): ListIterator<LocalListing> {
        TODO("Not yet implemented")
    }

    override fun listIterator(index: Int): ListIterator<LocalListing> {
        TODO("Not yet implemented")
    }

    override fun subList(fromIndex: Int, toIndex: Int): List<LocalListing> {
        TODO("Not yet implemented")
    }

    override fun lastIndexOf(element: LocalListing): Int {
        TODO("Not yet implemented")
    }

    override fun indexOf(element: LocalListing): Int {
        TODO("Not yet implemented")
    }

}