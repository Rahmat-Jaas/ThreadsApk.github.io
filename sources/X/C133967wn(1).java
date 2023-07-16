package X;

/* renamed from: X.7wn  reason: invalid class name and case insensitive filesystem */
public final class C133967wn implements C145998lS {
    public final /* synthetic */ C109466k3 A00;

    public C133967wn(C109466k3 r1) {
        this.A00 = r1;
    }

    public final void CIy(C27942Evs evs) {
        C109466k3 r1 = this.A00;
        if (evs == r1.A00) {
            r1.A01.CIy(evs);
            r1.A00 = null;
        }
    }

    public final void CIz(C27942Evs evs) {
        C109466k3 r0 = this.A00;
        r0.A00 = evs;
        r0.A01.CIz(evs);
    }

    public final void CJ0(C27942Evs evs, int i) {
        C109466k3 r3 = this.A00;
        if (evs == r3.A00) {
            for (C27942Evs evs2 : r3.A02) {
                if (evs2 != r3.A00) {
                    evs2.CLP(i);
                }
            }
            r3.A01.CJ0(evs, i);
        }
    }
}
