package com.instagram.debug.devoptions.disk;

import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C06750aI;
import X.C14030oh;
import android.view.View;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

public final class DiskDebugFragment$refreshData$3 implements View.OnClickListener {
    public final /* synthetic */ DiskDebugFragment this$0;

    public DiskDebugFragment$refreshData$3(DiskDebugFragment diskDebugFragment) {
        this.this$0 = diskDebugFragment;
    }

    public final void onClick(View view) {
        int A05 = C14030oh.A05(-740174145);
        ArrayList A0v = AnonymousClass0wJ.A0v();
        File cacheDir = this.this$0.requireActivity().getCacheDir();
        C04220Ms.A06(cacheDir);
        A0v.add(cacheDir);
        File[] externalCacheDirs = this.this$0.requireActivity().getExternalCacheDirs();
        C04220Ms.A06(externalCacheDirs);
        A0v.addAll(C06750aI.A17(Arrays.copyOf(externalCacheDirs, externalCacheDirs.length)));
        this.this$0.startClearTask(A0v);
        C14030oh.A0C(1553583854, A05);
    }
}
