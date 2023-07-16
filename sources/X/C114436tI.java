package X;

/* renamed from: X.6tI  reason: invalid class name and case insensitive filesystem */
public final class C114436tI {
    public long A00;
    public final AnonymousClass7JH A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C114436tI) {
                C114436tI r8 = (C114436tI) obj;
                if (!C04220Ms.A0I(this.A01, r8.A01) || this.A00 != r8.A00) {
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
        StringBuilder A0s = C18190wL.A0s("AnimData(anim=");
        A0s.append(this.A01);
        A0s.append(", startSize=");
        long j = this.A00;
        return C86104wH.A0y(AnonymousClass00U.A0K(" x ", C86104wH.A07(j), C86104wH.A08(j)), A0s);
    }

    public C114436tI(AnonymousClass7JH r1, long j) {
        this.A01 = r1;
        this.A00 = j;
    }
}
