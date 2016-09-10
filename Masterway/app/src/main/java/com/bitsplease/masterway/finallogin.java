package com.bitsplease.masterway;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class finallogin extends AppCompatActivity implements View.OnClickListener {

    private FirebaseAuth mAuth;

    CheckBox emergency;
    EditText finalemail;
    EditText finalpassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finallogin);

         finalemail = (EditText) findViewById(R.id.finalemail);
         finalpassword = (EditText) findViewById(R.id.finalpassword);


        mAuth = FirebaseAuth.getInstance();
        emergency = (CheckBox) findViewById(R.id.emscheckBox);
        Button go = (Button) findViewById(R.id.go);

        go.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        mAuth.signInWithEmailAndPassword(finalemail.getText().toString(),finalpassword.getText().toString())
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        Log.d("Abcd", "signInWithEmail:onComplete:" + task.isSuccessful());

                        Toast.makeText(getApplicationContext(), "Success",
                                Toast.LENGTH_SHORT).show();
                        // If sign in fails, display a message to the user. If sign in succeeds
                        // the auth state listener will be notified and logic to handle the
                        // signed in user can be handled in the listener.
                        if (!task.isSuccessful()) {
                            Log.w("Abcd", "signInWithEmail:failed", task.getException());
                            Toast.makeText(getApplicationContext(), "Error",
                                    Toast.LENGTH_SHORT).show();
                        }

                        // ...
                    }
                });

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
