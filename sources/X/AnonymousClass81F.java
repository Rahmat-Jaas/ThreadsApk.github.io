package X;

/* renamed from: X.81F  reason: invalid class name */
public final class AnonymousClass81F implements Runnable {
    public final /* synthetic */ AnonymousClass7mR A00;
    public final /* synthetic */ AnonymousClass7HU A01;

    public AnonymousClass81F(AnonymousClass7mR r1, AnonymousClass7HU r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void run() {
        AnonymousClass7mR r0 = this.A00;
        synchronized (r0.A01) {
            r0.A00.onSuccess(this.A01.A04());
        }
    }
}
