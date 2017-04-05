package com.ynov.android.gluciddiab.dataUtils;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Malo on 30/03/2017.
 */

public class KfcDbHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "fastfood.db";

    private static final int DATABASE_VERSION = 1;

    public KfcDbHelper(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        final String SQL_CREATE_KFCLIST_TABLE = "CREATE TABLE " +
                KfcContract.KFCListEntry.TABLE_NAME + " (" +
                KfcContract.KFCListEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                KfcContract.KFCListEntry.CATEGORIE + " TEXT NOT NULL, " +
                KfcContract.KFCListEntry.PRODUCT_NAME + " TEXT NOT NULL, " +
                KfcContract.KFCListEntry.GLU_RAPIDE + " REAL NOT NULL, " +
                KfcContract.KFCListEntry.GLU_LENT + " REAL NOT NULL, " +
                KfcContract.KFCListEntry.IMAGE_NAME + " TEXT NOT NULL, " +
                KfcContract.KFCListEntry.COLUMN_TIMESTAMP + " TIMESTAMP DEFAULT CURRENT_TIMESTAMP " +
                ");";

        sqLiteDatabase.execSQL(SQL_CREATE_KFCLIST_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
