package com.suneetsrivastava.om.Activities;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.suneetsrivastava.om.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MeditationDetails extends Activity {

    @BindView(R.id.textViewDetail)
    TextView textViewDetail;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meditation_details);
        ButterKnife.bind(this);
        Intent intent = getIntent();
        int i = intent.getIntExtra("value",-1);
        switch (i){
            case -1:
                Toast.makeText(this, "No Data Fetched", Toast.LENGTH_SHORT).show();
                break;

            case 0:
                textViewDetail.setText("Buddhist Meditation");
                break;

            case 1:textViewDetail.setText(getString(R.string.mindfullness_meditation));break;

            case 2:textViewDetail.setText(getString(R.string.vipassana_meditation));break;

            case 3:textViewDetail.setText(getString(R.string.zen_meditation));break;

            case 4:textViewDetail.setText(getString(R.string.guided_meditation));break;

            case 5:textViewDetail.setText("Hindu Meditation");break;

            case 6:textViewDetail.setText(getString(R.string.transcendtal_meditation));break;

            case 7:textViewDetail.setText(getString(R.string.yoga_meditation));break;

            case 8:textViewDetail.setText(getString(R.string.loving_kindness_meditation));break;

            case 9:textViewDetail.setText(getString(R.string.self_enquiry_meditation));break;


        }



    }
}
