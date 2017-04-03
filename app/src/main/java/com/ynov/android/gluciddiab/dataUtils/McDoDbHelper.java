package com.ynov.android.gluciddiab.dataUtils;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by antonin on 30/03/2017.
 */

// définit le comportement de la db dans l'application (création, update, etc)

public class McDoDbHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "list.db";

    private static final int DATABASE_VERSION = 1;

    public McDoDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        final String SQL_CREATE_LIST_TABLE = "CREATE TABLE " +
                McDoContract.Entrees.TABLE_NAME + " (" +
                McDoContract.Entrees._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                McDoContract.Entrees.CATEGORIE + " TEXT NOT NULL, " +
                McDoContract.Entrees.PRODUCT_NAME + " TEXT NOT NULL, " +
                McDoContract.Entrees.GLU_RAPIDE + " NUMBER, " +
                McDoContract.Entrees.GLU_LENT + " NUMBER, " +
                McDoContract.Entrees.COLUMN_TIMESTAMP + " TIMESTAMP DEFAULT CURRENT_TIMESTAMP " +
                ");";

        sqLiteDatabase.execSQL(SQL_CREATE_LIST_TABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + McDoContract.Entrees.TABLE_NAME);
        onCreate(sqLiteDatabase);
    }
}
