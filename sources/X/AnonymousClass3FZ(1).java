package X;

import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.3FZ  reason: invalid class name */
public final class AnonymousClass3FZ {
    public final C81914ob A00 = C66953yd.A00;
    public final C33572HqU A01 = new C66963ye();
    public final C36978JiB A02 = C36978JiB.A05.A00();
    public final QuickPerformanceLogger A03;

    public final C84684tg A00(int i, int i2, long j) {
        boolean z;
        boolean z2;
        long j2 = j;
        C81914ob r8 = this.A00;
        long now = r8.now();
        C62093Xc r0 = C62093Xc.A04;
        AtomicLong atomicLong = r0.A03;
        long A002 = AnonymousClass2C2.A00(now, atomicLong.get(), atomicLong.get());
        if (A002 != -1) {
            j2 = A002;
            z = false;
            z2 = false;
        } else if (now - j > 5000) {
            j2 = now - 5000;
            z = true;
            z2 = true;
        } else {
            z = true;
            z2 = false;
        }
        QuickPerformanceLogger quickPerformanceLogger = this.A03;
        C04220Ms.A0A(quickPerformanceLogger);
        C36978JiB jiB = this.A02;
        C31375Gnp gnp = new C31375Gnp(r8, this.A01, jiB, quickPerformanceLogger, r0.A00, i, i2, now, j2, true, true);
        gnp.Bev("using_backup_start_time", z);
        gnp.Bev("using_capped_backup_start_time", z2);
        jiB.A00(gnp);
        return gnp;
    }

    public AnonymousClass3FZ(QuickPerformanceLogger quickPerformanceLogger) {
        this.A03 = quickPerformanceLogger;
    }
}
