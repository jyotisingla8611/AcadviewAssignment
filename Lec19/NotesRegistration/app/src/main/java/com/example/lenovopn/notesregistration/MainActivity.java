package com.example.lenovopn.notesregistration;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static com.example.lenovopn.notesregistration.Prefrences.prefrences;

public class MainActivity extends AppCompatActivity {

    EditText Username=findViewById(R.id.editText);
    EditText password=findViewById(R.id.editText2);
    Button login=findViewById(R.id.button);
    Button register=findViewById(R.id.button2);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                prefrences.createUser(Username.getText().toString(),password.getText().toString());
                if(!SQLoperate.checkTable(Username.getText().toString())){
                    Intent intent=new Intent(MainActivity.this,Registration.class);
                    startActivity(intent);
                    finish();
                }
                Intent intent = new Intent(MainActivity.this,NotesListActivity.class);
                startActivity(intent);
                finish();


            }
        });
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                prefrences.createUser(Username.getText().toString(),password.getText().toString());
                    SQLoperate.createTable(Username.getText().toString());
                    Intent intent=new Intent(MainActivity.this,Registration.class);
                    startActivity(intent);
                    finish();
                }
        });
    }
}
