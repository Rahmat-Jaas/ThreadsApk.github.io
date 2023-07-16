package com.mapbox.android.accounts.v1;

import X.AnonymousClass00U;
import X.C18180wK;
import X.C18200wM;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.security.SecureRandom;

public class MapboxAccounts {
    public static final String SKU_ID_MAPS_MAUS = "00";
    public static final String SKU_ID_NAVIGATION_MAUS = "02";
    public static final String SKU_ID_NAVIGATION_TRIPS = "03";

    public static String A01(Object[] objArr) {
        StringBuilder A0r = C18200wM.A0r();
        boolean z = true;
        for (Object obj : objArr) {
            if (z) {
                z = false;
            } else {
                A0r.append("");
            }
            A0r.append(obj);
        }
        return A0r.toString();
    }

    public static String obtainMapsSkuUserToken(String str) {
        return A01(new String[]{RealtimeSubscription.GRAPHQL_MQTT_VERSION, SKU_ID_MAPS_MAUS, A00(), str});
    }

    public static String obtainNavigationSkuSessionToken() {
        char[] charArray = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        char[] cArr = new char[10];
        SecureRandom secureRandom = new SecureRandom();
        int i = 0;
        do {
            cArr[i] = charArray[secureRandom.nextInt(charArray.length)];
            i++;
        } while (i < 10);
        return A01(new String[]{RealtimeSubscription.GRAPHQL_MQTT_VERSION, SKU_ID_NAVIGATION_TRIPS, new String(cArr)});
    }

    public static String obtainNavigationSkuUserToken(String str) {
        return A01(new String[]{RealtimeSubscription.GRAPHQL_MQTT_VERSION, SKU_ID_NAVIGATION_MAUS, A00(), str});
    }

    public static String A00() {
        String l = Long.toString(System.currentTimeMillis(), 36);
        int length = l.length();
        if (length > 8) {
            return l.substring(length - 8);
        }
        if (length < 8) {
            return String.format(AnonymousClass00U.A0S("%1$", "s", 8), new Object[]{l}).replace(" ", "0");
        }
        return l;
    }

    public static long getNow() {
        return System.currentTimeMillis();
    }

    public static String obtainEndUserId() {
        return C18180wK.A0e().replace("-", "");
    }
}
