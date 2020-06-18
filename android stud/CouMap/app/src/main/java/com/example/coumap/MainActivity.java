package com.example.coumap;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;


public class MainActivity extends AppCompatActivity {
    Button signinbtn;
    EditText idText,pwdText;
    FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        idText = (EditText)findViewById(R.id.idText);
        pwdText = (EditText)findViewById(R.id.pwdText);
        signinbtn = (Button) findViewById(R.id.signinbtn);

        signinbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MapActivity.class);
                startActivity(intent);
            }
        });
    }

    private void Login(){
        String email = idText.getText().toString().trim();
        String password = pwdText.getText().toString().trim();

        if(TextUtils.isEmpty(email)){
            Toast.makeText(this, "email을 입력해 주세요", Toast.LENGTH_SHORT).show();
            return;
        }
        if(TextUtils.isEmpty(password)){
            Toast.makeText(this, "password를 입력해 주세요", Toast.LENGTH_SHORT).show();
        }

        firebaseAuth.signInWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful()){
                            finish();
                            startActivity(new Intent(getApplicationContext(), MapActivity.class));
                        }else{
                            Toast.makeText(getApplicationContext(), "로그인 실패", Toast.LENGTH_LONG).show();
                        }
                    }
                });
    }
}