package com.bintina.realestatemanagermvvm.login.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.bintina.realestatemanagermvvm.databinding.FragmentLoginBinding

class MyLoginFragment: Fragment() {

    private var _binding : FragmentLoginBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentLoginBinding.inflate(inflater, container, false)

        return binding.root
    }


    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }


  /*  private fun initializeGoogleService() {
        val inputStream: InputStream = resources.openRawResource(R.raw.client_secret)
        val googleCredentials = GoogleCredentials.fromStream(inputStream)
        val scoped = googleCredentials.createScoped(listOf("https://www.googleapis.com/auth/cloud-platform"))

        val httpTransport: HttpTransport = AndroidHttp.newCompatibleTransport()
        val jsonFactory: JsonFactory = JacksonFactory.getDefaultInstance()

        val requestInitializer = HttpCredentialsAdapter(scoped)

        val service = YourGoogleService.Builder(httpTransport, jsonFactory, requestInitializer)
            .setApplicationName("Your Application Name")
            .build()

        // Use the service object to make API calls
    }*/
}