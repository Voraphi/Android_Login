package com.example.android_login;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    EditText username;
    EditText password;
    Button loginButton;
    TextView textView;
    static ArrayList <Users> users = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setup();
        createUsers();

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String uName = username.getText().toString();
                String pWord = password.getText().toString();

                if(verifyUsername(uName)) {
                    if(verifyPassword(uName, pWord)) {
                        Intent intent = HomePage.getIntent(getApplicationContext(), uName);
                        startActivity(intent);
                    }
                }

            }
        });

    }

    private void setup() {
        loginButton = findViewById(R.id.loginbutton);
        username = findViewById(R.id.editTextUsername);
        password = findViewById(R.id.editTextPassword);

    }

    public static void createUsers() {
        if(users.isEmpty()) {
            users.add(new Users("test", "123"));
            users.add(new Users("Salem", "trialsWitch"));
            users.add(new Users("Eevs", "catsRbest"));
        }
    }

    public static boolean verifyUsername(String usernameEntered) {
        for (Users user : users) {
            if(user.getUsername().equals(usernameEntered)) {
                return true;
            }
        }
        return false;
    }

    public static boolean verifyPassword(String usernameEntered, String passwordEntered) {
        for (Users user : users) {
            if(user.getUsername().equals(usernameEntered)) {
                if(user.getPassword().equals(passwordEntered))
                    return true;
            }
        }
        return false;
    }

}