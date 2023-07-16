package com.instagram.debug.devoptions;

import X.AnonymousClass0wJ;
import X.AnonymousClass3ZL;
import X.C14030oh;
import X.C23411dm;
import X.C63813iO;
import android.view.View;

public final class CrosspostUpsellSettingsFragment$addCCPItems$4 implements View.OnClickListener {
    public final /* synthetic */ CrosspostUpsellSettingsFragment this$0;

    public CrosspostUpsellSettingsFragment$addCCPItems$4(CrosspostUpsellSettingsFragment crosspostUpsellSettingsFragment) {
        this.this$0 = crosspostUpsellSettingsFragment;
    }

    public final void onClick(View view) {
        int A05 = C14030oh.A05(1855345367);
        AnonymousClass3ZL A00 = C23411dm.A00(this.this$0);
        AnonymousClass0wJ.A12(AnonymousClass3ZL.A00(A00), "PREFERENCE_REELS_AUTO_RECOMMEND_ON_FACEBOOK_LAST_CHANGED_MS", 0);
        AnonymousClass3ZL.A01(A00, "PREFERENCE_REELS_AUTO_RECOMMEND_ON_FACEBOOK_LAST_CHANGED_MS");
        AnonymousClass0wJ.A12(AnonymousClass3ZL.A00(C23411dm.A00(this.this$0)), "PREFERENCE_REELS_XAR_UPSELL_LAST_SEEN_MS", 0);
        C23411dm.A00(this.this$0).A06(true);
        C63813iO.A02(this.this$0.getContext(), "local XAR upsell and toggle timestamps cleared", (String) null, 1);
        this.this$0.resetItems();
        C14030oh.A0C(1680272799, A05);
    }
}
