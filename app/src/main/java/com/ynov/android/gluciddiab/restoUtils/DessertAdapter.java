package com.ynov.android.gluciddiab.restoUtils;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import com.ynov.android.gluciddiab.R;

/**
 * Created by admin on 01/04/17.
 */

public class DessertAdapter extends BaseAdapter {

    private Context mContext;

    public DessertAdapter(Context c) {
        mContext = c;
    }

    public int getCount() {
        return mDessertIds.length;
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

        imageView.setImageResource(mDessertIds[position]);
        return imageView;
    }

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




}
