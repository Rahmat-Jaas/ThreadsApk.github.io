package com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass;

import X.AnonymousClass006;
import X.AnonymousClass0Sf;
import X.AnonymousClass0ZV;
import X.AnonymousClass0wJ;
import X.AnonymousClass8f9;
import X.C04220Ms;
import X.C18210wN;
import X.C302320f;
import X.C86144wL;
import java.util.List;

public class KtCSuperShape0S0201000_I2 extends AnonymousClass0Sf {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03 = 1;

    public KtCSuperShape0S0201000_I2(C302320f r2, List list, int i) {
        C04220Ms.A0B(r2, 3);
        this.A00 = i;
        this.A02 = list;
        this.A01 = r2;
    }

    public final boolean equals(Object obj) {
        KtCSuperShape0S0201000_I2 ktCSuperShape0S0201000_I2;
        Object obj2;
        Object obj3;
        switch (this.A03) {
            case 0:
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof KtCSuperShape0S0201000_I2)) {
                    return false;
                }
                KtCSuperShape0S0201000_I2 ktCSuperShape0S0201000_I22 = (KtCSuperShape0S0201000_I2) obj;
                if (ktCSuperShape0S0201000_I22.A03 == 0 && this.A00 == ktCSuperShape0S0201000_I22.A00 && C04220Ms.A0I(this.A02, ktCSuperShape0S0201000_I22.A02) && this.A01 == ktCSuperShape0S0201000_I22.A01) {
                    return true;
                }
                return false;
            case 1:
                if (this == obj) {
                    return true;
                }
                if (obj instanceof KtCSuperShape0S0201000_I2) {
                    ktCSuperShape0S0201000_I2 = (KtCSuperShape0S0201000_I2) obj;
                    if (ktCSuperShape0S0201000_I2.A03 == 1 && this.A02 == ktCSuperShape0S0201000_I2.A02) {
                        obj2 = this.A01;
                        obj3 = ktCSuperShape0S0201000_I2.A01;
                        break;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            default:
                if (this == obj) {
                    return true;
                }
                if (obj instanceof KtCSuperShape0S0201000_I2) {
                    ktCSuperShape0S0201000_I2 = (KtCSuperShape0S0201000_I2) obj;
                    if (ktCSuperShape0S0201000_I2.A03 == 2 && C04220Ms.A0I(this.A01, ktCSuperShape0S0201000_I2.A01)) {
                        obj2 = this.A02;
                        obj3 = ktCSuperShape0S0201000_I2.A02;
                        break;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
                break;
        }
        if (!C04220Ms.A0I(obj2, obj3) || this.A00 != ktCSuperShape0S0201000_I2.A00) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A05;
        int hashCode;
        String str;
        int A0B;
        Object obj;
        switch (this.A03) {
            case 0:
                A05 = AnonymousClass0wJ.A05(this.A02, this.A00 * 31);
                hashCode = this.A01.hashCode();
                break;
            case 1:
                int A04 = AnonymousClass0wJ.A04(this.A02);
                switch (A04) {
                    case 1:
                        str = "Success";
                        break;
                    case 2:
                        str = "Error";
                        break;
                    default:
                        str = "Loading";
                        break;
                }
                A0B = C86144wL.A0B(str, A04) * 31;
                obj = this.A01;
                break;
            default:
                A0B = C18210wN.A04(this.A01);
                obj = this.A02;
                break;
        }
        A05 = AnonymousClass0wJ.A05(obj, A0B);
        hashCode = this.A00;
        return A05 + hashCode;
    }

    public KtCSuperShape0S0201000_I2(AnonymousClass8f9 r2, List list, int i) {
        this.A01 = list;
        this.A02 = r2;
        this.A00 = i;
    }

    public KtCSuperShape0S0201000_I2(Integer num, List list, int i) {
        this.A02 = num;
        this.A01 = list;
        this.A00 = i;
    }

    public KtCSuperShape0S0201000_I2() {
        this(AnonymousClass006.A00, (List) AnonymousClass0ZV.A00, 0);
    }
}
