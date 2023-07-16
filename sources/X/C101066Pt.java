package X;

/* renamed from: X.6Pt  reason: invalid class name and case insensitive filesystem */
public final class C101066Pt {
    public static int A00(C127397h3 r1) {
        String A0E = C127397h3.A0E(r1);
        if (A0E == null || A0E.equals("column")) {
            return 1;
        }
        if (A0E.equals("row")) {
            return 0;
        }
        throw C18190wL.A0a(AnonymousClass00U.A0L("Unknown direction: ", A0E));
    }
}
