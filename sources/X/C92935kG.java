package X;

import com.facebook.redex.IDxCListenerShape801S0100000_2_I2;
import com.facebook.redex.IDxFCallbackShape79S0300000_2_I2;

/* renamed from: X.5kG  reason: invalid class name and case insensitive filesystem */
public final class C92935kG extends C129017kq {
    public volatile AnonymousClass7EC A00;

    public static C92935kG A00(C113806sA r3, C83304rA r4, C146418mD r5, McB mcB, McB mcB2) {
        C92935kG r2 = new C92935kG(r4, r5, mcB, mcB2);
        if (r3 != null) {
            r3.A01(new IDxCListenerShape801S0100000_2_I2(r2, 0));
        }
        return r2;
    }

    public C92935kG(C83304rA r3, C146418mD r4, McB mcB, McB mcB2) {
        r3.AMA(r4, new IDxFCallbackShape79S0300000_2_I2(1, mcB, mcB2, this));
    }

    public final void A6o(C143718hC r2) {
        super.A6o(r2);
        if (this.A00 != null) {
            r2.CRe(this.A00);
        }
    }
}
