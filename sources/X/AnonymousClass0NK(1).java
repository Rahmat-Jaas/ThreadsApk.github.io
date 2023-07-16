package X;

import java.util.concurrent.CountDownLatch;

/* renamed from: X.0NK  reason: invalid class name */
public final class AnonymousClass0NK implements AnonymousClass0CK {
    public final CountDownLatch A00 = new CountDownLatch(1);
    public volatile boolean A01;

    public final void CV4(boolean z) {
        this.A01 = z;
        this.A00.countDown();
    }
}
