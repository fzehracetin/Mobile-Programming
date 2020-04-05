package com.example.myfirstfinalapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button loginButton = (Button) findViewById(R.id.loginButton);
        final EditText email = (EditText) findViewById(R.id.emailEditText);
        final EditText password = (EditText) findViewById(R.id.passwordEditText);

        ArrayList<Person> persons = new ArrayList<>();
        Uri uri = Uri.parse("android.resource://" + "com.example.myfirstfinalapplication" + "/drawable/" + "icon.png");

        persons.add(new Person("fzehracetin@gmail.com", "1234"));
        persons.add(new Person("fzehracetin@gmail.com", "1234"));

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (checkPassword(email.getText(), password.getText())) {
                    // Intent createMailIntent = new Intent(MainActivity.this, CreateMailActivity.class);
                    // startActivity(createMailIntent);
                    Intent listActivityIntent = new Intent(MainActivity.this, ListActivity.class);
                    startActivity(listActivityIntent);
                }
                else {
                    email.setText("");
                    password.setText("");
                }
            }
        });
    }
    private boolean checkPassword (Editable email, Editable password) {
        return new Random().nextBoolean();
    }
}


