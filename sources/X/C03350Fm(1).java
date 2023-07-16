package X;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Semaphore;

/* renamed from: X.0Fm  reason: invalid class name and case insensitive filesystem */
public final class C03350Fm {
    public Map A00 = new HashMap();

    public static synchronized void A00(C03350Fm r3, Object obj) {
        synchronized (r3) {
            Map map = r3.A00;
            C03340Fl r1 = (C03340Fl) map.get(obj);
            AnonymousClass0SJ.A00(r1);
            int i = r1.A00 - 1;
            r1.A00 = i;
            if (i == 0) {
                map.remove(obj);
            }
        }
    }

    public final synchronized void A01(Object obj) {
        C03340Fl r0 = (C03340Fl) this.A00.get(obj);
        AnonymousClass0SJ.A00(r0);
        Semaphore semaphore = r0.A01;
        boolean z = false;
        if (semaphore.availablePermits() == 0) {
            z = true;
        }
        AnonymousClass0SJ.A02(z);
        semaphore.release();
        A00(this, obj);
    }
}
