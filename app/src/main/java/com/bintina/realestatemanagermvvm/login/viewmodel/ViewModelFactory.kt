package com.bintina.realestatemanagermvvm.login.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.bintina.realestatemanagermvvm.login.model.database.dao.UserDao

class ViewModelFactory(private val userDao: UserDao):ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return if (modelClass.isAssignableFrom(LoginViewModel::class.java)) {
            LoginViewModel(userDao) as T
        } else {
            throw IllegalArgumentException("Unknown ViewModel class")
        }
    }
}