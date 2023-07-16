package com.instagram.debug.devoptions.disk;

import X.C14030oh;
import X.C18180wK;
import android.view.View;
import java.io.File;

public final class DiskDebugFragment$refreshData$5 implements View.OnClickListener {
    public final /* synthetic */ DiskDebugFragment this$0;

    public DiskDebugFragment$refreshData$5(DiskDebugFragment diskDebugFragment) {
        this.this$0 = diskDebugFragment;
    }

    public final void onClick(View view) {
        int A05 = C14030oh.A05(-1901737613);
        this.this$0.startClearTask(C18180wK.A0n(new File(this.this$0.requireActivity().getFilesDir(), "dummy")));
        C14030oh.A0C(223479953, A05);
    }
}
