package X;

import java.util.List;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.0D8  reason: invalid class name */
public final class AnonymousClass0D8 {
    public static final C02350Au A00 = new C02350Au();
    public static final List A01 = new AnonymousClass0D6();
    public static final ReadWriteLock A02 = new ReentrantReadWriteLock();
    public static volatile boolean A03;

    public static void A00(AnonymousClass0D7 r2) {
        try {
            ReadWriteLock readWriteLock = A02;
            readWriteLock.writeLock().lock();
            A01.add(r2);
            readWriteLock.writeLock().unlock();
        } catch (Throwable th) {
            A02.writeLock().unlock();
            throw th;
        }
    }

    public static void A01(Object obj) {
        try {
            ReadWriteLock readWriteLock = A02;
            readWriteLock.readLock().lock();
            List list = A01;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((AnonymousClass0D7) list.get(i)).CFL(obj);
            }
            readWriteLock.readLock().unlock();
        } catch (Throwable th) {
            A02.readLock().unlock();
            throw th;
        }
    }

    public static void A02(Object obj) {
        try {
            ReadWriteLock readWriteLock = A02;
            readWriteLock.readLock().lock();
            List list = A01;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((AnonymousClass0D7) list.get(i)).Bwh(obj);
            }
            readWriteLock.readLock().unlock();
        } catch (Throwable th) {
            A02.readLock().unlock();
            throw th;
        }
    }

    public static void A03(Object obj) {
        try {
            ReadWriteLock readWriteLock = A02;
            readWriteLock.readLock().lock();
            List list = A01;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((AnonymousClass0D7) list.get(i)).C9U(obj);
            }
            readWriteLock.readLock().unlock();
        } catch (Throwable th) {
            A02.readLock().unlock();
            throw th;
        }
    }

    public static boolean A04() {
        if (!A03 || A01.isEmpty()) {
            return false;
        }
        return true;
    }
}
