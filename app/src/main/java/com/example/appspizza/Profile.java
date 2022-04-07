package com.example.appspizza;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import beans.User;

public class Profile extends AppCompatActivity {
TextView nom,email,password;
User u = new User();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        Button button = (Button) findViewById(R.id.btnmodifprof);
        nom=findViewById(R.id.profnom);
        email=findViewById(R.id.profemail);
        password=findViewById(R.id.profpass);
            nom.setText(u.getNom());
            email.setText(u.getEmail());
            password.setText(u.getPassword());

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {


                u.setId(1);
                u.setNom(nom.getText().toString());
                u.setEmail(email.getText().toString());
                u.setPassword(password.getText().toString());

                nom.setText(u.getNom());
                email.setText(u.getEmail());
                password.setText(u.getPassword());
                Intent intent = new Intent(Profile.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }





}