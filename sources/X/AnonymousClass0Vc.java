package X;

/* renamed from: X.0Vc  reason: invalid class name */
public final class AnonymousClass0Vc implements Runnable {
    public final /* synthetic */ C08440dP A00;

    public AnonymousClass0Vc(C08440dP r1) {
        this.A00 = r1;
    }

    public final void run() {
        C08440dP r5 = this.A00;
        long j = r5.A0A;
        if (r5.A02.get() && j != -1) {
            r5.A08("ScrollPerf.FrameEnded");
        }
    }
}
