package X;

import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.concurrent.TimeUnit;

/* renamed from: X.80o  reason: invalid class name and case insensitive filesystem */
public final class C1358980o implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ AnonymousClass7EY A01;

    public C1358980o(AnonymousClass7EY r1, long j) {
        this.A01 = r1;
        this.A00 = j;
    }

    public final void run() {
        AnonymousClass7EY r0 = this.A01;
        QuickPerformanceLogger quickPerformanceLogger = r0.A01;
        int hashCode = r0.A00.hashCode();
        long j = this.A00;
        AnonymousClass7JC.A03(quickPerformanceLogger, AnonymousClass4WJ.A0A(), TimeUnit.NANOSECONDS, 51511298, hashCode, j, 4);
    }
}
