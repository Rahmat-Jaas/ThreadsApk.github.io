package com.instagram.debug.devoptions;

import X.AnonymousClass0e5;
import android.widget.CompoundButton;

public final class StoriesExperimentSwitcherToolFragment$addDeveloperOptions$3 implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ AnonymousClass0e5 $shouldLaunchViewerAsModalParam;
    public final /* synthetic */ StoriesExperimentSwitcherToolFragment this$0;

    public StoriesExperimentSwitcherToolFragment$addDeveloperOptions$3(StoriesExperimentSwitcherToolFragment storiesExperimentSwitcherToolFragment, AnonymousClass0e5 r2) {
        this.this$0 = storiesExperimentSwitcherToolFragment;
        this.$shouldLaunchViewerAsModalParam = r2;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (z) {
            this.this$0.setParameterOverride(this.$shouldLaunchViewerAsModalParam, String.valueOf(z));
        }
        this.this$0.refreshMenuItems();
    }
}
