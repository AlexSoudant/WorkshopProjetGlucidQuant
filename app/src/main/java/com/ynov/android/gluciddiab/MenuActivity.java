package com.ynov.android.gluciddiab;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import com.ynov.android.gluciddiab.restoUtils.ImageAdapter;

/**
 * Created by admin on 01/04/17.
 */

public class MenuActivity extends AppCompatActivity {

    private String[] fakedata = {
            "Coca Cola",
            "Deluxe Potatoes",
            "280 Original",
            "Cheese Burger",
            "Evian",
            "Petite Frites",
            "Truc au Poulet",
            "Ketchup",
            "Muffin myrtille",
            "280 Emmental",
            "Petit Hotdog",
            "Sundae",
            "Triple cheese"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        GridView gridview = (GridView) findViewById(R.id.gridviewItems);
        gridview.setAdapter(new ImageAdapter(this));

        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {
                Toast.makeText(MenuActivity.this, "" + fakedata[position],
                        Toast.LENGTH_SHORT).show();
            }
        });




    }
}
