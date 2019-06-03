package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.btn);
        Button btn1 = findViewById(R.id.btn2);
        Button button_nouvelle_activite = findViewById(R.id.lancer_activite);
        final TextView tv = findViewById(R.id.tv);
        final TextView tv2 = findViewById(R.id.tv2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText("Apres le click sur button 1");
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv2.setText("Apres le click sur le buotton 2");
            }
        });

        //cinquieme question

        button_nouvelle_activite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,NouvelleActivite.class);
                startActivity(intent);
            }
        });
    }
}
