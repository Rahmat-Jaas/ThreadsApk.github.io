package com.instagram.debug.devoptions;

import X.C14030oh;
import X.C63813iO;
import android.view.View;

public final class StoriesExperimentSwitcherToolFragment$getMenuItems$1 implements View.OnClickListener {
    public final /* synthetic */ StoriesExperimentSwitcherToolFragment this$0;

    public StoriesExperimentSwitcherToolFragment$getMenuItems$1(StoriesExperimentSwitcherToolFragment storiesExperimentSwitcherToolFragment) {
        this.this$0 = storiesExperimentSwitcherToolFragment;
    }

    public final void onClick(View view) {
        int A05 = C14030oh.A05(432240968);
        C63813iO.A0B(this.this$0.getContext(), "Client Overrides Removed");
        this.this$0.resetAllParamsToDefault();
        this.this$0.refreshMenuItems();
        C14030oh.A0C(1376837496, A05);
    }
}
