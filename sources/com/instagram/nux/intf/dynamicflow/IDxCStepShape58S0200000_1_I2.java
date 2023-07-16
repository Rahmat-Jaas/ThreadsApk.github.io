package com.instagram.nux.intf.dynamicflow;

import X.AnonymousClass3IX;
import X.C18180wK;
import X.C313625r;
import X.C67073yp;
import X.C81604o4;
import android.content.Context;

public class IDxCStepShape58S0200000_1_I2 extends AnonymousClass3IX {
    public Object A00;
    public Object A01;
    public final int A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IDxCStepShape58S0200000_1_I2(C81604o4 r2, Object obj, Object obj2, int i) {
        super(r2, (String) null);
        this.A02 = i;
        this.A01 = obj2;
        this.A00 = obj;
    }

    public final boolean A00() {
        boolean A1W;
        switch (this.A02) {
            case 0:
                if (((C67073yp) this.A01).A01 != C313625r.A03) {
                    A1W = C18180wK.A1W(((Context) this.A00).checkSelfPermission("android.permission.READ_CONTACTS"));
                    break;
                } else {
                    return true;
                }
            case 1:
                if (((AnonymousClass3IX) this.A00).A00()) {
                    return false;
                }
                break;
            default:
                if (!((AnonymousClass3IX) this.A00).A00()) {
                    return false;
                }
                break;
        }
        A1W = ((AnonymousClass3IX) this.A01).A00();
        if (A1W) {
            return true;
        }
        return false;
    }
}
