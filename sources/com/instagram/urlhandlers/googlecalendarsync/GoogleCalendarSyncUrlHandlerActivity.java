package com.instagram.urlhandlers.googlecalendarsync;

import X.AnonymousClass0LU;
import X.AnonymousClass0wJ;
import X.AnonymousClass3YR;
import X.C05030Qo;
import X.C10300i6;
import X.C14030oh;
import X.C15430rJ;
import X.C16420t2;
import X.C18190wL;
import X.C18200wM;
import X.C18210wN;
import X.C18230wP;
import X.C62853b1;
import X.C63743iE;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import com.instagram.service.session.UserSession;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

public class GoogleCalendarSyncUrlHandlerActivity extends BaseFragmentActivity {
    public C10300i6 A00;

    public final void A0D(Bundle bundle) {
    }

    public final C10300i6 getSession() {
        return this.A00;
    }

    public final void onCreate(Bundle bundle) {
        HashMap hashMap;
        String str;
        int i;
        int A002 = C14030oh.A00(1098937532);
        super.onCreate(bundle);
        this.A00 = C18200wM.A0W(this);
        Bundle A0C = AnonymousClass0wJ.A0C(this);
        if (A0C == null) {
            finish();
            i = -1079162842;
        } else {
            String A0i = C18190wL.A0i(A0C);
            if (A0i == null) {
                finish();
                i = -521089291;
            } else {
                C10300i6 r1 = this.A00;
                if (!(r1 instanceof UserSession)) {
                    AnonymousClass3YR.A00(this, A0C, r1);
                } else {
                    Uri A01 = C15430rJ.A01(A0i);
                    if (A01.toString().contains("launch")) {
                        String queryParameter = A01.getQueryParameter("auth_url");
                        if (queryParameter != null) {
                            C16420t2.A00().A09().A09(this, C18190wL.A0B(queryParameter));
                        }
                        finish();
                    } else {
                        if (A01.toString().contains("success")) {
                            hashMap = AnonymousClass0wJ.A0y();
                            JSONObject A0y = C18230wP.A0y();
                            JSONObject A0y2 = C18230wP.A0y();
                            try {
                                C18200wM.A1A(A01, IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE, A0y);
                                C18200wM.A1A(A01, IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE, A0y);
                                A0y2.put("server_params", A0y);
                                C18200wM.A1T(A0y2, hashMap);
                                str = "com.bloks.www.service.merchant.google.calendar.sync";
                            } catch (JSONException e) {
                                String message = e.getMessage();
                                if (message != null) {
                                    AnonymousClass0LU.A0B("GoogleCalendarSyncUrlHandlerActivity", message);
                                }
                                throw new RuntimeException(e);
                            }
                        } else if (A01.toString().contains(OptSvcAnalyticsStore.LOGGING_KEY_DEX2OAT_FAILURE)) {
                            hashMap = AnonymousClass0wJ.A0y();
                            JSONObject A0y3 = C18230wP.A0y();
                            JSONObject A0y4 = C18230wP.A0y();
                            try {
                                C18200wM.A1A(A01, "error", A0y3);
                                A0y4.put("server_params", A0y3);
                                C18200wM.A1T(A0y4, hashMap);
                                str = "com.bloks.www.service.merchant.google.calendar.sync.failure";
                            } catch (JSONException e2) {
                                String message2 = e2.getMessage();
                                if (message2 != null) {
                                    AnonymousClass0LU.A0B("GoogleCalendarSyncUrlHandlerActivity", message2);
                                }
                                throw new RuntimeException(e2);
                            }
                        }
                        UserSession A02 = C05030Qo.A02(this.A00);
                        C63743iE A022 = C63743iE.A02(str, hashMap);
                        IgBloksScreenConfig A0N = C18190wL.A0N(this.A00);
                        C18210wN.A0s(getApplicationContext(), A0N, 2131828005);
                        C18230wP.A19(C62853b1.A02(A0N, A022), AnonymousClass0wJ.A0Q(this, A02));
                    }
                }
                i = -1824512064;
            }
        }
        C14030oh.A07(i, A002);
    }
}
