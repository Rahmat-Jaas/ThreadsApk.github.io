package com.facebook.redex;

import X.C18180wK;
import X.C24441io;
import X.C24751jz;
import X.C28161tl;
import X.C566938e;
import X.C67323zM;
import X.C82834qL;
import com.instagram.service.session.UserSession;

public class IDxFListenerShape336S0200000_1_I2 implements C82834qL {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxFListenerShape336S0200000_1_I2(int i, Object obj, Object obj2) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public final void onFinished() {
        if (this.A02 != 0) {
            C18180wK.A0v(C28161tl.A02(((C566938e) this.A01).A00), "remaining_nux_steps", (String) null);
            return;
        }
        C24751jz r0 = ((C24441io) this.A00).A04;
        C67323zM.A08(r0.A04, r0.A07, (UserSession) this.A01);
    }
}
