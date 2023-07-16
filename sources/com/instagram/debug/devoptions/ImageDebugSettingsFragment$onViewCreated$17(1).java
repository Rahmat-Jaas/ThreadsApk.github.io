package com.instagram.debug.devoptions;

import X.C09120et;
import X.C18210wN;
import android.widget.CompoundButton;

public final class ImageDebugSettingsFragment$onViewCreated$17 implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ C09120et $preferences;
    public final /* synthetic */ ImageDebugSettingsFragment this$0;

    public ImageDebugSettingsFragment$onViewCreated$17(C09120et r1, ImageDebugSettingsFragment imageDebugSettingsFragment) {
        this.$preferences = r1;
        this.this$0 = imageDebugSettingsFragment;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        C18210wN.A1I(this.$preferences.A0N, z ? 1 : 0);
        this.this$0.updateModules();
    }
}
