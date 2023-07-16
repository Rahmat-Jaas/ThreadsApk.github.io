package X;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: X.3S2  reason: invalid class name */
public final class AnonymousClass3S2 {
    public static AnonymousClass3S2 A01;
    public SharedPreferences A00;

    public static synchronized AnonymousClass3S2 A00() {
        AnonymousClass3S2 r1;
        synchronized (AnonymousClass3S2.class) {
            r1 = A01;
            if (r1 == null) {
                r1 = new AnonymousClass3S2(C10600ic.A00);
                A01 = r1;
            }
        }
        return r1;
    }

    public AnonymousClass3S2(Context context) {
        this.A00 = C08340dC.A00(context, "autobackupprefs");
    }
}
