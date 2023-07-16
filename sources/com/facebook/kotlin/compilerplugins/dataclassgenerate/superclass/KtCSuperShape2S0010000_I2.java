package com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass;

import X.AnonymousClass0Sf;
import X.C142378el;

public class KtCSuperShape2S0010000_I2 extends AnonymousClass0Sf implements C142378el {
    public boolean A00;
    public final int A01;

    public KtCSuperShape2S0010000_I2(boolean z, int i) {
        this.A01 = i;
        this.A00 = z;
    }

    public final boolean equals(Object obj) {
        int i;
        switch (this.A01) {
            case 0:
                if (this != obj) {
                    i = 0;
                    break;
                } else {
                    return true;
                }
            case 1:
                i = 1;
                if (this == obj) {
                    return true;
                }
                break;
            default:
                if (this != obj) {
                    i = 2;
                    break;
                } else {
                    return true;
                }
        }
        if (!(obj instanceof KtCSuperShape2S0010000_I2)) {
            return false;
        }
        KtCSuperShape2S0010000_I2 ktCSuperShape2S0010000_I2 = (KtCSuperShape2S0010000_I2) obj;
        if (ktCSuperShape2S0010000_I2.A01 == i && this.A00 == ktCSuperShape2S0010000_I2.A00) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        boolean z = this.A00;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }
}
