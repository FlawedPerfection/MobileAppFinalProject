package com.example.finalproject;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.ListView;
import java.util.ArrayList;

public class Favourites extends AppCompatActivity {
    SQLiteDatabase db;
    public ArrayList<LinkObject> linkObjectList = new ArrayList<>();
    private ListView list;
    private MyListAdapter myListAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.favorites);
        list = (ListView) findViewById(R.id.listViewFavourites);
        loadData();
        list.setAdapter(myListAdapter = new MyListAdapter(this, linkObjectList));

    }

    public void loadData(){

        // this gets you a database connection
        OpenDatabase dbOpener = new OpenDatabase(this);

        //this calls onCreate() if you don't have a table or onUpgrade is version is newer
        db = dbOpener.getWritableDatabase();

        // what this does is basically gets every item in the table represented in a 2D array that is iterable.
        Cursor c = db.rawQuery("select * from " + OpenDatabase.TABLE_NAME, new String[]{});

        int colIndexTitle = c.getColumnIndex(OpenDatabase.COL_TITLE);
        int colIndexLink = c.getColumnIndex(OpenDatabase.COL_LINK);
        int colIndexId = c.getColumnIndex(OpenDatabase.COL_ID);
        int colIndexDate = c.getColumnIndex(OpenDatabase.COL_DATE);
        int colIndexDescription = c.getColumnIndex(OpenDatabase.COL_DESCRIPTION);
        while (c.moveToNext()){

            String title = c.getString(colIndexTitle);
            String link = c.getString(colIndexLink);
            String date = c.getString(colIndexDate);
            String description = c.getString(colIndexDescription);
            long id = c.getLong(colIndexId);

            linkObjectList.add(new LinkObject(id, title, link, date ,description));
        }
        db.close();
        //this is when the messageList ArrayList item is filled with the content.
    }
}


