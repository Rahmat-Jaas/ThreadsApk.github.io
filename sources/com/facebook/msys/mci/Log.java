package com.facebook.msys.mci;

import X.AnonymousClass0LU;
import X.AnonymousClass737;

public class Log {
    public static boolean sRegistered;

    public static native void registerLoggerNative(long j, int i, boolean z);

    public static native void setLogLevel(int i);

    public static void log(int i, String str) {
        if (AnonymousClass0LU.A01.isLoggable(i)) {
            AnonymousClass0LU.A01.log(i, "msys", str);
        }
    }

    static {
        AnonymousClass737.A00();
    }
}
