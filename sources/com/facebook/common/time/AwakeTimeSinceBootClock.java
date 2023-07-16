package com.facebook.common.time;

import X.C03710Kk;
import X.C03720Kl;
import android.os.SystemClock;

public class AwakeTimeSinceBootClock implements C03710Kk, C03720Kl {
    public static final AwakeTimeSinceBootClock INSTANCE = new AwakeTimeSinceBootClock();

    public static AwakeTimeSinceBootClock get() {
        return INSTANCE;
    }

    public long now() {
        return SystemClock.uptimeMillis();
    }

    public long nowNanos() {
        return System.nanoTime();
    }
}
