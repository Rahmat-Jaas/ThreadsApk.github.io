package com.instagram.urlhandlers.carecsat;

import X.AnonymousClass0RA;
import X.AnonymousClass0RG;
import X.AnonymousClass0wJ;
import X.AnonymousClass3YR;
import X.AnonymousClass4A9;
import X.C04220Ms;
import X.C10300i6;
import X.C11630kW;
import X.C130667qT;
import X.C14030oh;
import X.C15430rJ;
import X.C18180wK;
import X.C18190wL;
import X.C18200wM;
import X.C18210wN;
import X.C18230wP;
import X.C31155GhB;
import X.C63203gz;
import X.C63263h8;
import android.net.Uri;
import android.os.Bundle;
import android.util.SparseArray;
import com.facebook.redex.IDxCListenerShape426S0100000_1_I2;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.bloks.util.IDxACallbackShape103S0100000_1_I2;
import com.instagram.service.session.UserSession;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONObject;

public final class CareCsatUrlHandlerActivity extends BaseFragmentActivity implements C11630kW {
    public final void A0D(Bundle bundle) {
    }

    public final String getModuleName() {
        return "care_csat_url_handler_activity";
    }

    public final C10300i6 getSession() {
        return C18200wM.A0W(this);
    }

    public final void onBackPressed() {
        finish();
    }

    public final void onCreate(Bundle bundle) {
        int i;
        int A00 = C14030oh.A00(-1392076615);
        super.onCreate(bundle);
        Bundle A0C = AnonymousClass0wJ.A0C(this);
        if (A0C != null) {
            AnonymousClass0RG r3 = AnonymousClass0RA.A0C;
            if (r3.A03(this) != null) {
                C10300i6 A03 = r3.A03(this);
                if (!(A03 instanceof UserSession)) {
                    AnonymousClass3YR.A00(this, A0C, A03);
                    finish();
                    i = -1356109979;
                } else {
                    String A0i = C18190wL.A0i(A0C);
                    if (A0i == null) {
                        finish();
                        i = -92797707;
                    } else {
                        Uri A01 = C15430rJ.A01(A0i);
                        if (A01.getQueryParameter("survey_id") == null) {
                            finish();
                            i = -193361080;
                        } else {
                            C18210wN.A0o(this, getWindow());
                            JSONObject A0y = C18230wP.A0y();
                            JSONObject put = C18230wP.A0y().put("server_params", A0y);
                            Set<String> queryParameterNames = A01.getQueryParameterNames();
                            C04220Ms.A06(queryParameterNames);
                            Iterator<T> it = queryParameterNames.iterator();
                            while (it.hasNext()) {
                                String A0k = C18180wK.A0k(it);
                                A0y.put(A0k, A01.getQueryParameter(A0k));
                            }
                            HashMap A032 = C63203gz.A03("params", put.toString());
                            getSupportFragmentManager().A0v(new IDxCListenerShape426S0100000_1_I2(this, 2));
                            C130667qT A002 = C130667qT.A00((SparseArray) null, this, this, r3.A03(this));
                            AnonymousClass4A9 A003 = C63263h8.A00(A03, "com.bloks.www.novi.care.start_survey_action", A032);
                            A003.A00 = new IDxACallbackShape103S0100000_1_I2(A002, 16);
                            C31155GhB.A03(A003);
                            i = 66159902;
                        }
                    }
                }
                C14030oh.A07(i, A00);
            }
        }
        finish();
        i = 1170363246;
        C14030oh.A07(i, A00);
    }

    public final void onStart() {
        int A00 = C14030oh.A00(-302601122);
        overridePendingTransition(0, 0);
        super.onStart();
        C14030oh.A07(1660134142, A00);
    }
}
