package X;

/* renamed from: X.7zz  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C135747zz implements Runnable {
    public final /* synthetic */ C86824zB A00;

    public /* synthetic */ C135747zz(C86824zB r1) {
        this.A00 = r1;
    }

    public final void run() {
        C22266CRf cRf = this.A00.A00;
        if (cRf.isResumed() && cRf.A0k != null) {
            cRf.registerLifecycleListener(cRf.A0k);
        }
    }
}
