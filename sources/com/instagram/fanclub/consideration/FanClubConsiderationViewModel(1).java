package com.instagram.fanclub.consideration;

import X.AnonymousClass006;
import X.AnonymousClass0OP;
import X.AnonymousClass0ZV;
import X.AnonymousClass0gW;
import X.AnonymousClass0wJ;
import X.AnonymousClass10X;
import X.AnonymousClass1kC;
import X.AnonymousClass20M;
import X.AnonymousClass2LU;
import X.AnonymousClass2O7;
import X.AnonymousClass2RN;
import X.AnonymousClass3J5;
import X.AnonymousClass3WJ;
import X.AnonymousClass490;
import X.AnonymousClass495;
import X.AnonymousClass4CB;
import X.AnonymousClass4To;
import X.AnonymousClass4VZ;
import X.AnonymousClass8AN;
import X.C04220Ms;
import X.C106376ew;
import X.C146958n9;
import X.C18180wK;
import X.C18190wL;
import X.C18200wM;
import X.C18210wN;
import X.C18220wO;
import X.C18230wP;
import X.C18240wQ;
import X.C18250wR;
import X.C208516j;
import X.C25237DiI;
import X.C25786Drz;
import X.C27457Enn;
import X.C305621v;
import X.C305721w;
import X.C57943Dd;
import X.C58963Iu;
import X.C62763ag;
import X.C84714tk;
import X.C84874u0;
import X.C86074wE;
import X.DIV;
import X.E5N;
import X.Lr0;
import android.app.Application;
import android.content.SharedPreferences;
import androidx.fragment.app.FragmentActivity;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0202000_I2;
import com.facebook.redex.IDxFlowShape93S0200000_1_I2;
import com.instagram.barcelona.R;
import com.instagram.monetization.repository.MonetizationRepository;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class FanClubConsiderationViewModel extends AnonymousClass10X {
    public Integer A00 = AnonymousClass006.A01;
    public final C84874u0 A01;
    public final AnonymousClass495 A02;
    public final FanClubConsiderationRepository A03;
    public final AnonymousClass490 A04;
    public final MonetizationRepository A05;
    public final C106376ew A06;
    public final UserSession A07;
    public final String A08;
    public final String A09;
    public final C84714tk A0A;
    public final C86074wE A0B;
    public final C86074wE A0C;
    public final C86074wE A0D;
    public final C86074wE A0E;
    public final C86074wE A0F;
    public final C86074wE A0G;
    public final C86074wE A0H;
    public final C86074wE A0I;
    public final boolean A0J;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FanClubConsiderationViewModel(Application application, FanClubConsiderationRepository fanClubConsiderationRepository, AnonymousClass490 r17, C106376ew r18, UserSession userSession, String str, String str2, boolean z) {
        super(application);
        E5N A0J2 = C18250wR.A0J((AnonymousClass0gW) null, 3);
        UserSession userSession2 = userSession;
        AnonymousClass495 A002 = AnonymousClass2O7.A00(userSession2);
        MonetizationRepository A003 = AnonymousClass2RN.A00(userSession2);
        AnonymousClass490 r9 = r17;
        C106376ew r8 = r18;
        C18210wN.A1M(r9, 7, r8);
        C04220Ms.A0B(A002, 10);
        C04220Ms.A0B(A003, 11);
        this.A07 = userSession2;
        this.A08 = str;
        this.A09 = str2;
        this.A0J = z;
        this.A03 = fanClubConsiderationRepository;
        this.A04 = r9;
        this.A06 = r8;
        this.A01 = A0J2;
        this.A02 = A002;
        this.A05 = A003;
        Lr0 lr0 = DIV.A01;
        C27457Enn A0z = C18190wL.A0z(lr0);
        this.A0B = A0z;
        C27457Enn A0z2 = C18190wL.A0z(lr0);
        this.A0F = A0z2;
        C27457Enn A0z3 = C18190wL.A0z(AnonymousClass4To.A00());
        this.A0H = A0z3;
        C27457Enn A0z4 = C18190wL.A0z(true);
        this.A0G = A0z4;
        C27457Enn A0z5 = C18190wL.A0z(lr0);
        this.A0E = A0z5;
        C27457Enn A0z6 = C18190wL.A0z(C305621v.ENABLED);
        this.A0C = A0z6;
        C27457Enn A0z7 = C18190wL.A0z(C305721w.NONE);
        this.A0D = A0z7;
        C27457Enn A0z8 = C18190wL.A0z(AnonymousClass4CB.A00);
        this.A0I = A0z8;
        this.A0A = new IDxFlowShape93S0200000_1_I2(9, (Object) this, (Object) new C84714tk[]{A0z, A0z2, A0z3, A0z4, A0z5, A0z6, A0z7, A0z8});
        C25237DiI.A00((Integer) null, A0J2.A03, C18240wQ.A0n(this, (C146958n9) null, 20), AnonymousClass3J5.A00(this), 2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A03(android.content.Context r9, com.instagram.fanclub.consideration.FanClubConsiderationViewModel r10, java.util.Set r11, X.C146958n9 r12) {
        /*
            r3 = 2
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape0S0801000_I2.A00(r3, r12)
            if (r0 == 0) goto L_0x0079
            r7 = r12
            kotlin.coroutines.jvm.internal.KtCImplShape0S0801000_I2 r7 = (kotlin.coroutines.jvm.internal.KtCImplShape0S0801000_I2) r7
            int r2 = r7.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0079
            int r2 = r2 - r1
            r7.A00 = r2
        L_0x0015:
            java.lang.Object r2 = r7.A07
            X.D0E r8 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r7.A00
            r6 = 1
            if (r0 == 0) goto L_0x0069
            if (r0 != r6) goto L_0x007f
            java.lang.Object r3 = r7.A06
            java.lang.Object r5 = r7.A05
            java.util.Iterator r5 = (java.util.Iterator) r5
            java.lang.Object r0 = r7.A04
            java.util.Map r0 = (java.util.Map) r0
            java.lang.Object r4 = r7.A03
            java.util.Map r4 = (java.util.Map) r4
            java.lang.Object r9 = r7.A02
            android.content.Context r9 = (android.content.Context) r9
            java.lang.Object r10 = r7.A01
            com.instagram.fanclub.consideration.FanClubConsiderationViewModel r10 = (com.instagram.fanclub.consideration.FanClubConsiderationViewModel) r10
            X.AnonymousClass0OU.A00(r2)
        L_0x0039:
            X.2OE r2 = (X.AnonymousClass2OE) r2
            boolean r1 = r2 instanceof X.C25861pX
            if (r1 == 0) goto L_0x0046
            X.1pX r2 = (X.C25861pX) r2
            java.lang.String r1 = r2.A00
            r0.put(r3, r1)
        L_0x0046:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x0084
            java.lang.String r3 = X.C18180wK.A0k(r5)
            X.490 r2 = r10.A04
            java.lang.Integer r1 = X.AnonymousClass006.A00
            r7.A01 = r10
            r7.A02 = r9
            r7.A03 = r4
            r7.A04 = r0
            r7.A05 = r5
            r7.A06 = r3
            r7.A00 = r6
            java.lang.Object r2 = r2.A00(r9, r1, r3, r7)
            if (r2 != r8) goto L_0x0039
            return r8
        L_0x0069:
            X.AnonymousClass0OU.A00(r2)
            X.MSK r0 = new X.MSK
            r0.<init>()
            if (r11 == 0) goto L_0x0085
            java.util.Iterator r5 = r11.iterator()
            r4 = r0
            goto L_0x0046
        L_0x0079:
            kotlin.coroutines.jvm.internal.KtCImplShape0S0801000_I2 r7 = new kotlin.coroutines.jvm.internal.KtCImplShape0S0801000_I2
            r7.<init>(r10, r12, r3)
            goto L_0x0015
        L_0x007f:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x0084:
            r0 = r4
        L_0x0085:
            X.AnonymousClass4WK.A0P(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.consideration.FanClubConsiderationViewModel.A03(android.content.Context, com.instagram.fanclub.consideration.FanClubConsiderationViewModel, java.util.Set, X.8n9):java.lang.Object");
    }

    public final void A09(FragmentActivity fragmentActivity, Integer num) {
        C04220Ms.A0B(num, 0);
        int intValue = num.intValue();
        if (intValue == 1) {
            C25786Drz A0Q = C18180wK.A0Q(fragmentActivity, this.A07);
            A0Q.A03 = AnonymousClass3WJ.A00().A02("PROFILE");
            A0Q.A05();
        } else if (intValue == 2) {
            C58963Iu r2 = new C58963Iu(this.A07);
            r2.A03(C18200wM.A0R(this, fragmentActivity, 99), 2131827101);
            new C62763ag(r2).A02(fragmentActivity);
        } else if (intValue != 0) {
        } else {
            if (C18220wO.A0b(fragmentActivity) != null) {
                AnonymousClass495 r0 = this.A02;
                String str = this.A08;
                String str2 = this.A09;
                USLEBaseShape0S0000000 A0I2 = C18180wK.A0I(AnonymousClass0wJ.A0M(r0.A00, "ig_digital_fan_club_share_in_dm_fan_referral_click"), 1160);
                C18230wP.A1H(A0I2, "fan_onboarding_consideration");
                C18250wR.A0x(A0I2, AnonymousClass0wJ.A0d(str));
                C18250wR.A0z(A0I2, str2);
                throw C18200wM.A0d();
            }
            throw C18180wK.A0a("Required value was null.");
        }
    }

    public static final KtCSuperShape0S0202000_I2 A00(FanClubConsiderationViewModel fanClubConsiderationViewModel) {
        AnonymousClass1kC r4;
        SharedPreferences sharedPreferences = fanClubConsiderationViewModel.A06.A00;
        if (sharedPreferences.getInt("welcome_screen_send_sub_tooltip_count", 0) >= 3 || System.currentTimeMillis() - C18180wK.A05(sharedPreferences, "welcome_screen_send_sub_tooltip_timestamp") <= C18210wN.A06()) {
            r4 = null;
        } else {
            AnonymousClass0wJ.A14(sharedPreferences, "welcome_screen_send_sub_tooltip_count", 0);
            AnonymousClass0wJ.A12(sharedPreferences.edit(), "welcome_screen_send_sub_tooltip_timestamp", System.currentTimeMillis());
            r4 = AnonymousClass1kC.A00(new Object[0], 2131838049);
        }
        return new KtCSuperShape0S0202000_I2((C57943Dd) r4, AnonymousClass006.A00, (int) R.drawable.instagram_direct_pano_outline_24, 2131835660);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0210000_I2 A01(X.C305621v r5, com.instagram.fanclub.consideration.FanClubConsiderationViewModel r6, java.lang.Integer r7) {
        /*
            java.lang.Integer r0 = r6.A00
            int r1 = r0.intValue()
            r2 = 1
            r3 = 0
            if (r1 == r3) goto L_0x0053
            if (r1 == r2) goto L_0x002e
            r0 = 2
            if (r1 != r0) goto L_0x0062
            if (r7 == 0) goto L_0x005d
            int r4 = r7.intValue()
            java.lang.Object[] r1 = new java.lang.Object[]{r7}
            r0 = 2131689554(0x7f0f0052, float:1.9008127E38)
            X.1k9 r3 = new X.1k9
            r3.<init>(r1, r0, r4)
        L_0x0021:
            X.9uI r1 = X.C170019uI.SECONDARY
        L_0x0023:
            X.21v r0 = X.C305621v.ENABLED
            if (r5 == r0) goto L_0x0028
            r2 = 0
        L_0x0028:
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0210000_I2 r0 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0210000_I2
            r0.<init>((X.C57943Dd) r3, (X.C170019uI) r1, (boolean) r2)
            return r0
        L_0x002e:
            X.21v r0 = X.C305621v.LOADING
            if (r5 != r0) goto L_0x003e
            r1 = 2131827129(0x7f1119b9, float:1.9287162E38)
        L_0x0035:
            java.lang.Object[] r0 = new java.lang.Object[r3]
            X.1kC r3 = X.AnonymousClass1kC.A00(r0, r1)
            X.9uI r1 = X.C170019uI.PRIMARY
            goto L_0x0023
        L_0x003e:
            java.lang.String r1 = r6.A09
            java.lang.Integer r0 = X.AnonymousClass006.A0H
            java.lang.String r0 = X.AnonymousClass3R0.A00(r0)
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            r1 = 2131827149(0x7f1119cd, float:1.9287202E38)
            if (r0 == 0) goto L_0x0035
            r1 = 2131827985(0x7f111d11, float:1.9288898E38)
            goto L_0x0035
        L_0x0053:
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r0 = 2131827159(0x7f1119d7, float:1.9287223E38)
            X.1kC r3 = X.AnonymousClass1kC.A00(r1, r0)
            goto L_0x0021
        L_0x005d:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0b()
            throw r0
        L_0x0062:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.consideration.FanClubConsiderationViewModel.A01(X.21v, com.instagram.fanclub.consideration.FanClubConsiderationViewModel, java.lang.Integer):com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0210000_I2");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A04(com.instagram.fanclub.consideration.FanClubConsiderationViewModel r10, java.lang.String r11, X.C146958n9 r12) {
        /*
            r3 = 33
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape1S0401000_I2_1.A00(r3, r12)
            if (r0 == 0) goto L_0x0101
            r8 = r12
            kotlin.coroutines.jvm.internal.KtCImplShape1S0401000_I2_1 r8 = (kotlin.coroutines.jvm.internal.KtCImplShape1S0401000_I2_1) r8
            int r2 = r8.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0101
            int r2 = r2 - r1
            r8.A00 = r2
        L_0x0016:
            java.lang.Object r5 = r8.A03
            X.D0E r9 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r8.A00
            r3 = 0
            r6 = 0
            r2 = 2
            r1 = 1
            r7 = 0
            if (r0 == 0) goto L_0x007f
            if (r0 == r1) goto L_0x00a6
            if (r0 != r2) goto L_0x0108
            java.lang.Object r11 = r8.A02
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r10 = r8.A01
            com.instagram.fanclub.consideration.FanClubConsiderationViewModel r10 = (com.instagram.fanclub.consideration.FanClubConsiderationViewModel) r10
            X.AnonymousClass0OU.A00(r5)
        L_0x0033:
            com.instagram.fanclub.api.FanClubInfoForCreatorResponseImpl$XigUserByIgidV2$FanClub r5 = (com.instagram.fanclub.api.FanClubInfoForCreatorResponseImpl.XigUserByIgidV2.FanClub) r5
            if (r5 == 0) goto L_0x007e
            X.495 r6 = r10.A02
            com.instagram.fanclub.api.FanClubInfoForCreatorResponseImpl$XigUserByIgidV2$FanClub$Package r2 = r5.A00()
            if (r2 == 0) goto L_0x0050
            java.lang.Class<com.instagram.fanclub.api.FanClubInfoForCreatorResponseImpl$XigUserByIgidV2$FanClub$Package$Members> r1 = com.instagram.fanclub.api.FanClubInfoForCreatorResponseImpl.XigUserByIgidV2.FanClub.Package.Members.class
            java.lang.String r0 = "members"
            com.facebook.pando.TreeJNI r1 = r2.getTreeValue(r0, r1)
            if (r1 == 0) goto L_0x0050
            java.lang.String r0 = "count"
            int r0 = r1.getIntValue(r0)
            long r3 = (long) r0
        L_0x0050:
            X.C04220Ms.A0B(r11, r7)
            X.0nS r1 = r6.A00
            java.lang.String r0 = "ig_fan_club_fetch_fan_club_from_user_success"
            X.0A2 r1 = X.AnonymousClass0wJ.A0M(r1, r0)
            r0 = 1198(0x4ae, float:1.679E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r2 = X.C18180wK.A0I(r1, r0)
            java.lang.String r0 = "creator_management_consideration"
            X.C18230wP.A1H(r2, r0)
            java.lang.Long r0 = X.AnonymousClass0wJ.A0d(r11)
            X.C18250wR.A0x(r2, r0)
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            java.lang.String r0 = "member_count"
            r2.A0S(r0, r1)
            r2.Bb4()
            X.1pI r6 = new X.1pI
            r6.<init>(r5)
        L_0x007e:
            return r6
        L_0x007f:
            X.AnonymousClass0OU.A00(r5)
            java.lang.Integer r0 = r10.A00
            int r0 = r0.intValue()
            if (r0 == r7) goto L_0x009a
            if (r0 == r1) goto L_0x009a
            if (r0 != r2) goto L_0x010d
            com.instagram.fanclub.consideration.FanClubConsiderationRepository r0 = r10.A03
            X.C18240wQ.A1M(r10, r11, r8, r2)
            java.lang.Object r5 = r0.A01(r11, r8)
            if (r5 != r9) goto L_0x0033
            return r9
        L_0x009a:
            com.instagram.fanclub.consideration.FanClubConsiderationRepository r0 = r10.A03
            X.C18240wQ.A1M(r10, r11, r8, r1)
            java.lang.Object r5 = r0.A02(r11, r8, r1)
            if (r5 != r9) goto L_0x00b1
            return r9
        L_0x00a6:
            java.lang.Object r11 = r8.A02
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r10 = r8.A01
            com.instagram.fanclub.consideration.FanClubConsiderationViewModel r10 = (com.instagram.fanclub.consideration.FanClubConsiderationViewModel) r10
            X.AnonymousClass0OU.A00(r5)
        L_0x00b1:
            com.instagram.fanclub.api.FanClubInfoResponseImpl$XigUserByIgidV2$FanClub r5 = (com.instagram.fanclub.api.FanClubInfoResponseImpl.XigUserByIgidV2.FanClub) r5
            if (r5 == 0) goto L_0x007e
            X.495 r6 = r10.A02
            java.lang.Class<com.instagram.fanclub.api.FanClubInfoResponseImpl$XigUserByIgidV2$FanClub$Package> r1 = com.instagram.fanclub.api.FanClubInfoResponseImpl.XigUserByIgidV2.FanClub.Package.class
            java.lang.String r0 = "package"
            com.facebook.pando.TreeJNI r2 = r5.getTreeValue(r0, r1)
            if (r2 == 0) goto L_0x00d2
            java.lang.Class<com.instagram.fanclub.api.FanClubInfoResponseImpl$XigUserByIgidV2$FanClub$Package$Members> r1 = com.instagram.fanclub.api.FanClubInfoResponseImpl.XigUserByIgidV2.FanClub.Package.Members.class
            java.lang.String r0 = "members"
            com.facebook.pando.TreeJNI r1 = r2.getTreeValue(r0, r1)
            if (r1 == 0) goto L_0x00d2
            java.lang.String r0 = "count"
            int r0 = r1.getIntValue(r0)
            long r3 = (long) r0
        L_0x00d2:
            X.C04220Ms.A0B(r11, r7)
            X.0nS r1 = r6.A00
            java.lang.String r0 = "ig_fan_club_fetch_fan_club_from_user_success"
            X.0A2 r1 = X.AnonymousClass0wJ.A0M(r1, r0)
            r0 = 1198(0x4ae, float:1.679E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r2 = X.C18180wK.A0I(r1, r0)
            java.lang.String r0 = "fan_onboarding_consideration"
            X.C18230wP.A1H(r2, r0)
            java.lang.Long r0 = X.AnonymousClass0wJ.A0d(r11)
            X.C18250wR.A0x(r2, r0)
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            java.lang.String r0 = "member_count"
            r2.A0S(r0, r1)
            r2.Bb4()
            X.1pJ r6 = new X.1pJ
            r6.<init>(r5)
            return r6
        L_0x0101:
            kotlin.coroutines.jvm.internal.KtCImplShape1S0401000_I2_1 r8 = new kotlin.coroutines.jvm.internal.KtCImplShape1S0401000_I2_1
            r8.<init>(r10, r12, r3)
            goto L_0x0016
        L_0x0108:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x010d:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.consideration.FanClubConsiderationViewModel.A04(com.instagram.fanclub.consideration.FanClubConsiderationViewModel, java.lang.String, X.8n9):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0041, code lost:
        if (X.C18190wL.A1a(r2.A0B) != false) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004c, code lost:
        if (r17 == false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0058, code lost:
        if (r17 == false) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0072, code lost:
        if (X.C63803iN.A0E(X.AnonymousClass0TJ.A05, r4.A07, 36324093200638238L) == false) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00e3, code lost:
        if (X.C63803iN.A0E(X.AnonymousClass0TJ.A05, r4.A07, 36323934286717106L) == false) goto L_0x00e5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x019a  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A05(com.instagram.fanclub.consideration.FanClubConsiderationViewModel r16, X.C146958n9 r17) {
        /*
            r4 = r16
            r3 = 32
            r5 = r17
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape3S0301000_I2_2.A00(r3, r5)
            if (r0 == 0) goto L_0x01b1
            r7 = r5
            kotlin.coroutines.jvm.internal.KtCImplShape3S0301000_I2_2 r7 = (kotlin.coroutines.jvm.internal.KtCImplShape3S0301000_I2_2) r7
            int r2 = r7.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x01b1
            int r2 = r2 - r1
            r7.A00 = r2
        L_0x001a:
            java.lang.Object r2 = r7.A02
            X.D0E r3 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r7.A00
            r5 = 1
            r6 = 0
            if (r0 == 0) goto L_0x019a
            if (r0 != r5) goto L_0x01b8
            java.lang.Object r4 = r7.A01
            com.instagram.fanclub.consideration.FanClubConsiderationViewModel r4 = (com.instagram.fanclub.consideration.FanClubConsiderationViewModel) r4
            X.AnonymousClass0OU.A00(r2)
        L_0x002d:
            X.1pG r2 = (X.AnonymousClass1pG) r2
            if (r2 == 0) goto L_0x00b4
            java.util.List r1 = r2.A0D
            boolean r0 = X.C18190wL.A1a(r1)
            if (r0 != 0) goto L_0x0043
            java.util.List r0 = r2.A0B
            boolean r0 = X.C18190wL.A1a(r0)
            r17 = 0
            if (r0 == 0) goto L_0x0045
        L_0x0043:
            r17 = 1
        L_0x0045:
            boolean r0 = X.C18190wL.A1a(r1)
            if (r0 == 0) goto L_0x004e
            r13 = 1
            if (r17 != 0) goto L_0x004f
        L_0x004e:
            r13 = 0
        L_0x004f:
            java.util.List r0 = r2.A0B
            boolean r0 = X.C18190wL.A1a(r0)
            if (r0 == 0) goto L_0x005a
            r11 = 1
            if (r17 != 0) goto L_0x005b
        L_0x005a:
            r11 = 0
        L_0x005b:
            java.util.List r0 = r2.A0C
            boolean r0 = X.C18190wL.A1a(r0)
            if (r0 == 0) goto L_0x0074
            com.instagram.service.session.UserSession r3 = r4.A07
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 36324093200638238(0x810c920003211e, double:3.034841033242309E-306)
            boolean r0 = X.C63803iN.A0E(r2, r3, r0)
            r16 = 1
            if (r0 != 0) goto L_0x0076
        L_0x0074:
            r16 = 0
        L_0x0076:
            java.lang.Integer r0 = r4.A00
            int r1 = r0.intValue()
            if (r1 == r6) goto L_0x0134
            if (r1 == r5) goto L_0x00b7
            r0 = 2
            if (r1 != r0) goto L_0x00b4
            if (r16 == 0) goto L_0x00b4
            X.495 r0 = r4.A02
            java.lang.String r2 = r4.A08
            java.lang.String r3 = r4.A09
            java.lang.String r4 = "subscription_management"
            X.0nS r1 = r0.A00
            java.lang.String r0 = "ig_fan_club_creator_side_customized_benefits_impression"
            X.0A2 r1 = X.AnonymousClass0wJ.A0M(r1, r0)
            r0 = 1189(0x4a5, float:1.666E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r1 = X.C18180wK.A0I(r1, r0)
            java.lang.String r0 = "creator_management_consideration"
            X.C18230wP.A1H(r1, r0)
            java.lang.Long r0 = X.AnonymousClass0wJ.A0d(r2)
            X.C18250wR.A0x(r1, r0)
            java.lang.String r5 = "origin"
        L_0x00a9:
            r1.A0T(r5, r3)
            java.lang.String r0 = "surface"
            r1.A0T(r0, r4)
            r1.Bb4()
        L_0x00b4:
            kotlin.Unit r3 = kotlin.Unit.A00
            return r3
        L_0x00b7:
            X.495 r6 = r4.A02
            java.lang.String r2 = r4.A08
            long r14 = java.lang.Long.parseLong(r2)
            java.lang.String r3 = r4.A09
            X.4wE r0 = r4.A0F
            java.lang.Object r0 = r0.getValue()
            X.34W r0 = (X.AnonymousClass34W) r0
            if (r0 == 0) goto L_0x00e5
            java.util.Set r0 = r0.A00
            if (r0 == 0) goto L_0x00e5
            int r0 = r0.size()
            if (r0 <= r5) goto L_0x00e5
            com.instagram.service.session.UserSession r5 = r4.A07
            X.0TJ r4 = X.AnonymousClass0TJ.A05
            r0 = 36323934286717106(0x810c6d000120b2, double:3.03474053543869E-306)
            boolean r0 = X.C63803iN.A0E(r4, r5, r0)
            r12 = 1
            if (r0 != 0) goto L_0x00e6
        L_0x00e5:
            r12 = 0
        L_0x00e6:
            X.0nS r10 = r6.A00
            java.lang.String r0 = "fan_onboarding_consideration_screen_seen"
            X.0il r9 = r10.A00
            X.0A2 r1 = r10.A03(r9, r0)
            r0 = 614(0x266, float:8.6E-43)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r4 = X.C18180wK.A0I(r1, r0)
            java.lang.String r8 = "fan_onboarding_consideration"
            java.lang.String r7 = "container_module"
            r4.A0T(r7, r8)
            java.lang.Long r0 = java.lang.Long.valueOf(r14)
            java.lang.String r6 = "creator_igid"
            r4.A0S(r6, r0)
            java.lang.String r5 = "origin"
            java.lang.Boolean r1 = X.C18190wL.A0Z(r4, r5, r3, r13)
            java.lang.String r0 = "social_context_shown"
            java.lang.Boolean r1 = X.C18210wN.A0R(r4, r1, r0, r11)
            java.lang.String r0 = "content_preview_shown"
            r4.A0Q(r0, r1)
            if (r17 == 0) goto L_0x0131
            X.28Z r1 = X.AnonymousClass28Z.REVAMPED
        L_0x011b:
            java.lang.String r0 = "version_seen"
            r4.A0O(r1, r0)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r12)
            java.lang.String r0 = "early_pricing_enabled"
            r4.A0Q(r0, r1)
            r4.Bb4()
            if (r16 == 0) goto L_0x00b4
            java.lang.String r4 = "fan_onboarding"
            goto L_0x017f
        L_0x0131:
            X.28Z r1 = X.AnonymousClass28Z.ORIGINAL
            goto L_0x011b
        L_0x0134:
            X.495 r0 = r4.A02
            java.lang.String r2 = r4.A08
            long r5 = java.lang.Long.parseLong(r2)
            java.lang.String r3 = r4.A09
            X.0nS r10 = r0.A00
            java.lang.String r0 = "fan_management_consideration_screen_seen"
            X.0il r9 = r10.A00
            X.0A2 r1 = r10.A03(r9, r0)
            r0 = 612(0x264, float:8.58E-43)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r4 = X.C18180wK.A0I(r1, r0)
            java.lang.String r8 = "fan_management_consideration"
            java.lang.String r7 = "container_module"
            r4.A0T(r7, r8)
            java.lang.Long r0 = java.lang.Long.valueOf(r5)
            java.lang.String r6 = "creator_igid"
            r4.A0S(r6, r0)
            java.lang.String r5 = "origin"
            java.lang.Boolean r1 = X.C18190wL.A0Z(r4, r5, r3, r13)
            java.lang.String r0 = "social_context_shown"
            java.lang.Boolean r1 = X.C18210wN.A0R(r4, r1, r0, r11)
            java.lang.String r0 = "content_preview_shown"
            r4.A0Q(r0, r1)
            if (r17 == 0) goto L_0x0197
            X.28Z r1 = X.AnonymousClass28Z.REVAMPED
        L_0x0173:
            java.lang.String r0 = "version_seen"
            r4.A0O(r1, r0)
            r4.Bb4()
            if (r16 == 0) goto L_0x00b4
            java.lang.String r4 = "fan_management"
        L_0x017f:
            java.lang.String r0 = "ig_fan_club_fan_side_customized_benefits_impression"
            X.0A2 r1 = r10.A03(r9, r0)
            r0 = 1196(0x4ac, float:1.676E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r1 = X.C18180wK.A0I(r1, r0)
            r1.A0T(r7, r8)
            java.lang.Long r0 = X.AnonymousClass0wJ.A0d(r2)
            r1.A0S(r6, r0)
            goto L_0x00a9
        L_0x0197:
            X.28Z r1 = X.AnonymousClass28Z.ORIGINAL
            goto L_0x0173
        L_0x019a:
            X.AnonymousClass0OU.A00(r2)
            X.4tk r2 = r4.A0A
            r1 = 10
            com.facebook.redex.IDxFlowShape250S0100000_1_I2 r0 = new com.facebook.redex.IDxFlowShape250S0100000_1_I2
            r0.<init>(r2, r1)
            r7.A01 = r4
            r7.A00 = r5
            java.lang.Object r2 = X.C25752DrO.A03(r7, r0)
            if (r2 != r3) goto L_0x002d
            return r3
        L_0x01b1:
            kotlin.coroutines.jvm.internal.KtCImplShape3S0301000_I2_2 r7 = new kotlin.coroutines.jvm.internal.KtCImplShape3S0301000_I2_2
            r7.<init>(r4, r5, r3)
            goto L_0x001a
        L_0x01b8:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.consideration.FanClubConsiderationViewModel.A05(com.instagram.fanclub.consideration.FanClubConsiderationViewModel, X.8n9):java.lang.Object");
    }

    public static final List A06(FanClubConsiderationViewModel fanClubConsiderationViewModel, User user, List list, boolean z) {
        AnonymousClass1kC A002;
        Object[] objArr;
        int i;
        AnonymousClass1kC A003;
        int i2;
        Object[] objArr2;
        int i3;
        Object[] objArr3;
        int i4;
        if (z) {
            return AnonymousClass0ZV.A00;
        }
        boolean A1Z = C18180wK.A1Z(fanClubConsiderationViewModel.A00, AnonymousClass006.A0C);
        AnonymousClass8AN r4 = new AnonymousClass8AN();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int ordinal = ((AnonymousClass20M) it.next()).ordinal();
            if (ordinal == 1) {
                String BK7 = user.BK7();
                C04220Ms.A0B(BK7, 1);
                A002 = AnonymousClass1kC.A00(new Object[0], 2131822280);
                if (A1Z) {
                    objArr = new Object[0];
                    i = 2131822273;
                } else {
                    objArr = new Object[]{BK7};
                    i = 2131822274;
                }
                A003 = AnonymousClass1kC.A00(objArr, i);
                i2 = R.drawable.instagram_crown_badge_pano_outline_24;
            } else if (ordinal == 5) {
                String BK72 = user.BK7();
                C04220Ms.A0B(BK72, 0);
                A002 = AnonymousClass1kC.A00(new Object[0], 2131822282);
                A003 = AnonymousClass1kC.A00(new Object[]{BK72}, 2131822277);
                i2 = R.drawable.instagram_media_pano_outline_24;
            } else if (ordinal == 7) {
                String BK73 = user.BK7();
                C04220Ms.A0B(BK73, 1);
                A002 = AnonymousClass1kC.A00(new Object[0], 2131822283);
                if (A1Z) {
                    objArr2 = new Object[0];
                    i3 = 2131822278;
                } else {
                    objArr2 = new Object[]{BK73};
                    i3 = 2131822279;
                }
                A003 = AnonymousClass1kC.A00(objArr2, i3);
                i2 = R.drawable.instagram_app_messenger_pano_outline_24;
            } else if (ordinal == 2) {
                String BK74 = user.BK7();
                C04220Ms.A0B(BK74, 1);
                A002 = AnonymousClass1kC.A00(new Object[0], 2131822281);
                if (A1Z) {
                    objArr3 = new Object[0];
                    i4 = 2131822275;
                } else {
                    objArr3 = new Object[]{BK74};
                    i4 = 2131822276;
                }
                A003 = AnonymousClass1kC.A00(objArr3, i4);
                i2 = R.drawable.instagram_live_pano_outline_24;
            }
            r4.add(new C208516j(A002, A003, i2));
        }
        AnonymousClass0OP.A11(r4);
        return r4;
    }

    public static final C57943Dd A02(FanClubConsiderationViewModel fanClubConsiderationViewModel, Integer num, String str, String str2, Map map) {
        int i;
        Object[] objArr;
        int i2;
        Object obj = map.get(str);
        if (obj == null) {
            return AnonymousClass2LU.A00("");
        }
        Object obj2 = map.get(str2);
        int intValue = fanClubConsiderationViewModel.A00.intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue != 2) {
                    throw AnonymousClass4VZ.A00();
                } else if (obj2 == null || num == null) {
                    i = 2131830242;
                    return AnonymousClass1kC.A00(new Object[]{obj}, i);
                } else {
                    objArr = new Object[]{obj, obj2, num};
                    i2 = 2131830243;
                }
            } else if (obj2 != null) {
                objArr = new Object[]{obj, obj2};
                i2 = 2131827162;
            }
            return AnonymousClass1kC.A00(objArr, i2);
        }
        i = 2131827161;
        return AnonymousClass1kC.A00(new Object[]{obj}, i);
    }
}
