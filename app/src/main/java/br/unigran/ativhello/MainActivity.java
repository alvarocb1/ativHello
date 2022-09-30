package br.unigran.ativhello;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView nome;
    Button confirma;

    @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            nome=findViewById(R.id.idNome);
            confirma=findViewById(R.id.btnConfirmar);

        }
        public void confirmEvent (View view){
            String name = nome.getText().toString();
            Intent intent = new Intent(this,SecondActivity.class);
            intent.putExtra("name",name);
            startActivity(intent);
        }
}