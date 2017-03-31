package com.ynov.android.gluciddiab.dataUtils;

import android.provider.BaseColumns;

/**
 * Created by admin on 31/03/17.
 */

public class ProtocoleGlucidesContract {

    public static final class ProtocoleGlucidesEntry implements BaseColumns {
        public static final String TABLE_NAME = "protocoleglucidesdata";
        public static final String GLU_LENT = "glulent";
        public static final String GLU_RAPIDE = "glurapide";
        public static final String COLUMN_TIMESTAMP = "timestamp";
    }
}


