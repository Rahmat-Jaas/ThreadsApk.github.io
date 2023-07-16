package X;

import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* renamed from: X.82K  reason: invalid class name */
public final class AnonymousClass82K implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ AnonymousClass7AT A01;
    public final /* synthetic */ String A02;

    public AnonymousClass82K(AnonymousClass7AT r1, String str, long j) {
        this.A01 = r1;
        this.A00 = j;
        this.A02 = str;
    }

    public final void run() {
        AnonymousClass7AT r0 = this.A01;
        QuickPerformanceLogger quickPerformanceLogger = r0.A01;
        int hashCode = r0.A00.hashCode();
        long j = this.A00;
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        HashMap A0y = AnonymousClass0wJ.A0y();
        A0y.put("error", this.A02);
        AnonymousClass7JC.A03(quickPerformanceLogger, A0y, timeUnit, 906037831, hashCode, j, 3);
    }
}
