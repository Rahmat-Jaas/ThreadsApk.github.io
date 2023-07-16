package com.instagram.urlhandlers.igfxsettingstyi;

import X.AnonymousClass006;
import X.AnonymousClass0RA;
import X.AnonymousClass0RG;
import X.AnonymousClass0wJ;
import X.AnonymousClass3HX;
import X.AnonymousClass3YR;
import X.AnonymousClass601;
import X.C10300i6;
import X.C109326jp;
import X.C127397h3;
import X.C14030oh;
import X.C15430rJ;
import X.C18190wL;
import X.C37067Jjv;
import X.C63743iE;
import X.C66883yU;
import X.C81804oQ;
import android.net.Uri;
import android.os.Bundle;
import com.bloks.foa.cds.bottomsheet.config.CdsOpenScreenCallerDismissCallback;
import com.facebook.redex.IDxCRunnableShape615S0100000_1_I2;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import com.instagram.service.session.UserSession;
import java.util.Collections;
import java.util.HashMap;

public class IGFXSettingsTYIRedirectActivity extends IgFragmentActivity {
    public C10300i6 A00;
    public UserSession A01;

    public final C10300i6 getSession() {
        return this.A00;
    }

    public final void onCreate(Bundle bundle) {
        int i;
        int A002 = C14030oh.A00(-586894843);
        super.onCreate(bundle);
        Bundle A0C = AnonymousClass0wJ.A0C(this);
        if (A0C == null) {
            finish();
            i = -274787082;
        } else {
            AnonymousClass0RG r2 = AnonymousClass0RA.A0C;
            C10300i6 A02 = r2.A02(A0C);
            this.A00 = A02;
            if (!(A02 instanceof UserSession)) {
                AnonymousClass3YR.A00(this, A0C, A02);
                i = 1446574786;
            } else {
                String A0i = C18190wL.A0i(A0C);
                if (A0i == null) {
                    finish();
                    i = 361269283;
                } else {
                    Uri A012 = C15430rJ.A01(A0i);
                    HashMap A0y = AnonymousClass0wJ.A0y();
                    A0y.put(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE, A012.getQueryParameter(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE));
                    A0y.put(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE, A012.getQueryParameter(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE));
                    HashMap A022 = C37067Jjv.A02(A0y);
                    Integer num = C66883yU.A0F;
                    Integer num2 = AnonymousClass006.A00;
                    C66883yU r7 = new C66883yU((C81804oQ) null, new CdsOpenScreenCallerDismissCallback(new IDxCRunnableShape615S0100000_1_I2((Object) this, 6)), (AnonymousClass3HX) null, (AnonymousClass601) null, (C127397h3) null, (C109326jp) null, AnonymousClass006.A0C, AnonymousClass006.A0Y, num, num2, (Integer) null, (Integer) null, false, false, false);
                    UserSession A06 = r2.A06(A0C);
                    this.A01 = A06;
                    IgBloksScreenConfig A0N = C18190wL.A0N(A06);
                    A0N.A0P = "com.bloks.www.fx.settings.tyi.oauth_loading_page";
                    A0N.A01 = r7;
                    C63743iE.A04("com.bloks.www.fx.settings.tyi.oauth_loading_page", A022, Collections.emptyMap()).A0E(this, A0N);
                    i = 1792672388;
                }
            }
        }
        C14030oh.A07(i, A002);
    }
}
