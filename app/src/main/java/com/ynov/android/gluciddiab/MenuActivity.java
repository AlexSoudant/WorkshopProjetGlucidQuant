package com.ynov.android.gluciddiab;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v4.util.ArraySet;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;
import com.ynov.android.gluciddiab.dataUtils.KfcContract;
import com.ynov.android.gluciddiab.dataUtils.KfcDbHelper;
import com.ynov.android.gluciddiab.dataUtils.McDoContract;
import com.ynov.android.gluciddiab.dataUtils.McDoDbHelper;
import com.ynov.android.gluciddiab.panierUtils.CustomListViewPanierArticle;
import com.ynov.android.gluciddiab.restoUtils.AccompagnementAdapter;
import com.ynov.android.gluciddiab.restoUtils.BoissonAdapter;
import com.ynov.android.gluciddiab.restoUtils.DessertAdapter;
import com.ynov.android.gluciddiab.restoUtils.ImageAdapter;
import com.ynov.android.gluciddiab.restoUtils.KfcAccompagnementAdapter;
import com.ynov.android.gluciddiab.restoUtils.KfcBoissonAdapter;
import com.ynov.android.gluciddiab.restoUtils.KfcBucketAdapter;
import com.ynov.android.gluciddiab.restoUtils.KfcDessertAdapter;
import com.ynov.android.gluciddiab.restoUtils.KfcPieceAdapter;
import com.ynov.android.gluciddiab.restoUtils.KfcSaladeAdapter;
import com.ynov.android.gluciddiab.restoUtils.KfcSandwichAdapter;
import com.ynov.android.gluciddiab.restoUtils.KfcSauceAdapter;
import com.ynov.android.gluciddiab.restoUtils.PetitdejAdapter;
import com.ynov.android.gluciddiab.restoUtils.SaladeAdapter;
import com.ynov.android.gluciddiab.restoUtils.SandwichAdapter;

import java.util.ArrayList;
import java.util.Arrays;

import static com.ynov.android.gluciddiab.R.id.spinner;


/**
 * Created by admin on 01/04/17.
 */

public class MenuActivity extends AppCompatActivity {

    private Toolbar toolbar;

    Spinner dropdown;

    String[] liste = {
            "Tous produits",
            "Boissons",
            "Sandwiches",
            "Desserts",
            "Petit Dej",
            "Accompagnements"
    };

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

    // récup depuis restoActivity
    String mealTime;
    String restoChoice;

    final Context context = this;

    SQLiteDatabase mDb;
    String ItemNames;

    String[] stringArray;
    ArrayList<String> ArrayProtoLent;
    ArrayList<String> ArrayProtoRapide;
    Cursor cursorImage;
    String imageName;

