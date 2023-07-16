package X;

/* renamed from: X.5Hv  reason: invalid class name */
public final class AnonymousClass5Hv extends AnonymousClass0Sf {
    public final long A00;
    public final long A01;
    public final long A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5Hv) {
                AnonymousClass5Hv r8 = (AnonymousClass5Hv) obj;
                if (!(this.A00 == r8.A00 && this.A01 == r8.A01 && this.A02 == r8.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C86134wK.A06(C86104wH.A06(C86154wM.A04(this.A00), this.A01), this.A02);
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("SchedStats(timeOnCpu=");
        A0s.append(this.A00);
        A0s.append(", timeWaiting=");
        A0s.append(this.A01);
        A0s.append(", timeslicesCount=");
        A0s.append(this.A02);
        return AnonymousClass0wJ.A0u(A0s);
    }

    public AnonymousClass5Hv(long j, long j2, long j3) {
        this.A00 = j;
        this.A01 = j2;
        this.A02 = j3;
    }
}
