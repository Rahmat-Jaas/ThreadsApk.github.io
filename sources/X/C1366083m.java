package X;

import java.util.Comparator;

/* renamed from: X.83m  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C1366083m implements Comparator {
    public static final /* synthetic */ C1366083m A00 = new C1366083m();

    public final int compare(Object obj, Object obj2) {
        AnonymousClass7Y3 r4 = (AnonymousClass7Y3) obj;
        AnonymousClass7Y3 r5 = (AnonymousClass7Y3) obj2;
        float f = r4.A00;
        float f2 = r5.A00;
        if (f == f2) {
            return C04220Ms.A00(r4.A03, r5.A03);
        }
        return Float.compare(f, f2);
    }
}
