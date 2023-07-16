package com.instagram.debug.devoptions.disk;

import X.AnonymousClass0ZU;
import X.C02220Ah;
import androidx.fragment.app.FragmentActivity;
import com.instagram.debug.devoptions.api.DevOptionsPreferenceAdapter;

public final class DiskDebugFragment$adapter$2 extends C02220Ah implements AnonymousClass0ZU {
    public final /* synthetic */ DiskDebugFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DiskDebugFragment$adapter$2(DiskDebugFragment diskDebugFragment) {
        super(0);
        this.this$0 = diskDebugFragment;
    }

    public final DevOptionsPreferenceAdapter invoke() {
        FragmentActivity requireActivity = this.this$0.requireActivity();
        DiskDebugFragment diskDebugFragment = this.this$0;
        return new DevOptionsPreferenceAdapter(requireActivity, diskDebugFragment.session, diskDebugFragment);
    }
}
