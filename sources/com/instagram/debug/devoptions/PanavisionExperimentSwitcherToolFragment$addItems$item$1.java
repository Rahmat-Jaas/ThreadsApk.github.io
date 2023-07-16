package com.instagram.debug.devoptions;

import X.C14030oh;
import android.view.View;

public final class PanavisionExperimentSwitcherToolFragment$addItems$item$1 implements View.OnClickListener {
    public final /* synthetic */ FeatureExperiment $choice;
    public final /* synthetic */ PanavisionExperimentSwitcherToolFragment this$0;

    public PanavisionExperimentSwitcherToolFragment$addItems$item$1(PanavisionExperimentSwitcherToolFragment panavisionExperimentSwitcherToolFragment, FeatureExperiment featureExperiment) {
        this.this$0 = panavisionExperimentSwitcherToolFragment;
        this.$choice = featureExperiment;
    }

    public final void onClick(View view) {
        int A05 = C14030oh.A05(198580384);
        this.this$0.showExperimentSelectorDialog((MultiChoiceFeatureExperiment) this.$choice);
        C14030oh.A0C(-1220520581, A05);
    }
}
