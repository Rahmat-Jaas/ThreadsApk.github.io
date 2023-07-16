package X;

/* renamed from: X.0bK  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C07320bK implements C04490Nw {
    public final /* synthetic */ AnonymousClass0MP A00;
    public final /* synthetic */ C07330bL A01;
    public final /* synthetic */ String A02;

    public /* synthetic */ C07320bK(AnonymousClass0MP r1, C07330bL r2, String str) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = str;
    }

    public final void CK5(C06180Xz r6) {
        C07330bL r4 = this.A01;
        AnonymousClass0MP r1 = this.A00;
        String str = this.A02;
        AnonymousClass0ND r3 = AnonymousClass0ND.CRITICAL_REPORT;
        r6.A00(r1, r3, str);
        C04170Mn r2 = new C04170Mn((Throwable) null);
        C04100Mg r12 = r4.A00;
        r12.A07(r2, r3, r4);
        r12.A07(r2, AnonymousClass0ND.LARGE_REPORT, r4);
    }
}
