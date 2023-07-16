package X;

/* renamed from: X.6sU  reason: invalid class name and case insensitive filesystem */
public final class C113976sU {
    public int A00;
    public Integer A01 = AnonymousClass006.A0Y;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final AnonymousClass7Y3 A07;
    public final AnonymousClass54J A08 = new AnonymousClass54J(this);

    public final void A00() {
        AnonymousClass7Y3 A09;
        AnonymousClass54J r4 = this.A08;
        if (r4.A06) {
            r4.A06 = false;
            Object obj = r4.A02;
            AnonymousClass7IW r2 = r4.A0B.A07.A0a;
            boolean A1X = C86144wL.A1X(obj, r2.A04.B01());
            r4.A02 = r2.A04.B01();
            if (A1X && (A09 = this.A07.A09()) != null) {
                A09.A0P(false);
            }
        }
    }

    public final void A01(int i) {
        AnonymousClass7Y3 A09;
        C113976sU r2;
        int i2 = this.A00;
        this.A00 = i;
        boolean z = false;
        boolean A1W = C18180wK.A1W(i2);
        if (i == 0) {
            z = true;
        }
        if (A1W != z && (A09 = this.A07.A09()) != null && (r2 = A09.A0Y) != null) {
            int i3 = r2.A00;
            int i4 = i3 + 1;
            if (i == 0) {
                i4 = i3 - 1;
            }
            r2.A01(i4);
        }
    }

    public C113976sU(AnonymousClass7Y3 r2) {
        this.A07 = r2;
    }
}
