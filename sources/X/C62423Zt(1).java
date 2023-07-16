package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.react.modules.intent.IntentModule;
import com.instagram.service.session.UserSession;

/* renamed from: X.3Zt  reason: invalid class name and case insensitive filesystem */
public final class C62423Zt {
    public static void A00(C11630kW r1, UserSession userSession, String str, String str2) {
        A01(r1, userSession, str, str2, (String) null);
        A02(userSession);
    }

    public static final void A02(C10300i6 r1) {
        C04220Ms.A0B(r1, 0);
        synchronized (C18250wR.A0C(r1)) {
        }
    }

    public static final void A03(UserSession userSession, String str, String str2) {
        AnonymousClass0wJ.A1N(str, str2);
        A01((C11630kW) null, userSession, str, str2, (String) null);
    }

    public static final void A01(C11630kW r0, UserSession userSession, String str, String str2, String str3) {
        AnonymousClass0wJ.A1N(str, str2);
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A01(r0, userSession), "ig_bloks_settings"), 817);
        if (AnonymousClass0wJ.A1U(A0I)) {
            C18230wP.A1G(A0I, str2);
            A0I.A0T("entrypoint", str);
            A0I.A0T(IntentModule.EXTRA_MAP_KEY_FOR_VALUE, str3);
            C18190wL.A1L(A0I);
            A0I.Bb4();
        }
    }
}
