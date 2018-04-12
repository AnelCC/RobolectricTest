package com.example.ctsuser1.roboelectrictest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.tv_hello);
        editText = findViewById(R.id.edt_input);

    }

    public void doMagic(View view) {
        textView.setText("Hello Anel");
    }

    public void doMagic2(View view) {
        textView.setText(editText.getText().toString());
    }
}
