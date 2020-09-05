package com.example.android_login;

import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class HomePage extends AppCompatActivity {

    TextView tView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        String receiveIntent = getIntent().getStringExtra("username");


        tView = findViewById(R.id.textView2);

        tView.setText("Welcome:\n\n" + receiveIntent);

    }

    public static Intent getIntent(Context context, String username) {
        Intent intent = new Intent(context, HomePage.class);
        intent.putExtra("username", username);

        return intent;
    }

}