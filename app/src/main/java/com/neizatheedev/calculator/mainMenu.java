package com.neizatheedev.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class mainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_calculator);

        ImageView settingImageView = (ImageView) findViewById(R.id.settingImageView);
        ImageView helpImageView = (ImageView) findViewById(R.id.helpImageView);
        ImageView exitImageView = (ImageView) findViewById(R.id.exitImageView);
        ImageView calculatorImageView = (ImageView) findViewById(R.id.calculatorImageView);

        // SettingsActivity.java
        settingImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent settingsIntent = new Intent(mainMenu.this, SettingsActivity.class);
                startActivity(settingsIntent);
                Toast.makeText(mainMenu.this, "Settings Section", Toast.LENGTH_SHORT).show();
            }
        });

        // HelpActivity.java
        helpImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent helpIntent = new Intent(mainMenu.this, HelpActivity.class);
                startActivity(helpIntent);
                Toast.makeText(mainMenu.this, "Help Section", Toast.LENGTH_SHORT).show();
            }
        });

        // Exiting the app
        exitImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        // Calculator.java
        calculatorImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent calculatorIntent = new Intent(mainMenu.this, Calculator.class);
                startActivity(calculatorIntent);
                // Alert Dialogue
                AlertDialog.Builder builder = new AlertDialog.Builder(mainMenu.this);
                builder.setCancelable(true);
                builder.setTitle("The Calculator");
                builder.setMessage("The Scientific Calculator Byy Neizaa!!!");
                builder.show();
            }
        });
    }
}