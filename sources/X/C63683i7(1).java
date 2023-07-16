package X;

import android.os.Build;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.facebook.proxygen.TraceFieldType;
import java.util.Locale;

/* renamed from: X.3i7  reason: invalid class name and case insensitive filesystem */
public final class C63683i7 {
    public static final String A02(C10300i6 r1) {
        C04220Ms.A0B(r1, 0);
        String A0l = C18190wL.A0l(r1);
        if (A0l == null) {
            return "";
        }
        return A0l;
    }

    public static final String A03(C10300i6 r1) {
        C04220Ms.A0B(r1, 0);
        return C18190wL.A0m(r1);
    }

    public static void A04(AnonymousClass0A3 r2) {
        r2.A0S("os_version", Long.valueOf((long) Build.VERSION.SDK_INT));
    }

    public static final String A00() {
        String A0g = C18200wM.A0g();
        if (A0g == null) {
            return "";
        }
        return A0g;
    }

    public static final String A01() {
        String name = C10340iB.A00().name();
        Locale locale = Locale.US;
        C04220Ms.A08(locale);
        return C18190wL.A0r(locale, name);
    }

    public static void A05(AnonymousClass0A3 r2) {
        r2.A0T("guid", A00());
    }

    public static void A06(AnonymousClass0A3 r2, C10300i6 r3) {
        r2.A0T("fb_family_device_id", A02(r3));
    }

    public static void A07(USLEBaseShape0S0000000 uSLEBaseShape0S0000000) {
        uSLEBaseShape0S0000000.A0T("release_channel", A01());
    }

    public static void A08(USLEBaseShape0S0000000 uSLEBaseShape0S0000000) {
        uSLEBaseShape0S0000000.A0T("guid", A00());
    }

    public static void A09(USLEBaseShape0S0000000 uSLEBaseShape0S0000000, C10300i6 r3) {
        uSLEBaseShape0S0000000.A0T("source", A03(r3));
    }

    public static void A0A(USLEBaseShape0S0000000 uSLEBaseShape0S0000000, C10300i6 r3) {
        uSLEBaseShape0S0000000.A0T("guid", A00());
        uSLEBaseShape0S0000000.A0T("source", A03(r3));
        uSLEBaseShape0S0000000.Bb4();
    }

    public static void A0B(USLEBaseShape0S0000000 uSLEBaseShape0S0000000, String str, double d) {
        uSLEBaseShape0S0000000.A0R(TraceFieldType.StartTime, Double.valueOf(d));
        uSLEBaseShape0S0000000.A0T(OptSvcAnalyticsStore.LOGGING_KEY_STEP, str);
        uSLEBaseShape0S0000000.A0T("guid", A00());
    }
}
