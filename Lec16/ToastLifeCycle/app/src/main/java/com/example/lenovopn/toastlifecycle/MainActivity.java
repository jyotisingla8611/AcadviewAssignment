package com.example.lenovopn.toastlifecycle;

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
                Toast.makeText(getApplicationContext(), "On Click", Toast.LENGTH_SHORT).show();
            }
        });
    }
    protected void onStart()
    {
        super.onStart();
        Toast.makeText(this,"On Start ",Toast.LENGTH_SHORT).show();
    }
    protected void onResume()
    {
        super.onResume();
        Toast.makeText(this,"On Resume ",Toast.LENGTH_SHORT).show();

    }
    protected void onPause()
    {
        super.onPause();
        Toast.makeText(this,"On Pause ",Toast.LENGTH_SHORT).show();
    }
    protected void onStop()
    {
        super.onStop();
        Toast.makeText(this,"On Stop ",Toast.LENGTH_SHORT).show();
    }
    protected void onDestroy()
    {
        super.onDestroy();
        Toast.makeText(this,"On Destroy ",Toast.LENGTH_SHORT).show();
    }
    protected void onRestart()
    {
        super.onRestart();
        Toast.makeText(this,"On Restart ",Toast.LENGTH_SHORT).show();
    }

}
