package com.instagram.strings;

import X.AnonymousClass006;
import X.AnonymousClass00U;
import X.AnonymousClass0IB;
import X.AnonymousClass0LU;
import X.C10450iM;
import X.C15020qa;
import android.os.Looper;
import com.facebook.jni.HybridData;
import java.util.concurrent.TimeUnit;

public final class StringBridge$NativeStringBridge {
    public static boolean sFailedToLoadStrings;
    public static boolean sTriedInitStatic;
    public final HybridData mHybridData = nativeInitHybrid();

    public static native HybridData nativeInitHybrid();

    public native String nativeGetInstagramString(String str);

    public static synchronized void initStatic() {
        Integer num;
        AnonymousClass0IB r6;
        Throwable th;
        String str;
        String str2;
        Integer num2;
        synchronized (StringBridge$NativeStringBridge.class) {
            if (!sTriedInitStatic) {
                sTriedInitStatic = true;
                long nanoTime = System.nanoTime();
                try {
                    C15020qa.A0A("scrambler");
                    C15020qa.A0A("strings");
                    if (Looper.getMainLooper() == Looper.myLooper()) {
                        long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - nanoTime);
                        th = new Throwable();
                        str = "StringBridge:loadOnMainThread";
                        AnonymousClass0LU.A0L(str, "StringBridge load on main - time=%sms", th, Long.valueOf(millis));
                        r6 = C10450iM.A00();
                        if (millis > 1000) {
                            num = AnonymousClass006.A0Y;
                        } else {
                            num = AnonymousClass006.A00;
                        }
                        str2 = AnonymousClass00U.A0T("StringBridge load on main - time=", "ms", millis);
                        r6.Ccy(num, str, str2, th);
                    }
                } catch (Throwable th2) {
                    if (Looper.getMainLooper() == Looper.myLooper()) {
                        long millis2 = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - nanoTime);
                        Throwable th3 = new Throwable();
                        AnonymousClass0LU.A0L("StringBridge:loadOnMainThread", "StringBridge load on main - time=%sms", th3, Long.valueOf(millis2));
                        AnonymousClass0IB A00 = C10450iM.A00();
                        if (millis2 > 1000) {
                            num2 = AnonymousClass006.A0Y;
                        } else {
                            num2 = AnonymousClass006.A00;
                        }
                        A00.Ccy(num2, "StringBridge:loadOnMainThread", AnonymousClass00U.A0T("StringBridge load on main - time=", "ms", millis2), th3);
                    }
                    throw th2;
                }
            }
        }
    }

    static {
        initStatic();
    }
}
