package com.ynov.android.gluciddiab.dataUtils;

import android.provider.BaseColumns;

/**
 * Created by Malo on 30/03/2017.
 */

public class KfcContract {
    public static final class KFCListEntry implements BaseColumns {
        public static final String TABLE_NAME = "kfcdata";
        public static final String CATEGORIE = "categorie";
        public static final String PRODUCT_NAME = "menuname";
        public static final String GLU_LENT = "glucoselent";
        public static final String GLU_RAPIDE = "glucoserapide";
        public static final String IMAGE_NAME = "image";
        public static final String COLUMN_TIMESTAMP = "timestamp";
    }
}
