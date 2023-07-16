package X;

/* renamed from: X.0Vs  reason: invalid class name and case insensitive filesystem */
public final class C05750Vs {
    public int A00 = 0;
    public int A01 = 0;
    public int A02 = 0;
    public final AnonymousClass0Vq[] A03 = new AnonymousClass0Vq[128];

    public final synchronized void A00(AnonymousClass0Vq r7) {
        IllegalStateException th;
        synchronized (this) {
            AnonymousClass0Vq[] r4 = this.A03;
            int length = r4.length;
            if (length != 0) {
                int i = this.A00;
                if (i == length) {
                    try {
                        int i2 = this.A01;
                        r4[i2] = null;
                        this.A01 = (i2 + 1) % length;
                        i--;
                        this.A00 = i;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                if (i < length) {
                    int i3 = this.A02;
                    r4[i3] = r7;
                    this.A02 = (i3 + 1) % length;
                    this.A00 = i + 1;
                } else {
                    th = new IllegalStateException("Overflow");
                    throw th;
                }
            }
        }
    }
}
