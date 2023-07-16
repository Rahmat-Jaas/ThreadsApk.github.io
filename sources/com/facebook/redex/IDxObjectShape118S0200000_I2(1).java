package com.facebook.redex;

import X.AnonymousClass0P5;
import X.AnonymousClass0ZU;
import X.C10300i6;
import X.C10830j1;
import X.C15500rQ;
import android.content.Context;
import com.instagram.service.session.UserSession;
import kotlin.Function;

public class IDxObjectShape118S0200000_I2 implements Function, AnonymousClass0ZU {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxObjectShape118S0200000_I2(int i, Object obj, Object obj2) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public final Object invoke() {
        int i = this.A02;
        Object obj = this.A00;
        switch (i) {
            case 0:
                return C15500rQ.A00((Context) obj, (C10300i6) this.A01);
            case 1:
                return new C10830j1((Context) obj, (UserSession) this.A01);
            default:
                return ((AnonymousClass0P5) obj).AO4((UserSession) this.A01);
        }
    }
}
