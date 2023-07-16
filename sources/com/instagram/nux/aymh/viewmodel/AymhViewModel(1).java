package com.instagram.nux.aymh.viewmodel;

import X.AnonymousClass0OY;
import X.AnonymousClass38Z;
import X.AnonymousClass3J5;
import X.AnonymousClass3R5;
import X.AnonymousClass3R6;
import X.AnonymousClass3Tz;
import X.C04220Ms;
import X.C04530Oa;
import X.C07530bf;
import X.C09120et;
import X.C146958n9;
import X.C18190wL;
import X.C18230wP;
import X.C209216q;
import X.C25237DiI;
import X.C27441EnX;
import X.C27952Ew2;
import X.C62483a6;
import X.C62793ak;
import X.C62903b6;
import X.C63533hk;
import X.C76384dw;
import X.C76394dx;
import X.C83224qz;
import X.C86064wD;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1200000_I2;
import kotlin.coroutines.jvm.internal.KtSLambdaShape2S0601000_I2;

public final class AymhViewModel extends C62793ak {
    public C209216q A00;
    public final AnonymousClass3R5 A01;
    public final AnonymousClass3R6 A02;
    public final AnonymousClass3Tz A03;
    public final C62483a6 A04;
    public final AggregateAccountLoginHandler A05;
    public final C09120et A06;
    public final C63533hk A07;
    public final C04530Oa A08 = AnonymousClass0OY.A02(C76384dw.A00);
    public final C04530Oa A09 = C18190wL.A0x(this, 38);
    public final C04530Oa A0A = AnonymousClass0OY.A02(C76394dx.A00);
    public final C86064wD A0B = new C27441EnX();

    public final void A01(KtCSuperShape0S1200000_I2 ktCSuperShape0S1200000_I2, C62903b6 r11, C209216q r12, C07530bf r13) {
        C04220Ms.A0B(r13, 1);
        C18230wP.A0J(this.A0A).A0H(new AnonymousClass38Z(2131835972, true));
        C83224qz A002 = AnonymousClass3J5.A00(this);
        KtCSuperShape0S1200000_I2 ktCSuperShape0S1200000_I22 = ktCSuperShape0S1200000_I2;
        C62903b6 r4 = r11;
        C209216q r5 = r12;
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape2S0601000_I2(ktCSuperShape0S1200000_I22, r4, r5, this, r13, (C146958n9) null), A002, 3);
    }

    public AymhViewModel() {
        AnonymousClass3R5 r6 = AnonymousClass3R5.A00;
        AnonymousClass3Tz r5 = AnonymousClass3Tz.A00;
        AnonymousClass3R6 r4 = AnonymousClass3R6.A00;
        C62483a6 r3 = C62483a6.A00;
        AggregateAccountLoginHandler aggregateAccountLoginHandler = new AggregateAccountLoginHandler(r5, r3);
        C63533hk A012 = C63533hk.A01();
        C09120et A0X = C18190wL.A0X();
        this.A01 = r6;
        this.A03 = r5;
        this.A02 = r4;
        this.A04 = r3;
        this.A05 = aggregateAccountLoginHandler;
        this.A07 = A012;
        this.A06 = A0X;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(X.C62903b6 r7, com.instagram.nux.aymh.viewmodel.AymhViewModel r8, X.C07530bf r9, X.C146958n9 r10) {
        /*
            r3 = 15
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape9S0201000_I2_7.A00(r3, r10)
            if (r0 == 0) goto L_0x0055
            r5 = r10
            kotlin.coroutines.jvm.internal.KtCImplShape9S0201000_I2_7 r5 = (kotlin.coroutines.jvm.internal.KtCImplShape9S0201000_I2_7) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0055
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r5.A01
            X.D0E r6 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r5.A00
            r4 = 1
            if (r0 == 0) goto L_0x0027
            if (r0 != r4) goto L_0x005d
            X.AnonymousClass0OU.A00(r1)
        L_0x0024:
            kotlin.Unit r6 = kotlin.Unit.A00
            return r6
        L_0x0027:
            X.AnonymousClass0OU.A00(r1)
            boolean r0 = r7 instanceof X.AnonymousClass1jA
            if (r0 != 0) goto L_0x0024
            boolean r0 = r7 instanceof X.AnonymousClass1jB
            if (r0 == 0) goto L_0x0062
            X.1jB r7 = (X.AnonymousClass1jB) r7
            java.lang.Object r3 = r7.A00
            X.D3n r3 = (X.C23962D3n) r3
            java.lang.Throwable r0 = r3.getCause()
            boolean r0 = r0 instanceof X.C93185l9
            if (r0 == 0) goto L_0x0024
            X.4wD r2 = r8.A0B
            X.4Eq r1 = new X.4Eq
            r1.<init>(r3, r8, r9)
            X.4En r0 = new X.4En
            r0.<init>(r1)
            r5.A00 = r4
            java.lang.Object r0 = r2.Cgt(r0, r5)
            if (r0 != r6) goto L_0x0024
            return r6
        L_0x0055:
            r0 = 42
            kotlin.coroutines.jvm.internal.KtCImplShape9S0201000_I2_7 r5 = new kotlin.coroutines.jvm.internal.KtCImplShape9S0201000_I2_7
            r5.<init>(r8, r10, r3, r0)
            goto L_0x0016
        L_0x005d:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x0062:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.nux.aymh.viewmodel.AymhViewModel.A00(X.3b6, com.instagram.nux.aymh.viewmodel.AymhViewModel, X.0bf, X.8n9):java.lang.Object");
    }
}
