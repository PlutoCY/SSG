package com.example.changyuan.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {
private EditText editText1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        editText1=(EditText)findViewById(R.id.ed_text1);
        //得到intent对象
        Intent intent=getIntent();
        //通过intent获得额外的数据
        String message=intent.getStringExtra("MESSAGE");
    //显示到Ediatext
        editText1.setText(message);
    }
    public void back1(View v)
    {
        finish();
    }
    public void back2(View v)
    {
        //保存一个带结果的返回
        int resultCode=3;//定义一个结果码
        //准备一个带额外数据的对象
        Intent data=new Intent();
        String result=editText1.getText().toString();
        data.putExtra("RESULT",result);
        //设置结果
        setResult(resultCode,data);
        finish();
    }
}
