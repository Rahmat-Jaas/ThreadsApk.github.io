package X;

import java.util.concurrent.CountDownLatch;

/* renamed from: X.7di  reason: invalid class name and case insensitive filesystem */
public final class C125657di implements C143288gT {
    public CountDownLatch A00 = new CountDownLatch(1);
    public boolean A01 = true;

    public final synchronized void C3z(boolean z) {
        this.A01 = z;
        this.A00.countDown();
    }
}
