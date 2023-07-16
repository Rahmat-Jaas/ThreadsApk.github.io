package X;

import android.content.SharedPreferences;

/* renamed from: X.3EP  reason: invalid class name */
public final class AnonymousClass3EP {
    public final SharedPreferences A00;

    public final boolean A00(C312524w r5, boolean z) {
        if (C18230wP.A04(r5, 0) == 0 && !z) {
            return false;
        }
        if (!this.A00.getBoolean(r5.A00, false)) {
            return true;
        }
        return false;
    }

    public AnonymousClass3EP(SharedPreferences sharedPreferences) {
        this.A00 = sharedPreferences;
    }
}
