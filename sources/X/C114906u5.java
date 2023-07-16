package X;

/* renamed from: X.6u5  reason: invalid class name and case insensitive filesystem */
public final class C114906u5 {
    public final int A00;
    public final int A01;
    public final boolean A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C114906u5) {
                C114906u5 r5 = (C114906u5) obj;
                if (!(this.A01 == r5.A01 && this.A00 == r5.A00 && this.A02 == r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = ((this.A01 * 31) + this.A00) * 31;
        boolean z = this.A02;
        if (z) {
            z = true;
        }
        return i + (z ? 1 : 0);
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("BidiRun(start=");
        A0s.append(this.A01);
        A0s.append(", end=");
        A0s.append(this.A00);
        A0s.append(", isRtl=");
        A0s.append(this.A02);
        return AnonymousClass0wJ.A0u(A0s);
    }

    public C114906u5(int i, int i2, boolean z) {
        this.A01 = i;
        this.A00 = i2;
        this.A02 = z;
    }
}
