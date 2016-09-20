package com.example.rm40300.launchbroadcastreceiver;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText etTexto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etTexto = (EditText) findViewById(R.id.etTexto);
    }

    public void executarApp(View v) {
        Intent i = new Intent("com.example.rm40300.demobroadcastreceiver.intent.testebroadcast");
        i.putExtra("TESTE", etTexto.getText().toString());
        i.putExtra("TITULO", "Nova Mensagem");
        i.putExtra("DESCRICAO", "Oi, esse é um exemplo de notificação junto com broadcast receiver");
        i.putExtra("TICKER", "Você tem uma nova mensagem");
        sendBroadcast(i);
    }
}
