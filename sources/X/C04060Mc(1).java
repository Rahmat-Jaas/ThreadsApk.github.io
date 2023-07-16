package X;

/* renamed from: X.0Mc  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C04060Mc implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C04170Mn A01;
    public final /* synthetic */ C04100Mg A02;
    public final /* synthetic */ AnonymousClass0PC A03;

    public /* synthetic */ C04060Mc(C04170Mn r1, C04100Mg r2, AnonymousClass0PC r3, int i) {
        this.A02 = r2;
        this.A03 = r3;
        this.A01 = r1;
        this.A00 = i;
    }

    public final void run() {
        C04100Mg r0 = this.A02;
        AnonymousClass0PC r3 = this.A03;
        C04170Mn r1 = this.A01;
        int i = this.A00;
        AnonymousClass0ND r9 = AnonymousClass0ND.LARGE_REPORT;
        r0.A0C(r9, r3);
        AnonymousClass0ND r2 = AnonymousClass0ND.CRITICAL_REPORT;
        C06820aQ As3 = r3.As3();
        r0.A08(r1, r2, r3, As3, (Integer) null, i);
        r0.A08(r1, r9, r3, As3, (Integer) null, i);
        r0.A0B(r9, r3);
    }
}
