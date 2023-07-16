package com.facebook.systrace;

import X.AnonymousClass0SJ;
import X.C02660Ch;
import X.C14150ot;
import X.C14160ou;
import X.C14220p1;
import X.C14230p2;
import X.C14370pI;
import X.C14390pK;
import android.os.Build;
import android.os.Process;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicInteger;

public final class Systrace {
    public static long A00;
    public static final ThreadLocal A01 = new C14370pI();
    public static final AtomicInteger A02 = new AtomicInteger();
    public static final String[][] A03 = {new String[]{"com.facebook.common.fury.FBSystraceReqContextLifecycleCallbacks.onActivate", "com.facebook.common.fury.FBSystraceReqContextLifecycleCallbacks.onDeactivate"}, new String[]{"com.facebook.common.plugins.fblogging.FbPluginsLogger.pluginMarkerStart", "com.facebook.common.plugins.fblogging.FbPluginsLogger.pluginMarkerEnd"}, new String[]{"com.facebook.common.plugins.fblogging.FbPluginsLogger.onSocketGetPluginsStart", "com.facebook.common.plugins.fblogging.FbPluginsLogger.onSocketGetPluginsEnd"}};

    static {
        if (C02660Ch.A03) {
            Method method = C02660Ch.A02;
            AnonymousClass0SJ.A00(method);
            C02660Ch.A00(method, true);
        }
        C14220p1.A00(5);
    }

    public static void A00(int i, String str, String str2) {
        if (Build.VERSION.SDK_INT >= 30) {
            C14230p2.A00();
        }
        if (!A0F(4)) {
            return;
        }
        if (TraceDirect.checkNative()) {
            TraceDirect.nativeAsyncTraceRename(str, str2, i);
            return;
        }
        C14160ou r1 = new C14160ou('F');
        r1.A00(Process.myPid());
        r1.A02(str);
        r1.A01("<M>");
        r1.A00(i);
        r1.A02(str2);
        C14150ot.A00(r1.toString());
    }

    public static void A01(int i, String str, String str2) {
        if (Build.VERSION.SDK_INT >= 30) {
            C14230p2.A00();
        }
        if (!A0F(64)) {
            return;
        }
        if (TraceDirect.checkNative()) {
            TraceDirect.nativeTraceMetadata(str, str2, i);
            return;
        }
        C14160ou r1 = new C14160ou('M');
        r1.A00(Process.myPid());
        r1.A02(str);
        r1.A00(i);
        r1.A02(str2);
        C14150ot.A00(r1.toString());
    }

