package X;

/* renamed from: X.6Fj  reason: invalid class name and case insensitive filesystem */
public final class C98396Fj {
    public static final C62793ak A00(C147188nY r3, C147138nS r4, AnonymousClass06C r5, C111686o9 r6, Class cls, String str) {
        AnonymousClass7IU r2;
        C62793ak A01;
        r3.Cvb(-1439476281);
        if (r4 != null) {
            r2 = new AnonymousClass7IU(r4, r5.getViewModelStore(), r6);
        } else if (r5 instanceof C012605w) {
            r2 = new AnonymousClass7IU(((C012605w) r5).getDefaultViewModelProviderFactory(), r5.getViewModelStore(), r6);
        } else {
            r2 = new AnonymousClass7IU(r5);
        }
        if (str != null) {
            A01 = r2.A02(cls, str);
        } else {
            A01 = r2.A01(cls);
        }
        AnonymousClass7W3.A0y(r3);
        return A01;
    }
}
