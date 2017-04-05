package com.ynov.android.gluciddiab;

/**
 * Created by admin on 02/04/17.
 */

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.TextView;

import com.ynov.android.gluciddiab.dataUtils.ProtocoleGlucidesDbHelper;
import com.ynov.android.gluciddiab.panierUtils.CustomListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by romain on 31/03/2017.
 */


public class PanierActivity extends AppCompatActivity {
    ListView mListView;
    private ProgressBar mProgressBar1;
    private ProgressBar mProgressBar2;
    private TextView textTGR;
    private TextView textTGL;
    private TextView textMaxTGR;
    private TextView textMaxTGL;
    private RadioButton mRadio;
    private List<String> protocoles;
    private CustomListView adapter;

    private Toolbar toolbar;
    /*String[] prenoms = new String[]{
            "Big Mac Maxi", "frite Maxi", "coca-cola", "sunday"
    };
    int[] gr = new int[]{
            2, 3, 4, 3
    };
    int[] gl = new int[]{
            6,7,5,6
    };*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.panier);

        toolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);

        Intent intentThatStartedThisActivity = getIntent();

        Bundle extras = intentThatStartedThisActivity.getExtras();
        final String mealTime = extras.getString("EXTRA_MEAL");
        final ArrayList<String> prenoms = extras.getStringArrayList("EXTRA_MENU");
        final ArrayList<String> gl = extras.getStringArrayList("EXTRA_GLULENT");
        final ArrayList<String> gr = extras.getStringArrayList("EXTRA_GLURAPIDE");

        //recuperation des protocols
        ProtocoleGlucidesDbHelper db = new ProtocoleGlucidesDbHelper(this);
        if(mealTime.equals("matin")){
            protocoles= db.getProtocole(0);
        }else if(mealTime.equals("midi")){
            protocoles= db.getProtocole(1);
        }else if(mealTime.equals("gouter")){
            protocoles= db.getProtocole(2);
        }else if(mealTime.equals("soir")){
            protocoles= db.getProtocole(3);
        }

        mProgressBar1 = (ProgressBar) findViewById(R.id.pGL);
        mProgressBar1.setMax(Integer.parseInt(protocoles.get(1)));
        mProgressBar2 = (ProgressBar) findViewById(R.id.pGR);
        mProgressBar2.setMax(Integer.parseInt(protocoles.get(2)));
        textTGL = (TextView) findViewById(R.id.textTGL);
        textTGR = (TextView) findViewById(R.id.textTGR);
        textMaxTGL = (TextView) findViewById(R.id.textMaxTGL);
        textMaxTGR = (TextView) findViewById(R.id.textMaxTGR);
        adapter = new
                CustomListView(PanierActivity.this,prenoms,gr,gl,mProgressBar1,mProgressBar2,textTGL,textTGR);
        mListView = (ListView) findViewById(R.id.listView);
        mListView.setAdapter(adapter);

        textMaxTGL.setText("Max "+Integer.parseInt(protocoles.get(1))+"g");
        textMaxTGR.setText("Max "+Integer.parseInt(protocoles.get(2))+"g");

        mRadio = (RadioButton) findViewById(R.id.radio_1);
        mRadio.setChecked(true);

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                //Toast.makeText(PanierActivity.this, "You Clicked at " +prenoms[+ position], Toast.LENGTH_SHORT).show();

            }
        });
    }
    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();


        double[] totalGlu=adapter.getGluActuelle();
        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radio_1:
                if (checked)
                    mProgressBar1.setMax((int)(Integer.parseInt(protocoles.get(1))*1));
                mProgressBar2.setMax((int)(Integer.parseInt(protocoles.get(2))*1));
                textMaxTGL.setText("Max "+Integer.parseInt(protocoles.get(1))*1+"g");
                textMaxTGR.setText("Max "+Integer.parseInt(protocoles.get(2))*1+"g");
                mProgressBar1.setProgress((int)totalGlu[0]);
                mProgressBar2.setProgress((int)totalGlu[1]);
                break;
            case R.id.radio_2:
                if (checked)
                    mProgressBar1.setMax((int)(Integer.parseInt(protocoles.get(1))*1.5));
                mProgressBar2.setMax((int)(Integer.parseInt(protocoles.get(2))*1.5));
                textMaxTGL.setText("Max "+Integer.parseInt(protocoles.get(1))*1.5+"g");
                textMaxTGR.setText("Max "+Integer.parseInt(protocoles.get(2))*1.5+"g");
                mProgressBar1.setProgress((int)totalGlu[0]);
                mProgressBar2.setProgress((int)totalGlu[1]);
                break;
            case R.id.radio_3:
                if (checked)
                    mProgressBar1.setMax((int)(Integer.parseInt(protocoles.get(1))*2));
                mProgressBar2.setMax((int)(Integer.parseInt(protocoles.get(2))*2));
                textMaxTGL.setText("Max "+Integer.parseInt(protocoles.get(1))*2+"g");
                textMaxTGR.setText("Max "+Integer.parseInt(protocoles.get(2))*2+"g");
                mProgressBar1.setProgress((int)totalGlu[0]);
                mProgressBar2.setProgress((int)totalGlu[1]);
                break;
            case R.id.radio_4:
                if (checked)
                    mProgressBar1.setMax((int)(Integer.parseInt(protocoles.get(1))*3));
                mProgressBar2.setMax((int)(Integer.parseInt(protocoles.get(2))*3));
                textMaxTGL.setText("Max "+Integer.parseInt(protocoles.get(1))*3+"g");
                textMaxTGR.setText("Max "+Integer.parseInt(protocoles.get(2))*3+"g");
                mProgressBar1.setProgress((int)totalGlu[0]);
                mProgressBar2.setProgress((int)totalGlu[1]);
                break;
        }

        //couleur des progressBar
        int p1v=mProgressBar1.getProgress();
        int p1m=mProgressBar1.getMax();
        if(p1v ==p1m){
            mProgressBar1.getProgressDrawable().setColorFilter(Color.RED, PorterDuff.Mode.SRC_IN);
        }else{
            mProgressBar1.getProgressDrawable().setColorFilter(Color.parseColor("#00A6FF"), PorterDuff.Mode.SRC_IN);
        }
        int p2v=mProgressBar2.getProgress();
        int p2m=mProgressBar2.getMax();
        if(p2v == p2m){
            mProgressBar2.getProgressDrawable().setColorFilter(Color.RED, PorterDuff.Mode.SRC_IN);
        }else{
            mProgressBar2.getProgressDrawable().setColorFilter(Color.parseColor("#00A6FF"), PorterDuff.Mode.SRC_IN);
        }
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
                //Toast.makeText(RestoActivity.this, "Protocole" , Toast.LENGTH_SHORT).show();

                Context context = PanierActivity.this;

                Class destinationActivity = ProtocoleActivity.class;

                Intent startProtocoleActivityIntent = new Intent(context, destinationActivity);

                startActivity(startProtocoleActivityIntent);

                return true;
        }
        return super.onOptionsItemSelected(item);
    }



}

