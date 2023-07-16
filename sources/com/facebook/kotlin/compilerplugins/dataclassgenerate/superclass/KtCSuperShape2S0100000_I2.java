package com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass;

import X.AnonymousClass0Sf;
import X.AnonymousClass0ZU;
import X.C04220Ms;
import X.C81314na;

public class KtCSuperShape2S0100000_I2 extends AnonymousClass0Sf implements C81314na {
    public Object A00;
    public final int A01;

    public KtCSuperShape2S0100000_I2(AnonymousClass0ZU r2, int i) {
        this.A01 = i;
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
                break;
            default:
                C04220Ms.A0B(r2, 1);
                break;
        }
        this.A00 = r2;
    }

    public static boolean A00(int i, Object obj) {
        if (!(obj instanceof KtCSuperShape2S0100000_I2) || ((KtCSuperShape2S0100000_I2) obj).A01 != i) {
            return false;
        }
        return true;
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
            case 2:
                if (this != obj) {
                    i = 2;
                    break;
                } else {
                    return true;
                }
            case 3:
                if (this != obj) {
                    i = 3;
                    break;
                } else {
                    return true;
                }
            default:
                if (this != obj) {
                    i = 4;
                    break;
                } else {
                    return true;
                }
        }
        if (!A00(i, obj) || !C04220Ms.A0I(this.A00, ((KtCSuperShape2S0100000_I2) obj).A00)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }
}
