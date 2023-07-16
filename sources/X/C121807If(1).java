package X;

import com.facebook.common.dextricks.Constants;

/* renamed from: X.7If  reason: invalid class name and case insensitive filesystem */
public final class C121807If {
    public static final C121807If A03 = new C121807If((AnonymousClass79N) null, (C1188372l) null, (C114236su) null, (C134817yQ) null, (C121117Ee) null, (AnonymousClass79I) null, 4194303, 0, 0, 0, 0);
    public final C121237Ex A00;
    public final AnonymousClass79N A01;
    public final AnonymousClass7F0 A02;

    public C121807If(C121237Ex r2, AnonymousClass79N r3, AnonymousClass7F0 r4) {
        C04220Ms.A0B(r4, 1);
        this.A02 = r4;
        this.A00 = r2;
        this.A01 = r3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C121807If) {
                C121807If r5 = (C121807If) obj;
                if (!C04220Ms.A0I(this.A02, r5.A02) || !C04220Ms.A0I(this.A00, r5.A00) || !C04220Ms.A0I(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ C121807If A00(C121807If r43, C1188372l r44, C134817yQ r45, C114276sy r46, C114316t2 r47, C121117Ee r48, int i, long j, long j2, long j3, long j4) {
        C114236su r22;
        String str;
        long j5;
        AnonymousClass79I r25;
        C1201679b r19;
        C114326t3 r39;
        AnonymousClass79W r38;
        AnonymousClass79N r1;
        AnonymousClass795 r37;
        C113216qw r14;
        C114276sy r35 = r46;
        long j6 = j4;
        C121117Ee r40 = r48;
        long j7 = j3;
        int i2 = i;
        C1188372l r21 = r44;
        C134817yQ r23 = r45;
        C114316t2 r36 = r47;
        long j8 = j2;
        C114246sv r10 = null;
        C114266sx r9 = null;
        C121147Ei r8 = null;
        AnonymousClass83Y r7 = null;
        AnonymousClass79A r6 = null;
        C121807If r12 = r43;
        if ((i & 1) != 0) {
            j = r12.A02.A0D.AYH();
        }
        if ((i & 2) != 0) {
            j8 = r12.A02.A01;
        }
        if ((i & 4) != 0) {
            r23 = r12.A02.A09;
        }
        if ((i & 8) != 0) {
            r22 = r12.A02.A07;
        } else {
            r22 = null;
        }
        if ((i & 16) != 0) {
            r10 = r12.A02.A08;
        }
        if ((i & 32) != 0) {
            r21 = r12.A02.A06;
        }
        if ((i & 64) != 0) {
            str = r12.A02.A0F;
        } else {
            str = null;
        }
        if ((i2 & 128) != 0) {
            j7 = r12.A02.A02;
        }
        if ((i2 & 256) != 0) {
            r9 = r12.A02.A0B;
        }
        if ((i2 & 512) != 0) {
            r8 = r12.A02.A0E;
        }
        if ((i2 & 1024) != 0) {
            r7 = r12.A02.A0A;
        }
        if ((i2 & 2048) != 0) {
            j5 = r12.A02.A00;
        } else {
            j5 = 0;
        }
        if ((i2 & 4096) != 0) {
            r25 = r12.A02.A0C;
        } else {
            r25 = null;
        }
        if ((i2 & 8192) != 0) {
            r19 = r12.A02.A03;
        } else {
            r19 = null;
        }
        if ((i2 & Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET) != 0) {
            r40 = r12.A00.A08;
        }
        if ((i & 32768) != 0) {
            r39 = r12.A00.A09;
        } else {
            r39 = null;
        }
        if ((i & Constants.LOAD_RESULT_PGO_ATTEMPTED) != 0) {
            j6 = r12.A00.A03;
        }
        if ((i & Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP) != 0) {
            r38 = r12.A00.A0A;
        } else {
            r38 = null;
        }
        if ((i & Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED) != 0) {
            r1 = r12.A01;
        } else {
            r1 = null;
        }
        if ((i & 524288) != 0) {
            r37 = r12.A00.A07;
        } else {
            r37 = null;
        }
        if ((i & 1048576) != 0) {
            r36 = r12.A00.A06;
        }
        if ((i & 2097152) != 0) {
            r35 = r12.A00.A05;
        }
        AnonymousClass7F0 r0 = r12.A02;
        C147038nH r13 = r0.A0D;
        if (j != r13.AYH()) {
            r13 = AnonymousClass7CC.A00(j);
        }
        if (r1 != null) {
            r14 = r1.A01;
        } else {
            r14 = null;
        }
        AnonymousClass7F0 r15 = new AnonymousClass7F0(r19, r0.A04, r14, r21, r22, r10, r23, r7, r9, r25, r13, r8, str, j8, j7, j5);
        if (r1 != null) {
            r6 = r1.A00;
        }
        return new C121807If(new C121237Ex(r6, r35, r36, r37, r40, r39, r38, r12.A00.A0B, j6), r1, r15);
    }

    public final C121807If A01(C121807If r6) {
        AnonymousClass79N r0;
        if (r6.equals(A03)) {
            return this;
        }
        AnonymousClass7F0 A012 = this.A02.A01(r6.A02);
        C121237Ex A022 = this.A00.A02(r6.A00);
        C113216qw r2 = A012.A05;
        AnonymousClass79A r1 = A022.A04;
        if (r2 == null && r1 == null) {
            r0 = null;
        } else {
            r0 = new AnonymousClass79N(r1, r2);
        }
        return new C121807If(A022, r0, A012);
    }

    public final int hashCode() {
        return AnonymousClass0wJ.A05(this.A00, C18210wN.A04(this.A02)) + C18230wP.A05(this.A01);
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("TextStyle(color=");
        AnonymousClass7F0 r4 = this.A02;
        C147038nH r3 = r4.A0D;
        C86154wM.A18(r3.AYH(), A0s);
        AnonymousClass7F0.A00(r4, r3, A0s);
        C86154wM.A18(r4.A00, A0s);
        A0s.append(", textDecoration=");
        A0s.append(r4.A0C);
        A0s.append(", shadow=");
        A0s.append(r4.A03);
        A0s.append(", drawStyle=");
        A0s.append(r4.A04);
        A0s.append(", textAlign=");
        C121237Ex r1 = this.A00;
        C121237Ex.A01(r1, A0s);
        return C86104wH.A0y(C121237Ex.A00(r1, this.A01, A0s), A0s);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C121807If(X.AnonymousClass79N r30, X.C1188372l r31, X.C114236su r32, X.C134817yQ r33, X.C121117Ee r34, X.AnonymousClass79I r35, int r36, long r37, long r39, long r41, long r43) {
        /*
            r29 = this;
            r1 = r30
            r0 = r36
            r27 = r43
            r23 = r34
            r19 = r41
            r7 = r31
            r8 = r32
            r10 = r33
            r17 = r39
            r4 = 0
            r13 = 0
            r6 = 0
            r2 = r36 & 1
            if (r2 == 0) goto L_0x001b
            long r37 = X.AnonymousClass7KE.A06
        L_0x001b:
            r2 = r36 & 2
            if (r2 == 0) goto L_0x0021
            long r17 = X.AnonymousClass7HC.A01
        L_0x0021:
            r2 = r36 & 4
            if (r2 == 0) goto L_0x0026
            r10 = 0
        L_0x0026:
            r2 = r36 & 8
            if (r2 == 0) goto L_0x002b
            r8 = 0
        L_0x002b:
            r2 = r36 & 32
            if (r2 == 0) goto L_0x0030
            r7 = 0
        L_0x0030:
            r2 = r0 & 128(0x80, float:1.794E-43)
            if (r2 == 0) goto L_0x0036
            long r19 = X.AnonymousClass7HC.A01
        L_0x0036:
            r2 = r0 & 2048(0x800, float:2.87E-42)
            if (r2 == 0) goto L_0x008b
            long r21 = X.AnonymousClass7KE.A06
        L_0x003c:
            r2 = r0 & 4096(0x1000, float:5.74E-42)
            if (r2 != 0) goto L_0x0042
            r13 = r35
        L_0x0042:
            r2 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r2 == 0) goto L_0x0048
            r23 = 0
        L_0x0048:
            r2 = 65536(0x10000, float:9.18355E-41)
            r2 = r36 & r2
            if (r2 == 0) goto L_0x0050
            long r27 = X.AnonymousClass7HC.A01
        L_0x0050:
            r2 = 262144(0x40000, float:3.67342E-40)
            r0 = r36 & r2
            if (r0 == 0) goto L_0x0057
            r1 = 0
        L_0x0057:
            r0 = 0
            if (r1 == 0) goto L_0x005c
            X.6qw r6 = r1.A01
        L_0x005c:
            X.8nH r14 = X.AnonymousClass7CC.A00(r37)
            X.7F0 r3 = new X.7F0
            r5 = r4
            r9 = r4
            r11 = r4
            r12 = r4
            r15 = r4
            r16 = r4
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r19, r21)
            if (r1 == 0) goto L_0x0070
            X.79A r0 = r1.A00
        L_0x0070:
            X.7Ex r2 = new X.7Ex
            r18 = r2
            r19 = r0
            r20 = r4
            r21 = r4
            r22 = r4
            r24 = r4
            r25 = r4
            r26 = r4
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r0 = r29
            r0.<init>(r2, r1, r3)
            return
        L_0x008b:
            r21 = 0
            goto L_0x003c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C121807If.<init>(X.79N, X.72l, X.6su, X.7yQ, X.7Ee, X.79I, int, long, long, long, long):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C121807If(X.C134817yQ r29, X.C121117Ee r30, int r31, long r32, long r34, long r36) {
        /*
            r28 = this;
            r26 = r36
            r1 = r31
            r22 = r30
            r9 = r29
            r16 = r34
            r3 = 0
            r0 = r31 & 1
            if (r0 == 0) goto L_0x0011
            long r32 = X.AnonymousClass7KE.A06
        L_0x0011:
            r0 = r31 & 2
            if (r0 == 0) goto L_0x0017
            long r16 = X.AnonymousClass7HC.A01
        L_0x0017:
            r0 = r31 & 4
            if (r0 == 0) goto L_0x001c
            r9 = 0
        L_0x001c:
            r0 = r1 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0067
            long r18 = X.AnonymousClass7HC.A01
        L_0x0022:
            r0 = r1 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x0064
            long r20 = X.AnonymousClass7KE.A06
        L_0x0028:
            r0 = r1 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L_0x002e
            r22 = 0
        L_0x002e:
            r0 = 65536(0x10000, float:9.18355E-41)
            r1 = r31 & r0
            if (r1 == 0) goto L_0x0036
            long r26 = X.AnonymousClass7HC.A01
        L_0x0036:
            X.8nH r13 = X.AnonymousClass7CC.A00(r32)
            X.7F0 r2 = new X.7F0
            r4 = r3
            r5 = r3
            r6 = r3
            r7 = r3
            r8 = r3
            r10 = r3
            r11 = r3
            r12 = r3
            r14 = r3
            r15 = r3
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r18, r20)
            X.7Ex r0 = new X.7Ex
            r17 = r0
            r18 = r3
            r19 = r3
            r20 = r3
            r21 = r3
            r23 = r3
            r24 = r3
            r25 = r3
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r1 = r28
            r1.<init>(r0, r3, r2)
            return
        L_0x0064:
            r20 = 0
            goto L_0x0028
        L_0x0067:
            r18 = 0
            goto L_0x0022
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C121807If.<init>(X.7yQ, X.7Ee, int, long, long, long):void");
    }
}
