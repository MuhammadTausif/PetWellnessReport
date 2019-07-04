package com.tausifasia.petwellnessreport;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ReportAdsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report_ads);
    }

    public void openMainActivity(View view){
        startActivity(new Intent(this, MainActivity.class));
    }
}