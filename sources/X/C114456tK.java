package X;

/* renamed from: X.6tK  reason: invalid class name and case insensitive filesystem */
public final class C114456tK {
    public double A00;
    public double A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C114456tK) {
                C114456tK r7 = (C114456tK) obj;
                if (!(Double.compare(this.A01, r7.A01) == 0 && Double.compare(this.A00, r7.A00) == 0)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C86134wK.A06(C86154wM.A04(Double.doubleToLongBits(this.A01)), Double.doubleToLongBits(this.A00));
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("ComplexDouble(_real=");
        A0s.append(this.A01);
        A0s.append(", _imaginary=");
        A0s.append(this.A00);
        return AnonymousClass0wJ.A0u(A0s);
    }

    public C114456tK(double d, double d2) {
        this.A01 = d;
        this.A00 = d2;
    }
}
