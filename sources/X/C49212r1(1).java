package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S0100000_I2_1;
import com.instagram.service.session.UserSession;

/* renamed from: X.2r1  reason: invalid class name and case insensitive filesystem */
public final class C49212r1 {
    public static final void A00(C318329d r8, AnonymousClass293 r9, AnonymousClass2AC r10, AnonymousClass14I r11, UserSession userSession) {
        boolean z;
        boolean A1Z = AnonymousClass0wJ.A1Z(userSession, r10);
        C18180wK.A1P(r8, 2, r9);
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A02(userSession), "crosspost_controls"), 495);
        Integer num = null;
        if (C67343zO.A02((KtCSuperShape1S0100000_I2_1) null, userSession)) {
            num = AnonymousClass006.A01;
        } else if (C34732Kr.A00(userSession, false)) {
            num = AnonymousClass006.A00;
        }
        AnonymousClass14J r3 = new AnonymousClass14J();
        C67343zO.A00(r3, userSession);
        if (num != null) {
            r3.A0A("cross_app_share_type", C102206Uh.A00(num));
        }
        AnonymousClass3ZL A03 = AnonymousClass3Zu.A03(userSession);
        int ordinal = r9.ordinal();
        if (ordinal == 2) {
            if (num != null) {
                int intValue = num.intValue();
                if (intValue == A1Z) {
                    z = C18190wL.A1X(A03.A04, "PREFERENCE_REELS_IS_AUTO_CROSS_POST_TO_FACEBOOK_ENABLED");
                } else if (intValue == 0) {
                    z = A03.A08();
                }
            }
            z = false;
        } else if (ordinal != 0) {
            z = C62183Xq.A00(userSession);
        } else {
            z = C61453Tm.A00(userSession);
        }
        r3.A07("is_auto_xpost_enabled", Boolean.valueOf(z));
        if (AnonymousClass0wJ.A1U(A0I)) {
            A0I.A0O(r10, "entry_point");
            A0I.A0O(r8, "event_type");
            A0I.A0O(r9, "product_type");
            A0I.A0P(r3, "user_info");
            A0I.A0P(r11, "creation_info");
            A0I.Bb4();
        }
    }
}