    ArrayList<String> ArrayItemNames;

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        toolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);

        Intent intentThatStartedThisActivity = getIntent();

        Bundle extras = intentThatStartedThisActivity.getExtras();
        mealTime = extras.getString("EXTRA_MEAL");
        restoChoice = extras.getString("EXTRA_RESTO");


        // Malo insert code for kfc


        // Connection a la db

        if(restoChoice.equals("McDo")) {

            McDoDbHelper dbHelper = new McDoDbHelper(this);

            mDb = dbHelper.getReadableDatabase();

            Cursor cursorProtoLent = getItem();

            cursorProtoLent.moveToFirst();

            //int i = 0;
            ArrayProtoLent = new ArrayList<String>();

            if (cursorProtoLent.moveToFirst()) {
                do {
                    ArrayProtoLent.add(cursorProtoLent.getString(cursorProtoLent.getColumnIndex(McDoContract.Entrees.GLU_LENT)));
                } while (cursorProtoLent.moveToNext());
            }

            cursorProtoLent.close();

            Cursor cursorProtoRapide = getItem();
            cursorProtoRapide.moveToFirst();

            //int i = 0;
            ArrayProtoRapide = new ArrayList<String>();

            if (cursorProtoRapide.moveToFirst()) {
                do {
                    ArrayProtoRapide.add(cursorProtoRapide.getString(cursorProtoRapide.getColumnIndex(McDoContract.Entrees.GLU_RAPIDE)));
                } while (cursorProtoRapide.moveToNext());
            }

            cursorProtoRapide.close();

            // cursor categories

            Cursor cursorCat = getItem();
            cursorCat.moveToFirst();

            //int i = 0;
            final ArrayList<String> ArrayCat = new ArrayList<String>();

            if (cursorCat.moveToFirst()) {
                do {
                    ArrayCat.add(cursorCat.getString(cursorCat.getColumnIndex(McDoContract.Entrees.CATEGORIE)));
                } while (cursorCat.moveToNext());
            }

            cursorCat.close();

            ArraySet setCat = new ArraySet(ArrayCat);
            Object[] arraySet = setCat.toArray();

            stringArray = Arrays.copyOf(arraySet, arraySet.length, String[].class);

        }

        if(restoChoice.equals("KFC")) {

            KfcDbHelper dbHelper = new KfcDbHelper(this);

            mDb = dbHelper.getReadableDatabase();

            Cursor cursorProtoLent = getKfcItem();

            cursorProtoLent.moveToFirst();

            //int i = 0;
            ArrayProtoLent = new ArrayList<String>();

            if (cursorProtoLent.moveToFirst()) {
                do {
                    ArrayProtoLent.add(cursorProtoLent.getString(cursorProtoLent.getColumnIndex(KfcContract.KFCListEntry.GLU_LENT)));
                } while (cursorProtoLent.moveToNext());
            }

            cursorProtoLent.close();

            Cursor cursorProtoRapide = getKfcItem();
            cursorProtoRapide.moveToFirst();

            //int i = 0;
            ArrayProtoRapide = new ArrayList<String>();

            if (cursorProtoRapide.moveToFirst()) {
                do {
                    ArrayProtoRapide.add(cursorProtoRapide.getString(cursorProtoRapide.getColumnIndex(KfcContract.KFCListEntry.GLU_RAPIDE)));
                } while (cursorProtoRapide.moveToNext());
            }

            cursorProtoRapide.close();

            // cursor categories

            Cursor cursorCat = getKfcItem();
            cursorCat.moveToFirst();

            //int i = 0;
            final ArrayList<String> ArrayCat = new ArrayList<String>();

            if (cursorCat.moveToFirst()) {
                do {
                    ArrayCat.add(cursorCat.getString(cursorCat.getColumnIndex(KfcContract.KFCListEntry.CATEGORIE)));
                } while (cursorCat.moveToNext());
            }

            cursorCat.close();

            ArraySet setCat = new ArraySet(ArrayCat);
            Object[] arraySet = setCat.toArray();

            stringArray = Arrays.copyOf(arraySet, arraySet.length, String[].class);

            //return stringArray
        }



        ArrayItemNames = new ArrayList<String>();

