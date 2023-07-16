package com.facebook.errorreporting.nightwatch;

import X.AnonymousClass00U;
import X.AnonymousClass0LU;
import X.AnonymousClass0qM;
import com.instagram.realtimeclient.RealtimeSubscription;

public class Nightwatch$NightwatchNative {
    public static final boolean CAN_USE_CRITICAL_NATIVE_METHODS;
    public static UnsatisfiedLinkError sCachedException;
    public static boolean sHasLinkedFastMethods;
    public static boolean sHasLinkedFastMethodsError;
    public static final Nightwatch$NightwatchNative sNightwatchNativeImpl = new Nightwatch$NightwatchNative();
    public static boolean sTryLoadedLib;

    public static native boolean nAddTestHook(int i, boolean z, String str, String str2, String str3);

    public static native int nRecordDataInNightWatch(long j, int i);

    public static native int nRecordDataInNightWatch_FAST_JNI(long j, int i);

    public static native int nRecordTickInNightWatch(long j, long j2, long j3, long j4);

    public static native int nRecordTickInNightWatch_FAST_JNI(long j, long j2, long j3, long j4);

    public static native boolean nSaveResourceData();

    public static native boolean nSaveResourceData_FAST_JNI();

    public static native int start(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, int i2, int i3, boolean z6, int i4, boolean z7, boolean z8, boolean z9, boolean z10);

    static {
        boolean z;
        try {
            Class.forName("dalvik.annotation.optimization.CriticalNative");
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        CAN_USE_CRITICAL_NATIVE_METHODS = z;
    }

    public static void loadNightWatchLib() {
        if (sTryLoadedLib) {
            UnsatisfiedLinkError unsatisfiedLinkError = sCachedException;
            if (unsatisfiedLinkError != null) {
                throw unsatisfiedLinkError;
            }
            return;
        }
        String property = System.getProperty("facebook.test.nightwatch.use_debug", (String) null);
        if (property != null && RealtimeSubscription.GRAPHQL_MQTT_VERSION.equals(property)) {
            StringBuilder sb = new StringBuilder();
            sb.append("fbnightwatch");
            sb.append("-debug");
            String A0L = AnonymousClass00U.A0L("fbnightwatch", "-debug");
            AnonymousClass0LU.A0O("Nightwatch", "Nightwatch is set as debug. Trying to load debug lib %s.", A0L);
            try {
                boolean A02 = AnonymousClass0qM.A02(A0L);
                AnonymousClass0LU.A0O("Nightwatch", "Loaded debug nightwatch lib %s.", A0L);
                if (!A02) {
                    AnonymousClass0LU.A0N("Nightwatch", "Falling back to load normal lib %s because NativeLoader indidicated %s was loaded already which should NOT happen. This is an error case, but failing safe.", "fbnightwatch", A0L);
                } else {
                    return;
                }
            } catch (UnsatisfiedLinkError unused) {
            }
        }
        try {
            boolean A022 = AnonymousClass0qM.A02("fbnightwatch");
            sTryLoadedLib = true;
        } catch (UnsatisfiedLinkError e) {
            new Object[1][0] = "fbnightwatch";
            sCachedException = e;
            throw e;
        } catch (Throwable th) {
            sTryLoadedLib = true;
            throw th;
        }
    }

    public static int recordDataInNightWatch(long j, int i) {
        try {
            boolean z = CAN_USE_CRITICAL_NATIVE_METHODS;
            if (z && sHasLinkedFastMethods && !sHasLinkedFastMethodsError) {
                return NightwatchOreo.nRecordDataInNightWatch(0, 0, j, i);
            }
            if (!z && sHasLinkedFastMethods && !sHasLinkedFastMethodsError) {
                return nRecordDataInNightWatch_FAST_JNI(j, i);
            }
            return nRecordDataInNightWatch(j, i);
        } catch (UnsatisfiedLinkError e) {
            AnonymousClass0LU.A0E("Nightwatch", "Failed to call recordDataInNightWatch critical or fast jni method. Defaulting to slow path", e);
            sHasLinkedFastMethodsError = true;
        }
    }
}
