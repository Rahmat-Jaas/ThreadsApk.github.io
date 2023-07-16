package com.instagram.urlhandlers.xacinterstitial;

import X.AnonymousClass0wJ;
import X.AnonymousClass3YR;
import X.AnonymousClass4O6;
import X.C05030Qo;
import X.C10300i6;
import X.C14030oh;
import X.C15430rJ;
import X.C18180wK;
import X.C18190wL;
import X.C18200wM;
import X.C63473hX;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.service.session.UserSession;

public class XacInterstitialDeeplinkUrlHandlerActivity extends BaseFragmentActivity {
    public C10300i6 A00;

    public final void A0D(Bundle bundle) {
    }

    public final C10300i6 getSession() {
        return this.A00;
    }

    public final void onCreate(Bundle bundle) {
        int i;
        int A002 = C14030oh.A00(225117045);
        super.onCreate(bundle);
        Bundle A0C = AnonymousClass0wJ.A0C(this);
        if (A0C == null) {
            finish();
            i = -1325885367;
        } else {
            this.A00 = C18190wL.A0S(A0C);
            String A0i = C18190wL.A0i(A0C);
            if (TextUtils.isEmpty(A0i)) {
                finish();
                i = -215932218;
            } else {
                Bundle bundle2 = null;
                try {
                    Uri A01 = C15430rJ.A01(A0i);
                    if ("instagram".equalsIgnoreCase(A01.getScheme())) {
                        String queryParameter = A01.getQueryParameter("deeplink_source");
                        String queryParameter2 = A01.getQueryParameter("deeplink_campaign");
                        if (!(queryParameter == null || queryParameter2 == null)) {
                            bundle2 = C18180wK.A06();
                            bundle2.putString("deeplink_source", queryParameter);
                            bundle2.putString("deeplink_campaign", queryParameter2);
                        }
                    }
                } catch (SecurityException unused) {
                }
                A0C.putAll(bundle2);
                C10300i6 r3 = this.A00;
                if (r3 instanceof UserSession) {
                    if (!(A0C.getString("deeplink_source") == null || A0C.getString("deeplink_campaign") == null)) {
                        r3 = this.A00;
                        A0C.getString("deeplink_source");
                        A0C.getString("deeplink_campaign");
                        if (r3 instanceof UserSession) {
                            if (C63473hX.A00(C05030Qo.A02(r3)) != 1) {
                                finish();
                                AnonymousClass0wJ.A0F().postDelayed(new AnonymousClass4O6(), 300);
                            } else {
                                throw C18200wM.A0d();
                            }
                        }
                    }
                    i = -768411249;
                }
                AnonymousClass3YR.A00(this, A0C, r3);
                i = -768411249;
            }
        }
        C14030oh.A07(i, A002);
    }
}
