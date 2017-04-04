package com.ynov.android.gluciddiab;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.ynov.android.gluciddiab.dataUtils.KfcData;
import com.ynov.android.gluciddiab.dataUtils.KfcDbHelper;
import com.ynov.android.gluciddiab.dataUtils.McDoContract;
import com.ynov.android.gluciddiab.dataUtils.McDoData;
import com.ynov.android.gluciddiab.dataUtils.McDoDbHelper;

public class MainActivity extends AppCompatActivity {

    Button btnProtocoleTransition;
    SQLiteDatabase mDb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        McDoDbHelper dbHelper = new McDoDbHelper(this);
        mDb = dbHelper.getWritableDatabase();

        //mDb.delete(McDoContract.Entrees.TABLE_NAME,null,null);

        McDoData.insertData(mDb);

        KfcDbHelper dbHelperkfc = new KfcDbHelper(this);
        mDb = dbHelperkfc.getWritableDatabase();

        KfcData.insertFastFoodData(mDb);

        //McDoDbHelper dbHelper2 = new McDoDbHelper(this);

        //mDb = dbHelper2.getReadableDatabase();

        //Cursor cursor = getItem();
        //cursor.moveToFirst();

        //int i = 0;

        //String ItemName = (cursor.getString(cursor.getColumnIndex(McDoContract.Entrees.PRODUCT_NAME)));


        btnProtocoleTransition = (Button) findViewById(R.id.buttonProtocoleTransition);
        //btnProtocoleTransition.setText(ItemName);

        final Context context = MainActivity.this;

        SharedPreferences userDetails = context.getSharedPreferences("BOOT_PREF", MODE_PRIVATE);

        final boolean firstboot = userDetails.getBoolean("firstboot", true);

        btnProtocoleTransition.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {

                Class destinationActivity = ProtocoleActivity.class;

                Intent startProtocoleActivityIntent = new Intent(context, destinationActivity);

                Class noProtocoleActivity = RestoActivity.class;

                Intent startRestoActivity = new Intent(context, noProtocoleActivity);

                if (firstboot){
                    // 1) Launch the authentication activity

                    startActivity(startProtocoleActivityIntent);
                    // 2) Then save the state
                    context.getSharedPreferences("BOOT_PREF", MODE_PRIVATE)
                            .edit()
                            .putBoolean("firstboot", false)
                            .commit();
                }else startActivity(startRestoActivity);



            }
        });


    }


    private Cursor getItem() {
        // COMPLETED (6) Inside, call query on mDb passing in the table name and projection String [] order by COLUMN_TIMESTAMP
        return mDb.query(
                McDoContract.Entrees.TABLE_NAME,
                null,
                null,
                null,
                null,
                null,
                McDoContract.Entrees.COLUMN_TIMESTAMP
        );
    }


}
