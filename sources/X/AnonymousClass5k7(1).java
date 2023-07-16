package X;

/* renamed from: X.5k7  reason: invalid class name */
public final class AnonymousClass5k7 extends C1202479j {
    public final /* synthetic */ C142618fJ A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5k7(C142618fJ r1, C104996ci r2) {
        super(r2);
        this.A00 = r1;
    }

    public static M5J A00(C142618fJ r1, C104996ci r2) {
        return new AnonymousClass5k7(r1, r2).A03();
    }

    public final C145388kQ A04(C113806sA r2) {
        return (C145388kQ) this.A00.apply(r2);
    }

    public final AnonymousClass7Kx A05(AnonymousClass7EC r2) {
        Throwable th = r2.A02;
        if (th == null) {
            return AnonymousClass7Kx.A0A(r2.A01);
        }
        return AnonymousClass7Kx.A0C(th);
    }
}
