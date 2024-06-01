package com.bintina.realestatemanagermvvm.login.view

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment

class MyLoginFragment: Fragment() {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onDestroy() {
        super.onDestroy()
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