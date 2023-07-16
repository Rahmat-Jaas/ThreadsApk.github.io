package com.facebook.redex;

import X.AnonymousClass0YY;
import X.AnonymousClass7EC;
import X.AnonymousClass83N;
import X.C04220Ms;
import X.C109836kh;
import X.C114756tq;
import X.C129017kq;
import X.C143718hC;

public class IDxPObserverShape271S0200000_2_I2 implements C143718hC {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxPObserverShape271S0200000_2_I2(int i, Object obj, Object obj2) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public final void CRe(Object obj) {
        switch (this.A02) {
            case 0:
                C114756tq r2 = (C114756tq) this.A00;
                C04220Ms.A0C(r2, "null cannot be cast to non-null type com.fbpay.util.observable.FBPayObservableMediator.MediatorEntry<kotlin.Any?, T of com.fbpay.util.observable.FBPayObservableMediator>");
                ((C129017kq) this.A01).A01(r2.A01.invoke(obj));
                return;
            case 1:
                C143718hC r1 = (C143718hC) this.A00;
                if (r1 != null) {
                    r1.CRe(((AnonymousClass0YY) this.A01).invoke(obj));
                    return;
                }
                return;
            default:
                AnonymousClass7EC r6 = (AnonymousClass7EC) obj;
                C109836kh r4 = (C109836kh) this.A01;
                r4.A01.A02.execute(new AnonymousClass83N(r4, r6.A01, r6.A02));
                return;
        }
    }
}
