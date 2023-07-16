package X;

import com.facebook.redex.IDxFlowShape250S0100000_1_I2;
import com.instagram.fanclub.memberlist.repository.CreatorMessagingSelectionScreenRepository;
import com.instagram.service.session.UserSession;
import kotlin.coroutines.jvm.internal.KtSLambdaShape10S0200000_I2_5;
import kotlin.coroutines.jvm.internal.KtSLambdaShape17S0201000_I2_3;

/* renamed from: X.1pk  reason: invalid class name and case insensitive filesystem */
public final class C25971pk extends AnonymousClass10N {
    public C148838sG A00;
    public C148838sG A01;
    public final M5J A02;
    public final CreatorMessagingSelectionScreenRepository A03;
    public final C86064wD A04;
    public final C86074wE A05;
    public final UserSession A06;
    public final C84714tk A07;

    public C25971pk(CreatorMessagingSelectionScreenRepository creatorMessagingSelectionScreenRepository, UserSession userSession) {
        C04220Ms.A0B(creatorMessagingSelectionScreenRepository, 2);
        this.A06 = userSession;
        this.A03 = creatorMessagingSelectionScreenRepository;
        C27442EnY enY = new C27442EnY();
        this.A04 = enY;
        this.A07 = AnonymousClass7C4.A02(enY);
        C27457Enn A0z = C18190wL.A0z(C18180wK.A0X());
        this.A05 = A0z;
        C25817DsW.A06(AnonymousClass3J5.A00(this), AnonymousClass7J0.A01(C18240wQ.A0n(this, (C146958n9) null, 24), creatorMessagingSelectionScreenRepository.A00));
        H1T A0P = AnonymousClass0wJ.A0P(userSession);
        A0P.A0J("direct_v2/get_creator_broadcast_channel_waitlist_status/");
        A0P.A0B(AnonymousClass1S8.class, AnonymousClass3MB.class);
        AnonymousClass3J5.A01(this, new KtSLambdaShape17S0201000_I2_3((C146958n9) null, (AnonymousClass0YP) new KtSLambdaShape10S0200000_I2_5(this, (C146958n9) null, 20), 49), C04220Ms.A0B(C18200wM.A0T(A0P, "user_id", userSession.getUserId()), 0), 34);
        this.A02 = C29110FiC.A00((C27952Ew2) null, new IDxFlowShape250S0100000_1_I2(new C84714tk[]{creatorMessagingSelectionScreenRepository.A01, creatorMessagingSelectionScreenRepository.A05, creatorMessagingSelectionScreenRepository.A02, creatorMessagingSelectionScreenRepository.A06, this.A00, this.A01, A0z}, 13), 3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        if (r5.length() == 0) goto L_0x000c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(boolean r15, java.lang.String r16) {
        /*
            r14 = this;
            r3 = 1
            r5 = r16
            if (r16 == 0) goto L_0x000c
            int r1 = r5.length()
            r0 = 0
            if (r1 != 0) goto L_0x000d
        L_0x000c:
            r0 = 1
        L_0x000d:
            r9 = r0 ^ 1
            r4 = r14
            com.instagram.fanclub.memberlist.repository.CreatorMessagingSelectionScreenRepository r2 = r14.A03
            X.4wG r0 = r2.A03
            java.lang.Object r0 = r0.getValue()
            boolean r1 = X.AnonymousClass0wJ.A1X(r0)
            X.0MJ r7 = new X.0MJ
            r7.<init>()
            X.4wG r0 = r2.A04
            java.lang.Object r0 = r0.getValue()
            r7.A00 = r0
            r6 = 0
            r8 = r15
            if (r15 == 0) goto L_0x007e
            r7.A00 = r6
            X.8sG r0 = r14.A01
            if (r0 == 0) goto L_0x0036
            r0.AC7(r6)
        L_0x0036:
            X.4wE r1 = r14.A00
            X.1pi r0 = X.C25951pi.A00
            r1.CrC(r0)
        L_0x003d:
            if (r9 == 0) goto L_0x005f
            if (r15 == 0) goto L_0x005f
            X.4wE r1 = r14.A00
            X.1pi r0 = X.C25951pi.A00
            r1.CrC(r0)
            X.4qz r1 = X.AnonymousClass3J5.A00(r14)
            r13 = 8
            kotlin.coroutines.jvm.internal.KtSLambdaShape2S1201000_I2_1 r8 = new kotlin.coroutines.jvm.internal.KtSLambdaShape2S1201000_I2_1
            r9 = r7
            r10 = r14
            r11 = r5
            r12 = r6
            r8.<init>(r9, r10, r11, r12, r13)
            r0 = 3
            X.8sG r0 = X.C25237DiI.A00(r6, r6, r8, r1, r0)
        L_0x005c:
            r14.A01 = r0
        L_0x005e:
            return
        L_0x005f:
            if (r3 == 0) goto L_0x005e
            X.4wE r0 = r14.A00
            java.lang.Object r1 = r0.getValue()
            X.1ph r0 = X.C25941ph.A00
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 != 0) goto L_0x005e
            X.4qz r1 = X.AnonymousClass3J5.A00(r14)
            kotlin.coroutines.jvm.internal.KtSLambdaShape0S1421000_I2 r3 = new kotlin.coroutines.jvm.internal.KtSLambdaShape0S1421000_I2
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r0 = 3
            X.8sG r0 = X.C25237DiI.A00(r6, r6, r3, r1, r0)
            goto L_0x005c
        L_0x007e:
            r3 = r1
            goto L_0x003d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25971pk.A03(boolean, java.lang.String):void");
    }
}
