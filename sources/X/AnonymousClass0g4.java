package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.Map;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.0g4  reason: invalid class name */
public final class AnonymousClass0g4 implements RejectedExecutionHandler {
    public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        AnonymousClass0g3 r11 = (AnonymousClass0g3) threadPoolExecutor;
        synchronized (r11) {
            StringBuilder sb = new StringBuilder();
            Map map = r11.A01;
            int i = 0;
            int i2 = 0;
            for (Map.Entry entry : map.entrySet()) {
                int intValue = ((Integer) entry.getKey()).intValue();
                int i3 = ((AtomicInteger) entry.getValue()).get();
                if (sb.length() > 0) {
                    sb.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
                }
                sb.append(intValue);
                if (i3 > i2) {
                    i2 = i3;
                    i = intValue;
                }
            }
            AnonymousClass0gN.A00().AKp(new C11960l5(r11, sb, i));
            r11.A00 = false;
            map.clear();
        }
    }
}
