package com.example.epapersolopos;

import android.content.Context;
import android.content.SharedPreferences;

public class Session {
    SharedPreferences pref;
    SharedPreferences.Editor editor;
    Context context;

    //mode
    int PRIVATE_MODE = 0;
    //nama
    private static final  String PREF_NAME = "slide";

    private static final String TIME_LAUNCH = "firstLauch";

    public Session (Context context){
        this.context = context;
        pref = context.getSharedPreferences(PREF_NAME,PRIVATE_MODE);
        editor = pref.edit();
    }
    public void setTimeLaunch(boolean firstLauch){
        editor.putBoolean(TIME_LAUNCH,firstLauch);
        editor.commit();
    }
    public boolean firstLaunch(){
        return pref.getBoolean(TIME_LAUNCH,true);
    }
}
