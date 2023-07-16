package X;

import java.io.File;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.0Y6  reason: invalid class name */
public final class AnonymousClass0Y6 {
    public int A00;
    public long A01;
    public long A02;
    public final long A03;
    public final File A04;
    public final Condition A05;
    public final Lock A06;
    public final boolean A07;

    public static String A00(String str) {
        int indexOf = str.indexOf(61);
        if (indexOf == -1 || indexOf == str.length() - 1) {
            return "";
        }
        return str.substring(indexOf + 1);
    }

    public final void A01(int i) {
        Lock lock = this.A06;
        lock.lock();
        try {
            if (this.A02 == 0 || this.A00 == 1) {
                this.A02 = System.currentTimeMillis();
                this.A00 = i;
            }
            this.A05.signalAll();
        } finally {
            lock.unlock();
        }
    }

    public AnonymousClass0Y6(File file, long j, long j2, boolean z) {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.A06 = reentrantLock;
        this.A05 = reentrantLock.newCondition();
        this.A03 = j2;
        this.A01 = j;
        this.A04 = new File(file, "cache");
        this.A07 = z;
    }
}
