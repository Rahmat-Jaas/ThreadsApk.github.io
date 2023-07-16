package com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass;

import X.AnonymousClass0Sf;
import X.C86134wK;

public class KtCSuperShape0S0001000_I2 extends AnonymousClass0Sf {
    public int A00;
    public final int A01;

    public KtCSuperShape0S0001000_I2(int i, int i2) {
        this.A01 = i2;
        this.A00 = i;
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
            case 2:
                if (this != obj) {
                    i = 2;
                    break;
                } else {
                    return true;
                }
            case 3:
                if (this != obj) {
                    i = 3;
                    break;
                } else {
                    return true;
                }
            default:
                return super.equals(obj);
        }
        if (!(obj instanceof KtCSuperShape0S0001000_I2)) {
            return false;
        }
        KtCSuperShape0S0001000_I2 ktCSuperShape0S0001000_I2 = (KtCSuperShape0S0001000_I2) obj;
        if (ktCSuperShape0S0001000_I2.A01 == i && this.A00 == ktCSuperShape0S0001000_I2.A00) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        switch (this.A01) {
            case 0:
            case 2:
            case 3:
                return this.A00;
            default:
                return super.hashCode();
        }
    }

    public final String toString() {
        if (3 - this.A01 != 0) {
            return super.toString();
        }
        return C86134wK.A0r("VideoViewabilityResult(viewabilityPercentage=", this.A00);
    }
}
