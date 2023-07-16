package X;

/* renamed from: X.834  reason: invalid class name */
public final class AnonymousClass834 implements Runnable {
    public final /* synthetic */ C106996fy A00;
    public final /* synthetic */ AnonymousClass3HX A01;
    public final /* synthetic */ C127397h3 A02;
    public final /* synthetic */ C127397h3 A03;
    public final /* synthetic */ Runnable A04;

    public AnonymousClass834(C106996fy r1, AnonymousClass3HX r2, C127397h3 r3, C127397h3 r4, Runnable runnable) {
        this.A00 = r1;
        this.A03 = r3;
        this.A04 = runnable;
        this.A02 = r4;
        this.A01 = r2;
    }

    public final void run() {
        C106996fy r1 = this.A00;
        r1.A00 = null;
        if (!r1.A01) {
            r1.A01 = true;
            C109326jp A0V = C18230wP.A0V(this.A03);
            if (A0V != null) {
                C127397h3 r2 = this.A02;
                AnonymousClass3HX r12 = this.A01;
                AnonymousClass3VO A002 = AnonymousClass3VO.A00();
                A002.A02(r2, 0);
                A002.A02(r12, 1);
                C122047Jt.A07(r12, r2, A002, A0V);
            }
        }
        C109326jp A08 = C127397h3.A08(this.A03);
        if (A08 != null) {
            C127397h3 r22 = this.A02;
            AnonymousClass3HX r13 = this.A01;
            AnonymousClass3VO A003 = AnonymousClass3VO.A00();
            A003.A02(r22, 0);
            A003.A02(r13, 1);
            C122047Jt.A07(r13, r22, A003, A08);
        }
        Runnable runnable = this.A04;
        if (runnable != null) {
            runnable.run();
        }
    }
}
