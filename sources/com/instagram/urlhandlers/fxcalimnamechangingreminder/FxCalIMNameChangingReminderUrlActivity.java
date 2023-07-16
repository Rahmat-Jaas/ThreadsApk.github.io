package com.instagram.urlhandlers.fxcalimnamechangingreminder;

import X.AnonymousClass0hA;
import X.AnonymousClass0wJ;
import X.AnonymousClass3YR;
import X.C05030Qo;
import X.C10300i6;
import X.C14030oh;
import X.C15430rJ;
import X.C18190wL;
import X.C18200wM;
import X.C18230wP;
import X.C62853b1;
import X.C63743iE;
import X.C63863iT;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.modal.ModalActivity;
import com.instagram.service.session.UserSession;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

public class FxCalIMNameChangingReminderUrlActivity extends BaseFragmentActivity {
    public C10300i6 A00;

    public final void A0D(Bundle bundle) {
    }

    public final C10300i6 getSession() {
        return this.A00;
    }

    public final void onCreate(Bundle bundle) {
        int i;
        String A0i;
        int A002 = C14030oh.A00(-138697269);
        super.onCreate(bundle);
        Bundle A0C = AnonymousClass0wJ.A0C(this);
        if (A0C != null) {
            this.A00 = C18190wL.A0S(A0C);
        }
        C10300i6 r1 = this.A00;
        if (!(r1 instanceof UserSession)) {
            AnonymousClass3YR.A00(this, A0C, r1);
        } else {
            UserSession A02 = C05030Qo.A02(r1);
            if (A0C == null || (A0i = C18190wL.A0i(A0C)) == null) {
                finish();
                i = 1717342604;
                C14030oh.A07(i, A002);
            }
            String queryParameter = C15430rJ.A01(A0i).getQueryParameter("central_profile_screen_id");
            if (AnonymousClass0hA.A08(queryParameter)) {
                finish();
                i = 1332879213;
                C14030oh.A07(i, A002);
            }
            HashMap A0y = AnonymousClass0wJ.A0y();
            JSONObject A0y2 = C18230wP.A0y();
            JSONObject A0y3 = C18230wP.A0y();
            try {
                A0y2.put("account_id", A02.getUserId());
                A0y2.put("central_profile_screen_id", queryParameter);
                A0y2.put("is_account_id_igid", "true");
                A0y3.put("server_params", A0y2);
                C18200wM.A1T(A0y3, A0y);
                C63743iE A022 = C63743iE.A02("com.bloks.www.fxim.settings.aview", A0y);
                IgBloksScreenConfig A0N = C18190wL.A0N(A02);
                A0N.A0e = true;
                C63863iT.A0B(getApplicationContext(), C62853b1.A00(A0N, A022), ModalActivity.class, "bloks");
                finish();
            } catch (JSONException e) {
                RuntimeException runtimeException = new RuntimeException(e);
                C14030oh.A07(-345861012, A002);
                throw runtimeException;
            }
        }
        i = 186076966;
        C14030oh.A07(i, A002);
    }
}
