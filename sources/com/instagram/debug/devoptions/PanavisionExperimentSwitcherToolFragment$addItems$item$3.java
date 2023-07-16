package com.instagram.debug.devoptions;

import android.widget.CompoundButton;

public final class PanavisionExperimentSwitcherToolFragment$addItems$item$3 implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ FeatureExperiment $experiment;
    public final /* synthetic */ PanavisionExperimentSwitcherToolFragment this$0;

    public PanavisionExperimentSwitcherToolFragment$addItems$item$3(FeatureExperiment featureExperiment, PanavisionExperimentSwitcherToolFragment panavisionExperimentSwitcherToolFragment) {
        this.$experiment = featureExperiment;
        this.this$0 = panavisionExperimentSwitcherToolFragment;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.$experiment.setExperiment(Boolean.valueOf(z));
        PanavisionExperimentSwitcherToolFragment panavisionExperimentSwitcherToolFragment = this.this$0;
        panavisionExperimentSwitcherToolFragment.settingChanged = true;
        panavisionExperimentSwitcherToolFragment.refreshMenuItems();
    }
}
