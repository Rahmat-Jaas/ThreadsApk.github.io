package com.facebook.common.time;

import X.C03710Kk;
import android.os.SystemClock;

public class RealtimeSinceBootClock implements C03710Kk {
    public static final RealtimeSinceBootClock A00 = new RealtimeSinceBootClock();

    public static RealtimeSinceBootClock get() {
        return A00;
    }

    public final long now() {
        return SystemClock.elapsedRealtime();
    }
}
