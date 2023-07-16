package X;

/* renamed from: X.4RW  reason: invalid class name */
public final class AnonymousClass4RW implements Runnable {
    public final /* synthetic */ AnonymousClass1iT A00;
    public final /* synthetic */ Runnable A01;

    public AnonymousClass4RW(AnonymousClass1iT r1, Runnable runnable) {
        this.A00 = r1;
        this.A01 = runnable;
    }

    public final void run() {
        if (this.A00.A04.A08()) {
            this.A01.run();
        }
    }
}
