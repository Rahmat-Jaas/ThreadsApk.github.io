package com.instagram.platform;

import X.AnonymousClass0LU;
import X.AnonymousClass3YR;
import X.C05030Qo;
import X.C10300i6;
import X.C14030oh;
import X.C18180wK;
import X.C18200wM;
import X.C18220wO;
import X.C18240wQ;
import X.C63863iT;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.modal.ModalActivity;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import com.instagram.service.session.UserSession;
import com.instagram.simplewebview.SimpleWebViewConfig;
import java.util.ArrayList;
import java.util.Iterator;

public class AppAuthorizeActivity extends BaseFragmentActivity {
    public C10300i6 A00;

    public final void A0D(Bundle bundle) {
    }

    public final C10300i6 getSession() {
        return this.A00;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        setResult(i2, intent);
        finish();
    }

    public final void onCreate(Bundle bundle) {
        int i;
        int A002 = C14030oh.A00(1516108635);
        super.onCreate(bundle);
        C10300i6 A0W = C18200wM.A0W(this);
        this.A00 = A0W;
        if (!(A0W instanceof UserSession)) {
            AnonymousClass3YR.A00.A02(this, (Bundle) null, A0W);
            i = -1438916636;
        } else {
            UserSession A02 = C05030Qo.A02(A0W);
            Intent intent = getIntent();
            Uri.Builder A0E = C18220wO.A0E("https://www.instagram.com/oauth/authorize");
            ArrayList A0k = C18240wQ.A0k(12);
            A0k.add("app_id");
            A0k.add("auth_type");
            A0k.add("client_id");
            A0k.add("display");
            A0k.add("e2e");
            A0k.add("legacy_override");
            A0k.add("redirect_uri");
            A0k.add("response_type");
            A0k.add("facebook_sdk_version");
            A0k.add("scope");
            A0k.add(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE);
            A0k.add("fx_app");
            A0k.add("skip_dedupe");
            A0k.add("messenger_page_id");
            A0k.add("reset_messenger_state");
            A0E.appendQueryParameter("redirect_uri", "fbconnect://success");
            Iterator it = A0k.iterator();
            while (it.hasNext()) {
                String A0k2 = C18180wK.A0k(it);
                String stringExtra = intent.getStringExtra(A0k2);
                if (stringExtra != null) {
                    A0E.appendQueryParameter(A0k2, stringExtra);
                }
            }
            String decode = Uri.decode(A0E.toString());
            if (decode == null) {
                AnonymousClass0LU.A0N("AppAuthorizeActivity", "URI could not be decoded: ", A0E.toString());
                finish();
                i = -736677600;
            } else {
                Bundle A06 = C18180wK.A06();
                A06.putParcelable("SimpleWebViewFragment.SIMPLE_WEB_VIEW_CONFIG", new SimpleWebViewConfig(decode, (String) null, (String) null, (String) null, false, false, true, false, false, false, false, false, true, false, false));
                C63863iT.A02(this, A06, A02, ModalActivity.class, "platform_authorize_webview").A0H(this, 1);
                i = 1327818493;
            }
        }
        C14030oh.A07(i, A002);
    }
}
