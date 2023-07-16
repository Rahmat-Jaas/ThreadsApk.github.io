package com.instagram.urlhandlers.attribution;

import X.AnonymousClass0RA;
import X.AnonymousClass0RG;
import X.AnonymousClass0TJ;
import X.AnonymousClass0wJ;
import X.AnonymousClass28H;
import X.AnonymousClass3Y2;
import X.AnonymousClass3YH;
import X.AnonymousClass4QV;
import X.C05030Qo;
import X.C10300i6;
import X.C14030oh;
import X.C15740ro;
import X.C16240si;
import X.C18190wL;
import X.C18230wP;
import X.C33292Fd;
import X.C63173fJ;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import org.json.JSONObject;

public final class AttributionUrlHandlerActivity extends BaseFragmentActivity {
    public final void A0D(Bundle bundle) {
    }

    public final C10300i6 getSession() {
        AnonymousClass0RG r1 = AnonymousClass0RA.A0C;
        Bundle A0C = AnonymousClass0wJ.A0C(this);
        if (A0C != null) {
            return r1.A02(A0C);
        }
        throw AnonymousClass0wJ.A0b();
    }

    public final void onCreate(Bundle bundle) {
        int i;
        int A00 = C14030oh.A00(-1556058898);
        super.onCreate(bundle);
        C15740ro r0 = new C15740ro();
        r0.A01();
        if (!r0.A00().A01(this, getIntent(), (C16240si) null)) {
            finish();
            i = -1336508980;
        } else {
            AnonymousClass3YH A002 = C33292Fd.A00(this, C05030Qo.A02(getSession()));
            if (C63173fJ.A05(AnonymousClass0TJ.A05, 2324146373122854882L)) {
                AnonymousClass3Y2 r3 = A002.A05;
                JSONObject A0y = C18230wP.A0y();
                A0y.put("event_name", "flush");
                AnonymousClass3Y2.A01(AnonymousClass28H.INFO, C18190wL.A0n(A0y), r3);
                A002.A04.execute(new AnonymousClass4QV(A002));
            }
            finish();
            i = -119721780;
        }
        C14030oh.A07(i, A00);
    }
}
