package X;

import java.util.LinkedHashMap;
import java.util.Locale;

/* renamed from: X.00v  reason: invalid class name */
public class AnonymousClass00v {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public final LinkedHashMap A06 = new LinkedHashMap(0, 0.75f, true);

    public int A01(Object obj, Object obj2) {
        return 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0047, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A04(int r5) {
        /*
            r4 = this;
        L_0x0000:
            monitor-enter(r4)
            int r2 = r4.A05     // Catch:{ all -> 0x005c }
            if (r2 < 0) goto L_0x0048
            java.util.LinkedHashMap r1 = r4.A06     // Catch:{ all -> 0x005c }
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x005c }
            if (r0 == 0) goto L_0x000f
            if (r2 != 0) goto L_0x0048
        L_0x000f:
            if (r2 <= r5) goto L_0x0046
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x005c }
            if (r0 != 0) goto L_0x0046
            java.util.Set r0 = r1.entrySet()     // Catch:{ all -> 0x005c }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x005c }
            java.lang.Object r0 = r0.next()     // Catch:{ all -> 0x005c }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ all -> 0x005c }
            java.lang.Object r3 = r0.getKey()     // Catch:{ all -> 0x005c }
            java.lang.Object r2 = r0.getValue()     // Catch:{ all -> 0x005c }
            r1.remove(r3)     // Catch:{ all -> 0x005c }
            int r1 = r4.A05     // Catch:{ all -> 0x005c }
            int r0 = r4.A00(r3, r2)     // Catch:{ all -> 0x005c }
            int r1 = r1 - r0
            r4.A05 = r1     // Catch:{ all -> 0x005c }
            int r0 = r4.A00     // Catch:{ all -> 0x005c }
            r1 = 1
            int r0 = r0 + 1
            r4.A00 = r0     // Catch:{ all -> 0x005c }
            monitor-exit(r4)     // Catch:{ all -> 0x005c }
            r0 = 0
            r4.A06(r1, r3, r2, r0)
            goto L_0x0000
        L_0x0046:
            monitor-exit(r4)     // Catch:{ all -> 0x005c }
            return
        L_0x0048:
            java.lang.Class r0 = r4.getClass()     // Catch:{ all -> 0x005c }
            java.lang.String r1 = r0.getName()     // Catch:{ all -> 0x005c }
            java.lang.String r0 = ".sizeOf() is reporting inconsistent results!"
            java.lang.String r1 = X.AnonymousClass00U.A0L(r1, r0)     // Catch:{ all -> 0x005c }
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x005c }
            r0.<init>(r1)     // Catch:{ all -> 0x005c }
            throw r0     // Catch:{ all -> 0x005c }
        L_0x005c:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x005c }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass00v.A04(int):void");
    }

    public void A06(boolean z, Object obj, Object obj2, Object obj3) {
    }

    public final synchronized String toString() {
        int i;
        int i2;
        int i3;
        i = this.A01;
        i2 = this.A03;
        int i4 = i2 + i;
        if (i4 != 0) {
            i3 = (i * 100) / i4;
        } else {
            i3 = 0;
        }
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", new Object[]{Integer.valueOf(this.A02), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
    }

    public final Object A02(Object obj) {
        if (obj != null) {
            synchronized (this) {
                Object obj2 = this.A06.get(obj);
                if (obj2 != null) {
                    this.A01++;
                    return obj2;
                }
                this.A03++;
                return null;
            }
        }
        throw new NullPointerException("key == null");
    }

    public final Object A03(Object obj) {
        Object remove;
        if (obj != null) {
            synchronized (this) {
                remove = this.A06.remove(obj);
                if (remove != null) {
                    this.A05 -= A00(obj, remove);
                }
            }
            if (remove != null) {
                A06(false, obj, remove, (Object) null);
            }
            return remove;
        }
        throw new NullPointerException("key == null");
    }

    public final void A05(Object obj, Object obj2) {
        Object put;
        if (obj == null || obj2 == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            this.A04++;
            this.A05 += A00(obj, obj2);
            put = this.A06.put(obj, obj2);
            if (put != null) {
                this.A05 -= A00(obj, put);
            }
        }
        if (put != null) {
            A06(false, obj, put, obj2);
        }
        A04(this.A02);
    }

    public AnonymousClass00v(int i) {
        this.A02 = i;
    }

    private int A00(Object obj, Object obj2) {
        int A012 = A01(obj, obj2);
        if (A012 >= 0) {
            return A012;
        }
        StringBuilder sb = new StringBuilder("Negative size: ");
        sb.append(obj);
        sb.append("=");
        sb.append(obj2);
        throw new IllegalStateException(sb.toString());
    }
}
