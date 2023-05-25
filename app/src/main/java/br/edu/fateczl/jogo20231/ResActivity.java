package br.edu.fateczl.jogo20231;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ResActivity extends AppCompatActivity {

    private TextView tvTextoRes;
    private Button btnVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_res);

        tvTextoRes = findViewById(R.id.tvTextRes);
        btnVoltar = findViewById(R.id.btnVoltar);

        Intent i = getIntent();
        Bundle b = i.getExtras();
        int valor = b.getInt("valor");

        String mensagem = getResources().getString(R.string.acertou);
        mensagem = mensagem + " " + valor;
        tvTextoRes.setText(mensagem);

        btnVoltar.setOnClickListener(l -> voltar());

        Toast.makeText(this, R.string.parabens, Toast.LENGTH_LONG).show();

    }

    public void voltar() {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
        finish();
    }

}