package com.instagram.debug.devoptions;

import X.C63813iO;
import X.C83964sH;

public final class FXPFDebugSettingFragment$getMenuItems$linkingCallback$1 implements C83964sH {
    public final /* synthetic */ FXPFDebugSettingFragment this$0;

    public FXPFDebugSettingFragment$getMenuItems$linkingCallback$1(FXPFDebugSettingFragment fXPFDebugSettingFragment) {
        this.this$0 = fXPFDebugSettingFragment;
    }

    public void onAuthorizeFail() {
        C63813iO.A0B(this.this$0.getContext(), "Linking flow failed");
    }

    public void onAuthorizeSuccess(String str, String str2) {
        C63813iO.A0B(this.this$0.getContext(), "Linking flow succeed");
    }
}
