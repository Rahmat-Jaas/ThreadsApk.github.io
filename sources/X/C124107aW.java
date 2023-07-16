package X;

/* renamed from: X.7aW  reason: invalid class name and case insensitive filesystem */
public final class C124107aW implements C147138nS {
    public final C106906fp[] A00;

    public C124107aW(C106906fp... r2) {
        C04220Ms.A0B(r2, 1);
        this.A00 = r2;
    }

    public final C62793ak create(Class cls, C111686o9 r7) {
        AnonymousClass0wJ.A1N(cls, r7);
        C881156u r2 = null;
        for (C106906fp r0 : this.A00) {
            if (C04220Ms.A0I(r0.A00, cls)) {
                r2 = new C881156u();
            }
        }
        if (r2 != null) {
            return r2;
        }
        throw C18190wL.A0a(AnonymousClass00U.A0L("No initializer set for given class ", cls.getName()));
    }

    public final /* synthetic */ C62793ak create(Class cls) {
        throw C86134wK.A0s("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
    }
}
