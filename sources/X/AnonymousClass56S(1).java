package X;

import com.instagram.barcelona.feed.post.data.PostRepository;
import com.instagram.service.session.UserSession;
import java.util.List;

/* renamed from: X.56S  reason: invalid class name */
public final class AnonymousClass56S extends AnonymousClass10X {
    public BKU A00;
    public List A01;
    public final PostRepository A02;
    public final C11630kW A03;
    public final UserSession A04;
    public final String A05;
    public final String A06;
    public final C86074wE A07;
    public final C86094wG A08;

    /* JADX WARNING: type inference failed for: r1v16, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0167, code lost:
        if (r5 != false) goto L_0x0169;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01d9, code lost:
        if (r5 != false) goto L_0x01db;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ AnonymousClass56S(android.app.Application r47, X.C11630kW r48, com.instagram.service.session.UserSession r49, java.lang.String r50) {
        /*
            r46 = this;
            r3 = r49
            com.instagram.barcelona.feed.post.data.PostRepository r1 = X.C100166Mg.A00(r3)
            r7 = 1
            r0 = 5
            X.C04220Ms.A0B(r1, r0)
            r0 = r46
            r2 = r47
            r0.<init>(r2)
            r4 = r50
            r0.A05 = r4
            r0.A04 = r3
            r2 = r48
            r0.A03 = r2
            r0.A02 = r1
            com.instagram.user.model.User r1 = X.AnonymousClass0wJ.A0Y(r3)
            java.lang.String r1 = r1.BK7()
            r0.A06 = r1
            r11 = 0
            java.lang.String r19 = ""
            X.0ZV r1 = X.AnonymousClass0ZV.A00
            r10 = 0
            java.lang.Boolean r17 = java.lang.Boolean.valueOf(r10)
            X.67s r16 = X.C970467s.None
            X.5IE r15 = new X.5IE
            r18 = r19
            r20 = r1
            r21 = r10
            r22 = r10
            r23 = r10
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23)
            X.Enn r2 = X.C18190wL.A0z(r15)
            r0.A07 = r2
            X.Efm r2 = X.C18230wP.A0x(r11, r2)
            r0.A08 = r2
            X.BKU r3 = X.C86114wI.A0W(r3, r4)
            r0.A00 = r3
            if (r3 == 0) goto L_0x017e
            X.BKN r2 = r3.A0f
            java.lang.String r12 = r2.A4Y
            X.C04220Ms.A06(r12)
            com.instagram.user.model.User r5 = r2.A1i
            if (r5 == 0) goto L_0x017e
            java.lang.Boolean r1 = r5.A0k()
            boolean r36 = X.C18190wL.A1Z(r1, r7)
            X.BZI r1 = r3.A26()
            if (r1 == 0) goto L_0x01fd
            java.lang.String r4 = r1.A0h
        L_0x0072:
            X.5Ml r1 = r2.A1J
            if (r1 == 0) goto L_0x01f9
            com.instagram.user.model.User r1 = r1.A04
            if (r1 == 0) goto L_0x01f9
            java.lang.String r43 = r1.BK7()
        L_0x007e:
            java.util.ArrayList r1 = X.AnonymousClass0wJ.A0v()
            java.lang.String r8 = r0.A06
            X.67q r15 = X.C970267q.REPOST_PREVIEW
            com.instagram.api.schemas.LineType r14 = com.instagram.api.schemas.LineType.NONE
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S5240000_I2 r6 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S5240000_I2
            r16 = r6
            r17 = r14
            r18 = r15
            r20 = r12
            r21 = r12
            r22 = r8
            r23 = r11
            r24 = r10
            r25 = r10
            r26 = r10
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r1.add(r6)
            com.instagram.common.typedurl.ImageUrl r16 = r5.B4M()
            java.lang.String r22 = r5.BK7()
            java.lang.String r23 = r5.getId()
            X.D0g r17 = r5.Aj4()
            boolean r27 = r5.BZi()
            long r5 = r3.A1t()
            double r8 = (double) r5
            boolean r5 = r3.BSA()
            if (r5 == 0) goto L_0x01f5
            if (r4 == 0) goto L_0x00cb
            boolean r5 = X.AnonymousClass8bQ.A0n(r4)
            if (r5 == 0) goto L_0x01f5
        L_0x00cb:
            if (r43 == 0) goto L_0x00d3
            boolean r5 = X.AnonymousClass8bQ.A0n(r43)
            if (r5 == 0) goto L_0x01f5
        L_0x00d3:
            r28 = 1
        L_0x00d5:
            java.lang.Double r18 = java.lang.Double.valueOf(r8)
            X.5Ll r13 = new X.5Ll
            r25 = r11
            r29 = r10
            r30 = r10
            r31 = r10
            r32 = r10
            r33 = r10
            r34 = r7
            r35 = r10
            r24 = r11
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            r1.add(r13)
            if (r43 == 0) goto L_0x010d
            X.5Lg r5 = new X.5Lg
            r37 = r5
            r38 = r14
            r39 = r15
            r40 = r19
            r41 = r12
            r42 = r12
            r44 = r11
            r45 = r10
            r37.<init>(r38, r39, r40, r41, r42, r43, r44, r45)
            r1.add(r5)
        L_0x010d:
            if (r4 == 0) goto L_0x0133
            boolean r5 = X.AnonymousClass8bQ.A0n(r4)
            if (r5 != 0) goto L_0x0133
            r34 = 768(0x300, float:1.076E-42)
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S5240000_I2 r5 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S5240000_I2
            r26 = r5
            r27 = r14
            r28 = r15
            r29 = r19
            r30 = r12
            r31 = r12
            r32 = r4
            r33 = r11
            r37 = r10
            r26.<init>((com.instagram.api.schemas.LineType) r27, (X.C970267q) r28, (java.lang.String) r29, (java.lang.String) r30, (java.lang.String) r31, (java.lang.String) r32, (java.lang.String) r33, (int) r34, (boolean) r35, (boolean) r36, (boolean) r37)
            r1.add(r5)
            r29 = 1
        L_0x0133:
            X.7Gn r20 = X.C121517Gn.A00
            r21 = r14
            r22 = r15
            r23 = r3
            r24 = r19
            r25 = r12
            r26 = r12
            r27 = r11
            r28 = r10
            r30 = r10
            X.8mY r3 = r20.A02(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            if (r3 == 0) goto L_0x01f2
            r1.add(r3)
            r5 = 1
        L_0x0151:
            X.5Ml r4 = r2.A1J
            if (r4 == 0) goto L_0x017e
            X.5Mj r2 = r4.A03
            if (r2 == 0) goto L_0x01d1
            X.BKU r3 = r2.A01
            if (r3 == 0) goto L_0x01d1
            com.instagram.service.session.UserSession r2 = r0.A04
            X.5Hp r16 = X.C100436Nh.A00(r3, r2)
            if (r29 != 0) goto L_0x0169
            r22 = 0
            if (r5 == 0) goto L_0x016b
        L_0x0169:
            r22 = 1
        L_0x016b:
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4440000_I2 r2 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4440000_I2
            r13 = r2
            r17 = r19
            r18 = r12
            r19 = r12
            r20 = r11
            r21 = r10
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22)
        L_0x017b:
            r1.add(r2)
        L_0x017e:
            r0.A01 = r1
            X.4wE r4 = r0.A07
        L_0x0182:
            java.lang.Object r5 = r4.getValue()
            r6 = r5
            X.5IE r6 = (X.AnonymousClass5IE) r6
            java.lang.String r15 = r0.A06
            X.BKU r2 = r0.A00
            r14 = 0
            if (r2 == 0) goto L_0x01ce
            X.BKN r1 = r2.A0f
            com.instagram.user.model.User r1 = r1.A1i
            if (r1 == 0) goto L_0x01ce
            java.lang.String r16 = r1.BK7()
        L_0x019a:
            java.util.List r3 = r0.A01
            if (r2 == 0) goto L_0x01cb
            X.BKN r1 = r2.A0f
            X.5Ml r1 = r1.A1J
            if (r1 == 0) goto L_0x01ae
            X.5Mj r1 = r1.A03
            if (r1 == 0) goto L_0x01ae
            boolean r1 = r1.A05
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r1)
        L_0x01ae:
            r18 = 0
        L_0x01b0:
            boolean r2 = r6.A05
            boolean r1 = r6.A07
            X.67s r13 = r6.A00
            X.C04220Ms.A0B(r15, r10)
            X.5IE r12 = new X.5IE
            r17 = r3
            r19 = r2
            r20 = r1
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20)
            boolean r1 = r4.ADi(r5, r12)
            if (r1 == 0) goto L_0x0182
            return
        L_0x01cb:
            r18 = 1
            goto L_0x01b0
        L_0x01ce:
            r16 = r11
            goto L_0x019a
        L_0x01d1:
            X.5Ko r2 = r4.A01
            if (r2 == 0) goto L_0x017e
            if (r29 != 0) goto L_0x01db
            r21 = 0
            if (r5 == 0) goto L_0x01dd
        L_0x01db:
            r21 = 1
        L_0x01dd:
            r13 = r14
            r14 = r2
            r16 = r19
            r17 = r12
            r18 = r12
            r19 = r11
            r20 = r10
            r22 = r10
            r23 = r10
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4440000_I2 r2 = X.C121517Gn.A00(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            goto L_0x017b
        L_0x01f2:
            r5 = 0
            goto L_0x0151
        L_0x01f5:
            r28 = 0
            goto L_0x00d5
        L_0x01f9:
            r43 = r11
            goto L_0x007e
        L_0x01fd:
            r4 = r11
            goto L_0x0072
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass56S.<init>(android.app.Application, X.0kW, com.instagram.service.session.UserSession, java.lang.String):void");
    }
}
