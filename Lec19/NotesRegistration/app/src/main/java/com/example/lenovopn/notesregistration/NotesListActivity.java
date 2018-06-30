package com.example.lenovopn.notesregistration;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
public class NotesListActivity extends AppCompatActivity {
    ListView listView;
    ArrayList<String> notes;
    ArrayAdapter<String> arrayAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes_list);
        Prefrences prefrences;
            listView = findViewById(R.id.listview);
            prefrences = Prefrences.getInstance(getApplicationContext());
        if(!prefrences.isLogin()) {
                Intent intent = new Intent(NotesListActivity.this,MainActivity.class);
                startActivity(intent);
                finish();
                return;
            }
            displayNotes(prefrences.getUserName());
        }
        private void displayNotes(String Username) {
            notes = SQLoperate.getNotes(Username);
            if(!notes.isEmpty()) {
                arrayAdapter = new ArrayAdapter<>(NotesListActivity.this,android.R.layout.simple_list_item_1,notes);
                listView.setAdapter(arrayAdapter);
            } else {
                Toast.makeText(getApplicationContext(),"Notes list is empty",Toast.LENGTH_SHORT).show();
            }
    }
}