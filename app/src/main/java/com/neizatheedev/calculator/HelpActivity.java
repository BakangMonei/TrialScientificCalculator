package com.neizatheedev.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class HelpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);
        TextView helpTextView = (TextView) findViewById(R.id.helpTextView);

        helpTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(HelpActivity.this);
                builder.setCancelable(true);
                builder.setTitle("Help");
                builder.setMessage("Help Byy Neizaa!!!");
                builder.show();
            }
        });
    }
}