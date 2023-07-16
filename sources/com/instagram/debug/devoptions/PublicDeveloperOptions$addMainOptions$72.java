package com.instagram.debug.devoptions;

import X.AnonymousClass0wJ;
import X.C18220wO;
import X.C81704oE;
import android.widget.CompoundButton;

public final class PublicDeveloperOptions$addMainOptions$72 implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ C81704oE $debugConfigurations;

    public PublicDeveloperOptions$addMainOptions$72(C81704oE r1) {
        this.$debugConfigurations = r1;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        AnonymousClass0wJ.A13(C18220wO.A0C("LithoFeedDebugConfigurations"), "main_thread_render_detector", z);
    }
}
