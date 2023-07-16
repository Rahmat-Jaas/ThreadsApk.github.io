package com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass;

import X.AnonymousClass0Sf;
import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C18190wL;
import ch.boye.httpclientandroidlib.client.utils.Rfc3492Idn;
import kotlin.jvm.internal.DefaultConstructorMarker;

public class KtCSuperShape0S2000000_I2 extends AnonymousClass0Sf {
    public String A00;
    public String A01;
    public final int A02;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public KtCSuperShape0S2000000_I2(String str) {
        this(str, (String) null, 40);
        this.A02 = 40;
        C04220Ms.A0B(str, 1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0114, code lost:
        if (X.C04220Ms.A0I(r1, r0) != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x00de, code lost:
        if ((r3 instanceof com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2000000_I2) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x00e0, code lost:
        r3 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2000000_I2) r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x00e4, code lost:
        if (r3.A02 != r1) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x00ee, code lost:
        if (X.C04220Ms.A0I(r2.A01, r3.A01) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x00f0, code lost:
        r1 = r2.A00;
        r0 = r3.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x00fa, code lost:
        if ((r3 instanceof com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2000000_I2) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x00fc, code lost:
        r3 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2000000_I2) r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0100, code lost:
        if (r3.A02 != r1) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x010a, code lost:
        if (X.C04220Ms.A0I(r2.A00, r3.A00) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x010c, code lost:
        r1 = r2.A01;
        r0 = r3.A01;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            int r0 = r2.A02
            switch(r0) {
                case 0: goto L_0x00f5;
                case 1: goto L_0x0005;
                case 2: goto L_0x00d9;
                case 3: goto L_0x00d5;
                case 4: goto L_0x0005;
                case 5: goto L_0x00d1;
                case 6: goto L_0x00cd;
                case 7: goto L_0x00c9;
                case 8: goto L_0x00c4;
                case 9: goto L_0x00bf;
                case 10: goto L_0x00ba;
                case 11: goto L_0x00b5;
                case 12: goto L_0x00b0;
                case 13: goto L_0x00ab;
                case 14: goto L_0x00a6;
                case 15: goto L_0x00a1;
                case 16: goto L_0x009c;
                case 17: goto L_0x0097;
                case 18: goto L_0x0092;
                case 19: goto L_0x008d;
                case 20: goto L_0x0088;
                case 21: goto L_0x0005;
                case 22: goto L_0x0083;
                case 23: goto L_0x007e;
                case 24: goto L_0x0079;
                case 25: goto L_0x0074;
                case 26: goto L_0x006e;
                case 27: goto L_0x0068;
                case 28: goto L_0x0063;
                case 29: goto L_0x005e;
                case 30: goto L_0x0058;
                case 31: goto L_0x0052;
                case 32: goto L_0x004c;
                case 33: goto L_0x0046;
                case 34: goto L_0x0040;
                case 35: goto L_0x003a;
                case 36: goto L_0x0034;
                case 37: goto L_0x002e;
                case 38: goto L_0x0005;
                case 39: goto L_0x0028;
                case 40: goto L_0x0022;
                case 41: goto L_0x001c;
                case 42: goto L_0x0016;
                case 43: goto L_0x0010;
                case 44: goto L_0x000a;
                default: goto L_0x0005;
            }
        L_0x0005:
            boolean r0 = super.equals(r3)
            return r0
        L_0x000a:
            if (r2 == r3) goto L_0x0118
            r1 = 44
            goto L_0x00f8
        L_0x0010:
            if (r2 == r3) goto L_0x0118
            r1 = 43
            goto L_0x00dc
        L_0x0016:
            if (r2 == r3) goto L_0x0118
            r1 = 42
            goto L_0x00dc
        L_0x001c:
            if (r2 == r3) goto L_0x0118
            r1 = 41
            goto L_0x00f8
        L_0x0022:
            if (r2 == r3) goto L_0x0118
            r1 = 40
            goto L_0x00dc
        L_0x0028:
            if (r2 == r3) goto L_0x0118
            r1 = 39
            goto L_0x00f8
        L_0x002e:
            if (r2 == r3) goto L_0x0118
            r1 = 37
            goto L_0x00dc
        L_0x0034:
            if (r2 == r3) goto L_0x0118
            r1 = 36
            goto L_0x00f8
        L_0x003a:
            if (r2 == r3) goto L_0x0118
            r1 = 35
            goto L_0x00dc
        L_0x0040:
            if (r2 == r3) goto L_0x0118
            r1 = 34
            goto L_0x00f8
        L_0x0046:
            if (r2 == r3) goto L_0x0118
            r1 = 33
            goto L_0x00f8
        L_0x004c:
            if (r2 == r3) goto L_0x0118
            r1 = 32
            goto L_0x00dc
        L_0x0052:
            if (r2 == r3) goto L_0x0118
            r1 = 31
            goto L_0x00dc
        L_0x0058:
            if (r2 == r3) goto L_0x0118
            r1 = 30
            goto L_0x00f8
        L_0x005e:
            if (r2 == r3) goto L_0x0118
            r1 = 29
            goto L_0x00dc
        L_0x0063:
            if (r2 == r3) goto L_0x0118
            r1 = 28
            goto L_0x00dc
        L_0x0068:
            if (r2 == r3) goto L_0x0118
            r1 = 27
            goto L_0x00f8
        L_0x006e:
            if (r2 == r3) goto L_0x0118
            r1 = 26
            goto L_0x00f8
        L_0x0074:
            if (r2 == r3) goto L_0x0118
            r1 = 25
            goto L_0x00dc
        L_0x0079:
            if (r2 == r3) goto L_0x0118
            r1 = 24
            goto L_0x00f8
        L_0x007e:
            if (r2 == r3) goto L_0x0118
            r1 = 23
            goto L_0x00f8
        L_0x0083:
            if (r2 == r3) goto L_0x0118
            r1 = 22
            goto L_0x00f8
        L_0x0088:
            if (r2 == r3) goto L_0x0118
            r1 = 20
            goto L_0x00dc
        L_0x008d:
            if (r2 == r3) goto L_0x0118
            r1 = 19
            goto L_0x00dc
        L_0x0092:
            if (r2 == r3) goto L_0x0118
            r1 = 18
            goto L_0x00f8
        L_0x0097:
            if (r2 == r3) goto L_0x0118
            r1 = 17
            goto L_0x00f8
        L_0x009c:
            if (r2 == r3) goto L_0x0118
            r1 = 16
            goto L_0x00dc
        L_0x00a1:
            if (r2 == r3) goto L_0x0118
            r1 = 15
            goto L_0x00dc
        L_0x00a6:
            if (r2 == r3) goto L_0x0118
            r1 = 14
            goto L_0x00f8
        L_0x00ab:
            if (r2 == r3) goto L_0x0118
            r1 = 13
            goto L_0x00f8
        L_0x00b0:
            if (r2 == r3) goto L_0x0118
            r1 = 12
            goto L_0x00f8
        L_0x00b5:
            if (r2 == r3) goto L_0x0118
            r1 = 11
            goto L_0x00f8
        L_0x00ba:
            if (r2 == r3) goto L_0x0118
            r1 = 10
            goto L_0x00f8
        L_0x00bf:
            if (r2 == r3) goto L_0x0118
            r1 = 9
            goto L_0x00f8
        L_0x00c4:
            if (r2 == r3) goto L_0x0118
            r1 = 8
            goto L_0x00f8
        L_0x00c9:
            if (r2 == r3) goto L_0x0118
            r1 = 7
            goto L_0x00f8
        L_0x00cd:
            if (r2 == r3) goto L_0x0118
            r1 = 6
            goto L_0x00f8
        L_0x00d1:
            if (r2 == r3) goto L_0x0118
            r1 = 5
            goto L_0x00dc
        L_0x00d5:
            if (r2 == r3) goto L_0x0118
            r1 = 3
            goto L_0x00f8
        L_0x00d9:
            if (r2 == r3) goto L_0x0118
            r1 = 2
        L_0x00dc:
            boolean r0 = r3 instanceof com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2000000_I2
            if (r0 == 0) goto L_0x0116
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2000000_I2 r3 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2000000_I2) r3
            int r0 = r3.A02
            if (r0 != r1) goto L_0x0116
            java.lang.String r1 = r2.A01
            java.lang.String r0 = r3.A01
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 == 0) goto L_0x0116
            java.lang.String r1 = r2.A00
            java.lang.String r0 = r3.A00
            goto L_0x0110
        L_0x00f5:
            if (r2 == r3) goto L_0x0118
            r1 = 0
        L_0x00f8:
            boolean r0 = r3 instanceof com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2000000_I2
            if (r0 == 0) goto L_0x0116
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2000000_I2 r3 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2000000_I2) r3
            int r0 = r3.A02
            if (r0 != r1) goto L_0x0116
            java.lang.String r1 = r2.A00
            java.lang.String r0 = r3.A00
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 == 0) goto L_0x0116
            java.lang.String r1 = r2.A01
            java.lang.String r0 = r3.A01
        L_0x0110:
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 != 0) goto L_0x0118
        L_0x0116:
            r0 = 0
            return r0
        L_0x0118:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2000000_I2.equals(java.lang.Object):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003d, code lost:
        r2 = X.C18200wM.A09(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004a, code lost:
        r1 = r0.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004f, code lost:
        return r2 + r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0024, code lost:
        if (r0 != null) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0026, code lost:
        r1 = 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int hashCode() {
        /*
            r3 = this;
            int r0 = r3.A02
            switch(r0) {
                case 0: goto L_0x000a;
                case 1: goto L_0x0005;
                case 2: goto L_0x0042;
                case 3: goto L_0x0033;
                case 4: goto L_0x0005;
                case 5: goto L_0x0042;
                case 6: goto L_0x000a;
                case 7: goto L_0x0013;
                case 8: goto L_0x000a;
                case 9: goto L_0x000a;
                case 10: goto L_0x0013;
                case 11: goto L_0x0033;
                case 12: goto L_0x0033;
                case 13: goto L_0x000a;
                case 14: goto L_0x000a;
                case 15: goto L_0x0028;
                case 16: goto L_0x0042;
                case 17: goto L_0x000a;
                case 18: goto L_0x000a;
                case 19: goto L_0x0028;
                case 20: goto L_0x001c;
                case 21: goto L_0x0005;
                case 22: goto L_0x000a;
                case 23: goto L_0x000a;
                case 24: goto L_0x0013;
                case 25: goto L_0x0042;
                case 26: goto L_0x0013;
                case 27: goto L_0x000a;
                case 28: goto L_0x0028;
                case 29: goto L_0x0028;
                case 30: goto L_0x000a;
                case 31: goto L_0x0028;
                case 32: goto L_0x0042;
                case 33: goto L_0x000a;
                case 34: goto L_0x0033;
                case 35: goto L_0x0042;
                case 36: goto L_0x000a;
                case 37: goto L_0x001c;
                case 38: goto L_0x0005;
                case 39: goto L_0x000a;
                case 40: goto L_0x001c;
                case 41: goto L_0x000a;
                case 42: goto L_0x0042;
                case 43: goto L_0x0042;
                case 44: goto L_0x000a;
                default: goto L_0x0005;
            }
        L_0x0005:
            int r2 = super.hashCode()
            return r2
        L_0x000a:
            java.lang.String r0 = r3.A00
            int r2 = X.C18180wK.A03(r0)
            java.lang.String r0 = r3.A01
            goto L_0x004a
        L_0x0013:
            java.lang.String r0 = r3.A00
            int r2 = X.C18180wK.A03(r0)
            java.lang.String r0 = r3.A01
            goto L_0x0024
        L_0x001c:
            java.lang.String r0 = r3.A01
            int r2 = X.C18180wK.A03(r0)
            java.lang.String r0 = r3.A00
        L_0x0024:
            if (r0 != 0) goto L_0x004a
            r1 = 0
            goto L_0x004e
        L_0x0028:
            java.lang.String r0 = r3.A01
            int r0 = X.AnonymousClass0wJ.A06(r0)
            int r1 = r0 * 31
            java.lang.String r0 = r3.A00
            goto L_0x003d
        L_0x0033:
            java.lang.String r0 = r3.A00
            int r0 = X.AnonymousClass0wJ.A06(r0)
            int r1 = r0 * 31
            java.lang.String r0 = r3.A01
        L_0x003d:
            int r2 = X.C18200wM.A09(r0)
            goto L_0x004e
        L_0x0042:
            java.lang.String r0 = r3.A01
            int r2 = X.C18180wK.A03(r0)
            java.lang.String r0 = r3.A00
        L_0x004a:
            int r1 = r0.hashCode()
        L_0x004e:
            int r2 = r2 + r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2000000_I2.hashCode():int");
    }

    public final String toString() {
        StringBuilder sb;
        String str;
        String str2;
        switch (this.A02) {
            case 5:
                sb = C18190wL.A0s("KeyboardLanguage(locale=");
                sb.append(this.A01);
                str2 = ", displayName=";
                break;
            case 30:
                sb = C18190wL.A0s("DataModel(id=");
                sb.append(this.A00);
                sb.append(", value=");
                str = this.A01;
                break;
            case 32:
                sb = C18190wL.A0s("DogfoodingAssistantDiscoveryData(sessionId=");
                sb.append(this.A01);
                str2 = ", name=";
                break;
            case Rfc3492Idn.skew /*38*/:
                sb = C18190wL.A0s("DirectDebitACHInitResponse(trustlyUrl=");
                sb.append(this.A01);
                str2 = ", financialID=";
                break;
            default:
                return super.toString();
        }
        sb.append(str2);
        str = this.A00;
        sb.append(str);
        return AnonymousClass0wJ.A0u(sb);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0029, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        r1.A01 = r2;
        r1.A00 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0019, code lost:
        X.C04220Ms.A0B(r3, 2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0022, code lost:
        r1.A00 = r2;
        r1.A01 = r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public KtCSuperShape0S2000000_I2(java.lang.String r2, java.lang.String r3, int r4) {
        /*
            r1 = this;
            r1.A02 = r4
            switch(r4) {
                case 0: goto L_0x0015;
                case 1: goto L_0x0015;
                case 2: goto L_0x0011;
                case 3: goto L_0x0022;
                case 4: goto L_0x0019;
                case 5: goto L_0x0011;
                case 6: goto L_0x0015;
                case 7: goto L_0x001e;
                case 8: goto L_0x0015;
                case 9: goto L_0x0015;
                case 10: goto L_0x001e;
                case 11: goto L_0x0022;
                case 12: goto L_0x0022;
                case 13: goto L_0x0015;
                case 14: goto L_0x0015;
                case 15: goto L_0x0009;
                case 16: goto L_0x0011;
                case 17: goto L_0x0015;
                case 18: goto L_0x0015;
                case 19: goto L_0x0009;
                case 20: goto L_0x0005;
                case 21: goto L_0x0022;
                case 22: goto L_0x0015;
                case 23: goto L_0x0015;
                case 24: goto L_0x001e;
                case 25: goto L_0x0011;
                case 26: goto L_0x001e;
                case 27: goto L_0x0015;
                case 28: goto L_0x0009;
                case 29: goto L_0x0009;
                case 30: goto L_0x0015;
                case 31: goto L_0x0009;
                case 32: goto L_0x0011;
                case 33: goto L_0x0015;
                case 34: goto L_0x0022;
                case 35: goto L_0x0011;
                case 36: goto L_0x0015;
                case 37: goto L_0x0005;
                case 38: goto L_0x0009;
                case 39: goto L_0x0015;
                case 40: goto L_0x0005;
                case 41: goto L_0x0015;
                case 42: goto L_0x0011;
                case 43: goto L_0x0011;
                case 44: goto L_0x0015;
                default: goto L_0x0005;
            }
        L_0x0005:
            r0 = 1
            X.C04220Ms.A0B(r2, r0)
        L_0x0009:
            r1.<init>()
            r1.A01 = r2
            r1.A00 = r3
            return
        L_0x0011:
            X.AnonymousClass0wJ.A1O(r2, r3)
            goto L_0x0009
        L_0x0015:
            r0 = 1
            X.C04220Ms.A0B(r2, r0)
        L_0x0019:
            r0 = 2
            X.C04220Ms.A0B(r3, r0)
            goto L_0x0022
        L_0x001e:
            r0 = 1
            X.C04220Ms.A0B(r2, r0)
        L_0x0022:
            r1.<init>()
            r1.A00 = r2
            r1.A01 = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2000000_I2.<init>(java.lang.String, java.lang.String, int):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public KtCSuperShape0S2000000_I2(String str, String str2, DefaultConstructorMarker defaultConstructorMarker, int i, int i2) {
        this("", "", 16);
        this.A02 = 16;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public KtCSuperShape0S2000000_I2() {
        this((String) null, (String) null, 28);
        this.A02 = 28;
        this.A02 = 28;
    }
}
