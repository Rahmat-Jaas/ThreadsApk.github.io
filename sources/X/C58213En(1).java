package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape2S1000000_I2;
import com.instagram.service.session.UserSession;

/* renamed from: X.3En  reason: invalid class name and case insensitive filesystem */
public final class C58213En {
    public final C11630kW A00;
    public final UserSession A01;

    public final void A00(KtCSuperShape2S1000000_I2 ktCSuperShape2S1000000_I2) {
        String str;
        String str2;
        Long l;
        if (ktCSuperShape2S1000000_I2 != null) {
            int i = ktCSuperShape2S1000000_I2.A01;
            if (i == 0) {
                str = ktCSuperShape2S1000000_I2.A00;
                str2 = "edit_profile";
            } else {
                str = ktCSuperShape2S1000000_I2.A00;
                if (i == 1) {
                    str2 = "tap_settings";
                } else {
                    str2 = "share_profile_url";
                }
            }
            C10680ik r1 = new C10680ik(this.A01);
            r1.A00 = this.A00;
            USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(r1.A00(), "ig_profile_action"), 1401);
            if (AnonymousClass0wJ.A1U(A0I)) {
                C18210wN.A1A(A0I, str2);
                if (str != null) {
                    l = AnonymousClass0wJ.A0d(str);
                } else {
                    l = null;
                }
                A0I.A0S("profile_user_id", l);
                A0I.Bb4();
            }
        }
    }

    public C58213En(C11630kW r1, UserSession userSession) {
        this.A01 = userSession;
        this.A00 = r1;
    }
}
