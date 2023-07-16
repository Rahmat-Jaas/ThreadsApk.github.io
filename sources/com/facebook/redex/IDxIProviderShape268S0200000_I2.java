package com.facebook.redex;

import X.AnonymousClass0PW;
import X.C15900s6;
import com.facebook.rti.push.service.FbnsServiceDelegate;

public class IDxIProviderShape268S0200000_I2 implements AnonymousClass0PW {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxIProviderShape268S0200000_I2(C15900s6 r1, FbnsServiceDelegate fbnsServiceDelegate, int i) {
        this.A02 = i;
        this.A00 = fbnsServiceDelegate;
        this.A01 = r1;
    }

    public final /* bridge */ /* synthetic */ Object get() {
        return ((C15900s6) this.A01).A01.A0S;
    }
}
