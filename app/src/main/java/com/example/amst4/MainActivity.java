package com.example.amst4;

import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


    FloatingActionButton mAddAlarmFab, mAddPersonFab,mAddCalFab,mAddMapaFab;


    ExtendedFloatingActionButton mAddFab;

    Boolean isAllFabsVisible;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAddFab = findViewById(R.id.add_fab);
        mAddAlarmFab = findViewById(R.id.add_alarm_fab);
        mAddPersonFab = findViewById(R.id.add_person_fab);
        mAddCalFab= findViewById(R.id.add_cal_fab);
        mAddMapaFab= findViewById(R.id.add_mapa_fab);
        mAddAlarmFab.setVisibility(View.GONE);
        mAddPersonFab.setVisibility(View.GONE);
        mAddCalFab.setVisibility(View.GONE);
        mAddMapaFab.setVisibility(View.GONE);


        isAllFabsVisible = false;

        mAddFab.shrink();
        mAddFab.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (!isAllFabsVisible) {

                            mAddAlarmFab.show();
                            mAddPersonFab.show();
                            mAddCalFab.show();
                            mAddMapaFab.show();
                            mAddFab.extend();

                            isAllFabsVisible = true;
                        } else {

                            mAddAlarmFab.hide();
                            mAddPersonFab.hide();
                            mAddFab.shrink();

                            isAllFabsVisible = false;
                        }
                    }
                });

        mAddPersonFab.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(MainActivity.this, Video_View.class);
                        startActivity(intent);
                    }
                });

        mAddAlarmFab.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(MainActivity.this, GraficoLineal.class);
                        startActivity(intent);
                    }
                });
        mAddCalFab.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(MainActivity.this, Calendar_View.class);
                        startActivity(intent);
                    }
                });
        mAddMapaFab.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(MainActivity.this, MapsActivity.class);
                        startActivity(intent);
                    }
                });
    }
}
