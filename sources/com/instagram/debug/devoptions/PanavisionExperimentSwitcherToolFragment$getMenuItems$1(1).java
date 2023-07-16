package com.instagram.debug.devoptions;

import X.C14030oh;
import X.C63813iO;
import android.view.View;

public final class PanavisionExperimentSwitcherToolFragment$getMenuItems$1 implements View.OnClickListener {
    public final /* synthetic */ PanavisionExperimentSwitcherToolFragment this$0;

    public PanavisionExperimentSwitcherToolFragment$getMenuItems$1(PanavisionExperimentSwitcherToolFragment panavisionExperimentSwitcherToolFragment) {
        this.this$0 = panavisionExperimentSwitcherToolFragment;
    }

    public final void onClick(View view) {
        int A05 = C14030oh.A05(658532852);
        C63813iO.A0B(this.this$0.getContext(), "Client Overrides Removed");
        this.this$0.resetAllParamsToDefault();
        this.this$0.refreshMenuItems();
        C14030oh.A0C(-1757977027, A05);
    }
}
