package com.cantalupo.frasesdodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarNovaFrase(View view){

        String[] frases = {
          "Frase 01",
          "Frase 02",
          "Frase 03",
          "Frase 04",
          "Frase 05"
        };

        int numero = new Random().nextInt(4);

        TextView texto = findViewById(R.id.textView);
        texto.setText(frases[numero]);

    }
}