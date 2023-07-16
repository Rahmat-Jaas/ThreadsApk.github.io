package com.instagram.urlhandlers.accountquality;

import X.AnonymousClass006;
import X.AnonymousClass0RA;
import X.AnonymousClass0RG;
import X.AnonymousClass0wJ;
import X.AnonymousClass3HX;
import X.AnonymousClass3YR;
import X.AnonymousClass4To;
import X.AnonymousClass601;
import X.C10300i6;
import X.C109326jp;
import X.C127397h3;
import X.C14030oh;
import X.C15430rJ;
import X.C18190wL;
import X.C37067Jjv;
import X.C61983Wp;
import X.C63743iE;
import X.C66883yU;
import X.C81804oQ;
import android.net.Uri;
import android.os.Bundle;
import com.bloks.foa.cds.bottomsheet.config.CdsOpenScreenCallerDismissCallback;
import com.facebook.redex.IDxCRunnableShape615S0100000_1_I2;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.service.session.UserSession;
import java.util.HashMap;

public final class AccountQualityIgActorLauncherActivity extends IgFragmentActivity {
    public UserSession A00;

    public final C10300i6 getSession() {
        return this.A00;
    }

    public final void onCreate(Bundle bundle) {
        int i;
        int A002 = C14030oh.A00(1868505907);
        super.onCreate(bundle);
        Bundle A0C = AnonymousClass0wJ.A0C(this);
        if (A0C == null) {
            finish();
            i = 1623971508;
        } else {
            AnonymousClass0RG r2 = AnonymousClass0RA.A0C;
            C10300i6 A02 = r2.A02(A0C);
            if (!(A02 instanceof UserSession)) {
                AnonymousClass3YR.A00(this, A0C, A02);
                i = -771244655;
            } else {
                this.A00 = r2.A06(A0C);
                String A0i = C18190wL.A0i(A0C);
                if (A0i == null) {
                    finish();
                    i = 1175508842;
                } else {
                    Uri A01 = C15430rJ.A01(A0i);
                    HashMap A0y = AnonymousClass0wJ.A0y();
                    A0y.put("actor_id", A01.getQueryParameter("actor_id"));
                    A0y.put("source", A01.getQueryParameter("source"));
                    UserSession userSession = this.A00;
                    if (userSession != null) {
                        A0y.put(C61983Wp.A00(), userSession.token);
                    }
                    HashMap A022 = C37067Jjv.A02(A0y);
                    Integer num = C66883yU.A0F;
                    Integer num2 = AnonymousClass006.A00;
                    C66883yU r6 = new C66883yU((C81804oQ) null, new CdsOpenScreenCallerDismissCallback(new IDxCRunnableShape615S0100000_1_I2((Object) this, 4)), (AnonymousClass3HX) null, (AnonymousClass601) null, (C127397h3) null, (C109326jp) null, AnonymousClass006.A0C, num2, num, num2, (Integer) null, (Integer) null, false, false, false);
                    UserSession userSession2 = this.A00;
                    if (userSession2 != null) {
                        IgBloksScreenConfig A0N = C18190wL.A0N(userSession2);
                        A0N.A0P = "com.bloks.www.accountquality.xmds.actor";
                        A0N.A01 = r6;
                        C63743iE.A04("com.bloks.www.accountquality.xmds.actor", A022, AnonymousClass4To.A00()).A0E(this, A0N);
                    }
                    i = 899710593;
                }
            }
        }
        C14030oh.A07(i, A002);
    }
}
