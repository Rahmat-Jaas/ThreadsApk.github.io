package X;

import android.os.Build;
import java.util.Locale;

/* renamed from: X.7Av  reason: invalid class name and case insensitive filesystem */
public final class C120447Av {
    static {
        int i = Build.VERSION.SDK_INT;
    }

    public static boolean A00() {
        return C86114wI.A1U(Build.VERSION.SDK_INT, 30);
    }

    public static boolean A01() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            return true;
        }
        if (i < 32) {
            return false;
        }
        String str = Build.VERSION.CODENAME;
        if ("REL".equals(str)) {
            return false;
        }
        Locale locale = Locale.ROOT;
        if (str.toUpperCase(locale).compareTo("Tiramisu".toUpperCase(locale)) >= 0) {
            return true;
        }
        return false;
    }
}
