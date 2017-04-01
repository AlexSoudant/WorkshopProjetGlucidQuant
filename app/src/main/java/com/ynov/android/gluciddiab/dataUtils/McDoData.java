package com.ynov.android.gluciddiab.dataUtils;

import android.content.ContentValues;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by antonin on 30/03/2017.
 */

// entrées de la bdd

public class McDoData {
    public static void insertData(SQLiteDatabase database) {
        if (database == null) {
            return;
        }
        //create a list of fake guests
        List<ContentValues> list = new ArrayList<ContentValues>();

        /* ------------------------------------------- */
        /*                 SANDWICHS                   */
        /* ------------------------------------------- */

        ContentValues cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Sandwichs");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Big Mac");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 4);
        cv.put(McDoContract.Entrees.GLU_LENT, 15);
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Sandwichs");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Royal Deluxe");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 3);
        cv.put(McDoContract.Entrees.GLU_LENT, 11);
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Sandwichs");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Royal Bacon");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 4);
        cv.put(McDoContract.Entrees.GLU_LENT, 13);
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Sandwichs");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Royal Cheese");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 4);
        cv.put(McDoContract.Entrees.GLU_LENT, 13);
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Sandwichs");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Double Cheeseburger");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 5);
        cv.put(McDoContract.Entrees.GLU_LENT, 13);
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Sandwichs");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Hamburger");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 7);
        cv.put(McDoContract.Entrees.GLU_LENT, 21);
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Sandwichs");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Cheeseburger");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 6);
        cv.put(McDoContract.Entrees.GLU_LENT, 19);
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Sandwichs");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "McChicken");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 1);
        cv.put(McDoContract.Entrees.GLU_LENT, 21);
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Sandwichs");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Chicken Nuggets (4 morceaux)");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 0);
        cv.put(McDoContract.Entrees.GLU_LENT, 17);
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Sandwichs");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Chicken Nuggets (6 morceaux)");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 0);
        cv.put(McDoContract.Entrees.GLU_LENT, 18);
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Sandwichs");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Chicken Nuggets (9 morceaux)");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 0);
        cv.put(McDoContract.Entrees.GLU_LENT, 17);
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Sandwichs");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Chicken Nuggets (20 morceaux)");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 0);
        cv.put(McDoContract.Entrees.GLU_LENT, 17);
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Sandwichs");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "McFish");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 7);
        cv.put(McDoContract.Entrees.GLU_LENT, 25);
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Sandwichs");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Filet-O-Fish");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 4);
        cv.put(McDoContract.Entrees.GLU_LENT, 22);
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Sandwichs");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Croque McDo");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 4);
        cv.put(McDoContract.Entrees.GLU_LENT, 24);
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Sandwichs");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Cassecroute Boeuf Oignon");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 2);
        cv.put(McDoContract.Entrees.GLU_LENT, 20);
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Sandwichs");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Cassecroute Pouket Crudités");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 1);
        cv.put(McDoContract.Entrees.GLU_LENT, 24);
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Sandwichs");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Le M");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 1);
        cv.put(McDoContract.Entrees.GLU_LENT, 16);
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Sandwichs");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Le M Bacon");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 1);
        cv.put(McDoContract.Entrees.GLU_LENT, 16);
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Sandwichs");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "McWrap Poulet Croustillant & Bacon");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 2);
        cv.put(McDoContract.Entrees.GLU_LENT, 19);
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Sandwichs");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "McWrap Poulet Croustillant Poivre");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 2);
        cv.put(McDoContract.Entrees.GLU_LENT, 17);
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Sandwichs");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "P'tit Wrap Ranch");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 2);
        cv.put(McDoContract.Entrees.GLU_LENT, 20);
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Sandwichs");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "P'tit Italien");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 5);
        cv.put(McDoContract.Entrees.GLU_LENT, 19);
        list.add(cv);

        /* ------------------------------------------- */
        /*              FIN SANDWICHS                  */
        /* ------------------------------------------- */


        /* ------------------------------------------- */
        /*             ACCOMPAGNEMENTS                 */
        /* ------------------------------------------- */

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Accompagnements");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Frite petite");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 0);
        cv.put(McDoContract.Entrees.GLU_LENT, 36);
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Accompagnements");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Frite moyenne");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 0);
        cv.put(McDoContract.Entrees.GLU_LENT, 36);
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Accompagnements");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Frite grande");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 0);
        cv.put(McDoContract.Entrees.GLU_LENT, 36);
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Accompagnements");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Deluxe Potatoes moyenne");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 0);
        cv.put(McDoContract.Entrees.GLU_LENT, 25);
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Accompagnements");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Deluxe Potatoes grande");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 1);
        cv.put(McDoContract.Entrees.GLU_LENT, 23);
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Accompagnements");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "P'tite salade");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 3);
        cv.put(McDoContract.Entrees.GLU_LENT, 2);
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Accompagnements");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "P'tites tomates");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 3);
        cv.put(McDoContract.Entrees.GLU_LENT, 0);
        list.add(cv);

        /* ------------------------------------------- */
        /*            FIN ACCOMPAGNEMENTS              */
        /* ------------------------------------------- */


        /* ------------------------------------------- */
        /*                BOISSONS                     */
        /* ------------------------------------------- */

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Boissons");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Coca-Cola (40cl)");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 11);
        cv.put(McDoContract.Entrees.GLU_LENT, 0);
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Boissons");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Coca-Cola light (40cl)");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 0);
        cv.put(McDoContract.Entrees.GLU_LENT, 0);
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Boissons");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Coca-Cola zéro (40cl)");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 0);
        cv.put(McDoContract.Entrees.GLU_LENT, 0);
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Boissons");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Sprite (40cl)");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 9);
        cv.put(McDoContract.Entrees.GLU_LENT, 0);
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Boissons");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Fanta orange (40cl)");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 10);
        cv.put(McDoContract.Entrees.GLU_LENT, 0);
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Boissons");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Lipton Ice Tea saveur pêche (40cl)");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 7);
        cv.put(McDoContract.Entrees.GLU_LENT, 0);
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Boissons");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Minute Maid (30cl)");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 11);
        cv.put(McDoContract.Entrees.GLU_LENT, 0);
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Boissons");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Badoit (33cl)");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 0);
        cv.put(McDoContract.Entrees.GLU_LENT, 0);
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Boissons");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Evian (33cl)");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 0);
        cv.put(McDoContract.Entrees.GLU_LENT, 0);
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Boissons");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Coca-Cola (25cl)");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 11);
        cv.put(McDoContract.Entrees.GLU_LENT, 0);
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Boissons");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Coca-Cola light (25cl)");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 0);
        cv.put(McDoContract.Entrees.GLU_LENT, 0);
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Boissons");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Coca-Cola zéro (25cl)");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 0);
        cv.put(McDoContract.Entrees.GLU_LENT, 0);
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Boissons");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Sprite (25cl)");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 9);
        cv.put(McDoContract.Entrees.GLU_LENT, 0);
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Boissons");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Fanta orange (25cl)");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 10);
        cv.put(McDoContract.Entrees.GLU_LENT, 0);
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Boissons");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Lipton Ice Tea saveur pêche (25cl)");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 7);
        cv.put(McDoContract.Entrees.GLU_LENT, 0);
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Boissons");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Minute Maid (20cl)");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 11);
        cv.put(McDoContract.Entrees.GLU_LENT, 0);
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Boissons");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Evian (33cl)");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 0);
        cv.put(McDoContract.Entrees.GLU_LENT, 0);
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Boissons");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Mon P'tit Jus Bio (20cl)");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 12);
        cv.put(McDoContract.Entrees.GLU_LENT, 0);
        list.add(cv);


        /* ------------------------------------------- */
        /*               FIN BOISSONS                  */
        /* ------------------------------------------- */


        /* ------------------------------------------- */
        /*                SALADES                      */
        /* ------------------------------------------- */

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Salades");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Salade Caesar");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 2);
        cv.put(McDoContract.Entrees.GLU_LENT, 1);
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Salades");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Salade Pâte Mozzarella");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 2);
        cv.put(McDoContract.Entrees.GLU_LENT, 16);
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Salades");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Salade Pomme de terre Poulet Oignon");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 1);
        cv.put(McDoContract.Entrees.GLU_LENT, 9);
        list.add(cv);

        /* ------------------------------------------- */
        /*               FIN SALADES                   */
        /* ------------------------------------------- */


        /* ------------------------------------------- */
        /*                DESSERTS                     */
        /* ------------------------------------------- */

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Desserts");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Sundae nappage saveur caramel");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 28);
        cv.put(McDoContract.Entrees.GLU_LENT, 6);
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Desserts");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Sundae nappage saveur chocolat");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 26);
        cv.put(McDoContract.Entrees.GLU_LENT, 3);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Desserts");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Frappé Myrtille-Framboise");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 20);
        cv.put(McDoContract.Entrees.GLU_LENT, 2);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Desserts");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Frappé Mangue-Fraise");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 13);
        cv.put(McDoContract.Entrees.GLU_LENT, 6);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Desserts");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Frappé pistache");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 19);
        cv.put(McDoContract.Entrees.GLU_LENT, 3);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Desserts");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Frappé Vanille Fraise");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 18);
        cv.put(McDoContract.Entrees.GLU_LENT, 2);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Desserts");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Very parfait coulis fraise");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 19);
        cv.put(McDoContract.Entrees.GLU_LENT, 1);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Desserts");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Very parfait nappage saveur caramel");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 31);
        cv.put(McDoContract.Entrees.GLU_LENT, 9);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Desserts");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Very parfait nappage saveur chocolat");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 31);
        cv.put(McDoContract.Entrees.GLU_LENT, 2);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Desserts");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "McFlurry Oreo");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 21);
        cv.put(McDoContract.Entrees.GLU_LENT, 5);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Desserts");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "McFlurry Daim");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 26);
        cv.put(McDoContract.Entrees.GLU_LENT, 2);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Desserts");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "McFlurry Kit Kat Ball");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 24);
        cv.put(McDoContract.Entrees.GLU_LENT, 4);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Desserts");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "McFlurry M&M's");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 25);
        cv.put(McDoContract.Entrees.GLU_LENT, 3);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Desserts");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "McFlurry Granola");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 22);
        cv.put(McDoContract.Entrees.GLU_LENT, 4);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Desserts");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Nappage saveur chocolat");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 43);
        cv.put(McDoContract.Entrees.GLU_LENT, 7);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Desserts");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Nappage saveur caramel");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 48);
        cv.put(McDoContract.Entrees.GLU_LENT, 16);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Desserts");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Muffin chocolat");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 29);
        cv.put(McDoContract.Entrees.GLU_LENT, 20);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Desserts");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Mandise");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 35);
        cv.put(McDoContract.Entrees.GLU_LENT, 17);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Desserts");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Brownie stick caramel et biscuit");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 31);
        cv.put(McDoContract.Entrees.GLU_LENT, 20);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Desserts");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Cookie stick aux Noisettes");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 20);
        cv.put(McDoContract.Entrees.GLU_LENT, 40);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Desserts");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "P'tite poire");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 10);
        cv.put(McDoContract.Entrees.GLU_LENT, 4);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Desserts");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "P'tite pomme");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 11);
        cv.put(McDoContract.Entrees.GLU_LENT, 0);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Desserts");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Ananas à croquer");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 11);
        cv.put(McDoContract.Entrees.GLU_LENT, 0);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Desserts");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Berlingo' Fruits pomme banane");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 13);
        cv.put(McDoContract.Entrees.GLU_LENT, 0);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Desserts");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Berlingo' Fruits pomme");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 13);
        cv.put(McDoContract.Entrees.GLU_LENT, 1);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Desserts");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Mon Bio à boire banane");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 10);
        cv.put(McDoContract.Entrees.GLU_LENT, 1);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Desserts");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Mon Bio à boire fraise mûre");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 9);
        cv.put(McDoContract.Entrees.GLU_LENT, 1);

        /* ------------------------------------------- */
        /*               FIN DESSERTS                  */
        /* ------------------------------------------- */


        /* ------------------------------------------- */
        /*            PETIT DEJEUNER                   */
        /* ------------------------------------------- */

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Petit déjeuner");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Bacon & Egg McMuffin");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 2);
        cv.put(McDoContract.Entrees.GLU_LENT, 19);
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Petit déjeuner");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Pancake nature (2 unités)");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 16);
        cv.put(McDoContract.Entrees.GLU_LENT, 23);
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Petit déjeuner");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Trio mini viennoiseries");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 12);
        cv.put(McDoContract.Entrees.GLU_LENT, 33);
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Petit déjeuner");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Muffin chocolat");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 29);
        cv.put(McDoContract.Entrees.GLU_LENT, 20);
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Petit déjeuner");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Beurre");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 0);
        cv.put(McDoContract.Entrees.GLU_LENT, 0);
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Petit déjeuner");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Grand caffé Segafredo");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 0);
        cv.put(McDoContract.Entrees.GLU_LENT, 0);
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Petit déjeuner");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Thé Lipton");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 0);
        cv.put(McDoContract.Entrees.GLU_LENT, 0);
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Petit déjeuner");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Café expresso Segafredo");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 0);
        cv.put(McDoContract.Entrees.GLU_LENT, 0);
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Petit déjeuner");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Ristretto");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 0);
        cv.put(McDoContract.Entrees.GLU_LENT, 0);
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Petit déjeuner");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Noisette");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 1);
        cv.put(McDoContract.Entrees.GLU_LENT, 0);
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Petit déjeuner");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Sirop aromatisé Erable");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 76);
        cv.put(McDoContract.Entrees.GLU_LENT, 0);
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Petit déjeuner");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Stick pâte à tartiner");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 59);
        cv.put(McDoContract.Entrees.GLU_LENT, 6);
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Petit déjeuner");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Confiture extra de fraise ou d'abricot");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 53);
        cv.put(McDoContract.Entrees.GLU_LENT, 0);
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Petit déjeuner");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Minute Maid (20cl)");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 11);
        cv.put(McDoContract.Entrees.GLU_LENT, 0);
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Petit déjeuner");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Cappuccino");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 3);
        cv.put(McDoContract.Entrees.GLU_LENT, 0);
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Petit déjeuner");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Cappuccino Daim");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 3);
        cv.put(McDoContract.Entrees.GLU_LENT, 3);
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Petit déjeuner");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Double Latte");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 3);
        cv.put(McDoContract.Entrees.GLU_LENT, 0);
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Petit déjeuner");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Boisson chaude Banania");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 5);
        cv.put(McDoContract.Entrees.GLU_LENT, 7);
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Petit déjeuner");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "P'tite pomme");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 11);
        cv.put(McDoContract.Entrees.GLU_LENT, 0);
        list.add(cv);

        /* ------------------------------------------- */
        /*            FIN PETIT DEJEUNER               */
        /* ------------------------------------------- */


        //insert all guests in one transaction
        try {
            database.beginTransaction();
            //clear the McDoContract first
            database.delete(McDoContract.Entrees.TABLE_NAME, null, null);
            //go through the list and add one by one
            for (ContentValues c : list) {
                database.insert(McDoContract.Entrees.TABLE_NAME, null, c);
            }
            database.setTransactionSuccessful();
        } catch (SQLException e) {
            //too bad :(
        } finally {
            database.endTransaction();
        }
    }
}
