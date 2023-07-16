package androidx.fragment.app;

import X.AnonymousClass052;
import X.AnonymousClass5jB;
import X.C010604w;
import X.C110996mc;
import X.C12560m7;
import X.C86164wN;
import android.content.Context;
import android.os.Bundle;

public class IDxLCallbacksShape42S0100000_2_I2 extends AnonymousClass052 {
    public Object A00;
    public final int A01;

    public IDxLCallbacksShape42S0100000_2_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void A00(Context context, Fragment fragment, C12560m7 r4) {
        if (this.A01 != 0) {
            super.A00(context, fragment, r4);
        } else if (fragment instanceof AnonymousClass5jB) {
            ((AnonymousClass5jB) fragment).A0F(((C110996mc) this.A00).A00);
        }
    }

    public final void A02(Bundle bundle, Fragment fragment, C12560m7 r6) {
        if (1 - this.A01 != 0) {
            super.A02(bundle, fragment, r6);
            return;
        }
        Fragment fragment2 = (Fragment) this.A00;
        C010604w.A01(fragment2, "key_result_funding", C86164wN.A0u(fragment2, 47));
    }

    public final void A03(Fragment fragment, C12560m7 r4) {
        if (this.A01 != 0) {
            ((Fragment) this.A00).getParentFragmentManager().A10("key_result_funding");
        } else if (fragment instanceof AnonymousClass5jB) {
            ((C110996mc) this.A00).A01.A0t(this);
        }
    }
}
