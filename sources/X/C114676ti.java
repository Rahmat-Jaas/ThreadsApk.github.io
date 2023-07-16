package X;

/* renamed from: X.6ti  reason: invalid class name and case insensitive filesystem */
public final class C114676ti {
    public final C120967Dk A00;
    public final C120977Dl A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C114676ti) {
                C114676ti r5 = (C114676ti) obj;
                if (!C04220Ms.A0I(this.A00, r5.A00) || !C04220Ms.A0I(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C18220wO.A06(this.A01, AnonymousClass0wJ.A03(this.A00) * 31);
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("CardPttRequest(authTicket=");
        A0s.append(this.A00);
        A0s.append(", pttRequestParam=");
        return C86104wH.A0y(this.A01, A0s);
    }

    public C114676ti(C120967Dk r1, C120977Dl r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
