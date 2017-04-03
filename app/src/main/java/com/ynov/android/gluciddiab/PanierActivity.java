package com.ynov.android.gluciddiab;

/**
 * Created by admin on 02/04/17.
 */

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import com.ynov.android.gluciddiab.panierUtils.CustomListView;

import java.util.ArrayList;

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

    String[] prenoms = new String[]{
            "Big Mac Maxi", "frite Maxi", "coca-cola", "sunday"
    };
    int[] gr = new int[]{
            2, 3, 4, 3
    };
    int[] gl = new int[]{
            6,7,5,6
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.panier);

        Intent intentThatStartedThisActivity = getIntent();

        Bundle extras = intentThatStartedThisActivity.getExtras();
        final String mealTime = extras.getString("EXTRA_MEAL");
        final ArrayList<String> menuChoice = extras.getStringArrayList("EXTRA_MENU");
        final ArrayList<String> GluLent = extras.getStringArrayList("EXTRA_GLULENT");
        final ArrayList<String> GluRapide = extras.getStringArrayList("EXTRA_GLURAPIDE");


        mProgressBar1 = (ProgressBar) findViewById(R.id.pGL);
        mProgressBar1.setMax(15);
        mProgressBar2 = (ProgressBar) findViewById(R.id.pGR);
        mProgressBar2.setMax(10);
        textTGL = (TextView) findViewById(R.id.textTGL);
        textTGR = (TextView) findViewById(R.id.textTGR);
        textMaxTGL = (TextView) findViewById(R.id.textMaxTGL);
        textMaxTGR = (TextView) findViewById(R.id.textMaxTGR);
        CustomListView adapter = new
                CustomListView(PanierActivity.this,prenoms,gr,gl,mProgressBar1,mProgressBar2,textTGL,textTGR);
        mListView = (ListView) findViewById(R.id.listView);
        mListView.setAdapter(adapter);

        mProgressBar1 = (ProgressBar) findViewById(R.id.pGL);
        mProgressBar1.setMax(15);
        textMaxTGL.setText("Max "+15*1+"g");
        mProgressBar2 = (ProgressBar) findViewById(R.id.pGR);
        mProgressBar2.setMax(10);
        textMaxTGR.setText("Max "+10*1+"g");

        mRadio = (RadioButton) findViewById(R.id.radio_1);
        mRadio.setChecked(true);

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Toast.makeText(PanierActivity.this, "Menu: " + menuChoice + " Repas: " + mealTime + " gluLent: " + GluLent + " glurapide: " + GluRapide, Toast.LENGTH_SHORT).show();

            }
        });
    }
    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radio_1:
                if (checked)
                    mProgressBar1.setMax((int)(15*1));
                mProgressBar2.setMax((int)(10*1));
                textMaxTGL.setText("Max "+15*1+"g");
                textMaxTGR.setText("Max "+10*1+"g");
                break;
            case R.id.radio_2:
                if (checked)
                    mProgressBar1.setMax((int)(15*1.5));
                mProgressBar2.setMax((int)(10*1.5));
                textMaxTGL.setText("Max "+15*1.5+"g");
                textMaxTGR.setText("Max "+10*1.5+"g");
                break;
            case R.id.radio_3:
                if (checked)
                    mProgressBar1.setMax((int)(15*2));
                mProgressBar2.setMax((int)(10*2));
                textMaxTGL.setText("Max "+15*2+"g");
                textMaxTGR.setText("Max "+10*2+"g");
                break;
            case R.id.radio_4:
                if (checked)
                    mProgressBar1.setMax((int)(15*3));
                mProgressBar2.setMax((int)(10*3));
                textMaxTGL.setText("Max "+15*3+"g");
                textMaxTGR.setText("Max "+10*3+"g");
                break;
        }
    }
}

