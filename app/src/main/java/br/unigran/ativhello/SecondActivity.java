package br.unigran.ativhello;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    TextView segundaTela;
    String name;

    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_second);

        segundaTela = findViewById(R.id.idSegundaTela);
        name = getIntent().getStringExtra("name");

        segundaTela.setText("olá " + name);
    }

}
