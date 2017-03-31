package com.ynov.android.gluciddiab;

import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnProtocoleTransition;
    private SQLiteDatabase mDb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnProtocoleTransition = (Button) findViewById(R.id.buttonProtocoleTransition);

        btnProtocoleTransition.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                //String str = eText.getText().toString();
                Toast msg = Toast.makeText(getBaseContext(),"button clicked",Toast.LENGTH_LONG);
                msg.show();

                Context context = MainActivity.this;

                Class destinationActivity = ProtocoleActivity.class;

                Intent startProtocoleActivityIntent = new Intent(context, destinationActivity);

                startActivity(startProtocoleActivityIntent);
            }
        });

    }
}
