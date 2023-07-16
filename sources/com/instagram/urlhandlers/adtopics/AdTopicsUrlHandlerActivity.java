package com.instagram.urlhandlers.adtopics;

import X.AnonymousClass0RA;
import X.AnonymousClass0RG;
import X.AnonymousClass0TJ;
import X.AnonymousClass0wJ;
import X.AnonymousClass3YR;
import X.AnonymousClass44J;
import X.AnonymousClass4A9;
import X.C04220Ms;
import X.C10300i6;
import X.C130667qT;
import X.C14030oh;
import X.C18180wK;
import X.C63263h8;
import X.C63753iH;
import X.C63803iN;
import android.os.Bundle;
import android.util.SparseArray;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.bloks.util.IDxACallbackShape103S0100000_1_I2;
import com.instagram.service.session.UserSession;
import java.util.Collections;
import java.util.Map;

public final class AdTopicsUrlHandlerActivity extends BaseFragmentActivity {
    public UserSession A00;

    public final void A0D(Bundle bundle) {
    }

    public final C10300i6 getSession() {
        AnonymousClass0RG r1 = AnonymousClass0RA.A0C;
        Bundle A0C = AnonymousClass0wJ.A0C(this);
        if (A0C != null) {
            return r1.A02(A0C);
        }
        throw AnonymousClass0wJ.A0b();
    }

    public final void onCreate(Bundle bundle) {
        int i;
        String str;
        int A002 = C14030oh.A00(1235956759);
        super.onCreate(bundle);
        Bundle A0C = AnonymousClass0wJ.A0C(this);
        if (A0C == null) {
            finish();
            i = -209499447;
        } else {
            if (getSession() instanceof UserSession) {
                UserSession A0V = C18180wK.A0V(A0C);
                this.A00 = A0V;
                C130667qT A003 = C130667qT.A00((SparseArray) null, this, AnonymousClass44J.A00, A0V);
                Map singletonMap = Collections.singletonMap("referer", "settings_ad_options");
                UserSession userSession = this.A00;
                if (userSession != null) {
                    if (C63803iN.A05(AnonymousClass0TJ.A05, userSession, 36312226205860731L).booleanValue()) {
                        singletonMap = C63753iH.A01();
                        str = "com.bloks.www.fx.settings.individual_setting.async";
                    } else {
                        str = "com.instagram.sensitive_topics.sensitive_topics.ad_topic_preferences_view";
                    }
                    UserSession userSession2 = this.A00;
                    if (userSession2 != null) {
                        AnonymousClass4A9 A004 = C63263h8.A00(userSession2, str, singletonMap);
                        A004.A00 = new IDxACallbackShape103S0100000_1_I2(A003, 15);
                        schedule(A004);
                    }
                }
                C04220Ms.A0E("userSession");
                throw null;
            }
            AnonymousClass3YR.A00.A02(this, A0C, getSession());
            finish();
            i = 1902399597;
        }
        C14030oh.A07(i, A002);
    }
}
