package X;

import android.content.Context;

/* renamed from: X.0dF  reason: invalid class name and case insensitive filesystem */
public final class C08360dF {
    public static final void A01(Context context) {
        C04220Ms.A0B(context, 0);
        if (C08350dD.A01 == null) {
            C08350dD.A01 = new C08350dD(context);
        }
    }

    public static final C08350dD A00() {
        C08350dD r0 = C08350dD.A01;
        if (r0 != null) {
            return r0;
        }
        C04220Ms.A0E("instance");
        throw null;
    }
}
