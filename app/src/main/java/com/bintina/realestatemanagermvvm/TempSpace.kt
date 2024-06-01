package com.bintina.realestatemanagermvvm

import android.content.pm.PackageManager
import android.os.Build
import android.util.Base64
import android.util.Log
import androidx.annotation.RequiresApi
import java.security.MessageDigest
import java.security.NoSuchAlgorithmException

class TempSpace {
/*//Strings
    <string name="app_name">Real Estate Manager MVVM</string>*/

/*    //Themes
    <resources xmlns:tools="http://schemas.android.com/tools">
    <!-- Base application theme. -->
    <style name="Base.Theme.RealEstateManagerMVVM" parent="Theme.Material3.DayNight.NoActionBar">
    <!-- Customize your light theme here. -->
    <!-- <item name="colorPrimary">@color/my_light_primary</item> -->
    </style>

    <style name="Theme.RealEstateManagerMVVM" parent="Base.Theme.RealEstateManagerMVVM" />
    </resources>*/


/*    //Themes Night
    <resources xmlns:tools="http://schemas.android.com/tools">
    <!-- Base application theme. -->
    <style name="Base.Theme.RealEstateManagerMVVM" parent="Theme.Material3.DayNight.NoActionBar">
    <!-- Customize your dark theme here. -->
    <!-- <item name="colorPrimary">@color/my_dark_primary</item> -->
    </style>
    </resources>*/


/*    @RequiresApi(Build.VERSION_CODES.P)
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
    }*/
}