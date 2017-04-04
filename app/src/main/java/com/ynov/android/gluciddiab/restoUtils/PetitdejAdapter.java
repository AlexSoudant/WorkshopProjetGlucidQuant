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

public class PetitdejAdapter extends BaseAdapter {

    private Context mContext;

    public PetitdejAdapter(Context c) {
        mContext = c;
    }

    public int getCount() {
        return mPetitdejIds.length;
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

        imageView.setImageResource(mPetitdejIds[position]);
        return imageView;
    }


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




}
