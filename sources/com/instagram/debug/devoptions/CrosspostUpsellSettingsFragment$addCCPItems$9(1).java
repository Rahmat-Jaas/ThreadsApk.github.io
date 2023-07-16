package com.instagram.debug.devoptions;

import X.AnonymousClass0wJ;
import X.AnonymousClass3ZL;
import X.C14030oh;
import X.C23411dm;
import X.C63813iO;
import android.view.View;

public final class CrosspostUpsellSettingsFragment$addCCPItems$9 implements View.OnClickListener {
    public final /* synthetic */ CrosspostUpsellSettingsFragment this$0;

    public CrosspostUpsellSettingsFragment$addCCPItems$9(CrosspostUpsellSettingsFragment crosspostUpsellSettingsFragment) {
        this.this$0 = crosspostUpsellSettingsFragment;
    }

    public final void onClick(View view) {
        int A05 = C14030oh.A05(246463997);
        AnonymousClass0wJ.A12(AnonymousClass3ZL.A00(C23411dm.A00(this.this$0)), "PREFERENCE_REELS_SHARE_TO_FACEBOOK_SIMPLIFICATION_UPSELL_LAST_SEEN", 0);
        C63813iO.A0C(this.this$0.getContext(), "Simplification last seen upsell reset");
        this.this$0.resetItems();
        C14030oh.A0C(1396837593, A05);
    }
}
