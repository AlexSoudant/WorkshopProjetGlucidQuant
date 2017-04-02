package com.ynov.android.gluciddiab;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnProtocoleTransition;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnProtocoleTransition = (Button) findViewById(R.id.buttonProtocoleTransition);

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
}
