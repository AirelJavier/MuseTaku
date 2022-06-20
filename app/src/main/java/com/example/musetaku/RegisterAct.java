package com.example.musetaku;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterAct extends AppCompatActivity {

    EditText username, password, repassword;
    Button signup, btSignin;
    DBHelper DB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        username=findViewById(R.id.username);
        password=findViewById(R.id.password);
        signup=findViewById(R.id.signup);
        btSignin=findViewById(R.id.btSignin);
        DB = new DBHelper(this);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user = username.getText().toString();
                String pass = password.getText().toString();


                if (TextUtils.isEmpty(user) || TextUtils.isEmpty(pass))
                    Toast.makeText(RegisterAct.this, "All fields Required", Toast.LENGTH_SHORT).show();
                else {
                        Boolean checkuser = DB.checkusename(user);
                        if (checkuser==false){
                            Boolean insert = DB.insertData(user,pass);
                            if (insert==true){
                                Toast.makeText(RegisterAct.this, "registered Successfully", Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(getApplicationContext(),MainMenu.class);
                                startActivity(intent);
                            }else{
                                Toast.makeText(RegisterAct.this, "Registration Failed", Toast.LENGTH_SHORT).show();
                            }
                        }else{
                            Toast.makeText(RegisterAct.this, "User Already Exists", Toast.LENGTH_SHORT).show();
                        }
                }
            }
        });
    }
}