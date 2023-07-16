package X;

/* renamed from: X.7sQ  reason: invalid class name and case insensitive filesystem */
public final class C131577sQ implements C10390iG, C39434KtW {
    public final C107156gG A00;

    public final void D7k(C35347ItB itB) {
        C04220Ms.A0B(itB, 0);
    }

    public final void A00(boolean z) {
        if (AnonymousClass0wJ.A1X(C103636Zy.A01.getValue())) {
            C107156gG r2 = this.A00;
            if ((r2.A00 & 255) != 0 && z != C103636Zy.A00) {
                C103636Zy.A00 = z;
                AnonymousClass0gN.A00().AKp(new AnonymousClass61H(r2, z));
            }
        }
    }

    public C131577sQ(C107156gG r1) {
        this.A00 = r1;
        C691847d.A02(this);
    }

    public final void onAppBackgrounded() {
        int A03 = C14030oh.A03(-2066075032);
        A00(false);
        C14030oh.A0A(1882044476, A03);
    }

    public final void onAppForegrounded() {
        int A03 = C14030oh.A03(1235594338);
        A00(true);
        C14030oh.A0A(-1707061885, A03);
    }
}
