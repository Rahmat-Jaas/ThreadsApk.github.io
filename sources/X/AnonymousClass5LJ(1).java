package X;

/* renamed from: X.5LJ  reason: invalid class name */
public final class AnonymousClass5LJ extends AnonymousClass0Sf implements AnonymousClass8eY {
    public final String A00;
    public final String A01;

    public AnonymousClass5LJ(String str, String str2) {
        C04220Ms.A0B(str, 1);
        this.A01 = str;
        this.A00 = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5LJ) {
                AnonymousClass5LJ r5 = (AnonymousClass5LJ) obj;
                if (!C04220Ms.A0I(this.A01, r5.A01) || !C04220Ms.A0I(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (C18180wK.A03(this.A01) * 31) + C18200wM.A09(this.A00);
    }
}
