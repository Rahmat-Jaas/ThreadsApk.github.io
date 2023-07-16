package X;

/* renamed from: X.0ew  reason: invalid class name and case insensitive filesystem */
public final class C09150ew implements AnonymousClass0WM {
    public Object A00;
    public final /* synthetic */ C15030qb A01;
    public final /* synthetic */ Object A02;

    public C09150ew(C15030qb r1, Object obj) {
        this.A01 = r1;
        this.A02 = obj;
    }

    public final void DAd(String str, double d) {
        ((C15680ri) this.A00).A0B(str, Double.valueOf(d));
    }

    public final void DAe(String str, int i) {
        ((C15680ri) this.A00).A09(Integer.valueOf(i), str);
    }

    public final void DAf(String str, long j) {
        ((C15680ri) this.A00).A0C(str, Long.valueOf(j));
    }

    public final void DAg(String str, String str2) {
        ((C15680ri) this.A00).A0D(str, str2);
    }

    public final void DAh(String str, boolean z) {
        ((C15680ri) this.A00).A0A(str, Boolean.valueOf(z));
    }

    public final void DAi(String str, int[] iArr) {
        C15680ri r4 = (C15680ri) this.A00;
        C15560rW r3 = new C15560rW();
        for (int A012 : iArr) {
            r3.A01(A012);
        }
        r4.A08(r3, str);
    }

    public final void DAj(String str, long[] jArr) {
        C15680ri r5 = (C15680ri) this.A00;
        C15560rW r4 = new C15560rW();
        for (long A022 : jArr) {
            r4.A02(A022);
        }
        r5.A08(r4, str);
    }

    public final void DAk(String str, String[] strArr) {
        this.A01.A03(this.A00, str, strArr);
    }

    public final void DAm(String str) {
        C15680ri r0 = new C15680ri();
        ((C15680ri) this.A02).A07(r0, str);
        this.A00 = r0;
    }
}
