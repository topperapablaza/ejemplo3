package com.example.ejemplo3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void enviarMensaje(View view){
        EditText mensaje=(EditText) findViewById(R.id.mensaje);
        String msg=mensaje.getText().toString();
        Intent intent= new Intent(this,RecibirActivity.class);
        intent.putExtra("msg",msg);
        startActivity(intent);

    }
}