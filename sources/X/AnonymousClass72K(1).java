package X;

import android.view.ViewConfiguration;

/* renamed from: X.72K  reason: invalid class name */
public final class AnonymousClass72K {
    public static final float A00 = ViewConfiguration.getScrollFriction();

    public static final AnonymousClass8cU A00(C147188nY r3) {
        C147168nV r2 = (C147168nV) C147188nY.A0q(r3, 904445851);
        boolean A0y = C147188nY.A0y(r3, Float.valueOf(r2.Acr()));
        AnonymousClass7W3 r32 = (AnonymousClass7W3) r3;
        Object A13 = r32.A13();
        if (A0y || A13 == AnonymousClass7GN.A00) {
            A13 = new C122717To(new C122807Tx(r2));
            r32.A14(A13);
        }
        AnonymousClass7W3.A0w(r32, false);
        AnonymousClass8cU r1 = (AnonymousClass8cU) A13;
        AnonymousClass7W3.A0w(r32, false);
        return r1;
    }
}
