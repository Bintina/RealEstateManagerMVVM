package com.bintina.realestatemanagermvvm.model.database.repositories

import com.bintina.realestatemanagermvvm.model.LocalListing
import com.bintina.realestatemanagermvvm.model.LocalUser

data class MockUser(override val size: Int): List<LocalUser>{

    val mockLocalUser: List<LocalUser?> by lazy {
        generateMockUsers()
    }




    private fun generateMockUsers(): List<LocalUser> {
        return listOf(
            LocalUser("10", "Albert", true),
            LocalUser("11", "Ben", true),
            LocalUser("12","Charles", true)
        )
    }

    override fun contains(element: LocalUser): Boolean {
        TODO("Not yet implemented")
    }

    override fun containsAll(elements: Collection<LocalUser>): Boolean {
        TODO("Not yet implemented")
    }

    override fun get(index: Int): LocalUser {
        TODO("Not yet implemented")
    }

    override fun isEmpty(): Boolean {
        TODO("Not yet implemented")
    }

    override fun iterator(): Iterator<LocalUser> {
        TODO("Not yet implemented")
    }

    override fun listIterator(): ListIterator<LocalUser> {
        TODO("Not yet implemented")
    }

    override fun listIterator(index: Int): ListIterator<LocalUser> {
        TODO("Not yet implemented")
    }

    override fun subList(fromIndex: Int, toIndex: Int): List<LocalUser> {
        TODO("Not yet implemented")
    }

    override fun lastIndexOf(element: LocalUser): Int {
        TODO("Not yet implemented")
    }

    override fun indexOf(element: LocalUser): Int {
        TODO("Not yet implemented")
    }

}
