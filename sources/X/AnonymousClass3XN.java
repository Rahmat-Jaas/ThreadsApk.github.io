package X;

import android.net.NetworkInfo;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.debug.devoptions.FXPFLinkageCacheDebugFragment;
import com.instagram.service.session.UserSession;

/* renamed from: X.3XN  reason: invalid class name */
public final class AnonymousClass3XN {
    public static String A00 = "";
    public static long A01;
    public static final C11630kW A02 = AnonymousClass44F.A00;

    public static final USLEBaseShape0S0000000 A00(UserSession userSession, String str, String str2) {
        String name;
        AnonymousClass0fT A03 = AnonymousClass0fS.A03(AnonymousClass0fS.A00());
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A01(A02, userSession), "reel_loading_error"), 2574);
        A0I.A0T("error_type", str2);
        A0I.A0T("network_connection_cellular_type", C09450fW.A00(A03.A00));
        NetworkInfo A002 = AnonymousClass0fS.A00();
        if (A002 == null) {
            name = FXPFLinkageCacheDebugFragment.nullString;
        } else {
            name = A002.getDetailedState().name();
        }
        A0I.A0T("network_connection_state", name);
        A0I.A0T("network_connection_type", AnonymousClass0fV.A00(A03.A01));
        A0I.A0T("reel_module_source", str);
        return A0I;
    }

    public static final void A01(USLEBaseShape0S0000000 uSLEBaseShape0S0000000) {
        A01 = System.currentTimeMillis();
        A00 = uSLEBaseShape0S0000000.toString();
    }
}
