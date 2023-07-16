package X;

import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.749  reason: invalid class name */
public final class AnonymousClass749 {
    public static final Map A00 = AnonymousClass0wJ.A0y();
    public static final Map A01 = AnonymousClass0wJ.A0y();
    public static final ReentrantReadWriteLock A02 = new ReentrantReadWriteLock();

    public static final void A00(String str) {
        ReentrantReadWriteLock.ReadLock readLock = A02.readLock();
        C04220Ms.A06(readLock);
        readLock.lock();
        try {
            C1196176d r0 = (C1196176d) A00.get(str);
            if (r0 != null) {
                C109326jp r2 = r0.A04;
                C61043Rr.A00(r0.A00, C63893iY.A01, r2);
            }
        } finally {
            readLock.unlock();
        }
    }
}
