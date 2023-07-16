package X;

import com.instagram.bloks.util.IDxACallbackShape103S0100000_1_I2;
import com.instagram.service.session.UserSession;

/* renamed from: X.3bK  reason: invalid class name and case insensitive filesystem */
public final class C63013bK {
    public static final C63013bK A00 = new C63013bK();

    public static final void A01(C34640IcN icN, UserSession userSession, String str, String str2) {
        C04220Ms.A0B(userSession, 1);
        A02(icN, userSession, str, str2, true);
    }

    public static final void A02(C34640IcN icN, UserSession userSession, String str, String str2, boolean z) {
        C04220Ms.A0B(userSession, 1);
        icN.scheduleAndGetLoaderId(A00(C18230wP.A0S(icN, userSession), userSession, str, str2, z));
    }

    public static final AnonymousClass4A9 A00(C130667qT r5, UserSession userSession, String str, String str2, boolean z) {
        Long A02;
        K9R k9r = K9R.A00;
        IVw iVw = new IVw(k9r);
        if (z) {
            iVw.A03("platform", 1);
            String A14 = C18250wR.A0R(userSession).A14();
            if (A14 == null || (A02 = AnonymousClass4n2.A02(A14)) == null) {
                throw AnonymousClass0wJ.A0b();
            }
            iVw.A04("identity_id", A02.toString());
        }
        IVw iVw2 = new IVw(k9r);
        iVw2.A04("entrypoint", str);
        iVw2.A04("node_identifier", str2);
        iVw2.A00.put("deeplink_params", iVw);
        AnonymousClass4A9 A002 = C63263h8.A00(userSession, "com.bloks.www.fx.settings.individual_setting.async", new MV4(C18180wK.A0M(k9r, iVw2)));
        A002.A00 = new IDxACallbackShape103S0100000_1_I2(r5, 10);
        return A002;
    }
}
