package com.ynov.android.gluciddiab.restoUtils;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import com.ynov.android.gluciddiab.R;

import java.util.List;

/**
 * Created by admin on 01/04/17.
 */

public class ImageAdapter extends BaseAdapter {

    private Context mContext;

    private List<String> categoryList;

    public ImageAdapter(Context c) {
        mContext = c;
    }

    public int getCount() {
        return mThumbIds.length;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    // create a new ImageView for each item referenced by the Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        if (convertView == null) {
            // if it's not recycled, initialize some attributes
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(85, 85));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(8, 8, 8, 8);
        } else {
            imageView = (ImageView) convertView;
        }

        imageView.setImageResource(mThumbIds[position]);
        return imageView;
    }

/*
    @Override
    public View getDropDownView(int position, View convertView,
                                ViewGroup parent) {
        TextView view = new TextView(mContext);
        //view.setText(categoryList.get(position).getCategory());

        return view;
    }*/


    // ref to sandwichs
    private Integer[] mSandwichIds = {
        R.drawable.mcdobigmac,R.drawable.mcdoroyaldeluxe,
            R.drawable.mcdoroyalbacon, R.drawable.mcdoroyalcheese,
            R.drawable.mcdodoublecheese,R.drawable.mcdohamburger,
            R.drawable.mcdocheeseburger,R.drawable.mcdomcchicken,
            R.drawable.mcdochickenmcnuggetsquatre,R.drawable.mcdochickenmcnuggetssix,
            R.drawable.mcdochickenmcnuggetsneuf,R.drawable.mcdochickenmcnuggetsvingt,
            R.drawable.mcdomcfish,R.drawable.mcdofiletofish,
            R.drawable.mcdocroquemcdo,R.drawable.nopicture,
            R.drawable.mcdomcwrappouletcrudites,R.drawable.mcdom,
            R.drawable.mcdombacon,R.drawable.mcdomcwrappouletbacon,R.drawable.mcdomcwrappouletcroustillantpoivre,
            R.drawable.mcdoptitranchwrap,R.drawable.nopicture
    };

    // ref to accompagnements
    private Integer[] mAccompagnementIds = {
            R.drawable.mcdopetitefrite,R.drawable.mcdomoyennefrite,
            R.drawable.mcdograndefrite,R.drawable.mcdomoyennepotatoes,
            R.drawable.mcdograndepotatoes,R.drawable.mcdoptitesalade,
            R.drawable.mcdoptitetomates
    };

    // ref to boissons
    private Integer[] mBoissonsIds = {
            R.drawable.mcdococacolalightquarantecl,
            R.drawable.mcdococacolalightquarantecl,R.drawable.mcdococacolazeroquarantecl,
            R.drawable.mcdospritequarantecl,R.drawable.mcdofantaquarantecl,
            R.drawable.mcdothelipton,R.drawable.mcdominutemaidtrentecl,
            R.drawable.mcdobadoittrentetroiscl,R.drawable.mcdoeviantrentetroiscl,
            R.drawable.mcdococacolavinigtcinqcl,R.drawable.mcdococacolalightvingtcinqcl,
            R.drawable.mcdococacolazerovingtcinqcl,R.drawable.mcdospritevingtcinqcl,
            R.drawable.mcdofantavingtcinqcl,R.drawable.mcdothelipton,
            R.drawable.mcdominutemaidvingtcl,R.drawable.mcdoeviantrentetroiscl,
            R.drawable.mcdoptitjusbiovingtcl
    };

    // ref to salades
    private Integer[] mSaladeIds = {
            R.drawable.mcdosaladecaesar,
            R.drawable.mcdosaladepatemozza,R.drawable.nopicture
    };

    private Integer[] mDessertIds = {
            R.drawable.mcdosundaenappagesaveurcaramel,
            R.drawable.mcdosundaenappagesaveurchocolat,R.drawable.mcdofrappemyrtilleframboise,
            R.drawable.mcdofrappemanguefraise,R.drawable.mcdofrappepistache,
            R.drawable.mcdofrappevanillefraise,R.drawable.mcdoveryparfaitfraise,
            R.drawable.mcdoveryparfaitcaramel,R.drawable.mcdoveryparfaitchocolat,
            R.drawable.mcdomcflurryoreo,R.drawable.mcdomcflurrydaim,
            R.drawable.mcdomcflurrykitkat,R.drawable.mcdomcflurrymms,
            R.drawable.nopicture,R.drawable.nopicture,
            R.drawable.nopicture,R.drawable.kfcmuffin,
            R.drawable.mcdomandise,R.drawable.mcdobrownie,
            R.drawable.mcdocookie,R.drawable.mcdoptitepoire,
            R.drawable.mcdoptitepomme,R.drawable.mcdoananasacroquer,
            R.drawable.mcdoberlingotpommebanane,R.drawable.mcdoberlingopomme,
            R.drawable.mcdobioaboirebanane,R.drawable.mcdobioaboirefraise
    };


    // ref to petit dej
    private Integer[] mPetitdejIds = {
            R.drawable.mcdobacconeggmcmuffin,R.drawable.mcdopancakes,
            R.drawable.nopicture,R.drawable.mcdomuffinchocolat,
            R.drawable.nopicture,R.drawable.mcdograndcafesagafredo,
            R.drawable.mcdothelipton,R.drawable.mcdocafeexpressosegafredo,
            R.drawable.mcdoristretto,R.drawable.nopicture,
            R.drawable.nopicture,R.drawable.nopicture,
            R.drawable.mcdoconfitureabricot,R.drawable.mcdominutemaidvingtcl,
            R.drawable.mcdocappucino,R.drawable.mcdocappucinodaim,
            R.drawable.mcdodoublelatte,R.drawable.nopicture,
            R.drawable.mcdoptitepomme
    };



    // references to our images
    private Integer[] mThumbIds = {
            R.drawable.mcdobigmac,R.drawable.mcdoroyaldeluxe,
            R.drawable.mcdoroyalbacon,R.drawable.mcdoroyalcheese,
            R.drawable.mcdodoublecheese,R.drawable.mcdohamburger,
            R.drawable.mcdocheeseburger,R.drawable.mcdomcchicken,
            R.drawable.mcdochickenmcnuggetsquatre,R.drawable.mcdochickenmcnuggetssix,
            R.drawable.mcdochickenmcnuggetsneuf,R.drawable.mcdochickenmcnuggetsvingt,
            R.drawable.mcdomcfish,R.drawable.mcdofiletofish,
            R.drawable.mcdocroquemcdo,R.drawable.nopicture,
            R.drawable.mcdomcwrappouletcrudites,R.drawable.mcdom,
            R.drawable.mcdombacon,R.drawable.mcdomcwrappouletbacon,R.drawable.mcdomcwrappouletcroustillantpoivre,
            R.drawable.mcdoptitranchwrap,R.drawable.nopicture,
            R.drawable.mcdopetitefrite,R.drawable.mcdomoyennefrite,
            R.drawable.mcdograndefrite,R.drawable.mcdomoyennepotatoes,
            R.drawable.mcdograndepotatoes,R.drawable.mcdoptitesalade,
            R.drawable.mcdoptitetomates,R.drawable.mcdococacolalightquarantecl,
            R.drawable.mcdococacolalightquarantecl,R.drawable.mcdococacolazeroquarantecl,
            R.drawable.mcdospritequarantecl,R.drawable.mcdofantaquarantecl,
            R.drawable.mcdothelipton,R.drawable.mcdominutemaidtrentecl,
            R.drawable.mcdobadoittrentetroiscl,R.drawable.mcdoeviantrentetroiscl,
            R.drawable.mcdococacolavinigtcinqcl,R.drawable.mcdococacolalightvingtcinqcl,
            R.drawable.mcdococacolazerovingtcinqcl,R.drawable.mcdospritevingtcinqcl,
            R.drawable.mcdofantavingtcinqcl,R.drawable.mcdothelipton,
            R.drawable.mcdominutemaidvingtcl,R.drawable.mcdoeviantrentetroiscl,
            R.drawable.mcdoptitjusbiovingtcl,R.drawable.mcdosaladecaesar,
            R.drawable.mcdosaladepatemozza,R.drawable.nopicture,
            R.drawable.mcdosundaenappagesaveurcaramel,R.drawable.mcdobacconeggmcmuffin,
            R.drawable.mcdopancakes,R.drawable.nopicture,
            R.drawable.mcdomuffinchocolat,R.drawable.nopicture,
            R.drawable.mcdograndcafesagafredo,R.drawable.mcdothelipton,
            R.drawable.mcdocafeexpressosegafredo,R.drawable.mcdoristretto,
            R.drawable.nopicture,R.drawable.nopicture,
            R.drawable.nopicture

    };

}
