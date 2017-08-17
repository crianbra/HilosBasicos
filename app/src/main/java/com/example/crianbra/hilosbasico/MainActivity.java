package com.example.crianbra.hilosbasico;

import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private TextView texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        texto = (TextView)findViewById(R.id.texto);


        final Handler handler = new Handler(){
            public void handleMessage(Message msg){
                super.handleMessage(msg);
                texto.setText(""+msg.getData().getInt("numero"));
            }

        };



        Button button = (Button)findViewById(R.id.btn_calcular);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new NumerosPrimos(handler).start();

            }
        });






    }


}
