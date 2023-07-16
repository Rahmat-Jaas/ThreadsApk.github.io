package X;

/* renamed from: X.3Hv  reason: invalid class name and case insensitive filesystem */
public final class C58873Hv {
    public final Object A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C58873Hv) {
                C58873Hv r5 = (C58873Hv) obj;
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
        StringBuilder A0s = C18190wL.A0s("ValueElement(name=");
        A0s.append(this.A01);
        A0s.append(", value=");
        A0s.append(this.A00);
        return AnonymousClass0wJ.A0u(A0s);
    }

    public C58873Hv(String str, Object obj) {
        this.A01 = str;
        this.A00 = obj;
    }
}
