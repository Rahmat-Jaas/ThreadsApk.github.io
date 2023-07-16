package com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass;

import X.AnonymousClass000;
import X.AnonymousClass0Sf;
import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C18190wL;

public class KtCSuperShape0S2000100_I2 extends AnonymousClass0Sf {
    public long A00;
    public String A01;
    public String A02;
    public final int A03;

    public KtCSuperShape0S2000100_I2(int i, String str, String str2, long j) {
        this.A03 = i;
        switch (i) {
            case 1:
                C04220Ms.A0B(str, 1);
                this.A01 = str;
                this.A02 = str2;
                break;
            case 2:
                AnonymousClass0wJ.A1O(str, str2);
                break;
        }
        this.A02 = str;
        this.A01 = str2;
        this.A00 = j;
    }

    public final boolean equals(Object obj) {
        KtCSuperShape0S2000100_I2 ktCSuperShape0S2000100_I2;
        String str;
        String str2;
        switch (this.A03) {
            case 1:
                if (this == obj) {
                    return true;
                }
                if (obj instanceof KtCSuperShape0S2000100_I2) {
                    ktCSuperShape0S2000100_I2 = (KtCSuperShape0S2000100_I2) obj;
                    if (ktCSuperShape0S2000100_I2.A03 == 1 && C04220Ms.A0I(this.A01, ktCSuperShape0S2000100_I2.A01)) {
                        str = this.A02;
                        str2 = ktCSuperShape0S2000100_I2.A02;
                        break;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            case 2:
                if (this == obj) {
                    return true;
                }
                if (obj instanceof KtCSuperShape0S2000100_I2) {
                    ktCSuperShape0S2000100_I2 = (KtCSuperShape0S2000100_I2) obj;
                    if (ktCSuperShape0S2000100_I2.A03 == 2 && C04220Ms.A0I(this.A02, ktCSuperShape0S2000100_I2.A02)) {
                        str = this.A01;
                        str2 = ktCSuperShape0S2000100_I2.A01;
                        break;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
                break;
            default:
                return super.equals(obj);
        }
        if (!C04220Ms.A0I(str, str2) || this.A00 != ktCSuperShape0S2000100_I2.A00) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int hashCode() {
        /*
            r3 = this;
            int r0 = r3.A03
            switch(r0) {
                case 1: goto L_0x000a;
                case 2: goto L_0x0020;
                default: goto L_0x0005;
            }
        L_0x0005:
            int r2 = super.hashCode()
            return r2
        L_0x000a:
            java.lang.String r0 = r3.A01
            int r1 = X.C18180wK.A03(r0)
            java.lang.String r0 = r3.A02
            if (r0 != 0) goto L_0x0028
            r0 = 0
        L_0x0015:
            int r1 = r1 + r0
            int r2 = r1 * 31
            long r0 = r3.A00
            int r0 = X.C18190wL.A02(r0)
            int r2 = r2 + r0
            return r2
        L_0x0020:
            java.lang.String r0 = r3.A02
            int r1 = X.C18180wK.A03(r0)
            java.lang.String r0 = r3.A01
        L_0x0028:
            int r0 = r0.hashCode()
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2000100_I2.hashCode():int");
    }

    public final String toString() {
        if (3 - this.A03 != 0) {
            return super.toString();
        }
        StringBuilder A0s = C18190wL.A0s("Marker(pointName=");
        A0s.append(this.A02);
        A0s.append(AnonymousClass000.A00(85));
        A0s.append(this.A01);
        A0s.append(", time=");
        A0s.append(this.A00);
        return AnonymousClass0wJ.A0u(A0s);
    }

    public KtCSuperShape0S2000100_I2(String str, String str2, long j) {
        this.A03 = 0;
        AnonymousClass0wJ.A1P(str, str2);
        this.A02 = str;
        this.A00 = j;
        this.A01 = str2;
    }
}
