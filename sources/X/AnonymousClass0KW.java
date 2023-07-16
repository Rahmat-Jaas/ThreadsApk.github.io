package X;

import com.facebook.common.stringformat.StringFormatUtil;

/* renamed from: X.0KW  reason: invalid class name */
public final class AnonymousClass0KW {
    public static void A00(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void A01(Object obj, String str, boolean z) {
        if (!z) {
            throw new IllegalStateException(StringFormatUtil.formatStrLocaleSafe(str, obj));
        }
    }

    public static void A02(Object obj, String str, Object... objArr) {
        if (obj == null) {
            throw new NullPointerException(StringFormatUtil.formatStrLocaleSafe(str, objArr));
        }
    }

    public static void A03(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void A04(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static void A05(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void A06(boolean z, String str) {
        if (!z) {
            throw new IllegalStateException(str);
        }
    }
}
