package com.example.appspizza;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import beans.Fruit;
import service.FruitService;

public class DetailsFruits extends AppCompatActivity {
    private FruitService fs;
    private ImageView image;
    private TextView desc;
    private TextView ingred,nompp;
    //intégration du menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater =getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.profile:
                Intent intent = new Intent(DetailsFruits.this, Profile.class);
                startActivity(intent);
                return true;

            default:
                super.onOptionsItemSelected(item);
        }
        return false;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_fruits);

        Intent intent = getIntent();
        int id = Integer.parseInt(intent.getStringExtra("idf"));
        fs = FruitService.getInstance();
        image = findViewById(R.id.detimg);
        desc = findViewById(R.id.detdesc);
        ingred = findViewById(R.id.detingred);
        nompp= findViewById(R.id.nompp);


        Fruit f = fs.findById(id);
        image.setImageResource(f.getPhoto());
        nompp.setText(f.getNom());

        desc.setText(f.getDesc());
        ingred.setText(f.getIngrediant());
        ingred.setMovementMethod(new ScrollingMovementMethod());//star


    }
}