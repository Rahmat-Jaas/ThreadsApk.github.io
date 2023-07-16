package X;

import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S3200000_I2;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4440000_I2;
import com.instagram.api.schemas.LineType;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.7Gn  reason: invalid class name and case insensitive filesystem */
public final class C121517Gn {
    public static final C121517Gn A00 = new C121517Gn();

    public static final KtCSuperShape0S4440000_I2 A00(LineType lineType, C90115Ko r9, C970267q r10, String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        C970267q r4 = r10;
        String str5 = str;
        C86104wH.A1P(str, 0, r10);
        LineType lineType2 = lineType;
        C04220Ms.A0B(lineType, 8);
        C90115Ko r0 = r9;
        String str6 = r9.A02;
        return new KtCSuperShape0S4440000_I2(new KtCSuperShape0S3200000_I2(r0.A00, r0.A01, str6, r0.A03, r0.A04), lineType2, r4, str5, str2, str3, str4, z, z2, z3, z4);
    }

    public final C146628mY A02(LineType lineType, C970267q r26, BKU bku, String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3) {
        List<BKU> A3I;
        C970267q r4 = r26;
        String str5 = str;
        C86104wH.A1P(str5, 0, r4);
        LineType lineType2 = lineType;
        C04220Ms.A0B(lineType2, 8);
        String str6 = str2;
        String str7 = str3;
        String str8 = str4;
        boolean z4 = z;
        boolean z5 = z2;
        boolean z6 = z3;
        if (bku.BSA() && (A3I = bku.A3I()) != null) {
            ArrayList A0v = AnonymousClass0wJ.A0v();
            for (BKU bku2 : A3I) {
                C04220Ms.A04(bku2);
                C147068nL A002 = AnonymousClass7CY.A00(bku2);
                if (A002 != null) {
                    A0v.add(A002);
                }
            }
            if (!A0v.isEmpty()) {
                return new KtCSuperShape0S4440000_I2(lineType2, r4, str5, str6, str7, str8, AnonymousClass7C0.A00(A0v), z4, z5, z6);
            }
        }
        C147068nL A003 = AnonymousClass7CY.A00(bku);
        if (A003 == null) {
            return null;
        }
        return new KtCSuperShape0S4440000_I2(lineType2, r4, A003, str5, str6, str7, str8, z4, z5, z6);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0262, code lost:
        if (r0 != null) goto L_0x0264;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x027a, code lost:
        if (r6.A04 != true) goto L_0x027c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x027e, code lost:
        if (r4 != null) goto L_0x0280;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0280, code lost:
        r4 = r4.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0282, code lost:
        if (r4 == null) goto L_0x028a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0284, code lost:
        r73 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0288, code lost:
        if (r4.A03 == true) goto L_0x028c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x028a, code lost:
        r73 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x028c, code lost:
        r3 = r2.A1i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x028e, code lost:
        if (r3 == null) goto L_0x0365;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0290, code lost:
        r65 = r3.BK7();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0294, code lost:
        r2 = r2.A1J;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0296, code lost:
        if (r2 == null) goto L_0x0361;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0298, code lost:
        r2 = r2.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x029a, code lost:
        if (r2 == null) goto L_0x0361;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x029c, code lost:
        r3 = r2.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x029e, code lost:
        r1.add(new X.C90315Lj(r59, r3, r61, r62, r43, r44, r65, r31, r33, r68, r7, r70, r71, r72, r73, r38, false));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x02b8, code lost:
        if (r16 == false) goto L_0x02ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x02ba, code lost:
        r2 = r5.A3X();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x02be, code lost:
        if (r2 != null) goto L_0x02c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x02c0, code lost:
        r2 = X.AnonymousClass0ZV.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x02c2, code lost:
        r46 = X.AnonymousClass7C0.A00(r2);
        r49 = X.A73.A00(r12).A00(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x02ce, code lost:
        if (r0 != null) goto L_0x02d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x02d0, code lost:
        r50 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x02d2, code lost:
        if (r76 == false) goto L_0x02d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x02d4, code lost:
        r50 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x02d6, code lost:
        r1.add(new X.C90295Lh(r59, r61, r62, r43, r44, r31, r46, r15, r33, r49, r50, r38));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x02ee, code lost:
        if (r0 == null) goto L_0x0347;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x02f0, code lost:
        r2 = r5.A3X();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x02f4, code lost:
        if (r2 != null) goto L_0x02f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x02f6, code lost:
        r2 = X.AnonymousClass0ZV.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x02f8, code lost:
        r47 = X.AnonymousClass7C0.A00(r2);
        r53 = X.A73.A00(r12).A00(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0306, code lost:
        if ((r0 instanceof X.AnonymousClass7pG) == false) goto L_0x035f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0308, code lost:
        r2 = (X.AnonymousClass7pG) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x030b, code lost:
        if (r2 == null) goto L_0x035f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x030d, code lost:
        r2 = r2.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0311, code lost:
        if ((r0 instanceof X.AnonymousClass7pF) == false) goto L_0x031b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0313, code lost:
        r0 = (X.AnonymousClass7pF) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0315, code lost:
        if (r0 == null) goto L_0x031b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0317, code lost:
        r18 = r0.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x031b, code lost:
        if (r76 != false) goto L_0x031f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x031d, code lost:
        if (r38 == false) goto L_0x0321;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x031f, code lost:
        r55 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0321, code lost:
        r1.add(new X.C90325Lk(r59, r61, r62, r43, r44, r18, r31, r47, X.AnonymousClass7C0.A00(r52), r15, r2, com.facebook.common.dextricks.Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP, r33, r53, r77, r55, r56, r57, r38, false));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0347, code lost:
        if (r38 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0349, code lost:
        r1.add(new X.C90275Lf(r62, r43, r44, r31, r33, r76));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x035e, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x035f, code lost:
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0361, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0365, code lost:
        r65 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0378, code lost:
        if (r7 != false) goto L_0x037a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x0390, code lost:
        if (r7 != false) goto L_0x0392;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:?, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00e8, code lost:
        if (r5.A4L() == false) goto L_0x00ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x010f, code lost:
        if (r7 != false) goto L_0x0111;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0188, code lost:
        if (r17 != false) goto L_0x018a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x024a, code lost:
        if (r61 == X.C970267q.TARGET_POST) goto L_0x024c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ java.util.List A01(com.instagram.api.schemas.LineType r63, X.C970267q r64, X.C142388em r65, X.BKU r66, com.instagram.service.session.UserSession r67, com.instagram.user.model.User r68, java.lang.Boolean r69, java.lang.String r70, java.lang.String r71, java.lang.String r72, java.lang.String r73, java.lang.String r74, java.util.List r75, int r76, boolean r77, boolean r78, boolean r79, boolean r80, boolean r81, boolean r82, boolean r83, boolean r84, boolean r85) {
        /*
            r4 = r74
            r1 = r76
            r0 = r1 & 8192(0x2000, float:1.14794E-41)
            if (r0 == 0) goto L_0x0009
            r4 = 0
        L_0x0009:
            r0 = r1 & 16384(0x4000, float:2.2959E-41)
            r2 = r78
            boolean r21 = X.C18240wQ.A1R(r0, r2)
            r0 = 32768(0x8000, float:4.5918E-41)
            r0 = r0 & r76
            r2 = r79
            boolean r76 = X.C18240wQ.A1R(r0, r2)
            r0 = 65536(0x10000, float:9.18355E-41)
            r0 = r0 & r1
            r2 = r80
            boolean r33 = X.C18240wQ.A1R(r0, r2)
            r0 = 131072(0x20000, float:1.83671E-40)
            r0 = r0 & r1
            r2 = r81
            boolean r38 = X.C18240wQ.A1R(r0, r2)
            r0 = 262144(0x40000, float:3.67342E-40)
            r0 = r0 & r1
            r2 = r82
            boolean r7 = X.C18240wQ.A1R(r0, r2)
            r0 = 524288(0x80000, float:7.34684E-40)
            r0 = r0 & r1
            r2 = r83
            boolean r20 = X.C18240wQ.A1R(r0, r2)
            r0 = 1048576(0x100000, float:1.469368E-39)
            r0 = r0 & r1
            r2 = r84
            boolean r56 = X.C18240wQ.A1R(r0, r2)
            r0 = 2097152(0x200000, float:2.938736E-39)
            r1 = r1 & r0
            r0 = r85
            boolean r57 = X.C18240wQ.A1R(r1, r0)
            r19 = 0
            r6 = r68
            r0 = r19
            X.C04220Ms.A0B(r6, r0)
            r3 = 1
            r43 = r71
            r62 = r70
            r1 = r62
            r0 = r43
            X.AnonymousClass0wJ.A1R(r1, r0)
            r2 = 6
            r59 = r63
            r61 = r64
            r1 = r61
            r0 = r59
            X.C86104wH.A1P(r1, r2, r0)
            r1 = 11
            r52 = r75
            r0 = r52
            X.C04220Ms.A0B(r0, r1)
            r5 = r66
            X.BKN r2 = r5.A0f
            java.lang.String r0 = r2.A4Y
            r44 = r0
            X.C04220Ms.A06(r44)
            r12 = r67
            com.instagram.user.model.User r10 = r5.A2Z(r12)
            if (r10 == 0) goto L_0x03c8
            boolean r0 = r10.A38()
            if (r0 != 0) goto L_0x03c8
            X.Avj r0 = X.C19401Avj.A00(r12)
            boolean r78 = r0.A06(r5)
            r55 = 0
            r31 = r73
            r8 = r69
            if (r38 != 0) goto L_0x00dd
            X.5Ml r0 = r2.A1J
            if (r0 == 0) goto L_0x00b1
            java.lang.Boolean r0 = r0.A06
            boolean r0 = X.C18190wL.A1Z(r0, r3)
            if (r0 != 0) goto L_0x00b9
        L_0x00b1:
            if (r78 != 0) goto L_0x00b9
            int r0 = r5.A04
            if (r0 != 0) goto L_0x00b9
            if (r7 == 0) goto L_0x00dd
        L_0x00b9:
            boolean r75 = X.C18190wL.A1Z(r8, r3)
            X.5Ml r0 = r2.A1J
            if (r0 == 0) goto L_0x00db
            X.5Kk r0 = r0.A00
            if (r0 == 0) goto L_0x00db
            boolean r0 = r0.A01
        L_0x00c7:
            X.5Li r67 = new X.5Li
            r68 = r59
            r69 = r61
            r72 = r44
            r74 = r33
            r77 = r0
            r67.<init>(r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78)
            java.util.List r1 = X.C18180wK.A0n(r67)
        L_0x00da:
            return r1
        L_0x00db:
            r0 = 0
            goto L_0x00c7
        L_0x00dd:
            int r15 = r5.A1g()
            if (r15 != r3) goto L_0x00ea
            boolean r0 = r5.A4L()
            r7 = 1
            if (r0 != 0) goto L_0x00eb
        L_0x00ea:
            r7 = 0
        L_0x00eb:
            X.BZI r0 = r5.A26()
            r18 = 0
            if (r0 == 0) goto L_0x03c4
            java.lang.String r11 = r0.A0h
        L_0x00f5:
            boolean r9 = r5.A0Y
            X.98U r0 = r2.A0L
            java.lang.String r1 = r10.getId()
            boolean r17 = X.C18250wR.A1J(r12, r1)
            java.lang.String r1 = r6.BK7()
            boolean r42 = X.C04220Ms.A0I(r4, r1)
            if (r65 != 0) goto L_0x0111
            if (r15 <= 0) goto L_0x0111
            r16 = 1
            if (r7 == 0) goto L_0x0113
        L_0x0111:
            r16 = 0
        L_0x0113:
            java.util.ArrayList r1 = X.AnonymousClass0wJ.A0v()
            if (r4 == 0) goto L_0x03c0
            if (r21 != 0) goto L_0x03c0
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S5240000_I2 r6 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S5240000_I2
            r24 = r6
            r25 = r59
            r26 = r61
            r27 = r62
            r28 = r43
            r29 = r44
            r30 = r4
            r32 = r42
            r34 = r38
            r24.<init>(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            r1.add(r6)
            r41 = 0
        L_0x0137:
            long r6 = r5.A1t()
            double r13 = (double) r6
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)
            boolean r40 = X.C04220Ms.A0I(r8, r6)
            r36 = r38 ^ 1
            boolean r7 = r5.BSA()
            r45 = r72
            if (r7 == 0) goto L_0x03bc
            if (r11 == 0) goto L_0x0156
            boolean r7 = X.AnonymousClass8bQ.A0n(r11)
            if (r7 == 0) goto L_0x03bc
        L_0x0156:
            if (r72 == 0) goto L_0x015e
            boolean r7 = X.AnonymousClass8bQ.A0n(r45)
            if (r7 == 0) goto L_0x03bc
        L_0x015e:
            r35 = 1
        L_0x0160:
            r32 = r18
            if (r21 == 0) goto L_0x0166
            r32 = r4
        L_0x0166:
            java.lang.Double r25 = java.lang.Double.valueOf(r13)
            com.instagram.common.typedurl.ImageUrl r23 = r10.B4M()
            java.lang.String r29 = r10.BK7()
            java.lang.String r30 = r10.getId()
            X.D0g r24 = r10.Aj4()
            boolean r34 = r10.BZi()
            if (r20 == 0) goto L_0x018a
            X.D0g r7 = r10.A03
            X.D0g r4 = X.C23894D0g.FollowStatusNotFollowing
            if (r7 != r4) goto L_0x018a
            r37 = 1
            if (r17 == 0) goto L_0x018c
        L_0x018a:
            r37 = 0
        L_0x018c:
            X.5Ll r4 = new X.5Ll
            r22 = r61
            r26 = r62
            r27 = r43
            r28 = r44
            r39 = r19
            r20 = r4
            r21 = r59
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42)
            r1.add(r4)
            if (r72 == 0) goto L_0x01b8
            X.5Lg r4 = new X.5Lg
            r39 = r4
            r40 = r59
            r41 = r61
            r42 = r62
            r46 = r31
            r47 = r33
            r39.<init>(r40, r41, r42, r43, r44, r45, r46, r47)
            r1.add(r4)
        L_0x01b8:
            if (r9 == 0) goto L_0x01da
            if (r0 == 0) goto L_0x03b6
            java.lang.String r4 = r0.A06
            java.util.List r0 = r0.A0B
            if (r0 == 0) goto L_0x03b8
            X.8s2 r26 = X.AnonymousClass7C0.A00(r0)
        L_0x01c6:
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S5340000_I2 r0 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S5340000_I2
            r20 = r0
            r21 = r62
            r22 = r43
            r23 = r44
            r24 = r4
            r25 = r31
            r20.<init>((java.lang.String) r21, (java.lang.String) r22, (java.lang.String) r23, (java.lang.String) r24, (java.lang.String) r25, (X.AnonymousClass8s2) r26)
            r1.add(r0)
        L_0x01da:
            if (r11 == 0) goto L_0x03b2
            boolean r0 = X.AnonymousClass8bQ.A0n(r11)
            if (r0 != 0) goto L_0x03b2
            if (r9 != 0) goto L_0x03b2
            java.lang.Boolean r0 = r10.A0k()
            boolean r34 = X.C04220Ms.A0I(r0, r6)
            r32 = 512(0x200, float:7.175E-43)
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S5240000_I2 r0 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S5240000_I2
            r24 = r0
            r25 = r59
            r26 = r61
            r27 = r62
            r28 = r43
            r29 = r44
            r30 = r11
            r35 = r38
            r24.<init>((com.instagram.api.schemas.LineType) r25, (X.C970267q) r26, (java.lang.String) r27, (java.lang.String) r28, (java.lang.String) r29, (java.lang.String) r30, (java.lang.String) r31, (int) r32, (boolean) r33, (boolean) r34, (boolean) r35)
            r1.add(r0)
            r29 = 1
        L_0x0208:
            X.7Gn r20 = A00
            r21 = r59
            r22 = r61
            r23 = r5
            r24 = r62
            r25 = r43
            r26 = r44
            r27 = r31
            r28 = r33
            r30 = r38
            X.8mY r0 = r20.A02(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            if (r0 == 0) goto L_0x03af
            r1.add(r0)
            r7 = 1
        L_0x0226:
            X.5Ml r0 = r2.A1J
            if (r0 == 0) goto L_0x023e
            X.5Mj r4 = r0.A03
            if (r4 == 0) goto L_0x0388
            X.BKU r4 = r4.A01
            if (r4 == 0) goto L_0x0388
            com.instagram.user.model.User r0 = r4.A2Z(r12)
            if (r0 == 0) goto L_0x0370
            boolean r0 = r0.A38()
            if (r0 != r3) goto L_0x0370
        L_0x023e:
            X.67q r4 = X.C970267q.POST
            r0 = r61
            if (r0 == r4) goto L_0x024c
            X.67q r7 = X.C970267q.TARGET_POST
            r0 = r18
            r4 = r61
            if (r4 != r7) goto L_0x024e
        L_0x024c:
            r0 = r65
        L_0x024e:
            boolean r68 = r5.A4L()
            X.5Ml r4 = r2.A1J
            if (r4 == 0) goto L_0x036d
            X.5Mj r7 = r4.A03
            if (r7 == 0) goto L_0x036d
            boolean r7 = r7.A05
        L_0x025c:
            if (r76 != 0) goto L_0x0264
            if (r16 != 0) goto L_0x0264
            r70 = 0
            if (r0 == 0) goto L_0x0266
        L_0x0264:
            r70 = 1
        L_0x0266:
            if (r4 == 0) goto L_0x0369
            java.lang.Boolean r4 = r4.A05
            boolean r71 = X.C04220Ms.A0I(r4, r6)
        L_0x026e:
            X.5Ml r4 = r2.A1J
            if (r4 == 0) goto L_0x027c
            X.5Mj r6 = r4.A03
            if (r6 == 0) goto L_0x027c
            boolean r6 = r6.A04
            r72 = 1
            if (r6 == r3) goto L_0x0280
        L_0x027c:
            r72 = 0
            if (r4 == 0) goto L_0x028a
        L_0x0280:
            X.5Mj r4 = r4.A03
            if (r4 == 0) goto L_0x028a
            boolean r4 = r4.A03
            r73 = 1
            if (r4 == r3) goto L_0x028c
        L_0x028a:
            r73 = 0
        L_0x028c:
            com.instagram.user.model.User r3 = r2.A1i
            if (r3 == 0) goto L_0x0365
            java.lang.String r65 = r3.BK7()
        L_0x0294:
            X.5Ml r2 = r2.A1J
            if (r2 == 0) goto L_0x0361
            X.5Mj r2 = r2.A03
            if (r2 == 0) goto L_0x0361
            com.instagram.api.schemas.RepostRestrictedReason r3 = r2.A00
        L_0x029e:
            X.5Lj r2 = new X.5Lj
            r58 = r2
            r60 = r3
            r63 = r43
            r64 = r44
            r66 = r31
            r67 = r33
            r69 = r7
            r74 = r38
            r75 = r19
            r58.<init>(r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75)
            r1.add(r2)
            if (r16 == 0) goto L_0x02ee
            java.util.List r2 = r5.A3X()
            if (r2 != 0) goto L_0x02c2
            X.0ZV r2 = X.AnonymousClass0ZV.A00
        L_0x02c2:
            X.8s2 r46 = X.AnonymousClass7C0.A00(r2)
            X.6v9 r2 = X.A73.A00(r12)
            boolean r49 = r2.A00(r5)
            if (r0 != 0) goto L_0x02d4
            r50 = 0
            if (r76 == 0) goto L_0x02d6
        L_0x02d4:
            r50 = 1
        L_0x02d6:
            X.5Lh r2 = new X.5Lh
            r39 = r2
            r40 = r59
            r41 = r61
            r42 = r62
            r45 = r31
            r47 = r15
            r48 = r33
            r51 = r38
            r39.<init>(r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51)
            r1.add(r2)
        L_0x02ee:
            if (r0 == 0) goto L_0x0347
            java.util.List r2 = r5.A3X()
            if (r2 != 0) goto L_0x02f8
            X.0ZV r2 = X.AnonymousClass0ZV.A00
        L_0x02f8:
            X.8s2 r47 = X.AnonymousClass7C0.A00(r2)
            X.6v9 r2 = X.A73.A00(r12)
            boolean r53 = r2.A00(r5)
            boolean r2 = r0 instanceof X.AnonymousClass7pG
            if (r2 == 0) goto L_0x035f
            r2 = r0
            X.7pG r2 = (X.AnonymousClass7pG) r2
            if (r2 == 0) goto L_0x035f
            int r2 = r2.A00
        L_0x030f:
            boolean r3 = r0 instanceof X.AnonymousClass7pF
            if (r3 == 0) goto L_0x031b
            X.7pF r0 = (X.AnonymousClass7pF) r0
            if (r0 == 0) goto L_0x031b
            java.lang.String r0 = r0.A00
            r18 = r0
        L_0x031b:
            if (r76 != 0) goto L_0x031f
            if (r38 == 0) goto L_0x0321
        L_0x031f:
            r55 = 1
        L_0x0321:
            X.8s2 r48 = X.AnonymousClass7C0.A00(r52)
            r51 = 131072(0x20000, float:1.83671E-40)
            X.5Lk r0 = new X.5Lk
            r54 = r77
            r39 = r0
            r40 = r59
            r41 = r61
            r42 = r62
            r45 = r18
            r46 = r31
            r49 = r15
            r50 = r2
            r52 = r33
            r58 = r38
            r59 = r19
            r39.<init>(r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59)
            r1.add(r0)
        L_0x0347:
            if (r38 == 0) goto L_0x00da
            X.5Lf r0 = new X.5Lf
            r2 = r0
            r3 = r62
            r4 = r43
            r5 = r44
            r6 = r31
            r7 = r33
            r8 = r76
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r1.add(r0)
            return r1
        L_0x035f:
            r2 = 0
            goto L_0x030f
        L_0x0361:
            r3 = r18
            goto L_0x029e
        L_0x0365:
            r65 = r18
            goto L_0x0294
        L_0x0369:
            r71 = 0
            goto L_0x026e
        L_0x036d:
            r7 = 0
            goto L_0x025c
        L_0x0370:
            X.5Hp r23 = X.C100436Nh.A00(r4, r12)
            if (r29 != 0) goto L_0x037a
            r29 = 0
            if (r7 == 0) goto L_0x037c
        L_0x037a:
            r29 = 1
        L_0x037c:
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4440000_I2 r0 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4440000_I2
            r20 = r0
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29)
            r1.add(r0)
            goto L_0x023e
        L_0x0388:
            X.5Ko r0 = r0.A01
            if (r0 == 0) goto L_0x023e
            if (r29 != 0) goto L_0x0392
            r28 = 0
            if (r7 == 0) goto L_0x0394
        L_0x0392:
            r28 = 1
        L_0x0394:
            r20 = r59
            r21 = r0
            r23 = r62
            r24 = r43
            r25 = r44
            r26 = r31
            r27 = r33
            r29 = r38
            r30 = r19
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4440000_I2 r0 = A00(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r1.add(r0)
            goto L_0x023e
        L_0x03af:
            r7 = 0
            goto L_0x0226
        L_0x03b2:
            r29 = 0
            goto L_0x0208
        L_0x03b6:
            r4 = r18
        L_0x03b8:
            r26 = r18
            goto L_0x01c6
        L_0x03bc:
            r35 = 0
            goto L_0x0160
        L_0x03c0:
            r41 = 1
            goto L_0x0137
        L_0x03c4:
            r11 = r18
            goto L_0x00f5
        L_0x03c8:
            X.0ZV r1 = X.AnonymousClass0ZV.A00
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C121517Gn.A01(com.instagram.api.schemas.LineType, X.67q, X.8em, X.BKU, com.instagram.service.session.UserSession, com.instagram.user.model.User, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, int, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean):java.util.List");
    }
}
