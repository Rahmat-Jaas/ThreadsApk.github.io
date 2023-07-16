package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.4G0  reason: invalid class name */
public final class AnonymousClass4G0 implements C82884qQ {
    public final long A00;

    public AnonymousClass4G0(int i) {
        this.A00 = TimeUnit.SECONDS.toMillis((long) i);
    }

    public final boolean CW4(C58743Gz r6) {
        return C18180wK.A1X(((System.currentTimeMillis() - r6.A01(AnonymousClass006.A00)) > this.A00 ? 1 : ((System.currentTimeMillis() - r6.A01(AnonymousClass006.A00)) == this.A00 ? 0 : -1)));
    }
}
