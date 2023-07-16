package com.instagram.fbpay.w3c.views;

import X.AnonymousClass01J;
import X.AnonymousClass3TB;
import X.AnonymousClass564;
import X.C10300i6;
import X.C14030oh;
import X.C18190wL;
import X.C18220wO;
import X.C18230wP;
import android.os.Bundle;
import com.instagram.barcelona.R;
import com.instagram.base.activity.IgFragmentActivity;

public final class DemaskCardActivity extends IgFragmentActivity {
    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return C18230wP.A0Z();
    }

    public final void onCreate(Bundle bundle) {
        int A00 = C14030oh.A00(560516204);
        super.onCreate(bundle);
        setContentView((int) R.layout.w3c_fbpay_activity);
        AnonymousClass3TB.A06.A00(C18230wP.A0Z());
        AnonymousClass01J A0L = C18220wO.A0L(this);
        Bundle A0C = C18190wL.A0C(this);
        AnonymousClass564 r0 = new AnonymousClass564();
        r0.setArguments(A0C);
        A0L.A0C(r0, R.id.fragment_container);
        A0L.A00();
        C14030oh.A07(121663162, A00);
    }
}
