package com.facebook.redex;

import X.AnonymousClass0ZU;
import X.C09030ek;
import X.C10320i9;
import androidx.activity.ComponentActivity;
import com.instagram.service.session.UserSession;
import kotlin.Function;

public class IDxObjectShape235S0100000_I2 implements Function, AnonymousClass0ZU {
    public Object A00;
    public final int A01;

    public IDxObjectShape235S0100000_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final Object invoke() {
        switch (this.A01) {
            case 0:
                return ((ComponentActivity) this.A00).m0lambda$new$0$androidxactivityComponentActivity();
            case 1:
                return C10320i9.A01((UserSession) this.A00);
            default:
                return new C09030ek((UserSession) this.A00);
        }
    }
}
