package X;

/* renamed from: X.81E  reason: invalid class name */
public final class AnonymousClass81E implements Runnable {
    public final /* synthetic */ AnonymousClass7mQ A00;
    public final /* synthetic */ AnonymousClass7HU A01;

    public AnonymousClass81E(AnonymousClass7mQ r1, AnonymousClass7HU r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void run() {
        AnonymousClass7mQ r0 = this.A00;
        synchronized (r0.A01) {
            C143888hT r1 = r0.A00;
            Exception A03 = this.A01.A03();
            C13320nQ.A01(A03);
            r1.ByD(A03);
        }
    }
}
