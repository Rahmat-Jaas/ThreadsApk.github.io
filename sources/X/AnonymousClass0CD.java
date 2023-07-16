package X;

import android.content.Context;

/* renamed from: X.0CD  reason: invalid class name */
public abstract class AnonymousClass0CD {
    public static AnonymousClass0CD A00;

    public abstract long A01(int i);

    public abstract void A02(C02570By r1, String str, int i, long j, long j2);

    public static synchronized AnonymousClass0CD A00(Context context) {
        AnonymousClass0CD r0;
        synchronized (AnonymousClass0CD.class) {
            r0 = A00;
            if (r0 == null) {
                r0 = new AnonymousClass0Kv(context);
                A00 = r0;
            }
        }
        return r0;
    }
}
