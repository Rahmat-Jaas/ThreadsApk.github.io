package com.facebook.redex;

import X.AnonymousClass0wJ;
import X.AnonymousClass57P;
import X.AnonymousClass5xT;
import X.C111686o9;
import X.C147138nS;
import X.C21923C8i;
import X.C62793ak;
import X.C963364j;
import X.C9B;
import android.content.res.Resources;
import com.instagram.service.session.UserSession;

public class IDxFactoryShape558S0100000_2_I2 implements C147138nS {
    public Object A00;
    public final int A01;

    public IDxFactoryShape558S0100000_2_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final /* synthetic */ C62793ak create(Class cls, C111686o9 r3) {
        return C147138nS.A00(this, cls);
    }

    public final C62793ak create(Class cls) {
        switch (this.A01) {
            case 0:
                return new C21923C8i((UserSession) this.A00);
            case 1:
                return new C9B((Resources) this.A00);
            default:
                AnonymousClass5xT r3 = (AnonymousClass5xT) this.A00;
                String string = r3.requireArguments().getString("ARG_GROUP_PROFILE_ID");
                if (string != null) {
                    return new AnonymousClass57P(new C963364j(AnonymousClass0wJ.A0X(r3.A01)), string);
                }
                throw AnonymousClass0wJ.A0b();
        }
    }
}
