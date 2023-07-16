package com.instagram.urlhandlers.adsconsentgrowth;

import X.AnonymousClass0wJ;
import X.AnonymousClass3LY;
import X.AnonymousClass46C;
import X.C04220Ms;
import X.C10300i6;
import X.C14030oh;
import X.C15430rJ;
import X.C18190wL;
import X.C38039KHq;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.base.activity.IgFragmentActivity;

public final class AdsConsentGrowthUrlHandlerActivity extends IgFragmentActivity {
    public C10300i6 A00;

    public final C10300i6 getSession() {
        return this.A00;
    }

    public final void onCreate(Bundle bundle) {
        int i;
        int A002 = C14030oh.A00(-8650559);
        super.onCreate(bundle);
        Bundle A0C = AnonymousClass0wJ.A0C(this);
        if (A0C == null) {
            finish();
            i = 966993227;
        } else {
            this.A00 = C18190wL.A0S(A0C);
            String A0i = C18190wL.A0i(A0C);
            if (A0i == null) {
                i = -1804677472;
            } else {
                Uri A01 = C15430rJ.A01(A0i);
                C10300i6 r0 = this.A00;
                if (r0 != null) {
                    C38039KHq A003 = AnonymousClass3LY.A00(r0);
                    C04220Ms.A06(A01);
                    A003.CWx(new AnonymousClass46C(A01));
                }
                finish();
                i = -1220612036;
            }
        }
        C14030oh.A07(i, A002);
    }
}
