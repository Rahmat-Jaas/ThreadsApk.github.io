package com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass;

import X.AnonymousClass0Sf;
import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C18190wL;

public class KtCSuperShape0S2002000_I2 extends AnonymousClass0Sf {
    public int A00;
    public int A01;
    public String A02;
    public String A03;
    public final int A04;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public KtCSuperShape0S2002000_I2() {
        this("", -1, -1, 0, "");
        this.A04 = 0;
    }

    public final boolean equals(Object obj) {
        int i;
        String str;
        String str2;
        switch (this.A04) {
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
                if (this == obj) {
                    return true;
                }
                if (obj instanceof KtCSuperShape0S2002000_I2) {
                    KtCSuperShape0S2002000_I2 ktCSuperShape0S2002000_I2 = (KtCSuperShape0S2002000_I2) obj;
                    if (ktCSuperShape0S2002000_I2.A04 == 2 && this.A00 == ktCSuperShape0S2002000_I2.A00 && this.A01 == ktCSuperShape0S2002000_I2.A01 && C04220Ms.A0I(this.A03, ktCSuperShape0S2002000_I2.A03)) {
                        str = this.A02;
                        str2 = ktCSuperShape0S2002000_I2.A02;
                        break;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
                break;
        }
        if (!(obj instanceof KtCSuperShape0S2002000_I2)) {
            return false;
        }
        KtCSuperShape0S2002000_I2 ktCSuperShape0S2002000_I22 = (KtCSuperShape0S2002000_I2) obj;
        if (ktCSuperShape0S2002000_I22.A04 != i || this.A01 != ktCSuperShape0S2002000_I22.A01 || this.A00 != ktCSuperShape0S2002000_I22.A00 || !C04220Ms.A0I(this.A02, ktCSuperShape0S2002000_I22.A02)) {
            return false;
        }
        str = this.A03;
        str2 = ktCSuperShape0S2002000_I22.A03;
        if (!C04220Ms.A0I(str, str2)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int hashCode() {
        /*
            r2 = this;
            int r0 = r2.A04
            switch(r0) {
                case 0: goto L_0x0031;
                case 1: goto L_0x001c;
                default: goto L_0x0005;
            }
        L_0x0005:
            int r0 = r2.A00
            int r1 = r0 * 31
            int r0 = r2.A01
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r2.A03
            int r1 = X.AnonymousClass0wJ.A07(r0, r1)
            java.lang.String r0 = r2.A02
        L_0x0016:
            int r0 = r0.hashCode()
        L_0x001a:
            int r1 = r1 + r0
            return r1
        L_0x001c:
            int r0 = r2.A01
            int r1 = r0 * 31
            int r0 = r2.A00
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r2.A02
            int r1 = X.AnonymousClass0wJ.A07(r0, r1)
            java.lang.String r0 = r2.A03
            if (r0 != 0) goto L_0x0016
            r0 = 0
            goto L_0x001a
        L_0x0031:
            int r0 = r2.A01
            int r1 = r0 * 31
            int r0 = r2.A00
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r2.A02
            int r1 = X.AnonymousClass0wJ.A07(r0, r1)
            java.lang.String r0 = r2.A03
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2002000_I2.hashCode():int");
    }

    public final String toString() {
        if (this.A04 != 0) {
            return super.toString();
        }
        StringBuilder A0s = C18190wL.A0s("PatternMatch(startPosition=");
        A0s.append(this.A01);
        A0s.append(", length=");
        A0s.append(this.A00);
        A0s.append(", dictionaryId=");
        A0s.append(this.A02);
        A0s.append(", matchedDictionaryWord=");
        A0s.append(this.A03);
        return AnonymousClass0wJ.A0u(A0s);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public KtCSuperShape0S2002000_I2(int i, int i2, String str) {
        this(str, i, i2, 0, "");
        this.A04 = 0;
        C04220Ms.A0B(str, 3);
        this.A04 = 0;
    }

    public KtCSuperShape0S2002000_I2(String str, int i, int i2, int i3, String str2) {
        this.A04 = i3;
        switch (i3) {
            case 0:
                AnonymousClass0wJ.A1R(str, str2);
                break;
            case 1:
                C04220Ms.A0B(str, 3);
                break;
            default:
                AnonymousClass0wJ.A1R(str, str2);
                this.A00 = i;
                this.A01 = i2;
                this.A03 = str;
                this.A02 = str2;
                return;
        }
        this.A01 = i;
        this.A00 = i2;
        this.A02 = str;
        this.A03 = str2;
    }
}
