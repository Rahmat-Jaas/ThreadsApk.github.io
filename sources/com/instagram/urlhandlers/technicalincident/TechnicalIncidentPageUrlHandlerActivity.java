package com.instagram.urlhandlers.technicalincident;

import X.AnonymousClass0wJ;
import X.C10300i6;
import X.C14030oh;
import X.C15430rJ;
import X.C16240si;
import X.C18180wK;
import X.C18190wL;
import X.C18200wM;
import X.C62853b1;
import X.C63743iE;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import java.util.HashMap;

public final class TechnicalIncidentPageUrlHandlerActivity extends BaseFragmentActivity {
    public final C16240si A00 = C18190wL.A0I();

    public final void A0D(Bundle bundle) {
    }

    public final C10300i6 getSession() {
        return C18200wM.A0W(this);
    }

    public final void onCreate(Bundle bundle) {
        int i;
        int A002 = C14030oh.A00(-849631348);
        super.onCreate(bundle);
        Bundle A0C = AnonymousClass0wJ.A0C(this);
        if (A0C == null) {
            finish();
            i = -1907382549;
        } else {
            String A0i = C18190wL.A0i(A0C);
            if (A0i == null) {
                finish();
                i = -1003927167;
            } else {
                Uri A003 = C15430rJ.A00(this.A00, A0i, true);
                if (A003 != null) {
                    String scheme = A003.getScheme();
                    String host = A003.getHost();
                    if ("instagram".equalsIgnoreCase(scheme) && "technical_incident".equalsIgnoreCase(host)) {
                        Bundle A06 = C18180wK.A06();
                        C18190wL.A12(A003, A06, "timestamp");
                        if (!A06.containsKey("timestamp")) {
                            finish();
                        } else {
                            String string = A06.getString("timestamp");
                            C10300i6 A0W = C18200wM.A0W(this);
                            if (string == null) {
                                string = "";
                            }
                            HashMap A0y = AnonymousClass0wJ.A0y();
                            A0y.put("timestamp", string);
                            C63743iE A02 = C63743iE.A02("com.instagram.equity.sev_transparency.landing_page.screen", A0y);
                            IgBloksScreenConfig A0N = C18190wL.A0N(A0W);
                            A0N.A0S = "";
                            A0N.A0h = true;
                            C18180wK.A16(C62853b1.A02(A0N, A02), this, A0W);
                        }
                        i = 1793851966;
                    }
                }
                finish();
                i = -1321389846;
            }
        }
        C14030oh.A07(i, A002);
    }
}
