package com.facebook.redex;

import X.AnonymousClass7HL;
import X.C108876j6;
import X.C112936qR;
import X.C116996xx;
import X.C120967Dk;
import X.C143698hA;
import java.security.Signature;
import java.security.SignatureException;

public class IDxSCallbackShape852S0100000_2_I2 implements C143698hA {
    public Object A00;
    public final int A01;

    public IDxSCallbackShape852S0100000_2_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Throwable, java.lang.String] */
    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Throwable, java.lang.String] */
    public final void CuA(C120967Dk r4, C112936qR r5, byte[] bArr) {
        if (this.A01 != 0) {
            String e = 0;
            try {
                e = C116996xx.A00(AnonymousClass7HL.A01((AnonymousClass7HL) this.A00, r4.A01), bArr);
            } catch (Exception e2) {
            } finally {
                r5.A00(e2, e2);
            }
        } else {
            String e3 = 0;
            try {
                Signature signature = ((C108876j6) this.A00).A02;
                signature.getClass();
                e3 = C116996xx.A00(signature, bArr);
            } catch (SignatureException e32) {
            } finally {
                r5.A00(e32, e32);
            }
        }
    }
}
