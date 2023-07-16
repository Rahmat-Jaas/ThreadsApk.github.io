package X;

import android.content.Context;

/* renamed from: X.0tz  reason: invalid class name and case insensitive filesystem */
public final class C16920tz {
    public static C16920tz A03;
    public Context A00;
    public final C13560nu A01;
    public final C13510np A02;

    public C16920tz(Context context) {
        C13560nu r1;
        synchronized (C13700o9.class) {
            r1 = C13700o9.A00;
            if (r1 == null) {
                r1 = new C13560nu(context);
                C13700o9.A00 = r1;
            }
        }
        this.A02 = C13510np.A00();
        this.A01 = r1;
        this.A00 = context;
    }

    public static synchronized C16920tz A00(Context context) {
        C16920tz r0;
        synchronized (C16920tz.class) {
            r0 = A03;
            if (r0 == null) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                r0 = new C16920tz(context);
                A03 = r0;
            }
        }
        return r0;
    }
}
