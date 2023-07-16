package com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass;

import X.AnonymousClass0Sf;
import X.AnonymousClass0wJ;
import X.C18190wL;

public class KtCSuperShape0S0011000_I2 extends AnonymousClass0Sf {
    public int A00;
    public boolean A01;
    public final int A02;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public KtCSuperShape0S0011000_I2() {
        this(50, false, 2);
        this.A02 = 2;
    }

    public final boolean equals(Object obj) {
        int i;
        int i2;
        int i3;
        switch (this.A02) {
            case 1:
                if (this == obj) {
                    return true;
                }
                if (obj instanceof KtCSuperShape0S0011000_I2) {
                    KtCSuperShape0S0011000_I2 ktCSuperShape0S0011000_I2 = (KtCSuperShape0S0011000_I2) obj;
                    if (ktCSuperShape0S0011000_I2.A02 == 1 && this.A00 == ktCSuperShape0S0011000_I2.A00) {
                        i = this.A01;
                        i2 = ktCSuperShape0S0011000_I2.A01;
                        break;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            case 2:
                if (this != obj) {
                    i3 = 2;
                    break;
                } else {
                    return true;
                }
            case 3:
                if (this != obj) {
                    i3 = 3;
                    break;
                } else {
                    return true;
                }
            case 4:
                if (this != obj) {
                    i3 = 4;
                    break;
                } else {
                    return true;
                }
            case 6:
                if (this != obj) {
                    i3 = 6;
                    break;
                } else {
                    return true;
                }
            default:
                return super.equals(obj);
        }
        if (!(obj instanceof KtCSuperShape0S0011000_I2)) {
            return false;
        }
        KtCSuperShape0S0011000_I2 ktCSuperShape0S0011000_I22 = (KtCSuperShape0S0011000_I2) obj;
        if (ktCSuperShape0S0011000_I22.A02 != i3 || this.A01 != ktCSuperShape0S0011000_I22.A01) {
            return false;
        }
        i = this.A00;
        i2 = ktCSuperShape0S0011000_I22.A00;
        if (i != i2) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int i2;
        switch (this.A02) {
            case 1:
                i = this.A00 * 31;
                i2 = this.A01;
                if (i2 != 0) {
                    i2 = 1;
                    break;
                }
                break;
            case 2:
            case 3:
            case 4:
            case 6:
                boolean z = this.A01;
                if (z) {
                    z = true;
                }
                i = (z ? 1 : 0) * true;
                i2 = this.A00;
                break;
            default:
                return super.hashCode();
        }
        return i + i2;
    }

    public final String toString() {
        if (2 - this.A02 != 0) {
            return super.toString();
        }
        StringBuilder A0s = C18190wL.A0s("RtcTouchUpModel(enabled=");
        A0s.append(this.A01);
        A0s.append(", strength=");
        A0s.append(this.A00);
        return AnonymousClass0wJ.A0u(A0s);
    }

    public KtCSuperShape0S0011000_I2(int i, boolean z, int i2) {
        this.A02 = i2;
        this.A00 = i;
        this.A01 = z;
    }
}
