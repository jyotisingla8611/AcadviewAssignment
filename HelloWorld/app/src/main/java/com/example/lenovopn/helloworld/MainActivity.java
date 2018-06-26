package com.example.lenovopn.helloworld;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button;
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "ButtonClicked", Toast.LENGTH_SHORT).show();
            }
        });
        Log.d("ActiveState","onCreate()");
    }
    protected void onStart()
    {
         super.onStart();
        Log.d("ActiveState","onStart()");
    }
    protected void onResume()
    {
        super.onResume();
        Log.d("ActiveState","onResume()");
    }
    protected void onPause()
    {
        super.onPause();
        Log.d("ActiveState","onPause()");
    }
    protected void onStop()
    {
        super.onStop();
        Log.d("ActiveState","onStop()");
    }
    protected void onDestroy()
    {
        super.onDestroy();
        Log.d("ActiveState","onDestroy()");
    }
}