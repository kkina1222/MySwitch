package com.example.myswitch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView img_view;
    LinearLayout layout_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img_view = findViewById(R.id.img_view);
        layout_1 = findViewById(R.id.layout_1);

        findViewById(R.id.switch1).setOnClickListener(this);
        findViewById(R.id.radio_button1).setOnClickListener(this);
        findViewById(R.id.radio_button2).setOnClickListener(this);
        findViewById(R.id.radio_button3).setOnClickListener(this);
        findViewById(R.id.btn_begin).setOnClickListener(this);
        findViewById(R.id.btn_exit).setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.switch1:
                layout_1.invalidate();
                break;
            case R.id.radio_button1:
                img_view.setImageResource(R.drawable.an8);
                break;
            case R.id.radio_button2:
                img_view.setImageResource(R.drawable.an9);
                break;
            case R.id.radio_button3:
                img_view.setImageResource(R.drawable.an10);
                break;
            case R.id.btn_begin:
                img_view.setImageResource(0);
                break;
            case R.id.btn_exit:
                finish();
                break;
        }
    }
}