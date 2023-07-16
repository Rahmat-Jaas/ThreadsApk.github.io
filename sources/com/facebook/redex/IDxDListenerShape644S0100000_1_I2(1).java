package com.facebook.redex;

import X.AnonymousClass1cR;
import X.AnonymousClass431;
import X.AnonymousClass4Aj;
import X.AnonymousClass4OF;
import X.C04220Ms;
import X.C05030Qo;
import X.C10300i6;
import X.C23381dg;
import X.C84214sk;
import com.instagram.business.fragment.ConnectFBPageFragment;
import com.instagram.service.session.UserSession;

public class IDxDListenerShape644S0100000_1_I2 implements C84214sk {
    public Object A00;
    public final int A01;

    public IDxDListenerShape644S0100000_1_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void BrC(String str, String str2) {
        switch (this.A01) {
            case 0:
                AnonymousClass4Aj.A0E.post(new AnonymousClass4OF(this));
                return;
            case 1:
                ConnectFBPageFragment connectFBPageFragment = (ConnectFBPageFragment) this.A00;
                C10300i6 r1 = connectFBPageFragment.A04;
                if (r1 instanceof UserSession) {
                    C05030Qo.A02(r1);
                }
                ConnectFBPageFragment.A02(connectFBPageFragment);
                return;
            case 2:
                C04220Ms.A0B(str, 0);
                AnonymousClass431.A01((AnonymousClass431) this.A00, str);
                return;
            case 3:
                C23381dg.A03((C23381dg) this.A00);
                return;
            default:
                AnonymousClass1cR r3 = (AnonymousClass1cR) this.A00;
                r3.A04.BlM(r3.getContext(), r3.A02);
                AnonymousClass1cR.A01(r3, str);
                return;
        }
    }

    public final void BwY() {
        switch (this.A01) {
            case 1:
                ConnectFBPageFragment.class.toString();
                return;
            case 2:
                AnonymousClass431.A00((AnonymousClass431) this.A00);
                return;
            default:
                return;
        }
    }

    public final void onCancel() {
        switch (this.A01) {
            case 1:
                ConnectFBPageFragment.class.toString();
                return;
            case 2:
                AnonymousClass431.A00((AnonymousClass431) this.A00);
                return;
            default:
                return;
        }
    }
}