/*        Cursor cursor = getItem();
        cursor.moveToFirst();

        //int i = 0;

        final ArrayList<String> ArrayItemNames = new ArrayList<String>();

        if (cursor.moveToFirst()) {
            do {
                ArrayItemNames.add(cursor.getString(cursor.getColumnIndex(McDoContract.Entrees.PRODUCT_NAME)));
            } while (cursor.moveToNext());
        }

        cursor.close();*/

        // connexion a protocole



        tvPanier = (TextView) findViewById(R.id.textPanier);
        btnValid = (Button) findViewById(R.id.buttonValidPanier);
        lvPanier = (ListView) findViewById(R.id.listViewPanier);
        // GridView
        final GridView gridview = (GridView) findViewById(R.id.gridviewItems);
        dropdown = (Spinner) findViewById(spinner);


        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, stringArray);

        dropdown.setAdapter(adapter);

        if(restoChoice.equals("McDo")) {

            dropdown.setOnItemSelectedListener(new OnItemSelectedListener() {

                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    //Object object = adapter.getItem(position);

                    //Toast.makeText(parent.getContext(),
                    //        "OnItemSelectedListener : " + parent.getItemAtPosition(position).toString(),
                    //        Toast.LENGTH_SHORT).show();

                    if (position == 0) {
                        gridview.setAdapter(new SaladeAdapter(parent.getContext()));
                        ArrayItemNames.clear();

                        Cursor cursor = selectCategoryItems("Salades");
                        cursor.moveToFirst();

                        if (cursor.moveToFirst()) {
                            do {
                                ArrayItemNames.add(cursor.getString(cursor.getColumnIndex(McDoContract.Entrees.PRODUCT_NAME)));
                            } while (cursor.moveToNext());
                        }

                        cursor.close();

                        getArrayList(ArrayItemNames);

                    } else if (position == 1) {
                        ArrayItemNames.clear();
                        gridview.setAdapter(new SandwichAdapter(parent.getContext()));

                        Cursor cursor = selectCategoryItems("Sandwichs");
                        cursor.moveToFirst();

                        if (cursor.moveToFirst()) {
                            do {
                                ArrayItemNames.add(cursor.getString(cursor.getColumnIndex(McDoContract.Entrees.PRODUCT_NAME)));
                            } while (cursor.moveToNext());
                        }

                        cursor.close();

                        getArrayList(ArrayItemNames);

                    } else if (position == 2) {
                        ArrayItemNames.clear();
                        gridview.setAdapter(new PetitdejAdapter(parent.getContext()));

                        Cursor cursor = selectCategoryItems("Petit déjeuner");
                        cursor.moveToFirst();

                        if (cursor.moveToFirst()) {
                            do {
                                ArrayItemNames.add(cursor.getString(cursor.getColumnIndex(McDoContract.Entrees.PRODUCT_NAME)));
                            } while (cursor.moveToNext());
                        }

                        cursor.close();

                        getArrayList(ArrayItemNames);

                    } else if (position == 3) {
                        ArrayItemNames.clear();
                        gridview.setAdapter(new DessertAdapter(parent.getContext()));

                        Cursor cursor = selectCategoryItems("Desserts");
                        cursor.moveToFirst();

                        if (cursor.moveToFirst()) {
                            do {
                                ArrayItemNames.add(cursor.getString(cursor.getColumnIndex(McDoContract.Entrees.PRODUCT_NAME)));
                            } while (cursor.moveToNext());
                        }

                        cursor.close();

                        getArrayList(ArrayItemNames);

                    } else if (position == 4) {
                        ArrayItemNames.clear();
                        gridview.setAdapter(new AccompagnementAdapter(parent.getContext()));

                        Cursor cursor = selectCategoryItems("Accompagnements");
                        cursor.moveToFirst();

                        if (cursor.moveToFirst()) {
                            do {
                                ArrayItemNames.add(cursor.getString(cursor.getColumnIndex(McDoContract.Entrees.PRODUCT_NAME)));
                            } while (cursor.moveToNext());
                        }

                        cursor.close();

                        getArrayList(ArrayItemNames);

                    } else if (position == 5) {
                        ArrayItemNames.clear();
                        gridview.setAdapter(new BoissonAdapter(parent.getContext()));

                        Cursor cursor = selectCategoryItems("Boissons");
                        cursor.moveToFirst();

                        if (cursor.moveToFirst()) {
                            do {
                                ArrayItemNames.add(cursor.getString(cursor.getColumnIndex(McDoContract.Entrees.PRODUCT_NAME)));
                            } while (cursor.moveToNext());
                        }

                        cursor.close();

                        getArrayList(ArrayItemNames);

                    }
                }

                @Override
                public void onNothingSelected(AdapterView<?> adapterView) {

                }


            });

        }

        else if(restoChoice.equals("KFC")) {

            dropdown.setOnItemSelectedListener(new OnItemSelectedListener() {

                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    //Object object = adapter.getItem(position);

                    //Toast.makeText(parent.getContext(),
                    //        "OnItemSelectedListener : " + parent.getItemAtPosition(position).toString(),
                    //        Toast.LENGTH_SHORT).show();

                    if (position == 0) {
                        gridview.setAdapter(new KfcSauceAdapter(parent.getContext()));
                        ArrayItemNames.clear();

                        Cursor cursor = KfcselectCategoryItems("Sauces");
                        cursor.moveToFirst();

                        if (cursor.moveToFirst()) {
                            do {
                                ArrayItemNames.add(cursor.getString(cursor.getColumnIndex(KfcContract.KFCListEntry.PRODUCT_NAME)));
                            } while (cursor.moveToNext());
                        }

                        cursor.close();

                        getArrayList(ArrayItemNames);

                    } else if (position == 1) {
                        ArrayItemNames.clear();
                        gridview.setAdapter(new KfcBoissonAdapter(parent.getContext()));

                        Cursor cursor = KfcselectCategoryItems("Boissons Froides");
                        cursor.moveToFirst();

                        if (cursor.moveToFirst()) {
                            do {
                                ArrayItemNames.add(cursor.getString(cursor.getColumnIndex(KfcContract.KFCListEntry.PRODUCT_NAME)));
                            } while (cursor.moveToNext());
                        }

                        cursor.close();

                        getArrayList(ArrayItemNames);

                    } else if (position == 2) {
                        ArrayItemNames.clear();
                        gridview.setAdapter(new KfcSaladeAdapter(parent.getContext()));

                        Cursor cursor = KfcselectCategoryItems("Salades");
                        cursor.moveToFirst();

                        if (cursor.moveToFirst()) {
                            do {
                                ArrayItemNames.add(cursor.getString(cursor.getColumnIndex(KfcContract.KFCListEntry.PRODUCT_NAME)));
                            } while (cursor.moveToNext());
                        }

                        cursor.close();

                        getArrayList(ArrayItemNames);

                    } else if (position == 3) {
                        ArrayItemNames.clear();
                        gridview.setAdapter(new KfcBucketAdapter(parent.getContext()));

                        Cursor cursor = KfcselectCategoryItems("Buckets à partager");
                        cursor.moveToFirst();

                        if (cursor.moveToFirst()) {
                            do {
                                ArrayItemNames.add(cursor.getString(cursor.getColumnIndex(KfcContract.KFCListEntry.PRODUCT_NAME)));
                            } while (cursor.moveToNext());
                        }

                        cursor.close();

                        getArrayList(ArrayItemNames);

                    } else if (position == 4) {
                        ArrayItemNames.clear();
                        gridview.setAdapter(new KfcDessertAdapter(parent.getContext()));

                        Cursor cursor = KfcselectCategoryItems("Desserts");
                        cursor.moveToFirst();

                        if (cursor.moveToFirst()) {
                            do {
                                ArrayItemNames.add(cursor.getString(cursor.getColumnIndex(KfcContract.KFCListEntry.PRODUCT_NAME)));
                            } while (cursor.moveToNext());
                        }

                        cursor.close();

                        getArrayList(ArrayItemNames);

                    } else if (position == 5) {
                        ArrayItemNames.clear();
                        gridview.setAdapter(new KfcPieceAdapter(parent.getContext()));

                        Cursor cursor = KfcselectCategoryItems("Pièces de Poulet / Poisson");
                        cursor.moveToFirst();

                        if (cursor.moveToFirst()) {
                            do {
                                ArrayItemNames.add(cursor.getString(cursor.getColumnIndex(KfcContract.KFCListEntry.PRODUCT_NAME)));
                            } while (cursor.moveToNext());
                        }

                        cursor.close();

                        getArrayList(ArrayItemNames);

                    }

                    else if (position == 6) {
                        ArrayItemNames.clear();
                        gridview.setAdapter(new KfcAccompagnementAdapter(parent.getContext()));

                        Cursor cursor = KfcselectCategoryItems("Accompagnements");
                        cursor.moveToFirst();

                        if (cursor.moveToFirst()) {
                            do {
                                ArrayItemNames.add(cursor.getString(cursor.getColumnIndex(KfcContract.KFCListEntry.PRODUCT_NAME)));
                            } while (cursor.moveToNext());
                        }

                        cursor.close();

                        getArrayList(ArrayItemNames);

                }
                else if (position == 7) {
                    ArrayItemNames.clear();
                    gridview.setAdapter(new KfcSandwichAdapter(parent.getContext()));

                    Cursor cursor = KfcselectCategoryItems("Sandwiches");
                    cursor.moveToFirst();

                    if (cursor.moveToFirst()) {
                        do {
                            ArrayItemNames.add(cursor.getString(cursor.getColumnIndex(KfcContract.KFCListEntry.PRODUCT_NAME)));
                        } while (cursor.moveToNext());
                    }

                    cursor.close();

                    getArrayList(ArrayItemNames);

                }


                }

                @Override
                public void onNothingSelected(AdapterView<?> adapterView) {

                }


            });

        }


            //MenuActivity.this.dropdown.getOnItemSelectedListener();

        gridview.setAdapter(new ImageAdapter(this));

        final ArrayList<String> ArrayPanier = new ArrayList<String>();
        final ArrayList<String> ArrayGluLent = new ArrayList<String>();
        final ArrayList<String> ArrayGluRapide = new ArrayList<String>();

        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v,
                                    final int position, long id) {
                //Toast.makeText(MenuActivity.this, mealTime + " " + restoChoice,
                //        Toast.LENGTH_SHORT).show();
                //tvPanier.append("\n" + "1x" + fakedata[position]);

                final Dialog dialog = new Dialog(context);
                dialog.setContentView(R.layout.dialog_menu);
                dialog.setTitle("Voulez vous ce produit?");

                TextView text = (TextView) dialog.findViewById(R.id.DialogItem);
                text.setText(ArrayItemNames.get(position));

                TextView tvGluLent = (TextView) dialog.findViewById(R.id.DialogGluLent);
                tvGluLent.setText("Glu Lent: " + ArrayProtoLent.get(position));

                TextView tvGluRapide = (TextView) dialog.findViewById(R.id.DialogGluRapide);
                tvGluRapide.setText("Glu Rapide: " + ArrayProtoRapide.get(position));

                ImageView image = (ImageView) dialog.findViewById(R.id.DialogImage);

                if(restoChoice.equals("McDo")) {
                    cursorImage = selectImageItems(ArrayItemNames.get(position));
                    cursorImage.moveToFirst();

                    imageName = cursorImage.getString(cursorImage.getColumnIndex(McDoContract.Entrees.IMAGE_NAME));
                }
                if(restoChoice.equals("KFC")) {
                    cursorImage = KfcselectImageItems(ArrayItemNames.get(position));
                    cursorImage.moveToFirst();

                    imageName = cursorImage.getString(cursorImage.getColumnIndex(KfcContract.KFCListEntry.IMAGE_NAME));
                }


                int drawableResourceId = getResources().getIdentifier(imageName, "drawable", getPackageName());

                image.setImageResource(drawableResourceId);

                Button dialogButton = (Button) dialog.findViewById(R.id.dialogButtonOK);
                // if button is clicked, close the custom dialog
                dialogButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        ArrayPanier.add(ArrayItemNames.get(position));

                        ArrayGluLent.add(ArrayProtoLent.get(position));

                        ArrayGluRapide.add(ArrayProtoRapide.get(position));

                        //menuListAdapter adapter = new menuListAdapter(MenuActivity.this, ArrayPanier);

                        CustomListViewPanierArticle adapter = new
                                CustomListViewPanierArticle(MenuActivity.this,ArrayPanier);

                        //final ArrayAdapter<String> adapter = new ArrayAdapter<String>(MenuActivity.this, android.R.layout.simple_list_item_1, ArrayPanier);

                        lvPanier.setAdapter(adapter);
                        dialog.dismiss();
                    }
                });

                Button dialogButtonNo = (Button) dialog.findViewById(R.id.dialogButtonNon);
                // if button is clicked, close the custom dialog
                dialogButtonNo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        dialog.dismiss();
                    }
                });

                dialog.show();


            }
        });

        final Context context = MenuActivity.this;

        btnValid.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {


                Class destinationActivity = PanierActivity.class;

                Intent startPanierActivityIntent = new Intent(context, destinationActivity);

                Bundle extras = new Bundle();

                extras.putString("EXTRA_MEAL", mealTime);
                extras.putStringArrayList("EXTRA_MENU", ArrayPanier);
                extras.putStringArrayList("EXTRA_GLULENT", ArrayGluLent);
                extras.putStringArrayList("EXTRA_GLURAPIDE", ArrayGluRapide);


                startPanierActivityIntent.putExtras(extras);

                if(!ArrayPanier.isEmpty()){
                    startActivity(startPanierActivityIntent);
                }
                else {
                    Toast.makeText(MenuActivity.this, "Veuillez d'abord remplir le panier ! ", Toast.LENGTH_LONG).show();
                }


            }
        });

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }


    private Cursor getItem() {
        // COMPLETED (6) Inside, call query on mDb passing in the table name and projection String [] order by COLUMN_TIMESTAMP
        return mDb.query(
                McDoContract.Entrees.TABLE_NAME,
                null,
                null,
                null,
                null,
                null,
                McDoContract.Entrees.COLUMN_TIMESTAMP
        );
    }

    private Cursor getKfcItem() {
        // COMPLETED (6) Inside, call query on mDb passing in the table name and projection String [] order by COLUMN_TIMESTAMP
        return mDb.query(
                KfcContract.KFCListEntry.TABLE_NAME,
                null,
                null,
                null,
                null,
                null,
                KfcContract.KFCListEntry.COLUMN_TIMESTAMP
        );
    }


    private Cursor selectCategoryItems(String categorie) {
        String[] FROM = {
                McDoContract.Entrees.CATEGORIE,
                McDoContract.Entrees.PRODUCT_NAME
        };

        String where = McDoContract.Entrees.CATEGORIE + "=?";

        String[] whereArgs = new String[] { // The value of the column specified above for the rows to be included in the response
                categorie
        };

        return mDb.query(McDoContract.Entrees.TABLE_NAME, FROM, where, whereArgs, null, null, McDoContract.Entrees.COLUMN_TIMESTAMP);


    }


    private Cursor selectImageItems(String nomItem) {
        String[] FROM = {
                McDoContract.Entrees.IMAGE_NAME,
                McDoContract.Entrees.PRODUCT_NAME
        };

        String where = McDoContract.Entrees.PRODUCT_NAME + "=?";

        String[] whereArgs = new String[] { // The value of the column specified above for the rows to be included in the response
                nomItem
        };

        return mDb.query(McDoContract.Entrees.TABLE_NAME, FROM, where, whereArgs, null, null, McDoContract.Entrees.COLUMN_TIMESTAMP);


    }



    private Cursor KfcselectCategoryItems(String categorie) {
        String[] FROM = {
                KfcContract.KFCListEntry.CATEGORIE,
                KfcContract.KFCListEntry.PRODUCT_NAME
        };

        String where = KfcContract.KFCListEntry.CATEGORIE + "=?";

        String[] whereArgs = new String[] { // The value of the column specified above for the rows to be included in the response
                categorie
        };

        return mDb.query(KfcContract.KFCListEntry.TABLE_NAME, FROM, where, whereArgs, null, null, KfcContract.KFCListEntry.COLUMN_TIMESTAMP);


    }


    private Cursor KfcselectImageItems(String nomItem) {
        String[] FROM = {
                KfcContract.KFCListEntry.IMAGE_NAME,
                KfcContract.KFCListEntry.PRODUCT_NAME
        };

        String where = KfcContract.KFCListEntry.PRODUCT_NAME + "=?";

        String[] whereArgs = new String[] { // The value of the column specified above for the rows to be included in the response
                nomItem
        };

        return mDb.query(KfcContract.KFCListEntry.TABLE_NAME, FROM, where, whereArgs, null, null, KfcContract.KFCListEntry.COLUMN_TIMESTAMP);


    }


    private void getArrayList(ArrayList result){
        // Now the data has been "returned" (as pointed out, that's not
        // the right terminology)
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.item_settings:
                //Toast.makeText(RestoActivity.this, "Protocole" , Toast.LENGTH_SHORT).show();

                Context context = MenuActivity.this;

                Class destinationActivity = ProtocoleActivity.class;

                Intent startProtocoleActivityIntent = new Intent(context, destinationActivity);

                startActivity(startProtocoleActivityIntent);

                return true;
        }
        return super.onOptionsItemSelected(item);
    }



}
