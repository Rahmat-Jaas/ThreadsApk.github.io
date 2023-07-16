package com.instagram.barcelona.process.main;

import X.C10620ie;
import X.C16070sR;
import X.C30916Gb1;
import X.C30975Gcb;
import X.C62503a9;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;

public class BarcelonaApplicationForMainProcess extends C10620ie implements C16070sR {
    public static boolean A01;
    public final Context A00;

    public BarcelonaApplicationForMainProcess(Context context) {
        super(context);
        synchronized (BarcelonaApplicationForMainProcess.class) {
            if (!A01) {
                A01 = true;
            } else {
                throw new IllegalStateException("Multiple instances of the Application object were created.");
            }
        }
        this.A00 = context;
    }

    public final void A02(Configuration configuration) {
        C62503a9.A00();
        C30975Gcb.A02(this.A00.getApplicationContext(), configuration.uiMode & 48);
    }

    public final Resources AzU() {
        if (C30916Gb1.A03()) {
            return C30916Gb1.A02().A04();
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x01db, code lost:
        if (X.C07960cV.A05(X.AnonymousClass0e5.A00(36311100924363133L)) == false) goto L_0x01dd;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(java.lang.String r120, long r121, long r123, long r125, long r127) {
        /*
            r119 = this;
            r7 = r119
            android.content.Context r3 = r7.A00
            X.AnonymousClass2FQ.A00(r3)
            X.C29291Fli.A00(r3)
            r0 = 5
            X.AnonymousClass0LU.A00(r0)
            X.C120947Df.A00()
            X.C37312JpF.A03(r3)
            X.C10600ic.A00 = r3
            com.facebook.common.time.AwakeTimeSinceBootClock r55 = com.facebook.common.time.AwakeTimeSinceBootClock.INSTANCE
            long r4 = r55.now()
            X.0bW r2 = new X.0bW
            r2.<init>()
            X.IaP r54 = new X.IaP
            r0 = r54
            r0.<init>(r4)
            X.0lS r6 = X.C12170lS.A00
            X.0lU r1 = X.C12190lU.A00
            X.1UW r53 = new X.1UW
            r0 = r53
            r0.<init>(r3, r6, r1)
            X.1UZ r52 = new X.1UZ
            r0 = r52
            r0.<init>(r3)
            X.1Ud r1 = new X.1Ud
            r1.<init>(r0, r7, r2)
            X.IaZ r66 = new X.IaZ
            r7 = r121
            r14 = r123
            r16 = r125
            r18 = r127
            r9 = r66
            r10 = r3
            r11 = r1
            r12 = r7
            r20 = r4
            r9.<init>(r10, r11, r12, r14, r16, r18, r20)
            X.1UY r51 = new X.1UY
            r0 = r51
            r0.<init>(r3, r1)
            X.1UQ r85 = new X.1UQ
            r85.<init>()
            X.5uV r50 = new X.5uV
            r0 = r50
            r0.<init>(r3, r1)
            r4 = 36320850500655398(0x81099f00081926, double:3.032790336715856E-306)
            X.0e5 r0 = X.AnonymousClass0e5.A00(r4)
            boolean r4 = X.C07960cV.A05(r0)
            X.FNn r6 = new X.FNn
            r6.<init>(r3, r1, r4)
            X.5uU r49 = new X.5uU
            r0 = r49
            r0.<init>(r6, r4)
            X.5uW r4 = new X.5uW
            r4.<init>(r3, r6)
            X.IaV r48 = new X.IaV
            r0 = r48
            r0.<init>(r3, r2)
            X.IaJ r68 = new X.IaJ
            r68.<init>()
            X.FNj r47 = new X.FNj
            r0 = r47
            r0.<init>(r3, r1)
            X.C30593GMf.A01()
            r9 = 36324930719130404(0x810d5500012324, double:3.035370683309171E-306)
            X.0e5 r0 = X.AnonymousClass0e5.A00(r9)
            boolean r10 = X.C07960cV.A05(r0)
            X.Gb1 r5 = X.C30593GMf.A00(r3)
            X.1Uc r46 = new X.1Uc
            r0 = r46
            r0.<init>(r1, r5, r10)
            X.Gb1 r9 = X.C30593GMf.A00(r3)
            r5 = r10 ^ 1
            X.1Uc r45 = new X.1Uc
            r0 = r45
            r0.<init>(r1, r9, r5)
            X.FNe r60 = new X.FNe
            r60.<init>()
            X.0dU r56 = new X.0dU
            r56.<init>()
            X.1UV r44 = new X.1UV
            r0 = r44
            r0.<init>(r3)
            X.1Ua r43 = new X.1Ua
            r0 = r43
            r0.<init>(r3, r1)
            X.FNg r42 = new X.FNg
            r0 = r42
            r0.<init>(r3)
            r9 = 36320880566475148(0x8109a60018198c, double:3.032809350461331E-306)
            X.0e5 r0 = X.AnonymousClass0e5.A00(r9)
            boolean r5 = X.C07960cV.A05(r0)
            X.5uR r41 = new X.5uR
            r0 = r41
            r0.<init>(r5)
            X.IaY r40 = new X.IaY
            r0 = r40
            r0.<init>(r3)
            X.5uY r83 = new X.5uY
            r83.<init>()
            X.FNi r39 = new X.FNi
            r0 = r39
            r0.<init>(r3, r4, r1)
            X.5uQ r38 = new X.5uQ
            r0 = r38
            r0.<init>(r3)
            X.IaK r37 = new X.IaK
            r0 = r37
            r0.<init>(r1)
            X.IaQ r36 = new X.IaQ
            r0 = r36
            r0.<init>(r3, r1)
            X.FNf r92 = new X.FNf
            r92.<init>()
            X.CPu r93 = new X.CPu
            r93.<init>()
            X.IaT r35 = new X.IaT
            r0 = r35
            r0.<init>(r3, r1)
            X.Iad r34 = new X.Iad
            r0 = r34
            r0.<init>(r1, r2)
            X.IaW r33 = new X.IaW
            r0 = r33
            r0.<init>(r1, r7)
            X.Iab r32 = new X.Iab
            r0 = r32
            r0.<init>(r1)
            r7 = 2342163859714152740(0x2081099f00051924, double:4.066307032480505E-152)
            X.0e5 r0 = X.AnonymousClass0e5.A00(r7)
            boolean r5 = X.C07960cV.A05(r0)
            X.IaX r31 = new X.IaX
            r0 = r31
            r0.<init>(r3, r4, r1, r5)
            r5 = r5 ^ 1
            X.IaX r30 = new X.IaX
            r0 = r30
            r0.<init>(r3, r4, r1, r5)
            X.1US r102 = new X.1US
            r102.<init>()
            X.IaN r29 = new X.IaN
            r0 = r29
            r0.<init>(r3)
            android.view.Choreographer r5 = android.view.Choreographer.getInstance()
            X.1Ue r28 = new X.1Ue
            r0 = r28
            r0.<init>(r3, r5, r1)
            X.FNh r27 = new X.FNh
            r0 = r27
            r0.<init>(r3)
            X.Iaa r26 = new X.Iaa
            r0 = r26
            r0.<init>(r3)
            X.CPv r25 = new X.CPv
            r0 = r25
            r0.<init>(r3, r1, r2)
            X.FNm r24 = new X.FNm
            r0 = r24
            r0.<init>(r3, r1, r2)
            X.5uP r109 = new X.5uP
            r109.<init>()
            X.0n6 r105 = new X.0n6
            r105.<init>()
            X.FNl r23 = new X.FNl
            r0 = r23
            r0.<init>(r3, r1)
            X.IaI r89 = new X.IaI
            r89.<init>()
            X.CPw r22 = new X.CPw
            r0 = r22
            r0.<init>(r3)
            X.1UU r21 = new X.1UU
            r0 = r21
            r0.<init>(r3)
            X.1UT r20 = new X.1UT
            r0 = r20
            r0.<init>(r1)
            X.IaO r19 = new X.IaO
            r0 = r19
            r0.<init>(r3)
            X.1UX r15 = new X.1UX
            r15.<init>(r3, r1)
            boolean r0 = com.facebook.endtoend.EndToEnd.isRunningEndToEndTest()
            if (r0 != 0) goto L_0x01dd
            r7 = 36311100924363133(0x8100c10000017d, double:3.026624665410235E-306)
            X.0e5 r0 = X.AnonymousClass0e5.A00(r7)
            boolean r0 = X.C07960cV.A05(r0)
            r5 = 1
            if (r0 != 0) goto L_0x01de
        L_0x01dd:
            r5 = 0
        L_0x01de:
            X.0dB r18 = new X.0dB
            r0 = r18
            r0.<init>(r5)
            X.5uT r14 = new X.5uT
            r14.<init>(r3, r1)
            X.IaL r17 = new X.IaL
            r0 = r17
            r0.<init>(r3)
            X.IaR r16 = new X.IaR
            r0 = r16
            r0.<init>(r3, r1)
            X.IaS r5 = new X.IaS
            r5.<init>(r3, r1)
            X.1Ub r13 = new X.1Ub
            r13.<init>(r1)
            X.IaM r12 = new X.IaM
            r12.<init>(r1)
            X.IaU r11 = new X.IaU
            r11.<init>(r3, r1)
            X.5uS r10 = new X.5uS
            r10.<init>(r3, r1)
            X.5uX r9 = new X.5uX
            r9.<init>(r3, r1, r2)
            X.1UR r95 = new X.1UR
            r95.<init>()
            X.Iac r2 = new X.Iac
            r2.<init>(r1)
            long r7 = r55.now()
            r0 = 64
            X.4TI[] r0 = new X.AnonymousClass4TI[r0]
            r65 = r32
            r67 = r48
            r69 = r44
            r70 = r43
            r71 = r16
            r72 = r4
            r73 = r39
            r74 = r31
            r75 = r51
            r76 = r23
            r77 = r2
            r78 = r46
            r79 = r49
            r80 = r30
            r81 = r5
            r82 = r37
            r57 = r40
            r58 = r41
            r59 = r17
            r61 = r54
            r62 = r52
            r63 = r1
            r64 = r6
            X.4TI[] r4 = new X.AnonymousClass4TI[]{r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82}
            r3 = 0
            r2 = 27
            java.lang.System.arraycopy(r4, r3, r0, r3, r2)
            r82 = r42
            r84 = r15
            r86 = r27
            r87 = r45
            r88 = r26
            r90 = r25
            r91 = r36
            r94 = r20
            r96 = r10
            r97 = r24
            r98 = r34
            r99 = r33
            r100 = r35
            r101 = r21
            r103 = r50
            r104 = r29
            r106 = r28
            r107 = r47
            r108 = r53
            X.4TI[] r4 = new X.AnonymousClass4TI[]{r82, r83, r84, r85, r86, r87, r88, r89, r90, r91, r92, r93, r94, r95, r96, r97, r98, r99, r100, r101, r102, r103, r104, r105, r106, r107, r108}
            java.lang.System.arraycopy(r4, r3, r0, r2, r2)
            r110 = r22
            r111 = r13
            r112 = r19
            r113 = r18
            r114 = r14
            r115 = r12
            r116 = r11
            r117 = r9
            r118 = r38
            X.4TI[] r5 = new X.AnonymousClass4TI[]{r109, r110, r111, r112, r113, r114, r115, r116, r117, r118}
            r4 = 54
            r2 = 10
            java.lang.System.arraycopy(r5, r3, r0, r4, r2)
            X.AnonymousClass2FP.A00(r0)
            X.3YX r0 = X.AnonymousClass3YX.A00()
            r0.A01()
            X.KJ8 r0 = X.KJ8.A00()
            r0.A04(r7)
            X.KJ8 r0 = X.KJ8.A00()
            long r2 = r56.A02()
            long r4 = r56.A01()
            r0.A0C(r2, r4)
            X.KJ8 r0 = X.KJ8.A00()
            long r4 = r41.A02()
            long r2 = r41.A01()
            r0.A08(r4, r2)
            X.KJ8 r0 = X.KJ8.A00()
            long r4 = r17.A02()
            long r2 = r17.A01()
            r0.A06(r4, r2)
            X.KJ8 r0 = X.KJ8.A00()
            long r4 = r16.A02()
            long r2 = r16.A01()
            r0.A07(r4, r2)
            X.KJ8 r0 = X.KJ8.A00()
            long r4 = r60.A02()
            long r2 = r60.A01()
            r0.A05(r4, r2)
            X.KJ8 r0 = X.KJ8.A00()
            long r4 = r54.A02()
            long r2 = r54.A01()
            r0.A0E(r4, r2)
            X.KJ8 r0 = X.KJ8.A00()
            long r4 = r52.A02()
            long r2 = r52.A01()
            r0.A0A(r4, r2)
            X.KJ8 r4 = X.KJ8.A00()
            long r2 = r1.A02()
            long r0 = r1.A01()
            r4.A0D(r2, r0)
            X.KJ8 r4 = X.KJ8.A00()
            long r2 = r6.A02()
            long r0 = r6.A01()
            r4.A0B(r2, r0)
            X.KJ8 r4 = X.KJ8.A00()
            long r2 = r32.A02()
            long r0 = r32.A01()
            r4.A09(r2, r0)
            X.KJ8 r0 = X.KJ8.A00()
            r0.A03()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.barcelona.process.main.BarcelonaApplicationForMainProcess.A03(java.lang.String, long, long, long, long):void");
    }
}
