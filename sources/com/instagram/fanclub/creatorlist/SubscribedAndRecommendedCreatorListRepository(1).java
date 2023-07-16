package com.instagram.fanclub.creatorlist;

import X.AnonymousClass006;
import X.AnonymousClass0ZV;
import X.AnonymousClass22N;
import X.C04220Ms;
import X.C148838sG;
import X.C18190wL;
import X.C18230wP;
import X.C27198Efl;
import X.C27456Enm;
import X.C27457Enn;
import X.C28172Ezi;
import X.C86074wE;
import X.C86084wF;
import X.C86094wG;
import X.DIV;
import X.Lr0;
import com.instagram.fanclub.api.FanClubApi;
import com.instagram.service.session.UserSession;
import kotlin.Unit;

public final class SubscribedAndRecommendedCreatorListRepository {
    public AnonymousClass22N A00;
    public AnonymousClass22N A01;
    public String A02;
    public String A03;
    public boolean A04;
    public boolean A05 = true;
    public final FanClubApi A06;
    public final UserSession A07;
    public final C86084wF A08;
    public final C86074wE A09;
    public final C86074wE A0A;
    public final C86074wE A0B;
    public final C86074wE A0C;
    public final C28172Ezi A0D;
    public final C86094wG A0E;
    public final C86094wG A0F;
    public final C86094wG A0G;
    public final C86094wG A0H;

