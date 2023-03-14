package com.example.parcial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    EditText editUser2, editEdad2, editUbicacion2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        editUser2=(EditText)findViewById(R.id.editUser2);
        editEdad2=(EditText)findViewById(R.id.editEdad2);
        editUbicacion2=(EditText)findViewById(R.id.editUbicacion2);
        Intent intent = getIntent();
        MainActivity mainActivity = (MainActivity)intent.getSerializableExtra("mainActivity");


        editUser2.setText(mainActivity.userConstructor);
        editEdad2.setText("18");
        editUbicacion2.setText("Bogota");
    }
}