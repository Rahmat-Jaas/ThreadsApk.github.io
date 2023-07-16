package com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass;

import X.AnonymousClass0Sf;
import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C18190wL;
import X.C25520Dn8;
import java.util.List;

public class KtCSuperShape0S2101000_I2 extends AnonymousClass0Sf {
    public int A00;
    public Object A01;
    public String A02;
    public String A03;
    public final int A04;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public KtCSuperShape0S2101000_I2(List list) {
        this((Object) list, (String) null, (String) null, 0, 6);
        this.A04 = 6;
    }

    public static boolean A00(int i, Object obj) {
        if (!(obj instanceof KtCSuperShape0S2101000_I2) || ((KtCSuperShape0S2101000_I2) obj).A04 != i) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0028, code lost:
        if (X.C04220Ms.A0I(r1, r0) != false) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006c, code lost:
        r1 = r2.A03;
        r0 = r3.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x007c, code lost:
        if (A00(r0, r3) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x007e, code lost:
        r3 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2101000_I2) r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0088, code lost:
        if (X.C04220Ms.A0I(r2.A02, r3.A02) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x008e, code lost:
        if (r2.A00 != r3.A00) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0090, code lost:
        r1 = r2.A01;
        r0 = r3.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00b2, code lost:
        if (X.C04220Ms.A0I(r1, r0) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00bc, code lost:
        if (X.C04220Ms.A0I(r2.A01, r3.A01) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00c2, code lost:
        if (r2.A00 == r3.A00) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00f3, code lost:
        if (X.C04220Ms.A0I(r1, r0) != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:?, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            int r0 = r2.A04
            switch(r0) {
                case 0: goto L_0x00c6;
                case 1: goto L_0x0095;
                case 2: goto L_0x0075;
                case 3: goto L_0x0071;
                case 4: goto L_0x0046;
                case 5: goto L_0x002c;
                default: goto L_0x0005;
            }
        L_0x0005:
            if (r2 == r3) goto L_0x00f7
            r0 = 6
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x002a
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2101000_I2 r3 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2101000_I2) r3
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 == 0) goto L_0x002a
            int r1 = r2.A00
            int r0 = r3.A00
            if (r1 != r0) goto L_0x002a
            java.lang.String r1 = r2.A02
            java.lang.String r0 = r3.A02
        L_0x0024:
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 != 0) goto L_0x006c
        L_0x002a:
            r0 = 0
            return r0
        L_0x002c:
            if (r2 == r3) goto L_0x00f7
            r0 = 5
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x002a
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2101000_I2 r3 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2101000_I2) r3
            java.lang.String r1 = r2.A02
            java.lang.String r0 = r3.A02
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 == 0) goto L_0x002a
            java.lang.String r1 = r2.A03
            java.lang.String r0 = r3.A03
            goto L_0x00ae
        L_0x0046:
            if (r2 == r3) goto L_0x00f7
            r0 = 4
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x002a
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2101000_I2 r3 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2101000_I2) r3
            java.lang.String r1 = r2.A02
            java.lang.String r0 = r3.A02
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 == 0) goto L_0x002a
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 == 0) goto L_0x002a
            int r1 = r2.A00
            int r0 = r3.A00
            if (r1 == r0) goto L_0x006c
            goto L_0x002a
        L_0x006c:
            java.lang.String r1 = r2.A03
            java.lang.String r0 = r3.A03
            goto L_0x00ef
        L_0x0071:
            if (r2 == r3) goto L_0x00f7
            r0 = 3
            goto L_0x0078
        L_0x0075:
            if (r2 == r3) goto L_0x00f7
            r0 = 2
        L_0x0078:
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x002a
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2101000_I2 r3 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2101000_I2) r3
            java.lang.String r1 = r2.A02
            java.lang.String r0 = r3.A02
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 == 0) goto L_0x002a
            int r1 = r2.A00
            int r0 = r3.A00
            if (r1 != r0) goto L_0x002a
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            goto L_0x0024
        L_0x0095:
            r0 = 1
            if (r2 == r3) goto L_0x00f7
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x002a
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2101000_I2 r3 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2101000_I2) r3
            java.lang.String r1 = r2.A03
            java.lang.String r0 = r3.A03
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 == 0) goto L_0x002a
            java.lang.String r1 = r2.A02
            java.lang.String r0 = r3.A02
        L_0x00ae:
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 == 0) goto L_0x002a
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 == 0) goto L_0x002a
            int r1 = r2.A00
            int r0 = r3.A00
            if (r1 == r0) goto L_0x00f7
            goto L_0x002a
        L_0x00c6:
            if (r2 == r3) goto L_0x00f7
            r0 = 0
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x002a
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2101000_I2 r3 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2101000_I2) r3
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 == 0) goto L_0x002a
            java.lang.String r1 = r2.A03
            java.lang.String r0 = r3.A03
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 == 0) goto L_0x002a
            int r1 = r2.A00
            int r0 = r3.A00
            if (r1 != r0) goto L_0x002a
            java.lang.String r1 = r2.A02
            java.lang.String r0 = r3.A02
        L_0x00ef:
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 != 0) goto L_0x00f7
            goto L_0x002a
        L_0x00f7:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2101000_I2.equals(java.lang.Object):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0072, code lost:
        r2 = r1 * 31;
        r1 = r3.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x008f, code lost:
        r2 = X.C18200wM.A09(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0016, code lost:
        r2 = (r1 + r0) * 31;
        r1 = r3.A03.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0020, code lost:
        return r1 + r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int hashCode() {
        /*
            r3 = this;
            int r0 = r3.A04
            switch(r0) {
                case 0: goto L_0x0077;
                case 1: goto L_0x005c;
                case 2: goto L_0x0005;
                case 3: goto L_0x0005;
                case 4: goto L_0x004d;
                case 5: goto L_0x003a;
                case 6: goto L_0x0021;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.String r0 = r3.A02
            int r1 = X.C18180wK.A03(r0)
            int r0 = r3.A00
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.Object r0 = r3.A01
            int r0 = r0.hashCode()
        L_0x0016:
            int r1 = r1 + r0
            int r2 = r1 * 31
            java.lang.String r0 = r3.A03
            int r1 = r0.hashCode()
        L_0x001f:
            int r1 = r1 + r2
            return r1
        L_0x0021:
            java.lang.Object r0 = r3.A01
            int r0 = X.AnonymousClass0wJ.A03(r0)
            int r1 = r0 * 31
            int r0 = r3.A00
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r3.A02
            int r0 = X.AnonymousClass0wJ.A06(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r3.A03
            goto L_0x008f
        L_0x003a:
            java.lang.String r0 = r3.A02
            int r1 = X.C18180wK.A03(r0)
            java.lang.String r0 = r3.A03
            int r1 = X.AnonymousClass0wJ.A07(r0, r1)
            java.lang.Object r0 = r3.A01
            int r1 = X.C18220wO.A06(r0, r1)
            goto L_0x0072
        L_0x004d:
            java.lang.String r0 = r3.A02
            int r1 = X.C18180wK.A03(r0)
            java.lang.Object r0 = r3.A01
            int r1 = X.AnonymousClass0wJ.A05(r0, r1)
            int r0 = r3.A00
            goto L_0x0016
        L_0x005c:
            java.lang.String r0 = r3.A03
            int r1 = X.C18180wK.A03(r0)
            java.lang.String r0 = r3.A02
            int r0 = X.AnonymousClass0wJ.A06(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.Object r0 = r3.A01
            int r0 = X.C18200wM.A07(r0)
            int r1 = r1 + r0
        L_0x0072:
            int r2 = r1 * 31
            int r1 = r3.A00
            goto L_0x001f
        L_0x0077:
            java.lang.Object r0 = r3.A01
            int r0 = X.AnonymousClass0wJ.A03(r0)
            int r1 = r0 * 31
            java.lang.String r0 = r3.A03
            int r0 = X.AnonymousClass0wJ.A06(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            int r0 = r3.A00
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r3.A02
        L_0x008f:
            int r2 = X.C18200wM.A09(r0)
            goto L_0x001f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2101000_I2.hashCode():int");
    }

    public final String toString() {
        StringBuilder sb;
        switch (this.A04) {
            case 5:
                sb = C18190wL.A0s("HeadmojiStickerSpec(id=");
                sb.append(this.A02);
                sb.append(", label=");
                sb.append(this.A03);
                sb.append(", renderSpec=");
                sb.append(this.A01);
                sb.append(", order=");
                sb.append(this.A00);
                break;
            case 6:
                sb = C18190wL.A0s("ProductOnboardingStepsData(productOnboardingNextStepInfo=");
                sb.append(this.A01);
                sb.append(", currentStepIndex=");
                sb.append(this.A00);
                sb.append(", onboardingIntroVideoUrl=");
                sb.append(this.A02);
                sb.append(", taxInfoDescription=");
                sb.append(this.A03);
                break;
            default:
                return super.toString();
        }
        return AnonymousClass0wJ.A0u(sb);
    }

    public KtCSuperShape0S2101000_I2(KtCSuperShape0S1100000_I2 ktCSuperShape0S1100000_I2, String str, String str2, int i) {
        this.A04 = 1;
        C04220Ms.A0B(str, 1);
        this.A03 = str;
        this.A02 = str2;
        this.A01 = ktCSuperShape0S1100000_I2;
        this.A00 = i;
    }

    public KtCSuperShape0S2101000_I2(C25520Dn8 dn8, String str, String str2, int i) {
        this.A04 = 5;
        AnonymousClass0wJ.A1O(str, str2);
        this.A02 = str;
        this.A03 = str2;
        this.A01 = dn8;
        this.A00 = i;
    }

    public KtCSuperShape0S2101000_I2(Object obj, String str, String str2, int i, int i2) {
        this.A04 = i2;
        this.A01 = obj;
        this.A03 = str;
        this.A00 = i;
        this.A02 = str2;
    }

    public KtCSuperShape0S2101000_I2(String str, List list, int i, String str2, int i2) {
        this.A04 = 4;
        AnonymousClass0wJ.A1O(str, list);
        C04220Ms.A0B(str2, 4);
        this.A02 = str;
        this.A01 = list;
        this.A00 = i;
        this.A03 = str2;
    }

    public KtCSuperShape0S2101000_I2(String str, String str2, List list, int i, int i2) {
        this.A04 = i2;
        C04220Ms.A0B(str, 1);
        AnonymousClass0wJ.A1R(list, str2);
        this.A02 = str;
        this.A00 = i;
        this.A01 = list;
        this.A03 = str2;
    }
}
