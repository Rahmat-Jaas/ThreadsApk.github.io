package X;

/* renamed from: X.81d  reason: invalid class name and case insensitive filesystem */
public final class C1360481d implements Runnable {
    public final /* synthetic */ C146198lo A00;
    public final /* synthetic */ String A01;

    public C1360481d(C146198lo r1, String str) {
        this.A00 = r1;
        this.A01 = str;
    }

    public final void run() {
        C146198lo r1 = this.A00;
        if (r1 != null) {
            r1.onFinish();
            r1.CNL(this.A01);
        }
    }
}
