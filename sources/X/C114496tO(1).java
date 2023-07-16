package X;

/* renamed from: X.6tO  reason: invalid class name and case insensitive filesystem */
public final class C114496tO {
    public final long A00;
    public final AnonymousClass678 A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C114496tO) {
                C114496tO r8 = (C114496tO) obj;
                if (!(this.A01 == r8.A01 && this.A00 == r8.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C18210wN.A04(this.A01) + C18190wL.A02(this.A00);
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("SelectionHandleInfo(handle=");
        A0s.append(this.A01);
        A0s.append(", position=");
        return C86104wH.A0y(AnonymousClass7KC.A06(this.A00), A0s);
    }

    public C114496tO(AnonymousClass678 r1, long j) {
        this.A01 = r1;
        this.A00 = j;
    }
}
