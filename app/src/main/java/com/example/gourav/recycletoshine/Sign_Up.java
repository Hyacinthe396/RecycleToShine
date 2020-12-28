package com.example.gourav.recycletoshine;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Sign_Up extends AppCompatActivity {
    EditText name1, phonenumber, email, username, password, confirmpassword;
    Button registerbtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign__up);
        name1 =(EditText) findViewById(R.id.edtname);
        phonenumber =(EditText) findViewById(R.id.editTextPhoneNumber);
        email =(EditText) findViewById(R.id.editTextEmail);
        username =(EditText) findViewById(R.id.edtusername);
        password =(EditText) findViewById(R.id.edtpassword);
        confirmpassword =(EditText) findViewById(R.id.edtpasswordconfirm);
        registerbtn =(Button) findViewById(R.id.btnregister);


    }

    public  void clickregister(View v){
        android.content.Intent nextregister1= new Intent(Sign_Up.this,Clothselling.class);
        startActivity(nextregister1);
    }
    }

