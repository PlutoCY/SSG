package com.example.simpleconponent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
private Button btn_text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_text=(Button) findViewById(R.id.btn_text);
        btn_text.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v==btn_text)
        {
            Intent intent=new Intent(MainActivity.this,TextActivity.class);
            startActivity(intent);
        }
    }
}
