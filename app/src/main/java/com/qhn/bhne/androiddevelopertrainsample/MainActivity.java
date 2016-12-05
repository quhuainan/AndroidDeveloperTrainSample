package com.qhn.bhne.androiddevelopertrainsample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_send_text)
    public void onClick() {
        Intent ine=new Intent();
        ine.setAction(Intent.ACTION_SEND);
        ine.putExtra(Intent.EXTRA_TEXT,"第一次分享数据");
        ine.setType("text/plain");
        //startActivity(ine);

        startActivity(Intent.createChooser(ine,"哈哈"));
    }
}
