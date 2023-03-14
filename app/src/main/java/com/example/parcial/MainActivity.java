package com.example.parcial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.io.Serializable;

public class MainActivity extends AppCompatActivity implements Serializable {

    private static final String user = "usma202528";
    private static final String password = "usma20";

    public String userConstructor,passwordConstructor;

    public MainActivity(String user, String password){
        this.userConstructor = user;
        this.passwordConstructor = password;
    }


    EditText editUser, editPassword;
    Button btnIngresar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editUser = (EditText)findViewById(R.id.editUser);
        editPassword = (EditText)findViewById(R.id.editPassword);
        btnIngresar = (Button)findViewById(R.id.btnIngresar);


            btnIngresar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    // if (user == editUser.getText().toString() && password == editPassword.getText().toString()) {}
                        Intent intent = new Intent(view.getContext(), MainActivity2.class);
                        Intent intent2 = new Intent(MainActivity.this,MainActivity2.class);
                        MainActivity mainActivity = new MainActivity("usma202528","Usma20");
                        intent2.putExtra("mainActivity", mainActivity);
                        startActivity(intent);

                }
            });

    }
}