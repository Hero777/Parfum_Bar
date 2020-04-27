package com.redrabbit.parfum_bar;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.annotation.Nullable;

public class DatabaseHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "parfumebar_aromats.db";
    public static final String TABLE_NAME = "parfums_aromats";
    public static final String COL_1 = "ID";
    public static final String COL_2 = "NUMBER_OF_AROMAT";
    public static final String COL_3 = "NAME";
    public static final String COL_4 = "PARFUMES_FAMILY";
    public static final String COL_5 = "PARFUMES_NOTES";

//Конструктор для таблицы
    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
//        TODO: для теста, потом удалить
        SQLiteDatabase db = this.getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table "+TABLE_NAME+"(ID INTEGER PRIMARY KEY AUTOINCREMENT, NUMBER_OF_AROMAT INTEGER, NAME TEXT, PARFUMES_FAMILY TEXT,PARFUMES_NOTES TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }
}
