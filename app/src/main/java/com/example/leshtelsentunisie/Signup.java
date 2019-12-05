package com.example.leshtelsentunisie;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Signup extends AppCompatActivity {

EditText email;
EditText password ;
Button signup;
Button signin;
String message;
FirebaseAuth  firebaseAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        email=findViewById(R.id.editTextEmail2);
        password =findViewById(R.id.editTextPassword2);
        signup=findViewById(R.id.buttonSignup2);
        signin=findViewById(R.id.buttonSignin2);
        //récupérztion du message  existe dans le fichier string
        message=getString(R.string.messagesignup);
        //instance du firebase
        firebaseAuth =FirebaseAuth.getInstance();
        //girer le click sur le bouttoon signup
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //création s'un nouveau utulisateur dans la fire base
                firebaseAuth.createUserWithEmailAndPassword(email.getText().toString(),password.getText().toString())
                        .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        //si la creation d'un nouveau utilisateur est réussite alors un toast etre affiché
                        if (task.isSuccessful()){
                            Toast ToastMessage = Toast.makeText(getApplicationContext(),message,Toast.LENGTH_SHORT);
                            View toastView = ToastMessage.getView();
                            toastView.setBackgroundColor(R.layout.toast_background_color);
                            ToastMessage.show();
                        }
                        //si il y'a une erreur alors un Tost qui s'affiche avec une exception
                        else {
                            Toast ToastMessage = Toast.makeText(getApplicationContext(),task.getException().toString(),Toast.LENGTH_SHORT);
                            View toastView = ToastMessage.getView();
                            toastView.setBackgroundColor(R.layout.toast_background_color);
                            ToastMessage.show();}

                    }

                });
            }
        });
        //le click sur le boutton Singin entraine l'ouverture d'une nouvelle activity (l'interface de signin)
        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent newActivity = new Intent(Signup.this, SignIn.class);
                startActivity(newActivity);
            }
        });


    }
}
