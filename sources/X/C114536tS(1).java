package X;

/* renamed from: X.6tS  reason: invalid class name and case insensitive filesystem */
public final class C114536tS {
    public float A00;
    public long A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C114536tS) {
                C114536tS r8 = (C114536tS) obj;
                if (!(this.A01 == r8.A01 && Float.compare(this.A00, r8.A00) == 0)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C86144wL.A03(C18190wL.A02(this.A01) * 31, this.A00);
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("DataPointAtTime(time=");
        A0s.append(this.A01);
        A0s.append(", dataPoint=");
        A0s.append(this.A00);
        return AnonymousClass0wJ.A0u(A0s);
    }

    public C114536tS(long j, float f) {
        this.A01 = j;
        this.A00 = f;
    }
}
