package com.instagram.debug.devoptions;

import X.AnonymousClass0wJ;
import X.AnonymousClass3ZL;
import X.AnonymousClass3Zu;
import X.C14030oh;
import X.C23411dm;
import X.C63813iO;
import android.view.View;

public final class CrosspostUpsellSettingsFragment$addCCPItems$2 implements View.OnClickListener {
    public final /* synthetic */ CrosspostUpsellSettingsFragment this$0;

    public CrosspostUpsellSettingsFragment$addCCPItems$2(CrosspostUpsellSettingsFragment crosspostUpsellSettingsFragment) {
        this.this$0 = crosspostUpsellSettingsFragment;
    }

    public final void onClick(View view) {
        int A05 = C14030oh.A05(-268137075);
        AnonymousClass0wJ.A12(AnonymousClass3ZL.A00(C23411dm.A00(this.this$0)), "PREFERENCE_CROSSPOST_TO_FACEBOOK_UPSELL_LAST_SEEN_TIME_MS", 0);
        AnonymousClass0wJ.A12(AnonymousClass3Zu.A01(AnonymousClass0wJ.A0X(this.this$0.userSession$delegate)), "PREFERENCE_AUTO_CROSS_POST_TO_FACEBOOK_REELS_LAST_CHANGED_MS", 0);
        C63813iO.A0C(this.this$0.getContext(), "Reset CCP upsell and last change timestamp");
        this.this$0.resetItems();
        C14030oh.A0C(-1009175406, A05);
    }
}
