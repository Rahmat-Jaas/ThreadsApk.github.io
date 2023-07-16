package com.instagram.debug.devoptions;

import X.AnonymousClass0wJ;
import X.AnonymousClass3ZL;
import X.C14030oh;
import X.C23411dm;
import X.C63813iO;
import android.view.View;

public final class CrosspostUpsellSettingsFragment$addCCPItems$7 implements View.OnClickListener {
    public final /* synthetic */ CrosspostUpsellSettingsFragment this$0;

    public CrosspostUpsellSettingsFragment$addCCPItems$7(CrosspostUpsellSettingsFragment crosspostUpsellSettingsFragment) {
        this.this$0 = crosspostUpsellSettingsFragment;
    }

    public final void onClick(View view) {
        int A05 = C14030oh.A05(-797690898);
        AnonymousClass0wJ.A13(AnonymousClass3ZL.A00(C23411dm.A00(this.this$0)), "PREFERENCE_HAS_SEEN_SHARE_TO_FACEBOOK_TOOLTIP_ON_PANAVISION_M15", false);
        C63813iO.A0C(this.this$0.getContext(), "setHasSeenShareToFacebookTooltipOnPanavisionM15(false)");
        this.this$0.resetItems();
        C14030oh.A0C(-991709557, A05);
    }
}
