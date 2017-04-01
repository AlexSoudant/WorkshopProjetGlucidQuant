package com.ynov.android.gluciddiab;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.ynov.android.gluciddiab.dataUtils.ProtocoleGlucidesContract;
import com.ynov.android.gluciddiab.dataUtils.ProtocoleGlucidesDbHelper;

/**
 * Created by admin on 30/03/17.
 */

public class ProtocoleActivity extends AppCompatActivity{

    EditText matinGlucideLent;
    EditText matinGlucideRapide;
    EditText midiGlucideLent;
    EditText midiGlucideRapide;
    EditText gouterGlucideLent;
    EditText gouterGlucideRapide;
    EditText soirGlucideLent;
    EditText soirGlucideRapide;

    TextView protocoleTitle;

    Button btnProtocoleValidate;

    private SQLiteDatabase mDb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_protocole);

        final ProtocoleGlucidesDbHelper dbHelper = new ProtocoleGlucidesDbHelper(this);
        mDb = dbHelper.getWritableDatabase();

        protocoleTitle = (TextView) findViewById(R.id.textViewProtocoleTitle);


        matinGlucideLent = (EditText) findViewById(R.id.editTextMatinLent);
        matinGlucideRapide = (EditText) findViewById(R.id.editTextMatinRapide);

        midiGlucideLent = (EditText) findViewById(R.id.editTextMidiLent);
        midiGlucideRapide = (EditText) findViewById(R.id.editTextMidiRapide);

        gouterGlucideLent = (EditText) findViewById(R.id.editTextAPLent);
        gouterGlucideRapide = (EditText) findViewById(R.id.editTextAPRapide);

        soirGlucideLent = (EditText) findViewById(R.id.editTextSoirLent);
        soirGlucideRapide = (EditText) findViewById(R.id.editTextSoirRapide);

        btnProtocoleValidate = (Button) findViewById(R.id.buttonValidate);

        //btnProtocoleValidate.setEnabled(false);

        btnProtocoleValidate.setOnClickListener(new View.OnClickListener()
                {
                    public void onClick(View view)
                    {
                        //Toast msgLoadNextPage = Toast.makeText(getBaseContext(),"chargement next page",Toast.LENGTH_LONG);
                        Toast msgEmptyField = Toast.makeText(getBaseContext(),"Champs vide!",Toast.LENGTH_LONG);

                        Context context = ProtocoleActivity.this;

                        Class destinationActivity = RestoActivity.class;

                        Intent startrestoActivityIntent = new Intent(context, destinationActivity);

                        if (!matinGlucideLent.getText().toString().equals("") && !matinGlucideRapide.getText().toString().equals("") && !midiGlucideRapide.getText().toString().equals("") && !midiGlucideLent.getText().toString().equals("") && !gouterGlucideRapide.getText().toString().equals("") && !gouterGlucideLent.getText().toString().equals("") && !soirGlucideRapide.getText().toString().equals("") && !soirGlucideLent.getText().toString().equals("")){

                            String QueryMatinGluLent = matinGlucideLent.getText().toString();
                            String QueryMatinGluRapide = matinGlucideRapide.getText().toString();

                            //String query = "INSERT INTO protocoleglucidesdata (glulent,glurapide) VALUES('" + QueryMatinGluLent + "', '" + QueryMatinGluRapide + "');";

                            //mDb.execSQL(query);

                            mDb.delete(ProtocoleGlucidesContract.ProtocoleGlucidesEntry.TABLE_NAME,"1",null);

                            ContentValues values = new ContentValues();

                            values.put(ProtocoleGlucidesContract.ProtocoleGlucidesEntry.GLU_LENT, QueryMatinGluLent);
                            values.put(ProtocoleGlucidesContract.ProtocoleGlucidesEntry.GLU_RAPIDE, QueryMatinGluRapide);

                            mDb.insert(ProtocoleGlucidesContract.ProtocoleGlucidesEntry.TABLE_NAME, null, values);

                            Cursor cursor = getGlulent();

                            cursor.moveToFirst();
                            String GluLent = cursor.getString(cursor.getColumnIndex(ProtocoleGlucidesContract.ProtocoleGlucidesEntry.GLU_LENT));

                            Toast msgEmptyDb = Toast.makeText(getBaseContext(),GluLent,Toast.LENGTH_LONG);
                            msgEmptyDb.show();

                            cursor.close();

                            //mDb.close();

                            startActivity(startrestoActivityIntent);


                        }
                        else msgEmptyField.show();



                    }
                });

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
