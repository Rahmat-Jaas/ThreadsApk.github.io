package com.instagram.urlhandlers.igfxsettingstyi;

import X.AnonymousClass006;
import X.AnonymousClass0RA;
import X.AnonymousClass0RG;
import X.AnonymousClass0TJ;
import X.AnonymousClass0wJ;
import X.AnonymousClass3HX;
import X.AnonymousClass3YR;
import X.AnonymousClass601;
import X.C10300i6;
import X.C10650ih;
import X.C109326jp;
import X.C127397h3;
import X.C14030oh;
import X.C18180wK;
import X.C18190wL;
import X.C18220wO;
import X.C37067Jjv;
import X.C62333Yi;
import X.C63743iE;
import X.C63803iN;
import X.C66883yU;
import X.C81804oQ;
import android.content.Intent;
import android.os.Bundle;
import com.bloks.foa.cds.bottomsheet.config.CdsOpenScreenCallerDismissCallback;
import com.facebook.redex.IDxCRunnableShape615S0100000_1_I2;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.service.session.UserSession;
import java.util.Collections;
import java.util.HashMap;
import org.json.JSONObject;

public class IGFXSettingsTYIDeeplinkActivity extends IgFragmentActivity {
    public C10300i6 A00;

    public final C10300i6 getSession() {
        return this.A00;
    }

    public final void onCreate(Bundle bundle) {
        int i;
        int A002 = C14030oh.A00(93828658);
        super.onCreate(bundle);
        Bundle A0C = AnonymousClass0wJ.A0C(this);
        if (A0C == null) {
            finish();
            i = -202218397;
        } else {
            AnonymousClass0RG r2 = AnonymousClass0RA.A0C;
            C10300i6 A02 = r2.A02(A0C);
            this.A00 = A02;
            if (!(A02 instanceof UserSession)) {
                AnonymousClass3YR.A00(this, A0C, A02);
                i = 1520708368;
            } else {
                Intent intent = getIntent();
                HashMap A0y = AnonymousClass0wJ.A0y();
                if (intent.hasExtra("source")) {
                    A0y.put("source", intent.getStringExtra("source"));
                }
                if (intent.hasExtra("import_service")) {
                    A0y.put("import_service", intent.getStringExtra("import_service"));
                }
                C10300i6 r7 = this.A00;
                AnonymousClass0TJ r8 = AnonymousClass0TJ.A05;
                if (C63803iN.A05(r8, r7, 36325166942331870L).booleanValue()) {
                    A0y.put("surface", "STANDALONE_IG");
                    HashMap A0y2 = AnonymousClass0wJ.A0y();
                    A0y2.put("should_dismiss", C18180wK.A0Y());
                    A0y2.put("deeplink_params", A0y);
                    HashMap A022 = C37067Jjv.A02(A0y2);
                    Integer num = C66883yU.A0F;
                    Integer num2 = AnonymousClass006.A00;
                    C66883yU r72 = new C66883yU((C81804oQ) null, new CdsOpenScreenCallerDismissCallback(new IDxCRunnableShape615S0100000_1_I2((Object) this, 5)), (AnonymousClass3HX) null, (AnonymousClass601) null, (C127397h3) null, (C109326jp) null, AnonymousClass006.A0C, num2, num, num2, (Integer) null, (Integer) null, false, false, false);
                    IgBloksScreenConfig A0N = C18190wL.A0N(r2.A06(A0C));
                    A0N.A0P = "com.bloks.www.fx.settings.tyi.home_page";
                    A0N.A01 = r72;
                    new C63743iE(A022, Collections.emptyMap(), "com.bloks.www.fx.settings.tyi.home_page").A0E(this, A0N);
                    i = 1058637553;
                } else if (!C63803iN.A05(r8, this.A00, 36325166942266333L).booleanValue()) {
                    i = 1241134783;
                } else {
                    A0y.put("surface", "ACCOUNT_CENTER_IG");
                    C10650ih.A02(this, C62333Yi.A01().A04(this, C18220wO.A0F(C18220wO.A0E("https://www.instagram.com/acredirect").appendQueryParameter("deeplink_destination", "transfer_your_information").appendQueryParameter("entrypoint", "ig_tyi_deeplink"), "deeplink_params", new JSONObject(A0y).toString())));
                    finish();
                    i = 1356535315;
                }
            }
        }
        C14030oh.A07(i, A002);
    }
}
