package X;

/* renamed from: X.1mO  reason: invalid class name */
public final class AnonymousClass1mO extends AnonymousClass0gG {
    public final /* synthetic */ AnonymousClass3XY A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1mO(AnonymousClass3XY r4) {
        super(178, 4, false, false);
        this.A00 = r4;
    }

    public final void run() {
        AnonymousClass3XY r1 = this.A00;
        AnonymousClass3Y6 r2 = new AnonymousClass3Y6(r1.A01);
        C37228Jmt jmt = r1.A00;
        synchronized (jmt) {
            jmt.A05("state-v1", r2);
        }
    }
}
