package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.7xv  reason: invalid class name and case insensitive filesystem */
public final class C134577xv implements C39819L1q {
    public final /* synthetic */ AnonymousClass56Z A00;

    public final void BmO() {
    }

    public final void C4N() {
    }

    public final void CR2() {
    }

    public final void CV8() {
    }

    public final void CV9() {
    }

    public C134577xv(AnonymousClass56Z r1) {
        this.A00 = r1;
    }

    public final String AQb() {
        return C18230wP.A0n(this.A00.A06);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x009b, code lost:
        if (r0 == false) goto L_0x009d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void CX0() {
        /*
            r21 = this;
            r0 = r21
            X.56Z r4 = r0.A00
            X.4wG r3 = r4.A0E
            java.lang.Object r0 = r3.getValue()
            X.5IX r0 = (X.AnonymousClass5IX) r0
            java.util.List r0 = r0.A0B
            java.util.ArrayList r6 = X.AnonymousClass0wJ.A0v()
            java.util.Iterator r5 = r0.iterator()
        L_0x0016:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0043
            java.lang.Object r2 = r5.next()
            r1 = r2
            X.5J1 r1 = (X.AnonymousClass5J1) r1
            boolean r0 = r1.A07
            if (r0 != 0) goto L_0x0016
            X.7HD r0 = r1.A00
            X.7yH r0 = r0.A01
            java.lang.String r0 = r0.A00
            boolean r0 = X.AnonymousClass8bQ.A0m(r0)
            if (r0 != 0) goto L_0x003f
            X.8s2 r0 = r1.A05
            boolean r0 = X.C18190wL.A1a(r0)
            if (r0 != 0) goto L_0x003f
            X.5Hp r0 = r1.A02
            if (r0 == 0) goto L_0x0016
        L_0x003f:
            r6.add(r2)
            goto L_0x0016
        L_0x0043:
            java.util.ArrayList r5 = X.AnonymousClass0wJ.A0w(r6)
            java.util.Iterator r9 = r6.iterator()
        L_0x004b:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x00be
            java.lang.Object r6 = r9.next()
            X.5J1 r6 = (X.AnonymousClass5J1) r6
            X.7HD r0 = r6.A00
            X.7yH r0 = r0.A01
            java.lang.String r13 = r0.A00
            X.8s2 r0 = r6.A05
            java.util.ArrayList r7 = X.AnonymousClass0wJ.A0v()
            java.util.Iterator r2 = r0.iterator()
        L_0x0067:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0077
            java.lang.Object r1 = r2.next()
            boolean r0 = r1 instanceof X.C90235La
            X.C18240wQ.A1N(r1, r7, r0)
            goto L_0x0067
        L_0x0077:
            java.util.ArrayList r8 = X.AnonymousClass0wJ.A0v()
            java.util.Iterator r7 = r7.iterator()
        L_0x007f:
            boolean r0 = r7.hasNext()
            r15 = 0
            if (r0 == 0) goto L_0x00a7
            java.lang.Object r1 = r7.next()
            X.8lm r1 = (X.C146178lm) r1
            com.instagram.common.gallery.Medium r2 = r1.Av8()
            if (r2 == 0) goto L_0x007f
            boolean r0 = r1 instanceof X.C90255Lc
            if (r0 == 0) goto L_0x009d
            X.5Lc r1 = (X.C90255Lc) r1
            boolean r0 = r1.A05
            r1 = 1
            if (r0 != 0) goto L_0x009e
        L_0x009d:
            r1 = 0
        L_0x009e:
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0110000_I2 r0 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0110000_I2
            r0.<init>((com.instagram.common.gallery.Medium) r2, (boolean) r1)
            r8.add(r0)
            goto L_0x007f
        L_0x00a7:
            X.8s2 r16 = X.AnonymousClass7C0.A00(r8)
            java.lang.String r14 = r4.A0C
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S3200000_I2 r11 = r6.A01
            if (r11 == 0) goto L_0x00b3
            java.lang.String r15 = r11.A04
        L_0x00b3:
            X.5Hp r12 = r6.A02
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S3300000_I2 r10 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S3300000_I2
            r10.<init>((com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S3200000_I2) r11, (X.C89935Hp) r12, (java.lang.String) r13, (java.lang.String) r14, (java.lang.String) r15, (java.util.List) r16)
            r5.add(r10)
            goto L_0x004b
        L_0x00be:
            X.EAS r7 = r4.A05
            java.lang.Object r0 = r3.getValue()
            X.5IX r0 = (X.AnonymousClass5IX) r0
            X.68c r6 = r0.A02
            java.lang.String r3 = r4.A0B
            r14 = 0
            r13 = 1
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x00e8
            X.4qz r2 = r7.A02
            r1 = 0
            kotlin.coroutines.jvm.internal.KtSLambdaShape1S1300000_I2 r15 = new kotlin.coroutines.jvm.internal.KtSLambdaShape1S1300000_I2
            r16 = r6
            r17 = r7
            r18 = r3
            r19 = r5
            r20 = r1
            r15.<init>((X.C971468c) r16, (X.EAS) r17, (java.lang.String) r18, (java.util.List) r19, (X.C146958n9) r20)
            r0 = 3
            X.C25237DiI.A00(r1, r1, r15, r2, r0)
        L_0x00e8:
            X.4wE r2 = r4.A0D
        L_0x00ea:
            java.lang.Object r1 = r2.getValue()
            r6 = r1
            X.5IX r6 = (X.AnonymousClass5IX) r6
            r3 = 0
            r12 = 8388605(0x7ffffd, float:1.175494E-38)
            r4 = r3
            r5 = r3
            r7 = r3
            r8 = r3
            r9 = r3
            r10 = r3
            r11 = r3
            r15 = r14
            r16 = r14
            r17 = r14
            r18 = r14
            r19 = r14
            X.5IX r0 = X.AnonymousClass5IX.A00(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            boolean r0 = r2.ADi(r1, r0)
            if (r0 == 0) goto L_0x00ea
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C134577xv.CX0():void");
    }

    public final List getContent() {
        List A01 = AnonymousClass5IX.A01(this.A00);
        ArrayList<AnonymousClass5J1> A0v = AnonymousClass0wJ.A0v();
        for (Object next : A01) {
            if (!((AnonymousClass5J1) next).A07) {
                A0v.add(next);
            }
        }
        ArrayList A0w = AnonymousClass0wJ.A0w(A0v);
        for (AnonymousClass5J1 r0 : A0v) {
            A0w.add(r0.A00.A01.A00);
        }
        return A0w;
    }
}
