package X;

/* renamed from: X.7ad  reason: invalid class name and case insensitive filesystem */
public final class C124177ad implements C147138nS {
    public final AnonymousClass587 A00;

    public C124177ad(AnonymousClass587 r2) {
        C04220Ms.A0B(r2, 1);
        this.A00 = r2;
    }

    public final /* synthetic */ C62793ak create(Class cls, C111686o9 r3) {
        return C147138nS.A00(this, cls);
    }

    public final C62793ak create(Class cls) {
        C04220Ms.A0B(cls, 0);
        if (cls.isAssignableFrom(AnonymousClass58K.class)) {
            return new AnonymousClass58K(this.A00);
        }
        throw C18190wL.A0a(AnonymousClass0wJ.A0t("Unknown ViewModel class: ", cls));
    }
}
