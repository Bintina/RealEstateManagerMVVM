package com.bintina.realestatemanagermvvm

import android.content.pm.PackageManager
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Base64
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.core.content.ContextCompat
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import com.bintina.realestatemanagermvvm.R
import com.bintina.realestatemanagermvvm.databinding.ActivityMainBinding
import java.security.MessageDigest
import java.security.NoSuchAlgorithmException

class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    lateinit var binding: ActivityMainBinding
    lateinit var navController: NavController

    @RequiresApi(Build.VERSION_CODES.P)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        getSha()

        val toolbar = binding.toolbar
        setSupportActionBar(toolbar)
        //Customize the toolbar color
        toolbar.setBackgroundColor(
            ContextCompat.getColor(
                this,
                com.google.android.material.R.color.design_default_color_secondary
            )
        )
        val host: NavHostFragment = supportFragmentManager
            .findFragmentById(R.id.my_nav_host_fragment) as NavHostFragment? ?: return

        navController = host.navController

        appBarConfiguration = AppBarConfiguration(navController.graph)

        Log.d("MainActivityLog", "Fragment committed")

    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }

    //Called when menu item is selected.
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.menu_search_btn -> {
                // Command to navigate to flow_step_one_dest
                navController.navigate(R.id.search_dest)
                //openNotificationsActivity()
                return true
            }



            else -> return super.onOptionsItemSelected(item)

        }
    }

     @RequiresApi(Build.VERSION_CODES.P)
 fun getSha() {
     val packageName = "com.bintina.realestatemanagermvvm"

     try {
         val info = packageManager.getPackageInfo(packageName, PackageManager.GET_SIGNING_CERTIFICATES)

         for (signature in info.signingInfo.signingCertificateHistory) {

             // Compute SHA-1 fingerprint
             val sha1 = MessageDigest.getInstance("SHA-1")
             sha1.update(signature.toByteArray())
             val sha1Hex = bytesToHex(sha1.digest())
             Log.d("SHA-1", sha1Hex)

             //SHA-256
             val md: MessageDigest = MessageDigest.getInstance("SHA-256")
             md.update(signature.toByteArray())

             // Convert the byte array to hexadecimal representation
             val sha256Hex = bytesToHex(md.digest())

             Log.d("SHA", sha256Hex)

             val keyHash = String(Base64.encode(md.digest(), Base64.NO_WRAP))
             Log.e("hash key", keyHash)
         }
     } catch (e: PackageManager.NameNotFoundException) {
         Log.e("name not found", e.toString())
     } catch (e: NoSuchAlgorithmException) {
         Log.e("no such algorithm", e.toString())
     } catch (e: Exception) {
         Log.e("exception", e.toString())
     }
 }

 private fun bytesToHex(bytes: ByteArray): String {
     val hexChars = CharArray(bytes.size * 2)
     for (i in bytes.indices) {
         val v = bytes[i].toInt() and 0xFF
         hexChars[i * 2] = "0123456789ABCDEF"[v shr 4]
         hexChars[i * 2 + 1] = "0123456789ABCDEF"[v and 0x0F]
     }
     return String(hexChars)
 }
}