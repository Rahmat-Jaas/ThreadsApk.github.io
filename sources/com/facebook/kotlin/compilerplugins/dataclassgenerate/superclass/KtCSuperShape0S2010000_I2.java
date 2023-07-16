package com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass;

import X.AnonymousClass0Sf;
import X.C04220Ms;
import X.C18180wK;
import kotlin.jvm.internal.DefaultConstructorMarker;

public class KtCSuperShape0S2010000_I2 extends AnonymousClass0Sf {
    public String A00;
    public String A01;
    public boolean A02;
    public final int A03;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public KtCSuperShape0S2010000_I2(String str, String str2, DefaultConstructorMarker defaultConstructorMarker, int i, int i2, boolean z) {
        this(false, "", "", 3);
        this.A03 = 3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001c, code lost:
        r1 = r2.A01;
        r0 = r3.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0024, code lost:
        if (X.C04220Ms.A0I(r1, r0) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        if (r2.A02 == r3.A02) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0061, code lost:
        if ((r3 instanceof com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2010000_I2) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0063, code lost:
        r3 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2010000_I2) r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0067, code lost:
        if (r3.A03 != r1) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0071, code lost:
        if (X.C04220Ms.A0I(r2.A01, r3.A01) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0073, code lost:
        r1 = r2.A00;
        r0 = r3.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x009d, code lost:
        if (X.C04220Ms.A0I(r1, r0) != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
        return false;
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
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000a, code lost:
        if ((r3 instanceof com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2010000_I2) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000c, code lost:
        r3 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2010000_I2) r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0010, code lost:
        if (r3.A03 != r1) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
        if (X.C04220Ms.A0I(r2.A00, r3.A00) == false) goto L_?;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            int r0 = r2.A03
            switch(r0) {
                case 0: goto L_0x00a0;
                case 1: goto L_0x0078;
                case 2: goto L_0x005c;
                case 3: goto L_0x003a;
                case 4: goto L_0x0036;
                case 5: goto L_0x0032;
                case 6: goto L_0x002e;
                default: goto L_0x0005;
            }
        L_0x0005:
            if (r2 == r3) goto L_0x00a5
            r1 = 7
        L_0x0008:
            boolean r0 = r3 instanceof com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2010000_I2
            if (r0 == 0) goto L_0x002c
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2010000_I2 r3 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2010000_I2) r3
            int r0 = r3.A03
            if (r0 != r1) goto L_0x002c
            java.lang.String r1 = r2.A00
            java.lang.String r0 = r3.A00
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 == 0) goto L_0x002c
            java.lang.String r1 = r2.A01
            java.lang.String r0 = r3.A01
        L_0x0020:
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 == 0) goto L_0x002c
            boolean r1 = r2.A02
            boolean r0 = r3.A02
            if (r1 == r0) goto L_0x00a5
        L_0x002c:
            r0 = 0
            return r0
        L_0x002e:
            if (r2 == r3) goto L_0x00a5
            r1 = 6
            goto L_0x005f
        L_0x0032:
            if (r2 == r3) goto L_0x00a5
            r1 = 5
            goto L_0x0008
        L_0x0036:
            if (r2 == r3) goto L_0x00a5
            r1 = 4
            goto L_0x0008
        L_0x003a:
            if (r2 == r3) goto L_0x00a5
            r1 = 3
            boolean r0 = r3 instanceof com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2010000_I2
            if (r0 == 0) goto L_0x002c
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2010000_I2 r3 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2010000_I2) r3
            int r0 = r3.A03
            if (r0 != r1) goto L_0x002c
            boolean r1 = r2.A02
            boolean r0 = r3.A02
            if (r1 != r0) goto L_0x002c
            java.lang.String r1 = r2.A01
            java.lang.String r0 = r3.A01
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 == 0) goto L_0x002c
            java.lang.String r1 = r2.A00
            java.lang.String r0 = r3.A00
            goto L_0x0099
        L_0x005c:
            if (r2 == r3) goto L_0x00a5
            r1 = 2
        L_0x005f:
            boolean r0 = r3 instanceof com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2010000_I2
            if (r0 == 0) goto L_0x002c
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2010000_I2 r3 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2010000_I2) r3
            int r0 = r3.A03
            if (r0 != r1) goto L_0x002c
            java.lang.String r1 = r2.A01
            java.lang.String r0 = r3.A01
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 == 0) goto L_0x002c
            java.lang.String r1 = r2.A00
            java.lang.String r0 = r3.A00
            goto L_0x0020
        L_0x0078:
            if (r2 == r3) goto L_0x00a5
            r1 = 1
            boolean r0 = r3 instanceof com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2010000_I2
            if (r0 == 0) goto L_0x002c
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2010000_I2 r3 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2010000_I2) r3
            int r0 = r3.A03
            if (r0 != r1) goto L_0x002c
            java.lang.String r1 = r2.A00
            java.lang.String r0 = r3.A00
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 == 0) goto L_0x002c
            boolean r1 = r2.A02
            boolean r0 = r3.A02
            if (r1 != r0) goto L_0x002c
            java.lang.String r1 = r2.A01
            java.lang.String r0 = r3.A01
        L_0x0099:
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 != 0) goto L_0x00a5
            goto L_0x002c
        L_0x00a0:
            if (r2 == r3) goto L_0x00a5
            r1 = 0
            goto L_0x0008
        L_0x00a5:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2010000_I2.equals(java.lang.Object):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0019, code lost:
        return r1 + r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
        r1 = r0.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003c, code lost:
        r2 = X.C18200wM.A09(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006a, code lost:
        r0 = r0.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        if (r0 != null) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000f, code lost:
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0010, code lost:
        r1 = (r2 + r1) * 31;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0013, code lost:
        r0 = r3.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0015, code lost:
        if (r0 == 0) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0017, code lost:
        r0 = 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int hashCode() {
        /*
            r3 = this;
            int r0 = r3.A03
            switch(r0) {
                case 0: goto L_0x006f;
                case 1: goto L_0x005a;
                case 2: goto L_0x0051;
                case 3: goto L_0x0041;
                case 4: goto L_0x001a;
                case 5: goto L_0x0032;
                case 6: goto L_0x0027;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.String r0 = r3.A00
            int r2 = X.C18180wK.A03(r0)
            java.lang.String r0 = r3.A01
        L_0x000d:
            if (r0 != 0) goto L_0x0022
            r1 = 0
        L_0x0010:
            int r2 = r2 + r1
            int r1 = r2 * 31
        L_0x0013:
            boolean r0 = r3.A02
            if (r0 == 0) goto L_0x0018
            r0 = 1
        L_0x0018:
            int r1 = r1 + r0
            return r1
        L_0x001a:
            java.lang.String r0 = r3.A00
            int r2 = X.C18180wK.A03(r0)
            java.lang.String r0 = r3.A01
        L_0x0022:
            int r1 = r0.hashCode()
            goto L_0x0010
        L_0x0027:
            java.lang.String r0 = r3.A01
            int r0 = X.AnonymousClass0wJ.A06(r0)
            int r1 = r0 * 31
            java.lang.String r0 = r3.A00
            goto L_0x003c
        L_0x0032:
            java.lang.String r0 = r3.A00
            int r0 = X.AnonymousClass0wJ.A06(r0)
            int r1 = r0 * 31
            java.lang.String r0 = r3.A01
        L_0x003c:
            int r2 = X.C18200wM.A09(r0)
            goto L_0x0010
        L_0x0041:
            boolean r0 = r3.A02
            if (r0 == 0) goto L_0x0046
            r0 = 1
        L_0x0046:
            int r1 = r0 * 31
            java.lang.String r0 = r3.A01
            int r1 = X.AnonymousClass0wJ.A07(r0, r1)
            java.lang.String r0 = r3.A00
            goto L_0x006a
        L_0x0051:
            java.lang.String r0 = r3.A01
            int r2 = X.C18180wK.A03(r0)
            java.lang.String r0 = r3.A00
            goto L_0x000d
        L_0x005a:
            java.lang.String r0 = r3.A00
            int r1 = X.C18180wK.A03(r0)
            boolean r0 = r3.A02
            if (r0 == 0) goto L_0x0065
            r0 = 1
        L_0x0065:
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r3.A01
        L_0x006a:
            int r0 = r0.hashCode()
            goto L_0x0018
        L_0x006f:
            java.lang.String r0 = r3.A00
            int r1 = X.C18180wK.A03(r0)
            java.lang.String r0 = r3.A01
            int r1 = X.AnonymousClass0wJ.A07(r0, r1)
            goto L_0x0013
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2010000_I2.hashCode():int");
    }

    public KtCSuperShape0S2010000_I2(String str, boolean z, String str2) {
        this.A03 = 1;
        C18180wK.A1P(str, 1, str2);
        this.A00 = str;
        this.A02 = z;
        this.A01 = str2;
    }

    public KtCSuperShape0S2010000_I2(boolean z, String str, String str2, int i) {
        this.A03 = 3;
        C04220Ms.A0B(str, 2);
        C04220Ms.A0B(str2, 3);
        this.A02 = z;
        this.A01 = str;
        this.A00 = str2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public KtCSuperShape0S2010000_I2(java.lang.String r3, int r4, int r5, boolean r6) {
        /*
            r2 = this;
            r1 = 0
            r2.A03 = r5
            switch(r5) {
                case 2: goto L_0x0021;
                case 3: goto L_0x0006;
                case 4: goto L_0x0006;
                case 5: goto L_0x0015;
                default: goto L_0x0006;
            }
        L_0x0006:
            r0 = r4 & 1
            if (r0 == 0) goto L_0x000b
            r3 = r1
        L_0x000b:
            r0 = r4 & 4
            if (r0 == 0) goto L_0x0010
            r6 = 0
        L_0x0010:
            r0 = 6
        L_0x0011:
            r2.<init>((java.lang.String) r3, (java.lang.String) r1, (int) r0, (boolean) r6)
            return
        L_0x0015:
            r0 = r4 & 1
            if (r0 == 0) goto L_0x001a
            r3 = r1
        L_0x001a:
            r0 = r4 & 4
            if (r0 == 0) goto L_0x001f
            r6 = 0
        L_0x001f:
            r0 = 5
            goto L_0x0011
        L_0x0021:
            r0 = r4 & 4
            if (r0 == 0) goto L_0x0026
            r6 = 0
        L_0x0026:
            r0 = 2
            r2.<init>((java.lang.String) r3, (java.lang.String) r1, (int) r0, (boolean) r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2010000_I2.<init>(java.lang.String, int, int, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        r1.A00 = r2;
        r1.A01 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        r1.A02 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0012, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001b, code lost:
        r1.A01 = r2;
        r1.A00 = r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public KtCSuperShape0S2010000_I2(java.lang.String r2, java.lang.String r3, int r4, boolean r5) {
        /*
            r1 = this;
            r1.A03 = r4
            switch(r4) {
                case 0: goto L_0x0013;
                case 1: goto L_0x0005;
                case 2: goto L_0x0017;
                case 3: goto L_0x0005;
                case 4: goto L_0x0013;
                case 5: goto L_0x0009;
                case 6: goto L_0x001b;
                default: goto L_0x0005;
            }
        L_0x0005:
            r0 = 1
            X.C04220Ms.A0B(r2, r0)
        L_0x0009:
            r1.<init>()
            r1.A00 = r2
            r1.A01 = r3
        L_0x0010:
            r1.A02 = r5
            return
        L_0x0013:
            X.AnonymousClass0wJ.A1O(r2, r3)
            goto L_0x0009
        L_0x0017:
            r0 = 1
            X.C04220Ms.A0B(r2, r0)
        L_0x001b:
            r1.<init>()
            r1.A01 = r2
            r1.A00 = r3
            goto L_0x0010
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2010000_I2.<init>(java.lang.String, java.lang.String, int, boolean):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public KtCSuperShape0S2010000_I2() {
        this((String) null, (String) null, 5, false);
        this.A03 = 5;
        this.A03 = 5;
    }
}
