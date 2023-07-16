package com.instagram.debug.devoptions;

import X.AnonymousClass0wJ;
import X.AnonymousClass3ZL;
import X.C14030oh;
import X.C23411dm;
import X.C63813iO;
import android.view.View;

public final class CrosspostUpsellSettingsFragment$addCCPItems$3 implements View.OnClickListener {
    public final /* synthetic */ CrosspostUpsellSettingsFragment this$0;

    public CrosspostUpsellSettingsFragment$addCCPItems$3(CrosspostUpsellSettingsFragment crosspostUpsellSettingsFragment) {
        this.this$0 = crosspostUpsellSettingsFragment;
    }

    public final void onClick(View view) {
        int A05 = C14030oh.A05(-1077327290);
        AnonymousClass0wJ.A13(AnonymousClass3ZL.A00(C23411dm.A00(this.this$0)), "PREFERENCE_REELS_HAS_SHOWN_CROSS_POST_TO_FACEBOOK_TOOLTIP", false);
        C63813iO.A0C(this.this$0.getContext(), "CCP tooltip seen flag cleared");
        this.this$0.resetItems();
        C14030oh.A0C(-1855911451, A05);
    }
}
