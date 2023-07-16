package X;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.logging.Level;

/* renamed from: X.7y4  reason: invalid class name and case insensitive filesystem */
public final class C134627y4 implements Closeable {
    public AnonymousClass7HU A00;
    public final URL A01;
    public volatile InputStream A02;

    public final void close() {
        InputStream inputStream = this.A02;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e) {
                try {
                    AnonymousClass73M.A00.logp(Level.WARNING, "com.google.common.io.Closeables", "close", C28174Ezk.A00(369), e);
                } catch (IOException e2) {
                    throw new AssertionError(e2);
                }
            }
        }
    }

    public C134627y4(URL url) {
        this.A01 = url;
    }
}
