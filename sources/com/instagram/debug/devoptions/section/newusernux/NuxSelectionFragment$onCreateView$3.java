package com.instagram.debug.devoptions.section.newusernux;

import X.AnonymousClass2AQ;
import X.AnonymousClass3XW;
import android.widget.CompoundButton;

public final class NuxSelectionFragment$onCreateView$3 implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ AnonymousClass2AQ $step;

    public NuxSelectionFragment$onCreateView$3(AnonymousClass2AQ r1) {
        this.$step = r1;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        AnonymousClass3XW.A01.put(this.$step, Boolean.valueOf(z));
    }
}
