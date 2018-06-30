package com.example.lenovopn.notesregistration;

import android.content.Context;
import android.content.SharedPreferences;

public class Prefrences {
    private final String username = "username";
    private final String password = "password";
    private final String isLogIn = "IsLogin";
    public static Prefrences prefrences;
    SharedPreferences sharedPreferences;
    Context context;
    private Prefrences(Context context) {
        this.context =  context;
        sharedPreferences = context.getSharedPreferences("prefs",Context.MODE_PRIVATE);
    }
    public static Prefrences getInstance(Context context) {
        if(prefrences == null) {
            prefrences = new Prefrences(context);
        }
        return prefrences;
    }
    void createUser(String name, String password) {
        sharedPreferences.edit().putString(username,name).apply();
        sharedPreferences.edit().putString(password,password).apply();
        sharedPreferences.edit().putBoolean(isLogIn,true).apply();
    }
    String getUserName() {
        return sharedPreferences.getString(username,"");
    }
    boolean isLogin() {
        return  sharedPreferences.getBoolean(isLogIn,false);
    }
    void logOut() {
        sharedPreferences.edit().putBoolean(isLogIn, false).apply();
    }
}