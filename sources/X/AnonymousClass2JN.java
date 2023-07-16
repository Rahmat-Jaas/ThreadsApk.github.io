package X;

import androidx.fragment.app.FragmentActivity;
import com.facebook.redex.IDxFListenerShape0S1600000_1_I2;
import com.instagram.common.api.base.IDxACallbackShape15S0300000_1_I2;
import com.instagram.search.common.analytics.SearchContext;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import org.json.JSONObject;

/* renamed from: X.2JN  reason: invalid class name */
public final class AnonymousClass2JN {
    public static final Object A00(AnonymousClass601 r19, C63893iY r20) {
        AnonymousClass601 r14 = r19;
        C63893iY r4 = r20;
        boolean A1Z = AnonymousClass0wJ.A1Z(r4, r14);
        String A0n = C18190wL.A0n(C63893iY.A0A(r4, 0));
        C109326jp A06 = C63893iY.A06(r4, A1Z ? 1 : 0);
        C109326jp A062 = C63893iY.A06(r4, 2);
        String A0q = C18190wL.A0q(r4.A00, 3);
        UserSession A02 = C05030Qo.A02(C63913ic.A0F(r14));
        FragmentActivity A05 = C63913ic.A05(r14);
        C29521yk r8 = new C29521yk();
        User A0P = C18210wN.A0P(A02, A0n);
        if (A0P != null) {
            IDxACallbackShape15S0300000_1_I2 iDxACallbackShape15S0300000_1_I2 = new IDxACallbackShape15S0300000_1_I2(19, (Object) A062, (Object) A06, (Object) r14);
            AnonymousClass0wJ.A1N(A05, A02);
            C25791Ds4.A04(A05, (C15680ri) null, iDxACallbackShape15S0300000_1_I2, (BKU) null, (C20066BMj) null, (SearchContext) null, A02, r8, A0P, (Integer) null, A0q, A0q, (String) null, (JSONObject) null);
            return null;
        }
        AnonymousClass3Y8.A02.A00(A02, new IDxFListenerShape0S1600000_1_I2(A05, r14, A06, A062, A02, r8, A0q, 1), A0n);
        return null;
    }
}
