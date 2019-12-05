package com.example.leshtelsentunisie;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class SignIn extends AppCompatActivity {
    EditText email;
    EditText password ;
    Button signup;
    Button signin;
    String messageerreur;
    String messagesucces;
    FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        email=findViewById(R.id.editTextEmail);
        password =findViewById(R.id.editTextPassword);
        signup=findViewById(R.id.buttonSignup);
        signin=findViewById(R.id.buttonSignin);


        //récupérztion du message  existe dans le fichier string
        messageerreur=getString(R.string.messageerreur);
        messagesucces=getString(R.string.messagesucces);
        //instance du firebase
        firebaseAuth =FirebaseAuth.getInstance();
        //girer le click sur le bouttoon signin
        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //création s'un nouveau utulisateur dans la fire base
                firebaseAuth.signInWithEmailAndPassword(email.getText().toString(),password.getText().toString())
                        .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                //si l' utilisateur est exicte et l'email et le mot de passe
                                // sont correctes alors  l'nterface de liste des hotels s'ouvre
                                if (task.isSuccessful()){
                                    Intent newActivity = new Intent(SignIn.this, MainActivity.class);
                                    startActivity(newActivity);
                                    //aussi l'affichage d'un toast indique le succesde connction
                                    Toast ToastMessage = Toast.makeText(getApplicationContext(),messagesucces,Toast.LENGTH_SHORT);
                                    View toastView = ToastMessage.getView();
                                    toastView.setBackgroundColor(R.layout.toast_background_color);
                                    ToastMessage.show();
                                }
                                //si il y'a une erreur alors un Toast etre affiché
                                else { Toast ToastMessage = Toast.makeText(getApplicationContext(),messageerreur,Toast.LENGTH_SHORT);
                                    View toastView = ToastMessage.getView();
                                    toastView.setBackgroundColor(R.layout.toast_background_color);
                                    ToastMessage.show();
                                }

                            }

                        });


            }
        });
//le click sur le boutton SingUn entraine l'ouverture d'une nouvelle activity (l'interface de signUn)
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent newActivity2 = new Intent(SignIn.this, Signup.class);
                startActivity(newActivity2);
            }
        });


    }


}
