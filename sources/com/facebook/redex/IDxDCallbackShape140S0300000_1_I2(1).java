package com.facebook.redex;

import X.C26761rA;
import X.C26811rF;
import X.C82664q4;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;

public class IDxDCallbackShape140S0300000_1_I2 implements C82664q4 {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public IDxDCallbackShape140S0300000_1_I2(int i, Object obj, Object obj2, Object obj3) {
        this.A03 = i;
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = obj3;
    }

    public final /* bridge */ /* synthetic */ void BrJ(Object obj) {
        if (this.A03 != 0) {
            C26811rF.A00((C26811rF) ((IDxCCallbackShape124S0300000_1_I2) this.A00).A00, (UserSession) this.A01, (User) this.A02);
            return;
        }
        ((C26761rA) this.A02).A04((UserSession) this.A01, (User) this.A00);
    }
}
