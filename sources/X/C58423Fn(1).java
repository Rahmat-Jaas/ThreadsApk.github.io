package X;

import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.3Fn  reason: invalid class name and case insensitive filesystem */
public final class C58423Fn {
    public final C81914ob A00;
    public final C33572HqU A01;
    public final C36978JiB A02 = C36978JiB.A05.A00();
    public final QuickPerformanceLogger A03;
    public final ConcurrentHashMap A04;

    public final C84684tg A00(int i) {
        int i2;
        int intValue;
        C81914ob r4 = this.A00;
        r4.now();
        long now = r4.now();
        C62093Xc r2 = C62093Xc.A04;
        long A002 = AnonymousClass2C2.A00(now, r2.A03.get(), r2.A02.get());
        synchronized (this) {
            ConcurrentHashMap concurrentHashMap = this.A04;
            i2 = i;
            Integer valueOf = Integer.valueOf(i2);
            Integer num = (Integer) concurrentHashMap.get(valueOf);
            if (num == null) {
                num = C18220wO.A0d();
            }
            intValue = num.intValue() + 1;
            concurrentHashMap.put(valueOf, Integer.valueOf(intValue));
        }
        QuickPerformanceLogger quickPerformanceLogger = this.A03;
        C36978JiB jiB = this.A02;
        C31375Gnp gnp = new C31375Gnp(r4, this.A01, jiB, quickPerformanceLogger, "Remote Presence", i2, intValue, r4.now(), A002, true, false);
        jiB.A00(gnp);
        return gnp;
    }

    public C58423Fn(QuickPerformanceLogger quickPerformanceLogger, C36962Ti r3) {
        this.A03 = quickPerformanceLogger;
        this.A01 = new C66973yf(r3);
        this.A00 = new C66943yc();
        this.A04 = new ConcurrentHashMap();
    }
}
