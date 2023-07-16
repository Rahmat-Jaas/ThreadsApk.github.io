package com.instagram.debug.devoptions.disk;

import X.C04220Ms;
import X.C14030oh;
import android.view.View;
import java.io.File;

public final class DiskDebugFragment$refreshData$4 implements View.OnClickListener {
    public final /* synthetic */ DiskDebugFragment this$0;

    public DiskDebugFragment$refreshData$4(DiskDebugFragment diskDebugFragment) {
        this.this$0 = diskDebugFragment;
    }

    public final void onClick(View view) {
        int A05 = C14030oh.A05(1737153287);
        DiskDebugFragment diskDebugFragment = this.this$0;
        File filesDir = diskDebugFragment.requireActivity().getFilesDir();
        C04220Ms.A06(filesDir);
        diskDebugFragment.startWriteTask(filesDir);
        C14030oh.A0C(-575669947, A05);
    }
}
