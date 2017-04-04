package com.ynov.android.gluciddiab.panierUtils;

/**
 * Created by admin on 02/04/17.
 */

import android.app.Activity;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.ProgressBar;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;

import com.ynov.android.gluciddiab.R;

import java.util.ArrayList;

//import com.ynov.android.gluciddiab.calculUtils.Panier;

public class CustomListView extends ArrayAdapter<String>{

    private final Activity context;
    private final ArrayList<String>  textName;
    private final ArrayList<String> textGR;
    private final ArrayList<String> textGL;
    private final double[] textGRActuel;
    private final double[] textGLActuel;
    private TextView textViewGR;
    private TextView textViewGL;
    private ProgressBar mProgressBar1;
    private ProgressBar mProgressBar2;
    private Switch mSwitch;

    public CustomListView(Activity context,
                          ArrayList<String>  textName, ArrayList<String> textGR,ArrayList<String> textGL,
                          ProgressBar mProgressBar1,ProgressBar mProgressBar2,TextView textViewGL,TextView textViewGR) {
        super(context, R.layout.row_list, textName);
        this.context = context;
        this.textName = textName;
        this.textGR = textGR;
        this.textGL = textGL;
        this.mProgressBar1=mProgressBar1;
        this.mProgressBar2=mProgressBar2;
        int num= textGL.size();
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
        txtTitle.setText(textName.get(position));
        txtTitle1.setText("glucide rapide: "+textGR.get(position)+"g");
        txtTitle2.setText("glucide lent: "+ textGL.get(position)+"g");
        textGLActuel[position]=(Integer.parseInt(textGL.get(position))*(1));
        textGRActuel[position]=(Integer.parseInt(textGR.get(position))*(1));
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

                    //change couleur si max
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
                }else{
                    for (int i = 0; i < radio.getChildCount(); i++) {
                        radio.getChildAt(i).setEnabled(true);
                    }
                    switch (radio.getCheckedRadioButtonId()){
                        case R.id.radioP_1:
                            textGLActuel[position]=(Integer.parseInt(textGL.get(position))*(0.25));
                            textGRActuel[position]=(Integer.parseInt(textGR.get(position))*(0.25));
                            break;
                        case R.id.radioP_2:
                            textGLActuel[position]=(Integer.parseInt(textGL.get(position))*(0.5));
                            textGRActuel[position]=(Integer.parseInt(textGR.get(position))*(0.5));
                            break;
                        case R.id.radioP_3:
                            textGLActuel[position]=(Integer.parseInt(textGL.get(position))*(0.75));
                            textGRActuel[position]=(Integer.parseInt(textGR.get(position))*(0.75));
                            break;
                        case R.id.radioP_4:
                            textGLActuel[position]=(Integer.parseInt(textGL.get(position))*(1));
                            textGRActuel[position]=(Integer.parseInt(textGR.get(position))*(1));
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
                    //change couleur si max
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
            }
        });

        radio.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.radioP_1:
                        // mProgressBar1.setProgress((int)(mProgressBar1.getProgress()-textGLActuel[position]+textGL[position]*(0.25)));
                        //mProgressBar2.setProgress((int)(mProgressBar2.getProgress()-textGRActuel[position]+textGR[position]*(0.25)));
                        textGLActuel[position]=(Integer.parseInt(textGL.get(position))*(0.25));
                        textGRActuel[position]=(Integer.parseInt(textGR.get(position))*(0.25));
                        break;
                    case R.id.radioP_2:
                        //mProgressBar1.setProgress((int)(mProgressBar1.getProgress()-textGLActuel[position]+textGL[position]*(0.5)));
                        //mProgressBar2.setProgress((int)(mProgressBar2.getProgress()-textGRActuel[position]+textGR[position]*(0.5)));
                        textGLActuel[position]=(Integer.parseInt(textGL.get(position))*(0.5));
                        textGRActuel[position]=(Integer.parseInt(textGR.get(position))*(0.5));
                        break;
                    case R.id.radioP_3:
                        //mProgressBar1.setProgress((int)(mProgressBar1.getProgress()-textGLActuel[position]+textGL[position]*(0.75)));
                        // mProgressBar2.setProgress((int)(mProgressBar2.getProgress()-textGRActuel[position]+textGR[position]*(0.75)));
                        textGLActuel[position]=(Integer.parseInt(textGL.get(position))*(0.75));
                        textGRActuel[position]=(Integer.parseInt(textGR.get(position))*(0.75));
                        break;
                    case R.id.radioP_4:
                        //mProgressBar1.setProgress((int)(mProgressBar1.getProgress()-textGLActuel[position]+textGL[position]*(1)));
                        //mProgressBar2.setProgress((int)(mProgressBar2.getProgress()-textGRActuel[position]+textGR[position]*(1)));
                        textGLActuel[position]=(Integer.parseInt(textGL.get(position))*(1));
                        textGRActuel[position]=(Integer.parseInt(textGR.get(position))*(1));
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
                //change couleur si max
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
        });

        //initialisation couleur des progressBar
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
        return rowView;
    }

    public double[] getGluActuelle(){
        int i = 0;
        double sum=0;
        while(i < textGLActuel.length) {
            sum += textGLActuel[i];
            i++;
        }
        i = 0;
        double sum2=0;
        while(i < textGRActuel.length) {
            sum2 += textGRActuel[i];
            i++;
        }
        double[] res= new double[]{sum,sum2};
        return res;
    }
}
