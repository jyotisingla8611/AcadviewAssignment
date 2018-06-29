package com.example.lenovopn.regitration;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        final EditText editText=findViewById(R.id.edit1);
        final SharedPreferences sharedPreferences=this.getSharedPreferences("com.example.lenovopn.regitration",MODE_PRIVATE);
        final EditText editText1=findViewById(R.id.edit2);
        Button button=findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String ed=editText.getText().toString();
                String ed1=editText1.getText().toString();
                sharedPreferences.edit().putString("username",ed).apply();
                sharedPreferences.edit().putString("password",ed1).apply();
            }
        });
    }
}
