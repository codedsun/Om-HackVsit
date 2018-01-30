package com.suneetsrivastava.om.Activities;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.provider.Settings;
import android.util.Log;

import com.suneetsrivastava.om.R;

public class SplashScreen extends Activity {
    AlertDialog.Builder adb;
    boolean flag=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
    }

    @Override
    protected void onStart() {
        super.onStart();
        adb = new AlertDialog.Builder(this);
        ConnectivityManager cm = (ConnectivityManager)this.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetwork = cm.getActiveNetworkInfo();
        final boolean isConnected = activeNetwork != null && activeNetwork.isConnectedOrConnecting();
        adb = new AlertDialog.Builder(SplashScreen.this);
        adb.setCancelable(false);
        adb.setTitle("Alert");
        adb.setMessage("Please check your internet connection");
        adb.setIcon(android.R.drawable.ic_dialog_alert);
        adb.setPositiveButton("Connect", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                Log.d("TAG","You clicked OK");
                startActivity(new Intent(Settings.ACTION_SETTINGS));
                flag=true;
            } });
        adb.setNegativeButton("Exit", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                finish();
            } });
        Thread t = new Thread(){
            @Override
            public void run() {
                if (isConnected){
                    if(!flag){
                        try {
                            Thread.sleep(3000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    Log.d("TAG","You are Connected");
                    startActivity(new Intent(SplashScreen.this,MainActivity.class));
                    finish();
                }
                else{
                    Log.d("TAG","You are not connected");
                }

            }
        };
        t.start();
        if(!isConnected){
            adb.show();
        }
    }
}