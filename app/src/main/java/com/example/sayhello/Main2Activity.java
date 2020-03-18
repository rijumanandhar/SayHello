package com.example.sayhello;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Main2Activity extends AppCompatActivity {
    TextView toastText, countText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        toastText = findViewById(R.id.textToast);
        countText = findViewById(R.id.textCount);

        toastText.setText("Hello");
        Intent intent = getIntent();
        String value = intent.getStringExtra("Count");
        countText.setText(value);
    }
}
