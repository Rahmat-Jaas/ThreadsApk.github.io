package X;

/* renamed from: X.6u0  reason: invalid class name and case insensitive filesystem */
public final class C114856u0 {
    public final String A00;
    public final AnonymousClass8bH A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C114856u0) {
                C114856u0 r5 = (C114856u0) obj;
                if (!C04220Ms.A0I(this.A00, r5.A00) || !C04220Ms.A0I(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C18220wO.A06(this.A01, C18180wK.A03(this.A00));
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("MatchGroup(value=");
        A0s.append(this.A00);
        A0s.append(", range=");
        return C86104wH.A0y(this.A01, A0s);
    }

    public C114856u0(String str, AnonymousClass8bH r2) {
        this.A00 = str;
        this.A01 = r2;
    }
}
