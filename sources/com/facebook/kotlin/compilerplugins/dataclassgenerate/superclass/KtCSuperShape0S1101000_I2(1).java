package com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass;

import X.AnonymousClass0Sf;
import X.AnonymousClass0wJ;
import X.AnonymousClass9Mq;
import X.C04220Ms;
import X.C18180wK;
import X.Lbg;
import android.view.View;
import com.instagram.common.gallery.Medium;
import java.util.List;

public class KtCSuperShape0S1101000_I2 extends AnonymousClass0Sf {
    public int A00;
    public Object A01;
    public String A02;
    public final int A03 = 3;

    public KtCSuperShape0S1101000_I2(AnonymousClass9Mq r3, String str, int i) {
        C04220Ms.A0B(r3, 1);
        C04220Ms.A0B(str, 3);
        this.A01 = r3;
        this.A00 = i;
        this.A02 = str;
    }

    public static boolean A00(int i, Object obj) {
        if (!(obj instanceof KtCSuperShape0S1101000_I2) || ((KtCSuperShape0S1101000_I2) obj).A03 != i) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0076, code lost:
        if (X.C04220Ms.A0I(r1, r0) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x007c, code lost:
        if (r2.A00 == r3.A00) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00b8, code lost:
        r1 = r2.A02;
        r0 = r3.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00bd, code lost:
        r1 = r2.A01;
        r0 = r3.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00c5, code lost:
        if (X.C04220Ms.A0I(r1, r0) != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:?, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            int r0 = r2.A03
            switch(r0) {
                case 0: goto L_0x009b;
                case 1: goto L_0x007f;
                case 2: goto L_0x005d;
                case 3: goto L_0x0041;
                case 4: goto L_0x0027;
                case 5: goto L_0x000a;
                default: goto L_0x0005;
            }
        L_0x0005:
            boolean r0 = super.equals(r3)
            return r0
        L_0x000a:
            if (r2 == r3) goto L_0x00c8
            r0 = 5
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x00b6
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1101000_I2 r3 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1101000_I2) r3
            java.lang.String r1 = r2.A02
            java.lang.String r0 = r3.A02
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 == 0) goto L_0x00b6
            int r1 = r2.A00
            int r0 = r3.A00
            if (r1 == r0) goto L_0x00bd
            goto L_0x00b6
        L_0x0027:
            if (r2 == r3) goto L_0x00c8
            r0 = 4
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x00b6
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1101000_I2 r3 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1101000_I2) r3
            java.lang.String r1 = r2.A02
            java.lang.String r0 = r3.A02
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 == 0) goto L_0x00b6
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            goto L_0x0072
        L_0x0041:
            if (r2 == r3) goto L_0x00c8
            r0 = 3
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x00b6
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1101000_I2 r3 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1101000_I2) r3
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 == 0) goto L_0x00b6
            int r1 = r2.A00
            int r0 = r3.A00
            if (r1 == r0) goto L_0x00b8
            goto L_0x00b6
        L_0x005d:
            if (r2 == r3) goto L_0x00c8
            r0 = 2
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x00b6
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1101000_I2 r3 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1101000_I2) r3
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            if (r1 != r0) goto L_0x00b6
            java.lang.String r1 = r2.A02
            java.lang.String r0 = r3.A02
        L_0x0072:
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 == 0) goto L_0x00b6
            int r1 = r2.A00
            int r0 = r3.A00
            if (r1 == r0) goto L_0x00c8
            goto L_0x00b6
        L_0x007f:
            r0 = 1
            if (r2 == r3) goto L_0x00c8
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x00b6
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1101000_I2 r3 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1101000_I2) r3
            int r1 = r2.A00
            int r0 = r3.A00
            if (r1 != r0) goto L_0x00b6
            java.lang.String r1 = r2.A02
            java.lang.String r0 = r3.A02
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 != 0) goto L_0x00bd
            goto L_0x00b6
        L_0x009b:
            if (r2 == r3) goto L_0x00c8
            r0 = 0
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x00b6
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1101000_I2 r3 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1101000_I2) r3
            int r1 = r2.A00
            int r0 = r3.A00
            if (r1 != r0) goto L_0x00b6
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 != 0) goto L_0x00b8
        L_0x00b6:
            r0 = 0
            return r0
        L_0x00b8:
            java.lang.String r1 = r2.A02
            java.lang.String r0 = r3.A02
            goto L_0x00c1
        L_0x00bd:
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
        L_0x00c1:
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 != 0) goto L_0x00c8
            goto L_0x00b6
        L_0x00c8:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1101000_I2.equals(java.lang.Object):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0045, code lost:
        r1 = (r1 + r0) * 31;
        r0 = r2.A01.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0059, code lost:
        r1 = (r1 + r0) * 31;
        r0 = r2.A02.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0063, code lost:
        return r1 + r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0035, code lost:
        r1 = (r1 + r0) * 31;
        r0 = r2.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int hashCode() {
        /*
            r2 = this;
            int r0 = r2.A03
            switch(r0) {
                case 0: goto L_0x004f;
                case 1: goto L_0x003b;
                case 2: goto L_0x0029;
                case 3: goto L_0x0020;
                case 4: goto L_0x0013;
                case 5: goto L_0x000a;
                default: goto L_0x0005;
            }
        L_0x0005:
            int r1 = super.hashCode()
            return r1
        L_0x000a:
            java.lang.String r0 = r2.A02
            int r1 = X.C18180wK.A03(r0)
            int r0 = r2.A00
            goto L_0x0045
        L_0x0013:
            java.lang.String r0 = r2.A02
            int r1 = X.C18180wK.A03(r0)
            java.lang.Object r0 = r2.A01
            int r0 = r0.hashCode()
            goto L_0x0035
        L_0x0020:
            java.lang.Object r0 = r2.A01
            int r1 = X.C18210wN.A04(r0)
            int r0 = r2.A00
            goto L_0x0059
        L_0x0029:
            java.lang.Object r0 = r2.A01
            int r1 = X.C18210wN.A04(r0)
            java.lang.String r0 = r2.A02
            int r0 = r0.hashCode()
        L_0x0035:
            int r1 = r1 + r0
            int r1 = r1 * 31
            int r0 = r2.A00
            goto L_0x0062
        L_0x003b:
            int r0 = r2.A00
            int r1 = r0 * 31
            java.lang.String r0 = r2.A02
            int r0 = r0.hashCode()
        L_0x0045:
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.Object r0 = r2.A01
            int r0 = r0.hashCode()
            goto L_0x0062
        L_0x004f:
            int r0 = r2.A00
            int r1 = r0 * 31
            java.lang.Object r0 = r2.A01
            int r0 = X.AnonymousClass0wJ.A03(r0)
        L_0x0059:
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r2.A02
            int r0 = r0.hashCode()
        L_0x0062:
            int r1 = r1 + r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1101000_I2.hashCode():int");
    }

    public KtCSuperShape0S1101000_I2(Medium medium, String str, int i) {
        AnonymousClass0wJ.A1O(str, medium);
        this.A02 = str;
        this.A01 = medium;
        this.A00 = i;
    }

    public KtCSuperShape0S1101000_I2(List list, int i, String str) {
        this.A00 = i;
        this.A02 = str;
        this.A01 = list;
    }

    public KtCSuperShape0S1101000_I2(Lbg lbg, String str, int i) {
        C04220Ms.A0B(lbg, 1);
        this.A01 = lbg;
        this.A02 = str;
        this.A00 = i;
    }

    public KtCSuperShape0S1101000_I2(View.OnClickListener onClickListener, String str, int i) {
        this.A02 = str;
        this.A00 = i;
        this.A01 = onClickListener;
    }

    public KtCSuperShape0S1101000_I2(KtCSuperShape0S0300000_I2 ktCSuperShape0S0300000_I2, String str, int i) {
        C18180wK.A1P(str, 1, ktCSuperShape0S0300000_I2);
        this.A02 = str;
        this.A00 = i;
        this.A01 = ktCSuperShape0S0300000_I2;
    }

    public KtCSuperShape0S1101000_I2(String str, List list, int i) {
        C04220Ms.A0B(str, 3);
        this.A00 = i;
        this.A01 = list;
        this.A02 = str;
    }
}
