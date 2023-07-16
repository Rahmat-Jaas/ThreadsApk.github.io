package X;

/* renamed from: X.5Mo  reason: invalid class name and case insensitive filesystem */
public final class C90585Mo extends AnonymousClass0Sf implements C144808jJ {
    public final C90575Mn A00;
    public final String A01;
    public final String A02;

    public C90585Mo(C90575Mn r2, String str, String str2) {
        C18180wK.A1P(str, 1, str2);
        this.A01 = str;
        this.A00 = r2;
        this.A02 = str2;
    }

    public final C90585Mo D54() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C90585Mo) {
                C90585Mo r5 = (C90585Mo) obj;
                if (!C04220Ms.A0I(this.A01, r5.A01) || !C04220Ms.A0I(this.A00, r5.A00) || !C04220Ms.A0I(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C18210wN.A05(this.A02, (C18180wK.A03(this.A01) + AnonymousClass0wJ.A03(this.A00)) * 31);
    }
}
