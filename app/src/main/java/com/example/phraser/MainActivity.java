package com.example.phraser;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tv_tb;
    private Button bt_gen;
    private TextView tv_result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt_gen = findViewById(R.id.bt_gen);
        tv_tb = findViewById(R.id.tv_tb);
        tv_result = findViewById(R.id.tv_result);
        bt_gen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = Phraser.PhraserGen();
                tv_tb.setText((text.substring(0, 1).toUpperCase()) + text.substring(1));
                int indexIs = text.indexOf("это");
                indexIs = indexIs + 4;
                String t = text.substring(indexIs, text.length() - 1);
                String t2 = (t.substring(0, 1).toUpperCase()) + t.substring(1) + " - это " + text.substring(0,indexIs - 7) + ".";
                tv_result.setText(t2);
            }
        });
    }
}