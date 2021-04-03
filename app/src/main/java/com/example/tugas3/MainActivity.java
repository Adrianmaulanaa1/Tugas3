package com.example.tugas3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tampilan_menu);
    }

    public void clickRS(View view) {
        //gambar RS di click
        Intent i = new Intent(this,RS.class);
        startActivity(i);
    }
    public void clickPOLISI(View view) {
        //Gambar POLISI di click
        Intent i = new Intent(this,POLISI.class);
        startActivity(i);
    }
    public void clickSTORE(View view) {
        //Gambar POLISI di click
        Intent i = new Intent(this,STORE.class);
        startActivity(i);
    }
    public void clickSEKOLAH(View view) {
        //Gambar POLISI di click
        Intent i = new Intent(this, SEKOLAH.class);
        startActivity(i);
    }

}