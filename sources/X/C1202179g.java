package X;

import com.facebook.redex.IDxComparatorShape95S0000000_2_I2;
import java.util.Comparator;

/* renamed from: X.79g  reason: invalid class name and case insensitive filesystem */
public final class C1202179g {
    public final C1377489w A00;
    public final C04530Oa A01;
    public final Comparator A02;
    public final boolean A03;

    public final void A00(AnonymousClass7Y3 r3) {
        if (AnonymousClass0wJ.A1W(r3.A0A)) {
            this.A00.add(r3);
            return;
        }
        throw C18180wK.A0a("Check failed.");
    }

    public final boolean A01(AnonymousClass7Y3 r3) {
        if (AnonymousClass0wJ.A1W(r3.A0A)) {
            return this.A00.remove(r3);
        }
        throw C18180wK.A0a("Check failed.");
    }

    public final String toString() {
        return C18190wL.A0n(this.A00);
    }

    public C1202179g(boolean z) {
        this.A03 = z;
        this.A01 = AnonymousClass0OY.A01(AnonymousClass006.A0C, AnonymousClass4Zm.A00);
        IDxComparatorShape95S0000000_2_I2 iDxComparatorShape95S0000000_2_I2 = new IDxComparatorShape95S0000000_2_I2(1);
        this.A02 = iDxComparatorShape95S0000000_2_I2;
        this.A00 = new C1377489w(iDxComparatorShape95S0000000_2_I2);
    }

    public C1202179g() {
        this(true);
    }
}
