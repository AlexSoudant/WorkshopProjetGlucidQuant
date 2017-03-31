package com.ynov.android.gluciddiab.dataUtils;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by admin on 31/03/17.
 */

public class ProtocoleGlucidesDbHelper extends SQLiteOpenHelper {


    private static final String DATABASE_NAME = "glucides.db";

    private static final int DATABASE_VERSION = 1;

    public ProtocoleGlucidesDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

        public void onCreate(SQLiteDatabase sqLiteDatabase) {

            final String SQL_CREATE_STAFFLIST_TABLE = "CREATE TABLE " +
                    ProtocoleGlucidesContract.ProtocoleGlucidesEntry.TABLE_NAME + " (" +
                    ProtocoleGlucidesContract.ProtocoleGlucidesEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    ProtocoleGlucidesContract.ProtocoleGlucidesEntry.GLU_LENT + " INTEGER, " +
                    ProtocoleGlucidesContract.ProtocoleGlucidesEntry.GLU_RAPIDE + " INTEGER, " +
                    ProtocoleGlucidesContract.ProtocoleGlucidesEntry.COLUMN_TIMESTAMP + " TIMESTAMP DEFAULT CURRENT_TIMESTAMP " +
                    ");";

            sqLiteDatabase.execSQL(SQL_CREATE_STAFFLIST_TABLE);

        }

        @Override
        public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
            sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + ProtocoleGlucidesContract.ProtocoleGlucidesEntry.TABLE_NAME);
            onCreate(sqLiteDatabase);
        }
}

