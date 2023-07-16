package X;

/* renamed from: X.6tq  reason: invalid class name and case insensitive filesystem */
public final class C114756tq {
    public final C145388kQ A00;
    public final AnonymousClass0YY A01;

    public C114756tq(C145388kQ r2, AnonymousClass0YY r3) {
        C04220Ms.A0B(r2, 1);
        this.A00 = r2;
        this.A01 = r3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C114756tq) {
                C114756tq r5 = (C114756tq) obj;
                if (!C04220Ms.A0I(this.A00, r5.A00) || !C04220Ms.A0I(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C18220wO.A06(this.A01, C18210wN.A04(this.A00));
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("MediatorEntry(observable=");
        A0s.append(this.A00);
        A0s.append(", callback=");
        return C86104wH.A0y(this.A01, A0s);
    }
}
