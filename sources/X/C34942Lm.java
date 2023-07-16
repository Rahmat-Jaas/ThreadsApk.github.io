package X;

import android.os.Build;
import java.util.Locale;

/* renamed from: X.2Lm  reason: invalid class name and case insensitive filesystem */
public final class C34942Lm {
    public static final boolean A00(boolean z) {
        if (Build.VERSION.SDK_INT != 28 || !z) {
            return true;
        }
        String str = Build.MODEL;
        C04220Ms.A08(str);
        String A0u = C18220wO.A0u(Locale.ROOT, str);
        if (A0u.equals("CPH1923") || A0u.equals("RMX1941")) {
            return false;
        }
        return true;
    }
}
