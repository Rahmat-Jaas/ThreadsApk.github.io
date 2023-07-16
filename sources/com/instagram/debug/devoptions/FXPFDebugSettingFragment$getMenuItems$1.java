package com.instagram.debug.devoptions;

import X.AnonymousClass0wJ;
import X.C14030oh;
import X.C35762Os;
import android.view.View;

public final class FXPFDebugSettingFragment$getMenuItems$1 implements View.OnClickListener {
    public final /* synthetic */ String $flow;
    public final /* synthetic */ FXPFDebugSettingFragment$getMenuItems$linkingCallback$1 $linkingCallback;
    public final /* synthetic */ FXPFDebugSettingFragment this$0;

    public FXPFDebugSettingFragment$getMenuItems$1(FXPFDebugSettingFragment fXPFDebugSettingFragment, FXPFDebugSettingFragment$getMenuItems$linkingCallback$1 fXPFDebugSettingFragment$getMenuItems$linkingCallback$1, String str) {
        this.this$0 = fXPFDebugSettingFragment;
        this.$linkingCallback = fXPFDebugSettingFragment$getMenuItems$linkingCallback$1;
        this.$flow = str;
    }

    public final void onClick(View view) {
        int A05 = C14030oh.A05(772745720);
        C35762Os.A00().A00(this.this$0, AnonymousClass0wJ.A0X(this.this$0.userSession$delegate), this.$linkingCallback).A06(this.$flow);
        C14030oh.A0C(1834713841, A05);
    }
}
