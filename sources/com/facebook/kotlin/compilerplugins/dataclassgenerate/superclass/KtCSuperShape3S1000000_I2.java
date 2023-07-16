package com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass;

import X.AnonymousClass0Sf;
import X.C04220Ms;
import X.C144668is;

public class KtCSuperShape3S1000000_I2 extends AnonymousClass0Sf implements C144668is {
    public String A00;
    public final int A01;

    public KtCSuperShape3S1000000_I2(String str, int i) {
        this.A01 = i;
        if (i != 0) {
            C04220Ms.A0B(str, 1);
        }
        this.A00 = str;
    }

    public final String B3L() {
        return this.A00;
    }

    public final boolean equals(Object obj) {
        int i;
        if (this.A01 != 0) {
            i = 1;
            if (this == obj) {
                return true;
            }
        } else if (this == obj) {
            return true;
        } else {
            i = 0;
        }
        if (!(obj instanceof KtCSuperShape3S1000000_I2)) {
            return false;
        }
        KtCSuperShape3S1000000_I2 ktCSuperShape3S1000000_I2 = (KtCSuperShape3S1000000_I2) obj;
        if (ktCSuperShape3S1000000_I2.A01 != i || !C04220Ms.A0I(this.A00, ktCSuperShape3S1000000_I2.A00)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }
}
