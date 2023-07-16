package com.instagram.debug.devoptions;

import X.C14030oh;
import android.view.View;
import com.instagram.debug.devoptions.InjectionMediaSelectionAdapter;
import com.instagram.igds.components.switchbutton.IgSwitch;

public final class InjectionMediaSelectionAdapter$InjectionMediaViewHolder$bindView$2 implements View.OnClickListener {
    public final /* synthetic */ InjectionMediaSelectionAdapter.InjectionMediaViewHolder this$0;

    public InjectionMediaSelectionAdapter$InjectionMediaViewHolder$bindView$2(InjectionMediaSelectionAdapter.InjectionMediaViewHolder injectionMediaViewHolder) {
        this.this$0 = injectionMediaViewHolder;
    }

    public final void onClick(View view) {
        int A05 = C14030oh.A05(-2140332887);
        IgSwitch igSwitch = this.this$0.injectedMediaSwitch;
        igSwitch.setCheckedAnimated(!igSwitch.isChecked());
        C14030oh.A0C(352030888, A05);
    }
}
