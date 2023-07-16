package com.instagram.debug.devoptions;

import X.AnonymousClass0wJ;
import X.AnonymousClass3ZL;
import X.AnonymousClass3Zu;
import X.C14030oh;
import X.C23411dm;
import X.C63813iO;
import android.view.View;

public final class CrosspostUpsellSettingsFragment$addCCPItems$5 implements View.OnClickListener {
    public final /* synthetic */ CrosspostUpsellSettingsFragment this$0;

    public CrosspostUpsellSettingsFragment$addCCPItems$5(CrosspostUpsellSettingsFragment crosspostUpsellSettingsFragment) {
        this.this$0 = crosspostUpsellSettingsFragment;
    }

    public final void onClick(View view) {
        int A05 = C14030oh.A05(1329933193);
        AnonymousClass0wJ.A13(AnonymousClass3ZL.A00(C23411dm.A00(this.this$0)), "PREFERENCE_REELS_SHARE_TO_FACEBOOK_IN_PANAVISIONM15_FIRST_TIMER", true);
        AnonymousClass0wJ.A13(AnonymousClass3ZL.A00(C23411dm.A00(this.this$0)), "PREFERENCE_HAS_SEEN_SHARE_TO_FACEBOOK_TOOLTIP_ON_PANAVISION_M15", false);
        AnonymousClass0wJ.A13(AnonymousClass3Zu.A01(AnonymousClass0wJ.A0X(this.this$0.userSession$delegate)), "PREFERENCE_HAS_SEEN_PANAVISION_POST_CAPTURE_CONTENT_LIQUIDITY_NUX", false);
        AnonymousClass0wJ.A13(AnonymousClass3ZL.A00(C23411dm.A00(this.this$0)), "PREFERENCE_HAS_SEEN_SHARE_TO_FACEBOOK_NUX_FOR_CURRENT_PANAVISION_USER", false);
        C63813iO.A02(this.this$0.getContext(), "Reset Panavision Content Liquidity Nuxes", (String) null, 1);
        this.this$0.resetItems();
        C14030oh.A0C(-307463269, A05);
    }
}
