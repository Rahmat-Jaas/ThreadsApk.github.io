package com.instagram.urlhandlers.genericsurvey;

import X.AnonymousClass0wJ;
import X.AnonymousClass3YR;
import X.C05030Qo;
import X.C10300i6;
import X.C11630kW;
import X.C14030oh;
import X.C15430rJ;
import X.C18180wK;
import X.C18190wL;
import X.C18200wM;
import X.C18210wN;
import X.C18230wP;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.service.session.UserSession;
import com.instagram.util.fragment.IgFragmentFactoryImpl;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

public class GenericSurveyUrlHandlerActivity extends IgFragmentActivity implements C11630kW {
    public C10300i6 A00;

    public final String getModuleName() {
        return "generic_survey_handler_action";
    }

    public final C10300i6 getSession() {
        return this.A00;
    }

    public final void onCreate(Bundle bundle) {
        int i;
        String str;
        int A002 = C14030oh.A00(-1793311573);
        super.onCreate(bundle);
        C10300i6 A0W = C18200wM.A0W(this);
        this.A00 = A0W;
        if (A0W == null) {
            finish();
            i = 640759073;
        } else {
            Intent intent = getIntent();
            Bundle A0B = C18210wN.A0B(intent);
            if (A0B == null) {
                finish();
                i = 1151253336;
            } else {
                C10300i6 r1 = this.A00;
                if (r1 instanceof UserSession) {
                    String stringExtra = intent.getStringExtra("detailed_survey_type");
                    if (stringExtra == null) {
                        finish();
                        i = -2028361865;
                    } else {
                        String A0i = C18190wL.A0i(A0B);
                        if (A0i != null) {
                            Uri A01 = C15430rJ.A01(A0i);
                            if (!TextUtils.isEmpty(A0i)) {
                                JSONObject A0y = C18230wP.A0y();
                                try {
                                    Iterator<String> it = A01.getQueryParameterNames().iterator();
                                    while (it.hasNext()) {
                                        String A0k = C18180wK.A0k(it);
                                        A0y.put(A0k, A01.getQueryParameter(A0k));
                                    }
                                    str = A0y.toString();
                                    AnonymousClass0wJ.A19(IgFragmentFactoryImpl.A00().A03(stringExtra, str), (FragmentActivity) null, C05030Qo.A02(this.A00));
                                    finish();
                                } catch (JSONException e) {
                                    throw new RuntimeException(e);
                                }
                            }
                        }
                        finish();
                        str = null;
                        AnonymousClass0wJ.A19(IgFragmentFactoryImpl.A00().A03(stringExtra, str), (FragmentActivity) null, C05030Qo.A02(this.A00));
                        finish();
                    }
                } else {
                    AnonymousClass3YR.A00(this, A0B, r1);
                }
                i = -1636532472;
            }
        }
        C14030oh.A07(i, A002);
    }
}
