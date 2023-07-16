package com.instagram.debug.devoptions;

import X.AnonymousClass0wJ;
import X.C09120et;
import android.widget.CompoundButton;

public final class ImageDebugSettingsFragment$onViewCreated$5 implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ C09120et $preferences;
    public final /* synthetic */ ImageDebugSettingsFragment this$0;

    public ImageDebugSettingsFragment$onViewCreated$5(C09120et r1, ImageDebugSettingsFragment imageDebugSettingsFragment) {
        this.$preferences = r1;
        this.this$0 = imageDebugSettingsFragment;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        AnonymousClass0wJ.A1L(this.$preferences.A0V, z);
        this.this$0.updateModules();
    }
}
