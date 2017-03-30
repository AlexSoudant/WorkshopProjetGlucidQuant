package com.ynov.android.gluciddiab;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by admin on 30/03/17.
 */

public class ProtocoleActivity {

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
