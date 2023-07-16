package X;

/* renamed from: X.1eI  reason: invalid class name */
public final class AnonymousClass1eI extends AnonymousClass1eT {
    public final /* synthetic */ String A00;
    public final /* synthetic */ C130667qT A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1eI(C130667qT r2, String str) {
        super(false);
        this.A01 = r2;
        this.A00 = str;
    }

    public final void A03(AnonymousClass3XX r4) {
        Throwable th = r4.A01;
        if (AnonymousClass0wJ.A1W(th)) {
            C10450iM.A06(this.A00, "Failed to load consent flow", th);
        } else {
            C10450iM.A03(this.A00, "Failed to load consent flow");
        }
    }

    public final /* bridge */ /* synthetic */ void A04(Object obj) {
        C33492Fx.A00(this.A01, (C61323St) obj);
    }
}
