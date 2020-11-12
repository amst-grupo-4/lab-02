package com.example.amst4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View v) {
        Intent intent;
        if(v.getId()==R.id.btnYoutube){
             //intent = new Intent(this, formulario_registro.class);

        }
        if(v.getId()==R.id.btnCalendario){
             //intent = new Intent(this, formulario_registro.class);

        }
        if (v.getId()==R.id.btnMapa){
            intent = new Intent(this, MapsActivity.class);
        }else {
            intent = new Intent(this, GraficoLineal.class);

        }

        startActivity(intent);
    }
}
