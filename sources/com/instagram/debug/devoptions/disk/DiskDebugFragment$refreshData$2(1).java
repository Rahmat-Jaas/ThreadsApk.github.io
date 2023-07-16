package com.instagram.debug.devoptions.disk;

import X.C04220Ms;
import X.C14030oh;
import android.view.View;
import java.io.File;

public final class DiskDebugFragment$refreshData$2 implements View.OnClickListener {
    public final /* synthetic */ DiskDebugFragment this$0;

    public DiskDebugFragment$refreshData$2(DiskDebugFragment diskDebugFragment) {
        this.this$0 = diskDebugFragment;
    }

    public final void onClick(View view) {
        int A05 = C14030oh.A05(-601959376);
        DiskDebugFragment diskDebugFragment = this.this$0;
        File cacheDir = diskDebugFragment.requireActivity().getCacheDir();
        C04220Ms.A06(cacheDir);
        diskDebugFragment.startWriteTask(cacheDir);
        C14030oh.A0C(1525498923, A05);
    }
}
