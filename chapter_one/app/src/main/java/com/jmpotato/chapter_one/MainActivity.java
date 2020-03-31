package com.jmpotato.chapter_one;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button ask_button = findViewById(R.id.ask_button);
        final TextView test_view = findViewById(R.id.text_view);
        final RadioButton ask_name = findViewById(R.id.ask_name), ask_id = findViewById(R.id.ask_id);
        Switch anotherSwicth = findViewById(R.id.anotherSwicth);
        final ImageView icon = findViewById(R.id.icon);

        anotherSwicth.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    icon.setImageResource(R.mipmap.logo_1);
                    Log.d("MainActivity", "Change to S1T-1");
                } else {
                    icon.setImageResource(R.mipmap.logo_2);
                    Log.d("MainActivity", "Change to S1T-2");
                }
            }
        });

        ask_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 根据选了哪个 Radio Button 来设置不同的文本
                if (ask_name.isChecked()) {
                    test_view.setText("我的名字");
                    Log.d("MainActivity", "My Name");
                } else if (ask_id.isChecked()) {
                    test_view.setText("我的学号");
                    Log.d("MainActivity", "Student ID");
                }
            }
        });


    }
}
