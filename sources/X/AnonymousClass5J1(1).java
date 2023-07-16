package X;

import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S3200000_I2;
import java.util.List;

/* renamed from: X.5J1  reason: invalid class name */
public final class AnonymousClass5J1 extends AnonymousClass0Sf {
    public final AnonymousClass7HD A00;
    public final KtCSuperShape0S3200000_I2 A01;
    public final C89935Hp A02;
    public final String A03;
    public final List A04;
    public final AnonymousClass8s2 A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;

    public AnonymousClass5J1() {
        this((AnonymousClass7HD) null, (C89935Hp) null, (String) null, 1023, false);
    }

    public static /* synthetic */ AnonymousClass5J1 A00(AnonymousClass7HD r12, KtCSuperShape0S3200000_I2 ktCSuperShape0S3200000_I2, AnonymousClass5J1 r14, C89935Hp r15, List list, AnonymousClass8s2 r17, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        C89935Hp r4 = r15;
        List list2 = list;
        KtCSuperShape0S3200000_I2 ktCSuperShape0S3200000_I22 = ktCSuperShape0S3200000_I2;
        boolean z5 = z4;
        AnonymousClass8s2 r7 = r17;
        boolean z6 = z3;
        boolean z7 = z2;
        boolean z8 = z;
        AnonymousClass7HD r2 = r12;
        String str = null;
        int i2 = i;
        if ((i & 1) != 0) {
            str = r14.A03;
        }
        if ((i & 2) != 0) {
            r2 = r14.A00;
        }
        if ((i & 4) != 0) {
            z8 = r14.A09;
        }
        if ((i & 8) != 0) {
            z7 = r14.A06;
        }
        if ((i & 16) != 0) {
            z6 = r14.A07;
        }
        if ((i & 32) != 0) {
            r7 = r14.A05;
        }
        if ((i & 64) != 0) {
            z5 = r14.A08;
        }
        if ((i2 & 128) != 0) {
            ktCSuperShape0S3200000_I22 = r14.A01;
        }
        if ((i2 & 256) != 0) {
            list2 = r14.A04;
        }
        if ((i2 & 512) != 0) {
            r4 = r14.A02;
        }
        AnonymousClass0wJ.A1N(str, r2);
        C18210wN.A1M(r7, 5, list2);
        return new AnonymousClass5J1(r2, ktCSuperShape0S3200000_I22, r4, str, list2, r7, z8, z7, z6, z5);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5J1) {
                AnonymousClass5J1 r5 = (AnonymousClass5J1) obj;
                if (!C04220Ms.A0I(this.A03, r5.A03) || !C04220Ms.A0I(this.A00, r5.A00) || this.A09 != r5.A09 || this.A06 != r5.A06 || this.A07 != r5.A07 || !C04220Ms.A0I(this.A05, r5.A05) || this.A08 != r5.A08 || !C04220Ms.A0I(this.A01, r5.A01) || !C04220Ms.A0I(this.A04, r5.A04) || !C04220Ms.A0I(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public static boolean A01(Object obj, Object obj2) {
        return C04220Ms.A0I(((AnonymousClass5J1) obj).A03, obj2);
    }

    public final int hashCode() {
        int A052 = AnonymousClass0wJ.A05(this.A00, C18180wK.A03(this.A03));
        boolean z = this.A09;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = (A052 + (z ? 1 : 0)) * 31;
        boolean z2 = this.A06;
        if (z2) {
            z2 = true;
        }
        int i3 = (i2 + (z2 ? 1 : 0)) * 31;
        boolean z3 = this.A07;
        if (z3) {
            z3 = true;
        }
        int A053 = AnonymousClass0wJ.A05(this.A05, (i3 + (z3 ? 1 : 0)) * 31);
        if (!this.A08) {
            i = 0;
        }
        return AnonymousClass0wJ.A05(this.A04, (((A053 + i) * 31) + AnonymousClass0wJ.A03(this.A01)) * 31) + C18200wM.A07(this.A02);
    }

    public AnonymousClass5J1(AnonymousClass7HD r2, KtCSuperShape0S3200000_I2 ktCSuperShape0S3200000_I2, C89935Hp r4, String str, List list, AnonymousClass8s2 r7, boolean z, boolean z2, boolean z3, boolean z4) {
        AnonymousClass0wJ.A1O(str, r2);
        C86114wI.A1I(r7, 6, list);
        this.A03 = str;
        this.A00 = r2;
        this.A09 = z;
        this.A06 = z2;
        this.A07 = z3;
        this.A05 = r7;
        this.A08 = z4;
        this.A01 = ktCSuperShape0S3200000_I2;
        this.A04 = list;
        this.A02 = r4;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ AnonymousClass5J1(X.AnonymousClass7HD r16, X.C89935Hp r17, java.lang.String r18, int r19, boolean r20) {
        /*
            r15 = this;
            r5 = r16
            r8 = r18
            r6 = 0
            r9 = 0
            r2 = r19
            r0 = r19 & 1
            if (r0 == 0) goto L_0x0014
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r8 = X.C18190wL.A0n(r0)
        L_0x0014:
            r0 = r19 & 2
            if (r0 == 0) goto L_0x0022
            r0 = 0
            r4 = 6
            java.lang.String r3 = ""
            X.7HD r5 = new X.7HD
            r5.<init>((java.lang.String) r3, (int) r4, (long) r0)
        L_0x0022:
            r0 = r19 & 4
            boolean r11 = X.C18180wK.A1V(r0)
            r0 = r19 & 8
            r13 = 0
            r1 = r20
            boolean r12 = X.C18240wQ.A1R(r0, r1)
            r0 = r19 & 32
            if (r0 == 0) goto L_0x004a
            X.8bW r10 = X.AnonymousClass8bW.A01
        L_0x0037:
            r7 = 0
            r0 = r2 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x003e
            X.0ZV r9 = X.AnonymousClass0ZV.A00
        L_0x003e:
            r0 = r2 & 512(0x200, float:7.175E-43)
            if (r0 != 0) goto L_0x0044
            r7 = r17
        L_0x0044:
            r4 = r15
            r14 = r13
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        L_0x004a:
            r10 = r6
            goto L_0x0037
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5J1.<init>(X.7HD, X.5Hp, java.lang.String, int, boolean):void");
    }
}
