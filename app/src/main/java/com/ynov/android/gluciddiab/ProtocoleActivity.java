package com.ynov.android.gluciddiab;

import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

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
    TextView glucideText;

    Button btnProtocoleValidate;

    private SQLiteDatabase mDb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_protocole);

        ProtocoleGlucidesDbHelper dbHelper = new ProtocoleGlucidesDbHelper(this);
        mDb = dbHelper.getWritableDatabase();

        protocoleTitle = (TextView) findViewById(R.id.textViewProtocoleTitle);

        glucideText = (TextView) findViewById(R.id.textGlucides);

        matinGlucideLent = (EditText) findViewById(R.id.editTextMatinLent);

        matinGlucideRapide = (EditText) findViewById(R.id.editTextMatinRapide);

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

                        if (!matinGlucideLent.getText().toString().equals("") && !matinGlucideRapide.getText().toString().equals("")) {
                            startActivity(startrestoActivityIntent);

                            String QueryMatinGluLent = matinGlucideLent.getText().toString();
                            String QueryMatinGluRapide = matinGlucideRapide.getText().toString();

                            String query = "INSERT INTO protocoleglucidesdata (glulent,glurapide) VALUES('" + QueryMatinGluLent + "', '" + QueryMatinGluRapide + "');";

                            mDb.execSQL(query);
                        }
                        else msgEmptyField.show();
                        


                    }
                });





    }


}
