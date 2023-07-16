package com.instagram.urlhandlers.directgroupinvite;

import X.AnonymousClass0wJ;
import X.AnonymousClass3LY;
import X.AnonymousClass4n2;
import X.AnonymousClass7Ko;
import X.C04220Ms;
import X.C05030Qo;
import X.C10300i6;
import X.C14030oh;
import X.C18180wK;
import X.C18190wL;
import X.C18210wN;
import X.C18220wO;
import X.C50402sw;
import X.C687745k;
import X.C82394pY;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.service.session.UserSession;
import java.util.List;

public final class DirectGroupInviteHandlerActivity extends BaseFragmentActivity {
    public UserSession A00;
    public final C82394pY A01 = C18220wO.A0P(this, 80);

    public final void A0D(Bundle bundle) {
    }

    public final boolean A0H() {
        return false;
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return this.A00;
    }

    public final void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    public final void onCreate(Bundle bundle) {
        int i;
        String string;
        String A0p;
        String queryParameter;
        String queryParameter2;
        String queryParameter3;
        String queryParameter4;
        int A002 = C14030oh.A00(-322875276);
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
        Bundle A0C = AnonymousClass0wJ.A0C(this);
        if (A0C == null || (string = A0C.getString("original_url")) == null || string.length() == 0) {
            finish();
            i = 1474522772;
        } else {
            UserSession A02 = C05030Qo.A02(C18190wL.A0S(A0C));
            this.A00 = A02;
            Uri A0A = C18210wN.A0A(A0C.getString("original_url"));
            String host = A0A.getHost();
            List<String> pathSegments = A0A.getPathSegments();
            if (!C50402sw.A00(A0A)) {
                A0p = null;
            } else {
                A0p = C18190wL.A0p(pathSegments, 1);
            }
            if (!C50402sw.A00(A0A)) {
                queryParameter = null;
            } else {
                queryParameter = A0A.getQueryParameter("s");
            }
            if (!C50402sw.A00(A0A)) {
                queryParameter2 = null;
            } else {
                queryParameter2 = A0A.getQueryParameter("st");
            }
            if (!C50402sw.A00(A0A)) {
                queryParameter3 = null;
            } else {
                queryParameter3 = A0A.getQueryParameter("cid");
            }
            if (!C50402sw.A00(A0A)) {
                queryParameter4 = null;
            } else {
                queryParameter4 = A0A.getQueryParameter("fbclid");
            }
            if (A0p != null) {
                Bundle A06 = C18180wK.A06();
                A06.putString("group_invite_key", A0p);
                A06.putString("destination_id", host);
                A06.putString("encoded_query", A0A.getEncodedQuery());
                if (queryParameter != null) {
                    A06.putString("group_invite_source_key", queryParameter);
                }
                if (queryParameter2 != null) {
                    A06.putString("group_invite_subtype_key", queryParameter2);
                }
                if (queryParameter3 != null) {
                    A06.putString("group_invite_creator_id_key", queryParameter3);
                }
                if (queryParameter4 != null) {
                    A06.putString("group_invite_source_key", "channel_link_sticker");
                }
                A0C.putAll(A06);
                C04220Ms.A0B(A02, 1);
                String string2 = A0C.getString("group_invite_key");
                A0C.getString("group_invite_source_key");
                String string3 = A0C.getString("group_invite_subtype_key");
                if (string3 != null) {
                    AnonymousClass4n2.A01(string3);
                }
                A0C.getString("group_invite_creator_id_key");
                if (string2 != null) {
                    AnonymousClass7Ko.A0E(false, "Must call setInstanceSupplier first");
                    throw null;
                }
                AnonymousClass3LY.A00(A02).A01(this.A01, C687745k.class);
                i = -693494808;
            } else {
                finish();
                i = -1092698936;
            }
        }
        C14030oh.A07(i, A002);
    }

    public final void onDestroy() {
        int A002 = C14030oh.A00(957787030);
        super.onDestroy();
        UserSession userSession = this.A00;
        if (userSession != null) {
            AnonymousClass3LY.A00(userSession).A02(this.A01, C687745k.class);
        }
        this.A00 = null;
        C14030oh.A07(1344151975, A002);
    }
}
