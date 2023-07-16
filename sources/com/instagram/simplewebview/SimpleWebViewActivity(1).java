package com.instagram.simplewebview;

import X.AnonymousClass01J;
import X.AnonymousClass0RA;
import X.AnonymousClass0RG;
import X.AnonymousClass0wJ;
import X.AnonymousClass3Xr;
import X.C10300i6;
import X.C14030oh;
import X.C18190wL;
import X.C18220wO;
import X.C18250wR;
import X.C30975Gcb;
import X.C34608Ibe;
import android.content.Context;
import android.os.Bundle;
import com.instagram.barcelona.R;
import com.instagram.base.activity.BaseFragmentActivity;

public final class SimpleWebViewActivity extends BaseFragmentActivity {
    public static final AnonymousClass3Xr A01 = new AnonymousClass3Xr();
    public C10300i6 A00;

    public static final void A00(Context context, C10300i6 r2, SimpleWebViewConfig simpleWebViewConfig) {
        A01.A02(context, r2, simpleWebViewConfig);
    }

    public final C10300i6 getSession() {
        C10300i6 r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        C18250wR.A0l();
        throw null;
    }

    public final void A0D(Bundle bundle) {
        if (getSupportFragmentManager().A0L(R.id.layout_container_main) == null) {
            C34608Ibe ibe = new C34608Ibe();
            ibe.setArguments(C18190wL.A0C(this));
            AnonymousClass01J A0L = C18220wO.A0L(this);
            A0L.A0D(ibe, R.id.layout_container_main);
            A0L.A00();
        }
    }

    public final void finish() {
        super.finish();
        overridePendingTransition(R.anim.fragment_slide_right_enter, R.anim.fragment_slide_right_exit);
    }

    public final void onCreate(Bundle bundle) {
        int A002 = C14030oh.A00(1551431989);
        C30975Gcb.A01(this);
        AnonymousClass0RG r1 = AnonymousClass0RA.A0C;
        Bundle A0C = C18190wL.A0C(this);
        if (A0C != null) {
            this.A00 = r1.A02(A0C);
            super.onCreate(bundle);
            overridePendingTransition(R.anim.fragment_slide_left_enter, R.anim.fragment_slide_left_exit);
            C14030oh.A07(-1388582056, A002);
            return;
        }
        IllegalStateException A0b = AnonymousClass0wJ.A0b();
        C14030oh.A07(-953617384, A002);
        throw A0b;
    }
}
