package X;

/* renamed from: X.3aJ  reason: invalid class name and case insensitive filesystem */
public final class C62573aJ {
    public static final C62573aJ A03 = new C62573aJ("Promotion has an invalid primary action", true, true);
    public static final C62573aJ A04 = new C62573aJ("Promotion has an invalid secondary action", true, true);
    public final String A00;
    public final boolean A01;
    public final boolean A02;

    public static C62573aJ A00() {
        return new C62573aJ((String) null, true, false);
    }

    public static C62573aJ A01(AnonymousClass3DC r3) {
        String str;
        if (r3.A08) {
            return A00();
        }
        if (r3.A06) {
            str = "In holdout";
        } else {
            str = r3.A04;
            if (str == null) {
                str = I17.A00(10);
            }
        }
        return new C62573aJ(str, false, true);
    }

    public C62573aJ(String str, boolean z, boolean z2) {
        this.A02 = z;
        this.A01 = z2;
        this.A00 = str;
    }
}
