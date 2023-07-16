package com.instagram.debug.devoptions.disk;

import X.C33841Hva;
import java.io.File;

public final class DiskDebugFragment$startWriteTask$1 implements C33841Hva {
    public final /* synthetic */ File $dir;
    public final /* synthetic */ DiskDebugFragment this$0;

    public String getName() {
        return "disk_debug_write";
    }

    public int getRunnableId() {
        return 681;
    }

    public void onCancel() {
    }

    public void onStart() {
    }

    public DiskDebugFragment$startWriteTask$1(File file, DiskDebugFragment diskDebugFragment) {
        this.$dir = file;
        this.this$0 = diskDebugFragment;
    }

    public void onFinish() {
        this.this$0.refreshData();
    }

    public void run() {
        DiskUtils.writeRandomData(this.$dir);
    }
}
