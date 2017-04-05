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

public class KfcImageAdapter extends BaseAdapter {

    private Context kContext;

    public KfcImageAdapter(Context c) {
        kContext = c;
    }

    public int getCount() {
        return kThumbsIds.length;
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
            imageView = new ImageView(kContext);
            imageView.setLayoutParams(new GridView.LayoutParams(85, 85));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(8, 8, 8, 8);
        } else {
            imageView = (ImageView) convertView;
        }

        imageView.setImageResource(kThumbsIds[position]);
        return imageView;
    }


    private Integer[] kThumbsIds = {
            R.drawable.kfcbuckettenders, R.drawable.kfcbuckethotwings,
            R.drawable.kfcbucketmixtendershotwings, R.drawable.kfcbucketmixtendershotwings,
            R.drawable.kfcbucketmixtendershotwings, R.drawable.kfcbucketmixorhot,
            R.drawable.kfcbucketmixorhot, R.drawable.kfcmaxibuckettenders,
            R.drawable.kfcmaxibuckethotwings, R.drawable.kfcbigbucketmixtendershotwings,
            R.drawable.kfcbigbucketmixorhot, R.drawable.kfcbigbucketmixorhot,
            R.drawable.kfckrunchy, R.drawable.kfctwistertenders,
            R.drawable.kfcbossbacon, R.drawable.kfcbrazer,
            R.drawable.kfctower, R.drawable.kfctower,
            R.drawable.kfcboxmaster, R.drawable.kfcboxmaster,
            R.drawable.kfcboxmaster, R.drawable.kfcboxmaster,
            R.drawable.kfcboxmaster, R.drawable.kfcitwist,
            R.drawable.kfcitwist, R.drawable.nopicture,
            R.drawable.kfcdoublestacker, R.drawable.kfcdoublestacker,
            R.drawable.kfcsaladecaesar, R.drawable.kfcsaladechevrenoix,
            R.drawable.kfctenders, R.drawable.kfctenders,
            R.drawable.kfctenders, R.drawable.kfcwingshot,
            R.drawable.kfcwingshot, R.drawable.kfcwingshot,
            R.drawable.kfcpiecespouletor, R.drawable.kfcpiecehot,
            R.drawable.nopicture, R.drawable.kfctomatescerises,
            R.drawable.kfccobette, R.drawable.kfcfrites,
            R.drawable.kfcfrites, R.drawable.kfcfrites,
            R.drawable.nopicture, R.drawable.kfcbigshots,
            R.drawable.kfcbigshots, R.drawable.kfcdipncrunch,
            R.drawable.nopicture, R.drawable.kfccookie,
            R.drawable.kfccookie, R.drawable.kfccookie,
            R.drawable.kfcsundaess, R.drawable.kfcptityaourtfraise,
            R.drawable.kfcandrospocket, R.drawable.kfcsundae,
            R.drawable.kfcsundaefraise, R.drawable.kfcmoelleuxchocolat,
            R.drawable.kfctiramisu, R.drawable.kfcmuffin,
            R.drawable.kfcmuffin, R.drawable.kfcmuffin,
            R.drawable.kfcmuffin, R.drawable.kfcptitflan,
            R.drawable.kfckreamballfraise, R.drawable.kfckreamballchocolat,
            R.drawable.kfckreamballcaramel, R.drawable.kfckreamballcaramel,
            R.drawable.kfcheineken, R.drawable.kfcsevenup,
            R.drawable.kfcsevenup, R.drawable.kfcsevenup,
            R.drawable.kfcsevenup, R.drawable.kfcorangina,
            R.drawable.kfcorangina, R.drawable.kfcorangina,
            R.drawable.kfcorangina, R.drawable.kfcorangina,
            R.drawable.kfclipton, R.drawable.kfclipton,
            R.drawable.kfclipton, R.drawable.kfclipton,
            R.drawable.kfclipton, R.drawable.kfcoasis,
            R.drawable.kfcoasis, R.drawable.kfcoasis,
            R.drawable.kfcoasis, R.drawable.kfcoasis,
            R.drawable.kfcpepsi, R.drawable.kfcpepsi,
            R.drawable.kfcpepsi, R.drawable.kfcpepsi,
            R.drawable.kfcpepsi, R.drawable.kfcpepsimax,
            R.drawable.kfcpepsimax, R.drawable.kfcpepsimax,
            R.drawable.kfcpepsimax, R.drawable.kfcpepsimax,
            R.drawable.kfcvittel, R.drawable.kfcvittel,
            R.drawable.kfcperrier, R.drawable.kfcperrier,
            R.drawable.kfctropicana, R.drawable.nopicture,
            R.drawable.nopicture, R.drawable.nopicture,
            R.drawable.nopicture, R.drawable.nopicture,
            R.drawable.nopicture, R.drawable.nopicture,

    };

}
