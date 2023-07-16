package X;

import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.6FN  reason: invalid class name */
public final class AnonymousClass6FN {
    public static final C121807If A00(C121807If r37, AnonymousClass69J r38) {
        int i;
        int i2;
        float f;
        int i3;
        C121807If r13 = r37;
        boolean A1Z = AnonymousClass0wJ.A1Z(r13, r38);
        AnonymousClass7F0 r11 = r13.A02;
        C147038nH r10 = r11.A0D;
        C138038Fy r1 = C138038Fy.A00;
        if (r10.equals(AnonymousClass7ZF.A00)) {
            r10 = (C147038nH) r1.invoke();
        }
        long j = r11.A01;
        if (AnonymousClass7Hi.A04(j)) {
            j = C103686aY.A02;
        }
        C134817yQ r9 = r11.A09;
        if (r9 == null) {
            r9 = C134817yQ.A04;
        }
        C114236su r0 = r11.A07;
        if (r0 != null) {
            i = r0.A00;
        } else {
            i = 0;
        }
        C114236su r02 = new C114236su(i);
        C114246sv r03 = r11.A08;
        if (r03 != null) {
            i2 = r03.A00;
        } else {
            i2 = 1;
        }
        C114246sv r04 = new C114246sv(i2);
        C1188372l r8 = r11.A06;
        if (r8 == null) {
            r8 = C1188372l.A00;
        }
        String str = r11.A0F;
        if (str == null) {
            str = "";
        }
        long j2 = r11.A02;
        if (AnonymousClass7Hi.A04(j2)) {
            j2 = C103686aY.A03;
        }
        C114266sx r05 = r11.A0B;
        if (r05 != null) {
            f = r05.A00;
        } else {
            f = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        }
        C114266sx r06 = new C114266sx(f);
        C121147Ei r6 = r11.A0E;
        if (r6 == null) {
            r6 = C121147Ei.A02;
        }
        AnonymousClass83Y r5 = r11.A0A;
        if (r5 == null) {
            r5 = C102886Wx.A00.Ab9();
        }
        long j3 = r11.A00;
        if (j3 == AnonymousClass7KE.A06) {
            j3 = C103686aY.A00;
        }
        AnonymousClass79I r2 = r11.A0C;
        if (r2 == null) {
            r2 = AnonymousClass79I.A02;
        }
        C1201679b r12 = r11.A03;
        if (r12 == null) {
            r12 = C1201679b.A03;
        }
        C113216qw r22 = r11.A05;
        C98126Eh r07 = r11.A04;
        if (r07 == null) {
            r07 = C877353x.A00;
        }
        C1201679b r19 = r12;
        AnonymousClass7F0 r18 = new AnonymousClass7F0(r19, r07, r22, r8, r02, r04, r9, r5, r06, r2, r10, r6, str, j, j2, j3);
        C121237Ex r82 = r13.A00;
        C121117Ee A01 = C121117Ee.A01(r82.A02);
        C114326t3 r08 = r82.A09;
        if (r08 == null) {
            int ordinal = r38.ordinal();
            if (ordinal == 0) {
                i3 = 1;
            } else if (ordinal == A1Z) {
                i3 = 2;
            } else {
                throw AnonymousClass4VZ.A00();
            }
        } else {
            i3 = r08.A00;
            if (i3 == 3) {
                int ordinal2 = r38.ordinal();
                if (ordinal2 == 0) {
                    i3 = 4;
                } else if (ordinal2 == A1Z) {
                    i3 = 5;
                } else {
                    throw AnonymousClass4VZ.A00();
                }
            }
        }
        C114326t3 r92 = new C114326t3(i3);
        long j4 = r82.A03;
        if (AnonymousClass7Hi.A04(j4)) {
            j4 = C102856Wu.A00;
        }
        AnonymousClass79W r7 = r82.A0A;
        if (r7 == null) {
            r7 = AnonymousClass79W.A02;
        }
        AnonymousClass79A r62 = r82.A04;
        AnonymousClass795 r52 = r82.A07;
        C114316t2 r4 = new C114316t2(r82.A01);
        C114276sy r3 = new C114276sy(r82.A00);
        AnonymousClass79X r09 = r82.A0B;
        if (r09 == null) {
            r09 = AnonymousClass79X.A02;
        }
        return new C121807If(new C121237Ex(r62, r3, r4, r52, A01, r92, r7, r09, j4), r13.A01, r18);
    }
}
