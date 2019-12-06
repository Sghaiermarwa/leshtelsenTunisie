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
    private EditText memail;
    private EditText mpassword ;
    private  Button signup;
    private Button signin;
    private String messageerreur;
    private String messagesucces;
    FirebaseAuth firebaseAuth;
    //savedpreferences
    private CheckBox mcheckBox;
    private SharedPreferences mPreferences;
    private SharedPreferences.Editor mEditor;
    private static final String TAG ="SignIn";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        memail=(EditText)findViewById(R.id.editTextEmail);
        mpassword=(EditText)findViewById(R.id.editTextPassword);
        signup=(Button)findViewById(R.id.buttonSignup);
        signin=(Button)findViewById(R.id.buttonSignin);

        mcheckBox=(CheckBox) findViewById(R.id.checkBox);
        mPreferences=PreferenceManager.getDefaultSharedPreferences(this);
        mEditor=mPreferences.edit();
        checkSharedPreferences();

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
                firebaseAuth.signInWithEmailAndPassword(memail.getText().toString(),mpassword.getText().toString())
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
                //enregistrer le sheckbox preference
                if(mcheckBox.isChecked()){
                    //modifier le  checkbox si l'application débute
                    mEditor.putString(getString(R.string.chackbox),"True");
                    mEditor.commit();

                    //enregistrer l' email
                    String email =memail.getText().toString();
                    mEditor.putString(getString(R.string.email),email);
                    mEditor.commit();

                    //enregistrer le password
                    String password =mpassword.getText().toString();
                    mEditor.putString(getString(R.string.Password),email);
                    mEditor.commit();
                }
                else {
                    //modifier le  checkbox si l'application débute
                    mEditor.putString(getString(R.string.chackbox),"False");
                    mEditor.commit();

                    //enregister l'email

                    mEditor.putString(getString(R.string.email),"");
                    mEditor.commit();

                    //enregister le password

                    mEditor.putString(getString(R.string.Password),"");
                    mEditor.commit();}


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
    private void checkSharedPreferences(){
        String checkbox=mPreferences.getString(getString(R.string.chackbox),"False");
        String email=mPreferences.getString(getString(R.string.email),"");
        String password=mPreferences.getString(getString(R.string.Password),"");
        memail.setText(email);
        mpassword.setText(password);
        if(checkbox.equals("True")){
            mcheckBox.setChecked(true);

        }
        else {
            mcheckBox.setChecked(false);
        }

    }


}
