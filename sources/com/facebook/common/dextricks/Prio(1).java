package com.facebook.common.dextricks;

import com.facebook.forker.Process;
import java.io.Closeable;

public final class Prio {
    public final int cpuPriority;
    public final int ioPriority;

    public final class With implements Closeable {
        public final int savedCpuPriority = Process.WAIT_RESULT_TIMEOUT;
        public final int savedIoPriority = Process.WAIT_RESULT_TIMEOUT;

        public With() {
        }

        public void close() {
            int i = this.savedIoPriority;
            if (i != Integer.MIN_VALUE) {
                DalvikInternals.ioprio_set(1, 0, i);
            }
            if (this.savedCpuPriority != Integer.MIN_VALUE) {
                android.os.Process.setThreadPriority(android.os.Process.myTid(), this.savedCpuPriority);
            }
        }
    }

    public static Prio lowest() {
        return new Prio(DalvikInternals.IOPRIO_BACKGROUND, 19);
    }

    public static Prio unchanged() {
        return new Prio(Process.WAIT_RESULT_TIMEOUT, Process.WAIT_RESULT_TIMEOUT);
    }

    public Prio ioOnly() {
        return new Prio(this.ioPriority, Process.WAIT_RESULT_TIMEOUT);
    }

    public boolean isDefault() {
        if (this.ioPriority >= 0 || this.cpuPriority >= 0) {
            return false;
        }
        return true;
    }

    public With with() {
        return new With();
    }

    public Prio(int i, int i2) {
        this.ioPriority = i;
        this.cpuPriority = i2;
    }
}
