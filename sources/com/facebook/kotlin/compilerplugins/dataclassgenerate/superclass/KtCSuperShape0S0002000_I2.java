package com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass;

import X.AnonymousClass0Sf;
import X.AnonymousClass0wJ;
import X.C18190wL;
import com.instagram.react.modules.base.IgReactQEModule;

public class KtCSuperShape0S0002000_I2 extends AnonymousClass0Sf {
    public int A00;
    public int A01;
    public final int A02;

    public KtCSuperShape0S0002000_I2(int i, int i2, int i3) {
        this.A02 = i3;
        switch (i3) {
            case 0:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 10:
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
            case 13:
            case 14:
                this.A01 = i;
                this.A00 = i2;
                return;
            default:
                this.A00 = i;
                this.A01 = i2;
                return;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0041, code lost:
        if ((r3 instanceof com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0002000_I2) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0043, code lost:
        r3 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0002000_I2) r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0047, code lost:
        if (r3.A02 != r1) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x004d, code lost:
        if (r2.A01 != r3.A01) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x004f, code lost:
        r1 = r2.A00;
        r0 = r3.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0059, code lost:
        if ((r3 instanceof com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0002000_I2) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x005b, code lost:
        r3 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0002000_I2) r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x005f, code lost:
        if (r3.A02 != r1) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0065, code lost:
        if (r2.A00 != r3.A00) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0067, code lost:
        r1 = r2.A01;
        r0 = r3.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x006b, code lost:
        if (r1 == r0) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:?, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            int r0 = r2.A02
            switch(r0) {
                case 0: goto L_0x003c;
                case 1: goto L_0x006f;
                case 2: goto L_0x0054;
                case 3: goto L_0x0038;
                case 4: goto L_0x0034;
                case 5: goto L_0x0030;
                case 6: goto L_0x002c;
                case 7: goto L_0x0028;
                case 8: goto L_0x0023;
                case 9: goto L_0x001e;
                case 10: goto L_0x0019;
                case 11: goto L_0x000a;
                case 12: goto L_0x0014;
                case 13: goto L_0x000f;
                default: goto L_0x0005;
            }
        L_0x0005:
            boolean r0 = super.equals(r3)
            return r0
        L_0x000a:
            if (r2 == r3) goto L_0x0072
            r1 = 11
            goto L_0x0057
        L_0x000f:
            if (r2 == r3) goto L_0x0072
            r1 = 13
            goto L_0x003f
        L_0x0014:
            if (r2 == r3) goto L_0x0072
            r1 = 12
            goto L_0x003f
        L_0x0019:
            if (r2 == r3) goto L_0x0072
            r1 = 10
            goto L_0x003f
        L_0x001e:
            if (r2 == r3) goto L_0x0072
            r1 = 9
            goto L_0x003f
        L_0x0023:
            if (r2 == r3) goto L_0x0072
            r1 = 8
            goto L_0x0057
        L_0x0028:
            if (r2 == r3) goto L_0x0072
            r1 = 7
            goto L_0x0057
        L_0x002c:
            if (r2 == r3) goto L_0x0072
            r1 = 6
            goto L_0x003f
        L_0x0030:
            if (r2 == r3) goto L_0x0072
            r1 = 5
            goto L_0x003f
        L_0x0034:
            if (r2 == r3) goto L_0x0072
            r1 = 4
            goto L_0x003f
        L_0x0038:
            if (r2 == r3) goto L_0x0072
            r1 = 3
            goto L_0x003f
        L_0x003c:
            if (r2 == r3) goto L_0x0072
            r1 = 0
        L_0x003f:
            boolean r0 = r3 instanceof com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0002000_I2
            if (r0 == 0) goto L_0x006d
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0002000_I2 r3 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0002000_I2) r3
            int r0 = r3.A02
            if (r0 != r1) goto L_0x006d
            int r1 = r2.A01
            int r0 = r3.A01
            if (r1 != r0) goto L_0x006d
            int r1 = r2.A00
            int r0 = r3.A00
            goto L_0x006b
        L_0x0054:
            if (r2 == r3) goto L_0x0072
            r1 = 2
        L_0x0057:
            boolean r0 = r3 instanceof com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0002000_I2
            if (r0 == 0) goto L_0x006d
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0002000_I2 r3 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0002000_I2) r3
            int r0 = r3.A02
            if (r0 != r1) goto L_0x006d
            int r1 = r2.A00
            int r0 = r3.A00
            if (r1 != r0) goto L_0x006d
            int r1 = r2.A01
            int r0 = r3.A01
        L_0x006b:
            if (r1 == r0) goto L_0x0072
        L_0x006d:
            r0 = 0
            return r0
        L_0x006f:
            r1 = 1
            if (r2 != r3) goto L_0x0057
        L_0x0072:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0002000_I2.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i;
        int i2;
        switch (this.A02) {
            case 0:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 10:
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
            case 13:
                i = this.A01 * 31;
                i2 = this.A00;
                break;
            case 1:
            case 2:
            case 7:
            case 8:
            case 11:
                i = this.A00 * 31;
                i2 = this.A01;
                break;
            default:
                return super.hashCode();
        }
        return i + i2;
    }

    public final String toString() {
        StringBuilder sb;
        int i;
        String str;
        switch (this.A02) {
            case 6:
                sb = C18190wL.A0s("CaptionAudioBleep(startTimeMs=");
                sb.append(this.A01);
                sb.append(", endTimeMs=");
                i = this.A00;
                break;
            case 7:
                sb = C18190wL.A0s("FilterInfo(filterId=");
                sb.append(this.A00);
                str = ", filterStrength=";
                break;
            case 8:
                sb = C18190wL.A0s("TooltipDataItem(count=");
                sb.append(this.A00);
                str = ", resId=";
                break;
            default:
                return super.toString();
        }
        sb.append(str);
        i = this.A01;
        sb.append(i);
        return AnonymousClass0wJ.A0u(sb);
    }
}
