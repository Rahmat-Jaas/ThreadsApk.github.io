package X;

/* renamed from: X.52s  reason: invalid class name and case insensitive filesystem */
public final class C874352s extends AnonymousClass7X6 {
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C874352s) {
                AnonymousClass7X6 r5 = (AnonymousClass7X6) obj;
                if (!C04220Ms.A0I(this.A03, r5.A03) || !C04220Ms.A0I(this.A02, r5.A02) || !C04220Ms.A0I(this.A00, r5.A00) || !C04220Ms.A0I(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C18220wO.A06(this.A01, AnonymousClass0wJ.A05(this.A00, AnonymousClass0wJ.A05(this.A02, C18210wN.A04(this.A03))));
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("RoundedCornerShape(topStart = ");
        A0s.append(this.A03);
        A0s.append(", topEnd = ");
        A0s.append(this.A02);
        A0s.append(", bottomEnd = ");
        A0s.append(this.A00);
        A0s.append(", bottomStart = ");
        return C86104wH.A0y(this.A01, A0s);
    }

    public C874352s(C142798fc r1, C142798fc r2, C142798fc r3, C142798fc r4) {
        super(r1, r2, r3, r4);
    }
}
