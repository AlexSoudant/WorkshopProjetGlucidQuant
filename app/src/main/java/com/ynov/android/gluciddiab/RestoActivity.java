package com.ynov.android.gluciddiab;

import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
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
    CardView cvMcDo;
    CardView cvKFC;

    Button breakFast;
    Button lunch;
    Button snack;
    Button meal;

    private SQLiteDatabase mDb;
    private Toolbar toolbar;

    String MealTime;
    String RestoChoice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resto);

        toolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);

        MealTime = "";

        //btnTestDb = (Button) findViewById(R.id.buttonTestDb);

        cvMcDo = (CardView) findViewById(R.id.cardViewMcdo);
        cvKFC = (CardView) findViewById(R.id.cardViewKfc);

        cvMcDo.setOnClickListener(new View.OnClickListener()
        {
            Context context = RestoActivity.this;

            Class destinationActivity = MenuActivity.class;



            Intent startmenuActivityIntent = new Intent(context, destinationActivity);

            public void onClick(View view)
            {
                //String MealTime = "matin";
                if (!MealTime.equals("")) {

                    RestoChoice = "McDo";
                    Bundle extras = new Bundle();
                    extras.putString("EXTRA_RESTO",RestoChoice);
                    extras.putString("EXTRA_MEAL",MealTime);
                    startmenuActivityIntent.putExtras(extras);
                    startActivity(startmenuActivityIntent);
                }else{Toast.makeText(RestoActivity.this, "Choisis d'abord ton repas", Toast.LENGTH_SHORT).show();}
            }
        });

        cvKFC.setOnClickListener(new View.OnClickListener()
        {
            Context context = RestoActivity.this;

            Class destinationActivity = MenuActivity.class;

            Intent startmenuActivityIntent = new Intent(context, destinationActivity);

            public void onClick(View view)
            {

                if (!MealTime.equals("")) {
                    RestoChoice = "KFC";
                    Bundle extras = new Bundle();
                    extras.putString("EXTRA_RESTO",RestoChoice);
                    extras.putString("EXTRA_MEAL",MealTime);
                    startmenuActivityIntent.putExtras(extras);

                    startActivity(startmenuActivityIntent);
                }else{Toast.makeText(RestoActivity.this, "Choisis d'abord ton repas", Toast.LENGTH_SHORT).show();}

            }
        });

/*        btnTestDb.setOnClickListener(new View.OnClickListener()
        {
            Context context = RestoActivity.this;

            Class destinationActivity = MenuActivity.class;

            Intent startmenuActivityIntent = new Intent(context, destinationActivity);

            public void onClick(View view)
            {
                startActivity(startmenuActivityIntent);

            }
        });*/

        breakFast = (Button) findViewById(R.id.buttonBreakFast);
        lunch = (Button) findViewById(R.id.buttonLunch);
        snack = (Button) findViewById(R.id.buttonSnack);
        meal = (Button) findViewById(R.id.buttonMeal);

        breakFast.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                breakFast.setPressed(true);
                lunch.setPressed(false);
                snack.setPressed(false);
                meal.setPressed(false);
                MealTime = "matin";
                return true;


            }
        });

        lunch.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                breakFast.setPressed(false);
                lunch.setPressed(true);
                snack.setPressed(false);
                meal.setPressed(false);
                MealTime = "midi";
                return true;
            }
        });

        snack.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                breakFast.setPressed(false);
                lunch.setPressed(false);
                snack.setPressed(true);
                meal.setPressed(false);
                MealTime = "gouter";
                return true;
            }
        });

        meal.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                breakFast.setPressed(false);
                lunch.setPressed(false);
                snack.setPressed(false);
                meal.setPressed(true);
                MealTime = "soir";
                return true;
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
