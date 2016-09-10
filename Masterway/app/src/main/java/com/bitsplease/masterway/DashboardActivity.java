package com.bitsplease.masterway;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class DashboardActivity extends AppCompatActivity {

    EditText destination;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard);
    }

    public void MapsActivity(View v) {

        destination = (EditText) findViewById(R.id.textbox);
        try {
            String terminal = destination.getText().toString();
        } catch (Exception e) {
            return;
        }

        Intent intent = new Intent(this, MapsActivity.class);
        startActivity(intent);
    }

    public static class Login extends AppCompatActivity implements View.OnClickListener {


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_login);

            Button user = (Button)findViewById(R.id.user);
            Button ems =(Button) findViewById(R.id.ems);

            user.setOnClickListener(this);
            ems.setOnClickListener(this);

        }

        @Override
        public void onClick(View v) {

                  int id= v.getId();

            switch(id){

                case R.id.user:
                    Intent i = new Intent(Login.this,userlogin.class);
                    startActivity(i);
                    break;

                case R.id.ems:
                    Intent i1 = new Intent(Login.this,emslogin.class);
                    startActivity(i1);
                    break;
            }


                }
    }
}
