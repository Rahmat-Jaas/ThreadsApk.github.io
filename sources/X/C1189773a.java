package X;

import android.os.Looper;

/* renamed from: X.73a  reason: invalid class name and case insensitive filesystem */
public final class C1189773a {
    public static volatile Looper A00;

    public static Looper A00(C10300i6 r4) {
        int i;
        Looper looper = A00;
        AnonymousClass0TJ r3 = AnonymousClass0TJ.A05;
        if (C63803iN.A0E(r3, r4, 36326515561997935L)) {
            i = C63803iN.A07(r3, r4, 36607990538769228L).intValue();
        } else {
            i = 9;
        }
        if (looper == null) {
            synchronized (C1189773a.class) {
                looper = A00;
                if (looper == null) {
                    looper = C86114wI.A0E("IgLooper.backgroundLooper", i);
                    A00 = looper;
                }
            }
        }
        looper.getClass();
        return looper;
    }
}
