package com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass;

import X.AnonymousClass006;
import X.AnonymousClass0Sf;
import X.AnonymousClass0wJ;
import X.AnonymousClass8s2;
import X.C04220Ms;
import X.C18180wK;
import X.C18240wQ;
import X.C25515Dn3;
import com.instagram.user.model.User;
import java.util.List;

public class KtCSuperShape0S0410000_I2 extends AnonymousClass0Sf {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public boolean A04;
    public final int A05 = 1;

    public KtCSuperShape0S0410000_I2(C25515Dn3 dn3, List list) {
        this(dn3, AnonymousClass006.A0Y, (Long) null, list);
    }

    public static /* synthetic */ KtCSuperShape0S0410000_I2 A00(KtCSuperShape0S0410000_I2 ktCSuperShape0S0410000_I2, Integer num, Integer num2, Integer num3, AnonymousClass8s2 r10, int i, boolean z) {
        AnonymousClass8s2 r4 = r10;
        boolean z2 = z;
        Integer num4 = num3;
        Integer num5 = num2;
        Integer num6 = num;
        if ((i & 1) != 0) {
            num6 = (Integer) ktCSuperShape0S0410000_I2.A03;
        }
        if ((i & 2) != 0) {
            num5 = (Integer) ktCSuperShape0S0410000_I2.A00;
        }
        if ((i & 4) != 0) {
            num4 = (Integer) ktCSuperShape0S0410000_I2.A02;
        }
        if ((i & 8) != 0) {
            z2 = ktCSuperShape0S0410000_I2.A04;
        }
        if ((i & 16) != 0) {
            r4 = (AnonymousClass8s2) ktCSuperShape0S0410000_I2.A01;
        }
        AnonymousClass0wJ.A1N(num6, num5);
        C18180wK.A1Q(num4, 2, r4);
        return new KtCSuperShape0S0410000_I2(num6, num5, num4, r4, z2);
    }

