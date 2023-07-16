package X;

/* renamed from: X.4RY  reason: invalid class name */
public final class AnonymousClass4RY implements Runnable {
    public final /* synthetic */ AnonymousClass1c9 A00;
    public final /* synthetic */ Runnable A01;

    public AnonymousClass4RY(AnonymousClass1c9 r1, Runnable runnable) {
        this.A00 = r1;
        this.A01 = runnable;
    }

    public final void run() {
        if (this.A00.A08()) {
            this.A01.run();
        }
    }
}
