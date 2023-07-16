package X;

import java.lang.ref.ReferenceQueue;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.0c8  reason: invalid class name and case insensitive filesystem */
public final class C07760c8 {
    public static final AtomicInteger A09 = new AtomicInteger(0);
    public AnonymousClass0Si A00;
    public AnonymousClass0Sn A01;
    public ReferenceQueue A02;
    public final C05280Sk A03;
    public final AnonymousClass0Sm A04;
    public final Set A05 = new HashSet();
    public final boolean A06;
    public final long[] A07 = new long[1];
    public final String[] A08 = new String[1];

    public final void A00() {
        ReferenceQueue referenceQueue = new ReferenceQueue();
        this.A02 = referenceQueue;
        AnonymousClass0Sn r0 = new AnonymousClass0Sn(this, referenceQueue, A09.getAndIncrement());
        this.A01 = r0;
        r0.start();
        AnonymousClass0Si r02 = new AnonymousClass0Si(this);
        this.A00 = r02;
        r02.start();
    }

    public void allocationCallback(Object obj, long j, String str) {
        Object r0;
        if (obj == null) {
            long[] jArr = this.A07;
            jArr[0] = j;
            C05280Sk r2 = this.A03;
            String[] strArr = this.A08;
            r2.onDeallocation(jArr, strArr, 1);
            strArr[0] = null;
            return;
        }
        ReferenceQueue referenceQueue = this.A02;
        if (referenceQueue != null) {
            Long valueOf = Long.valueOf(j);
            if (this.A06) {
                r0 = new C07750c7(obj, valueOf, referenceQueue);
            } else {
                r0 = new C07740c6(obj, valueOf, referenceQueue);
            }
            Set set = this.A05;
            synchronized (set) {
                set.add(r0);
            }
        }
    }

    public C07760c8(C05280Sk r3, AnonymousClass0Sm r4, boolean z) {
        this.A03 = r3;
        this.A04 = r4;
        this.A06 = z;
    }
}
