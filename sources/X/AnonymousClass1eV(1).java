package X;

/* renamed from: X.1eV  reason: invalid class name */
public final class AnonymousClass1eV extends AnonymousClass1eR {
    public final /* synthetic */ C109326jp A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ C130667qT A02;
    public final /* synthetic */ AnonymousClass601 A03;
    public final /* synthetic */ C109326jp A04;

    public final void A03(AnonymousClass3XX r3) {
        C04220Ms.A0B(r3, 0);
        C63893iY.A0G(this.A03, this.A00);
        AnonymousClass2JX.A00(r3, "AsyncLoad", this.A01);
    }

    public AnonymousClass1eV(C130667qT r1, AnonymousClass601 r2, C109326jp r3, C109326jp r4, String str) {
        this.A04 = r3;
        this.A03 = r2;
        this.A02 = r1;
        this.A00 = r4;
        this.A01 = str;
    }

    public final /* bridge */ /* synthetic */ void A04(Object obj) {
        C121997Jj r8 = (C121997Jj) obj;
        C04220Ms.A0B(r8, 0);
        C61323St r5 = new C61323St((AnonymousClass2LD) null, r8.A01, this.A04, r8.A03);
        AnonymousClass601 r4 = this.A03;
        AnonymousClass3HX r2 = r4.A00;
        C63893iY A05 = C63893iY.A05(AnonymousClass3VO.A00(), r8.A02, 0);
        if (r2 != null) {
            C61043Rr.A00(C122047Jt.A00(r5, r2, AnonymousClass4To.A00()), A05, r5.A02);
            return;
        }
        C10450iM.A03("bloks_async_load", "Async Load run with null context, this is legacy behavior");
        C122047Jt.A02(C63913ic.A05(r4), r5, this.A02, A05, AnonymousClass4To.A00());
    }
}
