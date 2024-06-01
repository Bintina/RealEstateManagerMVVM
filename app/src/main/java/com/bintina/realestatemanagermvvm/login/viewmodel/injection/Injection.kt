package com.bintina.realestatemanagermvvm.login.viewmodel.injection

import android.content.Context
import com.bintina.realestatemanagermvvm.login.model.database.SaveUserDatabase
import com.bintina.realestatemanagermvvm.login.model.database.repositories.UserDataRepository
import com.bintina.realestatemanagermvvm.login.viewmodel.LoginViewModel
import com.bintina.realestatemanagermvvm.login.viewmodel.ViewModelFactory
import java.util.concurrent.Executor
import java.util.concurrent.Executors

object Injection {
    private fun provideUserDataSource(context: Context): UserDataRepository {
        val database = SaveUserDatabase.getInstance(context)
        return UserDataRepository(database.userDao())
    }

    fun provideExecutor(): Executor {
        return Executors.newSingleThreadExecutor()
    }

    fun provideViewModelFactory(context: Context): ViewModelFactory {
        /*val dataSourceUser = provideUserDataSource(context)
        val executor = provideExecutor()*/
        val userDao = SaveUserDatabase.getInstance(context).userDao()
        //val application = MyApp()
        return ViewModelFactory(userDao)
    }

    fun provideUserViewModel(context: Context): LoginViewModel {
        /*val dataSourceUser = provideUserDataSource(context)
        val executor = provideExecutor()*/
        val userDao = SaveUserDatabase.getInstance(context).userDao()
        //val application = MyApp() // Assuming MyApp extends Application
        val factory = ViewModelFactory(userDao)
        return factory.create(LoginViewModel::class.java)
    }
}