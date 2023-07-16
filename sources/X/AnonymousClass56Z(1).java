package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1410000_I2;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4120000_I2;
import com.instagram.common.gallery.Medium;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.56Z  reason: invalid class name */
public final class AnonymousClass56Z extends AnonymousClass10X {
    public String A00;
    public C148838sG A01;
    public final int A02;
    public final int A03;
    public final C121177En A04;
    public final EAS A05;
    public final C11630kW A06;
    public final C28526FPx A07;
    public final C28152EzN A08;
    public final UserSession A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final C86074wE A0D;
    public final C86094wG A0E;

    public static final C146178lm A01(Medium medium) {
        C146178lm r2;
        Medium medium2 = medium;
        boolean BZm = medium.BZm();
        int i = medium.A05;
        if (BZm) {
            String str = medium.A0T;
            C04220Ms.A06(str);
            r2 = new C90255Lc(medium2, str, i, medium.A0B, medium.A04, true);
        } else {
            r2 = new C90245Lb(medium2, AnonymousClass3WG.A01(C86144wL.A0Z(medium.A0T), medium.A0B, medium.A04), i, medium.A0B, medium.A04);
        }
        return r2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00e6 A[EDGE_INSN: B:71:0x00e6->B:37:0x00e6 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0B(X.AnonymousClass7HD r33, java.lang.String r34) {
        /*
            r32 = this;
            r4 = 0
            r14 = r34
            X.C04220Ms.A0B(r14, r4)
            r3 = r32
            X.4wE r0 = r3.A0D
            java.lang.Object r1 = r0.getValue()
            X.5IX r1 = (X.AnonymousClass5IX) r1
            java.util.List r1 = r1.A0B
            java.util.Iterator r2 = r1.iterator()
        L_0x0016:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x01a4
            java.lang.Object r5 = r2.next()
            boolean r1 = X.AnonymousClass5J1.A01(r5, r14)
            if (r1 == 0) goto L_0x0016
        L_0x0026:
            X.5J1 r5 = (X.AnonymousClass5J1) r5
            if (r5 == 0) goto L_0x0046
            r2 = r33
            X.7yH r1 = r2.A01
            java.lang.String r1 = r1.A00
            X.7HD r5 = r5.A00
            X.7yH r5 = r5.A01
            java.lang.String r5 = r5.A00
            boolean r5 = X.C04220Ms.A0I(r1, r5)
            if (r5 == 0) goto L_0x0047
            r1 = 15
            kotlin.jvm.internal.KtLambdaShape151S0100000_I2_6 r0 = new kotlin.jvm.internal.KtLambdaShape151S0100000_I2_6
            r0.<init>(r2, r1)
        L_0x0043:
            A03(r3, r14, r0)
        L_0x0046:
            return
        L_0x0047:
            long r5 = r2.A00
            boolean r7 = X.C121767Ia.A02(r5)
            if (r7 == 0) goto L_0x015e
            int r8 = X.C86104wH.A07(r5)
            X.8O2 r5 = X.AnonymousClass8O2.A00
            int r5 = A00(r1, r5, r8)
            int r7 = r5 + 1
            if (r7 >= r8) goto L_0x015e
            char r6 = r1.charAt(r7)
            r5 = 64
            if (r6 != r5) goto L_0x015e
            int r5 = r7 + 1
            java.lang.String r7 = X.C18230wP.A0s(r1, r5, r8)
        L_0x006b:
            java.lang.Object r6 = r0.getValue()
            r11 = r6
            X.5IX r11 = (X.AnonymousClass5IX) r11
            boolean r5 = X.AnonymousClass8bQ.A0m(r7)
            if (r5 == 0) goto L_0x0136
            java.lang.String r5 = r11.A08
            boolean r5 = X.C04220Ms.A0I(r5, r14)
            if (r5 != 0) goto L_0x009d
            r8 = 0
            X.0ZV r16 = X.AnonymousClass0ZV.A00
            r20 = 1
            r17 = 8374271(0x7fc7ff, float:1.1734853E-38)
            r9 = r8
            r10 = r8
            r12 = r8
            r13 = r8
            r15 = r8
            r19 = r4
            r21 = r4
            r22 = r4
            r23 = r4
            r24 = r4
            r18 = r4
            X.5IX r11 = X.AnonymousClass5IX.A00(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
        L_0x009d:
            boolean r5 = r0.ADi(r6, r11)
            if (r5 == 0) goto L_0x006b
            java.lang.String r6 = X.AnonymousClass0hA.A02(r7)
            r3.A00 = r6
            if (r6 == 0) goto L_0x0130
            boolean r0 = X.AnonymousClass8bQ.A0n(r6)
            if (r0 != 0) goto L_0x0130
            X.FPx r5 = r3.A07
            X.Hvr r0 = r5.A06
            X.FEP r0 = r0.B5G(r6)
            java.util.List r0 = r0.A06
            if (r0 == 0) goto L_0x012c
            A02(r3, r6, r0)
        L_0x00c0:
            r5 = 8
            kotlin.jvm.internal.KtLambdaShape4S1200000_I2_1 r0 = new kotlin.jvm.internal.KtLambdaShape4S1200000_I2_1
            r0.<init>(r2, r3, r1, r5)
            A03(r3, r14, r0)
            r3.A0D(r14)
            java.util.List r0 = X.AnonymousClass5IX.A01(r3)
            java.util.Iterator r2 = r0.iterator()
        L_0x00d5:
            boolean r0 = r2.hasNext()
            r8 = 0
            if (r0 == 0) goto L_0x00e6
            java.lang.Object r8 = r2.next()
            boolean r0 = X.AnonymousClass5J1.A01(r8, r14)
            if (r0 == 0) goto L_0x00d5
        L_0x00e6:
            X.5J1 r8 = (X.AnonymousClass5J1) r8
            if (r8 == 0) goto L_0x0046
            X.5Hp r0 = r8.A02
            if (r0 != 0) goto L_0x0046
            java.lang.String r0 = X.AnonymousClass8bP.A0P(r1)
            android.text.SpannableString r2 = new android.text.SpannableString
            r2.<init>(r0)
            r7 = 0
            X.C35578IyE.A00(r2)
            int r1 = r2.length()
            java.lang.Class<android.text.style.URLSpan> r0 = android.text.style.URLSpan.class
            r5 = 0
            java.lang.Object[] r2 = r2.getSpans(r4, r1, r0)
            android.text.style.URLSpan[] r2 = (android.text.style.URLSpan[]) r2
            X.C04220Ms.A04(r2)
            int r1 = r2.length
            if (r1 != 0) goto L_0x011a
            X.0ZV r6 = X.AnonymousClass0ZV.A00
        L_0x0110:
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L_0x0162
            X.8Nx r0 = X.C139428Nx.A00
            goto L_0x0043
        L_0x011a:
            java.util.ArrayList r6 = X.C18240wQ.A0k(r1)
        L_0x011e:
            r0 = r2[r5]
            java.lang.String r0 = r0.getURL()
            r6.add(r0)
            int r5 = r5 + 1
            if (r5 >= r1) goto L_0x0110
            goto L_0x011e
        L_0x012c:
            r5.A05(r6)
            goto L_0x00c0
        L_0x0130:
            X.FPx r0 = r3.A07
            r0.A02()
            goto L_0x00c0
        L_0x0136:
            r15 = 0
            X.0ZV r23 = X.AnonymousClass0ZV.A00
            r24 = 8374271(0x7fc7ff, float:1.1734853E-38)
            r16 = r15
            r17 = r15
            r18 = r11
            r19 = r15
            r20 = r15
            r21 = r15
            r22 = r15
            r25 = r4
            r26 = r4
            r27 = r4
            r28 = r4
            r29 = r4
            r30 = r4
            r31 = r4
            X.5IX r11 = X.AnonymousClass5IX.A00(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            goto L_0x009d
        L_0x015e:
            java.lang.String r7 = ""
            goto L_0x006b
        L_0x0162:
            java.util.List r5 = r8.A04
            java.util.ArrayList r2 = X.AnonymousClass0wJ.A0w(r5)
            java.util.Iterator r1 = r5.iterator()
        L_0x016c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x017e
            java.lang.Object r0 = r1.next()
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1410000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1410000_I2) r0
            java.lang.String r0 = r0.A04
            r2.add(r0)
            goto L_0x016c
        L_0x017e:
            boolean r0 = r6.equals(r2)
            if (r0 != 0) goto L_0x0046
            X.8sG r0 = r3.A01
            if (r0 == 0) goto L_0x018b
            r0.AC7(r7)
        L_0x018b:
            X.4qz r2 = X.AnonymousClass3J5.A00(r3)
            kotlin.coroutines.jvm.internal.KtSLambdaShape0S1401000_I2 r1 = new kotlin.coroutines.jvm.internal.KtSLambdaShape0S1401000_I2
            r9 = r1
            r10 = r5
            r11 = r8
            r12 = r3
            r13 = r6
            r15 = r7
            r16 = r4
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            r0 = 3
            X.8sG r0 = X.C25237DiI.A00(r7, r7, r1, r2, r0)
            r3.A01 = r0
            return
        L_0x01a4:
            r5 = 0
            goto L_0x0026
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass56Z.A0B(X.7HD, java.lang.String):void");
    }

    /* JADX WARNING: type inference failed for: r6v2, types: [java.util.List] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0C(java.lang.String r33) {
        /*
            r32 = this;
            r14 = 0
            r3 = r33
            X.C04220Ms.A0B(r3, r14)
            r0 = r32
            X.4wE r2 = r0.A0D
        L_0x000a:
            java.lang.Object r1 = r2.getValue()
            r7 = r1
            X.5IX r7 = (X.AnonymousClass5IX) r7
            java.util.List r5 = r7.A0B
            int r4 = r5.size()
            r0 = 1
            if (r4 != r0) goto L_0x0051
            java.lang.Object r0 = X.AnonymousClass00J.A0C(r5)
            boolean r0 = X.AnonymousClass5J1.A01(r0, r3)
            if (r0 == 0) goto L_0x0051
            r4 = 0
            r12 = 1022(0x3fe, float:1.432E-42)
            X.5J1 r8 = new X.5J1
            r9 = r4
            r10 = r4
            r11 = r3
            r13 = r14
            r8.<init>(r9, r10, r11, r12, r13)
            java.util.List r11 = X.C18180wK.A0n(r8)
            r13 = 8388351(0x7ffeff, float:1.1754583E-38)
            r5 = r4
            r6 = r4
            r8 = r4
            r12 = r4
            r15 = r14
            r16 = r14
            r17 = r14
            r18 = r14
            r19 = r14
            r20 = r14
            X.5IX r0 = X.AnonymousClass5IX.A00(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
        L_0x004a:
            boolean r0 = r2.ADi(r1, r0)
            if (r0 == 0) goto L_0x000a
            return
        L_0x0051:
            java.util.ArrayList r6 = X.AnonymousClass0wJ.A0v()
            java.util.Iterator r5 = r5.iterator()
        L_0x0059:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x006d
            java.lang.Object r4 = r5.next()
            boolean r0 = X.AnonymousClass5J1.A01(r4, r3)
            if (r0 != 0) goto L_0x0059
            r6.add(r4)
            goto L_0x0059
        L_0x006d:
            r15 = 0
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L_0x0082
            r13 = 1023(0x3ff, float:1.434E-42)
            X.5J1 r9 = new X.5J1
            r10 = r15
            r11 = r15
            r12 = r15
            r9.<init>(r10, r11, r12, r13, r14)
            java.util.List r6 = X.C18180wK.A0n(r9)
        L_0x0082:
            r24 = 8388351(0x7ffeff, float:1.1754583E-38)
            r16 = r15
            r17 = r15
            r18 = r7
            r19 = r15
            r20 = r15
            r21 = r15
            r22 = r6
            r23 = r15
            r25 = r14
            r26 = r14
            r27 = r14
            r28 = r14
            r29 = r14
            r30 = r14
            r31 = r14
            X.5IX r0 = X.AnonymousClass5IX.A00(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            goto L_0x004a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass56Z.A0C(java.lang.String):void");
    }

    /* JADX WARNING: type inference failed for: r2v16, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x013a, code lost:
        r4 = r4.A0h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x019b, code lost:
        if (r5 != false) goto L_0x019d;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x01c6  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01f6  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x020b  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x023c  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ AnonymousClass56Z(android.app.Application r59, X.C121177En r60, X.C11630kW r61, com.instagram.service.session.UserSession r62, java.lang.String r63, java.lang.String r64, java.lang.String r65, java.lang.String r66, java.util.List r67) {
        /*
            r58 = this;
            r0 = 47
            kotlin.jvm.internal.KtLambdaShape31S0100000_I2_11 r1 = new kotlin.jvm.internal.KtLambdaShape31S0100000_I2_11
            r4 = r62
            r1.<init>(r4, r0)
            java.lang.Class<X.EAS> r0 = X.EAS.class
            java.lang.Object r1 = r4.A01(r0, r1)
            X.EAS r1 = (X.EAS) r1
            r7 = 1
            r6 = 3
            r57 = 9
            r0 = 10
            X.C04220Ms.A0B(r1, r0)
            r0 = r58
            r2 = r59
            r0.<init>(r2)
            r0.A09 = r4
            r2 = r61
            r0.A06 = r2
            r3 = r63
            r0.A0B = r3
            r2 = r64
            r0.A0C = r2
            r2 = r65
            r0.A0A = r2
            r2 = r60
            r0.A04 = r2
            r0.A05 = r1
            X.0TJ r5 = X.AnonymousClass0TJ.A05
            r1 = 36607801560208168(0x820e9a00011328, double:3.2142593422362006E-306)
            int r1 = X.C63803iN.A01(r5, r4, r1)
            r0.A03 = r1
            r1 = 36607801560142631(0x820e9a00001327, double:3.214259342194755E-306)
            int r1 = X.C63803iN.A01(r5, r4, r1)
            r0.A02 = r1
            X.7x5 r2 = new X.7x5
            r2.<init>(r0)
            r0.A08 = r2
            X.Dbw r5 = new X.Dbw
            r5.<init>()
            X.HJF r1 = new X.HJF
            r1.<init>()
            r5.A04 = r1
            r5.A02 = r2
            java.lang.Integer r1 = X.AnonymousClass006.A00
            r5.A05 = r1
            r1 = 200(0xc8, double:9.9E-322)
            r5.A00 = r1
            X.FPx r1 = r5.A00()
            r0.A07 = r1
            com.instagram.user.model.User r11 = X.AnonymousClass0wJ.A0Y(r4)
            r12 = 0
            if (r63 == 0) goto L_0x0276
            X.BKU r3 = X.C86114wI.A0W(r4, r3)
        L_0x007f:
            r9 = 0
            com.instagram.service.session.UserSession r5 = r0.A09
            X.Awj r2 = X.C19462Awj.A01(r5)
            java.lang.String r1 = r0.A0A
            X.BKU r1 = r2.A05(r1)
            if (r1 != 0) goto L_0x0270
            r15 = 0
        L_0x008f:
            r17 = 511(0x1ff, float:7.16E-43)
            X.5J1 r8 = new X.5J1
            r13 = r8
            r14 = r12
            r16 = r12
            r18 = r9
            r13.<init>(r14, r15, r16, r17, r18)
            X.1tl r4 = X.AnonymousClass3WS.A01(r4)
            X.9tz r2 = r11.A0e()
            X.9tz r1 = X.C169839tz.PrivacyStatusPrivate
            if (r2 != r1) goto L_0x026c
            android.content.SharedPreferences r4 = r4.A00
            java.lang.String r2 = "barcelona_has_seen_privacy_reply_nux"
            boolean r1 = r4.getBoolean(r2, r9)
            if (r1 != 0) goto L_0x026c
            r33 = 1
            android.content.SharedPreferences$Editor r1 = r4.edit()
            X.AnonymousClass0wJ.A13(r1, r2, r7)
        L_0x00bb:
            X.68c r14 = X.C971468c.Anyone
            if (r3 == 0) goto L_0x0268
            X.BKN r1 = r3.A0f
            java.lang.String r10 = r1.A4Y
            X.C04220Ms.A06(r10)
            com.instagram.user.model.User r5 = r1.A1i
            if (r5 == 0) goto L_0x0268
            java.util.ArrayList r2 = X.AnonymousClass0wJ.A0v()
            com.instagram.common.typedurl.ImageUrl r37 = r5.B4M()
            java.lang.String r43 = r5.BK7()
            java.lang.String r44 = r5.getId()
            X.D0g r38 = r5.Aj4()
            boolean r48 = r5.BZi()
            X.67q r36 = X.C970267q.POST
            com.instagram.api.schemas.LineType r35 = com.instagram.api.schemas.LineType.LINE
            boolean r4 = r3.BSA()
            if (r4 == 0) goto L_0x0264
            X.BZI r4 = r3.A26()
            if (r4 == 0) goto L_0x00fc
            java.lang.String r4 = r4.A0h
            if (r4 == 0) goto L_0x00fc
            boolean r4 = X.AnonymousClass8bQ.A0n(r4)
            if (r4 == 0) goto L_0x0264
        L_0x00fc:
            r49 = 1
        L_0x00fe:
            java.lang.String r40 = ""
            X.5Ll r4 = new X.5Ll
            r34 = r4
            r39 = r12
            r41 = r10
            r42 = r10
            r45 = r12
            r46 = r12
            r47 = r9
            r50 = r9
            r51 = r9
            r52 = r9
            r53 = r9
            r54 = r9
            r55 = r7
            r56 = r9
            r34.<init>(r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56)
            r2.add(r4)
            X.BZI r4 = r3.A26()
            if (r4 == 0) goto L_0x0260
            java.lang.String r4 = r4.A0h
            if (r4 == 0) goto L_0x0260
            boolean r4 = X.AnonymousClass8bQ.A0n(r4)
            if (r4 != 0) goto L_0x0260
            X.BZI r4 = r3.A26()
            if (r4 == 0) goto L_0x013e
            java.lang.String r4 = r4.A0h
            if (r4 != 0) goto L_0x0140
        L_0x013e:
            r4 = r40
        L_0x0140:
            java.lang.Boolean r5 = r5.A0k()
            boolean r25 = X.C18190wL.A1Z(r5, r7)
            r23 = 768(0x300, float:1.076E-42)
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S5240000_I2 r5 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S5240000_I2
            r15 = r5
            r16 = r35
            r17 = r36
            r18 = r40
            r19 = r10
            r20 = r10
            r21 = r4
            r22 = r12
            r24 = r9
            r26 = r9
            r15.<init>((com.instagram.api.schemas.LineType) r16, (X.C970267q) r17, (java.lang.String) r18, (java.lang.String) r19, (java.lang.String) r20, (java.lang.String) r21, (java.lang.String) r22, (int) r23, (boolean) r24, (boolean) r25, (boolean) r26)
            r2.add(r5)
            r24 = 1
        L_0x0167:
            X.7Gn r15 = X.C121517Gn.A00
            r16 = r35
            r17 = r36
            r18 = r3
            r19 = r40
            r20 = r10
            r21 = r10
            r22 = r12
            r23 = r9
            r25 = r9
            X.8mY r4 = r15.A02(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            if (r4 == 0) goto L_0x025d
            r2.add(r4)
            r5 = 1
        L_0x0185:
            X.5Ml r1 = r1.A1J
            if (r1 == 0) goto L_0x01a8
            X.5Mj r4 = r1.A03
            if (r4 == 0) goto L_0x023f
            X.BKU r4 = r4.A01
            if (r4 == 0) goto L_0x023f
            com.instagram.service.session.UserSession r1 = r0.A09
            X.5Hp r18 = X.C100436Nh.A00(r4, r1)
            if (r24 != 0) goto L_0x019d
            r24 = 0
            if (r5 == 0) goto L_0x019f
        L_0x019d:
            r24 = 1
        L_0x019f:
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4440000_I2 r1 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4440000_I2
            r15 = r1
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24)
        L_0x01a5:
            r2.add(r1)
        L_0x01a8:
            java.lang.String r18 = r11.BK7()
            com.instagram.common.typedurl.ImageUrl r15 = r11.B4M()
            boolean r26 = r11.BZi()
            X.9tz r16 = r11.A0e()
            java.util.List r23 = X.C18180wK.A0n(r8)
            java.lang.String r1 = r8.A03
            if (r3 == 0) goto L_0x023c
            X.BKN r3 = r3.A0f
            com.instagram.user.model.User r3 = r3.A1i
            if (r3 == 0) goto L_0x023c
            java.lang.String r21 = r3.BK7()
        L_0x01ca:
            X.0ZV r24 = X.AnonymousClass0ZV.A00
            X.5IX r11 = new X.5IX
            r13 = r12
            r17 = r12
            r20 = r12
            r25 = r9
            r27 = r9
            r28 = r9
            r29 = r9
            r30 = r9
            r31 = r7
            r32 = r9
            r34 = r9
            r19 = r1
            r22 = r2
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            X.Enn r2 = X.C18190wL.A0z(r11)
            r0.A0D = r2
            r0.A0E = r2
            r7 = r66
            if (r66 == 0) goto L_0x0207
            int r2 = r7.length()
            long r2 = X.AnonymousClass6FM.A00(r2, r2)
            r5 = 4
            X.7HD r4 = new X.7HD
            r4.<init>((java.lang.String) r7, (int) r5, (long) r2)
            r0.A0B(r4, r1)
        L_0x0207:
            r54 = r67
            if (r67 == 0) goto L_0x021f
            X.4qz r3 = X.AnonymousClass3J5.A00(r0)
            kotlin.coroutines.jvm.internal.KtSLambdaShape1S1201000_I2 r2 = new kotlin.coroutines.jvm.internal.KtSLambdaShape1S1201000_I2
            r52 = r2
            r53 = r0
            r55 = r1
            r56 = r12
            r52.<init>(r53, r54, r55, r56, r57)
            X.C25237DiI.A00(r12, r12, r2, r3, r6)
        L_0x021f:
            X.4qz r3 = X.AnonymousClass3J5.A00(r0)
            r2 = 42
            kotlin.coroutines.jvm.internal.KtSLambdaShape4S0101000_I2_1 r1 = new kotlin.coroutines.jvm.internal.KtSLambdaShape4S0101000_I2_1
            r1.<init>(r0, r12, r2)
            X.C25237DiI.A00(r12, r12, r1, r3, r6)
            X.4qz r3 = X.AnonymousClass3J5.A00(r0)
            r2 = 43
            kotlin.coroutines.jvm.internal.KtSLambdaShape4S0101000_I2_1 r1 = new kotlin.coroutines.jvm.internal.KtSLambdaShape4S0101000_I2_1
            r1.<init>(r0, r12, r2)
            X.C25237DiI.A00(r12, r12, r1, r3, r6)
            return
        L_0x023c:
            r21 = r12
            goto L_0x01ca
        L_0x023f:
            X.5Ko r1 = r1.A01
            if (r1 == 0) goto L_0x01a8
            if (r24 != 0) goto L_0x0247
            if (r5 == 0) goto L_0x0249
        L_0x0247:
            r23 = 1
        L_0x0249:
            r15 = r35
            r16 = r1
            r18 = r40
            r19 = r10
            r21 = r12
            r22 = r9
            r24 = r9
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4440000_I2 r1 = X.C121517Gn.A00(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            goto L_0x01a5
        L_0x025d:
            r5 = 0
            goto L_0x0185
        L_0x0260:
            r24 = 0
            goto L_0x0167
        L_0x0264:
            r49 = 0
            goto L_0x00fe
        L_0x0268:
            X.0ZV r2 = X.AnonymousClass0ZV.A00
            goto L_0x01a8
        L_0x026c:
            r33 = 0
            goto L_0x00bb
        L_0x0270:
            X.5Hp r15 = X.C100436Nh.A00(r1, r5)
            goto L_0x008f
        L_0x0276:
            r3 = r12
            goto L_0x007f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass56Z.<init>(android.app.Application, X.7En, X.0kW, com.instagram.service.session.UserSession, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List):void");
    }

    public static final int A00(String str, AnonymousClass0YY r4, int i) {
        Object obj;
        Iterator it = AnonymousClass8bI.A09(i - 1, 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (AnonymousClass0wJ.A1X(r4.invoke(Character.valueOf(str.charAt(AnonymousClass0wJ.A04(obj)))))) {
                break;
            }
        }
        Number number = (Number) obj;
        if (number != null) {
            return number.intValue();
        }
        return -1;
    }

    public static final void A02(AnonymousClass56Z r17, String str, List list) {
        Object value;
        AnonymousClass5IX r6;
        AnonymousClass56Z r2 = r17;
        if (str.equals(r2.A00)) {
            ArrayList A0w = AnonymousClass0wJ.A0w(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                User A052 = ((C35144IoO) it.next()).A05();
                String id = A052.getId();
                String BK7 = A052.BK7();
                A0w.add(new KtCSuperShape0S4120000_I2(A052.B4M(), id, BK7, A052.Ak1(), A052.A1F(), A052.BZi(), A052.A3V()));
            }
            C86074wE r22 = r2.A0D;
            do {
                value = r22.getValue();
                r6 = (AnonymousClass5IX) value;
                if (r6.A08 != null) {
                    r6 = AnonymousClass5IX.A00((KtCSuperShape0S1410000_I2) null, (KtCSuperShape0S1410000_I2) null, (C971468c) null, r6, (Integer) null, (String) null, (String) null, (List) null, A0w, 8376319, false, false, false, false, false, false, false);
                }
            } while (!r22.ADi(value, r6));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0086, code lost:
        if (r6 == false) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x008a, code lost:
        if (r20 != false) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x008c, code lost:
        r21 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x008e, code lost:
        if (r22 != false) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0090, code lost:
        r21 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0124, code lost:
        r20 = true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0074 A[EDGE_INSN: B:81:0x0074->B:24:0x0074 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0061 A[EDGE_INSN: B:89:0x0061->B:16:0x0061 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0124 A[EDGE_INSN: B:91:0x0124->B:69:0x0124 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A03(X.AnonymousClass56Z r22, java.lang.String r23, X.AnonymousClass0YY r24) {
        /*
            r0 = 15
            kotlin.jvm.internal.KtLambdaShape6S1000000_I2 r4 = new kotlin.jvm.internal.KtLambdaShape6S1000000_I2
            r1 = r23
            r4.<init>(r1, r0)
            r5 = r22
            X.4wE r3 = r5.A0D
        L_0x000d:
            java.lang.Object r2 = r3.getValue()
            r10 = r2
            X.5IX r10 = (X.AnonymousClass5IX) r10
            java.util.List r0 = r10.A0B
            java.util.ArrayList r14 = X.AnonymousClass0wJ.A0w(r0)
            java.util.Iterator r6 = r0.iterator()
        L_0x001e:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x003c
            java.lang.Object r1 = r6.next()
            java.lang.Object r0 = r4.invoke(r1)
            boolean r0 = X.AnonymousClass0wJ.A1X(r0)
            if (r0 == 0) goto L_0x0038
            r0 = r24
            java.lang.Object r1 = r0.invoke(r1)
        L_0x0038:
            r14.add(r1)
            goto L_0x001e
        L_0x003c:
            java.util.ArrayList r8 = X.AnonymousClass0wJ.A0v()
            java.util.Iterator r6 = r14.iterator()
        L_0x0044:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0057
            java.lang.Object r1 = r6.next()
            r0 = r1
            X.5J1 r0 = (X.AnonymousClass5J1) r0
            boolean r0 = r0.A07
            X.C18240wQ.A1N(r1, r8, r0)
            goto L_0x0044
        L_0x0057:
            boolean r7 = r8 instanceof java.util.Collection
            if (r7 == 0) goto L_0x00f4
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L_0x00f4
        L_0x0061:
            r20 = 0
        L_0x0063:
            if (r7 == 0) goto L_0x00dd
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L_0x00dd
        L_0x006b:
            r9 = 1
        L_0x006c:
            if (r7 == 0) goto L_0x00ac
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L_0x00ac
        L_0x0074:
            r6 = 1
        L_0x0075:
            int r1 = r8.size()
            int r0 = r5.A02
            boolean r22 = X.C18230wP.A1W(r1, r0)
            r7 = 0
            if (r20 == 0) goto L_0x0088
            if (r9 == 0) goto L_0x0088
            r18 = 1
            if (r6 != 0) goto L_0x008c
        L_0x0088:
            r18 = 0
            if (r20 == 0) goto L_0x0090
        L_0x008c:
            r21 = 1
            if (r22 != 0) goto L_0x0092
        L_0x0090:
            r21 = 0
        L_0x0092:
            r17 = 0
            r16 = 8273535(0x7e3e7f, float:1.1593692E-38)
            r8 = r7
            r9 = r7
            r11 = r7
            r12 = r7
            r13 = r7
            r15 = r7
            r19 = r17
            r23 = r17
            X.5IX r0 = X.AnonymousClass5IX.A00(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            boolean r0 = r3.ADi(r2, r0)
            if (r0 == 0) goto L_0x000d
            return
        L_0x00ac:
            java.util.Iterator r6 = r8.iterator()
        L_0x00b0:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0074
            java.lang.Object r0 = r6.next()
            X.5J1 r0 = (X.AnonymousClass5J1) r0
            X.8s2 r1 = r0.A05
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L_0x00c9
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x00c9
            goto L_0x00b0
        L_0x00c9:
            java.util.Iterator r1 = r1.iterator()
        L_0x00cd:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00b0
            java.lang.Object r0 = r1.next()
            boolean r0 = r0 instanceof X.C90235La
            if (r0 == 0) goto L_0x00cd
            r6 = 0
            goto L_0x0075
        L_0x00dd:
            java.util.Iterator r1 = r8.iterator()
        L_0x00e1:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x006b
            java.lang.Object r0 = r1.next()
            X.5J1 r0 = (X.AnonymousClass5J1) r0
            boolean r0 = r0.A08
            if (r0 == 0) goto L_0x00e1
            r9 = 0
            goto L_0x006c
        L_0x00f4:
            java.util.Iterator r6 = r8.iterator()
        L_0x00f8:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0061
            java.lang.Object r1 = r6.next()
            X.5J1 r1 = (X.AnonymousClass5J1) r1
            X.7HD r0 = r1.A00
            X.7yH r0 = r0.A01
            java.lang.String r0 = r0.A00
            boolean r0 = X.AnonymousClass8bQ.A0m(r0)
            if (r0 != 0) goto L_0x011c
            X.8s2 r0 = r1.A05
            boolean r0 = X.C18190wL.A1a(r0)
            if (r0 != 0) goto L_0x011c
            X.5Hp r0 = r1.A02
            if (r0 == 0) goto L_0x00f8
        L_0x011c:
            if (r7 == 0) goto L_0x0128
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L_0x0128
        L_0x0124:
            r20 = 1
            goto L_0x0063
        L_0x0128:
            java.util.Iterator r6 = r8.iterator()
        L_0x012c:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0124
            java.lang.Object r0 = r6.next()
            X.5J1 r0 = (X.AnonymousClass5J1) r0
            X.7HD r0 = r0.A00
            X.7yH r0 = r0.A01
            int r1 = X.C134747yH.A02(r0)
            int r0 = r5.A03
            if (r1 > r0) goto L_0x0061
            goto L_0x012c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass56Z.A03(X.56Z, java.lang.String, X.0YY):void");
    }

    public final void A09() {
        Object value;
        C86074wE r2 = this.A0D;
        do {
            value = r2.getValue();
        } while (!r2.ADi(value, AnonymousClass5IX.A00((KtCSuperShape0S1410000_I2) null, (KtCSuperShape0S1410000_I2) null, (C971468c) null, (AnonymousClass5IX) value, (Integer) null, (String) null, (String) null, (List) null, AnonymousClass0ZV.A00, 8374271, false, false, false, false, false, false, false)));
    }

    public final void A0A() {
        String str;
        if (this.A0B != null) {
            str = "reply";
        } else if (this.A0A != null) {
            str = "quote_post";
        } else {
            str = "new_media";
        }
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A01(this.A06, this.A09), "barcelona_composer_creation_cancel_tap"), 74);
        if (AnonymousClass0wJ.A1U(A0I)) {
            String str2 = C103066Xr.A00.A02.A00;
            if (str2 == null) {
                str2 = "";
            }
            A0I.A0T("nav_chain", str2);
            A0I.A0T("cancel_tap_post_type", str);
            A0I.Bb4();
        }
    }

    public final void A0D(String str) {
        String str2;
        Object obj;
        Object value;
        AnonymousClass5IX r9;
        Integer num;
        C86074wE r4 = this.A0D;
        Iterator it = ((AnonymousClass5IX) r4.getValue()).A0B.iterator();
        while (true) {
            str2 = str;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (AnonymousClass5J1.A01(obj, str2)) {
                break;
            }
        }
        AnonymousClass5J1 r1 = (AnonymousClass5J1) obj;
        if (r1 != null) {
            int length = this.A03 - r1.A00.A01.A00.length();
            boolean z = false;
            if (length <= 50) {
                z = true;
            }
            do {
                value = r4.getValue();
                r9 = (AnonymousClass5IX) value;
                if (z) {
                    num = Integer.valueOf(length);
                } else {
                    num = null;
                }
            } while (!r4.ADi(value, AnonymousClass5IX.A00((KtCSuperShape0S1410000_I2) null, (KtCSuperShape0S1410000_I2) null, (C971468c) null, r9, num, str2, (String) null, (List) null, (List) null, 8387071, false, false, false, false, false, false, false)));
        }
    }

    public final void A0E(boolean z) {
        Object value;
        C86074wE r2 = this.A0D;
        do {
            value = r2.getValue();
        } while (!r2.ADi(value, AnonymousClass5IX.A00((KtCSuperShape0S1410000_I2) null, (KtCSuperShape0S1410000_I2) null, (C971468c) null, (AnonymousClass5IX) value, (Integer) null, (String) null, (String) null, (List) null, (List) null, 4194303, false, false, false, false, false, false, z)));
    }
}
