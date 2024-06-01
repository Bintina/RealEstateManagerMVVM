package com.bintina.realestatemanagermvvm.login.model.database.repositories

import com.bintina.realestatemanagermvvm.login.model.Agent
import com.bintina.realestatemanagermvvm.login.model.database.dao.UserDao

class UserDataRepository(private val userDao: UserDao) {
    //Get User
    fun getUser(agentId: Long): Agent {
        return this.userDao.getUser(agentId)
    }
}