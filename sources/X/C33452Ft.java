package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;

/* renamed from: X.2Ft  reason: invalid class name and case insensitive filesystem */
public final class C33452Ft {
    public static final void A00(FragmentActivity fragmentActivity, UserSession userSession) {
        AnonymousClass0wJ.A1N(fragmentActivity, userSession);
        Boolean BYx = AnonymousClass0wJ.A0Y(userSession).A05.BYx();
        if (BYx != null && BYx.booleanValue()) {
            if (C09650fs.A05(fragmentActivity)) {
                C37412JrW.A01(fragmentActivity, C18190wL.A0n(C18210wN.A0A("https://familycenter.instagram.com/dashboard")));
                return;
            }
            C37350Jpy A0Y = C18230wP.A0Y(fragmentActivity, userSession, C171209wF.A1J, "https://www.instagram.com/accounts/supervision/");
            A0Y.A06(userSession.getUserId());
            A0Y.A04();
        }
    }
}
