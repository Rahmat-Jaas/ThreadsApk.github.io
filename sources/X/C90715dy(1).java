package X;

import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.Set;

/* renamed from: X.5dy  reason: invalid class name and case insensitive filesystem */
public final class C90715dy extends C12270lc {
    public C90715dy(QuickPerformanceLogger quickPerformanceLogger) {
        super(quickPerformanceLogger, false, true);
    }

    public final int[] A03() {
        int[] iArr;
        synchronized (this) {
            Set<Long> set = this.A02;
            iArr = new int[set.size()];
            int i = 0;
            for (Long longValue : set) {
                iArr[i] = (int) longValue.longValue();
                i++;
            }
        }
        return iArr;
    }
}
