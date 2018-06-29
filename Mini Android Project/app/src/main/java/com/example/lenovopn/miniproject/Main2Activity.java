package com.example.lenovopn.miniproject;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;

public class Main2Activity extends AppCompatActivity {

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        final ArrayList<String> list=new ArrayList<>();
        Intent prevIntent = getIntent();
        String text = prevIntent.getStringExtra("data");
        list.add(text);
        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this , android.R.layout.simple_list_item_1, list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                String value=adapter.getItem(position);
                if(value=="DialerPad") {
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("9023672341"));
                    startActivity(intent);
                }
                /*else if(value=="Camera")
                {
                    Intent intent = new Intent(Intent.ACTION_CAMERA_BUTTON);
                    intent.setData(Uri.parse());
                    startActivity(intent);
                }*/
                else if(value=="Browser")
                {
                    Intent intent=new Intent(Intent.ACTION_VIEW);
                    String url="https://www.google.com/";
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
                else if(value=="Gmail")
                {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    String url="http://www.gmail.com";
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
                else
                {
                    Intent intent=new Intent(Main2Activity.this,Main3Activity.class);
                    intent.putExtra("value is ",value);
                    startActivity(intent);
                }
            }
        });

    }
}
