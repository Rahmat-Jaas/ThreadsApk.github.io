package com.instagram.debug.devoptions;

import X.AnonymousClass0e5;
import android.widget.CompoundButton;

public final class StoriesExperimentSwitcherToolFragment$createBooleanSwitchItem$1 implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ AnonymousClass0e5 $param;
    public final /* synthetic */ StoriesExperimentSwitcherToolFragment this$0;

    public StoriesExperimentSwitcherToolFragment$createBooleanSwitchItem$1(StoriesExperimentSwitcherToolFragment storiesExperimentSwitcherToolFragment, AnonymousClass0e5 r2) {
        this.this$0 = storiesExperimentSwitcherToolFragment;
        this.$param = r2;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.this$0.setParameterOverride(this.$param, String.valueOf(z));
    }
}
