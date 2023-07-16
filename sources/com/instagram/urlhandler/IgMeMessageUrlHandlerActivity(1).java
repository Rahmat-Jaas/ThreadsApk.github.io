package com.instagram.urlhandler;

import X.AnonymousClass06E;
import X.AnonymousClass0RA;
import X.AnonymousClass0RG;
import X.AnonymousClass0TJ;
import X.AnonymousClass0wJ;
import X.AnonymousClass31U;
import X.AnonymousClass3YR;
import X.C10300i6;
import X.C10650ih;
import X.C11630kW;
import X.C13330nS;
import X.C14030oh;
import X.C15430rJ;
import X.C18180wK;
import X.C18190wL;
import X.C18200wM;
import X.C18210wN;
import X.C18240wQ;
import X.C25056Dep;
import X.C31155GhB;
import X.C316028g;
import X.C32165H8c;
import X.C57413Ay;
import X.C57423Az;
import X.C62333Yi;
import X.C63803iN;
import X.C63873iU;
import X.CP8;
import X.H1T;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import com.instagram.service.session.UserSession;

public final class IgMeMessageUrlHandlerActivity extends BaseFragmentActivity implements C11630kW {
    public String A00 = "";

    public final void A0D(Bundle bundle) {
    }

    public final String getModuleName() {
        return "direct_ig_me_message_url_entry_point";
    }

    public final C10300i6 getSession() {
        Bundle A0B;
        AnonymousClass0RG r1 = AnonymousClass0RA.A0C;
        Intent intent = getIntent();
        if (intent != null && (A0B = C18210wN.A0B(intent)) != null) {
            return r1.A02(A0B);
        }
        throw AnonymousClass0wJ.A0b();
    }

    public static final void A00(C316028g r2, IgMeMessageUrlHandlerActivity igMeMessageUrlHandlerActivity, String str) {
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A01(igMeMessageUrlHandlerActivity, igMeMessageUrlHandlerActivity.getSession()), "direct_ig_me_message_link_click"), 529);
        if (AnonymousClass0wJ.A1U(A0I)) {
            A0I.A0T("url", str);
            A0I.A0O(r2, IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE);
            A0I.Bb4();
        }
    }

    public final void onCreate(Bundle bundle) {
        int i;
        Bundle A0B;
        int A002 = C14030oh.A00(-1698632355);
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent == null || (A0B = C18210wN.A0B(intent)) == null) {
            finish();
            i = 957383466;
        } else {
            if (!C63803iN.A0E(AnonymousClass0TJ.A05, getSession(), 36316538352962727L)) {
                C10650ih.A02(this, C62333Yi.A00(this));
            }
            String A0i = C18190wL.A0i(A0B);
            this.A00 = A0i;
            if (!(A0i == null || A0i.length() == 0)) {
                Uri A01 = C15430rJ.A01(A0i);
                if (C18240wQ.A03(A01) == 2) {
                    C10300i6 session = getSession();
                    if (!(session instanceof UserSession)) {
                        AnonymousClass3YR.A00(this, A0B, session);
                    } else {
                        String A0p = C18190wL.A0p(A01.getPathSegments(), 1);
                        UserSession userSession = (UserSession) session;
                        C57423Az r4 = new C57423Az(userSession, new C57413Ay(userSession, this, A01.getQueryParameter("ref")), AnonymousClass31U.A00);
                        AnonymousClass06E A003 = AnonymousClass06E.A00(this);
                        H1T A0O = C18180wK.A0O(r4.A00);
                        A0O.A0B(CP8.class, C25056Dep.class);
                        A0O.A0O("from_module", r4.A02);
                        A0O.A0J("users/{user_name}/usernameinfo/");
                        C32165H8c A0T = C18200wM.A0T(A0O, "user_name", A0p);
                        C63873iU.A0E(A0T, r4, 173);
                        C31155GhB.A01(this, A003, A0T);
                    }
                    i = 1168578357;
                }
            }
            finish();
            i = 1168578357;
        }
        C14030oh.A07(i, A002);
    }
}
