package X;

/* renamed from: X.6tm  reason: invalid class name and case insensitive filesystem */
public final class C114716tm {
    public final long A00;
    public final C110606ly A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C114716tm) {
                C114716tm r8 = (C114716tm) obj;
                if (this.A00 != r8.A00 || !C04220Ms.A0I(this.A01, r8.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C18220wO.A06(this.A01, C18190wL.A02(this.A00) * 31);
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("ECPInitDataValue(timestamp=");
        A0s.append(this.A00);
        A0s.append(", ecpInitData=");
        return C86104wH.A0y(this.A01, A0s);
    }

    public C114716tm(C110606ly r1, long j) {
        this.A00 = j;
        this.A01 = r1;
    }
}
