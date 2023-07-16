package X;

import android.content.Context;

/* renamed from: X.0f8  reason: invalid class name and case insensitive filesystem */
public final class C09260f8 {
    public final C09250f7 A00(Context context) {
        C04220Ms.A0B(context, 0);
        C09250f7 r1 = C09250f7.A04;
        if (r1 == null) {
            synchronized (this) {
                r1 = C09250f7.A04;
                if (r1 == null) {
                    Context applicationContext = context.getApplicationContext();
                    C04220Ms.A06(applicationContext);
                    r1 = new C09250f7(applicationContext);
                    C09250f7.A04 = r1;
                }
            }
        }
        return r1;
    }
}
