package com.instagram.debug.devoptions;

import X.C04220Ms;
import android.widget.CompoundButton;

public final class PanavisionExperimentSwitcherToolFragment$getMenuItems$3 implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ PanavisionExperimentSwitcherToolFragment this$0;

    public PanavisionExperimentSwitcherToolFragment$getMenuItems$3(PanavisionExperimentSwitcherToolFragment panavisionExperimentSwitcherToolFragment) {
        this.this$0 = panavisionExperimentSwitcherToolFragment;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        PanavisionDevUtil panavisionDevUtil = this.this$0.panavisionDevUtil;
        if (panavisionDevUtil == null) {
            C04220Ms.A0E("panavisionDevUtil");
            throw null;
        }
        panavisionDevUtil.setSandboxOn(z);
        PanavisionExperimentSwitcherToolFragment panavisionExperimentSwitcherToolFragment = this.this$0;
        panavisionExperimentSwitcherToolFragment.settingChanged = true;
        panavisionExperimentSwitcherToolFragment.refreshMenuItems();
    }
}
