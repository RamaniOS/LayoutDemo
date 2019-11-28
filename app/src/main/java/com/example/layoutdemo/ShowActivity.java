package com.example.layoutdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class ShowActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            String madt1S = bundle.getString(MarksActivity.MADT1);
            int madt1 = Integer.parseInt(madt1S);
            System.out.println(madt1);

        }
    }
}
