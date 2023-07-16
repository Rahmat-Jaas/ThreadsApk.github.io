package X;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.0W1  reason: invalid class name */
public final class AnonymousClass0W1 {
    public int A00;
    public int A01;
    public long A02;
    public C12020lB A03;
    public final AnonymousClass0WD A04;
    public final AnonymousClass08V A05 = new C12420ls();

    public static boolean A00(AnonymousClass0WW r3, C09350fH r4) {
        if (r4 == null) {
            return false;
        }
        if (r4.A0Q) {
            return true;
        }
        if (r3.A06(r4.A0H, r4.getMarkerId(), r4.A01)) {
            return true;
        }
        return false;
    }

    public final C09350fH A01(int i) {
        ReentrantLock reentrantLock = this.A04.A01;
        reentrantLock.lock();
        try {
            return (C09350fH) this.A05.valueAt(i);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final C09350fH A02(long j) {
        ReentrantLock reentrantLock = this.A04.A01;
        reentrantLock.lock();
        try {
            AnonymousClass08V r1 = this.A05;
            C09350fH r0 = (C09350fH) r1.get(j);
            if (r0 != null) {
                r1.remove(j);
            }
            return r0;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final C09350fH A03(AnonymousClass0WA r3, long j) {
        AnonymousClass0WD r1 = this.A04;
        r1.A00(r3);
        try {
            return (C09350fH) this.A05.get(j);
        } finally {
            r1.A01(r3);
        }
    }

    /* JADX INFO: finally extract failed */
    public final void A04(C09350fH r12, long j) {
        int i;
        C12020lB r0;
        ReentrantLock reentrantLock = this.A04.A01;
        reentrantLock.lock();
        try {
            AnonymousClass08V r2 = this.A05;
            r2.put(j, r12);
            if (this.A03 != null) {
                int i2 = this.A00 + 1;
                this.A00 = i2;
                if (i2 >= this.A01) {
                    this.A00 = 0;
                    i = r2.size();
                    reentrantLock.unlock();
                    r0 = this.A03;
                    if (r0 != null && i >= 0) {
                        long j2 = this.A02;
                        C09300fC r4 = r0.A00;
                        if (C09300fC.A04(r4)) {
                            C09350fH A012 = C09300fC.A01(r4, TimeUnit.MILLISECONDS, 27791726, (long) i, j2);
                            A012.A8X("type", "MARKER_COUNT");
                            A012.A03("marker_count", i);
                            r4.A00.execute(A012);
                            r4.A02.set(false);
                            return;
                        }
                        return;
                    }
                }
            }
            i = -1;
            reentrantLock.unlock();
            r0 = this.A03;
            if (r0 != null) {
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final boolean A05(AnonymousClass0WA r3, AnonymousClass0WW r4, long j) {
        AnonymousClass0WD r1 = this.A04;
        r1.A00(r3);
        try {
            return A00(r4, (C09350fH) this.A05.get(j));
        } finally {
            r1.A01(r3);
        }
    }

    public AnonymousClass0W1(AnonymousClass0WD r2) {
        this.A04 = r2;
    }
}
