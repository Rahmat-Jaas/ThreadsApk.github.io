package com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass;

import X.AnonymousClass0Sf;
import X.AnonymousClass0wJ;
import X.AnonymousClass8s2;
import X.C04220Ms;
import X.C142338eh;
import X.C18180wK;
import X.C18220wO;
import X.C36483JXj;

public class KtCSuperShape0S2102000_I2 extends AnonymousClass0Sf implements C142338eh {
    public int A00;
    public int A01;
    public Object A02;
    public String A03;
    public String A04;
    public final int A05 = 1;

    public KtCSuperShape0S2102000_I2(String str, String str2, AnonymousClass8s2 r4, int i, int i2) {
        C04220Ms.A0B(r4, 5);
        this.A04 = str;
        this.A01 = i;
        this.A00 = i2;
        this.A03 = str2;
        this.A02 = r4;
    }

    public final boolean equals(Object obj) {
        int i;
        if (this.A05 != 0) {
            i = 1;
            if (this == obj) {
                return true;
            }
        } else if (this == obj) {
            return true;
        } else {
            i = 0;
        }
        if (!(obj instanceof KtCSuperShape0S2102000_I2)) {
            return false;
        }
        KtCSuperShape0S2102000_I2 ktCSuperShape0S2102000_I2 = (KtCSuperShape0S2102000_I2) obj;
        if (ktCSuperShape0S2102000_I2.A05 != i || !C04220Ms.A0I(this.A04, ktCSuperShape0S2102000_I2.A04) || this.A01 != ktCSuperShape0S2102000_I2.A01 || this.A00 != ktCSuperShape0S2102000_I2.A00 || !C04220Ms.A0I(this.A03, ktCSuperShape0S2102000_I2.A03) || !C04220Ms.A0I(this.A02, ktCSuperShape0S2102000_I2.A02)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C18220wO.A06(this.A02, (((((C18180wK.A03(this.A04) + this.A01) * 31) + this.A00) * 31) + AnonymousClass0wJ.A06(this.A03)) * 31);
    }

    public KtCSuperShape0S2102000_I2(C36483JXj jXj, String str, String str2, int i, int i2) {
        this.A04 = str;
        this.A01 = i;
        this.A00 = i2;
        this.A03 = str2;
        this.A02 = jXj;
    }
}
