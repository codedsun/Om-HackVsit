package com.suneetsrivastava.om.Activities;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.graphics.Typeface;
import android.support.annotation.UiThread;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.ActionMenuView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;


import com.suneetsrivastava.om.Helpers.FontsListener;
import com.suneetsrivastava.om.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends Activity implements View.OnClickListener{

    FontsListener fontsListener;
    Typeface quoteView;
    Typeface appNameView;

    @BindView(R.id.appTextView)
    TextView appName;

    @BindView(R.id.quote_text)
    TextView quoteText;

    @BindView(R.id.editext_name)
    EditText name;

    @BindView(R.id.button_male)
    Button male;

    @BindView(R.id.button_female)
    Button female;

    @BindView(R.id.button_login)
    Button login;

    int gender = 0;

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
        male.setOnClickListener(this);
        female.setOnClickListener(this);
        login.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.toolbar_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == male.getId()){
            gender = 1;
        }

        if(v.getId() == female.getId()){
            gender =2;
        }

        if(v.getId() == login.getId()){
            if((name.getText().toString().isEmpty()) || (gender==0)  ){
                Toast.makeText(this, "Enter The Details", Toast.LENGTH_SHORT).show();
            }
            else
                startActivity(new Intent(this,LandingActivity.class));
        }

    }
}
