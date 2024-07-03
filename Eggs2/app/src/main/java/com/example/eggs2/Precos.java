package com.example.eggs2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class Precos extends AppCompatActivity {
    private Button bvoltarPrecos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_precos);
        bvoltarPrecos = findViewById(R.id.btnVoltaPreco);
        bvoltarPrecos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(Precos.this,menu.class);
                startActivity(intent);
            }
        });
    }
}