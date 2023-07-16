package X;

import com.facebook.common.callercontext.CallerContext;
import com.instagram.service.session.UserSession;
import fxcache.model.FxCalAccount;
import java.util.Collection;
import java.util.List;

/* renamed from: X.1z6  reason: invalid class name and case insensitive filesystem */
public final class C29681z6 extends C58123Dz implements AnonymousClass0i4 {
    public final C29691z7 A00;
    public final UserSession A01;

    public C29681z6(UserSession userSession) {
        C04220Ms.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = C35702Om.A00(userSession);
    }

    public final FxCalAccount A01(CallerContext callerContext, String str) {
        return (FxCalAccount) AnonymousClass00J.A0D(this.A00.A03(callerContext, str, "FACEBOOK"));
    }

    public final void A04(CallerContext callerContext, C83954sG r4, String str) {
        C29691z7 r1 = this.A00;
        C04220Ms.A0B(str, 0);
        r1.A0E(callerContext, r4, (Boolean) null, str);
    }

    public final void onSessionWillEnd() {
        this.A01.A03(C29681z6.class);
    }

    public final String A02(CallerContext callerContext, String str) {
        FxCalAccount A012 = A01(callerContext, str);
        if (A012 != null) {
            return A012.A01;
        }
        return null;
    }

    public final String A03(CallerContext callerContext, String str) {
        FxCalAccount A012 = A01(callerContext, str);
        if (A012 != null) {
            return A012.A05;
        }
        return null;
    }

    public final boolean A05(CallerContext callerContext, String str) {
        AnonymousClass0wJ.A1N(str, callerContext);
        C29691z7 r5 = this.A00;
        AnonymousClass49V r4 = r5.A03;
        String str2 = callerContext.A02;
        C04220Ms.A06(str2);
        r4.A02(str, str2);
        if (!r5.A0C(str)) {
            r4.A01(str, str2);
        } else {
            r5.A04();
            r5.A05();
            r5.A06();
            List<FxCalAccount> list = r5.A00.A01;
            if ((list instanceof Collection) && list.isEmpty()) {
                return false;
            }
            for (FxCalAccount fxCalAccount : list) {
                if (fxCalAccount.A02.equalsIgnoreCase("FACEBOOK")) {
                    return true;
                }
            }
        }
        return false;
    }

    public C29681z6() {
    }
}
