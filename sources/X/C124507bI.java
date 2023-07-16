package X;

/* renamed from: X.7bI  reason: invalid class name and case insensitive filesystem */
public final class C124507bI implements C147138nS {
    public final AnonymousClass588 A00;
    public final AnonymousClass587 A01;
    public final AnonymousClass58K A02;

    public C124507bI(AnonymousClass588 r2, AnonymousClass587 r3, AnonymousClass58K r4) {
        AnonymousClass0wJ.A1O(r3, r2);
        C04220Ms.A0B(r4, 3);
        this.A01 = r3;
        this.A00 = r2;
        this.A02 = r4;
    }

    public final /* synthetic */ C62793ak create(Class cls, C111686o9 r3) {
        return C147138nS.A00(this, cls);
    }

    public final C62793ak create(Class cls) {
        C04220Ms.A0B(cls, 0);
        if (cls.equals(AnonymousClass58J.class)) {
            return new AnonymousClass58J(this.A00, this.A01, this.A02);
        }
        throw C18190wL.A0a("Input class not implemented");
    }
}
