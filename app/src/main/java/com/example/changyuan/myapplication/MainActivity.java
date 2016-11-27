package com.example.changyuan.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.changyuan.myapplication.R;
import com.example.changyuan.myapplication.SecondActivity;

import static android.R.id.button3;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText editText;
    private Button button2;
    private Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = (EditText) findViewById(R.id.ed_text);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == button2) {
            //创建intent对象 跳转
            Intent intent=new Intent(this,SecondActivity.class);
            //通过intent携带额外数据
            String message=editText.getText().toString();
            intent.putExtra("MESSAGE",message);
            //启动activity
            startActivity(intent);
        }else if (v==button3)
        {
            //创建intent对象 跳转
            Intent intent=new Intent(this,SecondActivity.class);
            //通过intent携带额外数据
            String message=editText.getText().toString();
            intent.putExtra("MESSAGE",message);
            int requestCode=2; //定义请求码
            startActivityForResult(intent,requestCode);
        }
    }
    //重写回调方法
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        //判断code
        if (requestCode==2 && resultCode==3)
        {
            //从data中取出数据
            String result=data.getStringExtra("RESULT");
            editText.setText(result);
        }
    }
}
