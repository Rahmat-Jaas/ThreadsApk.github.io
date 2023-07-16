package com.instagram.debug.devoptions;

import X.C14030oh;
import X.C63813iO;
import android.view.View;

public final class StoriesExperimentSwitcherToolFragment$getMenuItems$2 implements View.OnClickListener {
    public final /* synthetic */ StoriesExperimentSwitcherToolFragment this$0;

    public StoriesExperimentSwitcherToolFragment$getMenuItems$2(StoriesExperimentSwitcherToolFragment storiesExperimentSwitcherToolFragment) {
        this.this$0 = storiesExperimentSwitcherToolFragment;
    }

    public final void onClick(View view) {
        int A05 = C14030oh.A05(1045997420);
        C63813iO.A0B(this.this$0.getContext(), "All Experiments Turned Off");
        this.this$0.turnOffAllExperiments();
        this.this$0.refreshMenuItems();
        C14030oh.A0C(1145882095, A05);
    }
}
