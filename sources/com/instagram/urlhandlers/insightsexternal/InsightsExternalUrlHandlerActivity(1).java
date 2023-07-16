package com.instagram.urlhandlers.insightsexternal;

import X.AnonymousClass0wJ;
import X.AnonymousClass3YR;
import X.C04220Ms;
import X.C05030Qo;
import X.C10300i6;
import X.C11630kW;
import X.C14030oh;
import X.C18190wL;
import X.C18210wN;
import X.C19477Ax0;
import X.C19482Ax5;
import X.C31155GhB;
import X.C32165H8c;
import X.C63753iH;
import android.content.Intent;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.api.base.IDxACallbackShape37S0200000_3_I2;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import java.net.URLEncoder;

public class InsightsExternalUrlHandlerActivity extends BaseFragmentActivity implements C11630kW {
    public C10300i6 A00;

    public final void A0D(Bundle bundle) {
    }

    public final String getModuleName() {
        return "insights_external_url_handler";
    }

    public final C10300i6 getSession() {
        return this.A00;
    }

    public final void onCreate(Bundle bundle) {
        int i;
        int A002 = C14030oh.A00(1155522125);
        super.onCreate(bundle);
        Intent intent = getIntent();
        Bundle A0B = C18210wN.A0B(intent);
        this.A00 = C18190wL.A0S(A0B);
        A0B.putString("media_id", intent.getStringExtra("media_id"));
        C10300i6 r1 = this.A00;
        if (!(r1 instanceof UserSession)) {
            AnonymousClass3YR.A00(this, A0B, r1);
        } else {
            UserSession A02 = C05030Qo.A02(r1);
            String string = A0B.getString("media_id");
            if (string != null) {
                String encode = URLEncoder.encode(string);
                C18190wL.A13(A0B, A02.token);
                C32165H8c A03 = C19482Ax5.A03(A02, encode);
                A03.A00 = new IDxACallbackShape37S0200000_3_I2(37, A02, this);
                C31155GhB.A03(A03);
                i = -869657981;
            } else {
                String stringExtra = intent.getStringExtra("pk");
                if (stringExtra == null || stringExtra.equals(A02.getUserId())) {
                    User A0Y = AnonymousClass0wJ.A0Y(A02);
                    C04220Ms.A0B(A02, 0);
                    C19477Ax0.A00(this, this, A02, A0Y);
                } else {
                    A0B.putString("destination_id", "mainfeed");
                    C63753iH.A02(this, A0B);
                    i = -917220224;
                }
            }
            C14030oh.A07(i, A002);
        }
        i = 1618001620;
        C14030oh.A07(i, A002);
    }
}
