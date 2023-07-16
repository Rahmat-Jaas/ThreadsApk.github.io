package com.instagram.fanclub.memberlist.viewmodel;

import X.AnonymousClass006;
import X.AnonymousClass0ZV;
import X.AnonymousClass10N;
import X.AnonymousClass194;
import X.AnonymousClass1kC;
import X.AnonymousClass1lA;
import X.AnonymousClass2M0;
import X.AnonymousClass2O7;
import X.AnonymousClass3J5;
import X.AnonymousClass495;
import X.AnonymousClass49J;
import X.AnonymousClass4CC;
import X.AnonymousClass6W3;
import X.AnonymousClass74I;
import X.AnonymousClass7C4;
import X.AnonymousClass7J0;
import X.AnonymousClass84Y;
import X.C04220Ms;
import X.C146958n9;
import X.C18180wK;
import X.C18190wL;
import X.C18240wQ;
import X.C25237DiI;
import X.C25753DrP;
import X.C25817DsW;
import X.C27442EnY;
import X.C27457Enn;
import X.C27952Ew2;
import X.C57943Dd;
import X.C84714tk;
import X.C86064wD;
import X.C86074wE;
import X.C86094wG;
import android.view.View;
import com.facebook.redex.IDxFlowShape93S0200000_1_I2;
import com.instagram.fanclub.memberlist.repository.FanClubMemberListRepository;
import com.instagram.service.session.UserSession;

