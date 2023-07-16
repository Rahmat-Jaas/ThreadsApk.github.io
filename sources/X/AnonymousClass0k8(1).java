package X;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.0k8  reason: invalid class name */
public final class AnonymousClass0k8 {
    public static final int[][] A05 = {new int[]{3, 2, 1, 1, 1}, new int[]{9, 10, 11, 12, 19}};
    public final List A00 = new ArrayList();
    public final List A01 = new ArrayList();
    public final AtomicInteger A02 = new AtomicInteger(0);
    public final int[] A03;
    public final AnonymousClass0DQ A04 = AnonymousClass0DQ.A01;

    public AnonymousClass0k8(AnonymousClass0gM r12, List list, int[] iArr, int[] iArr2) {
        this.A03 = iArr;
        int i = 1;
        do {
            this.A01.add(new ConcurrentLinkedQueue());
            this.A00.add(new ConcurrentLinkedQueue());
            i++;
        } while (i <= 5);
        C09710fy r3 = new C09710fy(r12);
        r3.start();
        boolean z = r12.A06;
        int i2 = 1;
        do {
            int i3 = i2 - 1;
            int i4 = this.A03[i3];
            int i5 = iArr2[i3];
            for (int i6 = 0; i6 < i4; i6++) {
                AnonymousClass0g0 r5 = new AnonymousClass0g0(this, list, i2, i5, z);
                this.A02.incrementAndGet();
                r5.start();
                r3.A02.add(r5);
            }
            i2++;
        } while (i2 <= 5);
    }

    public final int A00() {
        int i = 0;
        int i2 = 0;
        while (true) {
            List list = this.A00;
            if (i >= list.size()) {
                return i2;
            }
            i2 += ((AbstractCollection) list.get(i)).size();
            i++;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001c, code lost:
        if (r4 == null) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass0gG A01(java.util.List r8, java.util.List r9, java.util.concurrent.atomic.AtomicInteger r10, int[] r11, int r12) {
        /*
            r7 = this;
            r4 = 0
            r6 = 1
            r5 = 1
        L_0x0003:
            if (r5 != r12) goto L_0x0049
            int r2 = r5 + -1
            r1 = r11[r2]
            int r0 = r10.get()
            int r0 = r0 - r6
            if (r1 <= r0) goto L_0x0049
            java.lang.Object r0 = r8.get(r2)
            java.util.concurrent.ConcurrentLinkedQueue r0 = (java.util.concurrent.ConcurrentLinkedQueue) r0
            java.lang.Object r4 = r0.poll()
            X.0gG r4 = (X.AnonymousClass0gG) r4
            if (r4 != 0) goto L_0x0049
        L_0x001e:
            int r5 = r5 + 1
            r0 = 5
            if (r5 <= r0) goto L_0x0003
            return r4
        L_0x0024:
            java.lang.Object r0 = r8.get(r2)
            java.util.concurrent.ConcurrentLinkedQueue r0 = (java.util.concurrent.ConcurrentLinkedQueue) r0
            java.lang.Object r3 = r0.poll()
            X.0gG r3 = (X.AnonymousClass0gG) r3
            if (r3 == 0) goto L_0x0078
            X.0gG r0 = r1.A06
            if (r0 == 0) goto L_0x003d
            java.lang.String r2 = "RUNNABLE_DIRTY"
            java.lang.String r0 = "Worker shouldn't execute a new task because it is still busy with another task."
            X.C10450iM.A03(r2, r0)
        L_0x003d:
            r10.incrementAndGet()
            X.0gG r0 = X.C09690fw.A00(r3)
            r1.A06 = r0
            java.util.concurrent.locks.LockSupport.unpark(r1)
        L_0x0049:
            r3 = -1
            if (r12 == r5) goto L_0x0076
            if (r12 == r3) goto L_0x0076
        L_0x004e:
            int r2 = r5 - r6
            r1 = r11[r2]
            int r0 = r10.get()
            int r0 = r0 + r3
            if (r1 <= r0) goto L_0x001e
            java.lang.Object r0 = r8.get(r2)
            java.util.AbstractCollection r0 = (java.util.AbstractCollection) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x001e
            int r2 = r5 + -1
            java.lang.Object r0 = r9.get(r2)
            java.util.concurrent.ConcurrentLinkedQueue r0 = (java.util.concurrent.ConcurrentLinkedQueue) r0
            java.lang.Object r1 = r0.poll()
            X.0g0 r1 = (X.AnonymousClass0g0) r1
            if (r1 == 0) goto L_0x001e
            goto L_0x0024
        L_0x0076:
            r3 = 0
            goto L_0x004e
        L_0x0078:
            java.lang.Object r0 = r9.get(r2)
            java.util.AbstractCollection r0 = (java.util.AbstractCollection) r0
            r0.add(r1)
            goto L_0x001e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0k8.A01(java.util.List, java.util.List, java.util.concurrent.atomic.AtomicInteger, int[], int):X.0gG");
    }
}
