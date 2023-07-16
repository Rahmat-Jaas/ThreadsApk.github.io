package com.facebook.redex;

import X.AnonymousClass006;
import X.AnonymousClass79D;
import X.C170759vW;
import X.C18220wO;
import X.C21659By5;
import X.C972868t;

public class IDxDListenerShape34S1200000_2_I2 implements C21659By5 {
    public Object A00;
    public Object A01;
    public String A02;
    public final int A03;

    public IDxDListenerShape34S1200000_2_I2(C170759vW r1, AnonymousClass79D r2, String str, int i) {
        this.A03 = i;
        this.A01 = r2;
        this.A02 = str;
        this.A00 = r1;
    }

    public final void Bmo() {
        C972868t r3;
        int i = this.A03;
        AnonymousClass79D r1 = (AnonymousClass79D) this.A01;
        String str = this.A02;
        C170759vW r2 = (C170759vW) this.A00;
        Integer num = AnonymousClass006.A01;
        if (i != 0) {
            r3 = C972868t.REMIX_SETTINGS;
        } else {
            r3 = C972868t.CONTACT_POINT_UPDATE;
        }
        r1.A01(r2, r3, num, num, str, C18220wO.A0y());
    }

    public final void Bmq() {
    }
}
