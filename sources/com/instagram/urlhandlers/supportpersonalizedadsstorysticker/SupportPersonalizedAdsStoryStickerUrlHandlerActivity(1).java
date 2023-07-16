package com.instagram.urlhandlers.supportpersonalizedadsstorysticker;

import X.AnonymousClass0wJ;
import X.C10300i6;
import X.C11630kW;
import X.C14030oh;
import X.C18180wK;
import X.C18190wL;
import X.C63863iT;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.modal.TransparentModalActivity;

public class SupportPersonalizedAdsStoryStickerUrlHandlerActivity extends BaseFragmentActivity implements C11630kW {
    public C10300i6 A00;

    public final void A0D(Bundle bundle) {
    }

    public final String getModuleName() {
        return "spa_bottom_sheet_deep_link_handler_activity";
    }

    public final C10300i6 getSession() {
        return this.A00;
    }

    public final void onCreate(Bundle bundle) {
        int A002 = C14030oh.A00(-748342488);
        super.onCreate(bundle);
        Bundle A0C = AnonymousClass0wJ.A0C(this);
        if (A0C != null) {
            this.A00 = C18190wL.A0S(A0C);
        }
        Bundle A06 = C18180wK.A06();
        A06.putString("ReelSupportPersonalizedAdsStickerShareConstants.ARGUMENTS_KEY_CAMERA_ENTRY_POINT", "spa_bottom_sheet_deep_link_handler_activity");
        C63863iT.A06(this, A06, this.A00, TransparentModalActivity.class, "reel_support_personalized_ads_sticker_share_fragment").A0I(this);
        finish();
        C14030oh.A07(1839346916, A002);
    }
}
