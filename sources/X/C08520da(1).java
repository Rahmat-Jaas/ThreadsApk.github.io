package X;

/* renamed from: X.0da  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C08520da implements Runnable {
    public final /* synthetic */ AnonymousClass0OK A00;

    public /* synthetic */ C08520da(AnonymousClass0OK r1) {
        this.A00 = r1;
    }

    public final void run() {
        int i;
        AnonymousClass0OK r2 = this.A00;
        if (r2.A01 != null) {
            C13810oL.A01("laterInit", -932747938);
            C04790Pd.A00();
            try {
                for (AnonymousClass0OE BPo : r2.A0O) {
                    C04790Pd.A00();
                    BPo.BPo(r2);
                }
                C04350Ng.A01.execute(new AnonymousClass0OG(r2));
                C04790Pd.A00();
                C13810oL.A00(-696943776);
            } catch (Throwable th) {
                th = th;
                C04790Pd.A00();
                i = -1319269277;
                C13810oL.A00(i);
                throw th;
            }
        }
        if (r2.A01 != null) {
            C13810oL.A01("postStartupInit", 1038805962);
            C04790Pd.A00();
            try {
                for (AnonymousClass0OE BPo2 : r2.A0P) {
                    C04790Pd.A00();
                    BPo2.BPo(r2);
                }
                C04790Pd.A00();
                C13810oL.A00(-348392864);
            } catch (Throwable th2) {
                th = th2;
                C04790Pd.A00();
                i = 630095223;
                C13810oL.A00(i);
                throw th;
            }
        }
    }
}
