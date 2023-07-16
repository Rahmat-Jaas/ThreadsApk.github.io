package com.instagram.debug.devoptions;

import X.AnonymousClass0wJ;
import X.C14030oh;
import X.C35762Os;
import android.view.View;

public final class FXPFDebugSettingFragment$getMenuItems$4 implements View.OnClickListener {
    public final /* synthetic */ FXPFDebugSettingFragment$getMenuItems$linkingCallback$1 $linkingCallback;
    public final /* synthetic */ FXPFDebugSettingFragment this$0;

    public FXPFDebugSettingFragment$getMenuItems$4(FXPFDebugSettingFragment fXPFDebugSettingFragment, FXPFDebugSettingFragment$getMenuItems$linkingCallback$1 fXPFDebugSettingFragment$getMenuItems$linkingCallback$1) {
        this.this$0 = fXPFDebugSettingFragment;
        this.$linkingCallback = fXPFDebugSettingFragment$getMenuItems$linkingCallback$1;
    }

    public final void onClick(View view) {
        int A05 = C14030oh.A05(694173168);
        C35762Os.A00().A00(this.this$0, AnonymousClass0wJ.A0X(this.this$0.userSession$delegate), this.$linkingCallback).A04("igpc_blocking_interstitial");
        C14030oh.A0C(-1215460464, A05);
    }
}
