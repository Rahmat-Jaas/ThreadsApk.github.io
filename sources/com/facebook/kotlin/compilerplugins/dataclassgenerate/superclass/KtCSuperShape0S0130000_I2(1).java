package com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass;

import X.AnonymousClass006;
import X.AnonymousClass0Sf;
import X.AnonymousClass0ZV;
import X.AnonymousClass5Im;
import X.AnonymousClass5wP;
import X.C04220Ms;
import com.instagram.model.rtc.ClipsTogetherUser;
import kotlin.jvm.internal.DefaultConstructorMarker;

public class KtCSuperShape0S0130000_I2 extends AnonymousClass0Sf {
    public Object A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public final int A04;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public KtCSuperShape0S0130000_I2(AnonymousClass5Im r16, DefaultConstructorMarker defaultConstructorMarker, int i, int i2, boolean z, boolean z2, boolean z3) {
        this(new AnonymousClass5Im(new KtCSuperShape0S2000000_I2((String) null, (String) null, (DefaultConstructorMarker) null, 3, 16), AnonymousClass5wP.A00, AnonymousClass006.A00, "", "", "", AnonymousClass0ZV.A00, false), false, false, false);
        this.A04 = 0;
    }

    public static boolean A00(int i, Object obj) {
        if (!(obj instanceof KtCSuperShape0S0130000_I2) || ((KtCSuperShape0S0130000_I2) obj).A04 != i) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0020, code lost:
        r1 = r2.A03;
        r0 = r3.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0024, code lost:
        if (r1 != r0) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0026, code lost:
        r1 = r2.A01;
        r0 = r3.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002a, code lost:
        if (r1 == r0) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0072, code lost:
        r1 = r2.A03;
        r0 = r3.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000c, code lost:
        if (A00(r0, r3) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
        r3 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0130000_I2) r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0018, code lost:
        if (X.C04220Ms.A0I(r2.A00, r3.A00) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001e, code lost:
        if (r2.A02 != r3.A02) goto L_?;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            int r0 = r2.A04
            switch(r0) {
                case 0: goto L_0x009f;
                case 1: goto L_0x0077;
                case 2: goto L_0x0050;
                case 3: goto L_0x004c;
                case 4: goto L_0x002e;
                default: goto L_0x0005;
            }
        L_0x0005:
            if (r2 == r3) goto L_0x00c0
            r0 = 5
        L_0x0008:
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x002c
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0130000_I2 r3 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0130000_I2) r3
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 == 0) goto L_0x002c
            boolean r1 = r2.A02
            boolean r0 = r3.A02
            if (r1 != r0) goto L_0x002c
            boolean r1 = r2.A03
            boolean r0 = r3.A03
        L_0x0024:
            if (r1 != r0) goto L_0x002c
            boolean r1 = r2.A01
            boolean r0 = r3.A01
        L_0x002a:
            if (r1 == r0) goto L_0x00c0
        L_0x002c:
            r0 = 0
            return r0
        L_0x002e:
            if (r2 == r3) goto L_0x00c0
            r0 = 4
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x002c
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0130000_I2 r3 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0130000_I2) r3
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            if (r1 != r0) goto L_0x002c
            boolean r1 = r2.A02
            boolean r0 = r3.A02
            if (r1 != r0) goto L_0x002c
            boolean r1 = r2.A01
            boolean r0 = r3.A01
            if (r1 == r0) goto L_0x0072
            goto L_0x002c
        L_0x004c:
            if (r2 == r3) goto L_0x00c0
            r0 = 3
            goto L_0x0008
        L_0x0050:
            if (r2 == r3) goto L_0x00c0
            r0 = 2
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x002c
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0130000_I2 r3 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0130000_I2) r3
            boolean r1 = r2.A02
            boolean r0 = r3.A02
            if (r1 != r0) goto L_0x002c
            boolean r1 = r2.A01
            boolean r0 = r3.A01
            if (r1 != r0) goto L_0x002c
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 != 0) goto L_0x0072
            goto L_0x002c
        L_0x0072:
            boolean r1 = r2.A03
            boolean r0 = r3.A03
            goto L_0x002a
        L_0x0077:
            r0 = 1
            if (r2 == r3) goto L_0x00c0
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x002c
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0130000_I2 r3 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0130000_I2) r3
            boolean r1 = r2.A03
            boolean r0 = r3.A03
            if (r1 != r0) goto L_0x002c
            boolean r1 = r2.A01
            boolean r0 = r3.A01
            if (r1 != r0) goto L_0x002c
            boolean r1 = r2.A02
            boolean r0 = r3.A02
            if (r1 != r0) goto L_0x002c
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 != 0) goto L_0x00c0
            goto L_0x002c
        L_0x009f:
            if (r2 == r3) goto L_0x00c0
            r0 = 0
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x002c
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0130000_I2 r3 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0130000_I2) r3
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 == 0) goto L_0x002c
            boolean r1 = r2.A03
            boolean r0 = r3.A03
            if (r1 != r0) goto L_0x002c
            boolean r1 = r2.A02
            boolean r0 = r3.A02
            goto L_0x0024
        L_0x00c0:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0130000_I2.equals(java.lang.Object):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0019, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001a, code lost:
        r1 = (r1 + (r0 ? 1 : 0)) * 31;
        r0 = r3.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001f, code lost:
        if (r0 != false) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0021, code lost:
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0023, code lost:
        return r1 + r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0058, code lost:
        r0 = r0.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0073, code lost:
        r1 = (r1 + r0) * 31;
        r0 = r3.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000a, code lost:
        r1 = r0 * 31;
        r0 = r3.A02;
        r2 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000f, code lost:
        if (r0 == false) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
        r1 = (r1 + (r0 ? 1 : 0)) * 31;
        r0 = r3.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0017, code lost:
        if (r0 == false) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int hashCode() {
        /*
            r3 = this;
            int r0 = r3.A04
            switch(r0) {
                case 0: goto L_0x0079;
                case 1: goto L_0x008b;
                case 2: goto L_0x005d;
                case 3: goto L_0x0056;
                case 4: goto L_0x0024;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r3.A00
            if (r0 != 0) goto L_0x0058
            r0 = 0
        L_0x000a:
            int r1 = r0 * 31
            boolean r0 = r3.A02
            r2 = 1
            if (r0 == 0) goto L_0x0012
            r0 = 1
        L_0x0012:
            int r1 = r1 + r0
            int r1 = r1 * 31
            boolean r0 = r3.A03
        L_0x0017:
            if (r0 == 0) goto L_0x001a
            r0 = 1
        L_0x001a:
            int r1 = r1 + r0
            int r1 = r1 * 31
            boolean r0 = r3.A01
        L_0x001f:
            if (r0 != 0) goto L_0x0022
            r2 = 0
        L_0x0022:
            int r1 = r1 + r2
            return r1
        L_0x0024:
            java.lang.Object r0 = r3.A00
            int r1 = X.AnonymousClass0wJ.A04(r0)
            switch(r1) {
                case 1: goto L_0x0044;
                case 2: goto L_0x0047;
                case 3: goto L_0x004a;
                case 4: goto L_0x004d;
                case 5: goto L_0x0050;
                case 6: goto L_0x0053;
                default: goto L_0x002d;
            }
        L_0x002d:
            java.lang.String r0 = "PRODUCT_SECTION"
        L_0x002f:
            int r0 = X.C86144wL.A0B(r0, r1)
            int r1 = r0 * 31
            boolean r0 = r3.A02
            r2 = 1
            if (r0 == 0) goto L_0x003b
            r0 = 1
        L_0x003b:
            int r1 = r1 + r0
            int r1 = r1 * 31
            boolean r0 = r3.A01
            if (r0 == 0) goto L_0x0073
            r0 = 1
            goto L_0x0073
        L_0x0044:
            java.lang.String r0 = "DENSE_PRODUCT_SECTION"
            goto L_0x002f
        L_0x0047:
            java.lang.String r0 = "MODULE_HSCROLL"
            goto L_0x002f
        L_0x004a:
            java.lang.String r0 = "SHORTCUT_RIBBON"
            goto L_0x002f
        L_0x004d:
            java.lang.String r0 = "SHORTCUT_RIBBON_NO_ICON"
            goto L_0x002f
        L_0x0050:
            java.lang.String r0 = "TILE_VSCROLL"
            goto L_0x002f
        L_0x0053:
            java.lang.String r0 = "UNKNOWN"
            goto L_0x002f
        L_0x0056:
            java.lang.Object r0 = r3.A00
        L_0x0058:
            int r0 = r0.hashCode()
            goto L_0x000a
        L_0x005d:
            boolean r0 = r3.A02
            r2 = 1
            if (r0 == 0) goto L_0x0063
            r0 = 1
        L_0x0063:
            int r1 = r0 * 31
            boolean r0 = r3.A01
            if (r0 == 0) goto L_0x006a
            r0 = 1
        L_0x006a:
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.Object r0 = r3.A00
            int r0 = X.AnonymousClass0wJ.A03(r0)
        L_0x0073:
            int r1 = r1 + r0
            int r1 = r1 * 31
            boolean r0 = r3.A03
            goto L_0x001f
        L_0x0079:
            java.lang.Object r0 = r3.A00
            int r1 = X.C18210wN.A04(r0)
            boolean r0 = r3.A03
            r2 = 1
            if (r0 == 0) goto L_0x0085
            r0 = 1
        L_0x0085:
            int r1 = r1 + r0
            int r1 = r1 * 31
            boolean r0 = r3.A02
            goto L_0x0017
        L_0x008b:
            boolean r0 = r3.A03
            r2 = 1
            if (r0 == 0) goto L_0x0091
            r0 = 1
        L_0x0091:
            int r1 = r0 * 31
            boolean r0 = r3.A01
            if (r0 == 0) goto L_0x0098
            r0 = 1
        L_0x0098:
            int r1 = r1 + r0
            int r1 = r1 * 31
            boolean r0 = r3.A02
            if (r0 != 0) goto L_0x00a0
            r2 = 0
        L_0x00a0:
            int r1 = r1 + r2
            int r1 = r1 * 31
            java.lang.Object r0 = r3.A00
            int r1 = X.C18220wO.A06(r0, r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0130000_I2.hashCode():int");
    }

    public KtCSuperShape0S0130000_I2(Object obj, int i, boolean z, boolean z2, boolean z3) {
        this.A04 = i;
        this.A00 = obj;
        this.A02 = z;
        this.A03 = z2;
        this.A01 = z3;
    }

    public KtCSuperShape0S0130000_I2(ClipsTogetherUser clipsTogetherUser, boolean z, boolean z2, boolean z3) {
        this.A04 = 3;
        C04220Ms.A0B(clipsTogetherUser, 1);
        this.A00 = clipsTogetherUser;
        this.A02 = z;
        this.A03 = z2;
        this.A01 = z3;
    }

    public KtCSuperShape0S0130000_I2(AnonymousClass5Im r2, boolean z, boolean z2, boolean z3) {
        this.A04 = 0;
        this.A00 = r2;
        this.A03 = z;
        this.A02 = z2;
        this.A01 = z3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public KtCSuperShape0S0130000_I2(Integer num, int i, boolean z, boolean z2) {
        this((i & 1) != 0 ? AnonymousClass006.A0u : num, (i & 2) != 0 ? false : z, false, (i & 8) != 0 ? false : z2);
        this.A04 = 4;
    }

    public KtCSuperShape0S0130000_I2(Integer num, boolean z, boolean z2, boolean z3) {
        this.A04 = 4;
        this.A00 = num;
        this.A02 = z;
        this.A01 = z2;
        this.A03 = z3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public KtCSuperShape0S0130000_I2() {
        this(AnonymousClass006.A0u, false, false, false);
        this.A04 = 4;
        this.A04 = 4;
    }
}
