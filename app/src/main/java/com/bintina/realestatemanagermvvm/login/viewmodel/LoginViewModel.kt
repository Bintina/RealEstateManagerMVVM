package com.bintina.realestatemanagermvvm.login.viewmodel

import androidx.lifecycle.ViewModel
import com.bintina.realestatemanagermvvm.login.model.database.dao.UserDao
import com.bintina.realestatemanagermvvm.util.MyApp.Companion.currentUser

class LoginViewModel(private val userDao: UserDao): ViewModel() {
    fun init(userId: Long) {
        if (currentUser != null) {
            return
        }
        //currentUser = userDataSource.getUser(userId)

    }
}