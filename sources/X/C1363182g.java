package X;

/* renamed from: X.82g  reason: invalid class name and case insensitive filesystem */
public final class C1363182g implements Runnable {
    public final /* synthetic */ C36483JXj A00;
    public final /* synthetic */ C35241Iqy A01;
    public final /* synthetic */ Runnable A02;

    public C1363182g(C36483JXj jXj, C35241Iqy iqy, Runnable runnable) {
        this.A01 = iqy;
        this.A00 = jXj;
        this.A02 = runnable;
    }

    public final void run() {
        C132137tO A002 = C132137tO.A00();
        C36483JXj jXj = this.A00;
        if (A002.A01(jXj) > 0) {
            C132137tO.A00().A03(jXj);
            this.A02.run();
        }
    }
}
