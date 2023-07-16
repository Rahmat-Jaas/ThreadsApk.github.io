package X;

import android.content.Context;

/* renamed from: X.3Qr  reason: invalid class name and case insensitive filesystem */
public final class C60833Qr {
    public static GHO A00;

    public static synchronized GHO A00(Context context) {
        GHO gho;
        synchronized (C60833Qr.class) {
            gho = A00;
            if (gho == null) {
                gho = new GGF(context.getApplicationContext()).A00();
                A00 = gho;
            }
        }
        return gho;
    }
}
