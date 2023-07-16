package X;

import java.io.Closeable;

/* renamed from: X.6Vu  reason: invalid class name and case insensitive filesystem */
public final class C102596Vu {
    public static final void A00(Closeable closeable, Throwable th) {
        if (closeable == null) {
            return;
        }
        if (th == null) {
            closeable.close();
            return;
        }
        try {
            closeable.close();
        } catch (Throwable th2) {
            AnonymousClass721.A01(th, th2);
        }
    }
}
