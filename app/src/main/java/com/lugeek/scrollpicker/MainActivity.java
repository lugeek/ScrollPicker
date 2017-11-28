package com.lugeek.scrollpicker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ScrollPicker picker = (ScrollPicker) findViewById(R.id.scrollPicker);
        picker.setData("111111111111",
                "22222222222",
                "3333",
                "44444",
                "55555",
                "66666");
    }
}
