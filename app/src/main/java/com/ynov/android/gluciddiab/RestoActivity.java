package com.ynov.android.gluciddiab;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by admin on 31/03/17.
 */

public class RestoActivity extends AppCompatActivity{

    TextView restoTitle;

    Button erzrz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resto);

        restoTitle = (TextView) findViewById(R.id.textRestoTitle);



    }
}
