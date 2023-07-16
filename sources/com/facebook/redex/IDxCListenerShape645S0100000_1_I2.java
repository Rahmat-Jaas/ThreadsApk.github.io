package com.facebook.redex;

import X.AnonymousClass0wJ;
import X.AnonymousClass3WS;
import X.C28161tl;
import X.C39797L0o;
import android.content.SharedPreferences;
import com.instagram.service.session.UserSession;

public class IDxCListenerShape645S0100000_1_I2 implements C39797L0o {
    public Object A00;
    public final int A01;

    public IDxCListenerShape645S0100000_1_I2(UserSession userSession, int i) {
        this.A01 = i;
        this.A00 = userSession;
    }

    public final void BkO(float f) {
        String str;
        int i = this.A01;
        SharedPreferences.Editor A02 = C28161tl.A02(AnonymousClass3WS.A01((UserSession) this.A00));
        if (i != 0) {
            str = "group_profile_private_has_seen_request_nux";
        } else {
            str = "group_profile_public_has_seen_new_member_nux";
        }
        AnonymousClass0wJ.A13(A02, str, true);
    }

    public final void BuL() {
    }

    public final void C0C() {
    }

    public final void CBe(int i, int i2) {
    }
}
