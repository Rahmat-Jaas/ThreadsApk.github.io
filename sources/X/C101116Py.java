package X;

/* renamed from: X.6Py  reason: invalid class name and case insensitive filesystem */
public final class C101116Py {
    public static final int A00(C127397h3 r2) {
        String A0E = C127397h3.A0E(r2);
        if (A0E == null || A0E.equals("column")) {
            return 1;
        }
        if (A0E.equals("row")) {
            return 0;
        }
        throw C18190wL.A0a(AnonymousClass00U.A0L("Unknown direction ", A0E));
    }
}
