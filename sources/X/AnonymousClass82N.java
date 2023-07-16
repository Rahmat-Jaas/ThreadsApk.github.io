package X;

import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.82N  reason: invalid class name */
public final class AnonymousClass82N implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ AnonymousClass7EY A01;
    public final /* synthetic */ String A02;

    public AnonymousClass82N(AnonymousClass7EY r1, String str, long j) {
        this.A01 = r1;
        this.A00 = j;
        this.A02 = str;
    }

    public final void run() {
        AnonymousClass7EY r0 = this.A01;
        QuickPerformanceLogger quickPerformanceLogger = r0.A01;
        int hashCode = r0.A00.hashCode();
        long j = this.A00;
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        Map map = new AnonymousClass7E4().A00;
        map.put("error", "general_error");
        String str = this.A02;
        C04220Ms.A0B(str, 0);
        map.put("error_msg", str);
        AnonymousClass7JC.A03(quickPerformanceLogger, map, timeUnit, 51511298, hashCode, j, 3);
    }
}
