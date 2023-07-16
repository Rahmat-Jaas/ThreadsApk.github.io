package com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass;

import X.AnonymousClass006;
import X.AnonymousClass0Sf;
import X.AnonymousClass0wJ;
import X.AnonymousClass19W;
import X.AnonymousClass2LU;
import X.AnonymousClass8s2;
import X.C04220Ms;
import X.C18190wL;
import X.C21743BzU;
import X.C57943Dd;
import X.DFS;
import com.instagram.common.gallery.Medium;
import com.instagram.model.people.PeopleTag;
import com.instagram.shopping.model.destination.home.DestinationItemTextColorType;
import com.instagram.user.model.User;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

public class KtCSuperShape0S0110000_I2 extends AnonymousClass0Sf {
    public Object A00;
    public boolean A01;
    public final int A02;

    public static boolean A00(int i, Object obj) {
        if (!(obj instanceof KtCSuperShape0S0110000_I2) || ((KtCSuperShape0S0110000_I2) obj).A02 != i) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:114:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000d, code lost:
        if (A00(r0, r3) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00a9, code lost:
        if (A00(r0, r3) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00ab, code lost:
        r3 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0110000_I2) r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00b5, code lost:
        if (X.C04220Ms.A0I(r2.A00, r3.A00) != false) goto L_0x00b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00bd, code lost:
        if (r2.A01 == r3.A01) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000f, code lost:
        r3 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0110000_I2) r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00c8, code lost:
        if (A00(r0, r3) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00ca, code lost:
        r3 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0110000_I2) r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x00d0, code lost:
        if (r2.A01 != r3.A01) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x00d6, code lost:
        if (r2.A00 == r3.A00) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0015, code lost:
        if (r2.A01 != r3.A01) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001f, code lost:
        if (X.C04220Ms.A0I(r2.A00, r3.A00) != false) goto L_?;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            int r0 = r2.A02
            switch(r0) {
                case 1: goto L_0x00da;
                case 2: goto L_0x00c1;
                case 3: goto L_0x00a2;
                case 4: goto L_0x009d;
                case 5: goto L_0x0099;
                case 6: goto L_0x0095;
                case 7: goto L_0x0090;
                case 8: goto L_0x008b;
                case 9: goto L_0x0086;
                case 10: goto L_0x0081;
                case 11: goto L_0x007c;
                case 12: goto L_0x0077;
                case 13: goto L_0x0072;
                case 14: goto L_0x006d;
                case 15: goto L_0x0068;
                case 16: goto L_0x0063;
                case 17: goto L_0x005e;
                case 18: goto L_0x0059;
                case 19: goto L_0x0054;
                case 20: goto L_0x004f;
                case 21: goto L_0x004a;
                case 22: goto L_0x0045;
                case 23: goto L_0x0040;
                case 24: goto L_0x002d;
                case 25: goto L_0x0028;
                case 26: goto L_0x0023;
                default: goto L_0x0005;
            }
        L_0x0005:
            if (r2 == r3) goto L_0x00dd
            r0 = 27
        L_0x0009:
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x0021
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0110000_I2 r3 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0110000_I2) r3
            boolean r1 = r2.A01
            boolean r0 = r3.A01
            if (r1 != r0) goto L_0x0021
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 != 0) goto L_0x00dd
        L_0x0021:
            r0 = 0
            return r0
        L_0x0023:
            if (r2 == r3) goto L_0x00dd
            r0 = 26
            goto L_0x00a5
        L_0x0028:
            if (r2 == r3) goto L_0x00dd
            r0 = 25
            goto L_0x00a5
        L_0x002d:
            if (r2 == r3) goto L_0x00dd
            r0 = 24
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x0021
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0110000_I2 r3 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0110000_I2) r3
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            if (r1 == r0) goto L_0x00b9
            goto L_0x0021
        L_0x0040:
            if (r2 == r3) goto L_0x00dd
            r0 = 23
            goto L_0x00a5
        L_0x0045:
            if (r2 == r3) goto L_0x00dd
            r0 = 22
            goto L_0x00a5
        L_0x004a:
            if (r2 == r3) goto L_0x00dd
            r0 = 21
            goto L_0x0009
        L_0x004f:
            if (r2 == r3) goto L_0x00dd
            r0 = 20
            goto L_0x0009
        L_0x0054:
            if (r2 == r3) goto L_0x00dd
            r0 = 19
            goto L_0x0009
        L_0x0059:
            if (r2 == r3) goto L_0x00dd
            r0 = 18
            goto L_0x00a5
        L_0x005e:
            if (r2 == r3) goto L_0x00dd
            r0 = 17
            goto L_0x00a5
        L_0x0063:
            if (r2 == r3) goto L_0x00dd
            r0 = 16
            goto L_0x0009
        L_0x0068:
            if (r2 == r3) goto L_0x00dd
            r0 = 15
            goto L_0x0009
        L_0x006d:
            if (r2 == r3) goto L_0x00dd
            r0 = 14
            goto L_0x0009
        L_0x0072:
            if (r2 == r3) goto L_0x00dd
            r0 = 13
            goto L_0x0009
        L_0x0077:
            if (r2 == r3) goto L_0x00dd
            r0 = 12
            goto L_0x0009
        L_0x007c:
            if (r2 == r3) goto L_0x00dd
            r0 = 11
            goto L_0x0009
        L_0x0081:
            if (r2 == r3) goto L_0x00dd
            r0 = 10
            goto L_0x00a5
        L_0x0086:
            if (r2 == r3) goto L_0x00dd
            r0 = 9
            goto L_0x00a5
        L_0x008b:
            if (r2 == r3) goto L_0x00dd
            r0 = 8
            goto L_0x00c4
        L_0x0090:
            if (r2 == r3) goto L_0x00dd
            r0 = 7
            goto L_0x0009
        L_0x0095:
            if (r2 == r3) goto L_0x00dd
            r0 = 6
            goto L_0x00a5
        L_0x0099:
            if (r2 == r3) goto L_0x00dd
            r0 = 5
            goto L_0x00a5
        L_0x009d:
            if (r2 == r3) goto L_0x00dd
            r0 = 4
            goto L_0x0009
        L_0x00a2:
            if (r2 == r3) goto L_0x00dd
            r0 = 3
        L_0x00a5:
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x0021
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0110000_I2 r3 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0110000_I2) r3
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 != 0) goto L_0x00b9
            goto L_0x0021
        L_0x00b9:
            boolean r1 = r2.A01
            boolean r0 = r3.A01
            if (r1 == r0) goto L_0x00dd
            goto L_0x0021
        L_0x00c1:
            if (r2 == r3) goto L_0x00dd
            r0 = 2
        L_0x00c4:
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x0021
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0110000_I2 r3 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0110000_I2) r3
            boolean r1 = r2.A01
            boolean r0 = r3.A01
            if (r1 != r0) goto L_0x0021
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            if (r1 == r0) goto L_0x00dd
            goto L_0x0021
        L_0x00da:
            r0 = 1
            if (r2 != r3) goto L_0x0009
        L_0x00dd:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0110000_I2.equals(java.lang.Object):boolean");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0057, code lost:
        r2 = (r0 ? 1 : 0) * true;
        r0 = r3.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x005b, code lost:
        if (r0 != null) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x005d, code lost:
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0065, code lost:
        r2 = (r0 ? 1 : 0) * true;
        r0 = r3.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0069, code lost:
        r0 = r0.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0007, code lost:
        r0 = r0.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000b, code lost:
        r2 = r0 * 31;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000d, code lost:
        r0 = r3.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000f, code lost:
        if (r0 == 0) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
        r0 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        return r2 + r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int hashCode() {
        /*
            r3 = this;
            int r0 = r3.A02
            switch(r0) {
                case 1: goto L_0x005f;
                case 2: goto L_0x0051;
                case 3: goto L_0x002e;
                case 4: goto L_0x0014;
                case 5: goto L_0x0005;
                case 6: goto L_0x0005;
                case 7: goto L_0x001b;
                case 8: goto L_0x0034;
                case 9: goto L_0x002e;
                case 10: goto L_0x002e;
                case 11: goto L_0x001b;
                case 12: goto L_0x0028;
                case 13: goto L_0x0014;
                case 14: goto L_0x0014;
                case 15: goto L_0x0014;
                case 16: goto L_0x001b;
                case 17: goto L_0x0005;
                case 18: goto L_0x0005;
                case 19: goto L_0x001b;
                case 20: goto L_0x001b;
                case 21: goto L_0x001b;
                case 22: goto L_0x0005;
                case 23: goto L_0x0005;
                case 24: goto L_0x0021;
                case 25: goto L_0x0005;
                case 26: goto L_0x0005;
                case 27: goto L_0x001b;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r3.A00
        L_0x0007:
            int r0 = r0.hashCode()
        L_0x000b:
            int r2 = r0 * 31
        L_0x000d:
            boolean r0 = r3.A01
            if (r0 == 0) goto L_0x0012
            r0 = 1
        L_0x0012:
            int r2 = r2 + r0
            return r2
        L_0x0014:
            boolean r0 = r3.A01
            boolean r0 = X.C86164wN.A1S(r0)
            goto L_0x0065
        L_0x001b:
            boolean r0 = r3.A01
            if (r0 == 0) goto L_0x0057
            r0 = 1
            goto L_0x0057
        L_0x0021:
            java.lang.Object r0 = r3.A00
            int r2 = X.C18210wN.A04(r0)
            goto L_0x000d
        L_0x0028:
            boolean r0 = r3.A01
            if (r0 == 0) goto L_0x0065
            r0 = 1
            goto L_0x0065
        L_0x002e:
            java.lang.Object r0 = r3.A00
            if (r0 != 0) goto L_0x0007
            r0 = 0
            goto L_0x000b
        L_0x0034:
            boolean r0 = r3.A01
            if (r0 == 0) goto L_0x0039
            r0 = 1
        L_0x0039:
            int r2 = r0 * 31
            java.lang.Object r0 = r3.A00
            int r1 = X.AnonymousClass0wJ.A04(r0)
            switch(r1) {
                case 1: goto L_0x004b;
                case 2: goto L_0x004e;
                default: goto L_0x0044;
            }
        L_0x0044:
            java.lang.String r0 = "ReadyToSubmit"
        L_0x0046:
            int r0 = X.C86144wL.A0B(r0, r1)
            goto L_0x0012
        L_0x004b:
            java.lang.String r0 = "Uploading"
            goto L_0x0046
        L_0x004e:
            java.lang.String r0 = "UploadingFailed"
            goto L_0x0046
        L_0x0051:
            boolean r0 = r3.A01
            boolean r0 = X.C86164wN.A1S(r0)
        L_0x0057:
            int r2 = r0 * 31
            java.lang.Object r0 = r3.A00
            if (r0 != 0) goto L_0x0069
            r0 = 0
            goto L_0x0012
        L_0x005f:
            boolean r0 = r3.A01
            boolean r0 = X.C86164wN.A1S(r0)
        L_0x0065:
            int r2 = r0 * 31
            java.lang.Object r0 = r3.A00
        L_0x0069:
            int r0 = r0.hashCode()
            goto L_0x0012
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0110000_I2.hashCode():int");
    }

    public final String toString() {
        if (17 - this.A02 != 0) {
            return super.toString();
        }
        StringBuilder A0s = C18190wL.A0s("TaggedUser(tag=");
        A0s.append(this.A00);
        A0s.append(", isCollaborator=");
        A0s.append(this.A01);
        return AnonymousClass0wJ.A0u(A0s);
    }

    public KtCSuperShape0S0110000_I2(DFS dfs, boolean z) {
        this.A02 = 26;
        C04220Ms.A0B(dfs, 1);
        this.A00 = dfs;
        this.A01 = z;
    }

    public KtCSuperShape0S0110000_I2(DestinationItemTextColorType destinationItemTextColorType, boolean z) {
        this.A02 = 24;
        C04220Ms.A0B(destinationItemTextColorType, 1);
        this.A00 = destinationItemTextColorType;
        this.A01 = z;
    }

    public KtCSuperShape0S0110000_I2(AnonymousClass8s2 r2, boolean z) {
        this.A02 = 6;
        C04220Ms.A0B(r2, 1);
        this.A00 = r2;
        this.A01 = z;
    }

    public KtCSuperShape0S0110000_I2(User user, boolean z) {
        this.A02 = 1;
        C04220Ms.A0B(user, 2);
        this.A01 = z;
        this.A00 = user;
    }

    public KtCSuperShape0S0110000_I2(int i, Object obj, boolean z) {
        this.A02 = i;
        this.A01 = z;
        this.A00 = obj;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public KtCSuperShape0S0110000_I2(KtCSuperShape0S5000000_I2 ktCSuperShape0S5000000_I2, DefaultConstructorMarker defaultConstructorMarker, int i, int i2, boolean z) {
        this(19, (Object) null, z);
        this.A02 = 19;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public KtCSuperShape0S0110000_I2(boolean z) {
        this(20, (Object) null, z);
        this.A02 = 20;
    }

    public KtCSuperShape0S0110000_I2(Integer num, int i, boolean z) {
        this.A02 = i;
        if (8 - i == 0) {
            C04220Ms.A0B(num, 2);
        }
        this.A01 = z;
        this.A00 = num;
    }

    public KtCSuperShape0S0110000_I2(List list, int i, boolean z) {
        this.A02 = i;
        switch (i) {
            case 3:
            case 9:
            case 10:
                break;
            default:
                C04220Ms.A0B(list, 1);
                break;
        }
        this.A00 = list;
        this.A01 = z;
    }

    public KtCSuperShape0S0110000_I2(C57943Dd r2, boolean z) {
        this.A02 = 4;
        this.A01 = z;
        this.A00 = r2;
    }

    public KtCSuperShape0S0110000_I2(Medium medium, boolean z) {
        this.A02 = 5;
        this.A00 = medium;
        this.A01 = z;
    }

    public KtCSuperShape0S0110000_I2(boolean z, List list, int i) {
        this.A02 = i;
        switch (i) {
            case 14:
            case 15:
                C04220Ms.A0B(list, 2);
                break;
        }
        this.A01 = z;
        this.A00 = list;
    }

    public KtCSuperShape0S0110000_I2(C21743BzU bzU) {
        this.A02 = 13;
        this.A01 = false;
        this.A00 = bzU;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public KtCSuperShape0S0110000_I2() {
        this(7, (Object) null, false);
        this.A02 = 7;
    }

    public KtCSuperShape0S0110000_I2(AnonymousClass19W r2, boolean z) {
        this.A02 = 22;
        this.A00 = r2;
        this.A01 = z;
    }

    public KtCSuperShape0S0110000_I2(PeopleTag peopleTag, boolean z) {
        this.A02 = 17;
        this.A00 = peopleTag;
        this.A01 = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public KtCSuperShape0S0110000_I2(C57943Dd r3, DefaultConstructorMarker defaultConstructorMarker, int i, int i2, boolean z) {
        this(AnonymousClass2LU.A00(""), false);
        this.A02 = 4;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public KtCSuperShape0S0110000_I2(Integer num, DefaultConstructorMarker defaultConstructorMarker, int i, int i2, boolean z) {
        this(AnonymousClass006.A00, 8, false);
        this.A02 = 8;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public KtCSuperShape0S0110000_I2(java.util.List r2, int r3, int r4, boolean r5) {
        /*
            r1 = this;
            r1.A02 = r4
            r0 = r3 & 1
            int r4 = 9 - r4
            if (r4 == 0) goto L_0x0016
            if (r0 == 0) goto L_0x000b
            r2 = 0
        L_0x000b:
            r0 = r3 & 2
            if (r0 == 0) goto L_0x0010
            r5 = 0
        L_0x0010:
            r0 = 10
        L_0x0012:
            r1.<init>((java.util.List) r2, (int) r0, (boolean) r5)
            return
        L_0x0016:
            if (r0 == 0) goto L_0x0019
            r2 = 0
        L_0x0019:
            r0 = r3 & 2
            if (r0 == 0) goto L_0x001e
            r5 = 0
        L_0x001e:
            r0 = 9
            goto L_0x0012
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0110000_I2.<init>(java.util.List, int, int, boolean):void");
    }
}
