package X;

/* renamed from: X.7El  reason: invalid class name and case insensitive filesystem */
public final class C121167El {
    public long A00;
    public C146678mg A01;
    public C147168nV A02;
    public AnonymousClass69J A03;

    public static void A01(C146678mg r1, C121167El r2, C147168nV r3, AnonymousClass69J r4) {
        r1.Ces();
        C04220Ms.A0B(r3, 0);
        r2.A02 = r3;
        C04220Ms.A0B(r4, 0);
        r2.A03 = r4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C121167El) {
                C121167El r8 = (C121167El) obj;
                if (!C04220Ms.A0I(this.A02, r8.A02) || this.A03 != r8.A03 || !C04220Ms.A0I(this.A01, r8.A01) || this.A00 != r8.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ C121167El() {
        C147168nV r4 = C102756Wk.A00;
        AnonymousClass69J r3 = AnonymousClass69J.Ltr;
        C123437Wx r2 = new C123437Wx();
        long j = AnonymousClass7JK.A02;
        this.A02 = r4;
        this.A03 = r3;
        this.A01 = r2;
        this.A00 = j;
    }

    public static long A00(C121167El r3) {
        long j = r3.A00;
        r3.A01.Cfm();
        return j;
    }

    public final int hashCode() {
        return AnonymousClass0wJ.A05(this.A01, AnonymousClass0wJ.A05(this.A03, C18210wN.A04(this.A02))) + C18190wL.A02(this.A00);
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("DrawParams(density=");
        A0s.append(this.A02);
        A0s.append(", layoutDirection=");
        A0s.append(this.A03);
        A0s.append(", canvas=");
        A0s.append(this.A01);
        A0s.append(", size=");
        return C86104wH.A0y(AnonymousClass7JK.A03(this.A00), A0s);
    }
}
