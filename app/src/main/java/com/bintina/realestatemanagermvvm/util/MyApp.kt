package com.bintina.realestatemanagermvvm.util

import android.app.Application
import androidx.navigation.NavController
import com.google.firebase.auth.FirebaseUser

class MyApp: Application() {

    companion object {
        var currentUser: FirebaseUser? = null

        lateinit var navController: NavController
    }

}