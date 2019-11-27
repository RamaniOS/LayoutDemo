package com.example.layoutdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;

public class MarksActivity extends AppCompatActivity {

    private TextInputEditText madt1;
    private TextInputEditText madt2;
    private TextInputEditText madt3;
    private TextInputEditText madt4;
    private TextInputEditText madt5;

    public static final String MADT1 = "MADT1";
    public static final String MADT2 = "MADT2";
    public static final String MADT3 = "MADT3";
    public static final String MADT4 = "MADT4";
    public static final String MADT5 = "MADT5";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marks);

        madt1 = findViewById(R.id.madt1);
        madt2 = findViewById(R.id.madt2);
        madt3 = findViewById(R.id.madt3);
        madt4 = findViewById(R.id.madt4);
        madt5 = findViewById(R.id.madt5);

        Button submit = findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ShowActivity.class);
                intent.putExtra(MADT1, madt1.getText());
                intent.putExtra(MADT2, madt2.getText());
                intent.putExtra(MADT3, madt3.getText());
                intent.putExtra(MADT4, madt4.getText());
                intent.putExtra(MADT5, madt5.getText());
                startActivity(intent);
            }
        });

    }
}
