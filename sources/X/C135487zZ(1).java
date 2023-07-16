package X;

/* renamed from: X.7zZ  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C135487zZ implements Runnable {
    public final AnonymousClass7M4 A00;

    public C135487zZ(AnonymousClass7M4 r1) {
        this.A00 = r1;
    }

    public final void run() {
        AnonymousClass7M4 r2 = this.A00;
        synchronized (r2) {
            if (r2.A01 == 1) {
                r2.A01(1, "Timed out while binding");
            }
        }
    }
}
