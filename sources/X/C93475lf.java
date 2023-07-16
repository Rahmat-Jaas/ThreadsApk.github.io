package X;

/* renamed from: X.5lf  reason: invalid class name and case insensitive filesystem */
public final class C93475lf extends C93485lg {
    public final AnonymousClass76Q A00;
    public final C113426rN A01;
    public final C142198eH A02;

    public C93475lf(C142198eH r2, AnonymousClass76Q r3, C113426rN r4, int i) {
        super(i);
        this.A01 = r4;
        this.A00 = r3;
        this.A02 = r2;
        if (i == 2 && r3.A01) {
            throw C18190wL.A0a("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }
}
