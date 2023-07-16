package com.instagram.debug.devoptions;

import X.AnonymousClass0wJ;
import X.C14030oh;
import X.C18180wK;
import X.C25786Drz;
import android.view.View;
import com.instagram.debug.devoptions.dcp.PredictAndLoggerTestFragment;

public final class DeviceComputePlatformFragment$getMenuItems$1 implements View.OnClickListener {
    public final /* synthetic */ DeviceComputePlatformFragment this$0;

    public DeviceComputePlatformFragment$getMenuItems$1(DeviceComputePlatformFragment deviceComputePlatformFragment) {
        this.this$0 = deviceComputePlatformFragment;
    }

    public final void onClick(View view) {
        int A05 = C14030oh.A05(32876694);
        C25786Drz A0Q = C18180wK.A0Q(this.this$0.requireActivity(), AnonymousClass0wJ.A0X(this.this$0.userSession$delegate));
        A0Q.A03 = new PredictAndLoggerTestFragment();
        A0Q.A05();
        C14030oh.A0C(1867858654, A05);
    }
}
