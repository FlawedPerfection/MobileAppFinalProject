package com.example.finalproject;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;



public class OpenDatabase extends SQLiteOpenHelper {

    protected final static int VERSION_NUM = 1;
    private final static String DATABASE_NAME = "MyFirstDB";
    protected final static String TABLE_NAME = "MYTABLE";
    protected final static String COL_TITLE = "TITLE";
    protected final static String COL_LINK = "LINK";
    protected final static String COL_DATE = "DATE";
    protected final static String COL_DESCRIPTION = "DESCRIPTION";
    protected final static String COL_ID = "_id";


    public OpenDatabase(Context context) {
        super(context, DATABASE_NAME, null, VERSION_NUM);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("CREATE TABLE " + TABLE_NAME + " (_id INTEGER PRIMARY KEY AUTOINCREMENT, "
                + COL_TITLE +" text,"
                + COL_LINK + " text,"
                + COL_DATE +" text,"
                + COL_DESCRIPTION +" text);");

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVers, int newVers) {
        System.out.println("on upgrade is firing");
    }
}
