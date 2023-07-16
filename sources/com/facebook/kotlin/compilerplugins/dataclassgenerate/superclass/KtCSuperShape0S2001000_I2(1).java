package com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass;

import X.AnonymousClass0Sf;
import X.AnonymousClass0wJ;
import X.C18180wK;
import X.C18200wM;

public class KtCSuperShape0S2001000_I2 extends AnonymousClass0Sf {
    public int A00;
    public String A01;
    public String A02;
    public final int A03;

    public KtCSuperShape0S2001000_I2(int i, String str, String str2, int i2) {
        this.A03 = i2;
        switch (i2) {
            case 1:
            case 2:
            case 3:
                AnonymousClass0wJ.A1Q(str, str2);
                this.A00 = i;
                this.A01 = str;
                this.A02 = str2;
                return;
            default:
                this.A00 = i;
                this.A02 = str;
                this.A01 = str2;
                return;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002a, code lost:
        if (X.C04220Ms.A0I(r1, r0) != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x007d, code lost:
        if ((r3 instanceof com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2001000_I2) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x007f, code lost:
        r3 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2001000_I2) r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0083, code lost:
        if (r3.A03 != r1) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0089, code lost:
        if (r2.A00 != r3.A00) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0093, code lost:
        if (X.C04220Ms.A0I(r2.A01, r3.A01) != false) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x009b, code lost:
        r1 = r2.A02;
        r0 = r3.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:?, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            int r0 = r2.A03
            switch(r0) {
                case 1: goto L_0x0096;
                case 2: goto L_0x0078;
                case 3: goto L_0x002e;
                case 4: goto L_0x0050;
                case 5: goto L_0x0032;
                default: goto L_0x0005;
            }
        L_0x0005:
            if (r2 == r3) goto L_0x0099
            r1 = 6
            boolean r0 = r3 instanceof com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2001000_I2
            if (r0 == 0) goto L_0x002c
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2001000_I2 r3 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2001000_I2) r3
            int r0 = r3.A03
            if (r0 != r1) goto L_0x002c
            int r1 = r2.A00
            int r0 = r3.A00
            if (r1 != r0) goto L_0x002c
            java.lang.String r1 = r2.A02
            java.lang.String r0 = r3.A02
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 == 0) goto L_0x002c
            java.lang.String r1 = r2.A01
            java.lang.String r0 = r3.A01
        L_0x0026:
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 != 0) goto L_0x0099
        L_0x002c:
            r0 = 0
            return r0
        L_0x002e:
            if (r2 == r3) goto L_0x0099
            r1 = 3
            goto L_0x007b
        L_0x0032:
            if (r2 == r3) goto L_0x0099
            r1 = 5
            boolean r0 = r3 instanceof com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2001000_I2
            if (r0 == 0) goto L_0x002c
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2001000_I2 r3 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2001000_I2) r3
            int r0 = r3.A03
            if (r0 != r1) goto L_0x002c
            java.lang.String r1 = r2.A01
            java.lang.String r0 = r3.A01
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 == 0) goto L_0x002c
            int r1 = r2.A00
            int r0 = r3.A00
            if (r1 == r0) goto L_0x009b
            goto L_0x002c
        L_0x0050:
            if (r2 == r3) goto L_0x0099
            r1 = 4
            boolean r0 = r3 instanceof com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2001000_I2
            if (r0 == 0) goto L_0x002c
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2001000_I2 r3 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2001000_I2) r3
            int r0 = r3.A03
            if (r0 != r1) goto L_0x002c
            java.lang.String r1 = r2.A01
            java.lang.String r0 = r3.A01
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 == 0) goto L_0x002c
            java.lang.String r1 = r2.A02
            java.lang.String r0 = r3.A02
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 == 0) goto L_0x002c
            int r1 = r2.A00
            int r0 = r3.A00
            if (r1 == r0) goto L_0x0099
            goto L_0x002c
        L_0x0078:
            if (r2 == r3) goto L_0x0099
            r1 = 2
        L_0x007b:
            boolean r0 = r3 instanceof com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2001000_I2
            if (r0 == 0) goto L_0x002c
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2001000_I2 r3 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2001000_I2) r3
            int r0 = r3.A03
            if (r0 != r1) goto L_0x002c
            int r1 = r2.A00
            int r0 = r3.A00
            if (r1 != r0) goto L_0x002c
            java.lang.String r1 = r2.A01
            java.lang.String r0 = r3.A01
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 != 0) goto L_0x009b
            goto L_0x002c
        L_0x0096:
            r1 = 1
            if (r2 != r3) goto L_0x007b
        L_0x0099:
            r0 = 1
            return r0
        L_0x009b:
            java.lang.String r1 = r2.A02
            java.lang.String r0 = r3.A02
            goto L_0x0026
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2001000_I2.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int A07;
        int i;
        int A032;
        int i2;
        switch (this.A03) {
            case 4:
                A07 = AnonymousClass0wJ.A07(this.A02, C18180wK.A03(this.A01));
                i = this.A00;
                break;
            case 5:
                A032 = C18180wK.A03(this.A01);
                i2 = this.A00;
                break;
            case 6:
                i = ((this.A00 * 31) + AnonymousClass0wJ.A06(this.A02)) * 31;
                A07 = C18200wM.A09(this.A01);
                break;
            default:
                A032 = this.A00 * 31;
                i2 = this.A01.hashCode();
                break;
        }
        A07 = (A032 + i2) * 31;
        i = this.A02.hashCode();
        return i + A07;
    }

    public KtCSuperShape0S2001000_I2(String str, String str2, int i) {
        this.A03 = 4;
        AnonymousClass0wJ.A1O(str, str2);
        this.A01 = str;
        this.A02 = str2;
        this.A00 = i;
    }
}
