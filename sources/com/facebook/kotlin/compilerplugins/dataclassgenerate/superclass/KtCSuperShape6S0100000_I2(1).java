package com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass;

import X.AnonymousClass0Sf;
import X.BKU;
import X.C04220Ms;
import X.C90535Mj;
import X.C90555Ml;
import com.instagram.pendingmedia.model.PendingMedia;

public class KtCSuperShape6S0100000_I2 extends AnonymousClass0Sf {
    public Object A00;
    public final int A01 = 0;

    public KtCSuperShape6S0100000_I2(BKU bku) {
        C04220Ms.A0B(bku, 1);
        this.A00 = bku;
    }

    public static boolean A00(int i, Object obj) {
        if (!(obj instanceof KtCSuperShape6S0100000_I2) || ((KtCSuperShape6S0100000_I2) obj).A01 != i) {
            return false;
        }
        return true;
    }

    public final String A01() {
        String str;
        if (this.A01 != 0) {
            str = ((PendingMedia) this.A00).A2Y;
        } else {
            str = ((BKU) this.A00).A0f.A4Y;
        }
        C04220Ms.A06(str);
        return str;
    }

    public final String A02() {
        C90555Ml r0;
        C90535Mj r02;
        BKU bku;
        if (this.A01 != 0 || (r0 = ((BKU) this.A00).A0f.A1J) == null || (r02 = r0.A03) == null || (bku = r02.A02) == null) {
            return null;
        }
        return bku.A0f.A4Y;
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
        if (!A00(i, obj) || !C04220Ms.A0I(this.A00, ((KtCSuperShape6S0100000_I2) obj).A00)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public KtCSuperShape6S0100000_I2(PendingMedia pendingMedia) {
        this.A00 = pendingMedia;
    }
}
