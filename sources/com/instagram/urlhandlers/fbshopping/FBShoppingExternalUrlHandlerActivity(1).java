package com.instagram.urlhandlers.fbshopping;

import X.AnonymousClass44N;
import X.C04220Ms;
import X.C05030Qo;
import X.C10300i6;
import X.C10450iM;
import X.C14030oh;
import X.C18200wM;
import X.C18210wN;
import X.C60903Qz;
import android.content.Intent;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;

public final class FBShoppingExternalUrlHandlerActivity extends BaseFragmentActivity {
    public final void A0D(Bundle bundle) {
    }

    public final C10300i6 getSession() {
        return C18200wM.A0W(this);
    }

    public final void onCreate(Bundle bundle) {
        int A00 = C14030oh.A00(-932280821);
        super.onCreate(bundle);
        Intent intent = getIntent();
        C04220Ms.A06(intent);
        Bundle A0B = C18210wN.A0B(intent);
        if (!(A0B == null || A0B.getString("original_url") == null)) {
            try {
                C60903Qz.A00(this, AnonymousClass44N.A00, C05030Qo.A02(C18200wM.A0W(this)), "ig_product_wishlist", (String) null, A0B.getString("original_url"), (String) null, (String) null, false);
            } catch (IllegalArgumentException e) {
                C10450iM.A07("FBShoppingExternalUrlHandlerActivity", e);
            }
        }
        finish();
        C14030oh.A07(1861454300, A00);
    }
}
