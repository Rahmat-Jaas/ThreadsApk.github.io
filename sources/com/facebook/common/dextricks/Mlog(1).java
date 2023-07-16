package com.facebook.common.dextricks;

import X.AnonymousClass00U;
import android.util.Log;

public final class Mlog {
    public static final String TAG = "DexLibLoader";
    public static final boolean VERBOSE = true;

    public static void assertThat(boolean z, String str, Object... objArr) {
        if (!z) {
            String safeFmt = safeFmt(str, objArr);
            Log.e(TAG, safeFmt);
            throw new AssertionError(AnonymousClass00U.A0L("DexLibLoader: ", safeFmt));
        }
    }

    public static void d(Throwable th, String str, Object... objArr) {
        safeFmt(str, objArr);
    }

    public static void e(Throwable th, String str, Object... objArr) {
        Log.e(TAG, safeFmt(str, objArr), th);
    }

    public static void i(Throwable th, String str, Object... objArr) {
        safeFmt(str, objArr);
    }

    public static String safeFmt(String str, Object... objArr) {
        try {
            return String.format(str, objArr);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("[bad fmt: \"");
            sb.append(str);
            sb.append("\" (");
            sb.append(e);
            sb.append(")]");
            return sb.toString();
        }
    }

    public static void v(Throwable th, String str, Object... objArr) {
        safeFmt(str, objArr);
    }

    public static void w(Throwable th, String str, Object... objArr) {
        Log.w(TAG, safeFmt(str, objArr), th);
    }

    public static void d(String str, Object... objArr) {
        safeFmt(str, objArr);
    }

    public static void e(String str, Object... objArr) {
        Log.e(TAG, safeFmt(str, objArr));
    }

    public static void i(String str, Object... objArr) {
        safeFmt(str, objArr);
    }

    public static void v(String str, Object... objArr) {
        safeFmt(str, objArr);
    }

    public static void w(String str, Object... objArr) {
        Log.w(TAG, safeFmt(str, objArr));
    }
}
