package X;

/* renamed from: X.1uS  reason: invalid class name and case insensitive filesystem */
public final class C28501uS extends AnonymousClass9UH {
    public final /* synthetic */ C23231co A00;
    public final /* synthetic */ boolean A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28501uS(C12560m7 r1, C23231co r2, boolean z) {
        super(r1);
        this.A00 = r2;
        this.A01 = z;
    }

    public final void onFail(AnonymousClass3XX r5) {
        int A03 = C14030oh.A03(1542950557);
        C23231co r2 = this.A00;
        r2.A03.setChecked(!this.A01);
        C62973bE.A02(r2.requireActivity(), r5);
        C14030oh.A0A(69483958, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C14030oh.A03(1969305173);
        int A032 = C14030oh.A03(499403078);
        this.A00.A03.setChecked(this.A01);
        C14030oh.A0A(-2096988267, A032);
        C14030oh.A0A(1134065829, A03);
    }
}
