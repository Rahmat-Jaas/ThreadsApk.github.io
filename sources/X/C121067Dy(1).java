package X;

import com.instagram.pendingmedia.model.PendingMedia;
import java.util.List;

/* renamed from: X.7Dy  reason: invalid class name and case insensitive filesystem */
public final class C121067Dy {
    public static final C121067Dy A00 = new C121067Dy();

    public static final C147068nL A00(PendingMedia pendingMedia) {
        String str = pendingMedia.A2X;
        if (str != null) {
            List A0n = C18180wK.A0n(AnonymousClass3WG.A01(C86144wL.A0Z(str), -1, -1));
            if (!A0n.isEmpty()) {
                String str2 = pendingMedia.A2Y;
                int i = pendingMedia.A0G;
                int i2 = pendingMedia.A0F;
                C04220Ms.A06(str2);
                return new C90365Ls(str2, (String) null, A0n, i, i2);
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0184, code lost:
        if (r11 != false) goto L_0x0186;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x003f, code lost:
        if (r2.A13() != false) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01ae, code lost:
        if (r12 == false) goto L_0x01b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01e4, code lost:
        if (r32 == false) goto L_0x01e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0258, code lost:
        if (r11 != false) goto L_0x025a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0180  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0231  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List A01(X.C970267q r55, com.instagram.pendingmedia.model.PendingMedia r56, com.instagram.user.model.User r57, java.lang.Boolean r58, java.lang.String r59, java.lang.String r60, boolean r61) {
        /*
            r54 = this;
            r18 = 0
            r5 = 0
            r6 = r57
            X.C04220Ms.A0B(r6, r5)
            r4 = 1
            r15 = r55
            r2 = r56
            X.AnonymousClass0wJ.A1Q(r2, r15)
            java.util.List r0 = r2.A3z
            X.C04220Ms.A06(r0)
            java.lang.Object r0 = X.AnonymousClass00J.A0C(r0)
            com.instagram.pendingmedia.model.PendingMedia r0 = (com.instagram.pendingmedia.model.PendingMedia) r0
            java.lang.String r10 = r0.A2Y
            java.util.List r1 = r2.A3z
            int r1 = r1.size()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r4)
            boolean r12 = X.C86134wK.A1X(r1, r4)
            boolean r1 = r2.A0q()
            if (r1 != 0) goto L_0x012f
            X.FeZ r7 = r2.A1N
            X.FeZ r1 = X.C28933FeZ.CONFIGURED
            if (r7 == r1) goto L_0x012f
            r29 = 1
            boolean r1 = r2.A13()
            r32 = 0
            if (r1 == 0) goto L_0x0043
        L_0x0041:
            r32 = 1
        L_0x0043:
            if (r12 == 0) goto L_0x012b
            com.instagram.api.schemas.LineType r14 = com.instagram.api.schemas.LineType.LINE
        L_0x0047:
            java.util.ArrayList r1 = X.AnonymousClass0wJ.A0v()
            boolean r7 = r0.A0w()
            r39 = r60
            if (r7 == 0) goto L_0x0127
            java.lang.String r7 = r0.A2B
            if (r7 == 0) goto L_0x005d
            boolean r7 = X.AnonymousClass8bQ.A0n(r7)
            if (r7 == 0) goto L_0x0127
        L_0x005d:
            if (r60 == 0) goto L_0x0065
            boolean r7 = X.AnonymousClass8bQ.A0n(r39)
            if (r7 == 0) goto L_0x0127
        L_0x0065:
            r28 = 1
        L_0x0067:
            r7 = r58
            boolean r33 = X.C04220Ms.A0I(r7, r3)
            X.C04220Ms.A06(r10)
            r7 = 9
            X.C04220Ms.A0B(r14, r7)
            com.instagram.common.typedurl.ImageUrl r16 = r6.B4M()
            java.lang.String r22 = r6.BK7()
            java.lang.String r23 = r6.getId()
            X.D0g r17 = r6.Aj4()
            boolean r27 = r6.BZi()
            X.5Ll r13 = new X.5Ll
            r19 = r59
            r21 = r10
            r24 = r18
            r25 = r18
            r26 = r5
            r30 = r5
            r31 = r4
            r34 = r4
            r35 = r5
            r20 = r10
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            r1.add(r13)
            if (r60 == 0) goto L_0x00bf
            X.5Lg r7 = new X.5Lg
            r33 = r7
            r34 = r14
            r35 = r15
            r36 = r19
            r37 = r10
            r38 = r10
            r40 = r18
            r41 = r5
            r33.<init>(r34, r35, r36, r37, r38, r39, r40, r41)
            r1.add(r7)
        L_0x00bf:
            java.lang.String r7 = r0.A2B
            if (r7 == 0) goto L_0x0124
            boolean r7 = X.AnonymousClass8bQ.A0n(r7)
            if (r7 != 0) goto L_0x0124
            java.lang.String r8 = r0.A2B
            if (r8 != 0) goto L_0x00cf
            java.lang.String r8 = ""
        L_0x00cf:
            java.lang.Boolean r7 = r6.A0k()
            boolean r29 = X.C04220Ms.A0I(r7, r3)
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S5240000_I2 r3 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S5240000_I2
            r20 = r3
            r21 = r14
            r22 = r15
            r23 = r19
            r24 = r10
            r25 = r10
            r26 = r8
            r27 = r18
            r28 = r5
            r30 = r4
            r31 = r32
            r20.<init>((com.instagram.api.schemas.LineType) r21, (X.C970267q) r22, (java.lang.String) r23, (java.lang.String) r24, (java.lang.String) r25, (java.lang.String) r26, (java.lang.String) r27, (boolean) r28, (boolean) r29, (boolean) r30, (boolean) r31)
            r1.add(r3)
            r29 = 1
        L_0x00f7:
            boolean r3 = r0.A0w()
            if (r3 == 0) goto L_0x0133
            java.util.List r3 = r0.A0R()
            if (r3 == 0) goto L_0x0133
            java.util.ArrayList r7 = X.AnonymousClass0wJ.A0v()
            java.util.Iterator r8 = r3.iterator()
        L_0x010b:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto L_0x0155
            java.lang.Object r3 = r8.next()
            com.instagram.pendingmedia.model.PendingMedia r3 = (com.instagram.pendingmedia.model.PendingMedia) r3
            X.C04220Ms.A04(r3)
            X.8nL r3 = A00(r3)
            if (r3 == 0) goto L_0x010b
            r7.add(r3)
            goto L_0x010b
        L_0x0124:
            r29 = 0
            goto L_0x00f7
        L_0x0127:
            r28 = 0
            goto L_0x0067
        L_0x012b:
            com.instagram.api.schemas.LineType r14 = com.instagram.api.schemas.LineType.NONE
            goto L_0x0047
        L_0x012f:
            r29 = 0
            goto L_0x0041
        L_0x0133:
            X.8nL r23 = A00(r0)
            if (r23 != 0) goto L_0x013b
            r11 = 0
            goto L_0x017c
        L_0x013b:
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4440000_I2 r3 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4440000_I2
            r20 = r3
            r21 = r14
            r22 = r15
            r24 = r19
            r25 = r10
            r26 = r10
            r27 = r18
            r28 = r5
            r30 = r4
            r31 = r32
            r20.<init>((com.instagram.api.schemas.LineType) r21, (X.C970267q) r22, (X.C147068nL) r23, (java.lang.String) r24, (java.lang.String) r25, (java.lang.String) r26, (java.lang.String) r27, (boolean) r28, (boolean) r29, (boolean) r30, (boolean) r31)
            goto L_0x0178
        L_0x0155:
            boolean r3 = r7.isEmpty()
            if (r3 != 0) goto L_0x0133
            X.8s2 r27 = X.AnonymousClass7C0.A00(r7)
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4440000_I2 r3 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4440000_I2
            r20 = r3
            r21 = r14
            r22 = r15
            r23 = r19
            r24 = r10
            r25 = r10
            r26 = r18
            r28 = r5
            r30 = r4
            r31 = r32
            r20.<init>((com.instagram.api.schemas.LineType) r21, (X.C970267q) r22, (java.lang.String) r23, (java.lang.String) r24, (java.lang.String) r25, (java.lang.String) r26, (X.AnonymousClass8s2) r27, (boolean) r28, (boolean) r29, (boolean) r30, (boolean) r31)
        L_0x0178:
            r1.add(r3)
            r11 = 1
        L_0x017c:
            X.5Hp r3 = r0.A0o
            if (r3 == 0) goto L_0x0231
            if (r29 != 0) goto L_0x0186
            r29 = 0
            if (r11 == 0) goto L_0x0188
        L_0x0186:
            r29 = 1
        L_0x0188:
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4440000_I2 r0 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4440000_I2
            r20 = r0
            r21 = r14
            r22 = r15
            r23 = r3
            r24 = r19
            r25 = r10
            r26 = r10
            r27 = r18
            r28 = r5
            r30 = r4
            r31 = r32
            r20.<init>((com.instagram.api.schemas.LineType) r21, (X.C970267q) r22, (X.C89935Hp) r23, (java.lang.String) r24, (java.lang.String) r25, (java.lang.String) r26, (java.lang.String) r27, (boolean) r28, (boolean) r29, (boolean) r30, (boolean) r31)
        L_0x01a3:
            r1.add(r0)
        L_0x01a6:
            r11 = r61
            if (r61 != 0) goto L_0x01b0
            if (r32 == 0) goto L_0x01b0
            r45 = 0
            if (r12 == 0) goto L_0x01b2
        L_0x01b0:
            r45 = 1
        L_0x01b2:
            X.5Lj r0 = new X.5Lj
            r33 = r0
            r34 = r14
            r35 = r18
            r36 = r15
            r37 = r19
            r38 = r10
            r39 = r10
            r40 = r18
            r41 = r18
            r42 = r5
            r43 = r5
            r44 = r5
            r46 = r5
            r47 = r5
            r48 = r5
            r49 = r4
            r50 = r32
            r33.<init>(r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50)
            r1.add(r0)
            if (r12 == 0) goto L_0x0215
            X.8bW r41 = X.AnonymousClass8bW.A01
            if (r61 != 0) goto L_0x01e6
            r49 = 0
            if (r32 != 0) goto L_0x01e8
        L_0x01e6:
            r49 = 1
        L_0x01e8:
            com.instagram.common.typedurl.ImageUrl r0 = r6.B4M()
            com.instagram.common.typedurl.ImageUrl[] r0 = new com.instagram.common.typedurl.ImageUrl[]{r0}
            X.8sK r42 = X.AnonymousClass7C0.A02(r0)
            r45 = 278528(0x44000, float:3.90301E-40)
            X.5Lk r0 = new X.5Lk
            r33 = r0
            r36 = r19
            r37 = r10
            r39 = r18
            r44 = r4
            r47 = r4
            r48 = r4
            r50 = r5
            r51 = r5
            r52 = r4
            r53 = r32
            r33.<init>(r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53)
            r1.add(r0)
        L_0x0215:
            if (r32 != 0) goto L_0x022d
            java.lang.String r3 = r2.A2c
            boolean r0 = r2.A56
            if (r0 == 0) goto L_0x022e
            java.lang.Integer r6 = X.AnonymousClass006.A00
        L_0x021f:
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S5340000_I2 r0 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S5340000_I2
            r5 = r0
            r7 = r19
            r8 = r10
            r9 = r10
            r10 = r3
            r5.<init>((java.lang.Integer) r6, (java.lang.String) r7, (java.lang.String) r8, (java.lang.String) r9, (java.lang.String) r10, (boolean) r11)
            r1.add(r0)
        L_0x022d:
            return r1
        L_0x022e:
            java.lang.Integer r6 = X.AnonymousClass006.A0C
            goto L_0x021f
        L_0x0231:
            java.lang.String r8 = r0.A2b
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S3200000_I2 r0 = r0.A0i
            if (r0 == 0) goto L_0x01a6
            if (r8 == 0) goto L_0x01a6
            java.lang.String r9 = r0.A02
            java.lang.Object r7 = r0.A00
            com.instagram.common.typedurl.ImageUrl r7 = (com.instagram.common.typedurl.ImageUrl) r7
            java.lang.Object r3 = r0.A01
            com.instagram.common.typedurl.ImageUrl r3 = (com.instagram.common.typedurl.ImageUrl) r3
            java.lang.String r0 = r0.A03
            X.5Ko r21 = new X.5Ko
            r23 = r3
            r24 = r9
            r25 = r0
            r26 = r8
            r22 = r7
            r21.<init>(r22, r23, r24, r25, r26)
            if (r29 != 0) goto L_0x025a
            r28 = 0
            if (r11 == 0) goto L_0x025c
        L_0x025a:
            r28 = 1
        L_0x025c:
            r20 = r14
            r22 = r15
            r23 = r19
            r24 = r10
            r25 = r10
            r26 = r18
            r27 = r5
            r29 = r4
            r30 = r32
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4440000_I2 r0 = X.C121517Gn.A00(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            goto L_0x01a3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C121067Dy.A01(X.67q, com.instagram.pendingmedia.model.PendingMedia, com.instagram.user.model.User, java.lang.Boolean, java.lang.String, java.lang.String, boolean):java.util.List");
    }
}
