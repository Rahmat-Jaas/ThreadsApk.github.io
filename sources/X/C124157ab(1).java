package X;

/* renamed from: X.7ab  reason: invalid class name and case insensitive filesystem */
public final class C124157ab implements C147138nS {
    public final AnonymousClass587 A00;

    public C124157ab(AnonymousClass587 r2) {
        C04220Ms.A0B(r2, 1);
        this.A00 = r2;
    }

    public final /* synthetic */ C62793ak create(Class cls, C111686o9 r3) {
        return C147138nS.A00(this, cls);
    }

    public final C62793ak create(Class cls) {
        C04220Ms.A0B(cls, 0);
        if (cls.isAssignableFrom(AnonymousClass58U.class)) {
            return new AnonymousClass58U(this.A00);
        }
        throw C18190wL.A0a(AnonymousClass0wJ.A0t("Unknown ViewModel class: ", cls));
    }
}
