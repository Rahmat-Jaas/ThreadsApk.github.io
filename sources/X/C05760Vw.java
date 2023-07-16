package X;

import android.content.Context;
import android.telephony.TelephonyManager;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;

/* renamed from: X.0Vw  reason: invalid class name and case insensitive filesystem */
public final class C05760Vw {
    public static final String A00(Context context) {
        C04220Ms.A0B(context, 0);
        Object systemService = context.getSystemService("phone");
        C04220Ms.A0C(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
        TelephonyManager telephonyManager = (TelephonyManager) systemService;
        String simCountryIso = telephonyManager.getSimCountryIso();
        if (simCountryIso == null && (simCountryIso = telephonyManager.getNetworkCountryIso()) == null) {
            simCountryIso = Locale.getDefault().getCountry();
        }
        C04220Ms.A09(simCountryIso);
        Locale locale = Locale.ROOT;
        C04220Ms.A08(locale);
        String lowerCase = simCountryIso.toLowerCase(locale);
        C04220Ms.A06(lowerCase);
        return lowerCase;
    }

    public static final boolean A03(String str, String str2) {
        Locale locale = Locale.ROOT;
        C04220Ms.A08(locale);
        String lowerCase = str.toLowerCase(locale);
        C04220Ms.A06(lowerCase);
        List A0f = AnonymousClass8bP.A0f(lowerCase, new String[]{InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1}, 0, 6);
        ArrayList arrayList = new ArrayList();
        for (Object next : A0f) {
            if (!((String) next).equals("")) {
                arrayList.add(next);
            }
        }
        String lowerCase2 = str2.toLowerCase(locale);
        C04220Ms.A06(lowerCase2);
        return arrayList.contains(lowerCase2);
    }

    public static final synchronized Pair A02(Context context, String str, AnonymousClass0ZU r8, boolean z, boolean z2) {
        Pair A01;
        synchronized (C05760Vw.class) {
            A01 = A01(context, str, r8, z, z2);
            AnonymousClass0LU.A0O("proxy_service", "Should proxy traffic: %b (%s)", A01.A00(), A01.A01());
        }
        return A01;
    }

    public static final Pair A01(Context context, String str, AnonymousClass0ZU r5, boolean z, boolean z2) {
        String str2;
        boolean z3 = false;
        if (!A03(str, A00(context))) {
            str2 = "country_check";
        } else if (!z || !AnonymousClass0Vx.A00(context)) {
            if (z2) {
                String property = System.getProperty("http.proxyHost");
                String property2 = System.getProperty("https.proxyHost");
                if (!(property == null && property2 == null)) {
                    str2 = "system_proxy_in_use";
                }
            }
            z3 = r5.invoke();
            str2 = "mc";
        } else {
            str2 = "vpn_in_use";
        }
        return new Pair(z3, str2);
    }
}
