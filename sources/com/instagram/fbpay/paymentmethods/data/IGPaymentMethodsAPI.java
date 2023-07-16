package com.instagram.fbpay.paymentmethods.data;

import X.AnonymousClass3WK;
import X.C129017kq;
import X.C143718hC;
import X.C145388kQ;
import X.C31580Grx;
import com.facebook.redex.IDxPObserverShape674S0100000_2_I2;
import com.instagram.service.session.UserSession;

public final class IGPaymentMethodsAPI {
    public C145388kQ A00 = null;
    public final C129017kq A01 = new C129017kq();
    public final C143718hC A02 = new IDxPObserverShape674S0100000_2_I2(this, 2);
    public final C31580Grx A03;
    public final UserSession A04;
    public final String A05;

    public IGPaymentMethodsAPI(UserSession userSession, String str) {
        this.A04 = userSession;
        this.A05 = str;
        this.A03 = AnonymousClass3WK.A01(userSession);
    }
}