    public /* synthetic */ SubscribedAndRecommendedCreatorListRepository(UserSession userSession) {
        FanClubApi fanClubApi = new FanClubApi(userSession);
        C04220Ms.A0B(userSession, 1);
        this.A07 = userSession;
        this.A06 = fanClubApi;
        Lr0 lr0 = DIV.A01;
        C27457Enn A0z = C18190wL.A0z(lr0);
        this.A0A = A0z;
        AnonymousClass22N r0 = AnonymousClass22N.INITIAL_FETCH;
        this.A01 = r0;
        C27457Enn A0z2 = C18190wL.A0z(lr0);
        this.A09 = A0z2;
        this.A04 = true;
        this.A00 = r0;
        C27457Enn A0z3 = C18190wL.A0z(AnonymousClass0ZV.A00);
        this.A0B = A0z3;
        this.A0F = C18230wP.A0x((C148838sG) null, A0z);
        this.A0E = C18230wP.A0x((C148838sG) null, A0z2);
        this.A0G = C18230wP.A0x((C148838sG) null, A0z3);
        C27456Enm enm = new C27456Enm(AnonymousClass006.A00, 1, 1);
        this.A08 = enm;
        this.A0D = new C27198Efl((C148838sG) null, enm);
        C27457Enn A0z4 = C18190wL.A0z(false);
        this.A0C = A0z4;
        this.A0H = C18230wP.A0x((C148838sG) null, A0z4);
        enm.D7t(Unit.A00);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.instagram.fanclub.creatorlist.SubscribedAndRecommendedCreatorListRepository r5, java.lang.String r6, X.C146958n9 r7) {
        /*
            r3 = 33
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape3S0301000_I2_2.A00(r3, r7)
            if (r0 == 0) goto L_0x00a9
            r4 = r7
            kotlin.coroutines.jvm.internal.KtCImplShape3S0301000_I2_2 r4 = (kotlin.coroutines.jvm.internal.KtCImplShape3S0301000_I2_2) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00a9
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r3 = r4.A02
            X.D0E r1 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r4.A00
            r2 = 1
            if (r0 == 0) goto L_0x0095
            if (r0 != r2) goto L_0x00b5
            java.lang.Object r5 = r4.A01
            com.instagram.fanclub.creatorlist.SubscribedAndRecommendedCreatorListRepository r5 = (com.instagram.fanclub.creatorlist.SubscribedAndRecommendedCreatorListRepository) r5
            X.AnonymousClass0OU.A00(r3)
        L_0x0028:
            X.3b6 r3 = (X.C62903b6) r3
            boolean r0 = r3 instanceof X.AnonymousClass1jA
            if (r0 == 0) goto L_0x008c
            X.1jA r3 = (X.AnonymousClass1jA) r3
            java.lang.Object r4 = r3.A00
            X.4vm r4 = (X.C85794vm) r4
            X.4wE r3 = r5.A09
            java.lang.Object r1 = r3.getValue()
            java.util.Collection r1 = (java.util.Collection) r1
            if (r1 != 0) goto L_0x0040
            X.0ZV r1 = X.AnonymousClass0ZV.A00
        L_0x0040:
            java.lang.Object r0 = r4.D7H()
            X.39c r0 = (X.C569339c) r0
            java.util.List r0 = r0.A01
            java.util.List r0 = X.AnonymousClass00J.A0V(r0, r1)
            r3.CrC(r0)
            java.lang.Object r0 = r4.D7H()
            X.39c r0 = (X.C569339c) r0
            java.lang.String r0 = r0.A00
            r5.A02 = r0
            java.lang.Object r0 = r4.D7H()
            X.39c r0 = (X.C569339c) r0
            boolean r0 = r0.A02
            r5.A04 = r0
            X.22N r0 = X.AnonymousClass22N.IDLE
            r5.A00 = r0
            X.1jA r3 = X.C62903b6.A03()
        L_0x006b:
            boolean r0 = r3 instanceof X.AnonymousClass1jA
            if (r0 != 0) goto L_0x0089
            boolean r0 = r3 instanceof X.AnonymousClass1jB
            if (r0 == 0) goto L_0x00b0
            X.4wE r1 = r5.A09
            java.lang.Object r0 = r1.getValue()
            if (r0 != 0) goto L_0x007d
            X.0ZV r0 = X.AnonymousClass0ZV.A00
        L_0x007d:
            r1.CrC(r0)
            X.22N r0 = X.AnonymousClass22N.ERROR
            r5.A00 = r0
            X.4wE r0 = r5.A0C
            X.C86074wE.A01(r0, r2)
        L_0x0089:
            kotlin.Unit r1 = kotlin.Unit.A00
            return r1
        L_0x008c:
            boolean r0 = r3 instanceof X.AnonymousClass1jB
            if (r0 != 0) goto L_0x006b
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x0095:
            X.AnonymousClass0OU.A00(r3)
            X.22N r0 = X.AnonymousClass22N.IN_PROGRESS
            r5.A00 = r0
            com.instagram.fanclub.api.FanClubApi r0 = r5.A06
            r4.A01 = r5
            r4.A00 = r2
            java.lang.Object r3 = r0.A09(r6, r4)
            if (r3 != r1) goto L_0x0028
            return r1
        L_0x00a9:
            kotlin.coroutines.jvm.internal.KtCImplShape3S0301000_I2_2 r4 = new kotlin.coroutines.jvm.internal.KtCImplShape3S0301000_I2_2
            r4.<init>(r5, r7, r3)
            goto L_0x0016
        L_0x00b0:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x00b5:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.creatorlist.SubscribedAndRecommendedCreatorListRepository.A00(com.instagram.fanclub.creatorlist.SubscribedAndRecommendedCreatorListRepository, java.lang.String, X.8n9):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A01(com.instagram.fanclub.creatorlist.SubscribedAndRecommendedCreatorListRepository r5, java.lang.String r6, X.C146958n9 r7) {
        /*
            r3 = 34
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape3S0301000_I2_2.A00(r3, r7)
            if (r0 == 0) goto L_0x00a9
            r4 = r7
            kotlin.coroutines.jvm.internal.KtCImplShape3S0301000_I2_2 r4 = (kotlin.coroutines.jvm.internal.KtCImplShape3S0301000_I2_2) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00a9
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r3 = r4.A02
            X.D0E r1 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r4.A00
            r2 = 1
            if (r0 == 0) goto L_0x0095
            if (r0 != r2) goto L_0x00b5
            java.lang.Object r5 = r4.A01
            com.instagram.fanclub.creatorlist.SubscribedAndRecommendedCreatorListRepository r5 = (com.instagram.fanclub.creatorlist.SubscribedAndRecommendedCreatorListRepository) r5
            X.AnonymousClass0OU.A00(r3)
        L_0x0028:
            X.3b6 r3 = (X.C62903b6) r3
            boolean r0 = r3 instanceof X.AnonymousClass1jA
            if (r0 == 0) goto L_0x008c
            X.1jA r3 = (X.AnonymousClass1jA) r3
            java.lang.Object r4 = r3.A00
            X.4vm r4 = (X.C85794vm) r4
            X.4wE r3 = r5.A0A
            java.lang.Object r1 = r3.getValue()
            java.util.Collection r1 = (java.util.Collection) r1
            if (r1 != 0) goto L_0x0040
            X.0ZV r1 = X.AnonymousClass0ZV.A00
        L_0x0040:
            java.lang.Object r0 = r4.D7H()
            X.39b r0 = (X.C569239b) r0
            java.util.List r0 = r0.A01
            java.util.List r0 = X.AnonymousClass00J.A0V(r0, r1)
            r3.CrC(r0)
            java.lang.Object r0 = r4.D7H()
            X.39b r0 = (X.C569239b) r0
            java.lang.String r0 = r0.A00
            r5.A03 = r0
            java.lang.Object r0 = r4.D7H()
            X.39b r0 = (X.C569239b) r0
            boolean r0 = r0.A02
            r5.A05 = r0
            X.22N r0 = X.AnonymousClass22N.IDLE
            r5.A01 = r0
            X.1jA r3 = X.C62903b6.A03()
        L_0x006b:
            boolean r0 = r3 instanceof X.AnonymousClass1jA
            if (r0 != 0) goto L_0x0089
            boolean r0 = r3 instanceof X.AnonymousClass1jB
            if (r0 == 0) goto L_0x00b0
            X.4wE r1 = r5.A0A
            java.lang.Object r0 = r1.getValue()
            if (r0 != 0) goto L_0x007d
            X.0ZV r0 = X.AnonymousClass0ZV.A00
        L_0x007d:
            r1.CrC(r0)
            X.22N r0 = X.AnonymousClass22N.ERROR
            r5.A01 = r0
            X.4wE r0 = r5.A0C
            X.C86074wE.A01(r0, r2)
        L_0x0089:
            kotlin.Unit r1 = kotlin.Unit.A00
            return r1
        L_0x008c:
            boolean r0 = r3 instanceof X.AnonymousClass1jB
            if (r0 != 0) goto L_0x006b
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x0095:
            X.AnonymousClass0OU.A00(r3)
            X.22N r0 = X.AnonymousClass22N.IN_PROGRESS
            r5.A01 = r0
            com.instagram.fanclub.api.FanClubApi r0 = r5.A06
            r4.A01 = r5
            r4.A00 = r2
            java.lang.Object r3 = r0.A08(r6, r4)
            if (r3 != r1) goto L_0x0028
            return r1
        L_0x00a9:
            kotlin.coroutines.jvm.internal.KtCImplShape3S0301000_I2_2 r4 = new kotlin.coroutines.jvm.internal.KtCImplShape3S0301000_I2_2
            r4.<init>(r5, r7, r3)
            goto L_0x0016
        L_0x00b0:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x00b5:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.creatorlist.SubscribedAndRecommendedCreatorListRepository.A01(com.instagram.fanclub.creatorlist.SubscribedAndRecommendedCreatorListRepository, java.lang.String, X.8n9):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A02(X.C146958n9 r6) {
        /*
            r5 = this;
            r3 = 35
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape3S0301000_I2_2.A00(r3, r6)
            if (r0 == 0) goto L_0x005e
            r4 = r6
            kotlin.coroutines.jvm.internal.KtCImplShape3S0301000_I2_2 r4 = (kotlin.coroutines.jvm.internal.KtCImplShape3S0301000_I2_2) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x005e
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r3 = r4.A02
            X.D0E r2 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r4.A00
            r1 = 1
            if (r0 == 0) goto L_0x004d
            if (r0 != r1) goto L_0x0064
            java.lang.Object r1 = r4.A01
            com.instagram.fanclub.creatorlist.SubscribedAndRecommendedCreatorListRepository r1 = (com.instagram.fanclub.creatorlist.SubscribedAndRecommendedCreatorListRepository) r1
            X.AnonymousClass0OU.A00(r3)
        L_0x0028:
            X.3b6 r3 = (X.C62903b6) r3
            boolean r0 = r3 instanceof X.AnonymousClass1jA
            if (r0 == 0) goto L_0x0044
            X.1jA r3 = (X.AnonymousClass1jA) r3
            java.lang.Object r0 = r3.A00
            X.4vm r0 = (X.C85794vm) r0
            X.4wE r1 = r1.A0B
            java.lang.Object r0 = r0.D7H()
            X.331 r0 = (X.AnonymousClass331) r0
            java.util.List r0 = r0.A00
            r1.CrC(r0)
        L_0x0041:
            kotlin.Unit r2 = kotlin.Unit.A00
        L_0x0043:
            return r2
        L_0x0044:
            boolean r0 = r3 instanceof X.AnonymousClass1jB
            if (r0 != 0) goto L_0x0041
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x004d:
            X.AnonymousClass0OU.A00(r3)
            com.instagram.fanclub.api.FanClubApi r0 = r5.A06
            r4.A01 = r5
            r4.A00 = r1
            java.lang.Object r3 = r0.A0H(r4)
            if (r3 == r2) goto L_0x0043
            r1 = r5
            goto L_0x0028
        L_0x005e:
            kotlin.coroutines.jvm.internal.KtCImplShape3S0301000_I2_2 r4 = new kotlin.coroutines.jvm.internal.KtCImplShape3S0301000_I2_2
            r4.<init>(r5, r6, r3)
            goto L_0x0016
        L_0x0064:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.creatorlist.SubscribedAndRecommendedCreatorListRepository.A02(X.8n9):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004f, code lost:
        if (r7.A01 == X.AnonymousClass22N.IN_PROGRESS) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0076, code lost:
        if (r3.A00 != X.AnonymousClass22N.IN_PROGRESS) goto L_0x0079;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A03(X.C146958n9 r8) {
        /*
            r7 = this;
            r3 = 36
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape3S0301000_I2_2.A00(r3, r8)
            if (r0 == 0) goto L_0x0092
            r5 = r8
            kotlin.coroutines.jvm.internal.KtCImplShape3S0301000_I2_2 r5 = (kotlin.coroutines.jvm.internal.KtCImplShape3S0301000_I2_2) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0092
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r2 = r5.A02
            X.D0E r4 = X.D0E.COROUTINE_SUSPENDED
            int r1 = r5.A00
            r6 = 2
            r0 = 1
            if (r1 == 0) goto L_0x003f
            if (r1 == r0) goto L_0x0037
            if (r1 != r6) goto L_0x0099
            java.lang.Object r3 = r5.A01
            com.instagram.fanclub.creatorlist.SubscribedAndRecommendedCreatorListRepository r3 = (com.instagram.fanclub.creatorlist.SubscribedAndRecommendedCreatorListRepository) r3
            X.AnonymousClass0OU.A00(r2)
        L_0x002b:
            X.4wE r1 = r3.A0C
            java.lang.Boolean r0 = X.C18180wK.A0X()
            r1.CrC(r0)
            kotlin.Unit r4 = kotlin.Unit.A00
        L_0x0036:
            return r4
        L_0x0037:
            java.lang.Object r3 = r5.A01
            com.instagram.fanclub.creatorlist.SubscribedAndRecommendedCreatorListRepository r3 = (com.instagram.fanclub.creatorlist.SubscribedAndRecommendedCreatorListRepository) r3
            X.AnonymousClass0OU.A00(r2)
            goto L_0x0065
        L_0x003f:
            X.AnonymousClass0OU.A00(r2)
            r5.A01 = r7
            r5.A00 = r0
            boolean r0 = r7.A05
            if (r0 == 0) goto L_0x0051
            X.22N r1 = r7.A01
            X.22N r0 = X.AnonymousClass22N.IN_PROGRESS
            r2 = 1
            if (r1 != r0) goto L_0x0052
        L_0x0051:
            r2 = 0
        L_0x0052:
            X.22N r1 = r7.A01
            X.22N r0 = X.AnonymousClass22N.INITIAL_FETCH
            if (r1 == r0) goto L_0x005a
            if (r2 == 0) goto L_0x008f
        L_0x005a:
            java.lang.String r0 = r7.A03
            java.lang.Object r0 = A01(r7, r0, r5)
            if (r0 != r4) goto L_0x008f
        L_0x0062:
            if (r0 == r4) goto L_0x0036
            r3 = r7
        L_0x0065:
            r5.A01 = r3
            r5.A00 = r6
            boolean r0 = r3.A05
            if (r0 != 0) goto L_0x0078
            boolean r0 = r3.A04
            if (r0 == 0) goto L_0x0078
            X.22N r1 = r3.A00
            X.22N r0 = X.AnonymousClass22N.IN_PROGRESS
            r2 = 1
            if (r1 != r0) goto L_0x0079
        L_0x0078:
            r2 = 0
        L_0x0079:
            X.22N r1 = r3.A00
            X.22N r0 = X.AnonymousClass22N.INITIAL_FETCH
            if (r1 == r0) goto L_0x0081
            if (r2 == 0) goto L_0x008c
        L_0x0081:
            java.lang.String r0 = r3.A02
            java.lang.Object r0 = A00(r3, r0, r5)
            if (r0 != r4) goto L_0x008c
        L_0x0089:
            if (r0 != r4) goto L_0x002b
            return r4
        L_0x008c:
            kotlin.Unit r0 = kotlin.Unit.A00
            goto L_0x0089
        L_0x008f:
            kotlin.Unit r0 = kotlin.Unit.A00
            goto L_0x0062
        L_0x0092:
            kotlin.coroutines.jvm.internal.KtCImplShape3S0301000_I2_2 r5 = new kotlin.coroutines.jvm.internal.KtCImplShape3S0301000_I2_2
            r5.<init>(r7, r8, r3)
            goto L_0x0016
        L_0x0099:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.creatorlist.SubscribedAndRecommendedCreatorListRepository.A03(X.8n9):java.lang.Object");
    }
}
