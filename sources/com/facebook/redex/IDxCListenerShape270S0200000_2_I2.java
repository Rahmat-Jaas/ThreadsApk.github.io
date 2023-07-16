package com.facebook.redex;

import X.AnonymousClass5BO;
import X.AnonymousClass7Kz;
import X.C108886j7;
import X.C143638h4;
import X.C16420t2;
import X.C18250wR;
import X.C86164wN;
import X.C886359v;
import android.content.Context;
import android.content.Intent;

public class IDxCListenerShape270S0200000_2_I2 implements C143638h4 {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxCListenerShape270S0200000_2_I2(int i, Object obj, Object obj2) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public final void C4b(C108886j7 r4) {
        switch (this.A02) {
            case 0:
                ((C886359v) this.A01).A00.onClick(((AnonymousClass5BO) this.A00).A00);
                return;
            case 1:
                String str = r4.A02;
                if (str != null) {
                    AnonymousClass7Kz.A0N().A01((Context) this.A01, str);
                    return;
                }
                return;
            default:
                String str2 = r4.A02;
                if (str2 != null) {
                    Intent A0B = C86164wN.A0B(C18250wR.A05("android.intent.action.VIEW"), str2);
                    C16420t2.A00().A05().A09((Context) this.A01, A0B);
                    return;
                }
                return;
        }
    }
}
