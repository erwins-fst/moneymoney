package com.web.erwins_fst.moneymoney;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        final EditText Income = (EditText) findViewById(R.id.income);


        Button enter = (Button) findViewById(R.id.enter);
        enter.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                int input = Integer.parseInt (Income.getText().toString());


                Intent intent = new Intent(MainMenu.this, Hasil.class);
                intent.putExtra("Income", input );
                startActivity(intent);
            }
        });


    }
}