public final class FanClubMemberListViewModel extends AnonymousClass10N {
    public final AnonymousClass49J A00;
    public final AnonymousClass495 A01;
    public final AnonymousClass1lA A02 = new AnonymousClass1lA(AnonymousClass006.A00);
    public final AnonymousClass194 A03 = new AnonymousClass194((View.OnClickListener) null, AnonymousClass1kC.A00(new Object[0], 2131837637), (C57943Dd) null);
    public final FanClubMemberListRepository A04;
    public final UserSession A05;
    public final String A06;
    public final C86064wD A07;
    public final C84714tk A08;
    public final C86074wE A09;
    public final C86074wE A0A;
    public final C86074wE A0B;
    public final C86074wE A0C;
    public final C86074wE A0D;
    public final C86074wE A0E;
    public final C86094wG A0F;

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.instagram.fanclub.memberlist.viewmodel.FanClubMemberListViewModel r7, X.C146958n9 r8) {
        /*
            r3 = 42
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape3S0301000_I2_2.A00(r3, r8)
            if (r0 == 0) goto L_0x0089
            r5 = r8
            kotlin.coroutines.jvm.internal.KtCImplShape3S0301000_I2_2 r5 = (kotlin.coroutines.jvm.internal.KtCImplShape3S0301000_I2_2) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0089
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r5.A02
            X.D0E r4 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r5.A00
            r3 = 1
            if (r0 == 0) goto L_0x0072
            if (r0 != r3) goto L_0x008f
            java.lang.Object r7 = r5.A01
            com.instagram.fanclub.memberlist.viewmodel.FanClubMemberListViewModel r7 = (com.instagram.fanclub.memberlist.viewmodel.FanClubMemberListViewModel) r7
            X.AnonymousClass0OU.A00(r1)
        L_0x0028:
            X.19M r1 = (X.AnonymousClass19M) r1
            if (r1 == 0) goto L_0x0059
            boolean r2 = r1.A02
            java.lang.String r1 = r7.A06
            java.lang.String r0 = "PROFILE"
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 == 0) goto L_0x005f
            X.49J r7 = r7.A00
            java.lang.String r0 = X.C18180wK.A0e()
            r7.A00 = r0
            X.29s r6 = X.C319829s.PROFILE_SUBSCRIPTION
        L_0x0042:
            X.29t r4 = X.C319929t.SUBSCRIBERS_LIST_RENDERED
            X.28X r3 = X.AnonymousClass28X.TAP
            X.29u r5 = X.C320029u.SUBSCRIBERS_LIST_BUTTON
            if (r2 == 0) goto L_0x005c
            java.lang.String r1 = "True"
        L_0x004c:
            java.lang.String r0 = "is_list_empty"
            kotlin.Pair r0 = X.C18180wK.A0p(r0, r1)
            java.util.Map r8 = X.AnonymousClass4WK.A0O(r0)
            X.AnonymousClass49J.A00(r3, r4, r5, r6, r7, r8)
        L_0x0059:
            kotlin.Unit r4 = kotlin.Unit.A00
            return r4
        L_0x005c:
            java.lang.String r1 = "False"
            goto L_0x004c
        L_0x005f:
            java.lang.String r0 = "SETTINGS"
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 == 0) goto L_0x0059
            X.49J r7 = r7.A00
            java.lang.String r0 = X.C18180wK.A0e()
            r7.A00 = r0
            X.29s r6 = X.C319829s.PROFESSIONAL_HOME_SUBSCRIPTIONS
            goto L_0x0042
        L_0x0072:
            X.AnonymousClass0OU.A00(r1)
            X.4wG r2 = r7.A0F
            r1 = 14
            com.facebook.redex.IDxFlowShape250S0100000_1_I2 r0 = new com.facebook.redex.IDxFlowShape250S0100000_1_I2
            r0.<init>(r2, r1)
            r5.A01 = r7
            r5.A00 = r3
            java.lang.Object r1 = X.C25752DrO.A03(r5, r0)
            if (r1 != r4) goto L_0x0028
            return r4
        L_0x0089:
            kotlin.coroutines.jvm.internal.KtCImplShape3S0301000_I2_2 r5 = new kotlin.coroutines.jvm.internal.KtCImplShape3S0301000_I2_2
            r5.<init>(r7, r8, r3)
            goto L_0x0016
        L_0x008f:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.memberlist.viewmodel.FanClubMemberListViewModel.A00(com.instagram.fanclub.memberlist.viewmodel.FanClubMemberListViewModel, X.8n9):java.lang.Object");
    }

    public /* synthetic */ FanClubMemberListViewModel(FanClubMemberListRepository fanClubMemberListRepository, UserSession userSession, String str) {
        AnonymousClass495 A002 = AnonymousClass2O7.A00(userSession);
        AnonymousClass49J A003 = AnonymousClass2M0.A00(userSession);
        C04220Ms.A0B(fanClubMemberListRepository, 1);
        C18180wK.A1R(A002, A003);
        this.A04 = fanClubMemberListRepository;
        this.A05 = userSession;
        this.A06 = str;
        this.A01 = A002;
        this.A00 = A003;
        C27457Enn A0z = C18190wL.A0z(true);
        this.A0B = A0z;
        C27457Enn A0z2 = C18190wL.A0z(AnonymousClass0ZV.A00);
        this.A09 = A0z2;
        C27457Enn A0z3 = C18190wL.A0z(0);
        this.A0C = A0z3;
        C27457Enn A0z4 = C18190wL.A0z(0);
        this.A0A = A0z4;
        C27457Enn A0z5 = C18190wL.A0z(AnonymousClass84Y.A00);
        this.A0D = A0z5;
        C27457Enn A0z6 = C18190wL.A0z("");
        this.A0E = A0z6;
        C27442EnY enY = new C27442EnY();
        this.A07 = enY;
        this.A08 = AnonymousClass7C4.A02(enY);
        C84714tk A004 = AnonymousClass6W3.A00(new IDxFlowShape93S0200000_1_I2(13, (Object) this, (Object) new C84714tk[]{A0z2, A0z3, A0z4, fanClubMemberListRepository.A05, fanClubMemberListRepository.A03, A0z, A0z5, A0z6}), 250);
        this.A0F = C25753DrP.A04(AnonymousClass4CC.A00, AnonymousClass3J5.A00(this), A004, AnonymousClass74I.A01);
        C25237DiI.A00((Integer) null, (C27952Ew2) null, C18240wQ.A0n(this, (C146958n9) null, 29), AnonymousClass3J5.A00(this), 3);
        C25817DsW.A06(AnonymousClass3J5.A00(this), AnonymousClass7J0.A01(C18240wQ.A0n(this, (C146958n9) null, 30), fanClubMemberListRepository.A04));
    }
}
