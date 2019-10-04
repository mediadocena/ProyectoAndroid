package com.example.prueba1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void boton(View view){
        final Button boton=findViewById(R.id.boton);
        Intent inte = new Intent(this,clase2.class);
        EditText pass = (EditText) findViewById(R.id.pass);
        String message = pass.getText().toString();
        String contra = "java";
        if(contra.equals(message)) {

            inte.putExtra(EXTRA_MESSAGE, message);
            startActivity(inte);
        }else{
            Toast.makeText(this, "CONTRASEÑA INCORRECTA", Toast.LENGTH_SHORT).show();
        }
    }





}
