package com.bintina.realestatemanagermvvm.login.view

import android.app.Activity.RESULT_OK
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.bintina.realestatemanagermvvm.R
import com.bintina.realestatemanagermvvm.databinding.FragmentLoginBinding
import com.bintina.realestatemanagermvvm.login.OnLoginClickListener
import com.bintina.realestatemanagermvvm.login.viewmodel.LoginViewModel
import com.bintina.realestatemanagermvvm.login.viewmodel.injection.Injection
import com.bintina.realestatemanagermvvm.util.MyApp.Companion.currentUser
import com.bintina.realestatemanagermvvm.util.MyApp.Companion.navController
import com.firebase.ui.auth.AuthUI
import com.firebase.ui.auth.FirebaseAuthUIActivityResultContract
import com.firebase.ui.auth.data.model.FirebaseAuthUIAuthenticationResult
import com.google.firebase.auth.FirebaseAuth

class MyLoginFragment: Fragment(), OnLoginClickListener {

    private lateinit var viewModel: LoginViewModel
    private var _binding : FragmentLoginBinding? = null
    private val binding get() = _binding!!
                val TAG = "LoginFragLog"

    private val signInLauncher = registerForActivityResult(
        FirebaseAuthUIActivityResultContract(),
    ) { res ->
        this.onSignInResult(res)
    }


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentLoginBinding.inflate(inflater, container, false)

        viewModel = Injection.provideUserViewModel(requireContext())

        binding.googleLogin.setOnClickListener { googleClick() }

        Log.d(TAG, "onCreateView called")
        return binding.root
    }


    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    private fun startGoogleSignIn() {
        val providers = arrayListOf(
            AuthUI.IdpConfig.GoogleBuilder().build()
        )

        val signInIntent = AuthUI.getInstance()
            .createSignInIntentBuilder()
            .setAvailableProviders(providers)
            .build()

        Log.d(TAG, "startGoogleSignInCalled")
        signInLauncher.launch(signInIntent)
    }
    private fun onSignInResult(result: FirebaseAuthUIAuthenticationResult?): FirebaseAuthUIAuthenticationResult? {
        val response = result?.idpResponse
        if (result?.resultCode == RESULT_OK) {
            // Successfully signed in
            val user = FirebaseAuth.getInstance().currentUser
            currentUser = user
            navController.navigate(R.id.list_property_dest)
        } else {
            // Sign in failed. If response is null the user canceled the
            // sign-in flow using the back button. Otherwise check
            // response.getError().getErrorCode() and handle the error.
            Toast.makeText(requireContext(),"Your sign in was not successful. Please try again", Toast.LENGTH_LONG).show()
            response?.error?.let {
                Log.e(TAG, "Sign in error: ${it.errorCode}", it)
            } ?: run {
                Log.e(TAG, "Sign in canceled by user")
            }
        }
        return result
    }

    override fun googleClick() {
        Log.d(TAG, "googleClick clicked")

        startGoogleSignIn()
    }

}