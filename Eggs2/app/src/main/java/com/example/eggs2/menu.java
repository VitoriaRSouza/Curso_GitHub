package com.example.eggs2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class menu extends AppCompatActivity {
    private Button bvoltar;
    private Button bTelaPreco;
    private Button bTelaPedido;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        bvoltar = findViewById(R.id.bVolta);
        bvoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(menu.this, MainActivity.class);
                startActivity(intent);
            }
        });

        bTelaPreco = findViewById(R.id.btnTelaPreco);
        bTelaPreco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(menu.this, Precos.class);
                startActivity(intent);
            }
        });

        bTelaPedido = findViewById(R.id.btnPedido);
        bTelaPedido.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(menu.this, Pedido.class);
                startActivity(intent);
            }
        });

    }
}