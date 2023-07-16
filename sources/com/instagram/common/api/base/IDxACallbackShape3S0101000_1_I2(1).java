package com.instagram.common.api.base;

import X.AnonymousClass0wJ;
import X.AnonymousClass2B6;
import X.AnonymousClass3WS;
import X.AnonymousClass3XX;
import X.C14030oh;
import X.C18230wP;
import X.C28161tl;
import X.C31032GeB;
import X.C31155GhB;
import X.C32165H8c;
import X.C63873iU;
import X.H1T;
import android.content.SharedPreferences;
import android.util.Pair;
import com.instagram.service.session.UserSession;

public class IDxACallbackShape3S0101000_1_I2 extends C63873iU {
    public int A00;
    public Object A01;
    public final int A02 = 0;

    public IDxACallbackShape3S0101000_1_I2(UserSession userSession) {
        this.A01 = userSession;
        this.A00 = 0;
    }

    public final void onFail(AnonymousClass3XX r12) {
        if (this.A02 != 0) {
            super.onFail(r12);
            return;
        }
        int A03 = C14030oh.A03(2114625365);
        int i = this.A00;
        if (i < 7) {
            int pow = ((int) (Math.pow(2.0d, (double) i) * 2.0d)) * 1000;
            this.A00 = i + 1;
            UserSession userSession = (UserSession) this.A01;
            Pair A002 = C31032GeB.A00(userSession);
            H1T A0N = AnonymousClass0wJ.A0N(userSession);
            A0N.A0J("creatives/write_supported_capabilities/");
            A0N.A0P((String) A002.first, (String) A002.second);
            C32165H8c A0S = AnonymousClass0wJ.A0S(A0N);
            A0S.A00 = this;
            C31155GhB.A04(A0S, 524, 4, pow, false, false);
        }
        C14030oh.A0A(-1963240678, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03;
        int i;
        if (this.A02 != 0) {
            A03 = C14030oh.A03(-278847370);
            int A032 = C14030oh.A03(484811496);
            C28161tl A012 = AnonymousClass3WS.A01((UserSession) this.A01);
            boolean A1V = C18230wP.A1V(this.A00);
            SharedPreferences.Editor A022 = C28161tl.A02(A012);
            int i2 = 2;
            if (A1V) {
                i2 = 1;
            }
            AnonymousClass0wJ.A11(A022, "notification_settings", i2);
            C14030oh.A0A(-467030049, A032);
            i = 1161662301;
        } else {
            A03 = C14030oh.A03(1885471761);
            int A033 = C14030oh.A03(192257111);
            this.A00 = 0;
            SharedPreferences sharedPreferences = AnonymousClass2B6.A00;
            if (sharedPreferences != null) {
                AnonymousClass0wJ.A12(sharedPreferences.edit(), "LastTimeSupportedCapabilitiesUpdated", System.currentTimeMillis());
            }
            C14030oh.A0A(1791516171, A033);
            i = -974011286;
        }
        C14030oh.A0A(i, A03);
    }

    public IDxACallbackShape3S0101000_1_I2(UserSession userSession, int i) {
        this.A01 = userSession;
        this.A00 = i;
    }
}
