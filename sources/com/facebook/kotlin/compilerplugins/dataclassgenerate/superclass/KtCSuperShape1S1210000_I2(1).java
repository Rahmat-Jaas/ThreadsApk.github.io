package com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass;

import X.AnonymousClass006;
import X.AnonymousClass0Sf;
import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C143308gV;
import X.C18180wK;
import X.C18190wL;
import X.C86164wN;
import java.util.List;
import java.util.Map;

public class KtCSuperShape1S1210000_I2 extends AnonymousClass0Sf implements C143308gV {
    public Object A00;
    public Object A01;
    public String A02;
    public final int A03;

    public KtCSuperShape1S1210000_I2(String str, int i, Map map) {
        Integer num;
        this.A03 = i;
        if (i != 0) {
            C04220Ms.A0B(str, 1);
            this.A02 = str;
            this.A01 = map;
            num = AnonymousClass006.A1C;
        } else {
            this.A02 = str;
            this.A01 = map;
            num = AnonymousClass006.A15;
        }
        this.A00 = num;
    }

    public final Integer AgJ() {
        return (Integer) this.A00;
    }

    public final boolean equals(Object obj) {
        int i;
        switch (this.A03) {
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
        if (!(obj instanceof KtCSuperShape1S1210000_I2)) {
            return false;
        }
        KtCSuperShape1S1210000_I2 ktCSuperShape1S1210000_I2 = (KtCSuperShape1S1210000_I2) obj;
        if (ktCSuperShape1S1210000_I2.A03 != i || !C04220Ms.A0I(this.A02, ktCSuperShape1S1210000_I2.A02) || !C04220Ms.A0I(this.A01, ktCSuperShape1S1210000_I2.A01)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass0wJ.A05(this.A01, C18180wK.A03(this.A02)) + 1;
    }

    public final String toString() {
        String str;
        switch (this.A03) {
            case 0:
                str = "InfoEventMap(name=";
                break;
            case 1:
                str = "SignalListEvent(name=";
                break;
            default:
                str = "SignalMapEvent(name=";
                break;
        }
        StringBuilder A0s = C18190wL.A0s(str);
        A0s.append(this.A02);
        A0s.append(", extra=");
        A0s.append(this.A01);
        C86164wN.A1M(A0s, ", isPrivate=");
        return AnonymousClass0wJ.A0u(A0s);
    }

    public KtCSuperShape1S1210000_I2(String str, List list) {
        this.A03 = 1;
        this.A03 = 1;
        C04220Ms.A0B(list, 2);
        this.A02 = str;
        this.A01 = list;
        this.A00 = AnonymousClass006.A1L;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public KtCSuperShape1S1210000_I2(String str, Map map) {
        this(str, 2, map);
        this.A03 = 2;
    }
}
