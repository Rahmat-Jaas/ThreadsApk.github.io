package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;

/* renamed from: X.7ET  reason: invalid class name */
public final class AnonymousClass7ET {
    public static String A00;
    public static final AnonymousClass7ET A01 = new AnonymousClass7ET();

    public static void A00(USLEBaseShape0S0000000 uSLEBaseShape0S0000000, C11630kW r3, String str) {
        uSLEBaseShape0S0000000.A0T("module_name", r3.getModuleName());
        uSLEBaseShape0S0000000.A1U(C103066Xr.A00.A02.A00);
        uSLEBaseShape0S0000000.A0T("container_module", r3.getModuleName());
        uSLEBaseShape0S0000000.A0T("step_name", str);
        uSLEBaseShape0S0000000.Bb4();
        A00 = str;
    }

    public final void A01(C11630kW r3, C10300i6 r4, String str) {
        A00(C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A01(r3, r4), "barcelona_onboarding_waterfall_impression"), 76), r3, str);
    }

    public final void A02(C11630kW r3, C10300i6 r4, String str) {
        A00(C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A01(r3, r4), "barcelona_onboarding_waterfall_tap"), 77), r3, str);
    }
}
