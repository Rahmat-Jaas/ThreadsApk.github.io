package com.facebook.redex;

import X.C209416t;
import X.C23006Ck6;
import X.C63073bQ;
import X.C696249i;
import X.C83494rT;
import X.C84164se;
import com.instagram.creation.fragment.ShareLaterFragment;

public class IDxCListenerShape278S0200000_1_I2 implements C83494rT {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxCListenerShape278S0200000_1_I2(int i, Object obj, Object obj2) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public final void CCa() {
        C209416t A04;
        switch (this.A02) {
            case 0:
                ShareLaterFragment shareLaterFragment = (ShareLaterFragment) ((IDxCListenerShape201S0100000_1_I2) this.A00).A00;
                shareLaterFragment.A0B = true;
                C209416t r1 = (C209416t) this.A01;
                shareLaterFragment.A03.A0A = true;
                ShareLaterFragment.A01(shareLaterFragment);
                r1.A00 = true;
                C63073bQ.A00(shareLaterFragment.A04).A0B(r1);
                return;
            case 1:
                ((C84164se) this.A00).CCa();
                C696249i r12 = (C696249i) this.A01;
                if (r12.A04() != null && (A04 = r12.A04()) != null) {
                    A04.A00 = true;
                    return;
                }
                return;
            default:
                C23006Ck6.A06((C209416t) this.A00, (C23006Ck6) this.A01);
                return;
        }
    }

    public final void CJC() {
        switch (this.A02) {
            case 0:
                ShareLaterFragment shareLaterFragment = (ShareLaterFragment) ((IDxCListenerShape201S0100000_1_I2) this.A00).A00;
                shareLaterFragment.A0B = true;
                ShareLaterFragment.A01(shareLaterFragment);
                return;
            case 1:
                ((C84164se) this.A00).CJC();
                return;
            default:
                return;
        }
    }
}
