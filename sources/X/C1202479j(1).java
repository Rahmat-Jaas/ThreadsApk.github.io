package X;

/* renamed from: X.79j  reason: invalid class name and case insensitive filesystem */
public abstract class C1202479j {
    public C113806sA A00;
    public boolean A01;
    public final C104996ci A02;
    public final C880456m A03 = new C880456m(this);

    public abstract C145388kQ A04(C113806sA r1);

    public abstract AnonymousClass7Kx A05(AnonymousClass7EC r1);

    public static void A02(M5J m5j, C1202479j r5) {
        AnonymousClass7Kx A012;
        boolean z;
        if (r5.A01) {
            C880456m r3 = r5.A03;
            C145388kQ r0 = r3.A01;
            if (r0 != null) {
                r0.AHZ(r3);
            }
            C113806sA r1 = r5.A00;
            if (r1 != null) {
                synchronized (r1) {
                    z = r1.A02;
                }
                if (!z) {
                    r5.A00.A00();
                }
            }
            if (m5j == null && r3.A08() != (A012 = AnonymousClass7Kx.A01())) {
                r3.A0H(A012);
            }
            r5.A00 = new C113806sA();
            AnonymousClass7Kx r12 = new AnonymousClass7Kx(AnonymousClass67Q.LOADING, (Object) null, (Throwable) null);
            M5J m5j2 = r3.A00;
            if (m5j2 != null) {
                r3.A0J(m5j2);
            }
            r3.A00 = m5j;
            if (m5j != null) {
                r3.A0K(m5j, C86164wN.A0O(r12, r3, 26));
            }
            C145388kQ A04 = r5.A04(r5.A00);
            C145388kQ r02 = r3.A01;
            if (r02 != null) {
                r02.AHZ(r3);
            }
            r3.A01 = A04;
            if (r3.A0I() && A04 != null) {
                A04.A6o(r3);
            }
        }
    }

    public final M5J A03() {
        if (!this.A01) {
            this.A01 = true;
            AnonymousClass7Kx A0R = C86104wH.A0R(this.A03);
            if (A0R == null || A0R.A01 == null) {
                A02((M5J) null, this);
            }
        }
        return this.A03;
    }

    public C1202479j(C104996ci r2) {
        this.A02 = r2;
    }
}
