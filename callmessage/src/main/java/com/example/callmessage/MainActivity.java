
package com.example.callmessage;
import android.support.v7.app.AppCompatActivity;


import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.callmessage.R;

public class MainActivity extends AppCompatActivity {
    private EditText et_main_number;
    private EditText et_main_message;
    private Button bt_call;
    private Button bt_send;
    private View.OnClickListener onClickListener=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if(v==bt_call){

            }else if(v==bt_send)
            {

            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_main_number = (EditText) findViewById(R.id.et_main_number);
        et_main_message = (EditText) findViewById(R.id.et_main_message);
        bt_call = (Button) findViewById(R.id.bt_call);
        bt_send = (Button) findViewById(R.id.bt_send);
        bt_call.setOnClickListener(onClickListener);
        //给视图对象设置监听事件
//        bt_call.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                //  创建一个intent(隐式)
//
//                String action = "android.intent.action.DIAL";
//                action = Intent.ACTION_DIAL; //跟上面一样
//                Intent intent = new Intent(action);
//                //携带数据
//                String number = et_main_number.getText().toString();
//                intent.setData(Uri.parse("tel:" + number));
//                //startActivity(intent)
//                startActivity(intent);
//
//            }
//        });
//        bt_send.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent=new Intent(Intent.ACTION_SENDTO);
//                String number=et_main_number.getText().toString();
//                String sms=et_main_message.getText().toString();
//                intent.setData(Uri.parse("smsto:"+number));
//                intent.putExtra("sms_body",sms);
//                startActivity(intent);
//
//            }
//        });
        //给视图对象设置长按监听事件
        bt_call.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                return false;
            }
        });
        bt_send.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                return false;
            }
        });
    }
}
