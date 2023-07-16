package X;

/* renamed from: X.0vR  reason: invalid class name and case insensitive filesystem */
public final class C17730vR implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C17630vH A01;

    public C17730vR(C17630vH r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }

    public final void run() {
        try {
            C14510pX r4 = this.A01.A0E;
            int i = this.A00;
            try {
                synchronized (r4) {
                    C14580pi r0 = r4.A0I;
                    if (r0.A00.A0Y.equals(AnonymousClass006.A0C)) {
                        C14510pX.A01(r4, new C14710q0(new C17320uh(C17290ue.PUBACK), new C17310ug(i)), r4.A01);
                    }
                }
            } catch (Throwable th) {
                C14580pi r02 = r4.A0I;
                C17490uz A002 = C17490uz.A00(th);
                C17540v7 r3 = C17540v7.PUBACK;
                C17630vH r2 = r02.A00;
                if (r2.A0Y != AnonymousClass006.A0N) {
                    C17630vH.A03(r2, r3, A002, th);
                }
                th.getMessage();
            }
        } catch (Throwable th2) {
            C17630vH r22 = this.A01;
            r22.A0F.A02(th2);
            C17630vH.A03(r22, C17540v7.PUBACK, C17490uz.A00(th2), th2);
        }
    }
}
