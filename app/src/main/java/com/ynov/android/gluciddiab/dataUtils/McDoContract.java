package com.ynov.android.gluciddiab.dataUtils;

import android.provider.BaseColumns;

/**
 * Created by antonin on 30/03/2017.
 */

// contrat qui definit la forme de la table

public class McDoContract {
    public static final class Entrees implements BaseColumns {
        public static final String TABLE_NAME = "McDoData";
        public static final String CATEGORIE = "Catégorie";
        public static final String PRODUCT_NAME = "NomDuProduit";
        public static final String GLU_RAPIDE = "GlucideRapide";
        public static final String GLU_LENT = "GlucideLent";
        public static final String COLUMN_TIMESTAMP = "Timestamp";
    }
}
