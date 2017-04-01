package com.ynov.android.gluciddiab;

import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by admin on 31/03/17.
 */

public class RestoActivity extends AppCompatActivity{

    TextView restoTitle;
    TextView TestDb;
    Button btnTestDb;

    private SQLiteDatabase mDb;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resto);

        toolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);

        btnTestDb = (Button) findViewById(R.id.buttonTestDb);

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

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.item_settings:
                Toast.makeText(RestoActivity.this, "Paramètre" , Toast.LENGTH_SHORT).show();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }



}
