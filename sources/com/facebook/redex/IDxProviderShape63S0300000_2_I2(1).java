package com.facebook.redex;

import X.AnonymousClass5jO;
import X.C04560Oe;
import X.C125627dd;
import X.C92335i3;
import android.content.Context;
import com.instagram.service.session.UserSession;

public class IDxProviderShape63S0300000_2_I2 implements C04560Oe {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public IDxProviderShape63S0300000_2_I2(Context context, UserSession userSession, C04560Oe r3, int i) {
        this.A03 = i;
        switch (i) {
            case 0:
                this.A00 = r3;
                this.A02 = userSession;
                this.A01 = context;
                break;
            case 1:
                this.A00 = context;
                this.A02 = userSession;
                this.A01 = r3;
                break;
            default:
                this.A00 = r3;
                this.A01 = context;
                this.A02 = userSession;
                break;
        }
    }

    public final /* bridge */ /* synthetic */ Object get() {
        int i = this.A03;
        Object obj = this.A00;
        switch (i) {
            case 0:
                UserSession userSession = (UserSession) this.A02;
                return new C92335i3((Context) this.A01, userSession, (C04560Oe) obj);
            case 1:
                return new C125627dd((Context) obj, (UserSession) this.A02, (C04560Oe) this.A01);
            default:
                return new AnonymousClass5jO((Context) this.A01, (UserSession) this.A02, (C04560Oe) obj);
        }
    }
}
