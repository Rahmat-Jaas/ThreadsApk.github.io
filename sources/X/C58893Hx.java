package X;

/* renamed from: X.3Hx  reason: invalid class name and case insensitive filesystem */
public final class C58893Hx {
    public final int A00;
    public final C58903Hy A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C58893Hx) {
                C58893Hx r5 = (C58893Hx) obj;
                if (!C04220Ms.A0I(this.A01, r5.A01) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C18210wN.A04(this.A01) + this.A00;
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("CdsBorderData(color=");
        A0s.append(this.A01);
        A0s.append(C28174Ezk.A00(47));
        A0s.append(this.A00);
        return AnonymousClass0wJ.A0u(A0s);
    }

    public C58893Hx(C58903Hy r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }
}
