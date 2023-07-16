package com.facebook.redex;

import X.AnonymousClass0P1;
import X.AnonymousClass0PW;

public class IDxIProviderShape675S0100000_I2 implements AnonymousClass0PW {
    public Object A00;
    public final int A01;

    public IDxIProviderShape675S0100000_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final /* bridge */ /* synthetic */ Object get() {
        boolean A002;
        switch (this.A01) {
            case 0:
                A002 = ((AnonymousClass0P1) this.A00).A0J.A00();
                break;
            case 1:
                return Long.valueOf(((long) (1 << 7)) | 0);
            case 2:
                return null;
            default:
                A002 = false;
                break;
        }
        return Boolean.valueOf(A002);
    }
}
