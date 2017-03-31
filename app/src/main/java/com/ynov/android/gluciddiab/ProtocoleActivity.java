package com.ynov.android.gluciddiab;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_protocole);

        protocoleTitle = (TextView) findViewById(R.id.textViewProtocoleTitle);

        glucideText = (TextView) findViewById(R.id.textGlucides);

        matinGlucideLent = (EditText) findViewById(R.id.editTextMatinLent);

        btnProtocoleValidate = (Button) findViewById(R.id.buttonValidate);

        //btnProtocoleValidate.setEnabled(false);

        btnProtocoleValidate.setOnClickListener(new View.OnClickListener()
                {
                    public void onClick(View view)
                    {
                        Toast msgLoadNextPage = Toast.makeText(getBaseContext(),"chargement next page",Toast.LENGTH_LONG);
                        Toast msgEmptyField = Toast.makeText(getBaseContext(),"Champs vide!",Toast.LENGTH_LONG);

                        if (!matinGlucideLent.getText().toString().equals(""))
                            msgLoadNextPage.show();
                        else msgEmptyField.show();


                    }
                });





    }


}
