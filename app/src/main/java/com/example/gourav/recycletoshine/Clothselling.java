package com.example.gourav.recycletoshine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Clothselling extends AppCompatActivity {
    ImageView imgoldclothes, imgrenewedclothes;
    TextView txtoldclothes, txtrenewedclothes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clothselling);
        imgoldclothes = findViewById(R.id.imgoldclothes);
        imgrenewedclothes = findViewById(R.id.imgrecycleclothes);
        txtoldclothes = findViewById(R.id.txtoldclothes);
        txtrenewedclothes = findViewById(R.id.txtbuyrenewedclothes);
    }

    public  void buyold(View v){
        android.content.Intent nextoldclothes1= new Intent(Clothselling.this,OldClothes.class);
        startActivity(nextoldclothes1);
    }

    public  void buyrenewed(View v){
        android.content.Intent nextoldclothes1= new Intent(Clothselling.this,NewClothes.class);
        startActivity(nextoldclothes1);
    }
}
