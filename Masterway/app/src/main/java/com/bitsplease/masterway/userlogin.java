package com.bitsplease.masterway;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class userlogin extends AppCompatActivity implements View.OnClickListener {

    FirebaseAuth mAuth;
    EditText email;
    EditText userpassword;
    public static final String TAG ="" ;
    private FirebaseAuth.AuthStateListener mAuthListener;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userlogin);


        mAuth = FirebaseAuth.getInstance();


         email = (EditText) findViewById(R.id.email);
         userpassword = (EditText) findViewById(R.id.userpassword);

        TextView mergelogin = (TextView) findViewById(R.id.userlogin);

        Button usersignup = (Button) findViewById(R.id.usersignup);
        usersignup.setOnClickListener(this);

        mergelogin.setOnClickListener(this);


     /*   mAuthListener = new FirebaseAuth.AuthStateListener()  {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                FirebaseUser user = firebaseAuth.getCurrentUser();
                if (user != null) {
                    // User is signed in
                    Log.d(TAG, "onAuthStateChanged:signed_in:" + user.getUid());
                } else {
                    // User is signed out
                    Log.d(TAG, "onAuthStateChanged:signed_out");
                }
                // [START_EXCLUDE]
               // updateUI(user);
                // [END_EXCLUDE]
            }
        };
        // [END auth_state_listener]
    }

    // [START on_start_add_listener]
    @Override
    public void onStart() {
        super.onStart();
        mAuth.addAuthStateListener(mAuthListener);
    }
    // [END on_start_add_listener]

    // [START on_stop_remove_listener]
    @Override
    public void onStop() {
        super.onStop();
        if (mAuthListener != null) {
            mAuth.removeAuthStateListener(mAuthListener);
        }
*/


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
                mAuth.createUserWithEmailAndPassword(email.getText().toString(), userpassword.getText().toString())
                        .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {


                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                Log.d(TAG, "createUserWithEmail:onComplete:" + task.isSuccessful());

                                // If sign in fails, display a message to the user. If sign in succeeds
                                // the auth state listener will be notified and logic to handle the
                                // signed in user can be handled in the listener.
                                if (!task.isSuccessful()) {
                                    Toast.makeText(getApplicationContext(), "Error",
                                            Toast.LENGTH_SHORT).show();
                                    Log.d("TAGSKJH", "onComplete: " + task.getException().toString());
                                }

                                // ...
                            }
                        });
                Intent f = new Intent(userlogin.this, finallogin.class);
                startActivity(f);


        }
    }
}
