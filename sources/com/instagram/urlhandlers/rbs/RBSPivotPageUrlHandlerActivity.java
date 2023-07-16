package com.instagram.urlhandlers.rbs;

import X.AnonymousClass0wJ;
import X.AnonymousClass3LM;
import X.AnonymousClass3YR;
import X.AnonymousClass9BW;
import X.AnonymousClass9OB;
import X.BKU;
import X.C10300i6;
import X.C14030oh;
import X.C18180wK;
import X.C18190wL;
import X.C18200wM;
import X.C18210wN;
import X.C18534AhA;
import X.C19462Awj;
import X.C25786Drz;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;

public final class RBSPivotPageUrlHandlerActivity extends BaseFragmentActivity {
    public final void A0D(Bundle bundle) {
    }

    public final C10300i6 getSession() {
        return C18200wM.A0W(this);
    }

    public final void onCreate(Bundle bundle) {
        C25786Drz A0Q;
        Bundle A02;
        AnonymousClass9BW r4;
        boolean z;
        String str;
        int i;
        int A00 = C14030oh.A00(947427559);
        super.onCreate(bundle);
        Bundle A0C = AnonymousClass0wJ.A0C(this);
        if (A0C == null) {
            finish();
            i = 945465142;
        } else {
            String A0i = C18190wL.A0i(A0C);
            if (A0i == null) {
                finish();
                i = 392780641;
            } else {
                C10300i6 A0W = C18200wM.A0W(this);
                if (!(A0W instanceof UserSession)) {
                    AnonymousClass3YR.A00(this, A0C, A0W);
                } else {
                    ImageUrl imageUrl = null;
                    Uri A0A = C18210wN.A0A(A0i);
                    UserSession userSession = (UserSession) A0W;
                    String queryParameter = A0A.getQueryParameter("media_id");
                    String queryParameter2 = A0A.getQueryParameter("media_surface");
                    boolean booleanQueryParameter = A0A.getBooleanQueryParameter("disable_cta", false);
                    if (queryParameter != null) {
                        BKU A05 = C19462Awj.A01(userSession).A05(queryParameter);
                        String str2 = null;
                        if (A05 == null || (r4 = A05.A0f.A1L) == null) {
                            finish();
                        } else {
                            User user = r4.A00;
                            if (user != null) {
                                z = user.BZi();
                            } else {
                                z = false;
                            }
                            A0Q = C18180wK.A0Q(this, userSession);
                            AnonymousClass3LM.A01();
                            C18534AhA A002 = AnonymousClass3LM.A00();
                            String str3 = r4.A0B;
                            if (user != null) {
                                str = user.BK7();
                            } else {
                                str = null;
                            }
                            String str4 = r4.A09;
                            String str5 = r4.A0A;
                            if (user != null) {
                                imageUrl = user.B4M();
                                str2 = user.getId();
                            }
                            A02 = A002.A02(imageUrl, str3, str, str4, str5, str2, queryParameter, queryParameter2, z, booleanQueryParameter);
                        }
                    } else {
                        A0Q = C18180wK.A0Q(this, userSession);
                        AnonymousClass3LM.A01();
                        A02 = AnonymousClass3LM.A00().A02((ImageUrl) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, queryParameter2, false, booleanQueryParameter);
                    }
                    AnonymousClass9OB r0 = new AnonymousClass9OB();
                    r0.setArguments(A02);
                    A0Q.A03 = r0;
                    A0Q.A0C = false;
                    A0Q.A05();
                }
                i = 1526682811;
            }
        }
        C14030oh.A07(i, A00);
    }
}
