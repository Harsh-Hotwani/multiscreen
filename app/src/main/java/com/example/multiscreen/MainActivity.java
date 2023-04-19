package com.example.multiscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final String msg = "com.harsh.multiscreen.ORDER";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void submit(View view)
    {
        Intent intent = new Intent(this, OrderActivity.class);
        EditText editText1 = findViewById(R.id.editText1);
        EditText editText2 = findViewById(R.id.editText2);
        EditText editText3 = findViewById(R.id.editText3);
        if(TextUtils.isEmpty(editText1.getText()) || TextUtils.isEmpty(editText2.getText())|| TextUtils.isEmpty(editText3.getText()))
        {
            Toast.makeText(getApplicationContext(), "please enter a sufficient data", Toast.LENGTH_SHORT).show();
        }
        else {
            String massage = "your order of " + editText1.getText().toString() + "," + editText2.getText().toString() + "and" +
                    editText3.getText().toString() + " has successfully placed";
            intent.putExtra(msg, massage);
            startActivity(intent);
        }
    }
}