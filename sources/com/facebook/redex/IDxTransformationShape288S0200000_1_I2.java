package com.facebook.redex;

import X.AnonymousClass3D9;
import X.AnonymousClass3DI;
import X.C29571yr;
import X.C566538a;
import X.C84804tt;

public class IDxTransformationShape288S0200000_1_I2 implements C84804tt {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxTransformationShape288S0200000_1_I2(AnonymousClass3D9 r1, C29571yr r2, int i) {
        this.A02 = i;
        this.A00 = r2;
        this.A01 = r1;
    }

    public final /* bridge */ /* synthetic */ Object D7Y(AnonymousClass3DI r3, Object obj) {
        switch (this.A02) {
            case 0:
                String str = (String) obj;
                AnonymousClass3D9 r1 = (AnonymousClass3D9) this.A01;
                r1.A06 = str;
                r1.A01.A05 = str;
                return r1;
            case 1:
                AnonymousClass3D9 r12 = (AnonymousClass3D9) this.A01;
                r12.A02 = (C566538a) obj;
                return r12;
            default:
                String str2 = (String) obj;
                AnonymousClass3D9 r13 = (AnonymousClass3D9) this.A01;
                r13.A07 = str2;
                r13.A01.A09 = str2;
                return r13;
        }
    }
}
