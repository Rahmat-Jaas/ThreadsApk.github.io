package com.instagram.debug.devoptions;

import X.C04220Ms;
import android.widget.CompoundButton;

public final class DirectInboxExperimentSwitcherToolFragment$getMenuItems$10 implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ DirectInboxExperimentSwitcherToolFragment this$0;

    public DirectInboxExperimentSwitcherToolFragment$getMenuItems$10(DirectInboxExperimentSwitcherToolFragment directInboxExperimentSwitcherToolFragment) {
        this.this$0 = directInboxExperimentSwitcherToolFragment;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        DirectInboxDevUtil directInboxDevUtil = this.this$0.directInboxDevUtil;
        if (directInboxDevUtil == null) {
            C04220Ms.A0E("directInboxDevUtil");
            throw null;
        }
        directInboxDevUtil.enableImmersiveCreation(z);
        this.this$0.refreshMenuItems();
    }
}
