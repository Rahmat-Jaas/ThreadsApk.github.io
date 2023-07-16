package X;

import java.io.Closeable;
import java.util.concurrent.CancellationException;

/* renamed from: X.7y7  reason: invalid class name and case insensitive filesystem */
public abstract class C134647y7 implements Closeable, AnonymousClass0i1 {
    public final String A00;
    public final C83224qz A01;

    public final void close() {
        AnonymousClass7Ja.A05((CancellationException) null, this.A01);
    }

    public C134647y7(String str, C83224qz r2) {
        this.A01 = r2;
        this.A00 = str;
    }

    public void onUserSessionWillEnd(boolean z) {
        close();
    }
}
