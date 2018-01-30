package com.suneetsrivastava.om.Activities;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.nightonke.boommenu.BoomButtons.BoomButton;
import com.nightonke.boommenu.BoomButtons.HamButton;
import com.nightonke.boommenu.BoomMenuButton;
import com.nightonke.boommenu.OnBoomListener;
import com.suneetsrivastava.om.R;

import java.util.ArrayList;

import at.grabner.circleprogress.CircleProgressView;
import at.grabner.circleprogress.Direction;
import at.grabner.circleprogress.TextMode;
import butterknife.BindView;
import butterknife.ButterKnife;

public class LandingActivity extends Activity {

    @BindView(R.id.menuButton)
    BoomMenuButton menuButton;

    @BindView(R.id.appTextView)
    TextView appName;

    @BindView(R.id.landing_hamburger)
    ImageButton hamburger;

    @BindView(R.id.landing_quote)
    TextView landingQuote;

    @BindView(R.id.landing_circlularProgress)
    CircleProgressView circleProgressView;

    ArrayList<String> info = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing);
        ButterKnife.bind(this);
        initUI();
        circleProgressView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }

    private void initUI(){
            HamButton.Builder builderMeditate = new HamButton.Builder().subNormalText("Keep your stuff simple!")
                    .normalTextRes((R.string.meditation)).shadowEffect(true)
                    .shadowColor(Color.parseColor("#ee000000"))
                    .normalImageDrawable(getDrawable(R.drawable.meditate_menu));
            HamButton.Builder builderCalm = new HamButton.Builder().subNormalText("Keep yourself Calm").normalTextRes((R.string.calm))
                    .normalImageDrawable(getDrawable(R.drawable.calm_menu));
            HamButton.Builder builderMusic = new HamButton.Builder().subNormalText("Soothing Music, to keep your mind relax").normalTextRes((R.string.music)).
                    normalImageDrawable(getDrawable(R.drawable.music_menu));
            HamButton.Builder builderSleep = new HamButton.Builder().subNormalText("Sleep, Do get it ").normalTextRes(R.string.helptosleep)
                    .normalImageDrawable(getDrawable(R.drawable.sleep_menu));
            menuButton.addBuilder(builderCalm);
            menuButton.addBuilder(builderMeditate);
            menuButton.addBuilder(builderMusic);
            menuButton.addBuilder(builderSleep);
            menuButton.setOnBoomListener(new OnBoomListener() {
                @Override
                public void onClicked(int index, BoomButton boomButton) {
                    Log.e("TAG", "onClicked: "+index );
                    switch (index){
                        case 0 : break;
                        case 1 : startActivity(new Intent(LandingActivity.this, MeditationActivity.class));
                                break;
                        case 2 : break;
                        case 3 : break;
                    }
                }

                @Override
                public void onBackgroundClick() {

                }

                @Override
                public void onBoomWillHide() {

                }

                @Override
                public void onBoomDidHide() {

                }

                @Override
                public void onBoomWillShow() {

                }

                @Override
                public void onBoomDidShow() {

                }
            });
            circleProgressView.setTextMode(TextMode.VALUE);
            circleProgressView.setShowTextWhileSpinning(true);
            circleProgressView.setValueAnimated(15);
            circleProgressView.setRimColor(Color.parseColor("#01579b"));
            circleProgressView.setBarColor(Color.parseColor("#b3e5fc"));
            circleProgressView.setTextSize(35);
            circleProgressView.setUnitSize(10);
            circleProgressView.setTextColor(Color.parseColor("#eceff1"));
            circleProgressView.setRimWidth(15);
            circleProgressView.setBarWidth(15);



    }
}
