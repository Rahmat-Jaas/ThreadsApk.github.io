package X;

/* renamed from: X.81J  reason: invalid class name */
public final /* synthetic */ class AnonymousClass81J implements Runnable {
    public final AnonymousClass7oN A00;
    public final C143998hf A01;

    public AnonymousClass81J(AnonymousClass7oN r1, C143998hf r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void run() {
        AnonymousClass7oN r3 = this.A00;
        C143998hf r2 = this.A01;
        if (r3.A01 == AnonymousClass7oN.A03) {
            synchronized (r3) {
                r3.A00 = null;
                r3.A01 = r2;
            }
            return;
        }
        throw C18180wK.A0a("provide() can be called only once.");
    }
}
