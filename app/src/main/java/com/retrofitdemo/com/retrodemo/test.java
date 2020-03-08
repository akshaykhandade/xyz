package com.retrofitdemo.com.retrodemo;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class test extends SQLiteOpenHelper {

    public static final String DATABASE_NAME="students.db";
    public static final String TABLE_NAME="students_table";
    public static final String COL1="id";
    public static final String COL2="name";
    public static final String COL3="sirname";
    public static final String COL4="marks";


    public test(@Nullable Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
