package com.facebook.systrace;

import X.AnonymousClass0qM;
import X.C02640Cf;
import X.C14150ot;
import X.C14160ou;
import X.C14890qL;
import android.os.Process;
import android.util.Log;
import com.facebook.common.util.TriState;

public class TraceDirect {
    public static final boolean sForceJavaImpl = "true".equals(C02640Cf.A01("debug.fbsystrace.force_java"));
    public static volatile TriState sNativeAvailable = TriState.UNSET;
    public static volatile int sPrevSoLoaderSourcesVersion = -1;
    public static final boolean sTraceLoad = "true".equals(C02640Cf.A01("debug.fbsystrace.trace_load"));

    public static native void nativeAsyncTraceBegin(String str, int i, long j);

    public static native void nativeAsyncTraceCancel(String str, int i);

    public static native void nativeAsyncTraceEnd(String str, int i, long j);

    public static native void nativeAsyncTraceRename(String str, String str2, int i);

    public static native void nativeAsyncTraceStageBegin(String str, int i, long j, String str2);

    public static native void nativeBeginSection(String str);

    public static native void nativeBeginSectionWithArgs(String str, String[] strArr, int i);

    public static native void nativeEndAsyncFlow(String str, int i);

    public static native void nativeEndSection();

    public static native void nativeEndSectionWithArgs(String[] strArr, int i);

    public static native void nativeSetEnabledTags(long j);

    public static native void nativeStartAsyncFlow(String str, int i);

    public static native void nativeStepAsyncFlow(String str, int i);

    public static native void nativeTraceCounter(String str, int i);

    public static native void nativeTraceInstant(String str, String str2, char c);

    public static native void nativeTraceMetadata(String str, String str2, int i);

    public static boolean checkNative() {
        int i;
        Number number;
        C14890qL r0;
        if (sNativeAvailable == TriState.UNSET) {
            if (sForceJavaImpl) {
                sNativeAvailable = TriState.NO;
            } else {
                if (AnonymousClass0qM.A01()) {
                    synchronized (AnonymousClass0qM.class) {
                        r0 = AnonymousClass0qM.A00;
                        if (r0 == null) {
                            throw new IllegalStateException("NativeLoader has not been initialized.  To use standard native library loading, call NativeLoader.init(new SystemDelegate()).");
                        }
                    }
                    i = r0.BCg();
                } else {
                    i = -1;
                }
                if (i != sPrevSoLoaderSourcesVersion) {
                    sPrevSoLoaderSourcesVersion = i;
                    String.format("Attempting to load fbsystrace.so [%d|%d].", new Object[]{Integer.valueOf(sPrevSoLoaderSourcesVersion), Integer.valueOf(i)});
                    try {
                        AnonymousClass0qM.A02("fbsystrace");
                        long j = 0;
                        if (C02640Cf.A05 && (number = (Number) C02640Cf.A00(C02640Cf.A01, "debug.fbsystrace.tags", 0L)) != null) {
                            j = number.longValue();
                        }
                        nativeSetEnabledTags(j);
                        nativeBeginSection("fbsystrace.so loaded");
                        nativeEndSection();
                        sNativeAvailable = TriState.YES;
                    } catch (UnsatisfiedLinkError unused) {
                        Log.w("TraceDirect", "fbsystrace.so could not be loaded - switching to Java implementation.");
                    }
                }
            }
        }
        if (sNativeAvailable != TriState.YES) {
            return false;
        }
        return true;
    }

    public static void asyncTraceBegin(String str, int i, long j) {
        if (checkNative()) {
            nativeAsyncTraceBegin(str, i, j);
            return;
        }
        C14160ou r3 = new C14160ou('S');
        r3.A00(Process.myPid());
        r3.A02(str);
        r3.A01("<0>");
        if (j != 0) {
            r3.A01("<T");
            r3.A01(Long.toString(j));
            r3.A01(">");
        }
        r3.A00(i);
        C14150ot.A00(r3.toString());
    }

    public static void asyncTraceEnd(String str, int i, long j) {
        if (checkNative()) {
            nativeAsyncTraceEnd(str, i, j);
            return;
        }
        C14160ou r3 = new C14160ou('F');
        r3.A00(Process.myPid());
        r3.A02(str);
        if (j != 0) {
            r3.A01("<T");
            r3.A01(Long.toString(j));
            r3.A01(">");
        }
        r3.A00(i);
        C14150ot.A00(r3.toString());
    }
}
