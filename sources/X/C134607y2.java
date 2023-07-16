package X;

import java.io.Closeable;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.7y2  reason: invalid class name and case insensitive filesystem */
public class C134607y2 implements Closeable {
    public final ConcurrentHashMap A00 = new ConcurrentHashMap();

    public final void close() {
        ConcurrentHashMap concurrentHashMap = this.A00;
        Iterator A0u = C18190wL.A0u(concurrentHashMap);
        while (A0u.hasNext()) {
            ((C134647y7) C18180wK.A0o(A0u).getValue()).close();
        }
        concurrentHashMap.clear();
    }
}
