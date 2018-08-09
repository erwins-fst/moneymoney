package com.web.erwins_fst.moneymoney;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;


public class Hasil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);

        TextView Essentials = (TextView) findViewById(R.id.Essen);
        TextView Personal = (TextView) findViewById(R.id.Pers);
        TextView Savings = (TextView) findViewById(R.id.Save);
        EditText Income = (EditText) findViewById(R.id.income);

                int num4 = getIntent().getExtras().getInt("Income");

        int Hasil1 =(num4*50)/100;
        int Hasil2 = (num4*30)/100;
        int Hasil3 = (num4*20)/100;

        Essentials.setText(Hasil1+" ");
        Personal.setText(Hasil2+ " ");
        Savings.setText(Hasil3+ " ");


    }
}
