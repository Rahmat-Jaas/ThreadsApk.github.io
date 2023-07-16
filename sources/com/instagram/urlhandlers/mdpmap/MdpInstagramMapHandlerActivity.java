package com.instagram.urlhandlers.mdpmap;

import X.AnonymousClass0wJ;
import X.C10300i6;
import X.C10450iM;
import X.C14030oh;
import X.C15430rJ;
import X.C18180wK;
import X.C18190wL;
import X.C37081JkD;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.discovery.mediamap.intf.MapEntryPoint;
import com.instagram.service.session.UserSession;

public final class MdpInstagramMapHandlerActivity extends BaseFragmentActivity {
    public UserSession A00;

    public final void A0D(Bundle bundle) {
    }

    public final C10300i6 getSession() {
        return this.A00;
    }

    public final void onCreate(Bundle bundle) {
        int i;
        int A002 = C14030oh.A00(-1589922069);
        super.onCreate(bundle);
        Bundle A0C = AnonymousClass0wJ.A0C(this);
        if (A0C == null) {
            finish();
            i = 1652655427;
        } else {
            UserSession A0V = C18180wK.A0V(A0C);
            this.A00 = A0V;
            try {
                String A0i = C18190wL.A0i(A0C);
                if (A0i != null) {
                    Uri A01 = C15430rJ.A01(A0i);
                    C37081JkD.A00(A01, this, MapEntryPoint.EXTERNAL_URL, A0V, C18180wK.A0e());
                    finish();
                    i = 1665546110;
                } else {
                    IllegalArgumentException A0a = C18190wL.A0a("No URI provided");
                    C14030oh.A07(1767933267, A002);
                    throw A0a;
                }
            } catch (IllegalArgumentException e) {
                C10450iM.A07("MdpInstagramMapHandlerActivity:InvalidQueryType", e);
                finish();
                C14030oh.A07(-1724134100, A002);
                return;
            }
        }
        C14030oh.A07(i, A002);
    }
}
