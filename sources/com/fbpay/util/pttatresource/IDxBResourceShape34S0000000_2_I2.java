package com.fbpay.util.pttatresource;

import X.AnonymousClass76O;
import X.AnonymousClass7EC;
import X.AnonymousClass7Kx;
import X.C104996ci;
import X.C107446gl;
import X.C120977Dl;
import X.C142618fJ;
import X.C92975kL;

public class IDxBResourceShape34S0000000_2_I2 extends C92975kL {
    public final int A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IDxBResourceShape34S0000000_2_I2(C142618fJ r1, AnonymousClass76O r2, C104996ci r3, C120977Dl r4, int i) {
        super(r1, r2, r3, r4);
        this.A00 = i;
    }

    public final AnonymousClass7Kx A05(AnonymousClass7EC r2) {
        Throwable th = r2.A02;
        if (th != null) {
            return AnonymousClass7Kx.A0C(th);
        }
        Object obj = r2.A01;
        obj.getClass();
        return AnonymousClass7Kx.A0A(((C107446gl) obj).A00);
    }
}
