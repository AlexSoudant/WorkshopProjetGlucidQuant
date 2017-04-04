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

public class AccompagnementAdapter extends BaseAdapter {

    private Context mContext;

    public AccompagnementAdapter(Context c) {
        mContext = c;
    }

    public int getCount() {
        return mAccompagnementIds.length;
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

        imageView.setImageResource(mAccompagnementIds[position]);
        return imageView;
    }


    // ref to accompagnements
    private Integer[] mAccompagnementIds = {
            R.drawable.mcdopetitefrite,R.drawable.mcdomoyennefrite,
            R.drawable.mcdograndefrite,R.drawable.mcdomoyennepotatoes,
            R.drawable.mcdograndepotatoes,R.drawable.mcdoptitesalade,
            R.drawable.mcdoptitetomates
    };



}
