package com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass;

import X.AnonymousClass0Sf;
import X.AnonymousClass0wJ;
import X.AnonymousClass8s2;
import X.C04220Ms;
import X.C100156Mf;
import X.C146628mY;
import X.C147068nL;
import X.C18180wK;
import X.C18190wL;
import X.C18200wM;
import X.C18220wO;
import X.C86104wH;
import X.C86164wN;
import X.C89935Hp;
import X.C970267q;
import com.instagram.api.schemas.LineType;

public class KtCSuperShape0S4440000_I2 extends AnonymousClass0Sf implements C146628mY {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public final int A0C = 1;

    public KtCSuperShape0S4440000_I2(LineType lineType, C970267q r15, C147068nL r16, String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3) {
        this(lineType, r15, r16, str, str2, str3, str4, z, z2, z3, false);
    }

    public static boolean A00(int i, Object obj) {
        if (!(obj instanceof KtCSuperShape0S4440000_I2) || ((KtCSuperShape0S4440000_I2) obj).A0C != i) {
            return false;
        }
        return true;
    }

    public final String B2L() {
        return this.A04;
    }

    public final String B7K() {
        return this.A05;
    }

    public final String BGL() {
        return this.A06;
    }

    public final String BGO() {
        return this.A07;
    }

    public final C970267q BIh() {
        return (C970267q) this.A03;
    }

    public final boolean BSX() {
        return this.A0B;
    }

    public final boolean BWz() {
        return this.A08;
    }

