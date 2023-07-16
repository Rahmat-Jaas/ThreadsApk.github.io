package X;

import com.facebook.redex.IDxFCallbackShape138S0000000_2_I2;
import com.instagram.service.session.UserSession;

/* renamed from: X.6SU  reason: invalid class name */
public final class AnonymousClass6SU {
    public static final void A00(UserSession userSession, String str) {
        IDxFCallbackShape138S0000000_2_I2 iDxFCallbackShape138S0000000_2_I2 = new IDxFCallbackShape138S0000000_2_I2(2);
        if (C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 36317457477930667L)) {
            AnonymousClass3WK.A01(userSession).AMA(new C133247vO().Cr3(str).AB4().setMaxToleratedCacheAgeMs(0), iDxFCallbackShape138S0000000_2_I2);
            return;
        }
        C85754vi AB4 = new C133237vN().Cr3(str).AB4();
        C04220Ms.A06(AB4);
        C67453za.A00(userSession).AMA(AB4, iDxFCallbackShape138S0000000_2_I2);
    }
}
