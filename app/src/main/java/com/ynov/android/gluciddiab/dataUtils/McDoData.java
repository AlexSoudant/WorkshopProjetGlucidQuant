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
        cv.put(McDoContract.Entrees.IMAGE_NAME, "mcdobigmac");
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Sandwichs");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Royal Deluxe");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 3);
        cv.put(McDoContract.Entrees.GLU_LENT, 11);
        cv.put(McDoContract.Entrees.IMAGE_NAME, "mcdoroyaldeluxe");
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Sandwichs");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Royal Bacon");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 4);
        cv.put(McDoContract.Entrees.GLU_LENT, 13);
        cv.put(McDoContract.Entrees.IMAGE_NAME, "mcdoroyaldeluxe");
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Sandwichs");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Royal Cheese");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 4);
        cv.put(McDoContract.Entrees.GLU_LENT, 13);
        cv.put(McDoContract.Entrees.IMAGE_NAME, "mcdoroyalcheese");
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Sandwichs");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Double Cheeseburger");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 5);
        cv.put(McDoContract.Entrees.GLU_LENT, 13);
        cv.put(McDoContract.Entrees.IMAGE_NAME, "mcdodoublecheese");
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Sandwichs");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Hamburger");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 7);
        cv.put(McDoContract.Entrees.GLU_LENT, 21);
        cv.put(McDoContract.Entrees.IMAGE_NAME, "mcdohamburger");
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Sandwichs");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Cheeseburger");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 6);
        cv.put(McDoContract.Entrees.GLU_LENT, 19);
        cv.put(McDoContract.Entrees.IMAGE_NAME, "mcdocheeseburger");
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Sandwichs");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "McChicken");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 1);
        cv.put(McDoContract.Entrees.GLU_LENT, 21);
        cv.put(McDoContract.Entrees.IMAGE_NAME, "mcdomcchicken");
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Sandwichs");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Chicken Nuggets (4 morceaux)");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 0);
        cv.put(McDoContract.Entrees.GLU_LENT, 17);
        cv.put(McDoContract.Entrees.IMAGE_NAME, "mcdochickenmcnuggetsquatre");
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Sandwichs");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Chicken Nuggets (6 morceaux)");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 0);
        cv.put(McDoContract.Entrees.GLU_LENT, 18);
        cv.put(McDoContract.Entrees.IMAGE_NAME, "mcdochickenmcnuggetssix");
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Sandwichs");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Chicken Nuggets (9 morceaux)");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 0);
        cv.put(McDoContract.Entrees.GLU_LENT, 17);
        cv.put(McDoContract.Entrees.IMAGE_NAME, "mcdochickenmcnuggetsneuf");
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Sandwichs");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Chicken Nuggets (20 morceaux)");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 0);
        cv.put(McDoContract.Entrees.GLU_LENT, 17);
        cv.put(McDoContract.Entrees.IMAGE_NAME, "mcdochickenmcnuggetsvingt");
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Sandwichs");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "McFish");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 7);
        cv.put(McDoContract.Entrees.GLU_LENT, 25);
        cv.put(McDoContract.Entrees.IMAGE_NAME, "mcdomcfish");
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Sandwichs");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Filet-O-Fish");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 4);
        cv.put(McDoContract.Entrees.GLU_LENT, 22);
        cv.put(McDoContract.Entrees.IMAGE_NAME, "mcdofiletofish");
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Sandwichs");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Croque McDo");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 4);
        cv.put(McDoContract.Entrees.GLU_LENT, 24);
        cv.put(McDoContract.Entrees.IMAGE_NAME, "mcdocroquemcdo");
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Sandwichs");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Cassecroute Boeuf Oignon");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 2);
        cv.put(McDoContract.Entrees.GLU_LENT, 20);
        cv.put(McDoContract.Entrees.IMAGE_NAME, "nopicture");
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Sandwichs");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Cassecroute Poulet Crudités");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 1);
        cv.put(McDoContract.Entrees.GLU_LENT, 24);
        cv.put(McDoContract.Entrees.IMAGE_NAME, "nopicture");
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Sandwichs");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Le M");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 1);
        cv.put(McDoContract.Entrees.GLU_LENT, 16);
        cv.put(McDoContract.Entrees.IMAGE_NAME, "mcdom");
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Sandwichs");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Le M Bacon");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 1);
        cv.put(McDoContract.Entrees.GLU_LENT, 16);
        cv.put(McDoContract.Entrees.IMAGE_NAME, "mcdombacon");
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Sandwichs");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "McWrap Poulet Croustillant et Bacon");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 2);
        cv.put(McDoContract.Entrees.GLU_LENT, 19);
        cv.put(McDoContract.Entrees.IMAGE_NAME, "mcdomcwrappouletbacon");
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Sandwichs");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "McWrap Poulet Croustillant Poivre");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 2);
        cv.put(McDoContract.Entrees.GLU_LENT, 17);
        cv.put(McDoContract.Entrees.IMAGE_NAME, "mcdomcwrappouletcroustillantpoivre");
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Sandwichs");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "P'tit Wrap Ranch");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 2);
        cv.put(McDoContract.Entrees.GLU_LENT, 20);
        cv.put(McDoContract.Entrees.IMAGE_NAME, "mcdoptitranchwrap");
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Sandwichs");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "P'tit Italien");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 5);
        cv.put(McDoContract.Entrees.GLU_LENT, 19);
        cv.put(McDoContract.Entrees.IMAGE_NAME, "nopicture");
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
        cv.put(McDoContract.Entrees.IMAGE_NAME, "mcdopetitefrite");
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Accompagnements");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Frite moyenne");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 0);
        cv.put(McDoContract.Entrees.GLU_LENT, 36);
        cv.put(McDoContract.Entrees.IMAGE_NAME, "mcdomoyennefrite");
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Accompagnements");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Frite grande");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 0);
        cv.put(McDoContract.Entrees.GLU_LENT, 36);
        cv.put(McDoContract.Entrees.IMAGE_NAME, "mcdograndefrite");
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Accompagnements");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Deluxe Potatoes moyenne");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 0);
        cv.put(McDoContract.Entrees.GLU_LENT, 25);
        cv.put(McDoContract.Entrees.IMAGE_NAME, "mcdomoyennepotatoes");
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Accompagnements");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Deluxe Potatoes grande");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 1);
        cv.put(McDoContract.Entrees.GLU_LENT, 23);
        cv.put(McDoContract.Entrees.IMAGE_NAME, "mcdograndepotatoes");
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Accompagnements");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "P'tite salade");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 3);
        cv.put(McDoContract.Entrees.GLU_LENT, 2);
        cv.put(McDoContract.Entrees.IMAGE_NAME, "mcdoptitesalade");
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Accompagnements");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "P'tites tomates");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 3);
        cv.put(McDoContract.Entrees.GLU_LENT, 0);
        cv.put(McDoContract.Entrees.IMAGE_NAME, "mcdoptitetomates");
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
        cv.put(McDoContract.Entrees.IMAGE_NAME, "mcdococacolaquarantecl");
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Boissons");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Coca-Cola light (40cl)");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 0);
        cv.put(McDoContract.Entrees.GLU_LENT, 0);
        cv.put(McDoContract.Entrees.IMAGE_NAME, "mcdococacolalightquarantecl");
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Boissons");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Coca-Cola zéro (40cl)");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 0);
        cv.put(McDoContract.Entrees.GLU_LENT, 0);
        cv.put(McDoContract.Entrees.IMAGE_NAME, "mcdococacolazeroquarantecl");
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Boissons");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Sprite (40cl)");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 9);
        cv.put(McDoContract.Entrees.GLU_LENT, 0);
        cv.put(McDoContract.Entrees.IMAGE_NAME, "mcdospritequarantecl");
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Boissons");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Fanta orange (40cl)");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 10);
        cv.put(McDoContract.Entrees.GLU_LENT, 0);
        cv.put(McDoContract.Entrees.IMAGE_NAME, "mcdofantaquarantecl");
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Boissons");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Lipton Ice Tea saveur pêche (40cl)");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 7);
        cv.put(McDoContract.Entrees.GLU_LENT, 0);
        cv.put(McDoContract.Entrees.IMAGE_NAME, "mcdothelipton");
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Boissons");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Minute Maid (30cl)");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 11);
        cv.put(McDoContract.Entrees.GLU_LENT, 0);
        cv.put(McDoContract.Entrees.IMAGE_NAME, "mcdominutemaidtrentecl");
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Boissons");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Badoit (33cl)");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 0);
        cv.put(McDoContract.Entrees.GLU_LENT, 0);
        cv.put(McDoContract.Entrees.IMAGE_NAME, "mcdobadoittrentetroiscl");
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Boissons");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Evian (33cl)");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 0);
        cv.put(McDoContract.Entrees.GLU_LENT, 0);
        cv.put(McDoContract.Entrees.IMAGE_NAME, "mcdoeviantrentetroiscl");
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Boissons");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Coca-Cola (25cl)");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 11);
        cv.put(McDoContract.Entrees.GLU_LENT, 0);
        cv.put(McDoContract.Entrees.IMAGE_NAME, "mcdococacolavinigtcingcl");
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Boissons");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Coca-Cola light (25cl)");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 0);
        cv.put(McDoContract.Entrees.GLU_LENT, 0);
        cv.put(McDoContract.Entrees.IMAGE_NAME, "mcdococacolalightvingtcinqcl");
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Boissons");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Coca-Cola zéro (25cl)");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 0);
        cv.put(McDoContract.Entrees.GLU_LENT, 0);
        cv.put(McDoContract.Entrees.IMAGE_NAME, "mcdococacolazerovingtcinqcl");
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Boissons");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Sprite (25cl)");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 9);
        cv.put(McDoContract.Entrees.GLU_LENT, 0);
        cv.put(McDoContract.Entrees.IMAGE_NAME, "mcdospritevingtcinqcl");
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Boissons");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Fanta orange (25cl)");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 10);
        cv.put(McDoContract.Entrees.GLU_LENT, 0);
        cv.put(McDoContract.Entrees.IMAGE_NAME, "mcdofantavingtcinqcl");
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Boissons");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Lipton Ice Tea saveur pêche (25cl)");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 7);
        cv.put(McDoContract.Entrees.GLU_LENT, 0);
        cv.put(McDoContract.Entrees.IMAGE_NAME, "mcdothelipton");
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Boissons");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Minute Maid (20cl)");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 11);
        cv.put(McDoContract.Entrees.GLU_LENT, 0);
        cv.put(McDoContract.Entrees.IMAGE_NAME, "mcdominutemaidvingtcl");
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Boissons");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Evian (33cl)");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 0);
        cv.put(McDoContract.Entrees.GLU_LENT, 0);
        cv.put(McDoContract.Entrees.IMAGE_NAME, "mcdoeviantrentetroiscl");
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Boissons");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Mon P'tit Jus Bio (20cl)");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 12);
        cv.put(McDoContract.Entrees.GLU_LENT, 0);
        cv.put(McDoContract.Entrees.IMAGE_NAME, "mcdoptitjusbiovingtcl");
        list.add(cv);


        /* ------------------------------------------- */
        /*               FIN BOISSONS                  */
        /* ------------------------------------------- */


        /* ------------------------------------------- */
        /*                SALADES                      */
        /*                SALADES                      */
        /* ------------------------------------------- */

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Salades");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Salade Caesar");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 2);
        cv.put(McDoContract.Entrees.GLU_LENT, 1);
        cv.put(McDoContract.Entrees.IMAGE_NAME, "mcdosaladecaesar");
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Salades");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Salade Pâte Mozzarella");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 2);
        cv.put(McDoContract.Entrees.GLU_LENT, 16);
        cv.put(McDoContract.Entrees.IMAGE_NAME, "mcdosaladepatemozza");
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Salades");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Salade Pomme de terre Poulet Oignon");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 1);
        cv.put(McDoContract.Entrees.GLU_LENT, 9);
        cv.put(McDoContract.Entrees.IMAGE_NAME, "nopicture");
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
        cv.put(McDoContract.Entrees.IMAGE_NAME, "mcdosundaenappagesaveurcaramel");
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Desserts");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Sundae nappage saveur chocolat");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 26);
        cv.put(McDoContract.Entrees.GLU_LENT, 3);
        cv.put(McDoContract.Entrees.IMAGE_NAME, "mcdosundaenappagesaveurchocolat");
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Desserts");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Frappé Myrtille-Framboise");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 20);
        cv.put(McDoContract.Entrees.GLU_LENT, 2);
        cv.put(McDoContract.Entrees.IMAGE_NAME, "mcdofrappemyrtilleframboise");
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Desserts");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Frappé Mangue-Fraise");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 13);
        cv.put(McDoContract.Entrees.GLU_LENT, 6);
        cv.put(McDoContract.Entrees.IMAGE_NAME, "mcdofrappemanguefraise");
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Desserts");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Frappé pistache");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 19);
        cv.put(McDoContract.Entrees.GLU_LENT, 3);
        cv.put(McDoContract.Entrees.IMAGE_NAME, "mcdofrappepistache");
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Desserts");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Frappé Vanille Fraise");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 18);
        cv.put(McDoContract.Entrees.GLU_LENT, 2);
        cv.put(McDoContract.Entrees.IMAGE_NAME, "mcdofrappevanillefraise");
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Desserts");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Very parfait coulis fraise");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 19);
        cv.put(McDoContract.Entrees.GLU_LENT, 1);
        cv.put(McDoContract.Entrees.IMAGE_NAME, "mcdoveryparfaitfraise");
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Desserts");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Very parfait nappage saveur caramel");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 31);
        cv.put(McDoContract.Entrees.GLU_LENT, 9);
        cv.put(McDoContract.Entrees.IMAGE_NAME, "mcdoveryparfaitcaramel");
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Desserts");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Very parfait nappage saveur chocolat");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 31);
        cv.put(McDoContract.Entrees.GLU_LENT, 2);
        cv.put(McDoContract.Entrees.IMAGE_NAME, "mcdoveryparfaitchocolat");
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Desserts");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "McFlurry Oreo");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 21);
        cv.put(McDoContract.Entrees.GLU_LENT, 5);
        cv.put(McDoContract.Entrees.IMAGE_NAME, "mcdomcflurryoreo");
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Desserts");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "McFlurry Daim");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 26);
        cv.put(McDoContract.Entrees.GLU_LENT, 2);
        cv.put(McDoContract.Entrees.IMAGE_NAME, "mcdomcflurrydaim");
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Desserts");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "McFlurry Kit Kat Ball");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 24);
        cv.put(McDoContract.Entrees.GLU_LENT, 4);
        cv.put(McDoContract.Entrees.IMAGE_NAME, "mcdomcflurrykitkat");
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Desserts");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "McFlurry MM's");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 25);
        cv.put(McDoContract.Entrees.GLU_LENT, 3);
        cv.put(McDoContract.Entrees.IMAGE_NAME, "mcdomcflurrymms");
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Desserts");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "McFlurry Granola");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 22);
        cv.put(McDoContract.Entrees.GLU_LENT, 4);
        cv.put(McDoContract.Entrees.IMAGE_NAME, "nopicture");
        list.add(cv);


        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Desserts");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Nappage saveur chocolat");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 43);
        cv.put(McDoContract.Entrees.GLU_LENT, 7);
        cv.put(McDoContract.Entrees.IMAGE_NAME, "nopicture");
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Desserts");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Nappage saveur caramel");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 48);
        cv.put(McDoContract.Entrees.GLU_LENT, 16);
        cv.put(McDoContract.Entrees.IMAGE_NAME, "nopicture");
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Desserts");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Muffin chocolat");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 29);
        cv.put(McDoContract.Entrees.GLU_LENT, 20);
        cv.put(McDoContract.Entrees.IMAGE_NAME, "mcdomuffinchocolat");
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Desserts");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Mandise");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 35);
        cv.put(McDoContract.Entrees.GLU_LENT, 17);
        cv.put(McDoContract.Entrees.IMAGE_NAME, "mcdomandise");
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Desserts");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Brownie stick caramel et biscuit");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 31);
        cv.put(McDoContract.Entrees.GLU_LENT, 20);
        cv.put(McDoContract.Entrees.IMAGE_NAME, "mcdobrownie");
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Desserts");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Cookie stick aux Noisettes");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 20);
        cv.put(McDoContract.Entrees.GLU_LENT, 40);
        cv.put(McDoContract.Entrees.IMAGE_NAME, "mcdocookie");
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Desserts");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "P'tite poire");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 10);
        cv.put(McDoContract.Entrees.GLU_LENT, 4);
        cv.put(McDoContract.Entrees.IMAGE_NAME, "mcdoptitepoire");
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Desserts");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "P'tite pomme");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 11);
        cv.put(McDoContract.Entrees.GLU_LENT, 0);
        cv.put(McDoContract.Entrees.IMAGE_NAME, "mcdoptitepomme");
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Desserts");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Ananas à croquer");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 11);
        cv.put(McDoContract.Entrees.GLU_LENT, 0);
        cv.put(McDoContract.Entrees.IMAGE_NAME, "mcdoananasacroquer");
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Desserts");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Berlingo' Fruits pomme banane");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 13);
        cv.put(McDoContract.Entrees.GLU_LENT, 0);
        cv.put(McDoContract.Entrees.IMAGE_NAME, "");
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Desserts");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Berlingo' Fruits pomme");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 13);
        cv.put(McDoContract.Entrees.GLU_LENT, 1);
        cv.put(McDoContract.Entrees.IMAGE_NAME, "mcdoberlingopomme");
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Desserts");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Mon Bio à boire banane");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 10);
        cv.put(McDoContract.Entrees.GLU_LENT, 1);
        cv.put(McDoContract.Entrees.IMAGE_NAME, "mcdobioaboirebanane");
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Desserts");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Mon Bio à boire fraise mûre");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 9);
        cv.put(McDoContract.Entrees.GLU_LENT, 1);
        cv.put(McDoContract.Entrees.IMAGE_NAME, "mcdobioaboirefraise");
        list.add(cv);

        /* ------------------------------------------- */
        /*               FIN DESSERTS                  */
        /* ------------------------------------------- */


        /* ------------------------------------------- */
        /*            PETIT DEJEUNER                   */
        /* ------------------------------------------- */

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Petit déjeuner");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Bacon et Egg McMuffin");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 2);
        cv.put(McDoContract.Entrees.GLU_LENT, 19);
        cv.put(McDoContract.Entrees.IMAGE_NAME, "mcdobacconeggmcmuffin");
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Petit déjeuner");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Pancake nature (2 unités)");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 16);
        cv.put(McDoContract.Entrees.GLU_LENT, 23);
        cv.put(McDoContract.Entrees.IMAGE_NAME, "mcdopancakes");
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Petit déjeuner");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Trio mini viennoiseries");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 12);
        cv.put(McDoContract.Entrees.GLU_LENT, 33);
        cv.put(McDoContract.Entrees.IMAGE_NAME, "nopicture");
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Petit déjeuner");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Muffin chocolat");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 29);
        cv.put(McDoContract.Entrees.GLU_LENT, 20);
        cv.put(McDoContract.Entrees.IMAGE_NAME, "mcdomuffinchocolat");
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Petit déjeuner");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Beurre");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 0);
        cv.put(McDoContract.Entrees.GLU_LENT, 0);
        cv.put(McDoContract.Entrees.IMAGE_NAME, "nopicture");
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Petit déjeuner");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Grand caffé Segafredo");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 0);
        cv.put(McDoContract.Entrees.GLU_LENT, 0);
        cv.put(McDoContract.Entrees.IMAGE_NAME, "mcdograndcafesagafredo");
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Petit déjeuner");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Thé Lipton");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 0);
        cv.put(McDoContract.Entrees.GLU_LENT, 0);
        cv.put(McDoContract.Entrees.IMAGE_NAME, "mcdothelipton");
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Petit déjeuner");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Café expresso Segafredo");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 0);
        cv.put(McDoContract.Entrees.GLU_LENT, 0);
        cv.put(McDoContract.Entrees.IMAGE_NAME, "mcdocafeexpressosegafredo");
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Petit déjeuner");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Ristretto");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 0);
        cv.put(McDoContract.Entrees.GLU_LENT, 0);
        cv.put(McDoContract.Entrees.IMAGE_NAME, "mcdoristretto");
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Petit déjeuner");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Noisette");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 1);
        cv.put(McDoContract.Entrees.GLU_LENT, 0);
        cv.put(McDoContract.Entrees.IMAGE_NAME, "nopicture");
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Petit déjeuner");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Sirop aromatisé Erable");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 76);
        cv.put(McDoContract.Entrees.GLU_LENT, 0);
        cv.put(McDoContract.Entrees.IMAGE_NAME, "nopicture");
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Petit déjeuner");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Stick pâte à tartiner");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 59);
        cv.put(McDoContract.Entrees.GLU_LENT, 6);
        cv.put(McDoContract.Entrees.IMAGE_NAME, "nopicture");
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Petit déjeuner");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Confiture extra de fraise ou d'abricot");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 53);
        cv.put(McDoContract.Entrees.GLU_LENT, 0);
        cv.put(McDoContract.Entrees.IMAGE_NAME, "mcdoconfiturefraise");
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Petit déjeuner");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Minute Maid (20cl)");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 11);
        cv.put(McDoContract.Entrees.GLU_LENT, 0);
        cv.put(McDoContract.Entrees.IMAGE_NAME, "mcdominutemaidvingtcl");
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Petit déjeuner");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Cappuccino");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 3);
        cv.put(McDoContract.Entrees.GLU_LENT, 0);
        cv.put(McDoContract.Entrees.IMAGE_NAME, "mcdocappucino");
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Petit déjeuner");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Cappuccino Daim");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 3);
        cv.put(McDoContract.Entrees.GLU_LENT, 3);
        cv.put(McDoContract.Entrees.IMAGE_NAME, "mcdocappucinodaim");
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Petit déjeuner");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Double Latte");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 3);
        cv.put(McDoContract.Entrees.GLU_LENT, 0);
        cv.put(McDoContract.Entrees.IMAGE_NAME, "mcdodoublelatte");
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Petit déjeuner");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "Boisson chaude Banania");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 5);
        cv.put(McDoContract.Entrees.GLU_LENT, 7);
        cv.put(McDoContract.Entrees.IMAGE_NAME, "nopicture");
        list.add(cv);

        cv = new ContentValues();
        cv.put(McDoContract.Entrees.CATEGORIE, "Petit déjeuner");
        cv.put(McDoContract.Entrees.PRODUCT_NAME, "P'tite pomme");
        cv.put(McDoContract.Entrees.GLU_RAPIDE, 11);
        cv.put(McDoContract.Entrees.GLU_LENT, 0);
        cv.put(McDoContract.Entrees.IMAGE_NAME, "mcdoptitepomme");
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
