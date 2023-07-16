package com.facebook.redex;

import X.AnonymousClass1jJ;
import X.AnonymousClass6VR;
import X.C05020Qk;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;

public class IDxSCallbackShape334S0200000_1_I2 implements C05020Qk {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxSCallbackShape334S0200000_1_I2(AnonymousClass1jJ r1, User user, int i) {
        this.A02 = i;
        this.A00 = r1;
        this.A01 = user;
    }

    public final void ChM(UserSession userSession) {
        AnonymousClass6VR.A00(userSession).A01((User) this.A01, false);
    }
}
