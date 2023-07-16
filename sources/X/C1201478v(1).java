package X;

/* renamed from: X.78v  reason: invalid class name and case insensitive filesystem */
public final class C1201478v {
    public final AnonymousClass20X A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;

    public /* synthetic */ C1201478v(int i, boolean z) {
        AnonymousClass20X r5 = null;
        boolean z2 = true;
        boolean A1V = C18180wK.A1V(i & 2);
        boolean A1V2 = C18180wK.A1V(i & 4);
        r5 = (i & 8) != 0 ? AnonymousClass20X.Inherit : r5;
        boolean A1Z = C86154wM.A1Z(i & 16, z);
        z2 = (i & 32) == 0 ? false : z2;
        C04220Ms.A0B(r5, 4);
        this.A02 = A1V;
        this.A03 = A1V2;
        this.A00 = r5;
        this.A04 = A1Z;
        this.A01 = z2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1201478v) {
                C1201478v r5 = (C1201478v) obj;
                if (!(this.A02 == r5.A02 && this.A03 == r5.A03 && this.A00 == r5.A00 && this.A04 == r5.A04 && this.A01 == r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A042 = C86124wJ.A04(this.A02 ? 1 : 0);
        return ((((AnonymousClass0wJ.A05(this.A00, ((((((A042 * 31) + 1237) * 31) + A042) * 31) + C86124wJ.A04(this.A03 ? 1 : 0)) * 31) + C86124wJ.A04(this.A04 ? 1 : 0)) * 31) + C86124wJ.A04(this.A01 ? 1 : 0)) * 31) + 1237;
    }

    public C1201478v() {
        AnonymousClass20X r0 = AnonymousClass20X.Inherit;
        this.A02 = true;
        this.A03 = true;
        this.A00 = r0;
        this.A04 = true;
        this.A01 = true;
    }
}
