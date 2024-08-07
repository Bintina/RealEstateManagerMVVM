package com.bintina.realestatemanagermvvm

import android.content.Context
import android.net.wifi.WifiManager
import java.text.DateFormat
import java.text.SimpleDateFormat
import java.util.Date

class Utils {


    /**
     * Created by Philippe on 21/02/2018.
     */
    object Utils {
        /**
         * Conversion d'un prix d'un bien immobilier (Dollars vers Euros)
         * NOTE : NE PAS SUPPRIMER, A MONTRER DURANT LA SOUTENANCE
         * @param dollars
         * @return
         */
        fun convertDollarToEuro(dollars: Int): Int {
            return Math.round(dollars * 0.812).toInt()
        }

        val todayDate: String
            /**
             * Conversion de la date d'aujourd'hui en un format plus approprié
             * NOTE : NE PAS SUPPRIMER, A MONTRER DURANT LA SOUTENANCE
             * @return
             */
            get() {
                val dateFormat: DateFormat = SimpleDateFormat("yyyy/MM/dd")
                return dateFormat.format(Date())
            }

        /**
         * Vérification de la connexion réseau
         * NOTE : NE PAS SUPPRIMER, A MONTRER DURANT LA SOUTENANCE
         * @param context
         * @return
         */
        fun isInternetAvailable(context: Context): Boolean {
            val wifi = context.getSystemService(Context.WIFI_SERVICE) as WifiManager
            return wifi.isWifiEnabled
        }
    }
}