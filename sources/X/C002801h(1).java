package X;

import java.util.Locale;

/* renamed from: X.01h  reason: invalid class name and case insensitive filesystem */
public final class C002801h {
    public static void A00(int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
    }

    public static void A01(int i, int i2, String str, int i3) {
        if (i < i2) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i3)}));
        } else if (i > i3) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i3)}));
        }
    }

    public static void A02(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException(String.valueOf(obj2));
        }
    }

    public static void A03(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void A04(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void A05(boolean z, String str) {
        if (!z) {
            throw new IllegalStateException(str);
        }
    }
}
