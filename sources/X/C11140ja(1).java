package X;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: X.0ja  reason: invalid class name and case insensitive filesystem */
public final class C11140ja {
    public Context A00;
    public SharedPreferences A01;

    public C11140ja(Context context) {
        this.A00 = context;
        this.A01 = C08340dC.A00(context, "analyticsprefs");
    }

    public final void A00(C10300i6 r3, String str) {
        AnonymousClass0gN.A00().AKp(new C15550rV(this, r3, str));
    }
}
