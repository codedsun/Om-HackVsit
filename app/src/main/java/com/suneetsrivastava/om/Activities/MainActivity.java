package com.suneetsrivastava.om.Activities;

import android.app.Activity;
import android.app.Application;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.ActionMenuView;
import android.widget.TextView;
import android.widget.Toolbar;


import com.suneetsrivastava.om.Helpers.FontsListener;
import com.suneetsrivastava.om.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends Activity {

    FontsListener fontsListener;
    Typeface quoteView;
    Typeface appNameView;

    @BindView(R.id.appTextView)
    TextView appName;

    @BindView(R.id.quote_text)
    TextView quoteText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        initUI();

    }

    private void initUI(){
        fontsListener = new FontsListener(getApplicationContext(), "Quintessential-Regular");
        quoteView = fontsListener.getFont();
        quoteText.setTypeface(quoteView);
        appNameView = fontsListener.getFontByName("Satisfy-Regular");
        appName.setTypeface(appNameView);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.toolbar_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }
}
