package com.facebook.redex;

import X.AnonymousClass4Rl;
import X.C22241Ty;
import X.C24341hw;
import X.C24421ii;
import X.C24721jv;
import X.C33841Hva;
import X.C61823Vx;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;

public class IDxOTaskShape113S0300000_1_I2 implements C33841Hva {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public IDxOTaskShape113S0300000_1_I2(int i, Object obj, Object obj2, Object obj3) {
        this.A03 = i;
        this.A00 = obj;
        this.A02 = obj3;
        this.A01 = obj2;
    }

    public final String getName() {
        if (this.A03 != 0) {
            return "FacebookLoginOnSuccess";
        }
        return "CreateBusinessAccountOnSuccess";
    }

    public final int getRunnableId() {
        if (this.A03 != 0) {
            return 248;
        }
        return 289;
    }

    public final void onCancel() {
    }

    public final void onFinish() {
        if (this.A03 != 0) {
            C24341hw r3 = (C24341hw) this.A00;
            User user = (User) this.A01;
            C24721jv r0 = r3.A06;
            if (r0 != null) {
                r0.A00();
            }
            r3.A05.post(new AnonymousClass4Rl(r3, user));
            return;
        }
        C24421ii.A00((C24421ii) this.A00, (C22241Ty) this.A01, (UserSession) this.A02);
    }

    public final void onStart() {
    }

    public final void run() {
        C61823Vx.A01.A06((UserSession) this.A02);
    }
}
