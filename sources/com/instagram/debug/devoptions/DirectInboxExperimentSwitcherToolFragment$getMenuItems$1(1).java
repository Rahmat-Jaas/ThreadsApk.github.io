package com.instagram.debug.devoptions;

import X.C04220Ms;
import X.C14030oh;
import android.view.View;

public final class DirectInboxExperimentSwitcherToolFragment$getMenuItems$1 implements View.OnClickListener {
    public final /* synthetic */ DirectInboxExperimentSwitcherToolFragment this$0;

    public DirectInboxExperimentSwitcherToolFragment$getMenuItems$1(DirectInboxExperimentSwitcherToolFragment directInboxExperimentSwitcherToolFragment) {
        this.this$0 = directInboxExperimentSwitcherToolFragment;
    }

    public final void onClick(View view) {
        int A05 = C14030oh.A05(-1429652327);
        DirectInboxDevUtil directInboxDevUtil = this.this$0.directInboxDevUtil;
        if (directInboxDevUtil == null) {
            C04220Ms.A0E("directInboxDevUtil");
            throw null;
        }
        directInboxDevUtil.resetParams();
        this.this$0.refreshMenuItems();
        C14030oh.A0C(-670708830, A05);
    }
}
