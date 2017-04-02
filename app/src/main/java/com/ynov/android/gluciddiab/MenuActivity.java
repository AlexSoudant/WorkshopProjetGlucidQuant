package com.ynov.android.gluciddiab;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.TextView;

import com.ynov.android.gluciddiab.restoUtils.ImageAdapter;

import java.util.ArrayList;

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

    // Panier

    TextView tvPanier;
    Button btnValid;
    ListView lvPanier;

    // gestion des popups
    //PopupWindow pw;
    //Button fabButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        tvPanier = (TextView) findViewById(R.id.textPanier);
        btnValid = (Button) findViewById(R.id.buttonValidPanier);
        lvPanier = (ListView) findViewById(R.id.listViewPanier);
        // popup window
        //popUpWindow = new PopupWindow(this);

        //fabButton = (Button) findViewById(R.id.buttonPopUp);
        //fabButton.setOnClickListener(new View.OnClickListener() {
        //    @Override
        //    public void onClick(final View v) {
        //        initiatePopupWindow(v);
        //    }
        //});

        // GridView
        GridView gridview = (GridView) findViewById(R.id.gridviewItems);

        gridview.setAdapter(new ImageAdapter(this));

        final ArrayList<String> ArrayPanier = new ArrayList<String>();

        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {
                //Toast.makeText(MenuActivity.this, "" + fakedata[position],
                //        Toast.LENGTH_SHORT).show();
                //tvPanier.append("\n" + "1x" + fakedata[position]);

                ArrayPanier.add("1x " + fakedata[position]);

                //menuListAdapter adapter = new menuListAdapter(MenuActivity.this, ArrayPanier);

                ArrayAdapter<String> adapter = new ArrayAdapter<String>(MenuActivity.this,android.R.layout.simple_list_item_1,ArrayPanier);
                lvPanier.setAdapter(adapter);

            }
        });

        final Context context = MenuActivity.this;

        btnValid.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {


                Class destinationActivity = PanierActivity.class;

                Intent startPanierActivityIntent = new Intent(context, destinationActivity);

                startActivity(startPanierActivityIntent);


            }
        });

    }

    /*private void initiatePopupWindow(View v) {
        try {
            //We need to get the instance of the LayoutInflater, use the context of this activity
            LayoutInflater inflater = (LayoutInflater) MenuActivity.this
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            //Inflate the view from a predefined XML layout
            View layout = inflater.inflate(R.layout.activity_menu,
                    (RelativeLayout) findViewById(R.id.menu_layout));
            // create a 300px width and 470px height PopupWindow
            pw = new PopupWindow(layout, WindowManager.LayoutParams.MATCH_PARENT, WindowManager.LayoutParams.MATCH_PARENT, true);
            // display the popup in the center
            pw.showAtLocation(v, Gravity.CENTER, 0, 0);

            TextView mResultText = (TextView) layout.findViewById(R.id.server_status_text);
            Button cancelButton = (Button) layout.findViewById(R.id.end_data_send_button);
            cancelButton.setOnClickListener(cancel_button_click_listener);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
*/
    //private View.OnClickListener cancel_button_click_listener = new View.OnClickListener() {
    //    public void onClick(View v) {
    //        pw.dismiss();
    //    }
    //};
}
