package com.facebook.common.binderhooker;

import X.AnonymousClass0FR;
import X.AnonymousClass0K9;
import X.C15020qa;
import android.os.Build;
import android.os.IBinder;
import android.os.Parcel;
import java.lang.reflect.Field;

public final class NativeBinderHooker {
    public static final Field FIELD_Parcel_mNativePtr;
    public static final AnonymousClass0K9 ML;
    public static final boolean PLATFORM_SUPPORTED;

    public static native int nativeCallOriginalBinderOnTransact(long j, int i, long j2, long j3, int i2);

    public static native long nativeHookBinder(Object obj, Object obj2);

    public static native boolean nativeSetupBinderHooker();

    public static native boolean nativeUnhookBinder(long j);

    static {
        boolean z;
        AnonymousClass0K9 r2 = new AnonymousClass0K9("NativeBinderHooker");
        ML = r2;
        boolean z2 = true;
        if (AnonymousClass0FR.A00) {
            try {
                C15020qa.A0A("binderhookerjni");
                z = true;
            } catch (UnsatisfiedLinkError e) {
                ML.A04("Can't load Binder hooker lib", e);
            }
        } else {
            r2.A07("Binder hooking is not currently supported on Android %d.", Integer.valueOf(Build.VERSION.SDK_INT));
            z = false;
        }
        Field field = null;
        if (z) {
            try {
                Field declaredField = Parcel.class.getDeclaredField("mNativePtr");
                declaredField.setAccessible(true);
                field = declaredField;
            } catch (NoSuchFieldException e2) {
                ML.A04("Can't find Parcel mNativePtr", e2);
                z2 = false;
            }
            z &= z2;
        }
        FIELD_Parcel_mNativePtr = field;
        PLATFORM_SUPPORTED = z;
    }

    public static long fromNativeWriteBinderToParcelAndReturnParcelPtr(Object obj) {
        String str;
        AnonymousClass0K9 r0 = ML;
        Object[] objArr = new Object[1];
        if (obj != null) {
            str = obj.toString();
        } else {
            str = "<null binder>";
        }
        objArr[0] = str;
        try {
            Parcel obtain = Parcel.obtain();
            obtain.setDataPosition(0);
            obtain.writeStrongBinder((IBinder) obj);
            obtain.setDataPosition(0);
            Field field = FIELD_Parcel_mNativePtr;
            if (field != null) {
                return field.getLong(obtain);
            }
            throw new IllegalAccessException();
        } catch (ClassCastException | IllegalAccessException e) {
            ML.A0B(e, "Failed to write binder to parcel and return", new Object[0]);
            return -1;
        }
    }
}
