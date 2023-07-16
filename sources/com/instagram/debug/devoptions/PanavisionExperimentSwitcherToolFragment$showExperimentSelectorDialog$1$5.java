package com.instagram.debug.devoptions;

import X.AnonymousClass0MZ;
import android.content.DialogInterface;

public final class PanavisionExperimentSwitcherToolFragment$showExperimentSelectorDialog$1$5 implements DialogInterface.OnClickListener {
    public final /* synthetic */ MultiChoiceFeatureExperiment $experiment;
    public final /* synthetic */ AnonymousClass0MZ $selected;
    public final /* synthetic */ PanavisionExperimentSwitcherToolFragment this$0;

    public PanavisionExperimentSwitcherToolFragment$showExperimentSelectorDialog$1$5(PanavisionExperimentSwitcherToolFragment panavisionExperimentSwitcherToolFragment, AnonymousClass0MZ r2, MultiChoiceFeatureExperiment multiChoiceFeatureExperiment) {
        this.this$0 = panavisionExperimentSwitcherToolFragment;
        this.$selected = r2;
        this.$experiment = multiChoiceFeatureExperiment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.this$0.selectExperiment(this.$selected.A00, this.$experiment, true);
    }
}
