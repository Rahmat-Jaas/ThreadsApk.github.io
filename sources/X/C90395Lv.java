package X;

/* renamed from: X.5Lv  reason: invalid class name and case insensitive filesystem */
public final class C90395Lv extends AnonymousClass0Sf implements AnonymousClass8iS {
    public final C304621k A00;
    public final String A01;

    public C90395Lv(C304621k r2, String str) {
        C04220Ms.A0B(str, 1);
        this.A01 = str;
        this.A00 = r2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C90395Lv) {
                C90395Lv r5 = (C90395Lv) obj;
                if (!C04220Ms.A0I(this.A01, r5.A01) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String Aqm() {
        return this.A00.name();
    }

    public final int hashCode() {
        return C18220wO.A06(this.A00, C18180wK.A03(this.A01));
    }
}