    public final boolean BZW() {
        return this.A09;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002c, code lost:
        if (X.C04220Ms.A0I(r2.A04, r3.A04) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0032, code lost:
        if (r2.A0B != r3.A0B) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003c, code lost:
        if (X.C04220Ms.A0I(r2.A01, r3.A01) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0042, code lost:
        if (r2.A0A == r3.A0A) goto L_0x00cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00cb, code lost:
        r1 = r2.A02;
        r0 = r3.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00cf, code lost:
        if (r1 != r0) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00d9, code lost:
        if (X.C04220Ms.A0I(r2.A05, r3.A05) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00df, code lost:
        if (r2.A08 != r3.A08) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00e5, code lost:
        if (r2.A09 != r3.A09) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00eb, code lost:
        if (r2.A03 == r3.A03) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000c, code lost:
        if (A00(r0, r3) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
        return false;
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
    /* JADX WARNING: Code restructure failed: missing block: B:66:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
        r3 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4440000_I2) r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0018, code lost:
        if (X.C04220Ms.A0I(r2.A06, r3.A06) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0022, code lost:
        if (X.C04220Ms.A0I(r2.A07, r3.A07) == false) goto L_?;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            int r0 = r2.A0C
            switch(r0) {
                case 0: goto L_0x00ef;
                case 1: goto L_0x008a;
                case 2: goto L_0x0046;
                default: goto L_0x0005;
            }
        L_0x0005:
            if (r2 == r3) goto L_0x00f4
            r0 = 3
        L_0x0008:
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x0044
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4440000_I2 r3 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4440000_I2) r3
            java.lang.String r1 = r2.A06
            java.lang.String r0 = r3.A06
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 == 0) goto L_0x0044
            java.lang.String r1 = r2.A07
            java.lang.String r0 = r3.A07
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 == 0) goto L_0x0044
            java.lang.String r1 = r2.A04
            java.lang.String r0 = r3.A04
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 == 0) goto L_0x0044
            boolean r1 = r2.A0B
            boolean r0 = r3.A0B
            if (r1 != r0) goto L_0x0044
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 == 0) goto L_0x0044
            boolean r1 = r2.A0A
            boolean r0 = r3.A0A
            if (r1 == r0) goto L_0x00cb
        L_0x0044:
            r0 = 0
            return r0
        L_0x0046:
            if (r2 == r3) goto L_0x00f4
            r0 = 2
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x0044
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4440000_I2 r3 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4440000_I2) r3
            java.lang.String r1 = r2.A06
            java.lang.String r0 = r3.A06
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 == 0) goto L_0x0044
            java.lang.String r1 = r2.A07
            java.lang.String r0 = r3.A07
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 == 0) goto L_0x0044
            java.lang.String r1 = r2.A04
            java.lang.String r0 = r3.A04
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 == 0) goto L_0x0044
            boolean r1 = r2.A0B
            boolean r0 = r3.A0B
            if (r1 != r0) goto L_0x0044
            boolean r1 = r2.A0A
            boolean r0 = r3.A0A
            if (r1 != r0) goto L_0x0044
            java.lang.Object r1 = r2.A02
            java.lang.Object r0 = r3.A02
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 == 0) goto L_0x0044
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            goto L_0x00cf
        L_0x008a:
            r0 = 1
            if (r2 == r3) goto L_0x00f4
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x0044
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4440000_I2 r3 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4440000_I2) r3
            java.lang.String r1 = r2.A06
            java.lang.String r0 = r3.A06
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 == 0) goto L_0x0044
            java.lang.String r1 = r2.A07
            java.lang.String r0 = r3.A07
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 == 0) goto L_0x0044
            java.lang.String r1 = r2.A04
            java.lang.String r0 = r3.A04
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 == 0) goto L_0x0044
            boolean r1 = r2.A0B
            boolean r0 = r3.A0B
            if (r1 != r0) goto L_0x0044
            boolean r1 = r2.A0A
            boolean r0 = r3.A0A
            if (r1 != r0) goto L_0x0044
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 != 0) goto L_0x00cb
            goto L_0x0044
        L_0x00cb:
            java.lang.Object r1 = r2.A02
            java.lang.Object r0 = r3.A02
        L_0x00cf:
            if (r1 != r0) goto L_0x0044
            java.lang.String r1 = r2.A05
            java.lang.String r0 = r3.A05
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 == 0) goto L_0x0044
            boolean r1 = r2.A08
            boolean r0 = r3.A08
            if (r1 != r0) goto L_0x0044
            boolean r1 = r2.A09
            boolean r0 = r3.A09
            if (r1 != r0) goto L_0x0044
            java.lang.Object r1 = r2.A03
            java.lang.Object r0 = r3.A03
            if (r1 == r0) goto L_0x00f4
            goto L_0x0044
        L_0x00ef:
            if (r2 == r3) goto L_0x00f4
            r0 = 0
            goto L_0x0008
        L_0x00f4:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4440000_I2.equals(java.lang.Object):boolean");
    }

    public final Object getKey() {
        return this.A00;
    }

    public final int hashCode() {
        int i;
        int i2;
        int A062;
        int A052;
        int A092;
        int i3 = this.A0C;
        int A072 = AnonymousClass0wJ.A07(this.A04, AnonymousClass0wJ.A07(this.A07, C18180wK.A03(this.A06)));
        boolean z = this.A0B;
        int i4 = 1;
        switch (i3) {
            case 0:
                if (z) {
                    z = true;
                }
                i = AnonymousClass0wJ.A05(this.A01, (A072 + (z ? 1 : 0)) * 31);
                i2 = this.A0A;
                if (i2 != 0) {
                    i2 = 1;
                    break;
                }
                break;
            case 1:
                if (z) {
                    z = true;
                }
                int i5 = (A072 + (z ? 1 : 0)) * 31;
                boolean z2 = this.A0A;
                if (z2) {
                    z2 = true;
                }
                i = (i5 + (z2 ? 1 : 0)) * 31;
                i2 = this.A01.hashCode();
                break;
            case 2:
                if (z) {
                    z = true;
                }
                int i6 = (A072 + (z ? 1 : 0)) * 31;
                boolean z3 = this.A0A;
                if (z3) {
                    z3 = true;
                }
                A052 = AnonymousClass0wJ.A05(this.A01, (((i6 + (z3 ? 1 : 0)) * 31) + AnonymousClass0wJ.A03(this.A02)) * 31);
                A092 = C18200wM.A09(this.A05);
                break;
            default:
                if (z) {
                    z = true;
                }
                int A053 = AnonymousClass0wJ.A05(this.A01, (A072 + (z ? 1 : 0)) * 31);
                boolean z4 = this.A0A;
                if (z4) {
                    z4 = true;
                }
                A062 = C18220wO.A06(this.A02, (A053 + (z4 ? 1 : 0)) * 31);
                break;
        }
        A062 = C18220wO.A06(this.A02, (i + i2) * 31);
        A092 = A062 * 31;
        A052 = AnonymousClass0wJ.A06(this.A05);
        int i7 = (((A092 + A052) * 31) + (C86164wN.A1S(this.A08) ? 1 : 0)) * 31;
        if (!this.A09) {
            i4 = 0;
        }
        return C18220wO.A06(this.A03, (i7 + i4) * 31);
    }

    public KtCSuperShape0S4440000_I2(LineType lineType, C970267q r3, C147068nL r4, String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A06 = str;
        this.A07 = str2;
        this.A04 = str3;
        this.A0B = z;
        this.A01 = r4;
        this.A0A = z2;
        this.A02 = lineType;
        this.A05 = str4;
        this.A08 = z3;
        this.A09 = z4;
        this.A03 = r3;
        this.A00 = C100156Mf.A00(this, "single_media");
    }

    public KtCSuperShape0S4440000_I2(LineType lineType, C970267q r4, C89935Hp r5, String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        String str5;
        C86104wH.A1P(str, 1, lineType);
        C04220Ms.A0B(r4, 11);
        this.A06 = str;
        this.A07 = str2;
        this.A04 = str3;
        this.A0B = z;
        this.A0A = z2;
        this.A02 = r5;
        this.A01 = lineType;
        this.A05 = str4;
        this.A08 = z3;
        this.A09 = z4;
        this.A03 = r4;
        if (r5 == null || !C18190wL.A1a(r5.A0C)) {
            str5 = "quote_post_preview";
        } else {
            str5 = "quote_post_media_preview";
        }
        this.A00 = C100156Mf.A00(this, str5);
    }

    public KtCSuperShape0S4440000_I2(LineType lineType, C970267q r3, String str, String str2, String str3, String str4, AnonymousClass8s2 r8, boolean z, boolean z2, boolean z3, boolean z4) {
        C04220Ms.A0B(r8, 5);
        this.A06 = str;
        this.A07 = str2;
        this.A04 = str3;
        this.A0B = z;
        this.A01 = r8;
        this.A0A = z2;
        this.A02 = lineType;
        this.A05 = str4;
        this.A08 = z3;
        this.A09 = z4;
        this.A03 = r3;
        this.A00 = C100156Mf.A00(this, "carousel");
    }

    public KtCSuperShape0S4440000_I2(KtCSuperShape0S3200000_I2 ktCSuperShape0S3200000_I2, LineType lineType, C970267q r4, String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A06 = str;
        this.A07 = str2;
        this.A04 = str3;
        this.A0B = z;
        this.A0A = z2;
        this.A01 = ktCSuperShape0S3200000_I2;
        this.A02 = lineType;
        this.A05 = str4;
        this.A08 = z3;
        this.A09 = z4;
        this.A03 = r4;
        this.A00 = C100156Mf.A00(this, "link_preview");
    }

    public KtCSuperShape0S4440000_I2(LineType lineType, C970267q r14, String str, String str2, String str3, String str4, AnonymousClass8s2 r19, boolean z, boolean z2, boolean z3) {
        this(lineType, r14, str, str2, str3, str4, r19, z, z2, z3, false);
    }

    public KtCSuperShape0S4440000_I2(LineType lineType, C970267q r15, C89935Hp r16, String str, String str2, String str3, String str4, boolean z, boolean z2) {
        this(lineType, r15, r16, str, str2, str3, str4, z, z2, false, false);
    }
}
