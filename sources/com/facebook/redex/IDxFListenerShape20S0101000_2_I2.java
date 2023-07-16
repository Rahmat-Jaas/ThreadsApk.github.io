package com.facebook.redex;

import X.AnonymousClass3LY;
import X.AnonymousClass3XX;
import X.C04220Ms;
import X.C10300i6;
import X.C131307rk;
import X.C131317rl;
import X.C38039KHq;
import X.C81384nh;
import X.C83884s9;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;

public class IDxFListenerShape20S0101000_2_I2 implements C83884s9 {
    public int A00;
    public Object A01;
    public final int A02;

    public IDxFListenerShape20S0101000_2_I2(UserSession userSession, int i, int i2) {
        this.A02 = i2;
        this.A00 = i;
        this.A01 = userSession;
    }

    public final void CNG(User user) {
        C38039KHq kHq;
        C81384nh r0;
        switch (this.A02) {
            case 0:
                C04220Ms.A0B(user, 0);
                int i = this.A00;
                C10300i6 r1 = (C10300i6) this.A01;
                C04220Ms.A0B(r1, 2);
                kHq = AnonymousClass3LY.A00(r1);
                r0 = new C131307rk(user, i);
                break;
            case 1:
                C04220Ms.A0B(user, 0);
                int i2 = this.A00;
                C10300i6 r12 = (C10300i6) this.A01;
                C04220Ms.A0B(r12, 2);
                kHq = AnonymousClass3LY.A00(r12);
                r0 = new C131317rl(user, i2);
                break;
            default:
                return;
        }
        kHq.CWx(r0);
    }

    public final void Bxr(AnonymousClass3XX r1) {
    }
}
