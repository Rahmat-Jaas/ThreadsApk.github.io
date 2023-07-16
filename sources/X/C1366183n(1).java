package X;

import java.util.Comparator;

/* renamed from: X.83n  reason: invalid class name and case insensitive filesystem */
public final class C1366183n implements Comparator {
    public static final C1366183n A00 = new C1366183n();

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        AnonymousClass7Y3 r3 = (AnonymousClass7Y3) obj;
        AnonymousClass7Y3 r4 = (AnonymousClass7Y3) obj2;
        AnonymousClass0wJ.A1N(r3, r4);
        int A002 = C04220Ms.A00(r4.A01, r3.A01);
        if (A002 == 0) {
            return C04220Ms.A00(r3.hashCode(), r4.hashCode());
        }
        return A002;
    }
}
