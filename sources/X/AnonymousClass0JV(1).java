package X;

import java.util.Locale;

/* renamed from: X.0JV  reason: invalid class name */
public final class AnonymousClass0JV {
    public static AnonymousClass0JW A00 = AnonymousClass0CY.A01;

    public static void A00(Class cls, String str, Object... objArr) {
        AnonymousClass0JW r2 = A00;
        if (r2.isLoggable(5)) {
            r2.w(cls.getSimpleName(), String.format((Locale) null, str, objArr));
        }
    }

    public static void A01(String str, String str2) {
        AnonymousClass0JW r1 = A00;
        if (r1.isLoggable(6)) {
            r1.e(str, str2);
        }
    }

    public static void A02(String str, String str2) {
        AnonymousClass0JW r1 = A00;
        if (r1.isLoggable(5)) {
            r1.w(str, str2);
        }
    }

    public static void A03(String str, String str2, Throwable th) {
        AnonymousClass0JW r1 = A00;
        if (r1.isLoggable(6)) {
            r1.e(str, str2, th);
        }
    }

    public static void A04(String str, String str2, Throwable th) {
        AnonymousClass0JW r1 = A00;
        if (r1.isLoggable(5)) {
            r1.w(str, str2, th);
        }
    }

    public static void A05(String str, String str2, Throwable th) {
        AnonymousClass0JW r1 = A00;
        if (r1.isLoggable(6)) {
            r1.wtf(str, str2, th);
        }
    }
}
