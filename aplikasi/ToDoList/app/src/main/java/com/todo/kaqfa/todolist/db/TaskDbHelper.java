package com.todo.kaqfa.todolist.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by kaqfa on 1/17/17.
 */

public class TaskDbHelper extends SQLiteOpenHelper {

    public TaskDbHelper(Context context){
        super(context, TaskContract.DB_NAME, null, TaskContract.DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String createTable = "create table "+TaskContract.TaskEntry.TABLE+" ("+
                TaskContract.TaskEntry._ID+" integer primary key autoincrement, "+
                TaskContract.TaskEntry.COL_TASK_TITLE+" text not null);";
        db.execSQL(createTable);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists "+TaskContract.TaskEntry.TABLE);
        onCreate(db);
    }
}
