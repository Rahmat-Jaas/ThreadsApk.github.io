package X;

/* renamed from: X.54R  reason: invalid class name */
public final class AnonymousClass54R extends AnonymousClass54S {
    public final /* synthetic */ C877754l A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass54R(C877754l r1) {
        super(r1);
        this.A00 = r1;
    }

    public final C123657Xy Bg4(long j) {
        long j2;
        C877754l r0 = this.A00;
        A0D(j);
        C146098ld Bg3 = r0.A00.Bg3(C123657Xy.A09(r0), this, j);
        if (Bg3 != null) {
            j2 = AnonymousClass7FV.A00(Bg3.getWidth(), Bg3.getHeight());
        } else {
            j2 = 0;
        }
        A0C(j2);
        if (C04220Ms.A0I(this.A01, Bg3) || Bg3 == null || !C86164wN.A1R(Bg3.AQ9()) || C04220Ms.A0I(Bg3.AQ9(), (Object) null)) {
            this.A01 = Bg3;
            return this;
        }
        C04220Ms.A0A((Object) null);
        throw null;
    }
}
