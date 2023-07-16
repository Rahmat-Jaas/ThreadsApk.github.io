package com.instagram.debug.devoptions;

import X.AnonymousClass0wJ;
import X.AnonymousClass3ZL;
import X.AnonymousClass3Zu;
import X.C14030oh;
import X.C23411dm;
import X.C63813iO;
import android.view.View;

public final class CrosspostUpsellSettingsFragment$addCCPItems$1 implements View.OnClickListener {
    public final /* synthetic */ CrosspostUpsellSettingsFragment this$0;

    public CrosspostUpsellSettingsFragment$addCCPItems$1(CrosspostUpsellSettingsFragment crosspostUpsellSettingsFragment) {
        this.this$0 = crosspostUpsellSettingsFragment;
    }

    public final void onClick(View view) {
        int A05 = C14030oh.A05(-519773553);
        AnonymousClass0wJ.A12(AnonymousClass3ZL.A00(C23411dm.A00(this.this$0)), "PREFERENCE_CROSSPOST_TO_FACEBOOK_UPSELL_LAST_SEEN_TIME_MS", 0);
        AnonymousClass0wJ.A11(AnonymousClass3ZL.A00(C23411dm.A00(this.this$0)), "PREFERENCE_CROSSPOST_TO_FACEBOOK_UPSELL_VIEW_COUNT", 0);
        AnonymousClass0wJ.A12(AnonymousClass3Zu.A01(AnonymousClass0wJ.A0X(this.this$0.userSession$delegate)), "PREFERENCE_AUTO_CROSS_POST_TO_FACEBOOK_REELS_LAST_CHANGED_MS", 0);
        AnonymousClass0wJ.A12(AnonymousClass3Zu.A01(AnonymousClass0wJ.A0X(this.this$0.userSession$delegate)), "PREFERENCE_REELS_XAR_UPSELL_LAST_SEEN_MS", 0);
        AnonymousClass3ZL A00 = C23411dm.A00(this.this$0);
        AnonymousClass0wJ.A12(AnonymousClass3ZL.A00(A00), "PREFERENCE_REELS_AUTO_RECOMMEND_ON_FACEBOOK_LAST_CHANGED_MS", 0);
        AnonymousClass3ZL.A01(A00, "PREFERENCE_REELS_AUTO_RECOMMEND_ON_FACEBOOK_LAST_CHANGED_MS");
        C23411dm.A00(this.this$0).A06(true);
        AnonymousClass0wJ.A12(AnonymousClass3ZL.A00(C23411dm.A00(this.this$0)), "PREFERENCE_REELS_SHARE_TO_FACEBOOK_SIMPLIFICATION_UPSELL_LAST_SEEN", 0);
        AnonymousClass0wJ.A12(AnonymousClass3Zu.A01(AnonymousClass0wJ.A0X(this.this$0.userSession$delegate)), "PREFERENCE_REELS_SHARE_TO_FACEBOOK_SIMPLIFICATION_V_1_5_UPSELL_LAST_SEEN", 0);
        AnonymousClass0wJ.A12(AnonymousClass3Zu.A01(AnonymousClass0wJ.A0X(this.this$0.userSession$delegate)), "PREFERENCE_REELS_XAR_CCP_MIGRATION_UPSELL_LAST_SEEN_MS", 0);
        AnonymousClass0wJ.A11(AnonymousClass3Zu.A01(AnonymousClass0wJ.A0X(this.this$0.userSession$delegate)), "PREFERENCE_REELS_XAR_CCP_MIGRATION_UPSELL_SEEN_COUNT", 0);
        this.this$0.resetItems();
        C63813iO.A02(this.this$0.getContext(), "Cleared All CCP/XAR upsell seen/toggle timestamps", (String) null, 1);
        C14030oh.A0C(1589627870, A05);
    }
}
