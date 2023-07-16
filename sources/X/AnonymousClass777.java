package X;

/* renamed from: X.777  reason: invalid class name */
public final class AnonymousClass777 {
    public static final C25515Dn3 A00(C23908D0w d0w) {
        int A04 = C18230wP.A04(d0w, 0);
        if (A04 == 4 || A04 == 3 || A04 == 5 || A04 == 7) {
            d0w = C23908D0w.STORIES;
        }
        return new C25515Dn3(d0w, "SAVED");
    }

    public final C25515Dn3 A01(C23908D0w d0w, String str) {
        AnonymousClass0wJ.A1N(d0w, str);
        if (str.equals("SAVED")) {
            return A00(d0w);
        }
        return new C25515Dn3(d0w, str);
    }
}
