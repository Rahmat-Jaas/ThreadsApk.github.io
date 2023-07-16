package com.instagram.debug.devoptions;

import android.widget.CompoundButton;
import com.instagram.debug.devoptions.L;

public final class StoriesExperimentSwitcherToolFragment$addViewerExperimentsMenuItems$1 implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ StoriesExperimentSwitcherToolFragment this$0;

    public StoriesExperimentSwitcherToolFragment$addViewerExperimentsMenuItems$1(StoriesExperimentSwitcherToolFragment storiesExperimentSwitcherToolFragment) {
        this.this$0 = storiesExperimentSwitcherToolFragment;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        String valueOf = String.valueOf(z);
        this.this$0.setParameterOverride(L.ig_android_save_stories_ads.is_save_menu_option_enabled.getParameter(), valueOf);
        this.this$0.setParameterOverride(L.ig_android_save_stories_ads.is_bookmark_enabled.getParameter(), valueOf);
        if (!z) {
            this.this$0.setParameterOverride(L.ig_android_save_stories_ads.is_save_to_collections_enabled.getParameter(), valueOf);
            this.this$0.refreshMenuItems();
        }
    }
}
