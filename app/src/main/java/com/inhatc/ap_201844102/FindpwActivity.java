package com.inhatc.ap_201844102;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class FindpwActivity extends AppCompatActivity {

    private FirebaseAuth mFirebaseAuth; //파이어베이스 인증처리
    private DatabaseReference mDatabaseRef; //실시간 데이터베이스
    private EditText emailtofindpwText;
    private Button findpwtoemailButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_findpw);

        mFirebaseAuth = FirebaseAuth.getInstance();
        mDatabaseRef = FirebaseDatabase.getInstance().getReference();

        emailtofindpwText = findViewById(R.id.emailtofindpwText);

        findpwtoemailButton = findViewById(R.id.findpwtoemailButton);

        findpwtoemailButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String strEmail = emailtofindpwText.getText().toString();
                mFirebaseAuth.sendPasswordResetEmail(strEmail).addOnCompleteListener(FindpwActivity.this, new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        if(task.isSuccessful()){
                            Toast.makeText(FindpwActivity.this, "재설정 메일을 보냈습니다..",Toast.LENGTH_SHORT).show();
                        }else{
                            Toast.makeText(FindpwActivity.this,"재설정 메일 전송에 실패했습니다...",Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }
        });
    }
}