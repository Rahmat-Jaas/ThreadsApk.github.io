package com.instagram.debug.devoptions;

import X.C28979FfK;
import android.widget.CompoundButton;

public final class IgVoltronDevOptionsFragment$onViewCreated$1$1 implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ C28979FfK $module;
    public final /* synthetic */ IgVoltronDevOptionsFragment this$0;

    public IgVoltronDevOptionsFragment$onViewCreated$1$1(IgVoltronDevOptionsFragment igVoltronDevOptionsFragment, C28979FfK ffK) {
        this.this$0 = igVoltronDevOptionsFragment;
        this.$module = ffK;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        IgVoltronDevOptionsFragment igVoltronDevOptionsFragment = this.this$0;
        C28979FfK ffK = this.$module;
        if (z) {
            igVoltronDevOptionsFragment.loadModule(ffK);
        } else {
            IgVoltronDevOptionsFragment.access$deleteModule(igVoltronDevOptionsFragment, ffK);
            throw null;
        }
    }
}
