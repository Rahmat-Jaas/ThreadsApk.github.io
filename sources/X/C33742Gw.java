package X;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.facebook.FacebookActivity;
import com.facebook.login.LoginClient$Request;
import com.facebook.redex.IDxCallbackShape195S0200000_1_I2;
import com.facebook.redex.IDxLListenerShape120S0300000_1_I2;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.service.session.UserSession;
import java.util.HashSet;

/* renamed from: X.2Gw  reason: invalid class name and case insensitive filesystem */
public final class C33742Gw {
    public static final Object A00(AnonymousClass601 r12, C63893iY r13) {
        BaseFragmentActivity baseFragmentActivity;
        Bundle bundle;
        boolean A1Z = AnonymousClass0wJ.A1Z(r13, r12);
        C109326jp A06 = C63893iY.A06(r13, 0);
        FragmentActivity A05 = C63913ic.A05(r12);
        if ((A05 instanceof BaseFragmentActivity) && (baseFragmentActivity = (BaseFragmentActivity) A05) != null) {
            C10300i6 A0F = C63913ic.A0F(r12);
            C18200wM.A1R(A0F);
            UserSession userSession = (UserSession) A0F;
            IDxCallbackShape195S0200000_1_I2 iDxCallbackShape195S0200000_1_I2 = new IDxCallbackShape195S0200000_1_I2(0, r12, A06);
            C04220Ms.A0B(userSession, A1Z ? 1 : 0);
            baseFragmentActivity.A0E(new IDxLListenerShape120S0300000_1_I2(A1Z, baseFragmentActivity, new C37978KEv(iDxCallbackShape195S0200000_1_I2), userSession));
            if (!userSession.hasEnded()) {
                Intent intent = baseFragmentActivity.getIntent();
                if (intent == null || (bundle = intent.getExtras()) == null) {
                    bundle = C18180wK.A06();
                }
                String string = bundle.getString("IgSessionManager.SESSION_TOKEN_KEY");
                if (string == null || string.length() == 0) {
                    bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", userSession.token);
                }
                Intent intent2 = baseFragmentActivity.getIntent();
                if (intent2 != null) {
                    intent2.putExtras(bundle);
                }
                HashSet hashSet = new HashSet(C29771zH.A04.A00);
                LoginClient$Request loginClient$Request = new LoginClient$Request(C60943Re.A02, C18180wK.A0e(), userSession.getUserId(), hashSet, false);
                loginClient$Request.A02 = false;
                loginClient$Request.A01 = "pro2pro_promote_legacy_auth";
                loginClient$Request.A00 = AnonymousClass22w.PROMOTE_PRO2PRO;
                Intent A0B = C18230wP.A0B();
                A0B.setClass(C60943Re.A00, FacebookActivity.class);
                Bundle A062 = C18180wK.A06();
                A062.putParcelable("Request", loginClient$Request);
                A0B.putExtras(A062);
                try {
                    if (C10650ih.A08(baseFragmentActivity, A0B, 64206)) {
                        return null;
                    }
                } catch (ActivityNotFoundException unused) {
                }
                throw new AnonymousClass4VW("Log in attempt failed: LoginActivity could not be started");
            }
        }
        return null;
    }
}
