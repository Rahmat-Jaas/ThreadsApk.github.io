package com.instagram.nux.intf.dynamicflow;

import X.AnonymousClass0TJ;
import X.AnonymousClass2AQ;
import X.AnonymousClass3IX;
import X.C10600ic;
import X.C18180wK;
import X.C18190wL;
import X.C18200wM;
import X.C63173fJ;
import android.os.Build;

public class IDxCStepShape55S0000000_1_I2 extends AnonymousClass3IX {
    public final int A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IDxCStepShape55S0000000_1_I2(AnonymousClass2AQ r1, String str, int i) {
        super(r1, str);
        this.A00 = i;
    }

    public final boolean A00() {
        switch (this.A00) {
            case 0:
                return true;
            case 1:
                break;
            default:
                if (C18190wL.A04(C18200wM.A0C(), "preference_push_permission_impression_count") != 0 || Build.VERSION.SDK_INT < 33 || C18180wK.A1W(C10600ic.A00.getApplicationContext().checkSelfPermission("android.permission.POST_NOTIFICATIONS")) || !C63173fJ.A05(AnonymousClass0TJ.A05, 2324150088269568857L)) {
                    return false;
                }
                return true;
        }
        return false;
    }
}
