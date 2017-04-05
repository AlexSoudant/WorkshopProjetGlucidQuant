package com.ynov.android.gluciddiab.dataUtils;

import android.content.ContentValues;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Malo on 30/03/2017.
 */

public class KfcData {
    public static void insertFastFoodData(SQLiteDatabase db){
        if(db == null){
            return;
        }

        List<ContentValues> list = new ArrayList<ContentValues>();


        /******************************************************************/
        /*                                                                */
        /*                      BUCKETS A PARTAGER                        */
        /*                                                                */
        /******************************************************************/


        ContentValues cv = new ContentValues();
        cv.put(KfcContract.KFCListEntry.CATEGORIE, "Buckets à partager");
        cv.put(KfcContract.KFCListEntry.PRODUCT_NAME, "Duo Tenders");
        cv.put(KfcContract.KFCListEntry.GLU_LENT, 31);
        cv.put(KfcContract.KFCListEntry.GLU_RAPIDE, 0);
        cv.put(KfcContract.KFCListEntry.IMAGE_NAME, "kfcbuckettenders.png");
        list.add(cv);

        cv = new ContentValues();
        cv.put(KfcContract.KFCListEntry.CATEGORIE, "Buckets à partager");
        cv.put(KfcContract.KFCListEntry.PRODUCT_NAME, "Duo Wings Hot");
        cv.put(KfcContract.KFCListEntry.GLU_LENT, 36);
        cv.put(KfcContract.KFCListEntry.GLU_RAPIDE, 0);
        cv.put(KfcContract.KFCListEntry.IMAGE_NAME, "kfcbuckethotwings.png");
        list.add(cv);

        cv = new ContentValues();
        cv.put(KfcContract.KFCListEntry.CATEGORIE, "Buckets à partager");
        cv.put(KfcContract.KFCListEntry.PRODUCT_NAME, "Duo Mix");
        cv.put(KfcContract.KFCListEntry.GLU_LENT, 35);
        cv.put(KfcContract.KFCListEntry.GLU_RAPIDE, 0);
        cv.put(KfcContract.KFCListEntry.IMAGE_NAME, "kfcbucketmixtendershotwings.png");
        list.add(cv);

        cv = new ContentValues();
        cv.put(KfcContract.KFCListEntry.CATEGORIE, "Buckets à partager");
        cv.put(KfcContract.KFCListEntry.PRODUCT_NAME, "Duo Mix + Pièces Hot (Pièces et Wings Hot)");
        cv.put(KfcContract.KFCListEntry.GLU_LENT, 32);
        cv.put(KfcContract.KFCListEntry.GLU_RAPIDE, 0);
        cv.put(KfcContract.KFCListEntry.IMAGE_NAME, "kfcbucketmixtendershotwings.png");
        list.add(cv);

        cv = new ContentValues();
        cv.put(KfcContract.KFCListEntry.CATEGORIE, "Buckets à partager");
        cv.put(KfcContract.KFCListEntry.PRODUCT_NAME, "Duo Mix + Pièces Hot (Pièces et Tenders)");
        cv.put(KfcContract.KFCListEntry.GLU_LENT, 29);
        cv.put(KfcContract.KFCListEntry.GLU_RAPIDE, 0);
        cv.put(KfcContract.KFCListEntry.IMAGE_NAME, "kfcbucketmixtendershotwings.png");
        list.add(cv);

        cv = new ContentValues();
        cv.put(KfcContract.KFCListEntry.CATEGORIE, "Buckets à partager");
        cv.put(KfcContract.KFCListEntry.PRODUCT_NAME, "Duo Mix + Pièces OR (Pièces et Wings Hot)");
        cv.put(KfcContract.KFCListEntry.GLU_LENT, 34);
        cv.put(KfcContract.KFCListEntry.GLU_RAPIDE, 0);
        cv.put(KfcContract.KFCListEntry.IMAGE_NAME, "kfcbucketmixorhot.png");
        list.add(cv);

        cv = new ContentValues();
        cv.put(KfcContract.KFCListEntry.CATEGORIE, "Buckets à partager");
        cv.put(KfcContract.KFCListEntry.PRODUCT_NAME, "Duo Mix + Pièces OR (Pièces et Tenders)");
        cv.put(KfcContract.KFCListEntry.GLU_LENT, 31);
        cv.put(KfcContract.KFCListEntry.GLU_RAPIDE, 0);
        cv.put(KfcContract.KFCListEntry.IMAGE_NAME, "kfcbucketmixorhot.png");
        list.add(cv);

        cv = new ContentValues();
        cv.put(KfcContract.KFCListEntry.CATEGORIE, "Buckets à partager");
        cv.put(KfcContract.KFCListEntry.PRODUCT_NAME, "Maxi Tenders");
        cv.put(KfcContract.KFCListEntry.GLU_LENT, 26);
        cv.put(KfcContract.KFCListEntry.GLU_RAPIDE, 0);
        cv.put(KfcContract.KFCListEntry.IMAGE_NAME, "kfcmaxibuckettenders.png");
        list.add(cv);

        cv = new ContentValues();
        cv.put(KfcContract.KFCListEntry.CATEGORIE, "Buckets à partager");
        cv.put(KfcContract.KFCListEntry.PRODUCT_NAME, "Maxi Wings Hot");
        cv.put(KfcContract.KFCListEntry.GLU_LENT, 30);
        cv.put(KfcContract.KFCListEntry.GLU_RAPIDE, 0);
        cv.put(KfcContract.KFCListEntry.IMAGE_NAME, "kfcmaxibuckethotwings.png");
        list.add(cv);

        cv = new ContentValues();
        cv.put(KfcContract.KFCListEntry.CATEGORIE, "Buckets à partager");
        cv.put(KfcContract.KFCListEntry.PRODUCT_NAME, "Big Mix (Tenders et Hot wings)");
        cv.put(KfcContract.KFCListEntry.GLU_LENT, 66);
        cv.put(KfcContract.KFCListEntry.GLU_RAPIDE, 0);
        cv.put(KfcContract.KFCListEntry.IMAGE_NAME, "kfcbigbucketmixtendershotwings.png");
        list.add(cv);

        cv = new ContentValues();
        cv.put(KfcContract.KFCListEntry.CATEGORIE, "Buckets à partager");
        cv.put(KfcContract.KFCListEntry.PRODUCT_NAME, "Big Mix + Pièces Hot");
        cv.put(KfcContract.KFCListEntry.GLU_LENT, 31);
        cv.put(KfcContract.KFCListEntry.GLU_RAPIDE, 0);
        cv.put(KfcContract.KFCListEntry.IMAGE_NAME, "kfcbigbucketmixorhot.png");
        list.add(cv);

        cv = new ContentValues();
        cv.put(KfcContract.KFCListEntry.CATEGORIE, "Buckets à partager");
        cv.put(KfcContract.KFCListEntry.PRODUCT_NAME, "Big Mix + Pièces OR");
        cv.put(KfcContract.KFCListEntry.GLU_LENT, 34);
        cv.put(KfcContract.KFCListEntry.GLU_RAPIDE, 0);
        cv.put(KfcContract.KFCListEntry.IMAGE_NAME, "kfcbigbucketmixorhot.png");
        list.add(cv);


        /******************************************************************/
        /*                                                                */
        /*                           SANDWICHES                           */
        /*                                                                */
        /******************************************************************/


        cv = new ContentValues();
        cv.put(KfcContract.KFCListEntry.CATEGORIE, "Sandwiches");
        cv.put(KfcContract.KFCListEntry.PRODUCT_NAME, "Krunchy sauce burger");
        cv.put(KfcContract.KFCListEntry.GLU_LENT, 25);
        cv.put(KfcContract.KFCListEntry.GLU_RAPIDE, 4);
        cv.put(KfcContract.KFCListEntry.IMAGE_NAME, "kfckrunchy.png");
        list.add(cv);

        cv = new ContentValues();
        cv.put(KfcContract.KFCListEntry.CATEGORIE, "Sandwiches");
        cv.put(KfcContract.KFCListEntry.PRODUCT_NAME, "Twister Tenders");
        cv.put(KfcContract.KFCListEntry.GLU_LENT, 26);
        cv.put(KfcContract.KFCListEntry.GLU_RAPIDE, 1);
        cv.put(KfcContract.KFCListEntry.IMAGE_NAME, "kfctwistertenders.jpg");
        list.add(cv);

        cv = new ContentValues();
        cv.put(KfcContract.KFCListEntry.CATEGORIE, "Sandwiches");
        cv.put(KfcContract.KFCListEntry.PRODUCT_NAME, "The B.O.S.S Bacon");
        cv.put(KfcContract.KFCListEntry.GLU_LENT, 33);
        cv.put(KfcContract.KFCListEntry.GLU_RAPIDE, 5);
        cv.put(KfcContract.KFCListEntry.IMAGE_NAME, "kfcbossbacon.png");
        list.add(cv);

        cv = new ContentValues();
        cv.put(KfcContract.KFCListEntry.CATEGORIE, "Sandwiches");
        cv.put(KfcContract.KFCListEntry.PRODUCT_NAME, "Brazer");
        cv.put(KfcContract.KFCListEntry.GLU_LENT, 30);
        cv.put(KfcContract.KFCListEntry.GLU_RAPIDE, 7);
        cv.put(KfcContract.KFCListEntry.IMAGE_NAME, "kfcbrazer.png");
        list.add(cv);

        cv = new ContentValues();
        cv.put(KfcContract.KFCListEntry.CATEGORIE, "Sandwiches");
        cv.put(KfcContract.KFCListEntry.PRODUCT_NAME, "Tower Original");
        cv.put(KfcContract.KFCListEntry.GLU_LENT, 59);
        cv.put(KfcContract.KFCListEntry.GLU_RAPIDE, 10);
        cv.put(KfcContract.KFCListEntry.IMAGE_NAME, "kfctower.png");
        list.add(cv);

        cv = new ContentValues();
        cv.put(KfcContract.KFCListEntry.CATEGORIE, "Sandwiches");
        cv.put(KfcContract.KFCListEntry.PRODUCT_NAME, "Tower Zinger");
        cv.put(KfcContract.KFCListEntry.GLU_LENT, 21);
        cv.put(KfcContract.KFCListEntry.GLU_RAPIDE, 10);
        cv.put(KfcContract.KFCListEntry.IMAGE_NAME, "kfctower.png");
        list.add(cv);

        cv = new ContentValues();
        cv.put(KfcContract.KFCListEntry.CATEGORIE, "Sandwiches");
        cv.put(KfcContract.KFCListEntry.PRODUCT_NAME, "Boxmaster OR");
        cv.put(KfcContract.KFCListEntry.GLU_LENT, 58);
        cv.put(KfcContract.KFCListEntry.GLU_RAPIDE, 1);
        cv.put(KfcContract.KFCListEntry.IMAGE_NAME, "kfcboxmaster.png");
        list.add(cv);

        cv = new ContentValues();
        cv.put(KfcContract.KFCListEntry.CATEGORIE, "Sandwiches");
        cv.put(KfcContract.KFCListEntry.PRODUCT_NAME, "Boxmaster Zinger");
        cv.put(KfcContract.KFCListEntry.GLU_LENT, 42);
        cv.put(KfcContract.KFCListEntry.GLU_RAPIDE, 1);
        cv.put(KfcContract.KFCListEntry.IMAGE_NAME, "kfcboxmaster.png");
        list.add(cv);

        cv = new ContentValues();
        cv.put(KfcContract.KFCListEntry.CATEGORIE, "Sandwiches");
        cv.put(KfcContract.KFCListEntry.PRODUCT_NAME, "Boxmaster Fish");
        cv.put(KfcContract.KFCListEntry.GLU_LENT, 57);
        cv.put(KfcContract.KFCListEntry.GLU_RAPIDE, 4);
        cv.put(KfcContract.KFCListEntry.IMAGE_NAME, "kfcboxmaster.png");
        list.add(cv);

        cv = new ContentValues();
        cv.put(KfcContract.KFCListEntry.CATEGORIE, "Sandwiches");
        cv.put(KfcContract.KFCListEntry.PRODUCT_NAME, "Boxmaster Maxx OR");
        cv.put(KfcContract.KFCListEntry.GLU_LENT, 67);
        cv.put(KfcContract.KFCListEntry.GLU_RAPIDE, 2);
        cv.put(KfcContract.KFCListEntry.IMAGE_NAME, "kfcboxmaster.png");
        list.add(cv);

        cv = new ContentValues();
        cv.put(KfcContract.KFCListEntry.CATEGORIE, "Sandwiches");
        cv.put(KfcContract.KFCListEntry.PRODUCT_NAME, "Boxmaster Freestyle");
        cv.put(KfcContract.KFCListEntry.GLU_LENT, 60);
        cv.put(KfcContract.KFCListEntry.GLU_RAPIDE, 3);
        cv.put(KfcContract.KFCListEntry.IMAGE_NAME, "kfcboxmaster.png");
        list.add(cv);

        cv = new ContentValues();
        cv.put(KfcContract.KFCListEntry.CATEGORIE, "Sandwiches");
        cv.put(KfcContract.KFCListEntry.PRODUCT_NAME, "I-twist 2HOT4U");
        cv.put(KfcContract.KFCListEntry.GLU_LENT, 28);
        cv.put(KfcContract.KFCListEntry.GLU_RAPIDE, 5);
        cv.put(KfcContract.KFCListEntry.IMAGE_NAME, "kfcitwist.jpg");
        list.add(cv);

        cv = new ContentValues();
        cv.put(KfcContract.KFCListEntry.CATEGORIE, "Sandwiches");
        cv.put(KfcContract.KFCListEntry.PRODUCT_NAME, "I-twist cheese");
        cv.put(KfcContract.KFCListEntry.GLU_LENT, 24);
        cv.put(KfcContract.KFCListEntry.GLU_RAPIDE, 2);
        cv.put(KfcContract.KFCListEntry.IMAGE_NAME, "kfcitwist.jpg");
        list.add(cv);

        cv = new ContentValues();
        cv.put(KfcContract.KFCListEntry.CATEGORIE, "Sandwiches");
        cv.put(KfcContract.KFCListEntry.PRODUCT_NAME, "Chizza");
        cv.put(KfcContract.KFCListEntry.GLU_LENT, 27);
        cv.put(KfcContract.KFCListEntry.GLU_RAPIDE, 3);
        cv.put(KfcContract.KFCListEntry.IMAGE_NAME, "nopicture.jpeg");
        list.add(cv);

        cv = new ContentValues();
        cv.put(KfcContract.KFCListEntry.CATEGORIE, "Sandwiches");
        cv.put(KfcContract.KFCListEntry.PRODUCT_NAME, "Double Stacker Cheese & Bacon");
        cv.put(KfcContract.KFCListEntry.GLU_LENT, 45);
        cv.put(KfcContract.KFCListEntry.GLU_RAPIDE, 7);
        cv.put(KfcContract.KFCListEntry.IMAGE_NAME, "kfcdoublestacker.jpg");
        list.add(cv);

        cv = new ContentValues();
        cv.put(KfcContract.KFCListEntry.CATEGORIE, "Sandwiches");
        cv.put(KfcContract.KFCListEntry.PRODUCT_NAME, "Double Stacker Zinger");
        cv.put(KfcContract.KFCListEntry.GLU_LENT, 52);
        cv.put(KfcContract.KFCListEntry.GLU_RAPIDE, 12);
        cv.put(KfcContract.KFCListEntry.IMAGE_NAME, "kfcdoublestacker.jpg");
        list.add(cv);

        /******************************************************************/
        /*                                                                */
        /*                             SALADES                            */
        /*                                                                */
        /******************************************************************/

        cv = new ContentValues();
        cv.put(KfcContract.KFCListEntry.CATEGORIE, "Salades");
        cv.put(KfcContract.KFCListEntry.PRODUCT_NAME, "Salade Caesar Poulet cuit au four (sans sauce)");
        cv.put(KfcContract.KFCListEntry.GLU_LENT, 12);
        cv.put(KfcContract.KFCListEntry.GLU_RAPIDE, 7);
        cv.put(KfcContract.KFCListEntry.IMAGE_NAME, "kfcsaladecaesar.png");
        list.add(cv);

        cv = new ContentValues();
        cv.put(KfcContract.KFCListEntry.CATEGORIE, "Salades");
        cv.put(KfcContract.KFCListEntry.PRODUCT_NAME, "Salade Chèvre Noix Tenders (sans sauce)");
        cv.put(KfcContract.KFCListEntry.GLU_LENT, 10);
        cv.put(KfcContract.KFCListEntry.GLU_RAPIDE, 3);
        cv.put(KfcContract.KFCListEntry.IMAGE_NAME, "kfcsaladechevrenoix.png");
        list.add(cv);

        /******************************************************************/
        /*                                                                */
        /*                  PIECES DE POULET / POISSON                    */
        /*                                                                */
        /******************************************************************/

        cv = new ContentValues();
        cv.put(KfcContract.KFCListEntry.CATEGORIE, "Pièces de Poulet / Poisson");
        cv.put(KfcContract.KFCListEntry.PRODUCT_NAME, "Tenders 2");
        cv.put(KfcContract.KFCListEntry.GLU_LENT, 10);
        cv.put(KfcContract.KFCListEntry.GLU_RAPIDE, 0);
        cv.put(KfcContract.KFCListEntry.IMAGE_NAME, "kfctenders.png");
        list.add(cv);

        cv = new ContentValues();
        cv.put(KfcContract.KFCListEntry.CATEGORIE, "Pièces de Poulet / Poisson");
        cv.put(KfcContract.KFCListEntry.PRODUCT_NAME, "Tenders 4");
        cv.put(KfcContract.KFCListEntry.GLU_LENT, 21);
        cv.put(KfcContract.KFCListEntry.GLU_RAPIDE, 0);
        cv.put(KfcContract.KFCListEntry.IMAGE_NAME, "kfctenders.png");
        list.add(cv);

        cv = new ContentValues();
        cv.put(KfcContract.KFCListEntry.CATEGORIE, "Pièces de Poulet / Poisson");
        cv.put(KfcContract.KFCListEntry.PRODUCT_NAME, "Tenders 5");
        cv.put(KfcContract.KFCListEntry.GLU_LENT, 26);
        cv.put(KfcContract.KFCListEntry.GLU_RAPIDE, 0);
        cv.put(KfcContract.KFCListEntry.IMAGE_NAME, "kfctenders.png");
        list.add(cv);

        cv = new ContentValues();
        cv.put(KfcContract.KFCListEntry.CATEGORIE, "Pièces de Poulet / Poisson");
        cv.put(KfcContract.KFCListEntry.PRODUCT_NAME, "Wings Hot 3");
        cv.put(KfcContract.KFCListEntry.GLU_LENT, 11);
        cv.put(KfcContract.KFCListEntry.GLU_RAPIDE, 0);
        cv.put(KfcContract.KFCListEntry.IMAGE_NAME, "kfcwingshot.png");
        list.add(cv);

        cv = new ContentValues();
        cv.put(KfcContract.KFCListEntry.CATEGORIE, "Pièces de Poulet / Poisson");
        cv.put(KfcContract.KFCListEntry.PRODUCT_NAME, "Wings Hot 6");
        cv.put(KfcContract.KFCListEntry.GLU_LENT, 22);
        cv.put(KfcContract.KFCListEntry.GLU_RAPIDE, 0);
        cv.put(KfcContract.KFCListEntry.IMAGE_NAME, "kfcwingshot.png");
        list.add(cv);

        cv = new ContentValues();
        cv.put(KfcContract.KFCListEntry.CATEGORIE, "Pièces de Poulet / Poisson");
        cv.put(KfcContract.KFCListEntry.PRODUCT_NAME, "Wings Hot 9");
        cv.put(KfcContract.KFCListEntry.GLU_LENT, 32);
        cv.put(KfcContract.KFCListEntry.GLU_RAPIDE, 0);
        cv.put(KfcContract.KFCListEntry.IMAGE_NAME, "kfcwingshot.png");
        list.add(cv);

        cv = new ContentValues();
        cv.put(KfcContract.KFCListEntry.CATEGORIE, "Pièces de Poulet / Poisson");
        cv.put(KfcContract.KFCListEntry.PRODUCT_NAME, "Pièces OR 2");
        cv.put(KfcContract.KFCListEntry.GLU_LENT, 16);
        cv.put(KfcContract.KFCListEntry.GLU_RAPIDE, 0);
        cv.put(KfcContract.KFCListEntry.IMAGE_NAME, "kfcpiecespouletor.png");
        list.add(cv);

        cv = new ContentValues();
        cv.put(KfcContract.KFCListEntry.CATEGORIE, "Pièces de Poulet / Poisson");
        cv.put(KfcContract.KFCListEntry.PRODUCT_NAME, "Pièces Hot 2");
        cv.put(KfcContract.KFCListEntry.GLU_LENT, 14);
        cv.put(KfcContract.KFCListEntry.GLU_RAPIDE, 0);
        cv.put(KfcContract.KFCListEntry.IMAGE_NAME, "kfcpiecehot.png");
        list.add(cv);

        cv = new ContentValues();
        cv.put(KfcContract.KFCListEntry.CATEGORIE, "Pièces de Poulet / Poisson");
        cv.put(KfcContract.KFCListEntry.PRODUCT_NAME, "Fish 2");
        cv.put(KfcContract.KFCListEntry.GLU_LENT, 18);
        cv.put(KfcContract.KFCListEntry.GLU_RAPIDE, 0);
        cv.put(KfcContract.KFCListEntry.IMAGE_NAME, "nopicture.jpeg");
        list.add(cv);

        /******************************************************************/
        /*                                                                */
        /*                        ACCOMPAGNEMENTS                         */
        /*                                                                */
        /******************************************************************/


        cv = new ContentValues();
        cv.put(KfcContract.KFCListEntry.CATEGORIE, "Accompagnements");
        cv.put(KfcContract.KFCListEntry.PRODUCT_NAME, "4 Tomates cerises");
        cv.put(KfcContract.KFCListEntry.GLU_LENT, 1);
        cv.put(KfcContract.KFCListEntry.GLU_RAPIDE, 1);
        cv.put(KfcContract.KFCListEntry.IMAGE_NAME, "kfctomatescerises.png");
        list.add(cv);

        cv = new ContentValues();
        cv.put(KfcContract.KFCListEntry.CATEGORIE, "Accompagnements");
        cv.put(KfcContract.KFCListEntry.PRODUCT_NAME, "Cobette");
        cv.put(KfcContract.KFCListEntry.GLU_LENT, 22);
        cv.put(KfcContract.KFCListEntry.GLU_RAPIDE, 4);
        cv.put(KfcContract.KFCListEntry.IMAGE_NAME, "kfccobette.png");
        list.add(cv);

        cv = new ContentValues();
        cv.put(KfcContract.KFCListEntry.CATEGORIE, "Accompagnements");
        cv.put(KfcContract.KFCListEntry.PRODUCT_NAME, "Frites petites salées");
        cv.put(KfcContract.KFCListEntry.GLU_LENT, 32);
        cv.put(KfcContract.KFCListEntry.GLU_RAPIDE, 0);
        cv.put(KfcContract.KFCListEntry.IMAGE_NAME, "kfcfrites.png");
        list.add(cv);

        cv = new ContentValues();
        cv.put(KfcContract.KFCListEntry.CATEGORIE, "Accompagnements");
        cv.put(KfcContract.KFCListEntry.PRODUCT_NAME, "Frites normales salées");
        cv.put(KfcContract.KFCListEntry.GLU_LENT, 34);
        cv.put(KfcContract.KFCListEntry.GLU_RAPIDE, 1);
        cv.put(KfcContract.KFCListEntry.IMAGE_NAME, "kfcfrites.png");
        list.add(cv);

        cv = new ContentValues();
        cv.put(KfcContract.KFCListEntry.CATEGORIE, "Accompagnements");
        cv.put(KfcContract.KFCListEntry.PRODUCT_NAME, "Frites Grandes salées");
        cv.put(KfcContract.KFCListEntry.GLU_LENT, 49);
        cv.put(KfcContract.KFCListEntry.GLU_RAPIDE, 1);
        cv.put(KfcContract.KFCListEntry.IMAGE_NAME, "kfcfrites.png");
        list.add(cv);

        cv = new ContentValues();
        cv.put(KfcContract.KFCListEntry.CATEGORIE, "Accompagnements");
        cv.put(KfcContract.KFCListEntry.PRODUCT_NAME, "Petite salade (sans sauce)");
        cv.put(KfcContract.KFCListEntry.GLU_LENT, 1);
        cv.put(KfcContract.KFCListEntry.GLU_RAPIDE, 1);
        cv.put(KfcContract.KFCListEntry.IMAGE_NAME, "nopicture.jpeg");
        list.add(cv);

        cv = new ContentValues();
        cv.put(KfcContract.KFCListEntry.CATEGORIE, "Accompagnements");
        cv.put(KfcContract.KFCListEntry.PRODUCT_NAME, "Big shots raclette");
        cv.put(KfcContract.KFCListEntry.GLU_LENT, 8);
        cv.put(KfcContract.KFCListEntry.GLU_RAPIDE, 0);
        cv.put(KfcContract.KFCListEntry.IMAGE_NAME, "kfcbigshots.png");
        list.add(cv);

        cv = new ContentValues();
        cv.put(KfcContract.KFCListEntry.CATEGORIE, "Accompagnements");
        cv.put(KfcContract.KFCListEntry.PRODUCT_NAME, "Big shots Emmental");
        cv.put(KfcContract.KFCListEntry.GLU_LENT, 5);
        cv.put(KfcContract.KFCListEntry.GLU_RAPIDE, 0);
        cv.put(KfcContract.KFCListEntry.IMAGE_NAME, "kfcbigshots.png");
        list.add(cv);

        cv = new ContentValues();
        cv.put(KfcContract.KFCListEntry.CATEGORIE, "Accompagnements");
        cv.put(KfcContract.KFCListEntry.PRODUCT_NAME, "DIP'N'CRUNCH - Croustillant");
        cv.put(KfcContract.KFCListEntry.GLU_LENT, 16);
        cv.put(KfcContract.KFCListEntry.GLU_RAPIDE, 2);
        cv.put(KfcContract.KFCListEntry.IMAGE_NAME, "kfcdipncrunch.jpg");
        list.add(cv);

        cv = new ContentValues();
        cv.put(KfcContract.KFCListEntry.CATEGORIE, "Accompagnements");
        cv.put(KfcContract.KFCListEntry.PRODUCT_NAME, "Mini rostis");
        cv.put(KfcContract.KFCListEntry.GLU_LENT, 3);
        cv.put(KfcContract.KFCListEntry.GLU_RAPIDE, 0);
        cv.put(KfcContract.KFCListEntry.IMAGE_NAME, "nopicture.jpeg");
        list.add(cv);

        /******************************************************************/
        /*                                                                */
        /*                            DESSERTS                            */
        /*                                                                */
        /******************************************************************/

        cv = new ContentValues();
        cv.put(KfcContract.KFCListEntry.CATEGORIE, "Desserts");
        cv.put(KfcContract.KFCListEntry.PRODUCT_NAME, "Cookie cuit au chocolat au lait");
        cv.put(KfcContract.KFCListEntry.GLU_LENT, 13);
        cv.put(KfcContract.KFCListEntry.GLU_RAPIDE, 23);
        cv.put(KfcContract.KFCListEntry.IMAGE_NAME, "kfccookie.png");
        list.add(cv);

        cv = new ContentValues();
        cv.put(KfcContract.KFCListEntry.CATEGORIE, "Desserts");
        cv.put(KfcContract.KFCListEntry.PRODUCT_NAME, "Cookie triple chocolat");
        cv.put(KfcContract.KFCListEntry.GLU_LENT, 11);
        cv.put(KfcContract.KFCListEntry.GLU_RAPIDE, 21);
        cv.put(KfcContract.KFCListEntry.IMAGE_NAME, "kfccookie.png");
        list.add(cv);

        cv = new ContentValues();
        cv.put(KfcContract.KFCListEntry.CATEGORIE, "Desserts");
        cv.put(KfcContract.KFCListEntry.PRODUCT_NAME, "Mini cookies");
        cv.put(KfcContract.KFCListEntry.GLU_LENT, 7);
        cv.put(KfcContract.KFCListEntry.GLU_RAPIDE, 9);
        cv.put(KfcContract.KFCListEntry.IMAGE_NAME, "kfccookie.png");
        list.add(cv);

        cv = new ContentValues();
        cv.put(KfcContract.KFCListEntry.CATEGORIE, "Desserts");
        cv.put(KfcContract.KFCListEntry.PRODUCT_NAME, "Sundae nature");
        cv.put(KfcContract.KFCListEntry.GLU_LENT, 5);
        cv.put(KfcContract.KFCListEntry.GLU_RAPIDE, 19);
        cv.put(KfcContract.KFCListEntry.IMAGE_NAME, "kfcsundaess.png");
        list.add(cv);

        cv = new ContentValues();
        cv.put(KfcContract.KFCListEntry.CATEGORIE, "Desserts");
        cv.put(KfcContract.KFCListEntry.PRODUCT_NAME, "P'tit Yaourt Fraise");
        cv.put(KfcContract.KFCListEntry.GLU_LENT, 1);
        cv.put(KfcContract.KFCListEntry.GLU_RAPIDE, 11);
        cv.put(KfcContract.KFCListEntry.IMAGE_NAME, "kfcptityaourtfraise.png");
        list.add(cv);

        cv = new ContentValues();
        cv.put(KfcContract.KFCListEntry.CATEGORIE, "Desserts");
        cv.put(KfcContract.KFCListEntry.PRODUCT_NAME, "Andros Pocket");
        cv.put(KfcContract.KFCListEntry.GLU_LENT, 0);
        cv.put(KfcContract.KFCListEntry.GLU_RAPIDE, 14);
        cv.put(KfcContract.KFCListEntry.IMAGE_NAME, "kfcandrospocket.png");
        list.add(cv);

        /*
        cv = new ContentValues();
        cv.put(KfcContract.KFCListEntry.CATEGORIE, "Desserts");
        cv.put(KfcContract.KFCListEntry.PRODUCT_NAME, "Sundae saveur choc noisette");
        cv.put(KfcContract.KFCListEntry.GLU_LENT, );
        cv.put(KfcContract.KFCListEntry.GLU_RAPIDE, );
        list.add(cv);*/

        cv = new ContentValues();
        cv.put(KfcContract.KFCListEntry.CATEGORIE, "Desserts");
        cv.put(KfcContract.KFCListEntry.PRODUCT_NAME, "Sundae caramel");
        cv.put(KfcContract.KFCListEntry.GLU_LENT, 6);
        cv.put(KfcContract.KFCListEntry.GLU_RAPIDE, 30);
        cv.put(KfcContract.KFCListEntry.IMAGE_NAME, "kfcsundae.png");
        list.add(cv);

        cv = new ContentValues();
        cv.put(KfcContract.KFCListEntry.CATEGORIE, "Desserts");
        cv.put(KfcContract.KFCListEntry.PRODUCT_NAME, "Sundae Fraise");
        cv.put(KfcContract.KFCListEntry.GLU_LENT, 6);
        cv.put(KfcContract.KFCListEntry.GLU_RAPIDE, 23);
        cv.put(KfcContract.KFCListEntry.IMAGE_NAME, "kfcsundaefraise.png");
        list.add(cv);

        cv = new ContentValues();
        cv.put(KfcContract.KFCListEntry.CATEGORIE, "Desserts");
        cv.put(KfcContract.KFCListEntry.PRODUCT_NAME, "Moelleux chocolat");
        cv.put(KfcContract.KFCListEntry.GLU_LENT, 12);
        cv.put(KfcContract.KFCListEntry.GLU_RAPIDE, 25);
        cv.put(KfcContract.KFCListEntry.IMAGE_NAME, "kfcmoelleuxchocolat.png");
        list.add(cv);

        cv = new ContentValues();
        cv.put(KfcContract.KFCListEntry.CATEGORIE, "Desserts");
        cv.put(KfcContract.KFCListEntry.PRODUCT_NAME, "Tiramisu");
        cv.put(KfcContract.KFCListEntry.GLU_LENT, 7);
        cv.put(KfcContract.KFCListEntry.GLU_RAPIDE, 15);
        cv.put(KfcContract.KFCListEntry.IMAGE_NAME, "kfctiramisu.png");
        list.add(cv);

        cv = new ContentValues();
        cv.put(KfcContract.KFCListEntry.CATEGORIE, "Desserts");
        cv.put(KfcContract.KFCListEntry.PRODUCT_NAME, "Muffin aux myrtilles");
        cv.put(KfcContract.KFCListEntry.GLU_LENT, 18);
        cv.put(KfcContract.KFCListEntry.GLU_RAPIDE, 35);
        cv.put(KfcContract.KFCListEntry.IMAGE_NAME, "kfcmuffin.jpg");
        list.add(cv);

        cv = new ContentValues();
        cv.put(KfcContract.KFCListEntry.CATEGORIE, "Desserts");
        cv.put(KfcContract.KFCListEntry.PRODUCT_NAME, "Muffin chocolat cœur fondant choco-noisettes");
        cv.put(KfcContract.KFCListEntry.GLU_LENT, 10);
        cv.put(KfcContract.KFCListEntry.GLU_RAPIDE, 34);
        cv.put(KfcContract.KFCListEntry.IMAGE_NAME, "kfcmuffin.jpg");
        list.add(cv);

        cv = new ContentValues();
        cv.put(KfcContract.KFCListEntry.CATEGORIE, "Desserts");
        cv.put(KfcContract.KFCListEntry.PRODUCT_NAME, "Muffin Nutella au cœur fondant");
        cv.put(KfcContract.KFCListEntry.GLU_LENT, 15);
        cv.put(KfcContract.KFCListEntry.GLU_RAPIDE, 32);
        cv.put(KfcContract.KFCListEntry.IMAGE_NAME, "kfcmuffin.jpg");
        list.add(cv);

        cv = new ContentValues();
        cv.put(KfcContract.KFCListEntry.CATEGORIE, "Desserts");
        cv.put(KfcContract.KFCListEntry.PRODUCT_NAME, "Muffin Chocolat au cœur fondant");
        cv.put(KfcContract.KFCListEntry.GLU_LENT, 12);
        cv.put(KfcContract.KFCListEntry.GLU_RAPIDE, 31);
        cv.put(KfcContract.KFCListEntry.IMAGE_NAME, "kfcmuffin.jpg");
        list.add(cv);

        cv = new ContentValues();
        cv.put(KfcContract.KFCListEntry.CATEGORIE, "Desserts");
        cv.put(KfcContract.KFCListEntry.PRODUCT_NAME, "P'tit Flan");
        cv.put(KfcContract.KFCListEntry.GLU_LENT, 11);
        cv.put(KfcContract.KFCListEntry.GLU_RAPIDE, 11);
        cv.put(KfcContract.KFCListEntry.IMAGE_NAME, "kfcptitflan.png");
        list.add(cv);

        cv = new ContentValues();
        cv.put(KfcContract.KFCListEntry.CATEGORIE, "Desserts");
        cv.put(KfcContract.KFCListEntry.PRODUCT_NAME, "Kream Ball Fraise");
        cv.put(KfcContract.KFCListEntry.GLU_LENT, 22);
        cv.put(KfcContract.KFCListEntry.GLU_RAPIDE, 30);
        cv.put(KfcContract.KFCListEntry.IMAGE_NAME, "kfckreamballfraise.jpg");
        list.add(cv);

        cv = new ContentValues();
        cv.put(KfcContract.KFCListEntry.CATEGORIE, "Desserts");
        cv.put(KfcContract.KFCListEntry.PRODUCT_NAME, "Kream Ball Saveur Chocolat Noisettes");
        cv.put(KfcContract.KFCListEntry.GLU_LENT, 4);
        cv.put(KfcContract.KFCListEntry.GLU_RAPIDE, 49);
        cv.put(KfcContract.KFCListEntry.IMAGE_NAME, "kfckreamballchocolat.png");
        list.add(cv);

        cv = new ContentValues();
        cv.put(KfcContract.KFCListEntry.CATEGORIE, "Desserts");
        cv.put(KfcContract.KFCListEntry.PRODUCT_NAME, "Kream Ball Caramel");
        cv.put(KfcContract.KFCListEntry.GLU_LENT, 3);
        cv.put(KfcContract.KFCListEntry.GLU_RAPIDE, 48);
        cv.put(KfcContract.KFCListEntry.IMAGE_NAME, "kfckreamballcaramel.jpg");
        list.add(cv);

        cv = new ContentValues();
        cv.put(KfcContract.KFCListEntry.CATEGORIE, "Desserts");
        cv.put(KfcContract.KFCListEntry.PRODUCT_NAME, "Kream Ball Caramel au beurre salé");
        cv.put(KfcContract.KFCListEntry.GLU_LENT, 17);
        cv.put(KfcContract.KFCListEntry.GLU_RAPIDE, 48);
        cv.put(KfcContract.KFCListEntry.IMAGE_NAME, "kfckreamballcaramel.jpg");
        list.add(cv);


        /******************************************************************/
        /*                                                                */
        /*                        BOISSONS FROIDES                        */
        /*                                                                */
        /******************************************************************/


        cv = new ContentValues();
        cv.put(KfcContract.KFCListEntry.CATEGORIE, "Boissons Froides");
        cv.put(KfcContract.KFCListEntry.PRODUCT_NAME, "Bière Heineken 33cl");
        cv.put(KfcContract.KFCListEntry.GLU_LENT, 13);
        cv.put(KfcContract.KFCListEntry.GLU_RAPIDE, 0);
        cv.put(KfcContract.KFCListEntry.IMAGE_NAME, "kfcheineken.png");
        list.add(cv);

        cv = new ContentValues();
        cv.put(KfcContract.KFCListEntry.CATEGORIE, "Boissons Froides");
        cv.put(KfcContract.KFCListEntry.PRODUCT_NAME, "7UP 25cl");
        cv.put(KfcContract.KFCListEntry.GLU_LENT, 0);
        cv.put(KfcContract.KFCListEntry.GLU_RAPIDE, 26);
        cv.put(KfcContract.KFCListEntry.IMAGE_NAME, "kfcsevenup.png");
        list.add(cv);

        cv = new ContentValues();
        cv.put(KfcContract.KFCListEntry.CATEGORIE, "Boissons Froides");
        cv.put(KfcContract.KFCListEntry.PRODUCT_NAME, "7UP 33cl");
        cv.put(KfcContract.KFCListEntry.GLU_LENT, 0);
        cv.put(KfcContract.KFCListEntry.GLU_RAPIDE, 34);
        cv.put(KfcContract.KFCListEntry.IMAGE_NAME, "kfcsevenup.png");
        list.add(cv);

        cv = new ContentValues();
        cv.put(KfcContract.KFCListEntry.CATEGORIE, "Boissons Froides");
        cv.put(KfcContract.KFCListEntry.PRODUCT_NAME, "7UP 40cl");
        cv.put(KfcContract.KFCListEntry.GLU_LENT, 0);
        cv.put(KfcContract.KFCListEntry.GLU_RAPIDE, 42);
        cv.put(KfcContract.KFCListEntry.IMAGE_NAME, "kfcsevenup.png");
        list.add(cv);

        cv = new ContentValues();
        cv.put(KfcContract.KFCListEntry.CATEGORIE, "Boissons Froides");
        cv.put(KfcContract.KFCListEntry.PRODUCT_NAME, "7UP 50cl");
        cv.put(KfcContract.KFCListEntry.GLU_LENT, 0);
        cv.put(KfcContract.KFCListEntry.GLU_RAPIDE, 52);
        cv.put(KfcContract.KFCListEntry.IMAGE_NAME, "kfcsevenup.png");
        list.add(cv);

        cv = new ContentValues();
        cv.put(KfcContract.KFCListEntry.CATEGORIE, "Boissons Froides");
        cv.put(KfcContract.KFCListEntry.PRODUCT_NAME, "Orangina 25cl");
        cv.put(KfcContract.KFCListEntry.GLU_LENT, 0);
        cv.put(KfcContract.KFCListEntry.GLU_RAPIDE, 25);
        cv.put(KfcContract.KFCListEntry.IMAGE_NAME, "kfcorangina.jpg");
        list.add(cv);

        cv = new ContentValues();
        cv.put(KfcContract.KFCListEntry.CATEGORIE, "Boissons Froides");
        cv.put(KfcContract.KFCListEntry.PRODUCT_NAME, "Orangina 33cl");
        cv.put(KfcContract.KFCListEntry.GLU_LENT, 0);
        cv.put(KfcContract.KFCListEntry.GLU_RAPIDE, 33);
        cv.put(KfcContract.KFCListEntry.IMAGE_NAME, "kfcorangina.jpg");
        list.add(cv);

        cv = new ContentValues();
        cv.put(KfcContract.KFCListEntry.CATEGORIE, "Boissons Froides");
        cv.put(KfcContract.KFCListEntry.PRODUCT_NAME, "Orangina 40cl");
        cv.put(KfcContract.KFCListEntry.GLU_LENT, 0);
        cv.put(KfcContract.KFCListEntry.GLU_RAPIDE, 40);
        cv.put(KfcContract.KFCListEntry.IMAGE_NAME, "kfcorangina.jpg");
        list.add(cv);

        cv = new ContentValues();
        cv.put(KfcContract.KFCListEntry.CATEGORIE, "Boissons Froides");
        cv.put(KfcContract.KFCListEntry.PRODUCT_NAME, "Orangina 50cl");
        cv.put(KfcContract.KFCListEntry.GLU_LENT, 1);
        cv.put(KfcContract.KFCListEntry.GLU_RAPIDE, 50);
        cv.put(KfcContract.KFCListEntry.IMAGE_NAME, "kfcorangina.jpg");
        list.add(cv);

        /*
        cv = new ContentValues();
        cv.put(KfcContract.KFCListEntry.CATEGORIE, "Boissons Froides");
        cv.put(KfcContract.KFCListEntry.PRODUCT_NAME, "Orangina 1,5L");
        cv.put(KfcContract.KFCListEntry.GLU_LENT, );
        cv.put(KfcContract.KFCListEntry.GLU_RAPIDE, );
        cv.put(KfcContract.KFCListEntry.IMAGE_NAME, "kfcorangina.jpg");
        list.add(cv);*/

        cv = new ContentValues();
        cv.put(KfcContract.KFCListEntry.CATEGORIE, "Boissons Froides");
        cv.put(KfcContract.KFCListEntry.PRODUCT_NAME, "Lipton Ice Tea 25cl");
        cv.put(KfcContract.KFCListEntry.GLU_LENT, 1);
        cv.put(KfcContract.KFCListEntry.GLU_RAPIDE, 17);
        cv.put(KfcContract.KFCListEntry.IMAGE_NAME, "kfclipton.png");
        list.add(cv);

        cv = new ContentValues();
        cv.put(KfcContract.KFCListEntry.CATEGORIE, "Boissons Froides");
        cv.put(KfcContract.KFCListEntry.PRODUCT_NAME, "Lipton Ice Tea 33cl");
        cv.put(KfcContract.KFCListEntry.GLU_LENT, 0);
        cv.put(KfcContract.KFCListEntry.GLU_RAPIDE, 23);
        cv.put(KfcContract.KFCListEntry.IMAGE_NAME, "kfclipton.png");
        list.add(cv);

        cv = new ContentValues();
        cv.put(KfcContract.KFCListEntry.CATEGORIE, "Boissons Froides");
        cv.put(KfcContract.KFCListEntry.PRODUCT_NAME, "Lipton Ice Tea 40cl");
        cv.put(KfcContract.KFCListEntry.GLU_LENT, 1);
        cv.put(KfcContract.KFCListEntry.GLU_RAPIDE, 36);
        cv.put(KfcContract.KFCListEntry.IMAGE_NAME, "kfclipton.png");
        list.add(cv);

        cv = new ContentValues();
        cv.put(KfcContract.KFCListEntry.CATEGORIE, "Boissons Froides");
        cv.put(KfcContract.KFCListEntry.PRODUCT_NAME, "Lipton Ice Tea 50cl");
        cv.put(KfcContract.KFCListEntry.GLU_LENT, 1);
        cv.put(KfcContract.KFCListEntry.GLU_RAPIDE, 35);
        cv.put(KfcContract.KFCListEntry.IMAGE_NAME, "kfclipton.png");
        list.add(cv);

        cv = new ContentValues();
        cv.put(KfcContract.KFCListEntry.CATEGORIE, "Boissons Froides");
        cv.put(KfcContract.KFCListEntry.PRODUCT_NAME, "Lipton Ice Tea 1,5L");
        cv.put(KfcContract.KFCListEntry.GLU_LENT, 1);
        cv.put(KfcContract.KFCListEntry.GLU_RAPIDE, 26);
        cv.put(KfcContract.KFCListEntry.IMAGE_NAME, "kfclipton.png");
        list.add(cv);

        cv = new ContentValues();
        cv.put(KfcContract.KFCListEntry.CATEGORIE, "Boissons Froides");
        cv.put(KfcContract.KFCListEntry.PRODUCT_NAME, "Oasis Tropical 25cl");
        cv.put(KfcContract.KFCListEntry.GLU_LENT, 0);
        cv.put(KfcContract.KFCListEntry.GLU_RAPIDE, 23);
        cv.put(KfcContract.KFCListEntry.IMAGE_NAME, "kfcoasis.png");
        list.add(cv);

        cv = new ContentValues();
        cv.put(KfcContract.KFCListEntry.CATEGORIE, "Boissons Froides");
        cv.put(KfcContract.KFCListEntry.PRODUCT_NAME, "Oasis Tropical 33cl");
        cv.put(KfcContract.KFCListEntry.GLU_LENT, 0);
        cv.put(KfcContract.KFCListEntry.GLU_RAPIDE, 30);
        cv.put(KfcContract.KFCListEntry.IMAGE_NAME, "kfcoasis.png");
        list.add(cv);

        cv = new ContentValues();
        cv.put(KfcContract.KFCListEntry.CATEGORIE, "Boissons Froides");
        cv.put(KfcContract.KFCListEntry.PRODUCT_NAME, "Oasis Tropical 40cl");
        cv.put(KfcContract.KFCListEntry.GLU_LENT, 1);
        cv.put(KfcContract.KFCListEntry.GLU_RAPIDE, 36);
        cv.put(KfcContract.KFCListEntry.IMAGE_NAME, "kfcoasis.png");
        list.add(cv);

        cv = new ContentValues();
        cv.put(KfcContract.KFCListEntry.CATEGORIE, "Boissons Froides");
        cv.put(KfcContract.KFCListEntry.PRODUCT_NAME, "Oasis Tropical 50cl");
        cv.put(KfcContract.KFCListEntry.GLU_LENT, 0);
        cv.put(KfcContract.KFCListEntry.GLU_RAPIDE, 46);
        cv.put(KfcContract.KFCListEntry.IMAGE_NAME, "kfcoasis.png");
        list.add(cv);

        cv = new ContentValues();
        cv.put(KfcContract.KFCListEntry.CATEGORIE, "Boissons Froides");
        cv.put(KfcContract.KFCListEntry.PRODUCT_NAME, "Oasis Tropical 2L");
        cv.put(KfcContract.KFCListEntry.GLU_LENT, 0);
        cv.put(KfcContract.KFCListEntry.GLU_RAPIDE, 46);
        cv.put(KfcContract.KFCListEntry.IMAGE_NAME, "kfcoasis.png");
        list.add(cv);

        cv = new ContentValues();
        cv.put(KfcContract.KFCListEntry.CATEGORIE, "Boissons Froides");
        cv.put(KfcContract.KFCListEntry.PRODUCT_NAME, "Pepsi 25cl");
        cv.put(KfcContract.KFCListEntry.GLU_LENT, 0);
        cv.put(KfcContract.KFCListEntry.GLU_RAPIDE, 27);
        cv.put(KfcContract.KFCListEntry.IMAGE_NAME, "kfcpepsi.png");
        list.add(cv);

        cv = new ContentValues();
        cv.put(KfcContract.KFCListEntry.CATEGORIE, "Boissons Froides");
        cv.put(KfcContract.KFCListEntry.PRODUCT_NAME, "Pepsi 33cl");
        cv.put(KfcContract.KFCListEntry.GLU_LENT, 0);
        cv.put(KfcContract.KFCListEntry.GLU_RAPIDE, 36);
        cv.put(KfcContract.KFCListEntry.IMAGE_NAME, "kfcpepsi.png");
        list.add(cv);

        cv = new ContentValues();
        cv.put(KfcContract.KFCListEntry.CATEGORIE, "Boissons Froides");
        cv.put(KfcContract.KFCListEntry.PRODUCT_NAME, "Pepsi 40cl");
        cv.put(KfcContract.KFCListEntry.GLU_LENT, 0);
        cv.put(KfcContract.KFCListEntry.GLU_RAPIDE, 44);
        cv.put(KfcContract.KFCListEntry.IMAGE_NAME, "kfcpepsi.png");
        list.add(cv);

        cv = new ContentValues();
        cv.put(KfcContract.KFCListEntry.CATEGORIE, "Boissons Froides");
        cv.put(KfcContract.KFCListEntry.PRODUCT_NAME, "Pepsi 50cl");
        cv.put(KfcContract.KFCListEntry.GLU_LENT, 0);
        cv.put(KfcContract.KFCListEntry.GLU_RAPIDE, 55);
        cv.put(KfcContract.KFCListEntry.IMAGE_NAME, "kfcpepsi.png");
        list.add(cv);

        cv = new ContentValues();
        cv.put(KfcContract.KFCListEntry.CATEGORIE, "Boissons Froides");
        cv.put(KfcContract.KFCListEntry.PRODUCT_NAME, "Pepsi 1,5L");
        cv.put(KfcContract.KFCListEntry.GLU_LENT, 0);
        cv.put(KfcContract.KFCListEntry.GLU_RAPIDE, 41);
        cv.put(KfcContract.KFCListEntry.IMAGE_NAME, "kfcpepsi.png");
        list.add(cv);

        cv = new ContentValues();
        cv.put(KfcContract.KFCListEntry.CATEGORIE, "Boissons Froides");
        cv.put(KfcContract.KFCListEntry.PRODUCT_NAME, "Pepsi Max 25cl");
        cv.put(KfcContract.KFCListEntry.GLU_LENT, 0);
        cv.put(KfcContract.KFCListEntry.GLU_RAPIDE, 0);
        cv.put(KfcContract.KFCListEntry.IMAGE_NAME, "kfcpepsimax.png");
        list.add(cv);

        cv = new ContentValues();
        cv.put(KfcContract.KFCListEntry.CATEGORIE, "Boissons Froides");
        cv.put(KfcContract.KFCListEntry.PRODUCT_NAME, "Pepsi Max 33cl");
        cv.put(KfcContract.KFCListEntry.GLU_LENT, 0);
        cv.put(KfcContract.KFCListEntry.GLU_RAPIDE, 0);
        cv.put(KfcContract.KFCListEntry.IMAGE_NAME, "kfcpepsimax.png");
        list.add(cv);

        cv = new ContentValues();
        cv.put(KfcContract.KFCListEntry.CATEGORIE, "Boissons Froides");
        cv.put(KfcContract.KFCListEntry.PRODUCT_NAME, "Pepsi Max 40cl");
        cv.put(KfcContract.KFCListEntry.GLU_LENT, 0);
        cv.put(KfcContract.KFCListEntry.GLU_RAPIDE, 0);
        cv.put(KfcContract.KFCListEntry.IMAGE_NAME, "kfcpepsimax.png");
        list.add(cv);

        cv = new ContentValues();
        cv.put(KfcContract.KFCListEntry.CATEGORIE, "Boissons Froides");
        cv.put(KfcContract.KFCListEntry.PRODUCT_NAME, "Pepsi Max 50cl");
        cv.put(KfcContract.KFCListEntry.GLU_LENT, 0);
        cv.put(KfcContract.KFCListEntry.GLU_RAPIDE, 1);
        cv.put(KfcContract.KFCListEntry.IMAGE_NAME, "kfcpepsimax.png");
        list.add(cv);

        cv = new ContentValues();
        cv.put(KfcContract.KFCListEntry.CATEGORIE, "Boissons Froides");
        cv.put(KfcContract.KFCListEntry.PRODUCT_NAME, "Pepsi Max 1,5L");
        cv.put(KfcContract.KFCListEntry.GLU_LENT, 0);
        cv.put(KfcContract.KFCListEntry.GLU_RAPIDE, 1);
        cv.put(KfcContract.KFCListEntry.IMAGE_NAME, "kfcpepsimax.png");
        list.add(cv);

        cv = new ContentValues();
        cv.put(KfcContract.KFCListEntry.CATEGORIE, "Boissons Froides");
        cv.put(KfcContract.KFCListEntry.PRODUCT_NAME, "Vittel 33cl");
        cv.put(KfcContract.KFCListEntry.GLU_LENT, 0);
        cv.put(KfcContract.KFCListEntry.GLU_RAPIDE, 0);
        cv.put(KfcContract.KFCListEntry.IMAGE_NAME, "kfcvittel.png");
        list.add(cv);

        cv = new ContentValues();
        cv.put(KfcContract.KFCListEntry.CATEGORIE, "Boissons Froides");
        cv.put(KfcContract.KFCListEntry.PRODUCT_NAME, "Vittel 50cl");
        cv.put(KfcContract.KFCListEntry.GLU_LENT, 0);
        cv.put(KfcContract.KFCListEntry.GLU_RAPIDE, 0);
        cv.put(KfcContract.KFCListEntry.IMAGE_NAME, "kfcvittel.png");
        list.add(cv);

        cv = new ContentValues();
        cv.put(KfcContract.KFCListEntry.CATEGORIE, "Boissons Froides");
        cv.put(KfcContract.KFCListEntry.PRODUCT_NAME, "Perrier 33cl");
        cv.put(KfcContract.KFCListEntry.GLU_LENT, 0);
        cv.put(KfcContract.KFCListEntry.GLU_RAPIDE, 0);
        cv.put(KfcContract.KFCListEntry.IMAGE_NAME, "kfcperrier.png");
        list.add(cv);

        cv = new ContentValues();
        cv.put(KfcContract.KFCListEntry.CATEGORIE, "Boissons Froides");
        cv.put(KfcContract.KFCListEntry.PRODUCT_NAME, "Perrier 50cl");
        cv.put(KfcContract.KFCListEntry.GLU_LENT, 0);
        cv.put(KfcContract.KFCListEntry.GLU_RAPIDE, 0);
        cv.put(KfcContract.KFCListEntry.IMAGE_NAME, "kfcperrier.png");
        list.add(cv);

        cv = new ContentValues();
        cv.put(KfcContract.KFCListEntry.CATEGORIE, "Boissons Froides");
        cv.put(KfcContract.KFCListEntry.PRODUCT_NAME, "Tropicana Pure Premium 25cl");
        cv.put(KfcContract.KFCListEntry.GLU_LENT, 0);
        cv.put(KfcContract.KFCListEntry.GLU_RAPIDE, 25);
        cv.put(KfcContract.KFCListEntry.IMAGE_NAME, "kfctropicana.jpg");
        list.add(cv);

        /******************************************************************/
        /*                                                                */
        /*                        BOISSONS CHAUDES                        */
        /*                                                                */
        /******************************************************************/

        /*
        cv = new ContentValues();
        cv.put(KfcContract.KFCListEntry.CATEGORIE, "Boissons Chaudes");
        cv.put(KfcContract.KFCListEntry.PRODUCT_NAME, "Café");
        cv.put(KfcContract.KFCListEntry.GLU_LENT, );
        cv.put(KfcContract.KFCListEntry.GLU_RAPIDE, );
        list.add(cv);

        cv = new ContentValues();
        cv.put(KfcContract.KFCListEntry.CATEGORIE, "Boissons Chaudes");
        cv.put(KfcContract.KFCListEntry.PRODUCT_NAME, "Chocolat");
        cv.put(KfcContract.KFCListEntry.GLU_LENT, );
        cv.put(KfcContract.KFCListEntry.GLU_RAPIDE, );
        list.add(cv);

        cv = new ContentValues();
        cv.put(KfcContract.KFCListEntry.CATEGORIE, "Boissons Chaudes");
        cv.put(KfcContract.KFCListEntry.PRODUCT_NAME, "Lait");
        cv.put(KfcContract.KFCListEntry.GLU_LENT, );
        cv.put(KfcContract.KFCListEntry.GLU_RAPIDE, );
        list.add(cv);

        cv = new ContentValues();
        cv.put(KfcContract.KFCListEntry.CATEGORIE, "Boissons Chaudes");
        cv.put(KfcContract.KFCListEntry.PRODUCT_NAME, "Thé");
        cv.put(KfcContract.KFCListEntry.GLU_LENT, );
        cv.put(KfcContract.KFCListEntry.GLU_RAPIDE, );
        list.add(cv);*/

        /******************************************************************/
        /*                                                                */
        /*                             SAUCES                             */
        /*                                                                */
        /******************************************************************/

        /*
        cv = new ContentValues();
        cv.put(KfcContract.KFCListEntry.CATEGORIE, "Sauces");
        cv.put(KfcContract.KFCListEntry.PRODUCT_NAME, "2HOT4U");
        cv.put(KfcContract.KFCListEntry.GLU_LENT, );
        cv.put(KfcContract.KFCListEntry.GLU_RAPIDE, );
        list.add(cv);

        cv = new ContentValues();
        cv.put(KfcContract.KFCListEntry.CATEGORIE, "Sauces");
        cv.put(KfcContract.KFCListEntry.PRODUCT_NAME, "Creamy Curry");
        cv.put(KfcContract.KFCListEntry.GLU_LENT, );
        cv.put(KfcContract.KFCListEntry.GLU_RAPIDE, );
        list.add(cv);

        cv = new ContentValues();
        cv.put(KfcContract.KFCListEntry.CATEGORIE, "Sauces");
        cv.put(KfcContract.KFCListEntry.PRODUCT_NAME, "Smoky BBQ");
        cv.put(KfcContract.KFCListEntry.GLU_LENT, );
        cv.put(KfcContract.KFCListEntry.GLU_RAPIDE, );
        list.add(cv);

        cv = new ContentValues();
        cv.put(KfcContract.KFCListEntry.CATEGORIE, "Sauces");
        cv.put(KfcContract.KFCListEntry.PRODUCT_NAME, "Sweet Imperial");
        cv.put(KfcContract.KFCListEntry.GLU_LENT, );
        cv.put(KfcContract.KFCListEntry.GLU_RAPIDE, );
        list.add(cv);

        cv = new ContentValues();
        cv.put(KfcContract.KFCListEntry.CATEGORIE, "Sauces");
        cv.put(KfcContract.KFCListEntry.PRODUCT_NAME, "Originale Recipe");
        cv.put(KfcContract.KFCListEntry.GLU_LENT, );
        cv.put(KfcContract.KFCListEntry.GLU_RAPIDE, );
        list.add(cv);
        */

        cv = new ContentValues();
        cv.put(KfcContract.KFCListEntry.CATEGORIE, "Sauces");
        cv.put(KfcContract.KFCListEntry.PRODUCT_NAME, "Américaine");
        cv.put(KfcContract.KFCListEntry.GLU_LENT, 1);
        cv.put(KfcContract.KFCListEntry.GLU_RAPIDE, 3);
        cv.put(KfcContract.KFCListEntry.IMAGE_NAME, "nopicture.jpeg");
        list.add(cv);

        cv = new ContentValues();
        cv.put(KfcContract.KFCListEntry.CATEGORIE, "Sauces");
        cv.put(KfcContract.KFCListEntry.PRODUCT_NAME, "Mayonnaise stick");
        cv.put(KfcContract.KFCListEntry.GLU_LENT, 1);
        cv.put(KfcContract.KFCListEntry.GLU_RAPIDE, 0);
        cv.put(KfcContract.KFCListEntry.IMAGE_NAME, "nopicture.jpeg");
        list.add(cv);

        /*
        cv = new ContentValues();
        cv.put(KfcContract.KFCListEntry.CATEGORIE, "Sauces");
        cv.put(KfcContract.KFCListEntry.PRODUCT_NAME, "Ketchup stick");
        cv.put(KfcContract.KFCListEntry.GLU_LENT, );
        cv.put(KfcContract.KFCListEntry.GLU_RAPIDE, );
        list.add(cv);*/

        cv = new ContentValues();
        cv.put(KfcContract.KFCListEntry.CATEGORIE, "Sauces");
        cv.put(KfcContract.KFCListEntry.PRODUCT_NAME, "Huile pimentée");
        cv.put(KfcContract.KFCListEntry.GLU_LENT, 0);
        cv.put(KfcContract.KFCListEntry.GLU_RAPIDE, 0);
        cv.put(KfcContract.KFCListEntry.IMAGE_NAME, "nopicture.jpeg");
        list.add(cv);

        cv = new ContentValues();
        cv.put(KfcContract.KFCListEntry.CATEGORIE, "Sauces");
        cv.put(KfcContract.KFCListEntry.PRODUCT_NAME, "Salade - Nature (allégée)");
        cv.put(KfcContract.KFCListEntry.GLU_LENT, 1);
        cv.put(KfcContract.KFCListEntry.GLU_RAPIDE, 1);
        cv.put(KfcContract.KFCListEntry.IMAGE_NAME, "nopicture.jpeg");
        list.add(cv);

        cv = new ContentValues();
        cv.put(KfcContract.KFCListEntry.CATEGORIE, "Sauces");
        cv.put(KfcContract.KFCListEntry.PRODUCT_NAME, "Salade - Balsamique");
        cv.put(KfcContract.KFCListEntry.GLU_LENT, 0);
        cv.put(KfcContract.KFCListEntry.GLU_RAPIDE, 2);
        cv.put(KfcContract.KFCListEntry.IMAGE_NAME, "nopicture.jpeg");
        list.add(cv);

        cv = new ContentValues();
        cv.put(KfcContract.KFCListEntry.CATEGORIE, "Sauces");
        cv.put(KfcContract.KFCListEntry.PRODUCT_NAME, "Salade - Caesar");
        cv.put(KfcContract.KFCListEntry.GLU_LENT, 1);
        cv.put(KfcContract.KFCListEntry.GLU_RAPIDE, 4);
        cv.put(KfcContract.KFCListEntry.IMAGE_NAME, "nopicture.jpeg");
        list.add(cv);

        cv = new ContentValues();
        cv.put(KfcContract.KFCListEntry.CATEGORIE, "Sauces");
        cv.put(KfcContract.KFCListEntry.PRODUCT_NAME, "DIP'N'CRUNCH - Sauce au cheddar fondu");
        cv.put(KfcContract.KFCListEntry.GLU_LENT, 0);
        cv.put(KfcContract.KFCListEntry.GLU_RAPIDE, 1);
        cv.put(KfcContract.KFCListEntry.IMAGE_NAME, "nopicture.jpeg");
        list.add(cv);



        try
        {
            db.beginTransaction();
            for(ContentValues c:list){
                db.insert(KfcContract.KFCListEntry.TABLE_NAME, null, c);
            }
            db.setTransactionSuccessful();
        } catch(SQLException e) {

        } finally {
            db.endTransaction();
        }

    }
}
