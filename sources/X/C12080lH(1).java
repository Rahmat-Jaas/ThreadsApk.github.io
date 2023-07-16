package X;

/* renamed from: X.0lH  reason: invalid class name and case insensitive filesystem */
public final class C12080lH {
    public C15880s2 A00;
    public final C10300i6 A01;
    public final Object A02 = new Object();

    public C12080lH(C10300i6 r2) {
        AnonymousClass0E8 r0 = new AnonymousClass0E8();
        this.A01 = r2;
        this.A00 = r0;
    }

    public final void A00(C11780kn r6) {
        AnonymousClass0E8 r2;
        boolean z;
        C11660kZ A012 = C11850ku.A01(r6, this.A01);
        C04220Ms.A06(A012);
        synchronized (this.A02) {
            C15880s2 r22 = this.A00;
            if (r22 instanceof AnonymousClass0E8) {
                r2 = (AnonymousClass0E8) r22;
                this.A00 = new AnonymousClass0E7(A012);
            } else if (r22 instanceof AnonymousClass0E7) {
                r2 = null;
            } else {
                throw new AnonymousClass4VZ();
            }
        }
        if (r2 != null) {
            synchronized (r2.A01) {
                z = false;
                if (r2.A00 != null) {
                    z = true;
                }
                r2.A00 = A012;
            }
            if (!z) {
                for (C15730rn Ce1 : r2.A03) {
                    A012.Ce1(Ce1);
                }
                for (C15730rn Cd7 : r2.A02) {
                    A012.Cd7(Cd7);
                }
            }
            r2.A03.clear();
            r2.A02.clear();
        }
    }

    public C12080lH(C11780kn r3, C10300i6 r4) {
        C11660kZ A012 = C11850ku.A01(r3, r4);
        C04220Ms.A06(A012);
        AnonymousClass0E7 r0 = new AnonymousClass0E7(A012);
        this.A01 = r4;
        this.A00 = r0;
    }
}
