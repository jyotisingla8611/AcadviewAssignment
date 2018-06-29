package com.example.lenovopn.regitration;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_SHORT;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText editText=findViewById(R.id.edit1);
        final EditText editText1=findViewById(R.id.edit2);
        Button button=findViewById(R.id.button);
        Button button1=findViewById(R.id.button2);
        final SharedPreferences sharedPreferences=this.getSharedPreferences("com.example.lenovopn.regitration",MODE_PRIVATE);
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(sharedPreferences.contains(String.valueOf(editText)))
                {
                    Toast.makeText(MainActivity.this,"Login", LENGTH_SHORT);
                    String username= sharedPreferences.getString("username","");
                    String password=sharedPreferences.getString("password","");
                    Log.i("Already Account",username);
                    Log.i("Already Account",password);
                }
                else
                {
                    Toast.makeText(MainActivity.this,"Create an account", LENGTH_SHORT);
                }

            }
        });
        button1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent);
            }
        });
    }
}
