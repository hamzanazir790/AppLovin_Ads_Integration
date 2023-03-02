package com.example.applovin_ads_integration

import android.os.Bundle
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import com.applovin.mediation.MaxAd
import com.applovin.mediation.MaxAdViewAdListener
import com.applovin.mediation.MaxError
import com.applovin.mediation.ads.MaxAdView
import com.applovin.sdk.AppLovinSdk



class MainActivity : AppCompatActivity() ,MaxAdViewAdListener{

    private var adView: MaxAdView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        AppLovinSdk.getInstance(this).mediationProvider = "max"
        AppLovinSdk.initializeSdk(this) {
            // AppLovin SDK is initialized, start loading ads

            createBannerAds()
        }
    }

    private fun createBannerAds() {
        adView = MaxAdView("5b77a3a32c847380", this)
        adView?.setListener(this)

        // Stretch to the width of the screen for banners to be fully functional
        val width = ViewGroup.LayoutParams.MATCH_PARENT

        // Banner height on phones and tablets is 50 and 90, respectively
        //val heightPx = resources.getDimensionPixelSize(R.dimen.banner_height)

        //adView?.layoutParams = FrameLayout.LayoutParams(width, heightPx)

        // Set background or background color for banners to be fully functional
        //adView?.setBackgroundColor(...)

        val rootView = findViewById<ViewGroup>(android.R.id.content)
        rootView.addView(adView)

        // Load the ad
        adView?.loadAd()
    }

    override fun onAdLoaded(p0: MaxAd?) {
        TODO("Not yet implemented")
    }

    override fun onAdDisplayed(p0: MaxAd?) {
        TODO("Not yet implemented")
    }

    override fun onAdHidden(p0: MaxAd?) {
        TODO("Not yet implemented")
    }

    override fun onAdClicked(p0: MaxAd?) {
        TODO("Not yet implemented")
    }

    override fun onAdLoadFailed(p0: String?, p1: MaxError?) {
        TODO("Not yet implemented")
    }

    override fun onAdDisplayFailed(p0: MaxAd?, p1: MaxError?) {
        TODO("Not yet implemented")
    }

    override fun onAdExpanded(p0: MaxAd?) {
        TODO("Not yet implemented")
    }

    override fun onAdCollapsed(p0: MaxAd?) {
        TODO("Not yet implemented")
    }
}
