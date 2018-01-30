package com.suneetsrivastava.om;

import android.app.Activity;
import android.app.Application;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;

import java.lang.reflect.Type;

/**
 * Created by suneetsrivastava on 30/01/18.
 */

public class MyApplication extends Application {

    private static String TAG = "TAG : ";
    @Override
    public void onCreate() {
        super.onCreate();
        //Typeface typeface = Typeface.createFromAsset(getAssets())
        registerActivityLifecycleCallbacks(new ActivityLifecycleCallbacks() {
            @Override
            public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
                Log.e(TAG, "onActivityCreated: "+activity.getLocalClassName() );
            }

            @Override
            public void onActivityStarted(Activity activity) {
                Log.e(TAG, "onActivityStarted: "+activity.getLocalClassName() );
            }

            @Override
            public void onActivityResumed(Activity activity) {
                Log.d(TAG, "onActivityResumed: "+activity.getLocalClassName() );
            }

            @Override
            public void onActivityPaused(Activity activity) {
                Log.d(TAG, "onActivityPaused: " + activity.getLocalClassName() );
            }

            @Override
            public void onActivityStopped(Activity activity) {
                Log.e(TAG, "onActivityStopped: "+ activity.getLocalClassName() );
            }

            @Override
            public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
                Log.d(TAG, "onActivitySaveInstanceState: "+ activity.getLocalClassName());
            }

            @Override
            public void onActivityDestroyed(Activity activity) {
                Log.e(TAG, "onActivityDestroyed: "+ activity.getLocalClassName() );
            }
        });
    }


}
