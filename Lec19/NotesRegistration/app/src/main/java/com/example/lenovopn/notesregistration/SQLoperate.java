package com.example.lenovopn.notesregistration;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import static android.content.Context.MODE_PRIVATE;
public class SQLoperate {
    Context context;
    static SQLiteDatabase db;
    private static SQLoperate sqLoperations;
    private SQLoperate(Context context) {
        this.context = context;
        db = context.openOrCreateDatabase("userDB", MODE_PRIVATE, null);
    }
    public static SQLoperate getInstance(Context context) {
        if (sqLoperations == null) {
            sqLoperations = new SQLoperate(context);
        }
        return sqLoperations;
    }
    static void createTable(String tablename) {
        try {
            db.execSQL("CREATE TABLE IF NOT EXISTS " +tablename+ "(notes VARCHAR)");
        } catch (Exception e) {
            throw e;
        }
    }
    void insert(String tablename,String note) {
        db.execSQL("INSERT INTO " +tablename+ " VALUES('" +note+ "')");
    }
    void update(String tablename,String previousNote, String newNote) {
    }
    void delete(String tablename, String note) {
    }
    static boolean checkTable(String tablename) {
        Cursor c = null;
        try
        {
            c = db.query(tablename, null,
                    null, null, null, null, null);
        }
        catch (Exception e) {
            return false;
        }
        return true;
    }
    static ArrayList<String> getNotes(String tablename) {
        Cursor c = db.rawQuery("SELECT * FROM " +tablename+ "",null);
        ArrayList<String> notes = new ArrayList<>();
        if(c.moveToFirst()) {
            do {
                int index = c.getColumnIndex("notes");
                String note = c.getString(index);
                notes.add(note);
            } while (c.moveToNext());
        }
        return  notes;
    }
}