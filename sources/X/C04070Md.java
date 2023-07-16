package X;

/* renamed from: X.0Md  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C04070Md implements Runnable {
    public final /* synthetic */ C04170Mn A00;
    public final /* synthetic */ C04100Mg A01;
    public final /* synthetic */ AnonymousClass0ND A02;
    public final /* synthetic */ AnonymousClass0PC A03;

    public /* synthetic */ C04070Md(C04170Mn r1, C04100Mg r2, AnonymousClass0ND r3, AnonymousClass0PC r4) {
        this.A01 = r2;
        this.A03 = r4;
        this.A02 = r3;
        this.A00 = r1;
    }

    public final void run() {
        C04100Mg r1 = this.A01;
        AnonymousClass0PC r4 = this.A03;
        AnonymousClass0ND r3 = this.A02;
        C04170Mn r2 = this.A00;
        try {
            r1.A0C(r3, r4);
            r1.A08(r2, r3, r4, r4.As3(), (Integer) null, 0);
            r1.A0B(r3, r4);
        } catch (Throwable th) {
            C04790Pd.A00();
            AnonymousClass0LU.A0L("lacrima", "Failed to apply collectors: %s", th, r4.Awx());
        }
    }
}
