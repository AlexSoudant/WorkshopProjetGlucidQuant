package com.ynov.android.gluciddiab;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.TextView;

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_protocole);

        matinGlucideLent = (EditText) findViewById(R.id.editTextMatinLent);
    }


}
