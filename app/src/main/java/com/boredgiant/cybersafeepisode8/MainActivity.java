package com.boredgiant.cybersafeepisode8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.applovin.mediation.ads.MaxAdView;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkConfiguration;

public class MainActivity extends AppCompatActivity {

ImageView daimage;
Button watchepisode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AppLovinSdk.getInstance( getApplicationContext() ).setMediationProvider( "max" );
        AppLovinSdk.initializeSdk( getApplicationContext(), new AppLovinSdk.SdkInitializationListener() {
            @Override
            public void onSdkInitialized(final AppLovinSdkConfiguration configuration)
            {
                // AppLovin SDK is initialized, start loading ads
            }
        } );
        MaxAdView adView = findViewById( R.id.episodeeightadview);
        adView.loadAd();
        daimage=findViewById(R.id.episodeeightslot);
        watchepisode=findViewById(R.id.episodeeightbutton);
        final int[] currentimageindex = {0};
        int[]mytips={R.mipmap.oneepisodeeight,R.mipmap.twoepisodeeight,R.mipmap.threeepisodeeight,R.mipmap.fourepisodeeight,R.mipmap.fiveepisodeeight,R.mipmap.sixepisodeeight,R.mipmap.sevenepisodeeight,R.mipmap.eightepisodeeight,R.mipmap.nineepisodeeight,R.mipmap.tenepisodeeight};
        watchepisode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((mytips.length) > currentimageindex[0]) {
                    daimage.setImageResource(mytips[currentimageindex[0]]);
                    currentimageindex[0]++;
                    currentimageindex[0] %= mytips.length;
                }
            }
        });

    }
}