package X;

/* renamed from: X.6u2  reason: invalid class name and case insensitive filesystem */
public final class C114876u2 {
    public final int A00;
    public final long A01;
    public final C967466n A02;

    public C114876u2(C967466n r2, int i, long j) {
        C04220Ms.A0B(r2, 1);
        this.A02 = r2;
        this.A00 = i;
        this.A01 = j;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C114876u2) {
                C114876u2 r8 = (C114876u2) obj;
                if (!(this.A02 == r8.A02 && this.A00 == r8.A00 && this.A01 == r8.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((C18210wN.A04(this.A02) + this.A00) * 31) + C18190wL.A02(this.A01);
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("AnchorInfo(direction=");
        A0s.append(this.A02);
        A0s.append(", offset=");
        A0s.append(this.A00);
        A0s.append(", selectableId=");
        A0s.append(this.A01);
        return AnonymousClass0wJ.A0u(A0s);
    }
}
