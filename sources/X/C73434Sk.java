package X;

/* renamed from: X.4Sk  reason: invalid class name and case insensitive filesystem */
public final class C73434Sk implements Runnable {
    public final /* synthetic */ C37032Jj9 A00;
    public final /* synthetic */ C62743ad A01;
    public final /* synthetic */ C23281ct A02;

    public C73434Sk(C37032Jj9 jj9, C62743ad r2, C23281ct r3) {
        this.A01 = r2;
        this.A00 = jj9;
        this.A02 = r3;
    }

    public final void run() {
        C62743ad r4 = this.A01;
        C37383Jqm jqm = r4.A00;
        if (jqm == null) {
            C37383Jqm A002 = this.A00.A00();
            C37383Jqm.A00(r4.A03, this.A02, A002);
            r4.A00 = A002;
            return;
        }
        jqm.A0A(this.A02, this.A00, false);
    }
}
