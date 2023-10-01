package com.studio.appkotlin

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.startapp.sdk.ads.nativead.NativeAdPreferences
import com.startapp.sdk.ads.nativead.StartAppNativeAd
import com.startapp.sdk.adsbase.Ad
import com.startapp.sdk.adsbase.StartAppAd
import com.startapp.sdk.adsbase.adlisteners.AdEventListener


class MainActivity : AppCompatActivity() {

    private val startAppAd = StartAppAd(this)
    private val startAppNativeAd = StartAppNativeAd(this)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Sdk StartApp
        //disabilita o splash Sdk StartApp
        StartAppAd.disableSplash()
        //disabilita interticial Atomatico
        StartAppAd.disableAutoInterstitial()



        //Ir para segunda atividade
        var btn_tela2 = findViewById<Button>(R.id.btn_tela2);
        btn_tela2.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent);
            //mostrarInterticial StartApp
            StartAppAd.showAd(this)

        }
    }
}