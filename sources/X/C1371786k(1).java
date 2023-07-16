package X;

/* renamed from: X.86k  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C1371786k implements Et5 {
    public final /* synthetic */ Runnable A00;
    public final /* synthetic */ C141458be A01;

    public /* synthetic */ C1371786k(Runnable runnable, C141458be r2) {
        this.A01 = r2;
        this.A00 = runnable;
    }

    public final void dispose() {
        C141458be r0 = this.A01;
        r0.A00.removeCallbacks(this.A00);
    }
}
