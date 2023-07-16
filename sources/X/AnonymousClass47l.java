package X;

/* renamed from: X.47l  reason: invalid class name */
public final class AnonymousClass47l implements C10390iG {
    public static String A00;
    public static String A01;
    public static String A02;
    public static final AnonymousClass47l A03;

    public final boolean A00(C10300i6 r4) {
        String str;
        if (!C63173fJ.A05(C18250wR.A0D(r4, 1), 18308414790704626L) || C63693i8.A08(r4) || (str = A02) == null || str.length() == 0) {
            return false;
        }
        return true;
    }

    static {
        AnonymousClass47l r0 = new AnonymousClass47l();
        A03 = r0;
        C691847d.A02(r0);
    }

    public final void onAppBackgrounded() {
        int A032 = C14030oh.A03(-1496038186);
        A02 = null;
        A00 = null;
        A01 = null;
        C14030oh.A0A(-10451535, A032);
    }

    public final void onAppForegrounded() {
        C14030oh.A0A(1677661108, C14030oh.A03(1906622948));
    }
}
