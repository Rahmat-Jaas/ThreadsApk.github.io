package X;

/* renamed from: X.00A  reason: invalid class name */
public final /* synthetic */ class AnonymousClass00A implements Runnable {
    public final /* synthetic */ AnonymousClass096 A00;

    public /* synthetic */ AnonymousClass00A(AnonymousClass096 r1) {
        this.A00 = r1;
    }

    public final void run() {
        AnonymousClass096 r1 = this.A00;
        Runnable runnable = r1.A01;
        if (runnable != null) {
            runnable.run();
            r1.A01 = null;
        }
    }
}
