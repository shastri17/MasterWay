package com.bitsplease.masterway;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class finallogin extends AppCompatActivity implements View.OnClickListener {

    CheckBox emergency;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finallogin);

        EditText finalemail = (EditText) findViewById(R.id.finalemail);
        EditText finalpasword = (EditText) findViewById(R.id.finalpassword);

        emergency = (CheckBox) findViewById(R.id.emscheckBox);
        Button go = (Button) findViewById(R.id.go);

        go.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if(emergency.isChecked()){

          //  Intent e=new Intent(finallogin.this,dashboard.class);
          //  startActivity(e);
        }

        else{

           // Intent e=new Intent(finallogin.this,dashboard.class);
           // startActivity(e);

        }
    }
}
