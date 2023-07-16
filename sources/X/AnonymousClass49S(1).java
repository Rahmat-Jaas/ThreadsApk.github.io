package X;

import android.content.Context;
import com.instagram.common.api.base.IDxACallbackShape111S0100000_1_I2;
import com.instagram.service.session.UserSession;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* renamed from: X.49S  reason: invalid class name */
public final class AnonymousClass49S implements AnonymousClass0i4 {
    public UserSession A00;
    public Map A01 = AnonymousClass0wJ.A0y();

    public static String A00(Context context, AnonymousClass49S r6, String str) {
        if (str != null) {
            return str;
        }
        HashSet hashSet = new HashSet(Arrays.asList(new C307822y[]{C307822y.A01}));
        UserSession userSession = r6.A00;
        List A05 = C63693i8.A05(context, userSession, "fx_ig4a_app_startup_native_auth_token_verification", userSession.getUserId(), hashSet);
        if (A05.size() == 0) {
            return null;
        }
        A05.get(0);
        return ((AnonymousClass3H2) A05.get(0)).A01.A00;
    }

    public static void A01(AnonymousClass49S r6, String str) {
        C32165H8c A05;
        if (str != null) {
            IDxACallbackShape111S0100000_1_I2 A06 = C63873iU.A06(r6, 53);
            C67463zb A002 = C67463zb.A00();
            A002.A05("access_token", str);
            A002.A05("account_type", "FACEBOOK");
            AnonymousClass7Ko.A0B(true);
            AnonymousClass7Ko.A0B(true);
            C67473zc A003 = C67473zc.A00(A002, AnonymousClass165.class, "IGFxNativeAuthTokenVerificationQuery");
            UserSession userSession = r6.A00;
            C04220Ms.A0B(userSession, 0);
            C31082GfJ gfJ = new C31082GfJ((C10300i6) userSession);
            gfJ.A06(A003);
            if (C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 36313269883176336L)) {
                A05 = gfJ.A04();
            } else {
                A05 = gfJ.A05(AnonymousClass006.A01);
            }
            A05.A00 = A06;
            C31155GhB.A03(A05);
        }
    }

    public final void onSessionWillEnd() {
        this.A00.A03(AnonymousClass49S.class);
    }

    public AnonymousClass49S(UserSession userSession) {
        this.A00 = userSession;
    }
}
