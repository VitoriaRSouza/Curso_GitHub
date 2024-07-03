package com.example.eggs2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Pgto extends AppCompatActivity {
private Button pagamentoContinuar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pgto);
        pagamentoContinuar = findViewById(R.id.btnPGTO);
        pagamentoContinuar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Pgto.this, Fim.class);
                startActivity(intent);
            }
        });
}
}