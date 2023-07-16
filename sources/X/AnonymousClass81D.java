package X;

/* renamed from: X.81D  reason: invalid class name */
public final class AnonymousClass81D implements Runnable {
    public final /* synthetic */ AnonymousClass7mP A00;
    public final /* synthetic */ AnonymousClass7HU A01;

    public AnonymousClass81D(AnonymousClass7mP r1, AnonymousClass7HU r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void run() {
        AnonymousClass7mP r0 = this.A00;
        synchronized (r0.A01) {
            r0.A00.BrG(this.A01);
        }
    }
}
