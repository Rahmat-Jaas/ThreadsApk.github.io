package X;

/* renamed from: X.5Hu  reason: invalid class name and case insensitive filesystem */
public final class C89975Hu extends AnonymousClass0Sf {
    public final double A00;
    public final double A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C89975Hu) {
                C89975Hu r7 = (C89975Hu) obj;
                if (!(Double.compare(this.A00, r7.A00) == 0 && Double.compare(this.A01, r7.A01) == 0)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C86134wK.A06(C86154wM.A04(Double.doubleToLongBits(this.A00)), Double.doubleToLongBits(this.A01));
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("LoginNotificationCoordinates(latitude=");
        A0s.append(this.A00);
        A0s.append(", longitude=");
        A0s.append(this.A01);
        return AnonymousClass0wJ.A0u(A0s);
    }

    public C89975Hu(double d, double d2) {
        this.A00 = d;
        this.A01 = d2;
    }
}
