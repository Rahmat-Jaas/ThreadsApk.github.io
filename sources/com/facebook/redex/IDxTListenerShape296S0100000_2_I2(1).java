package com.facebook.redex;

import X.AnonymousClass56W;
import X.AnonymousClass5IW;
import X.AnonymousClass5wu;
import X.AnonymousClass5xV;
import X.AnonymousClass8f5;
import X.C21953C9n;
import X.C21967CAb;
import X.C33516HpC;
import X.C86074wE;
import X.CQI;
import com.instagram.user.model.User;

public class IDxTListenerShape296S0100000_2_I2 implements C33516HpC {
    public Object A00;
    public final int A01;

    public IDxTListenerShape296S0100000_2_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final boolean onToggle(boolean z) {
        Object value;
        boolean z2 = z;
        switch (this.A01) {
            case 0:
                C21967CAb cAb = (C21967CAb) this.A00;
                cAb.A07.CrC(new CQI(z2, cAb.A04.getUserId()));
                return true;
            case 1:
                AnonymousClass5xV.A00((AnonymousClass5xV) this.A00).A0J(z2);
                return false;
            case 2:
                AnonymousClass56W A002 = AnonymousClass5xV.A00((AnonymousClass5xV) this.A00);
                C86074wE r2 = A002.A0F;
                if (!AnonymousClass56W.A02(A002, ((AnonymousClass5IW) r2.getValue()).A0F)) {
                    return false;
                }
                do {
                    value = r2.getValue();
                } while (!r2.ADi(value, AnonymousClass5IW.A00((AnonymousClass5IW) value, (AnonymousClass8f5) null, (User) null, (Integer) null, (String) null, 0, 3932159, false, false, false, false, false, false, false, false, false, z2)));
                return false;
            case 3:
                AnonymousClass5xV.A00((AnonymousClass5xV) this.A00).A08 = z2;
                return true;
            case 4:
                AnonymousClass5xV.A00((AnonymousClass5xV) this.A00).A0K(z2);
                return false;
            default:
                ((C21953C9n) ((AnonymousClass5wu) this.A00).A05.getValue()).A00(z2);
                return false;
        }
    }
}
