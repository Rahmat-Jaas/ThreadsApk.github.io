package X;

/* renamed from: X.5un  reason: invalid class name and case insensitive filesystem */
public final class C94365un extends AnonymousClass6LP {
    public final C57943Dd A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C94365un) {
                C94365un r5 = (C94365un) obj;
                if (!C04220Ms.A0I(this.A01, r5.A01) || !C04220Ms.A0I(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C18220wO.A06(this.A00, C18180wK.A03(this.A01));
    }

    public C94365un(C57943Dd r1, String str) {
        this.A01 = str;
        this.A00 = r1;
    }
}
