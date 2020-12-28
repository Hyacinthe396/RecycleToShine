package com.example.gourav.recycletoshine;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    ImageView imgpage1recycle;
    TextView txtpage1title, txtpage1content;
    Button btnvisit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgpage1recycle = findViewById(R.id.imgPage1);
        txtpage1title = findViewById(R.id.txtapptitlePage1);
        txtpage1content = findViewById(R.id.textPage1Text);
        btnvisit = findViewById(R.id.btnpage1);

    }

    public  void visitclick(View v){
        android.content.Intent nextpages= new Intent(MainActivity.this,Login.class);
        startActivity(nextpages);
    }
}
