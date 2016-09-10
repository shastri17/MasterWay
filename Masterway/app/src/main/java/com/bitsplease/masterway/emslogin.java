package com.bitsplease.masterway;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class emslogin extends AppCompatActivity implements View.OnClickListener {
    EditText vnumber;
    EditText emspassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emslogin);

         vnumber = (EditText) findViewById(R.id.vnumber);
         emspassword = (EditText) findViewById(R.id.emspassword);

        TextView emslogin = (TextView) findViewById(R.id.userlogin);

        Button emssignup = (Button) findViewById(R.id.emssignup);
        emssignup.setOnClickListener(this);

        emslogin.setOnClickListener(this);




    }

    @Override
    public void onClick(View v) {

        int ids = v.getId();

        switch (ids) {

            case R.id.userlogin:


                Intent flogin = new Intent(emslogin.this, finallogin.class);
            startActivity(flogin);
                break;


        }
    }
}
