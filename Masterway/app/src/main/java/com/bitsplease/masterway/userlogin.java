package com.bitsplease.masterway;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class userlogin extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userlogin);

        EditText email = (EditText) findViewById(R.id.email);
        EditText userpassword = (EditText) findViewById(R.id.userpassword);

        TextView mergelogin = (TextView) findViewById(R.id.userlogin);

        Button usersignup = (Button) findViewById(R.id.usersignup);
        usersignup.setOnClickListener(this);

        mergelogin.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        int id1 = v.getId();

        switch (id1) {

            case R.id.userlogin:

                Intent flogin = new Intent(userlogin.this, finallogin.class);
                startActivity(flogin);
                break;

            case R.id.usersignup:
        }
    }
}
