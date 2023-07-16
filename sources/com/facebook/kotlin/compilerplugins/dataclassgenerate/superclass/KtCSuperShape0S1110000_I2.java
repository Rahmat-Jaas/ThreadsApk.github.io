package com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass;

import X.AnonymousClass0Sf;
import X.AnonymousClass0ZV;
import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C18190wL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

public class KtCSuperShape0S1110000_I2 extends AnonymousClass0Sf {
    public Object A00;
    public String A01;
    public boolean A02;
    public final int A03;

    public static boolean A00(int i, Object obj) {
        if (!(obj instanceof KtCSuperShape0S1110000_I2) || ((KtCSuperShape0S1110000_I2) obj).A03 != i) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0023, code lost:
        if (X.C04220Ms.A0I(r1, r0) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0029, code lost:
        if (r2.A02 == r3.A02) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0069, code lost:
        if (A00(r0, r3) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x006b, code lost:
        r3 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1110000_I2) r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0071, code lost:
        if (r2.A02 != r3.A02) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x007b, code lost:
        if (X.C04220Ms.A0I(r2.A01, r3.A01) != false) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0085, code lost:
        if (A00(r0, r3) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0087, code lost:
        r3 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1110000_I2) r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0091, code lost:
        if (X.C04220Ms.A0I(r2.A01, r3.A01) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0097, code lost:
        if (r2.A02 == r3.A02) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00a2, code lost:
        if (X.C04220Ms.A0I(r2.A00, r3.A00) != false) goto L_?;
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
    /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
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
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000d, code lost:
        if (A00(r0, r3) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:?, code lost:
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
    /* JADX WARNING: Code restructure failed: missing block: B:65:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000f, code lost:
        r3 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1110000_I2) r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0019, code lost:
        if (X.C04220Ms.A0I(r2.A01, r3.A01) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001b, code lost:
        r1 = r2.A00;
        r0 = r3.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            int r0 = r2.A03
            switch(r0) {
                case 1: goto L_0x00a5;
                case 2: goto L_0x0062;
                case 3: goto L_0x005e;
                case 4: goto L_0x005a;
                case 5: goto L_0x007e;
                case 6: goto L_0x0056;
                case 7: goto L_0x0052;
                case 8: goto L_0x004d;
                case 9: goto L_0x002d;
                case 10: goto L_0x0032;
                default: goto L_0x0005;
            }
        L_0x0005:
            if (r2 == r3) goto L_0x00a8
            r0 = 11
        L_0x0009:
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x002b
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1110000_I2 r3 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1110000_I2) r3
            java.lang.String r1 = r2.A01
            java.lang.String r0 = r3.A01
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 == 0) goto L_0x002b
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
        L_0x001f:
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 == 0) goto L_0x002b
            boolean r1 = r2.A02
            boolean r0 = r3.A02
            if (r1 == r0) goto L_0x00a8
        L_0x002b:
            r0 = 0
            return r0
        L_0x002d:
            if (r2 == r3) goto L_0x00a8
            r0 = 9
            goto L_0x0081
        L_0x0032:
            if (r2 == r3) goto L_0x00a8
            r0 = 10
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x002b
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1110000_I2 r3 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1110000_I2) r3
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 == 0) goto L_0x002b
            java.lang.String r1 = r2.A01
            java.lang.String r0 = r3.A01
            goto L_0x001f
        L_0x004d:
            if (r2 == r3) goto L_0x00a8
            r0 = 8
            goto L_0x0081
        L_0x0052:
            if (r2 == r3) goto L_0x00a8
            r0 = 7
            goto L_0x0009
        L_0x0056:
            if (r2 == r3) goto L_0x00a8
            r0 = 6
            goto L_0x0081
        L_0x005a:
            if (r2 == r3) goto L_0x00a8
            r0 = 4
            goto L_0x0009
        L_0x005e:
            if (r2 == r3) goto L_0x00a8
            r0 = 3
            goto L_0x0065
        L_0x0062:
            if (r2 == r3) goto L_0x00a8
            r0 = 2
        L_0x0065:
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x002b
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1110000_I2 r3 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1110000_I2) r3
            boolean r1 = r2.A02
            boolean r0 = r3.A02
            if (r1 != r0) goto L_0x002b
            java.lang.String r1 = r2.A01
            java.lang.String r0 = r3.A01
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 != 0) goto L_0x009a
            goto L_0x002b
        L_0x007e:
            if (r2 == r3) goto L_0x00a8
            r0 = 5
        L_0x0081:
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x002b
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1110000_I2 r3 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1110000_I2) r3
            java.lang.String r1 = r2.A01
            java.lang.String r0 = r3.A01
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 == 0) goto L_0x002b
            boolean r1 = r2.A02
            boolean r0 = r3.A02
            if (r1 == r0) goto L_0x009a
            goto L_0x002b
        L_0x009a:
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 != 0) goto L_0x00a8
            goto L_0x002b
        L_0x00a5:
            r0 = 1
            if (r2 != r3) goto L_0x0081
        L_0x00a8:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1110000_I2.equals(java.lang.Object):boolean");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0032, code lost:
        if (r0 != false) goto L_0x00ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003d, code lost:
        if (r0 != false) goto L_0x00ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0057, code lost:
        if (r0 != 0) goto L_0x0098;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0096, code lost:
        if (r0 != 0) goto L_0x0098;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0098, code lost:
        r0 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0099, code lost:
        r2 = (r1 + r0) * 31;
        r0 = r3.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x009e, code lost:
        if (r0 != null) goto L_0x00b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a0, code lost:
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ab, code lost:
        if (r0 != false) goto L_0x00ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00ad, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00ae, code lost:
        r2 = (r1 + (r0 ? 1 : 0)) * 31;
        r0 = r3.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b3, code lost:
        r1 = r0.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
        r2 = r2 + r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0014, code lost:
        r2 = r2 * 31;
        r1 = r3.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0018, code lost:
        if (r1 == 0) goto L_0x001b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        r1 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001c, code lost:
        return r2 + r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int hashCode() {
        /*
            r3 = this;
            int r0 = r3.A03
            switch(r0) {
                case 1: goto L_0x008e;
                case 2: goto L_0x0080;
                case 3: goto L_0x0069;
                case 4: goto L_0x005a;
                case 5: goto L_0x00a3;
                case 6: goto L_0x004f;
                case 7: goto L_0x0040;
                case 8: goto L_0x0035;
                case 9: goto L_0x002a;
                case 10: goto L_0x001d;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.String r0 = r3.A01
            int r0 = X.AnonymousClass0wJ.A06(r0)
            int r2 = r0 * 31
            java.lang.Object r0 = r3.A00
            int r1 = X.C18200wM.A07(r0)
        L_0x0013:
            int r2 = r2 + r1
        L_0x0014:
            int r2 = r2 * 31
            boolean r1 = r3.A02
            if (r1 == 0) goto L_0x001b
            r1 = 1
        L_0x001b:
            int r2 = r2 + r1
            return r2
        L_0x001d:
            java.lang.Object r0 = r3.A00
            int r1 = X.C18210wN.A04(r0)
            java.lang.String r0 = r3.A01
            int r2 = X.AnonymousClass0wJ.A06(r0)
            goto L_0x0013
        L_0x002a:
            java.lang.String r0 = r3.A01
            int r1 = X.C18180wK.A03(r0)
            boolean r0 = r3.A02
            if (r0 == 0) goto L_0x00ae
            goto L_0x00ad
        L_0x0035:
            java.lang.String r0 = r3.A01
            int r1 = X.C18180wK.A03(r0)
            boolean r0 = r3.A02
            if (r0 == 0) goto L_0x00ae
            goto L_0x00ad
        L_0x0040:
            java.lang.String r0 = r3.A01
            int r0 = X.AnonymousClass0wJ.A06(r0)
            int r2 = r0 * 31
            java.lang.Object r0 = r3.A00
            int r1 = X.C18200wM.A07(r0)
            goto L_0x0013
        L_0x004f:
            java.lang.String r0 = r3.A01
            int r1 = X.C18180wK.A03(r0)
            boolean r0 = r3.A02
            if (r0 == 0) goto L_0x0099
            goto L_0x0098
        L_0x005a:
            java.lang.String r0 = r3.A01
            int r0 = X.AnonymousClass0wJ.A06(r0)
            int r1 = r0 * 31
            java.lang.Object r0 = r3.A00
            int r2 = X.C18220wO.A06(r0, r1)
            goto L_0x0014
        L_0x0069:
            boolean r0 = r3.A02
            if (r0 == 0) goto L_0x006e
            r0 = 1
        L_0x006e:
            int r1 = r0 * 31
            java.lang.String r0 = r3.A01
            int r0 = X.AnonymousClass0wJ.A06(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.Object r0 = r3.A00
            int r2 = X.C18200wM.A07(r0)
            goto L_0x001b
        L_0x0080:
            boolean r0 = r3.A02
            if (r0 == 0) goto L_0x0085
            r0 = 1
        L_0x0085:
            int r1 = r0 * 31
            java.lang.String r0 = r3.A01
            int r0 = r0.hashCode()
            goto L_0x0099
        L_0x008e:
            java.lang.String r0 = r3.A01
            int r1 = X.C18180wK.A03(r0)
            boolean r0 = r3.A02
            if (r0 == 0) goto L_0x0099
        L_0x0098:
            r0 = 1
        L_0x0099:
            int r1 = r1 + r0
            int r2 = r1 * 31
            java.lang.Object r0 = r3.A00
            if (r0 != 0) goto L_0x00b3
            r1 = 0
            goto L_0x001b
        L_0x00a3:
            java.lang.String r0 = r3.A01
            int r1 = X.C18180wK.A03(r0)
            boolean r0 = r3.A02
            if (r0 == 0) goto L_0x00ae
        L_0x00ad:
            r0 = 1
        L_0x00ae:
            int r1 = r1 + r0
            int r2 = r1 * 31
            java.lang.Object r0 = r3.A00
        L_0x00b3:
            int r1 = r0.hashCode()
            goto L_0x001b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1110000_I2.hashCode():int");
    }

    public final String toString() {
        StringBuilder sb;
        switch (this.A03) {
            case 4:
                sb = C18190wL.A0s("ViewState(formattedMediaCount=");
                sb.append(this.A01);
                sb.append(", clipsGridItems=");
                sb.append(this.A00);
                sb.append(", hasMoreClips=");
                sb.append(this.A02);
                break;
            case 6:
                sb = C18190wL.A0s("GkConfig(name=");
                sb.append(this.A01);
                sb.append(", expectedValue=");
                sb.append(this.A02);
                sb.append(", currentValue=");
                sb.append(this.A00);
                break;
            default:
                return super.toString();
        }
        return AnonymousClass0wJ.A0u(sb);
    }

    public KtCSuperShape0S1110000_I2(Object obj, String str, int i, boolean z) {
        this.A03 = i;
        this.A01 = str;
        this.A00 = obj;
        this.A02 = z;
    }

    public KtCSuperShape0S1110000_I2(Boolean bool, String str, boolean z) {
        this.A03 = 6;
        C04220Ms.A0B(str, 1);
        this.A01 = str;
        this.A02 = z;
        this.A00 = bool;
    }

    public KtCSuperShape0S1110000_I2(String str, List list, boolean z) {
        this.A03 = 4;
        C04220Ms.A0B(list, 2);
        this.A01 = str;
        this.A00 = list;
        this.A02 = z;
    }

    public KtCSuperShape0S1110000_I2(KtCSuperShape0S0300000_I2 ktCSuperShape0S0300000_I2, String str, boolean z) {
        this.A03 = 8;
        this.A01 = str;
        this.A02 = z;
        this.A00 = ktCSuperShape0S0300000_I2;
    }

    public KtCSuperShape0S1110000_I2(KtCSuperShape1S0200000_I2_1 ktCSuperShape1S0200000_I2_1, String str, boolean z) {
        this.A03 = 9;
        this.A01 = str;
        this.A02 = z;
        this.A00 = ktCSuperShape1S0200000_I2_1;
    }

    public KtCSuperShape0S1110000_I2(String str, ArrayList arrayList, boolean z) {
        this.A03 = 10;
        this.A00 = arrayList;
        this.A01 = str;
        this.A02 = z;
    }

    public KtCSuperShape0S1110000_I2(boolean z, String str, Map map) {
        this.A03 = 2;
        C04220Ms.A0B(str, 2);
        this.A02 = z;
        this.A01 = str;
        this.A00 = map;
    }

    public KtCSuperShape0S1110000_I2(String str, List list, int i, boolean z) {
        this.A03 = i;
        if (1 - i != 0) {
            AnonymousClass0wJ.A1P(str, list);
        } else {
            C04220Ms.A0B(str, 1);
        }
        this.A01 = str;
        this.A02 = z;
        this.A00 = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public KtCSuperShape0S1110000_I2() {
        this((Object) null, (String) null, 7, false);
        this.A03 = 7;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public KtCSuperShape0S1110000_I2(int i) {
        this((String) null, AnonymousClass0wJ.A0v(), false);
        this.A03 = i;
        switch (i) {
            case 5:
                this.A03 = 5;
                this("", (List) AnonymousClass0ZV.A00, 5, false);
                return;
            case 7:
                this.A03 = 7;
                this((Object) null, (String) null, 7, false);
                return;
            default:
                this.A03 = 10;
                return;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public KtCSuperShape0S1110000_I2(String str, List list, DefaultConstructorMarker defaultConstructorMarker, int i, int i2, boolean z) {
        this("", (List) AnonymousClass0ZV.A00, 5, false);
        this.A03 = 5;
    }
}
