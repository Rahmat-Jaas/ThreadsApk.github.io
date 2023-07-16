package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4100000_I2;
import com.instagram.service.session.UserSession;

/* renamed from: X.3I4  reason: invalid class name */
public final class AnonymousClass3I4 {
    public final UserSession A00;
    public final C04530Oa A01 = C18210wN.A0k(this, 49);
    public final Integer A02;

    public AnonymousClass3I4(UserSession userSession, Integer num) {
        C04220Ms.A0B(userSession, 1);
        this.A00 = userSession;
        this.A02 = num;
    }

    public final void A00(KtCSuperShape0S4100000_I2 ktCSuperShape0S4100000_I2, C81354ne r6) {
        String str;
        Integer num = this.A02;
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M((C13330nS) C18190wL.A0f(((C62633aR) this.A01.getValue()).A00), "one_link_api_access_event"), 2460);
        C18210wN.A1B(A0I, ktCSuperShape0S4100000_I2.A02);
        C18210wN.A19(A0I, ktCSuperShape0S4100000_I2.A03);
        C18190wL.A1I(A0I, ktCSuperShape0S4100000_I2.A04);
        A0I.A0T("caller_context", ((CallerContext) ktCSuperShape0S4100000_I2.A00).A02);
        A0I.A0T("caller_name", ktCSuperShape0S4100000_I2.A01);
        A0I.A0T("event", "access_denied");
        A0I.A0T("auth_policy", C62633aR.A00(r6));
        if (num != null) {
            str = C62633aR.A01(num);
        } else {
            str = null;
        }
        A0I.A0T("info_type", str);
        A0I.Bb4();
    }

    public final void A01(KtCSuperShape0S4100000_I2 ktCSuperShape0S4100000_I2, C81354ne r4) {
        C62633aR.A02(ktCSuperShape0S4100000_I2, (C62633aR) this.A01.getValue(), r4, this.A02);
    }

    public final void A02(C81354ne r3, String str) {
        Integer num = this.A02;
        if (num != null) {
            ((C62633aR) this.A01.getValue()).A03(r3, num, str);
        }
    }
}
