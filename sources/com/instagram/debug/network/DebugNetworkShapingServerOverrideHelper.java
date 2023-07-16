package com.instagram.debug.network;

import X.C04220Ms;
import X.C10300i6;
import com.instagram.debug.network.L;
import java.util.Calendar;

public final class DebugNetworkShapingServerOverrideHelper {
    public static final DebugNetworkShapingServerOverrideHelper INSTANCE = new DebugNetworkShapingServerOverrideHelper();

    public static final long getSleepPerChunkOverride(C10300i6 r1) {
        C04220Ms.A0B(r1, 0);
        if (!INSTANCE.isDayEnabled(r1)) {
            return 0;
        }
        return L.ig_android_slow_network_debug_tool_config.sleep_time_per_chunk.getAndExpose(r1).longValue();
    }

    private final boolean isDayEnabled(C10300i6 r4) {
        int longValue = (int) L.ig_android_slow_network_debug_tool_config.days_of_week.getAndExpose(r4).longValue();
        int i = 1 << Calendar.getInstance().get(7);
        if ((longValue & i) != i) {
            return false;
        }
        return true;
    }
}
