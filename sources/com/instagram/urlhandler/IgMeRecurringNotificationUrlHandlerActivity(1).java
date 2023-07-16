package com.instagram.urlhandler;

import X.AnonymousClass054;
import X.AnonymousClass0RA;
import X.AnonymousClass0RG;
import X.AnonymousClass0wJ;
import X.AnonymousClass3YR;
import X.AnonymousClass4A9;
import X.C10300i6;
import X.C11630kW;
import X.C130667qT;
import X.C14030oh;
import X.C15430rJ;
import X.C18190wL;
import X.C18210wN;
import X.C18240wQ;
import X.C31155GhB;
import X.C63263h8;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.SparseArray;
import com.facebook.redex.IDxCListenerShape426S0100000_1_I2;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.bloks.util.IDxACallbackShape103S0100000_1_I2;
import com.instagram.service.session.UserSession;
import java.util.HashMap;

public final class IgMeRecurringNotificationUrlHandlerActivity extends BaseFragmentActivity implements C11630kW {
    public final AnonymousClass054 A00 = new IDxCListenerShape426S0100000_1_I2(this, 1);

    public final void A0D(Bundle bundle) {
    }

    public final String getModuleName() {
        return "IgRecurringNotificationBottomSheet";
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

    public final void onCreate(Bundle bundle) {
        int i;
        int A002 = C14030oh.A00(630925661);
        super.onCreate(bundle);
        Bundle A0C = AnonymousClass0wJ.A0C(this);
        C10300i6 session = getSession();
        if (A0C == null || session == null) {
            finish();
            i = -447179337;
        } else if (!(session instanceof UserSession)) {
            AnonymousClass3YR.A00(this, A0C, session);
            finish();
            i = 117744773;
        } else {
            String A0i = C18190wL.A0i(A0C);
            if (A0i == null) {
                finish();
                i = 635778247;
            } else {
                Uri A01 = C15430rJ.A01(A0i);
                String queryParameter = A01.getQueryParameter("page_info");
                if (C18240wQ.A03(A01) != 2) {
                    if (queryParameter == null) {
                        finish();
                        i = 1996768918;
                    }
                } else if (queryParameter == null && (queryParameter = A01.getPathSegments().get(1)) == null) {
                    finish();
                    i = -1658604102;
                }
                HashMap A0y = AnonymousClass0wJ.A0y();
                A0y.put("page_info", queryParameter);
                C18210wN.A0w(A01, "topic", A0y);
                C18210wN.A0w(A01, "app_id", A0y);
                C18210wN.A0w(A01, "cadence", A0y);
                C18210wN.A0w(A01, "ref", A0y);
                C18210wN.A0w(A01, "mm_user_ref", A0y);
                C18210wN.A0o(this, getWindow());
                getSupportFragmentManager().A0v(this.A00);
                C130667qT A003 = C130667qT.A00((SparseArray) null, this, this, getSession());
                AnonymousClass4A9 A004 = C63263h8.A00(session, "com.bloks.www.igdotme.rn.validate", A0y);
                A004.A00 = new IDxACallbackShape103S0100000_1_I2(A003, 14);
                C31155GhB.A03(A004);
                i = -1148353920;
            }
        }
        C14030oh.A07(i, A002);
    }

    public final void onStart() {
        int A002 = C14030oh.A00(-1569356124);
        overridePendingTransition(0, 0);
        super.onStart();
        C14030oh.A07(-989366249, A002);
    }
}
