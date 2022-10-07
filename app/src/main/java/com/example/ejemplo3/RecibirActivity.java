package com.example.ejemplo3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class RecibirActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recibir);
        Intent intent=getIntent();
        String msg=intent.getStringExtra("msg");
        TextView mensaje=(TextView) findViewById(R.id.recibido);
        mensaje.setText(msg);
    }
    public void cerrar(View view){
        finish();
    }
}