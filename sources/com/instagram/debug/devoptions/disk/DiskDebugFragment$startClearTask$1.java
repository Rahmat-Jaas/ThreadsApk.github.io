package com.instagram.debug.devoptions.disk;

import X.C33841Hva;
import java.io.File;
import java.util.List;

public final class DiskDebugFragment$startClearTask$1 implements C33841Hva {
    public final /* synthetic */ List $dirs;
    public final /* synthetic */ DiskDebugFragment this$0;

    public String getName() {
        return "disk_debug_clear";
    }

    public int getRunnableId() {
        return 681;
    }

    public void onCancel() {
    }

    public void onStart() {
    }

    public DiskDebugFragment$startClearTask$1(List list, DiskDebugFragment diskDebugFragment) {
        this.$dirs = list;
        this.this$0 = diskDebugFragment;
    }

    public void onFinish() {
        this.this$0.refreshData();
    }

    public void run() {
        for (File file : this.$dirs) {
            if (file != null) {
                DiskUtils.clearDir(file);
            }
        }
    }
}
