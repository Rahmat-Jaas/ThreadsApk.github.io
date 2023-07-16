package com.instagram.urlhandlers.supportpersonalizedads;

import X.AnonymousClass054;
import X.AnonymousClass0wJ;
import X.AnonymousClass4A9;
import X.C10300i6;
import X.C11630kW;
import X.C130667qT;
import X.C14030oh;
import X.C18180wK;
import X.C18190wL;
import X.C18210wN;
import X.C18230wP;
import X.C31155GhB;
import X.C34608Ibe;
import X.C63263h8;
import android.content.Intent;
import android.os.Bundle;
import android.util.SparseArray;
import com.facebook.redex.IDxCListenerShape426S0100000_1_I2;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.service.session.UserSession;
import com.instagram.simplewebview.SimpleWebViewConfig;
import java.util.HashMap;

public class SupportPersonalizedAdsUrlHandlerActivity extends BaseFragmentActivity implements C11630kW {
    public C10300i6 A00;
    public final AnonymousClass054 A01 = new IDxCListenerShape426S0100000_1_I2(this, 15);

    public final void A0D(Bundle bundle) {
    }

    public final String getModuleName() {
        return "spa_deep_link_handler_activity";
    }

    public final C10300i6 getSession() {
        return this.A00;
    }

    public final void onCreate(Bundle bundle) {
        int A002 = C14030oh.A00(-1198351854);
        super.onCreate(bundle);
        Intent intent = getIntent();
        Bundle A0B = C18210wN.A0B(intent);
        if (A0B != null) {
            this.A00 = C18190wL.A0S(A0B);
        }
        if (!(this.A00 instanceof UserSession)) {
            SimpleWebViewConfig simpleWebViewConfig = new SimpleWebViewConfig("https://fb.com/deservetobefound", (String) null, getApplicationContext().getResources().getString(2131827191), (String) null, false, false, false, false, true, true, false, true, false, false, false);
            Bundle A06 = C18180wK.A06();
            A06.putParcelable("SimpleWebViewFragment.SIMPLE_WEB_VIEW_CONFIG", simpleWebViewConfig);
            C34608Ibe ibe = new C34608Ibe();
            ibe.setArguments(A06);
            C18230wP.A19(ibe, C18180wK.A0Q(this, this.A00));
        } else {
            getSupportFragmentManager().A0v(this.A01);
            String stringExtra = intent.getStringExtra("entryPoint");
            C130667qT A003 = C130667qT.A00((SparseArray) null, this, this, this.A00);
            HashMap A0y = AnonymousClass0wJ.A0y();
            A0y.put("entry_point", stringExtra);
            AnonymousClass4A9 A004 = C63263h8.A00(this.A00, "com.instagram.ads.spa.components.hub.business_spa_hub.main_screen_action", A0y);
            AnonymousClass4A9.A01(A004, A003, this, 24);
            C31155GhB.A03(A004);
        }
        C14030oh.A07(-1864294748, A002);
    }
}
