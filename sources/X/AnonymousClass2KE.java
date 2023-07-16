package X;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.FacebookActivity;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.login.LoginClient$Request;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.service.session.UserSession;
import java.util.HashMap;

/* renamed from: X.2KE  reason: invalid class name */
public final class AnonymousClass2KE {
    public static final void A00(CallerContext callerContext, BaseFragmentActivity baseFragmentActivity, C83384rI r9, UserSession userSession, String str, String str2) {
        AnonymousClass264 r5;
        AnonymousClass22w r7;
        String str3;
        C18180wK.A1Q(callerContext, 2, str2);
        baseFragmentActivity.A0E(new AnonymousClass47G(callerContext, baseFragmentActivity, r9, userSession, str));
        String A0i = AnonymousClass00U.A0i("smb__", str2, "__", "promoted_posts", "__", "fb_login");
        AnonymousClass264[] values = AnonymousClass264.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                r5 = null;
                break;
            }
            r5 = values[i];
            String str4 = r5.A01;
            if (str4 == null) {
                if (A0i == null) {
                    break;
                }
            } else if (str4.equalsIgnoreCase(A0i)) {
                break;
            }
            i++;
        }
        C29771zH r4 = C29771zH.A04;
        if (!C05030Qo.A02(userSession).hasEnded()) {
            Bundle A0C = C18190wL.A0C(baseFragmentActivity);
            if (A0C == null) {
                A0C = C18180wK.A06();
            }
            if (C18240wQ.A1T(A0C, "IgSessionManager.SESSION_TOKEN_KEY")) {
                A0C.putString("IgSessionManager.SESSION_TOKEN_KEY", userSession.getToken());
            }
            baseFragmentActivity.getIntent().putExtras(A0C);
            if (r5 != null) {
                r7 = C49242r4.A00(r5);
            } else {
                r7 = AnonymousClass22w.UNKNOWN;
            }
            boolean A03 = C67253zE.A03(userSession, r7);
            if (r5 != null) {
                str3 = r5.A00();
            } else {
                str3 = null;
            }
            C35772Ot.A00(userSession, "facebook_auth_start", str3, (HashMap) null, A03);
            AnonymousClass3XS A01 = AnonymousClass3XS.A01();
            LoginClient$Request A00 = AnonymousClass3XS.A00(C05030Qo.A02(userSession).getUserId(), r4.A00);
            A00.A01 = str3;
            A00.A02 = A03;
            A00.A00 = r7;
            C67583zn r3 = new C67583zn(baseFragmentActivity);
            A01.A00 = A00;
            Intent A0B = C18230wP.A0B();
            A0B.setClass(C60943Re.A00, FacebookActivity.class);
            Bundle A06 = C18180wK.A06();
            A06.putParcelable("Request", A00);
            A0B.putExtras(A06);
            try {
                if (r3.Cv3(A0B, 64206)) {
                    return;
                }
            } catch (ActivityNotFoundException unused) {
            }
            AnonymousClass4VW r0 = new AnonymousClass4VW("Log in attempt failed: LoginActivity could not be started");
            A01.A00 = null;
            throw r0;
        }
    }
}
