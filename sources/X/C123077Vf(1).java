package X;

import androidx.compose.foundation.lazy.grid.LazyGridState;
import java.util.Map;
import kotlin.jvm.internal.KtLambdaShape173S0100000_I2;

/* renamed from: X.7Vf  reason: invalid class name and case insensitive filesystem */
public final class C123077Vf implements C147308p8, C147288p6 {
    public final C142768fY A00;
    public final C113876sJ A01 = new C113876sJ(this);
    public final /* synthetic */ C147308p8 A02;

    public C123077Vf(LazyGridState lazyGridState, C142768fY r6, AnonymousClass8bH r7) {
        AnonymousClass0wJ.A1R(lazyGridState, r7);
        this.A00 = r6;
        KtLambdaShape173S0100000_I2 A0x = C86164wN.A0x(lazyGridState, 1);
        C04220Ms.A0B(A0x, 2);
        this.A02 = new C123037Vb(r6, AnonymousClass7WY.A01(A0x, -1961468361, true), r7);
    }

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

    public final C113876sJ BD4() {
        return this.A01;
    }

    public final void A4r(C147188nY r4, int i, int i2) {
        int i3;
        r4.Cvd(1355196996);
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
            C147178nW.A03(AKE, this, i, i2, 1);
        }
    }
}
