package X;

import androidx.compose.foundation.lazy.LazyListState;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.KtLambdaShape51S0200000_I2;

/* renamed from: X.7Vd  reason: invalid class name and case insensitive filesystem */
public final class C123057Vd implements C147308p8, C147298p7 {
    public final AnonymousClass7VG A00;
    public final List A01;
    public final /* synthetic */ C147308p8 A02;

    public final Object AZd(int i) {
        return this.A02.AZd(i);
    }

    public final Object Aql(int i) {
        return this.A02.Aql(i);
    }

    public final Map Aqt() {
        return this.A02.Aqt();
    }

    public final int getItemCount() {
        return this.A02.getItemCount();
    }

    public final List Amc() {
        return this.A01;
    }

    public final AnonymousClass7VG AqN() {
        return this.A00;
    }

    public C123057Vd(AnonymousClass7VG r4, LazyListState lazyListState, C142768fY r6, List list, AnonymousClass8bH r8) {
        boolean A1Z = C18200wM.A1Z(r8);
        C18190wL.A1S(r4, 4, lazyListState);
        this.A01 = list;
        this.A00 = r4;
        this.A02 = new C123037Vb(r6, AnonymousClass7WY.A01(new KtLambdaShape51S0200000_I2(0, lazyListState, r4), 2070454083, A1Z), r8);
    }

    public final void A4r(C147188nY r4, int i, int i2) {
        int i3;
        r4.Cvd(-1645068522);
        if ((i2 & 14) == 0) {
            i3 = C147188nY.A03(r4, i) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            i3 |= C147188nY.A0G(r4, this);
        }
        if ((i3 & 91) != 18 || !r4.BCM()) {
            this.A02.A4r(r4, i, i3 & 14);
        } else {
            r4.CuJ();
        }
        C147178nW AKE = r4.AKE();
        if (AKE != null) {
            C147178nW.A03(AKE, this, i, i2, 0);
        }
    }
}
