package X;

/* renamed from: X.18u  reason: invalid class name and case insensitive filesystem */
public final class C210718u extends AnonymousClass0Sf implements C81364nf {
    public final C10300i6 A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C210718u(C10300i6 r2) {
        this(r2, false, false, false);
        C04220Ms.A0B(r2, 1);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C210718u) {
                C210718u r5 = (C210718u) obj;
                if (!(C04220Ms.A0I(this.A00, r5.A00) && this.A01 == r5.A01 && this.A03 == r5.A03 && this.A02 == r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A04 = C18210wN.A04(this.A00);
        boolean z = this.A01;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = (A04 + (z ? 1 : 0)) * 31;
        boolean z2 = this.A03;
        if (z2) {
            z2 = true;
        }
        int i3 = (i2 + (z2 ? 1 : 0)) * 31;
        if (!this.A02) {
            i = 0;
        }
        return i3 + i;
    }

    public C210718u(C10300i6 r2, boolean z, boolean z2, boolean z3) {
        C04220Ms.A0B(r2, 1);
        this.A00 = r2;
        this.A01 = z;
        this.A03 = z2;
        this.A02 = z3;
    }
}
