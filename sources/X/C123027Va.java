package X;

import java.util.Map;

/* renamed from: X.7Va  reason: invalid class name and case insensitive filesystem */
public final class C123027Va implements C147308p8 {
    public final C81784oM A00;

    public final Object AZd(int i) {
        return ((C147308p8) this.A00.getValue()).AZd(i);
    }

    public final Object Aql(int i) {
        return ((C147308p8) this.A00.getValue()).Aql(i);
    }

    public final Map Aqt() {
        return ((C147308p8) this.A00.getValue()).Aqt();
    }

    public final int getItemCount() {
        return ((C147308p8) this.A00.getValue()).getItemCount();
    }

    public C123027Va(C81784oM r1) {
        this.A00 = r1;
    }

    public final void A4r(C147188nY r4, int i, int i2) {
        int i3;
        r4.Cvd(1633511187);
        if ((i2 & 14) == 0) {
            i3 = C147188nY.A03(r4, i) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            i3 |= C147188nY.A0G(r4, this);
        }
        if ((i3 & 91) != 18 || !r4.BCM()) {
            ((C147308p8) this.A00.getValue()).A4r(r4, i, i3 & 14);
        } else {
            r4.CuJ();
        }
        C147178nW AKE = r4.AKE();
        if (AKE != null) {
            C147178nW.A03(AKE, this, i, i2, 2);
        }
    }
}
