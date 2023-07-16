package com.instagram.urlhandlers.fxcaligaccountscenter;

import X.AnonymousClass054;
import X.AnonymousClass0LU;
import X.AnonymousClass0RA;
import X.AnonymousClass0RG;
import X.AnonymousClass0wJ;
import X.AnonymousClass3YR;
import X.AnonymousClass4A9;
import X.AnonymousClass4W4;
import X.C04220Ms;
import X.C10300i6;
import X.C121687Hl;
import X.C130667qT;
import X.C14030oh;
import X.C15430rJ;
import X.C18180wK;
import X.C18190wL;
import X.C18220wO;
import X.C18240wQ;
import X.C18250wR;
import X.C59713Ma;
import X.C63263h8;
import X.C683743n;
import X.IVw;
import X.K9R;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.redex.IDxCListenerShape426S0100000_1_I2;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.service.session.UserSession;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

public class FxCalIGAccountsCenterRedirectActivity extends IgFragmentActivity {
    public C10300i6 A00;
    public UserSession A01;
    public final AnonymousClass054 A02 = new IDxCListenerShape426S0100000_1_I2(this, 9);

    public final C10300i6 getSession() {
        return this.A00;
    }

    public final void onCreate(Bundle bundle) {
        int i;
        int A002 = C14030oh.A00(-1828986657);
        super.onCreate(bundle);
        Bundle A0C = AnonymousClass0wJ.A0C(this);
        if (A0C == null) {
            finish();
            i = -2100245310;
        } else {
            AnonymousClass0RG r2 = AnonymousClass0RA.A0C;
            this.A00 = r2.A02(A0C);
            Intent intent = getIntent();
            C10300i6 r1 = this.A00;
            if (r1 == null) {
                finish();
                i = -1791513956;
            } else if (!(r1 instanceof UserSession)) {
                AnonymousClass3YR.A00(this, A0C, r1);
                i = -2112106082;
            } else {
                this.A01 = r2.A06(A0C);
                String A0i = C18190wL.A0i(A0C);
                if (A0i == null) {
                    finish();
                    i = -1315700057;
                } else {
                    getSupportFragmentManager().A0v(this.A02);
                    String queryParameter = C15430rJ.A01(A0i).getQueryParameter("entrypoint");
                    if (C121687Hl.A03(queryParameter)) {
                        queryParameter = "UNKNOWN";
                    }
                    String stringExtra = intent.getStringExtra("deeplink_destination");
                    if (!intent.hasExtra("entrypoint")) {
                        AnonymousClass0LU.A0D("FxCalIGAccountsCenterRedirectActivity", "No entrypoint provided");
                    }
                    CharSequence[] charSequenceArr = {stringExtra, queryParameter};
                    int i2 = 0;
                    while (true) {
                        if (C121687Hl.A03(charSequenceArr[i2])) {
                            break;
                        }
                        i2++;
                        if (i2 >= 2) {
                            if (stringExtra != null && queryParameter != null) {
                                String stringExtra2 = intent.getStringExtra("deeplink_params");
                                C59713Ma.A01(this.A01, true);
                                C130667qT A0T = C18220wO.A0T(this, new C683743n(this), this.A01);
                                UserSession userSession = this.A01;
                                K9R k9r = K9R.A00;
                                IVw iVw = new IVw(k9r);
                                iVw.A04("deeplink_destination", stringExtra);
                                iVw.A04("entrypoint", C18240wQ.A0g(queryParameter));
                                iVw.A03("requested_screen_component_type", 2);
                                C04220Ms.A0B(userSession, 0);
                                iVw.A03("cds_client_value", C59713Ma.A00(userSession));
                                IVw iVw2 = new IVw(k9r);
                                if (!C121687Hl.A03(stringExtra2)) {
                                    try {
                                        JSONObject A0j = C18250wR.A0j(URLDecoder.decode(stringExtra2, "UTF-8"));
                                        Iterator<String> keys = A0j.keys();
                                        while (keys.hasNext()) {
                                            String A0k = C18180wK.A0k(keys);
                                            iVw2.A04(A0k, A0j.getString(A0k));
                                        }
                                    } catch (UnsupportedEncodingException | JSONException e) {
                                        AnonymousClass0LU.A0G("FxCalIGAccountsCenterRedirectActivity", "Exception on resolving deeplink params", e);
                                    }
                                }
                                iVw.A00.put("deeplink_params", iVw2);
                                AnonymousClass4A9 A003 = C63263h8.A00(userSession, "com.bloks.www.fxcal.settings.async", new AnonymousClass4W4(C18180wK.A0M(k9r, iVw), this));
                                AnonymousClass4A9.A01(A003, A0T, this, 23);
                                schedule(A003);
                                i = -2107354509;
                            }
                        }
                    }
                    finish();
                    i = 880165277;
                }
            }
        }
        C14030oh.A07(i, A002);
    }
}
