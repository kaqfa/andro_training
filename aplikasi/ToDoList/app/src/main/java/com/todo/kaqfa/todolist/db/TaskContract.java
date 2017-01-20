package com.todo.kaqfa.todolist.db;

import android.provider.BaseColumns;


/**
 * Created by kaqfa on 1/17/17.
 */

public class TaskContract {
    public static final String DB_NAME = "com.todo.kaqfa.todolist.db";
    public static final int DB_VERSION = 1;

    public class TaskEntry implements BaseColumns{
        public static final String TABLE = "tasks";

        public static final String COL_TASK_TITLE = "title";
    }
}
