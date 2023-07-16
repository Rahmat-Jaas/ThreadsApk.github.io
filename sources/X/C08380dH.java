package X;

import android.content.Context;

/* renamed from: X.0dH  reason: invalid class name and case insensitive filesystem */
public final class C08380dH {
    public final synchronized C09120et A00() {
        Context context;
        context = C10600ic.A00;
        C04220Ms.A06(context);
        return A01(context);
    }

    public final synchronized C09120et A01(Context context) {
        C09120et r0;
        C04220Ms.A0B(context, 0);
        r0 = C09120et.A3C;
        if (r0 == null) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
                C04220Ms.A06(context);
            }
            r0 = new C09120et(context);
            C09120et.A3C = r0;
        }
        return r0;
    }
}
