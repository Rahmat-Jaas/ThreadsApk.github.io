package X;

import java.io.File;
import java.nio.channels.FileChannel;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.76C  reason: invalid class name */
public final class AnonymousClass76C {
    public static final Map A03 = AnonymousClass0wJ.A0y();
    public FileChannel A00;
    public final File A01;
    public final Lock A02;

    public AnonymousClass76C(File file, String str) {
        File file2;
        Lock lock;
        if (file != null) {
            file2 = C86154wM.A0U(file, AnonymousClass00U.A0L(str, ".lck"));
        } else {
            file2 = null;
        }
        this.A01 = file2;
        Map map = A03;
        synchronized (map) {
            Object obj = map.get(str);
            if (obj == null) {
                obj = new ReentrantLock();
                map.put(str, obj);
            }
            lock = (Lock) obj;
        }
        this.A02 = lock;
    }
}
