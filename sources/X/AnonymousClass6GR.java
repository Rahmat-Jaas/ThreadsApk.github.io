package X;

import java.io.Closeable;

/* renamed from: X.6GR  reason: invalid class name */
public final class AnonymousClass6GR {
    public static void A00(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception e) {
                AnonymousClass0LU.A0E("AssetFileUtil", "unable to close stream", e);
            }
        }
    }
}
