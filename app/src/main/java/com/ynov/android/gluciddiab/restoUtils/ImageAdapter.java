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

public class ImageAdapter extends BaseAdapter {

    private Context mContext;

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
