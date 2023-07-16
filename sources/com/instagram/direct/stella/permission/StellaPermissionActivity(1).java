package com.instagram.direct.stella.permission;

import X.AnonymousClass006;
import X.AnonymousClass00U;
import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C05030Qo;
import X.C10300i6;
import X.C14030oh;
import X.C15710rl;
import X.C15740ro;
import X.C18190wL;
import X.C18200wM;
import X.C18220wO;
import X.C18230wP;
import X.C25828Dsm;
import X.C30617GNf;
import X.C60873Qw;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.redex.IDxCListenerShape5S2100000_1_I2;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.service.session.UserSession;

public final class StellaPermissionActivity extends IgFragmentActivity {
    public static final C15710rl A00;

    static {
        C15740ro r1 = new C15740ro();
        r1.A05("com.instagram.android.fbpermission.MANAGE_MESSAGING");
        r1.A04("MANAGE_DIRECT_MESSAGING");
        A00 = r1.A00();
    }

    public final C10300i6 getSession() {
        return C18200wM.A0W(this);
    }

    public final void onCreate(Bundle bundle) {
        int A002 = C14030oh.A00(1059355896);
        super.onCreate(bundle);
        Integer A003 = C60873Qw.A00(this, getIntent(), A00);
        C04220Ms.A06(A003);
        Intent A0B = C18230wP.A0B();
        if (A003 != AnonymousClass006.A00) {
            setResult(C30617GNf.A00(A003), A0B);
            finish();
        } else {
            String stringExtra = getIntent().getStringExtra("stella_user_id");
            if (!(stringExtra == null || stringExtra.length() == 0)) {
                UserSession A02 = C05030Qo.A02(C18200wM.A0W(this));
                String BK7 = AnonymousClass0wJ.A0Y(A02).BK7();
                String userId = A02.getUserId();
                C25828Dsm A0W = C18190wL.A0W(this);
                A0W.A02 = "IG Permission";
                A0W.A0q(false);
                A0W.A0p(AnonymousClass00U.A0V("Allow sending message and receive notification for ", BK7, " ?"));
                A0W.A0c(new IDxCListenerShape5S2100000_1_I2(this, userId, stringExtra, 0), "Yes");
                A0W.A0b(C18220wO.A0O(this, 52), "No");
                AnonymousClass0wJ.A1K(A0W);
            }
        }
        C14030oh.A07(1786361623, A002);
    }
}
