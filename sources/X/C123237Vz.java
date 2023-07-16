package X;

/* renamed from: X.7Vz  reason: invalid class name and case insensitive filesystem */
public final class C123237Vz implements C141728cr {
    public final long A00;
    public final long A01;
    public final long A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                C123237Vz r8 = (C123237Vz) obj;
                if (!(this.A01 == r8.A01 && this.A02 == r8.A02 && this.A00 == r8.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C86134wK.A06(C86104wH.A06(C86154wM.A04(this.A01), this.A02), this.A00);
    }

    public C123237Vz(long j, long j2, long j3) {
        this.A01 = j;
        this.A02 = j2;
        this.A00 = j3;
    }
}
