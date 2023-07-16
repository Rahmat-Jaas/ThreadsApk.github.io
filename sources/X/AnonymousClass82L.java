package X;

import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.82L  reason: invalid class name */
public final class AnonymousClass82L implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C109736kX A01;
    public final /* synthetic */ Map A02;

    public AnonymousClass82L(C109736kX r1, Map map, long j) {
        this.A01 = r1;
        this.A00 = j;
        this.A02 = map;
    }

    public final void run() {
        C109736kX r0 = this.A01;
        QuickPerformanceLogger quickPerformanceLogger = r0.A02;
        int hashCode = r0.A01.hashCode();
        long j = this.A00;
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        AnonymousClass7JC.A02(quickPerformanceLogger, this.A02, timeUnit, 906040838, hashCode, j);
        AnonymousClass7JC.A03(quickPerformanceLogger, AnonymousClass4WJ.A0A(), timeUnit, 906040838, hashCode, j, 2);
    }
}
