package X;

/* renamed from: X.5k8  reason: invalid class name */
public final class AnonymousClass5k8 extends C1202479j {
    public final /* synthetic */ C142618fJ A00;
    public final /* synthetic */ C142618fJ A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5k8(C142618fJ r1, C142618fJ r2, C104996ci r3) {
        super(r3);
        this.A01 = r1;
        this.A00 = r2;
    }

    public static M5J A00(C142618fJ r1, C142618fJ r2, C104996ci r3) {
        M5J A03 = new AnonymousClass5k8(r1, r2, r3).A03();
        C04220Ms.A06(A03);
        return A03;
    }

    public final C145388kQ A04(C113806sA r2) {
        return (C145388kQ) this.A00.apply(r2);
    }

    public final AnonymousClass7Kx A05(AnonymousClass7EC r4) {
        C142618fJ r0 = this.A01;
        Object obj = r4.A01;
        Throwable th = (Throwable) r0.apply(obj);
        if (th == null && (th = r4.A02) == null) {
            return AnonymousClass7Kx.A0A(obj);
        }
        return AnonymousClass7Kx.A0B((Object) null, th);
    }
}
