package X;

/* renamed from: X.7yu  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C135117yu implements Runnable {
    public final /* synthetic */ C123907Zw A00;

    public /* synthetic */ C135117yu(C123907Zw r1) {
        this.A00 = r1;
    }

    public final void run() {
        C123907Zw r2 = this.A00;
        if (r2.A00 == 0) {
            r2.A03 = true;
            r2.A05.A09(AnonymousClass060.ON_PAUSE);
        }
        if (r2.A01 == 0 && r2.A03) {
            r2.A05.A09(AnonymousClass060.ON_STOP);
            r2.A04 = true;
        }
    }
}
