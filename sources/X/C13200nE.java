package X;

import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.0nE  reason: invalid class name and case insensitive filesystem */
public final class C13200nE implements Runnable {
    public C14540pc A00;
    public final /* synthetic */ C12310lg A01;

    public C13200nE(C14540pc r1, C12310lg r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void run() {
        C12310lg r2 = this.A01;
        C12250la r5 = r2.A02;
        C14540pc r7 = this.A00;
        if (r5.A00 == Integer.MAX_VALUE) {
            AnonymousClass0LU.A0C("CounterSession", "Reached max counterEvents probably due to upload failure, clearing old events");
            r5.A04.clear();
            r5.A00 = 0;
        }
        String A0h = AnonymousClass00U.A0h("fbns_counters", "_", r7.A00(), "_", r7.A02);
        Map map = r5.A04;
        if (map.containsKey(A0h)) {
            C14560pf r6 = ((C14540pc) map.get(A0h)).A00;
            C14560pf r72 = r7.A00;
            r6.A00 += r72.A00;
            r6.A02 += r72.A02;
            r6.A01 = Math.max(r6.A01, r72.A01);
        } else {
            map.put(A0h, r7);
        }
        int i = r5.A00 + 1;
        r5.A00 = i;
        if (i >= 50) {
            C12310lg.A04.execute(new C12510m2(r2));
            return;
        }
        AtomicBoolean atomicBoolean = r2.A03;
        if (atomicBoolean.compareAndSet(false, true) && !r2.A00.sendEmptyMessageDelayed(1, 300000)) {
            atomicBoolean.set(false);
        }
    }
}
