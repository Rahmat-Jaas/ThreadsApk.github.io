package com.instagram.debug.devoptions;

import X.AnonymousClass0wJ;
import X.AnonymousClass3WS;
import X.C14030oh;
import X.C28161tl;
import X.C63813iO;
import android.view.View;

public final class CrosspostUpsellSettingsFragment$addCCPItems$8 implements View.OnClickListener {
    public final /* synthetic */ CrosspostUpsellSettingsFragment this$0;

    public CrosspostUpsellSettingsFragment$addCCPItems$8(CrosspostUpsellSettingsFragment crosspostUpsellSettingsFragment) {
        this.this$0 = crosspostUpsellSettingsFragment;
    }

    public final void onClick(View view) {
        int A05 = C14030oh.A05(1845061190);
        AnonymousClass0wJ.A13(C28161tl.A02(AnonymousClass3WS.A01(AnonymousClass0wJ.A0X(this.this$0.userSession$delegate))), "feed_post_new_post_capture_nux", false);
        C63813iO.A0C(this.this$0.getContext(), "setHasSeenFeedPostNewPostCaptureNux(false)");
        this.this$0.resetItems();
        C14030oh.A0C(591763415, A05);
    }
}
