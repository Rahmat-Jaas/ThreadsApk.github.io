package X;

import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.service.session.UserSession;

/* renamed from: X.3LB  reason: invalid class name */
public final class AnonymousClass3LB {
    public static final void A01(BaseFragmentActivity baseFragmentActivity, UserSession userSession, String str) {
        C04220Ms.A0B(userSession, 2);
        Bundle A06 = C18180wK.A06();
        A06.putString("entryPoint", str);
        A06.putString("igUserID", userSession.getUserId());
        A06.putString("waterfallID", C37741K2b.A01(userSession).A03);
        C71494Ja A01 = C63343hJ.A01(userSession);
        A01.Cod(A06);
        A01.CpK("BillingNexusIGRoute");
        A01.CxN(baseFragmentActivity).A05();
    }

    public static final void A00(BaseFragmentActivity baseFragmentActivity, C35394Iu2 iu2, UserSession userSession, String str) {
        AnonymousClass0wJ.A1O(str, iu2);
        C04220Ms.A0B(userSession, 3);
        C37740K2a.A02(baseFragmentActivity, new C680842d(baseFragmentActivity, iu2, userSession, str), userSession, "", str);
    }
}
