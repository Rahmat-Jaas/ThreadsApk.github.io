package X;

/* renamed from: X.0Si  reason: invalid class name */
public final class AnonymousClass0Si extends Thread {
    public final /* synthetic */ C07760c8 A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass0Si(C07760c8 r2) {
        super("AddObjRefPhantomThread");
        this.A00 = r2;
    }

    public final void run() {
        this.A00.A04.startProcessor();
    }
}
