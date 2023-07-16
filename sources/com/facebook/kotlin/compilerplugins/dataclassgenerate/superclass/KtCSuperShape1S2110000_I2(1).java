package com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass;

import X.AnonymousClass006;
import X.AnonymousClass0Sf;
import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C143308gV;
import X.C18180wK;
import X.C18190wL;

public class KtCSuperShape1S2110000_I2 extends AnonymousClass0Sf implements C143308gV {
    public Object A00;
    public String A01;
    public String A02;
    public boolean A03;
    public final int A04;

    public KtCSuperShape1S2110000_I2(String str, String str2, int i, boolean z) {
        Integer num;
        this.A04 = i;
        if (i != 0) {
            AnonymousClass0wJ.A1O(str, str2);
            this.A02 = str;
            this.A01 = str2;
            this.A03 = z;
            num = AnonymousClass006.A0Y;
        } else {
            C04220Ms.A0B(str2, 2);
            this.A02 = str;
            this.A01 = str2;
            this.A03 = z;
            num = AnonymousClass006.A0u;
        }
        this.A00 = num;
    }

    public final Integer AgJ() {
        return (Integer) this.A00;
    }

    public final boolean equals(Object obj) {
        int i;
        if (this.A04 != 0) {
            i = 1;
            if (this == obj) {
                return true;
            }
        } else if (this == obj) {
            return true;
        } else {
            i = 0;
        }
        if (!(obj instanceof KtCSuperShape1S2110000_I2)) {
            return false;
        }
        KtCSuperShape1S2110000_I2 ktCSuperShape1S2110000_I2 = (KtCSuperShape1S2110000_I2) obj;
        if (ktCSuperShape1S2110000_I2.A04 != i || !C04220Ms.A0I(this.A02, ktCSuperShape1S2110000_I2.A02) || !C04220Ms.A0I(this.A01, ktCSuperShape1S2110000_I2.A01) || this.A03 != ktCSuperShape1S2110000_I2.A03) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A07 = AnonymousClass0wJ.A07(this.A01, C18180wK.A03(this.A02));
        boolean z = this.A03;
        if (z) {
            z = true;
        }
        return A07 + (z ? 1 : 0);
    }

    public final String toString() {
        StringBuilder A0s;
        if (this.A04 != 0) {
            A0s = C18190wL.A0s("TaskStepEvent(name=");
            A0s.append(this.A02);
            A0s.append(", extra=");
            A0s.append(this.A01);
            A0s.append(", isPrivate=");
            A0s.append(this.A03);
            A0s.append(')');
        } else {
            A0s = C18190wL.A0s("InfoEvent ");
            A0s.append(this.A02);
            A0s.append('=');
            A0s.append(this.A01);
        }
        return A0s.toString();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public KtCSuperShape1S2110000_I2(String str, String str2, int i, int i2) {
        this(str, (i & 2) != 0 ? "" : str2, 1, false);
        this.A04 = i2;
        if (i2 != 0) {
        } else {
            this(str, str2, 0, false);
        }
    }
}
