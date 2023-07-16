package com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass;

import X.AnonymousClass0Sf;
import X.AnonymousClass0wJ;
import X.C170679vO;
import X.C18190wL;
import X.C18210wN;
import X.C35387Itt;
import X.C57943Dd;
import X.C89985Hw;
import android.graphics.Typeface;
import android.text.Spannable;
import com.instagram.barcelona.R;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

public class KtCSuperShape0S0202000_I2 extends AnonymousClass0Sf {
    public int A00;
    public int A01;
    public Object A02;
    public Object A03;
    public final int A04;

    public static boolean A00(int i, Object obj) {
        if (!(obj instanceof KtCSuperShape0S0202000_I2) || ((KtCSuperShape0S0202000_I2) obj).A04 != i) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0084, code lost:
        r1 = r2.A03;
        r0 = r3.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00ae, code lost:
        if (X.C04220Ms.A0I(r1, r0) != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001a, code lost:
        if (r1 == r0) goto L_?;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            int r0 = r2.A04
            switch(r0) {
                case 0: goto L_0x0089;
                case 1: goto L_0x0062;
                case 2: goto L_0x0044;
                case 3: goto L_0x001e;
                default: goto L_0x0005;
            }
        L_0x0005:
            if (r2 == r3) goto L_0x00b2
            r0 = 4
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x001c
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0202000_I2 r3 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0202000_I2) r3
            int r1 = r2.A00
            int r0 = r3.A00
            if (r1 != r0) goto L_0x001c
            int r1 = r2.A01
            int r0 = r3.A01
        L_0x001a:
            if (r1 == r0) goto L_0x00b2
        L_0x001c:
            r0 = 0
            return r0
        L_0x001e:
            if (r2 == r3) goto L_0x00b2
            r0 = 3
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x001c
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0202000_I2 r3 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0202000_I2) r3
            java.lang.Object r1 = r2.A03
            java.lang.Object r0 = r3.A03
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 == 0) goto L_0x001c
            java.lang.Object r1 = r2.A02
            java.lang.Object r0 = r3.A02
            if (r1 != r0) goto L_0x001c
            int r1 = r2.A01
            int r0 = r3.A01
            if (r1 != r0) goto L_0x001c
            int r1 = r2.A00
            int r0 = r3.A00
            goto L_0x001a
        L_0x0044:
            if (r2 == r3) goto L_0x00b2
            r0 = 2
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x001c
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0202000_I2 r3 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0202000_I2) r3
            int r1 = r2.A00
            int r0 = r3.A00
            if (r1 != r0) goto L_0x001c
            int r1 = r2.A01
            int r0 = r3.A01
            if (r1 != r0) goto L_0x001c
            java.lang.Object r1 = r2.A02
            java.lang.Object r0 = r3.A02
            if (r1 == r0) goto L_0x0084
            goto L_0x001c
        L_0x0062:
            r0 = 1
            if (r2 == r3) goto L_0x00b2
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x001c
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0202000_I2 r3 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0202000_I2) r3
            java.lang.Object r1 = r2.A02
            java.lang.Object r0 = r3.A02
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 == 0) goto L_0x001c
            int r1 = r2.A01
            int r0 = r3.A01
            if (r1 != r0) goto L_0x001c
            int r1 = r2.A00
            int r0 = r3.A00
            if (r1 == r0) goto L_0x0084
            goto L_0x001c
        L_0x0084:
            java.lang.Object r1 = r2.A03
            java.lang.Object r0 = r3.A03
            goto L_0x00aa
        L_0x0089:
            if (r2 == r3) goto L_0x00b2
            r0 = 0
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x001c
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0202000_I2 r3 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0202000_I2) r3
            java.lang.Object r1 = r2.A03
            java.lang.Object r0 = r3.A03
            if (r1 != r0) goto L_0x001c
            int r1 = r2.A01
            int r0 = r3.A01
            if (r1 != r0) goto L_0x001c
            int r1 = r2.A00
            int r0 = r3.A00
            if (r1 != r0) goto L_0x001c
            java.lang.Object r1 = r2.A02
            java.lang.Object r0 = r3.A02
        L_0x00aa:
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 != 0) goto L_0x00b2
            goto L_0x001c
        L_0x00b2:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0202000_I2.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i;
        Object obj;
        int hashCode;
        String str;
        switch (this.A04) {
            case 0:
                int A042 = AnonymousClass0wJ.A04(this.A03);
                switch (A042) {
                    case 1:
                        str = "SETTINGS";
                        break;
                    case 2:
                        str = "SHARE_STORY_STICKER";
                        break;
                    default:
                        str = "FAN_REFERRAL";
                        break;
                }
                i = (((((str.hashCode() + A042) * 31) + this.A01) * 31) + this.A00) * 31;
                obj = this.A02;
                break;
            case 1:
                i = (((C18210wN.A04(this.A02) + this.A01) * 31) + this.A00) * 31;
                obj = this.A03;
                break;
            case 2:
                i = AnonymousClass0wJ.A05(this.A02, ((this.A00 * 31) + this.A01) * 31);
                obj = this.A03;
                break;
            case 3:
                i = (AnonymousClass0wJ.A05(this.A02, C18210wN.A04(this.A03)) + this.A01) * 31;
                hashCode = this.A00;
                break;
            default:
                i = this.A00 * 31;
                hashCode = this.A01;
                break;
        }
        if (obj == null) {
            hashCode = 0;
            return i + hashCode;
        }
        hashCode = obj.hashCode();
        return i + hashCode;
    }

    public final String toString() {
        String str;
        if (this.A04 != 0) {
            return super.toString();
        }
        StringBuilder A0s = C18190wL.A0s("ConsiderationActionButton(type=");
        Number number = (Number) this.A03;
        if (number != null) {
            switch (number.intValue()) {
                case 1:
                    str = "SETTINGS";
                    break;
                case 2:
                    str = "SHARE_STORY_STICKER";
                    break;
                default:
                    str = "FAN_REFERRAL";
                    break;
            }
        } else {
            str = "null";
        }
        A0s.append(str);
        A0s.append(", drawableRes=");
        A0s.append(this.A01);
        A0s.append(", description=");
        A0s.append(this.A00);
        A0s.append(", tooltipText=");
        A0s.append(this.A02);
        return AnonymousClass0wJ.A0u(A0s);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public KtCSuperShape0S0202000_I2(android.text.Spannable r4) {
        /*
            r3 = this;
            r2 = 2131165218(0x7f070022, float:1.7944647E38)
            r0 = 1
            r3.A04 = r0
            r1 = 2131099740(0x7f06005c, float:1.7811842E38)
            android.graphics.Typeface r0 = android.graphics.Typeface.SANS_SERIF
            if (r0 != 0) goto L_0x000f
            android.graphics.Typeface r0 = android.graphics.Typeface.DEFAULT
        L_0x000f:
            r3.<init>((android.graphics.Typeface) r0, (android.text.Spannable) r4, (int) r2, (int) r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0202000_I2.<init>(android.text.Spannable):void");
    }

    public KtCSuperShape0S0202000_I2(C170679vO r3, C89985Hw r4, int i) {
        this.A04 = 3;
        this.A03 = r4;
        this.A02 = r3;
        this.A01 = 0;
        this.A00 = i;
    }

    public KtCSuperShape0S0202000_I2(Typeface typeface, Spannable spannable, int i, int i2) {
        this.A04 = 1;
        this.A02 = spannable;
        this.A01 = i;
        this.A00 = i2;
        this.A03 = typeface;
    }

    public KtCSuperShape0S0202000_I2(C35387Itt itt, Set set, DefaultConstructorMarker defaultConstructorMarker, int i, int i2, int i3, int i4) {
        this.A04 = 2;
        C35387Itt itt2 = C35387Itt.IGT;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.A04 = 2;
        this.A00 = 0;
        this.A01 = 0;
        this.A02 = itt2;
        this.A03 = linkedHashSet;
    }

    public KtCSuperShape0S0202000_I2(C57943Dd r2, Integer num, int i, int i2) {
        this.A04 = 0;
        this.A03 = num;
        this.A01 = i;
        this.A00 = i2;
        this.A02 = r2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public KtCSuperShape0S0202000_I2(Integer num) {
        this((C57943Dd) null, num, (int) R.drawable.instagram_settings_pano_outline_24, 2131827099);
        this.A04 = 0;
    }

    public KtCSuperShape0S0202000_I2() {
        this.A04 = 4;
        this.A00 = 2131836530;
        this.A01 = R.drawable.instagram_alert_pano_outline_24;
    }
}
