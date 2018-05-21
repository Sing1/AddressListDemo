package list;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import list.address.sing.addresslistdemo.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // 高仿微信通讯录
    public void weChat(View v) {
        startActivity(new Intent(this,ActWeChat.class));
    }

    // 美团城市列表
    public void meiTuan(View v) {
        startActivity(new Intent(this,ActMeiTuan.class));
    }
}