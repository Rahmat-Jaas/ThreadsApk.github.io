package X;

import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4001000_I2;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* renamed from: X.80l  reason: invalid class name and case insensitive filesystem */
public final class C1358680l implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ AnonymousClass7AT A01;

    public C1358680l(AnonymousClass7AT r1, long j) {
        this.A01 = r1;
        this.A00 = j;
    }

    public final void run() {
        AnonymousClass7AT r0 = this.A01;
        QuickPerformanceLogger quickPerformanceLogger = r0.A01;
        KtCSuperShape0S4001000_I2 ktCSuperShape0S4001000_I2 = r0.A00;
        int hashCode = ktCSuperShape0S4001000_I2.hashCode();
        long j = this.A00;
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        HashMap A0y = AnonymousClass0wJ.A0y();
        C1193374s.A00(ktCSuperShape0S4001000_I2, A0y);
        AnonymousClass7JC.A02(quickPerformanceLogger, A0y, timeUnit, 906037831, hashCode, j);
    }
}
