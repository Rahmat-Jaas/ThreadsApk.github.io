package X;

/* renamed from: X.0Ke  reason: invalid class name and case insensitive filesystem */
public final class C03660Ke implements C07620bo {
    public final C07620bo[] A00;

    public final Integer BI0() {
        Integer num = AnonymousClass006.A0C;
        for (C07620bo BI0 : this.A00) {
            int intValue = BI0.BI0().intValue();
            if (intValue == 0) {
                return AnonymousClass006.A00;
            }
            if (intValue == 1) {
                num = AnonymousClass006.A01;
            }
        }
        return num;
    }

    public final void BjR(C05190Ru r6) {
        C07620bo[] r4 = this.A00;
        int length = r4.length;
        for (int i = 0; i < length; i++) {
            if (r4[i].BI0() != AnonymousClass006.A0C) {
                r4[i].BjR(r6);
            }
        }
    }

    public final void BtC(C05190Ru r6) {
        C07620bo[] r4 = this.A00;
        int length = r4.length;
        for (int i = 0; i < length; i++) {
            if (r4[i].BI0() != AnonymousClass006.A0C) {
                r4[i].BtC(r6);
            }
        }
    }

    public C03660Ke(C07620bo... r1) {
        this.A00 = r1;
    }
}
