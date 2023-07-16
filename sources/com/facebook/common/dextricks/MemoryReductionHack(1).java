package com.facebook.common.dextricks;

import X.AnonymousClass00U;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.facebookpay.offsite.models.message.ServerW3CShippingAddressConstants;
import dalvik.system.BaseDexClassLoader;
import dalvik.system.PathClassLoader;
import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.Field;

public final class MemoryReductionHack {
    public static final String TAG = "MemoryReductionHack";

    public static Object getDexPathList(BaseDexClassLoader baseDexClassLoader) {
        return getField(baseDexClassLoader, BaseDexClassLoader.class, "pathList");
    }

    public static File getFileOrZip(Object obj, int i) {
        if (i <= 22) {
            try {
                return (File) getField(obj, obj.getClass(), "file");
            } catch (NoSuchFieldException unused) {
            }
        }
        return (File) getField(obj, obj.getClass(), ServerW3CShippingAddressConstants.POSTAL_CODE);
    }

    public static Object getDexElementsArray(Object obj) {
        return getField(obj, obj.getClass(), "dexElements");
    }

    public static Object getField(Object obj, Class cls, String str) {
        Field declaredField = cls.getDeclaredField(str);
        declaredField.setAccessible(true);
        return declaredField.get(obj);
    }

    public static void removeZipFromPathClassLoader(String str, PathClassLoader pathClassLoader) {
        Object dexElementsArray = getDexElementsArray(getDexPathList(pathClassLoader));
        int length = Array.getLength(dexElementsArray);
        int i = Build.VERSION.SDK_INT;
        int i2 = 0;
        while (i2 < length) {
            Object obj = Array.get(dexElementsArray, i2);
            File fileOrZip = getFileOrZip(obj, i);
            if (fileOrZip == null || !str.equals(fileOrZip.getPath())) {
                i2++;
            } else {
                setField(obj, obj.getClass(), "initialized", true);
                return;
            }
        }
        Log.w(TAG, AnonymousClass00U.A0L("Could not find zipFile entry corresponding to path ", str));
    }

    public static void setField(Object obj, Class cls, String str, Object obj2) {
        Field declaredField = cls.getDeclaredField(str);
        declaredField.setAccessible(true);
        declaredField.set(obj, obj2);
    }

    public static void freeApkZip(Context context) {
    }
}
