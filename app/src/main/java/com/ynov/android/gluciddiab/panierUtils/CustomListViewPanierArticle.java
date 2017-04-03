package com.ynov.android.gluciddiab.panierUtils;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

import com.ynov.android.gluciddiab.R;

import java.util.ArrayList;

/**
 * Created by romain on 03/04/2017.
 */

public class CustomListViewPanierArticle extends ArrayAdapter<String> {
    private final ArrayList<String> article;
    private final Activity context;
    private CustomListViewPanierArticle adapter;
    private Button mBSup;

    public CustomListViewPanierArticle(Activity context,
                                       ArrayList<String> article) {
        super(context, R.layout.item_panier, article);
        this.context = context;
        this.article=article;
    }

    @Override
    public View getView(final int position, final View view,ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView= inflater.inflate(R.layout.item_panier, null, true);
        TextView txtTitle = (TextView) rowView.findViewById(R.id.panierNomItem);
        mBSup = (Button) rowView.findViewById(R.id.panierButtonDelete);
        txtTitle.setText(article.get(position));
        adapter = new CustomListViewPanierArticle(context,article);
        View.OnClickListener myhandler1 = new View.OnClickListener() {
            public void onClick(View v) {
                article.remove(position);
                notifyDataSetChanged();
            }
        };
        mBSup.setOnClickListener(myhandler1);
        return rowView;
        }
}
