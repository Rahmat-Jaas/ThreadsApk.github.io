package X;

/* renamed from: X.6tZ  reason: invalid class name and case insensitive filesystem */
public final class C114606tZ {
    public final Long A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C114606tZ) {
                C114606tZ r5 = (C114606tZ) obj;
                if (!C04220Ms.A0I(this.A01, r5.A01) || !C04220Ms.A0I(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C18180wK.A03(this.A01) + AnonymousClass0wJ.A03(this.A00);
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("Preference(key=");
        A0s.append(this.A01);
        A0s.append(", value=");
        return C86104wH.A0y(this.A00, A0s);
    }

    public C114606tZ(String str, Long l) {
        this.A01 = str;
        this.A00 = l;
    }
}
