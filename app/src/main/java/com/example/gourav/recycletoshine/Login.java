package com.example.gourav.recycletoshine;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {
    EditText username1, password;
    Button loginbutton, signupbutton, forgetpasswordbtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        username1 = findViewById(R.id.edtusername);
        password = findViewById(R.id.edtpassword);
        loginbutton = findViewById(R.id.btnLOGINSECOND);
        signupbutton = findViewById(R.id.btnsignup);
        forgetpasswordbtn = findViewById(R.id.BTNforgetpassword);

    }

    public void clicklogin(View V) {
        String strusername = username1.getText().toString();
        String strpassword = password.getText().toString();

        if (strusername.equals("hya") && strpassword.equals("1234")) {
            Intent nextpage2 = new Intent(Login.this, Clothselling.class);
            startActivity(nextpage2);
        } else if (strusername.equals("") || strpassword.equals("")) {
            Toast.makeText(getBaseContext(), "Enter both username and Password", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(getBaseContext(), "Wrong username and password", Toast.LENGTH_SHORT).show();
        }
    }
    public  void signup(View v){
        android.content.Intent nextpages11= new Intent(Login.this,Sign_Up.class);
        startActivity(nextpages11);
    }

}
