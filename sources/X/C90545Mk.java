package X;

/* renamed from: X.5Mk  reason: invalid class name and case insensitive filesystem */
public final class C90545Mk extends AnonymousClass0Sf implements C21296Bs2 {
    public final String A00;
    public final String A01;

    public C90545Mk(String str, String str2) {
        C04220Ms.A0B(str2, 2);
        this.A00 = str;
        this.A01 = str2;
    }

    public final C90545Mk D4Y() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C90545Mk) {
                C90545Mk r5 = (C90545Mk) obj;
                if (!C04220Ms.A0I(this.A00, r5.A00) || !C04220Ms.A0I(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C18210wN.A05(this.A01, AnonymousClass0wJ.A06(this.A00) * 31);
    }
}