    public final boolean equals(Object obj) {
        Object obj2;
        Object obj3;
        KtCSuperShape0S0410000_I2 ktCSuperShape0S0410000_I2;
        switch (this.A05) {
            case 0:
                if (this == obj) {
                    return true;
                }
                if (obj instanceof KtCSuperShape0S0410000_I2) {
                    KtCSuperShape0S0410000_I2 ktCSuperShape0S0410000_I22 = (KtCSuperShape0S0410000_I2) obj;
                    if (ktCSuperShape0S0410000_I22.A05 == 0 && C04220Ms.A0I(this.A00, ktCSuperShape0S0410000_I22.A00) && C04220Ms.A0I(this.A01, ktCSuperShape0S0410000_I22.A01) && this.A02 == ktCSuperShape0S0410000_I22.A02) {
                        obj2 = this.A03;
                        obj3 = ktCSuperShape0S0410000_I22.A03;
                        break;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
                break;
            case 1:
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof KtCSuperShape0S0410000_I2)) {
                    return false;
                }
                ktCSuperShape0S0410000_I2 = (KtCSuperShape0S0410000_I2) obj;
                if (!(ktCSuperShape0S0410000_I2.A05 == 1 && this.A03 == ktCSuperShape0S0410000_I2.A03 && this.A00 == ktCSuperShape0S0410000_I2.A00 && this.A02 == ktCSuperShape0S0410000_I2.A02 && this.A04 == ktCSuperShape0S0410000_I2.A04)) {
                    return false;
                }
            case 2:
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof KtCSuperShape0S0410000_I2)) {
                    return false;
                }
                KtCSuperShape0S0410000_I2 ktCSuperShape0S0410000_I23 = (KtCSuperShape0S0410000_I2) obj;
                if (ktCSuperShape0S0410000_I23.A05 != 2 || !C04220Ms.A0I(this.A00, ktCSuperShape0S0410000_I23.A00) || !C04220Ms.A0I(this.A01, ktCSuperShape0S0410000_I23.A01) || !C04220Ms.A0I(this.A03, ktCSuperShape0S0410000_I23.A03) || !C04220Ms.A0I(this.A02, ktCSuperShape0S0410000_I23.A02) || this.A04 != ktCSuperShape0S0410000_I23.A04) {
                    return false;
                }
                return true;
            default:
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof KtCSuperShape0S0410000_I2)) {
                    return false;
                }
                ktCSuperShape0S0410000_I2 = (KtCSuperShape0S0410000_I2) obj;
                if (ktCSuperShape0S0410000_I2.A05 != 3 || this.A04 != ktCSuperShape0S0410000_I2.A04 || !C04220Ms.A0I(this.A02, ktCSuperShape0S0410000_I2.A02) || !C04220Ms.A0I(this.A00, ktCSuperShape0S0410000_I2.A00) || !C04220Ms.A0I(this.A03, ktCSuperShape0S0410000_I2.A03)) {
                    return false;
                }
        }
        obj2 = this.A01;
        obj3 = ktCSuperShape0S0410000_I2.A01;
        if (!C04220Ms.A0I(obj2, obj3)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0021, code lost:
        r1 = (r1 + r0) * 31;
        r0 = r3.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0026, code lost:
        r0 = r0.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002b, code lost:
        return r1 + r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int hashCode() {
        /*
            r3 = this;
            int r0 = r3.A05
            switch(r0) {
                case 0: goto L_0x002c;
                case 1: goto L_0x005c;
                case 2: goto L_0x0082;
                default: goto L_0x0005;
            }
        L_0x0005:
            boolean r0 = r3.A04
            if (r0 == 0) goto L_0x000a
            r0 = 1
        L_0x000a:
            int r1 = r0 * 31
            java.lang.Object r0 = r3.A02
            int r1 = X.AnonymousClass0wJ.A05(r0, r1)
            java.lang.Object r0 = r3.A00
            int r0 = X.AnonymousClass0wJ.A03(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.Object r0 = r3.A03
            int r0 = X.C18200wM.A07(r0)
        L_0x0021:
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.Object r0 = r3.A01
        L_0x0026:
            int r0 = r0.hashCode()
        L_0x002a:
            int r1 = r1 + r0
            return r1
        L_0x002c:
            java.lang.Object r0 = r3.A00
            int r1 = X.C18210wN.A04(r0)
            java.lang.Object r0 = r3.A01
            int r2 = X.AnonymousClass0wJ.A05(r0, r1)
            java.lang.Object r0 = r3.A02
            int r1 = X.AnonymousClass0wJ.A04(r0)
            switch(r1) {
                case 1: goto L_0x004d;
                case 2: goto L_0x0050;
                case 3: goto L_0x0053;
                case 4: goto L_0x0056;
                case 5: goto L_0x0059;
                default: goto L_0x0041;
            }
        L_0x0041:
            java.lang.String r0 = "HTTP_CACHE"
        L_0x0043:
            int r1 = X.C86124wJ.A0J(r0, r1, r2)
            java.lang.Object r0 = r3.A03
            if (r0 != 0) goto L_0x0026
            r0 = 0
            goto L_0x002a
        L_0x004d:
            java.lang.String r0 = "IN_MEMORY_CACHE"
            goto L_0x0043
        L_0x0050:
            java.lang.String r0 = "DB"
            goto L_0x0043
        L_0x0053:
            java.lang.String r0 = "EXPIRED_DB"
            goto L_0x0043
        L_0x0056:
            java.lang.String r0 = "NETWORK"
            goto L_0x0043
        L_0x0059:
            java.lang.String r0 = "PARTIAL_CACHE"
            goto L_0x0043
        L_0x005c:
            java.lang.Object r0 = r3.A03
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = X.C100146Me.A00(r0)
            int r1 = r0 * 31
            java.lang.Object r0 = r3.A00
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = X.C100146Me.A00(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.Object r0 = r3.A02
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = X.C100146Me.A00(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            boolean r0 = r3.A04
            if (r0 == 0) goto L_0x0021
            r0 = 1
            goto L_0x0021
        L_0x0082:
            java.lang.Object r0 = r3.A00
            int r1 = X.C18210wN.A04(r0)
            java.lang.Object r0 = r3.A01
            int r1 = X.AnonymousClass0wJ.A05(r0, r1)
            java.lang.Object r0 = r3.A03
            int r0 = X.AnonymousClass0wJ.A03(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.Object r0 = r3.A02
            int r1 = X.AnonymousClass0wJ.A05(r0, r1)
            boolean r0 = r3.A04
            if (r0 == 0) goto L_0x002a
            r0 = 1
            goto L_0x002a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0410000_I2.hashCode():int");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public KtCSuperShape0S0410000_I2(com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S3310000_I2 r18) {
        /*
            r17 = this;
            r0 = 2
            r11 = r17
            r11.A05 = r0
            r4 = 3
            r1 = 0
            r5 = 22
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0200000_I2 r0 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0200000_I2
            r2 = r1
            r3 = r1
            r0.<init>((X.C109916kp) r1, (X.AnonymousClass67Y) r2, (kotlin.jvm.internal.DefaultConstructorMarker) r3, (int) r4, (int) r5)
            r10 = 0
            r9 = 8
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0110000_I2 r5 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0110000_I2
            r6 = r1
            r7 = r1
            r8 = r4
            r5.<init>((java.lang.Integer) r6, (kotlin.jvm.internal.DefaultConstructorMarker) r7, (int) r8, (int) r9, (boolean) r10)
            r15 = r18
            r12 = r5
            r13 = r0
            r14 = r1
            r16 = r10
            r11.<init>((com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0110000_I2) r12, (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0200000_I2) r13, (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0302000_I2) r14, (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S3310000_I2) r15, (boolean) r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0410000_I2.<init>(com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S3310000_I2):void");
    }

    public KtCSuperShape0S0410000_I2(C25515Dn3 dn3, Integer num, Long l, List list) {
        AnonymousClass0wJ.A1O(dn3, list);
        this.A00 = dn3;
        this.A01 = list;
        this.A02 = num;
        this.A03 = l;
        this.A04 = C18240wQ.A1Y(num, AnonymousClass006.A0Y);
    }

    public KtCSuperShape0S0410000_I2(KtCSuperShape0S1210000_I2 ktCSuperShape0S1210000_I2, KtCSuperShape0S4120000_I2 ktCSuperShape0S4120000_I2, KtCSuperShape1S0200000_I2_1 ktCSuperShape1S0200000_I2_1, User user, boolean z) {
        this.A04 = z;
        this.A02 = user;
        this.A00 = ktCSuperShape1S0200000_I2_1;
        this.A03 = ktCSuperShape0S4120000_I2;
        this.A01 = ktCSuperShape0S1210000_I2;
    }

    public KtCSuperShape0S0410000_I2(Integer num, Integer num2, Integer num3, AnonymousClass8s2 r5, boolean z) {
        C04220Ms.A0B(num, 1);
        AnonymousClass0wJ.A1Q(num2, num3);
        this.A03 = num;
        this.A00 = num2;
        this.A02 = num3;
        this.A04 = z;
        this.A01 = r5;
    }

    public KtCSuperShape0S0410000_I2(KtCSuperShape0S0110000_I2 ktCSuperShape0S0110000_I2, KtCSuperShape0S0200000_I2 ktCSuperShape0S0200000_I2, KtCSuperShape0S0302000_I2 ktCSuperShape0S0302000_I2, KtCSuperShape0S3310000_I2 ktCSuperShape0S3310000_I2, boolean z) {
        C18180wK.A1Q(ktCSuperShape0S0200000_I2, 1, ktCSuperShape0S0110000_I2);
        this.A00 = ktCSuperShape0S0200000_I2;
        this.A01 = ktCSuperShape0S3310000_I2;
        this.A03 = ktCSuperShape0S0302000_I2;
        this.A02 = ktCSuperShape0S0110000_I2;
        this.A04 = z;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public KtCSuperShape0S0410000_I2() {
        /*
            r6 = this;
            r5 = 1
            r0 = r6
            r6.A05 = r5
            java.lang.Integer r1 = X.AnonymousClass006.A00
            X.8bW r4 = X.AnonymousClass8bW.A01
            r2 = r1
            r3 = r1
            r0.<init>((java.lang.Integer) r1, (java.lang.Integer) r2, (java.lang.Integer) r3, (X.AnonymousClass8s2) r4, (boolean) r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0410000_I2.<init>():void");
    }
}
