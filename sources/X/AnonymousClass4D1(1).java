package X;

/* renamed from: X.4D1  reason: invalid class name */
public final class AnonymousClass4D1 implements C83604rg {
    public final /* synthetic */ AnonymousClass1jQ A00;
    public final /* synthetic */ C570139k A01;
    public final /* synthetic */ AnonymousClass3HX A02;
    public final /* synthetic */ C127397h3 A03;

    public final void onSearchCleared(String str) {
    }

    public AnonymousClass4D1(AnonymousClass1jQ r1, C570139k r2, AnonymousClass3HX r3, C127397h3 r4) {
        this.A00 = r1;
        this.A01 = r2;
        this.A03 = r4;
        this.A02 = r3;
    }

    public final void onSearchTextChanged(String str) {
        this.A01.A02 = str;
        C127397h3 r4 = this.A03;
        C109326jp A0L = r4.A0L(40);
        if (A0L != null) {
            AnonymousClass3VO A002 = AnonymousClass3VO.A00();
            A002.A03(r4, 0);
            String A022 = AnonymousClass0hA.A02(str);
            A022.getClass();
            A002.A03(A022, 1);
            AnonymousClass3HX r1 = this.A02;
            C122047Jt.A03(r1, r4, C63893iY.A04(A002, r1, 2), A0L);
        }
    }
}
