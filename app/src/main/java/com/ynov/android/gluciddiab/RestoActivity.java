package com.ynov.android.gluciddiab;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.ynov.android.gluciddiab.dataUtils.ProtocoleGlucidesContract;
import com.ynov.android.gluciddiab.dataUtils.ProtocoleGlucidesDbHelper;

/**
 * Created by admin on 31/03/17.
 */

public class RestoActivity extends AppCompatActivity{

    TextView restoTitle;
    TextView TestDb;
    Button btnTestDb;

    private SQLiteDatabase mDb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resto);

        ProtocoleGlucidesDbHelper dbHelper = new ProtocoleGlucidesDbHelper(this);
        mDb = dbHelper.getReadableDatabase();

        restoTitle = (TextView) findViewById(R.id.textRestoTitle);
        TestDb = (TextView) findViewById(R.id.textTestDb);



        btnTestDb = (Button) findViewById(R.id.buttonTestDb);


        Cursor cursor = getGlulent();

        cursor.moveToFirst();
        final String GluLent = cursor.getString(cursor.getColumnIndex(ProtocoleGlucidesContract.ProtocoleGlucidesEntry.GLU_LENT));

        btnTestDb.setOnClickListener(new View.OnClickListener()
        {
            Context context = RestoActivity.this;

            Class destinationActivity = MenuActivity.class;

            Intent startmenuActivityIntent = new Intent(context, destinationActivity);

            public void onClick(View view)
            {
                startActivity(startmenuActivityIntent);

            }
        });

        TestDb.append(GluLent);
    }

    private Cursor getGlulent() {
        // COMPLETED (6) Inside, call query on mDb passing in the table name and projection String [] order by COLUMN_TIMESTAMP
        return mDb.query(
                ProtocoleGlucidesContract.ProtocoleGlucidesEntry.TABLE_NAME,
                null,
                null,
                null,
                null,
                null,
                ProtocoleGlucidesContract.ProtocoleGlucidesEntry.COLUMN_TIMESTAMP
        );
    }


}
