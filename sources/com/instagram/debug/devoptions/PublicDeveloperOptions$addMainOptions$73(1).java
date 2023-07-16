package com.instagram.debug.devoptions;

import X.AnonymousClass0wJ;
import X.C18220wO;
import X.C81704oE;
import android.widget.CompoundButton;

public final class PublicDeveloperOptions$addMainOptions$73 implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ C81704oE $debugConfigurations;

    public PublicDeveloperOptions$addMainOptions$73(C81704oE r1) {
        this.$debugConfigurations = r1;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        AnonymousClass0wJ.A13(C18220wO.A0C("LithoFeedDebugConfigurations"), "mount_time_debug_detector_enabled", z);
    }
}
