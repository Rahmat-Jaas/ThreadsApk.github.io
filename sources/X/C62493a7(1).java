package X;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.3a7  reason: invalid class name and case insensitive filesystem */
public final class C62493a7 {
    public static final AnonymousClass01V A00 = AnonymousClass01V.A0p;
    public static final AtomicInteger A01 = new AtomicInteger(0);

    public static void A01(String str, String str2, int i, boolean z) {
        AnonymousClass01V r2 = A00;
        if (r2 != null) {
            int andIncrement = A01.getAndIncrement();
            r2.markerStart(i, andIncrement);
            if (!(str == null || str2 == null)) {
                r2.markerAnnotate(i, andIncrement, str, str2);
            }
            short s = 3;
            if (z) {
                s = 2;
            }
            r2.markerEnd(i, andIncrement, s);
        }
    }

    public static void A00(String str) {
        A01("Font Type", str, 38797314, true);
    }

    public static void A02(String str, boolean z) {
        A01("File Accessed", str, 38797321, z);
    }
}
