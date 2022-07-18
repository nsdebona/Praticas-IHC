package com.example.app02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class msgActivity extends AppCompatActivity {

    TextView txtMsg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_msg);

        txtMsg = (TextView) findViewById(R.id.txtMsg);
        String mensagem = getIntent().getStringExtra("Mensagem");
        txtMsg.setText(mensagem);
    }
}