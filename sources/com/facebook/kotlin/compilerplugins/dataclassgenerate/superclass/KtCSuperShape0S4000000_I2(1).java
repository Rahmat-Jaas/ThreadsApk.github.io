package com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass;

import X.AnonymousClass0Sf;
import X.AnonymousClass0wJ;
import X.C18190wL;

public class KtCSuperShape0S4000000_I2 extends AnonymousClass0Sf {
    public String A00;
    public String A01;
    public String A02;
    public String A03;
    public final int A04;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public KtCSuperShape0S4000000_I2(String str) {
        this((String) null, str, (String) null, (String) null, 10);
        this.A04 = 10;
    }

    public static boolean A00(int i, Object obj) {
        if (!(obj instanceof KtCSuperShape0S4000000_I2) || ((KtCSuperShape0S4000000_I2) obj).A04 != i) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:104:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00d5, code lost:
        if (A00(r0, r3) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00d7, code lost:
        r3 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4000000_I2) r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00e1, code lost:
        if (X.C04220Ms.A0I(r2.A00, r3.A00) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00e3, code lost:
        r1 = r2.A01;
        r0 = r3.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0105, code lost:
        if (X.C04220Ms.A0I(r1, r0) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0107, code lost:
        r1 = r2.A02;
        r0 = r3.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x010f, code lost:
        if (X.C04220Ms.A0I(r1, r0) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0111, code lost:
        r1 = r2.A03;
        r0 = r3.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0119, code lost:
        if (X.C04220Ms.A0I(r1, r0) != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:?, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            int r0 = r2.A04
            switch(r0) {
                case 1: goto L_0x00e8;
                case 2: goto L_0x0005;
                case 3: goto L_0x00ce;
                case 4: goto L_0x00ca;
                case 5: goto L_0x009c;
                case 6: goto L_0x006e;
                case 7: goto L_0x006a;
                case 8: goto L_0x0065;
                case 9: goto L_0x0060;
                case 10: goto L_0x0030;
                case 11: goto L_0x000a;
                default: goto L_0x0005;
            }
        L_0x0005:
            boolean r0 = super.equals(r3)
            return r0
        L_0x000a:
            if (r2 == r3) goto L_0x011d
            r0 = 11
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x011b
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4000000_I2 r3 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4000000_I2) r3
            java.lang.String r1 = r2.A02
            java.lang.String r0 = r3.A02
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 == 0) goto L_0x011b
            java.lang.String r1 = r2.A00
            java.lang.String r0 = r3.A00
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 == 0) goto L_0x011b
            java.lang.String r1 = r2.A01
            java.lang.String r0 = r3.A01
            goto L_0x010b
        L_0x0030:
            if (r2 == r3) goto L_0x011d
            r0 = 10
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x011b
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4000000_I2 r3 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4000000_I2) r3
            java.lang.String r1 = r2.A02
            java.lang.String r0 = r3.A02
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 == 0) goto L_0x011b
            java.lang.String r1 = r2.A03
            java.lang.String r0 = r3.A03
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 == 0) goto L_0x011b
            java.lang.String r1 = r2.A01
            java.lang.String r0 = r3.A01
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 == 0) goto L_0x011b
            java.lang.String r1 = r2.A00
            java.lang.String r0 = r3.A00
            goto L_0x0115
        L_0x0060:
            if (r2 == r3) goto L_0x011d
            r0 = 9
            goto L_0x00d1
        L_0x0065:
            if (r2 == r3) goto L_0x011d
            r0 = 8
            goto L_0x00d1
        L_0x006a:
            if (r2 == r3) goto L_0x011d
            r0 = 7
            goto L_0x00d1
        L_0x006e:
            if (r2 == r3) goto L_0x011d
            r0 = 6
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x011b
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4000000_I2 r3 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4000000_I2) r3
            java.lang.String r1 = r2.A01
            java.lang.String r0 = r3.A01
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 == 0) goto L_0x011b
            java.lang.String r1 = r2.A03
            java.lang.String r0 = r3.A03
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 == 0) goto L_0x011b
            java.lang.String r1 = r2.A00
            java.lang.String r0 = r3.A00
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 == 0) goto L_0x011b
            java.lang.String r1 = r2.A02
            java.lang.String r0 = r3.A02
            goto L_0x0115
        L_0x009c:
            if (r2 == r3) goto L_0x011d
            r0 = 5
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x011b
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4000000_I2 r3 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4000000_I2) r3
            java.lang.String r1 = r2.A03
            java.lang.String r0 = r3.A03
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 == 0) goto L_0x011b
            java.lang.String r1 = r2.A02
            java.lang.String r0 = r3.A02
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 == 0) goto L_0x011b
            java.lang.String r1 = r2.A00
            java.lang.String r0 = r3.A00
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 == 0) goto L_0x011b
            java.lang.String r1 = r2.A01
            java.lang.String r0 = r3.A01
            goto L_0x0115
        L_0x00ca:
            if (r2 == r3) goto L_0x011d
            r0 = 4
            goto L_0x00d1
        L_0x00ce:
            if (r2 == r3) goto L_0x011d
            r0 = 3
        L_0x00d1:
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x011b
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4000000_I2 r3 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4000000_I2) r3
            java.lang.String r1 = r2.A00
            java.lang.String r0 = r3.A00
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 == 0) goto L_0x011b
            java.lang.String r1 = r2.A01
            java.lang.String r0 = r3.A01
            goto L_0x0101
        L_0x00e8:
            r0 = 1
            if (r2 == r3) goto L_0x011d
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x011b
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4000000_I2 r3 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4000000_I2) r3
            java.lang.String r1 = r2.A01
            java.lang.String r0 = r3.A01
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 == 0) goto L_0x011b
            java.lang.String r1 = r2.A00
            java.lang.String r0 = r3.A00
        L_0x0101:
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 == 0) goto L_0x011b
            java.lang.String r1 = r2.A02
            java.lang.String r0 = r3.A02
        L_0x010b:
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 == 0) goto L_0x011b
            java.lang.String r1 = r2.A03
            java.lang.String r0 = r3.A03
        L_0x0115:
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 != 0) goto L_0x011d
        L_0x011b:
            r0 = 0
            return r0
        L_0x011d:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4000000_I2.equals(java.lang.Object):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0083, code lost:
        return X.C18210wN.A05(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x008e, code lost:
        r1 = (r1 + X.AnonymousClass0wJ.A06(r0)) * 31;
        r0 = r2.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0097, code lost:
        r1 = (r1 + X.AnonymousClass0wJ.A06(r0)) * 31;
        r0 = r2.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00a5, code lost:
        return r1 + X.C18200wM.A09(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int hashCode() {
        /*
            r2 = this;
            int r0 = r2.A04
            switch(r0) {
                case 1: goto L_0x0084;
                case 2: goto L_0x0005;
                case 3: goto L_0x006b;
                case 4: goto L_0x006b;
                case 5: goto L_0x0056;
                case 6: goto L_0x0041;
                case 7: goto L_0x0036;
                case 8: goto L_0x0036;
                case 9: goto L_0x0036;
                case 10: goto L_0x0019;
                case 11: goto L_0x000a;
                default: goto L_0x0005;
            }
        L_0x0005:
            int r1 = super.hashCode()
            return r1
        L_0x000a:
            java.lang.String r0 = r2.A02
            int r1 = X.C18180wK.A03(r0)
            java.lang.String r0 = r2.A00
            int r1 = X.AnonymousClass0wJ.A07(r0, r1)
            java.lang.String r0 = r2.A01
            goto L_0x0097
        L_0x0019:
            java.lang.String r0 = r2.A02
            int r0 = X.AnonymousClass0wJ.A06(r0)
            int r1 = r0 * 31
            java.lang.String r0 = r2.A03
            int r0 = X.AnonymousClass0wJ.A06(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r2.A01
            int r0 = X.AnonymousClass0wJ.A06(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r2.A00
            goto L_0x00a0
        L_0x0036:
            java.lang.String r0 = r2.A00
            int r0 = X.AnonymousClass0wJ.A06(r0)
            int r1 = r0 * 31
            java.lang.String r0 = r2.A01
            goto L_0x008e
        L_0x0041:
            java.lang.String r0 = r2.A01
            int r1 = X.C18180wK.A03(r0)
            java.lang.String r0 = r2.A03
            int r1 = X.AnonymousClass0wJ.A07(r0, r1)
            java.lang.String r0 = r2.A00
            int r1 = X.AnonymousClass0wJ.A07(r0, r1)
            java.lang.String r0 = r2.A02
            goto L_0x007f
        L_0x0056:
            java.lang.String r0 = r2.A03
            int r1 = X.C18180wK.A03(r0)
            java.lang.String r0 = r2.A02
            int r1 = X.AnonymousClass0wJ.A07(r0, r1)
            java.lang.String r0 = r2.A00
            int r1 = X.AnonymousClass0wJ.A07(r0, r1)
            java.lang.String r0 = r2.A01
            goto L_0x007f
        L_0x006b:
            java.lang.String r0 = r2.A00
            int r1 = X.C18180wK.A03(r0)
            java.lang.String r0 = r2.A01
            int r1 = X.AnonymousClass0wJ.A07(r0, r1)
            java.lang.String r0 = r2.A02
            int r1 = X.AnonymousClass0wJ.A07(r0, r1)
            java.lang.String r0 = r2.A03
        L_0x007f:
            int r1 = X.C18210wN.A05(r0, r1)
            return r1
        L_0x0084:
            java.lang.String r0 = r2.A01
            int r0 = X.AnonymousClass0wJ.A06(r0)
            int r1 = r0 * 31
            java.lang.String r0 = r2.A00
        L_0x008e:
            int r0 = X.AnonymousClass0wJ.A06(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r2.A02
        L_0x0097:
            int r0 = X.AnonymousClass0wJ.A06(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r2.A03
        L_0x00a0:
            int r0 = X.C18200wM.A09(r0)
            int r1 = r1 + r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4000000_I2.hashCode():int");
    }

    public final String toString() {
        if (2 - this.A04 != 0) {
            return super.toString();
        }
        StringBuilder A0s = C18190wL.A0s("ShowreelNativeVisibleLayer(tag=");
        A0s.append(this.A02);
        A0s.append(", name=");
        A0s.append(this.A01);
        A0s.append(", type=");
        A0s.append(this.A03);
        A0s.append(", bitmapName=");
        A0s.append(this.A00);
        return AnonymousClass0wJ.A0u(A0s);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0037, code lost:
        r1.A02 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0078, code lost:
        r1.A00 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x007a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        r1.A01 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0011, code lost:
        r1.A03 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0013, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0030, code lost:
        r1.A00 = r2;
        r1.A01 = r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public KtCSuperShape0S4000000_I2(java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, int r6) {
        /*
            r1 = this;
            r1.A04 = r6
            switch(r6) {
                case 0: goto L_0x0014;
                case 1: goto L_0x0022;
                case 2: goto L_0x003a;
                case 3: goto L_0x002a;
                case 4: goto L_0x002a;
                case 5: goto L_0x004b;
                case 6: goto L_0x005d;
                case 7: goto L_0x0030;
                case 8: goto L_0x0030;
                case 9: goto L_0x0030;
                case 10: goto L_0x006f;
                default: goto L_0x0005;
            }
        L_0x0005:
            X.AnonymousClass0wJ.A1O(r2, r3)
            r1.<init>()
            r1.A02 = r2
            r1.A00 = r3
        L_0x000f:
            r1.A01 = r4
        L_0x0011:
            r1.A03 = r5
            return
        L_0x0014:
            X.AnonymousClass0wJ.A1O(r2, r3)
            X.AnonymousClass0wJ.A1R(r4, r5)
            r1.<init>()
            r1.A00 = r2
            r1.A02 = r3
            goto L_0x000f
        L_0x0022:
            r1.<init>()
            r1.A01 = r2
            r1.A00 = r3
            goto L_0x0037
        L_0x002a:
            X.AnonymousClass0wJ.A1O(r2, r3)
            X.AnonymousClass0wJ.A1R(r4, r5)
        L_0x0030:
            r1.<init>()
            r1.A00 = r2
            r1.A01 = r3
        L_0x0037:
            r1.A02 = r4
            goto L_0x0011
        L_0x003a:
            X.AnonymousClass0wJ.A1O(r2, r3)
            r0 = 3
            X.C04220Ms.A0B(r4, r0)
            r1.<init>()
            r1.A02 = r2
            r1.A01 = r3
            r1.A03 = r4
            goto L_0x0078
        L_0x004b:
            X.AnonymousClass0wJ.A1O(r2, r3)
            X.AnonymousClass0wJ.A1R(r4, r5)
            r1.<init>()
            r1.A03 = r2
            r1.A02 = r3
            r1.A00 = r4
            r1.A01 = r5
            return
        L_0x005d:
            X.AnonymousClass0wJ.A1O(r2, r3)
            X.AnonymousClass0wJ.A1R(r4, r5)
            r1.<init>()
            r1.A01 = r2
            r1.A03 = r3
            r1.A00 = r4
            r1.A02 = r5
            return
        L_0x006f:
            r1.<init>()
            r1.A02 = r2
            r1.A03 = r3
            r1.A01 = r4
        L_0x0078:
            r1.A00 = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4000000_I2.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, int):void");
    }
}
