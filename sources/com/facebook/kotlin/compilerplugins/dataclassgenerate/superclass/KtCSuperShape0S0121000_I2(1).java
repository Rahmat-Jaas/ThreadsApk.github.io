package com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass;

import X.AnonymousClass0Sf;
import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C18190wL;
import X.C18210wN;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import java.util.List;

public class KtCSuperShape0S0121000_I2 extends AnonymousClass0Sf {
    public int A00;
    public Object A01;
    public boolean A02;
    public boolean A03;
    public final int A04 = 0;

    public KtCSuperShape0S0121000_I2(PendingRecipient pendingRecipient, int i, boolean z, boolean z2) {
        this.A01 = pendingRecipient;
        this.A00 = i;
        this.A02 = z;
        this.A03 = z2;
    }

    public final boolean equals(Object obj) {
        KtCSuperShape0S0121000_I2 ktCSuperShape0S0121000_I2;
        if (this.A04 != 0) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof KtCSuperShape0S0121000_I2)) {
                return false;
            }
            ktCSuperShape0S0121000_I2 = (KtCSuperShape0S0121000_I2) obj;
            if (!(ktCSuperShape0S0121000_I2.A04 == 1 && this.A00 == ktCSuperShape0S0121000_I2.A00 && C04220Ms.A0I(this.A01, ktCSuperShape0S0121000_I2.A01))) {
                return false;
            }
        } else if (this == obj) {
            return true;
        } else {
            if (!(obj instanceof KtCSuperShape0S0121000_I2)) {
                return false;
            }
            ktCSuperShape0S0121000_I2 = (KtCSuperShape0S0121000_I2) obj;
            if (!(ktCSuperShape0S0121000_I2.A04 == 0 && C04220Ms.A0I(this.A01, ktCSuperShape0S0121000_I2.A01) && this.A00 == ktCSuperShape0S0121000_I2.A00)) {
                return false;
            }
        }
        if (this.A02 == ktCSuperShape0S0121000_I2.A02 && this.A03 == ktCSuperShape0S0121000_I2.A03) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int A042;
        int i;
        if (this.A04 != 0) {
            A042 = this.A00 * 31;
            i = this.A01.hashCode();
        } else {
            A042 = C18210wN.A04(this.A01);
            i = this.A00;
        }
        int i2 = (A042 + i) * 31;
        boolean z = this.A02;
        int i3 = 1;
        if (z) {
            z = true;
        }
        int i4 = (i2 + (z ? 1 : 0)) * 31;
        if (!this.A03) {
            i3 = 0;
        }
        return i4 + i3;
    }

    public final String toString() {
        if (1 - this.A04 != 0) {
            return super.toString();
        }
        StringBuilder A0s = C18190wL.A0s("TooltipData(duration=");
        A0s.append(this.A00);
        A0s.append(", items=");
        A0s.append(this.A01);
        A0s.append(", revoking=");
        A0s.append(this.A02);
        A0s.append(", visualized=");
        A0s.append(this.A03);
        return AnonymousClass0wJ.A0u(A0s);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public KtCSuperShape0S0121000_I2(List list, int i, int i2, boolean z) {
        this(list, i, (i2 & 4) != 0 ? false : z, false);
    }

    public KtCSuperShape0S0121000_I2(List list, int i, boolean z, boolean z2) {
        this.A00 = i;
        this.A01 = list;
        this.A02 = z;
        this.A03 = z2;
    }
}
