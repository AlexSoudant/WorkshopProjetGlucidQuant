package com.ynov.android.gluciddiab.panierUtils;

/**
 * Created by admin on 02/04/17.
 */

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import com.ynov.android.gluciddiab.R;
//import com.ynov.android.gluciddiab.calculUtils.Panier;

import java.util.Arrays;
import java.util.stream.*;

public class CustomListView extends ArrayAdapter<String>{

    private final Activity context;
    private final String[] textName;
    private final int[] textGR;
    private final int[] textGL;
    private final double[] textGRActuel;
    private final double[] textGLActuel;
    private TextView textViewGR;
    private TextView textViewGL;
    private ProgressBar mProgressBar1;
    private ProgressBar mProgressBar2;
    private Switch mSwitch;

    public CustomListView(Activity context,
                          String[] textName, int[] textGR,int[] textGL,
                          ProgressBar mProgressBar1,ProgressBar mProgressBar2,TextView textViewGL,TextView textViewGR) {
        super(context, R.layout.row_list, textName);
        this.context = context;
        this.textName = textName;
        this.textGR = textGR;
        this.textGL = textGL;
        this.mProgressBar1=mProgressBar1;
        this.mProgressBar2=mProgressBar2;
        int num= textGL.length;
        this.textGLActuel= new double[num];
        this.textGRActuel=new double[num];
        this.textViewGL = textViewGL;
        this.textViewGR = textViewGR;

    }
    @Override
    public View getView(final int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView= inflater.inflate(R.layout.row_list, null, true);
        TextView txtTitle = (TextView) rowView.findViewById(R.id.textViewName);
        TextView txtTitle1 = (TextView) rowView.findViewById(R.id.textViewGL);
        TextView txtTitle2 = (TextView) rowView.findViewById(R.id.textViewGR);
        final RadioGroup radio = (RadioGroup) rowView.findViewById(R.id.radioP);
        mSwitch= (Switch)rowView.findViewById(R.id.toggle1);
        txtTitle.setText(textName[position]);
        txtTitle1.setText("glucide rapide: "+textGR[position]+"g");
        txtTitle2.setText("glucide lent: "+ textGL[position]+"g");
        textGLActuel[position]=(textGL[position]*(1));
        textGRActuel[position]=(textGR[position]*(1));
        int i = 0;
        double sum=0;
        while(i < textGLActuel.length) {
            sum += textGLActuel[i];
            i++;
        }
        textViewGL.setText("Total de glucide lente:"+ sum+"g");
        mProgressBar1.setProgress((int)(sum));
        i = 0;
        sum=0;
        while(i < textGRActuel.length) {
            sum += textGRActuel[i];
            i++;
        }

        textViewGR.setText("Total de glucide rapide:"+sum+"g");
        mProgressBar2.setProgress((int)(sum));

        mSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(!isChecked){
                    for (int i = 0; i < radio.getChildCount(); i++) {
                        radio.getChildAt(i).setEnabled(false);
                    }
                    textGLActuel[position]=0;
                    textGRActuel[position]=0;
                    int i = 0;
                    double sum=0;
                    while(i < textGLActuel.length) {
                        sum += textGLActuel[i];
                        i++;
                    }
                    textViewGL.setText("Total de glucide lente:"+ sum+"g");
                    mProgressBar1.setProgress((int)(sum));
                    i = 0;
                    sum=0;
                    while(i < textGRActuel.length) {
                        sum += textGRActuel[i];
                        i++;
                    }

                    textViewGR.setText("Total de glucide rapide:"+sum+"g");
                    mProgressBar2.setProgress((int)(sum));
                }else{
                    for (int i = 0; i < radio.getChildCount(); i++) {
                        radio.getChildAt(i).setEnabled(true);
                    }
                    switch (radio.getCheckedRadioButtonId()){
                        case R.id.radioP_1:
                            textGLActuel[position]=(textGL[position]*(0.25));
                            textGRActuel[position]=(textGR[position]*(0.25));
                            break;
                        case R.id.radioP_2:
                            textGLActuel[position]=(textGL[position]*(0.5));
                            textGRActuel[position]=(textGR[position]*(0.5));
                            break;
                        case R.id.radioP_3:
                            textGLActuel[position]=(textGL[position]*(0.75));
                            textGRActuel[position]=(textGR[position]*(0.75));
                            break;
                        case R.id.radioP_4:
                            textGLActuel[position]=(textGL[position]*(1));
                            textGRActuel[position]=(textGR[position]*(1));
                            break;
                        default:
                            break;
                    }
                    int i = 0;
                    double sum=0;
                    while(i < textGLActuel.length) {
                        sum += textGLActuel[i];
                        i++;
                    }
                    textViewGL.setText("Total de glucide lente:"+ sum+"g");
                    mProgressBar1.setProgress((int)(sum));
                    i = 0;
                    sum=0;
                    while(i < textGRActuel.length) {
                        sum += textGRActuel[i];
                        i++;
                    }

                    textViewGR.setText("Total de glucide rapide:"+sum+"g");
                    mProgressBar2.setProgress((int)(sum));
                }
            }
        });

        radio.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.radioP_1:
                        // mProgressBar1.setProgress((int)(mProgressBar1.getProgress()-textGLActuel[position]+textGL[position]*(0.25)));
                        //mProgressBar2.setProgress((int)(mProgressBar2.getProgress()-textGRActuel[position]+textGR[position]*(0.25)));
                        textGLActuel[position]=(textGL[position]*(0.25));
                        textGRActuel[position]=(textGR[position]*(0.25));
                        break;
                    case R.id.radioP_2:
                        //mProgressBar1.setProgress((int)(mProgressBar1.getProgress()-textGLActuel[position]+textGL[position]*(0.5)));
                        //mProgressBar2.setProgress((int)(mProgressBar2.getProgress()-textGRActuel[position]+textGR[position]*(0.5)));
                        textGLActuel[position]=(textGL[position]*(0.5));
                        textGRActuel[position]=(textGR[position]*(0.5));
                        break;
                    case R.id.radioP_3:
                        //mProgressBar1.setProgress((int)(mProgressBar1.getProgress()-textGLActuel[position]+textGL[position]*(0.75)));
                        // mProgressBar2.setProgress((int)(mProgressBar2.getProgress()-textGRActuel[position]+textGR[position]*(0.75)));
                        textGLActuel[position]=(textGL[position]*(0.75));
                        textGRActuel[position]=(textGR[position]*(0.75));
                        break;
                    case R.id.radioP_4:
                        //mProgressBar1.setProgress((int)(mProgressBar1.getProgress()-textGLActuel[position]+textGL[position]*(1)));
                        //mProgressBar2.setProgress((int)(mProgressBar2.getProgress()-textGRActuel[position]+textGR[position]*(1)));
                        textGLActuel[position]=(textGL[position]*(1));
                        textGRActuel[position]=(textGR[position]*(1));
                        break;
                    default:
                        break;
                }
                int i = 0;
                double sum=0;
                while(i < textGLActuel.length) {
                    sum += textGLActuel[i];
                    i++;
                }
                textViewGL.setText("Total de glucide lente:"+ sum+"g");
                mProgressBar1.setProgress((int)(sum));
                i = 0;
                sum=0;
                while(i < textGRActuel.length) {
                    sum += textGRActuel[i];
                    i++;
                }

                textViewGR.setText("Total de glucide rapide:"+sum+"g");
                mProgressBar2.setProgress((int)(sum));
            }
        });

        return rowView;
    }
}
