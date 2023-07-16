package X;

import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S5001000_I2;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* renamed from: X.80p  reason: invalid class name and case insensitive filesystem */
public final class C1359080p implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ AnonymousClass7EY A01;

    public C1359080p(AnonymousClass7EY r1, long j) {
        this.A01 = r1;
        this.A00 = j;
    }

    public final void run() {
        AnonymousClass7EY r1 = this.A01;
        QuickPerformanceLogger quickPerformanceLogger = r1.A01;
        KtCSuperShape0S5001000_I2 ktCSuperShape0S5001000_I2 = r1.A00;
        int hashCode = ktCSuperShape0S5001000_I2.hashCode();
        long j = this.A00;
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        HashMap A0y = AnonymousClass0wJ.A0y();
        AnonymousClass7E4.A00(ktCSuperShape0S5001000_I2, A0y);
        AnonymousClass7E4.A01(r1.A02, A0y);
        AnonymousClass7JC.A02(quickPerformanceLogger, A0y, timeUnit, 51511298, hashCode, j);
    }
}
