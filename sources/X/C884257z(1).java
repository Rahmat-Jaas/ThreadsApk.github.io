package X;

import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2210000_I2;
import com.instagram.service.session.UserSession;
import kotlin.coroutines.jvm.internal.KtSLambdaShape0S1221000_I2;

/* renamed from: X.57z  reason: invalid class name and case insensitive filesystem */
public final class C884257z extends C62793ak {
    public C148838sG A00;
    public C148838sG A01;
    public final C120957Dj A02;
    public final UserSession A03;
    public final C86074wE A04;
    public final C86094wG A05;

    public C884257z(C120957Dj r6, UserSession userSession) {
        this.A03 = userSession;
        this.A02 = r6;
        C27457Enn A0z = C18190wL.A0z(new KtCSuperShape0S2210000_I2());
        this.A04 = A0z;
        this.A05 = A0z;
        A00(this, C968466x.Following, true, false);
        A00(this, C968466x.Pending, true, false);
        C25237DiI.A00((Integer) null, (C27952Ew2) null, C86154wM.A0x(this, (C146958n9) null, 10), AnonymousClass3J5.A00(this), 3);
    }

    public static final void A00(C884257z r14, C968466x r15, boolean z, boolean z2) {
        C968466x r4 = r15;
        int ordinal = r15.ordinal();
        C884257z r3 = r14;
        boolean z3 = z;
        boolean z4 = z2;
        if (ordinal == 0) {
            String str = ((KtCSuperShape0S2210000_I2) r14.A05.getValue()).A02;
            r3.A00 = C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape0S1221000_I2(r3, r4, str, (C146958n9) null, 0, z4, z3), AnonymousClass3J5.A00(r14), 3);
        } else if (ordinal == 1) {
            String str2 = ((KtCSuperShape0S2210000_I2) r14.A05.getValue()).A03;
            r14.A01 = C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape0S1221000_I2(r3, r4, str2, (C146958n9) null, 1, z4, z3), AnonymousClass3J5.A00(r14), 3);
        } else {
            throw AnonymousClass4VZ.A00();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(X.C968466x r18, java.lang.String r19) {
        /*
            r17 = this;
            r3 = 0
            r4 = r18
            r14 = r19
            boolean r2 = X.AnonymousClass0wJ.A1Z(r14, r4)
            int r1 = r4.ordinal()
            r6 = 0
            r5 = r17
            if (r1 == r3) goto L_0x001e
            if (r1 == r2) goto L_0x001b
            if (r1 == r2) goto L_0x008b
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x001b:
            X.8sG r0 = r5.A01
            goto L_0x0020
        L_0x001e:
            X.8sG r0 = r5.A00
        L_0x0020:
            if (r0 == 0) goto L_0x0025
            r0.AC7(r6)
        L_0x0025:
            if (r1 != r3) goto L_0x008b
            X.4wG r0 = r5.A05
            java.lang.Object r0 = r0.getValue()
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2210000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2210000_I2) r0
            java.lang.String r0 = r0.A02
        L_0x0031:
            java.lang.String r9 = X.C86134wK.A0q(r0, r3)
            X.4wE r7 = r5.A04
        L_0x0037:
            java.lang.Object r6 = r7.getValue()
            r0 = r6
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2210000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2210000_I2) r0
            if (r1 == r3) goto L_0x006f
            java.lang.String r13 = r0.A02
            java.lang.Object r11 = r0.A00
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1200000_I2 r11 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1200000_I2) r11
            java.lang.Object r12 = r0.A01
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1200000_I2 r12 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1200000_I2) r12
            boolean r15 = r0.A04
            X.C04220Ms.A0B(r13, r3)
            X.AnonymousClass0wJ.A1Q(r11, r12)
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2210000_I2 r10 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2210000_I2
            r10.<init>((com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1200000_I2) r11, (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1200000_I2) r12, (java.lang.String) r13, (java.lang.String) r14, (boolean) r15)
        L_0x0057:
            boolean r0 = r7.ADi(r6, r10)
            if (r0 == 0) goto L_0x0037
            java.lang.String r1 = X.AnonymousClass0hA.A02(r14)
            java.lang.String r0 = X.AnonymousClass0hA.A02(r9)
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 != 0) goto L_0x006e
            A00(r5, r4, r2, r2)
        L_0x006e:
            return
        L_0x006f:
            java.lang.String r8 = r0.A03
            java.lang.Object r12 = r0.A00
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1200000_I2 r12 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1200000_I2) r12
            java.lang.Object r13 = r0.A01
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1200000_I2 r13 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1200000_I2) r13
            boolean r0 = r0.A04
            X.C04220Ms.A0B(r8, r2)
            X.AnonymousClass0wJ.A1Q(r12, r13)
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2210000_I2 r10 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2210000_I2
            r11 = r10
            r15 = r8
            r16 = r0
            r11.<init>((com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1200000_I2) r12, (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1200000_I2) r13, (java.lang.String) r14, (java.lang.String) r15, (boolean) r16)
            goto L_0x0057
        L_0x008b:
            X.4wG r0 = r5.A05
            java.lang.Object r0 = r0.getValue()
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2210000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2210000_I2) r0
            java.lang.String r0 = r0.A03
            goto L_0x0031
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C884257z.A01(X.66x, java.lang.String):void");
    }
}
