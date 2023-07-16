package X;

/* renamed from: X.81e  reason: invalid class name and case insensitive filesystem */
public final class C1360581e implements Runnable {
    public final /* synthetic */ C146198lo A00;
    public final /* synthetic */ Throwable A01;

    public C1360581e(C146198lo r1, Throwable th) {
        this.A00 = r1;
        this.A01 = th;
    }

    public final void run() {
        C146198lo r1 = this.A00;
        if (r1 != null) {
            r1.onFinish();
            r1.Bxv((Exception) this.A01);
        }
    }
}
