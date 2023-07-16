package X;

import android.hardware.Camera;
import java.util.List;
import java.util.concurrent.locks.ReadWriteLock;

/* renamed from: X.0od  reason: invalid class name and case insensitive filesystem */
public final class C13990od {
    static {
        AnonymousClass0D8.A03 = true;
    }

    public static void A00(Camera camera) {
        camera.release();
        if (AnonymousClass0D8.A04()) {
            AnonymousClass0D8.A01(camera);
        }
    }

    public static void A01(Camera camera) {
        camera.startPreview();
        if (AnonymousClass0D8.A04()) {
            try {
                ReadWriteLock readWriteLock = AnonymousClass0D8.A02;
                readWriteLock.readLock().lock();
                List list = AnonymousClass0D8.A01;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    ((AnonymousClass0D7) list.get(i)).CM3(camera);
                }
                readWriteLock.readLock().unlock();
            } catch (Throwable th) {
                AnonymousClass0D8.A02.readLock().unlock();
                throw th;
            }
        }
    }

    public static void A02(Camera camera) {
        camera.stopPreview();
        if (AnonymousClass0D8.A04()) {
            try {
                ReadWriteLock readWriteLock = AnonymousClass0D8.A02;
                readWriteLock.readLock().lock();
                List list = AnonymousClass0D8.A01;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    ((AnonymousClass0D7) list.get(i)).CMZ(camera);
                }
                readWriteLock.readLock().unlock();
            } catch (Throwable th) {
                AnonymousClass0D8.A02.readLock().unlock();
                throw th;
            }
        }
    }
}
