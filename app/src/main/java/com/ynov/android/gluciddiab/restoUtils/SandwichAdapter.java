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

public class SandwichAdapter extends BaseAdapter {

    private Context mContext;

    public SandwichAdapter(Context c) {
        mContext = c;
    }

    public int getCount() {
        return mSandwichIds.length;
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

        imageView.setImageResource(mSandwichIds[position]);
        return imageView;
    }


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



}
