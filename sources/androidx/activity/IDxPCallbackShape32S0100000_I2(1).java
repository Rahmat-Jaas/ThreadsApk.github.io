package androidx.activity;

import X.AnonymousClass00C;
import X.AnonymousClass0YY;
import X.C12560m7;

public class IDxPCallbackShape32S0100000_I2 extends AnonymousClass00C {
    public Object A00;
    public final int A01 = 0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IDxPCallbackShape32S0100000_I2(AnonymousClass0YY r2) {
        super(true);
        this.A00 = r2;
    }

    public final void A01() {
        if (this.A01 != 0) {
            C12560m7 r1 = (C12560m7) this.A00;
            r1.A14(true);
            if (r1.A0Q.A01) {
                r1.A16();
            } else {
                r1.A01.A02();
            }
        } else {
            ((AnonymousClass0YY) this.A00).invoke(this);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IDxPCallbackShape32S0100000_I2(C12560m7 r2) {
        super(false);
        this.A00 = r2;
    }
}