    public static void A02(long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            C14230p2.A00();
        }
        if (!A0F(j)) {
            return;
        }
        if (TraceDirect.checkNative()) {
            TraceDirect.nativeEndSection();
        } else {
            C14150ot.A00("E");
        }
    }

    public static void A03(long j, String str) {
        if (Build.VERSION.SDK_INT >= 30) {
            C14230p2.A00();
        }
        if (!A0F(j)) {
            return;
        }
        if (TraceDirect.checkNative()) {
            TraceDirect.nativeBeginSection(str);
            return;
        }
        C14160ou r1 = new C14160ou('B');
        r1.A00(Process.myPid());
        r1.A02(str);
        C14150ot.A00(r1.toString());
    }

    public static void A04(long j, String str, int i) {
        if (Build.VERSION.SDK_INT >= 30) {
            C14230p2.A00();
        }
        if (A0F(j)) {
            TraceDirect.asyncTraceBegin(str, i, 0);
        }
    }

    public static void A05(long j, String str, int i) {
        if (Build.VERSION.SDK_INT >= 30) {
            C14230p2.A00();
        }
        if (!A0F(j)) {
            return;
        }
        if (TraceDirect.checkNative()) {
            TraceDirect.nativeEndAsyncFlow(str, i);
            return;
        }
        C14160ou r1 = new C14160ou('f');
        r1.A00(Process.myPid());
        r1.A02(str);
        r1.A00(i);
        C14150ot.A00(r1.toString());
    }

    public static void A06(long j, String str, int i) {
        if (Build.VERSION.SDK_INT >= 30) {
            C14230p2.A00();
        }
        if (A0F(j)) {
            TraceDirect.asyncTraceEnd(str, i, 0);
        }
    }

    public static void A07(long j, String str, int i) {
        if (Build.VERSION.SDK_INT >= 30) {
            C14230p2.A00();
        }
        if (!A0F(j)) {
            return;
        }
        if (TraceDirect.checkNative()) {
            TraceDirect.nativeStartAsyncFlow(str, i);
            return;
        }
        C14160ou r1 = new C14160ou('s');
        r1.A00(Process.myPid());
        r1.A02(str);
        r1.A00(i);
        C14150ot.A00(r1.toString());
    }

    public static void A08(long j, String str, int i) {
        if (Build.VERSION.SDK_INT >= 30) {
            C14230p2.A00();
        }
        if (!A0F(j)) {
            return;
        }
        if (TraceDirect.checkNative()) {
            TraceDirect.nativeTraceCounter(str, i);
            return;
        }
        C14160ou r1 = new C14160ou('C');
        r1.A00(Process.myPid());
        r1.A02(str);
        r1.A00(i);
        C14150ot.A00(r1.toString());
    }

    public static void A09(String str) {
        if (Build.VERSION.SDK_INT >= 30) {
            C14230p2.A00();
        }
        if (!A0F(256)) {
            return;
        }
        if (TraceDirect.checkNative()) {
            TraceDirect.nativeTraceInstant("", str, 't');
            return;
        }
        C14160ou r2 = new C14160ou('I');
        r2.A00(Process.myPid());
        r2.A02(str);
        StringBuilder sb = r2.A00;
        sb.append('|');
        sb.append('t');
        r2.A02("");
        C14150ot.A00(r2.toString());
    }

    public static void A0A(String str, int i, long j, long j2) {
        if (Build.VERSION.SDK_INT >= 30) {
            C14230p2.A00();
        }
        if (A0F(j)) {
            TraceDirect.asyncTraceBegin(str, i, C14390pK.A00(j2));
        }
    }

    public static void A0B(String str, int i, long j, long j2) {
        if (Build.VERSION.SDK_INT >= 30) {
            C14230p2.A00();
        }
        if (A0F(j)) {
            TraceDirect.asyncTraceEnd(str, i, C14390pK.A00(j2));
        }
    }

    public static void A0C(String str, String str2, int i, long j, long j2) {
        if (Build.VERSION.SDK_INT >= 30) {
            C14230p2.A00();
        }
        if (A0F(j)) {
            long A002 = C14390pK.A00(j2);
            if (TraceDirect.checkNative()) {
                TraceDirect.nativeAsyncTraceStageBegin(str, i, A002, str2);
                return;
            }
            C14160ou r5 = new C14160ou('T');
            r5.A00(Process.myPid());
            r5.A02(str);
            if (A002 != 0) {
                r5.A01("<T");
                r5.A01(Long.toString(A002));
                r5.A01(">");
            }
            r5.A00(i);
            r5.A02(str2);
            C14150ot.A00(r5.toString());
        }
    }

    public static void A0D(String str, String[] strArr, int i, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            C14230p2.A00();
        }
        if (!A0F(j)) {
            return;
        }
        if (TraceDirect.checkNative()) {
            TraceDirect.nativeBeginSectionWithArgs(str, strArr, i);
            return;
        }
        C14160ou r1 = new C14160ou('B');
        r1.A00(Process.myPid());
        r1.A02(str);
        r1.A03(strArr, i);
        C14150ot.A00(r1.toString());
    }

    public static void A0E(String[] strArr, int i, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            C14230p2.A00();
        }
        if (!A0F(j)) {
            return;
        }
        if (TraceDirect.checkNative()) {
            TraceDirect.nativeEndSectionWithArgs(strArr, i);
            return;
        }
        C14160ou r2 = new C14160ou('E');
        StringBuilder sb = r2.A00;
        sb.append('|');
        sb.append('|');
        r2.A03(strArr, i);
        C14150ot.A00(r2.toString());
    }

    public static boolean A0F(long j) {
        if ((j & C14220p1.A02) == 0 && (j & A00) == 0) {
            return false;
        }
        return true;
    }
}
