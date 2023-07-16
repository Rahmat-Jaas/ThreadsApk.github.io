package com.instagram.debug.devoptions;

import X.AnonymousClass0wJ;
import X.C14030oh;
import X.C35762Os;
import X.C83964sH;
import android.view.View;

public final class FXPFDebugSettingFragment$getMenuItems$5 implements View.OnClickListener {
    public final /* synthetic */ C83964sH $callbackV2;
    public final /* synthetic */ String $flow;
    public final /* synthetic */ FXPFDebugSettingFragment this$0;

    public FXPFDebugSettingFragment$getMenuItems$5(FXPFDebugSettingFragment fXPFDebugSettingFragment, C83964sH r2, String str) {
        this.this$0 = fXPFDebugSettingFragment;
        this.$callbackV2 = r2;
        this.$flow = str;
    }

    public final void onClick(View view) {
        int A05 = C14030oh.A05(1324120415);
        C35762Os.A00().A00(this.this$0, AnonymousClass0wJ.A0X(this.this$0.userSession$delegate), this.$callbackV2).A06(this.$flow);
        C14030oh.A0C(-1271973125, A05);
    }
}
