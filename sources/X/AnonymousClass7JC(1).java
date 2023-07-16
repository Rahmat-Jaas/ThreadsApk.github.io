package X;

import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0002000_I2;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.7JC  reason: invalid class name */
public final class AnonymousClass7JC {
    public static final AnonymousClass7JC A00 = new AnonymousClass7JC();
    public static final Map A01 = C18220wO.A0y();
    public static final Map A02 = C18220wO.A0y();
    public static final Map A03 = C18220wO.A0y();

    public static final int A00(String str, int i, int i2) {
        Number A0j;
        C04220Ms.A0B(str, 2);
        Map map = (Map) A01.get(new KtCSuperShape0S0002000_I2(i, i2, 0));
        if (map == null || (A0j = C86124wJ.A0j(str, map)) == null) {
            return 0;
        }
        return A0j.intValue();
    }

    public static final void A01(QuickPerformanceLogger quickPerformanceLogger, String str, TimeUnit timeUnit, int i, int i2, long j) {
        String str2 = str;
        C04220Ms.A0B(str, 3);
        int i3 = i;
        int i4 = i2;
        Map map = (Map) A01.get(new KtCSuperShape0S0002000_I2(i, i2, 0));
        if (map != null) {
            C86154wM.A1T(str, map, C18210wN.A03(C86124wJ.A0j(str, map)) + 1);
            quickPerformanceLogger.markerPoint(i3, i4, str2, j, timeUnit);
        }
    }

    public static final void A02(QuickPerformanceLogger quickPerformanceLogger, Map map, TimeUnit timeUnit, int i, int i2, long j) {
        int i3 = i;
        int i4 = i2;
        KtCSuperShape0S0002000_I2 ktCSuperShape0S0002000_I2 = new KtCSuperShape0S0002000_I2(i, i2, 0);
        Map map2 = A01;
        if (!map2.containsKey(ktCSuperShape0S0002000_I2)) {
            map2.put(ktCSuperShape0S0002000_I2, C18220wO.A0y());
            QuickPerformanceLogger quickPerformanceLogger2 = quickPerformanceLogger;
            quickPerformanceLogger2.markerStart(i3, i4, j, timeUnit);
            Iterator A0z = AnonymousClass0wJ.A0z(map);
            while (A0z.hasNext()) {
                Map.Entry A0o = C18180wK.A0o(A0z);
                quickPerformanceLogger2.markerAnnotate(i, i2, C18200wM.A0p(A0o), C18230wP.A0u(A0o));
            }
        }
    }

    public static final void A03(QuickPerformanceLogger quickPerformanceLogger, Map map, TimeUnit timeUnit, int i, int i2, long j, short s) {
        C04220Ms.A0B(map, 6);
        int i3 = i;
        int i4 = i2;
        KtCSuperShape0S0002000_I2 ktCSuperShape0S0002000_I2 = new KtCSuperShape0S0002000_I2(i, i2, 0);
        Map map2 = A01;
        if (map2.containsKey(ktCSuperShape0S0002000_I2)) {
            Iterator A0z = AnonymousClass0wJ.A0z(map);
            while (true) {
                QuickPerformanceLogger quickPerformanceLogger2 = quickPerformanceLogger;
                if (A0z.hasNext()) {
                    Map.Entry A0o = C18180wK.A0o(A0z);
                    quickPerformanceLogger.markerAnnotate(i, i2, C18200wM.A0p(A0o), C18230wP.A0u(A0o));
                } else {
                    short s2 = s;
                    quickPerformanceLogger2.markerEnd(i3, i4, s2, j, timeUnit);
                    map2.remove(ktCSuperShape0S0002000_I2);
                    return;
                }
            }
        }
    }

    public final void A04(QuickPerformanceLogger quickPerformanceLogger, C1197676v r22, TimeUnit timeUnit, int i, int i2, long j) {
        int i3;
        int i4 = i;
        int i5 = i2;
        Map map = (Map) A01.get(new KtCSuperShape0S0002000_I2(i4, i5, 0));
        if (map != null) {
            C1197676v r5 = r22;
            C04530Oa r1 = r5.A06;
            Object value = r1.getValue();
            int i6 = 0;
            if (value == null || !AnonymousClass0wJ.A1X(r5.A04.getValue())) {
                C04530Oa r2 = r5.A02;
                Number A0j = C86124wJ.A0j(r2.getValue(), map);
                if (A0j != null) {
                    i6 = A0j.intValue();
                }
                i3 = i6 + 1;
                map.put(r2.getValue(), Integer.valueOf(i3));
            } else {
                Map map2 = A03;
                Number A0j2 = C86124wJ.A0j(value, map2);
                if (A0j2 != null) {
                    Map map3 = A02;
                    C1197676v r3 = (C1197676v) map3.get(r1.getValue());
                    if ((AnonymousClass0wJ.A1X(r5.A03.getValue()) && r3 != null && AnonymousClass0wJ.A1X(r3.A05.getValue())) || (AnonymousClass0wJ.A1X(r5.A05.getValue()) && r3 != null && AnonymousClass0wJ.A1X(r3.A03.getValue()))) {
                        map3.remove(value);
                        map2.remove(value);
                        i3 = A0j2.intValue();
                    }
                }
                C04530Oa r23 = r5.A02;
                Number A0j3 = C86124wJ.A0j(r23.getValue(), map);
                if (A0j3 != null) {
                    i6 = A0j3.intValue();
                }
                i3 = i6 + 1;
                Integer valueOf = Integer.valueOf(i3);
                map.put(r23.getValue(), valueOf);
                A02.put(value, r5);
                map2.put(value, valueOf);
            }
            String A0l = AnonymousClass8bQ.A0l(r5.A00, "#", String.valueOf(i3), false);
            AnonymousClass0WQ r15 = new AnonymousClass0WQ();
            Iterator A0z = AnonymousClass0wJ.A0z(r5.A01);
            while (A0z.hasNext()) {
                Map.Entry A0o = C18180wK.A0o(A0z);
                r15.A00(C18200wM.A0p(A0o), C18230wP.A0u(A0o), 1);
            }
            quickPerformanceLogger.markerPoint(i4, i5, 7, A0l, r15, j, timeUnit, 0);
        }
    }
}
