package com.instagram.debug.devoptions;

import X.AnonymousClass0e5;
import X.C04220Ms;
import X.C83064qj;

public final class StoriesExperimentSwitcherToolFragment$createNumberInputItem$1 implements C83064qj {
    public final /* synthetic */ AnonymousClass0e5 $param;
    public final /* synthetic */ StoriesExperimentSwitcherToolFragment this$0;

    public StoriesExperimentSwitcherToolFragment$createNumberInputItem$1(StoriesExperimentSwitcherToolFragment storiesExperimentSwitcherToolFragment, AnonymousClass0e5 r2) {
        this.this$0 = storiesExperimentSwitcherToolFragment;
        this.$param = r2;
    }

    public final void onTextChanged(String str) {
        C04220Ms.A0B(str, 0);
        try {
            this.this$0.setParameterOverride(this.$param, String.valueOf(Long.parseLong(str)));
        } catch (NumberFormatException unused) {
        }
    }
}
