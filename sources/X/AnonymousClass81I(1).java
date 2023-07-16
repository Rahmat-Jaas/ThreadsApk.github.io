package X;

/* renamed from: X.81I  reason: invalid class name */
public final class AnonymousClass81I implements Runnable {
    public final /* synthetic */ C129887my A00;
    public final /* synthetic */ C1202579k A01;

    public AnonymousClass81I(C129887my r1, C1202579k r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void run() {
        C129887my r0 = this.A00;
        synchronized (r0.A01) {
            r0.A00.BrF(this.A01);
        }
    }
}
