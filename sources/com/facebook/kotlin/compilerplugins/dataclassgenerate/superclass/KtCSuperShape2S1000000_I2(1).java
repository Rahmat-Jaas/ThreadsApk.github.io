package com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass;

import X.AnonymousClass0Sf;
import X.AnonymousClass0wJ;
import X.C04220Ms;

public class KtCSuperShape2S1000000_I2 extends AnonymousClass0Sf {
    public String A00;
    public final int A01;

    public KtCSuperShape2S1000000_I2(String str, int i) {
        this.A01 = i;
        this.A00 = str;
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
        if (!(obj instanceof KtCSuperShape2S1000000_I2)) {
            return false;
        }
        KtCSuperShape2S1000000_I2 ktCSuperShape2S1000000_I2 = (KtCSuperShape2S1000000_I2) obj;
        if (ktCSuperShape2S1000000_I2.A01 != i || !C04220Ms.A0I(this.A00, ktCSuperShape2S1000000_I2.A00)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass0wJ.A06(this.A00);
    }
}
