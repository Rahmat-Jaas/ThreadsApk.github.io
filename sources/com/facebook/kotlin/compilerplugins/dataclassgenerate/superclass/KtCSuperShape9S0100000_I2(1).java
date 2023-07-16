package com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass;

import X.AnonymousClass0Sf;
import X.AnonymousClass0YY;
import X.AnonymousClass8f7;
import X.C04220Ms;
import X.C79594kK;
import com.instagram.common.typedurl.ImageUrl;

public class KtCSuperShape9S0100000_I2 extends AnonymousClass0Sf implements AnonymousClass8f7 {
    public Object A00;
    public final int A01 = 0;

    public KtCSuperShape9S0100000_I2(AnonymousClass0YY r2) {
        C04220Ms.A0B(r2, 1);
        this.A00 = r2;
    }

    public static boolean A00(int i, Object obj) {
        if (!(obj instanceof KtCSuperShape9S0100000_I2) || ((KtCSuperShape9S0100000_I2) obj).A01 != i) {
            return false;
        }
        return true;
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
        if (!A00(i, obj) || !C04220Ms.A0I(this.A00, ((KtCSuperShape9S0100000_I2) obj).A00)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public KtCSuperShape9S0100000_I2(ImageUrl imageUrl) {
        this.A00 = imageUrl;
    }

    public KtCSuperShape9S0100000_I2() {
        this((AnonymousClass0YY) C79594kK.A00);
    }
}
