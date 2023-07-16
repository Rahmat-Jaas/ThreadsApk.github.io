package com.instagram.fanclub.memberlist.repository;

import X.AnonymousClass006;
import X.AnonymousClass0ZV;
import X.AnonymousClass0i4;
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
import com.instagram.fanclub.api.FanClubApi;
import com.instagram.service.session.UserSession;

public final class FanClubMemberListCategoryRepository implements AnonymousClass0i4 {
    public final C86074wE A00;
    public final C86074wE A01;
    public final C28172Ezi A02;
    public final C86094wG A03;
    public final C86094wG A04;
    public final C86094wG A05;
    public final C86094wG A06;
    public final FanClubApi A07;
    public final UserSession A08;
    public final C86084wF A09;
    public final C86074wE A0A;
    public final C86074wE A0B;

    public FanClubMemberListCategoryRepository(FanClubApi fanClubApi, UserSession userSession) {
        C04220Ms.A0B(userSession, 2);
        this.A07 = fanClubApi;
        this.A08 = userSession;
        C27457Enn A0z = C18190wL.A0z("");
        this.A0A = A0z;
        C27457Enn A0z2 = C18190wL.A0z(AnonymousClass0ZV.A00);
        this.A00 = A0z2;
        C27457Enn A0z3 = C18190wL.A0z(DIV.A01);
        this.A01 = A0z3;
        C27457Enn A0z4 = C18190wL.A0z(0);
        this.A0B = A0z4;
        C27456Enm enm = new C27456Enm(AnonymousClass006.A00, 0, 0);
        this.A09 = enm;
        this.A03 = C18230wP.A0x((C148838sG) null, A0z);
        this.A04 = C18230wP.A0x((C148838sG) null, A0z2);
        this.A06 = C18230wP.A0x((C148838sG) null, A0z3);
        this.A05 = C18230wP.A0x((C148838sG) null, A0z4);
        this.A02 = new C27198Efl((C148838sG) null, enm);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(com.instagram.api.schemas.FanClubCategoryType r8, X.C146958n9 r9, boolean r10) {
        /*
            r7 = this;
            r3 = 41
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape3S0301000_I2_2.A00(r3, r9)
            if (r0 == 0) goto L_0x00b0
            r4 = r9
            kotlin.coroutines.jvm.internal.KtCImplShape3S0301000_I2_2 r4 = (kotlin.coroutines.jvm.internal.KtCImplShape3S0301000_I2_2) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00b0
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r4.A02
            X.D0E r3 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r4.A00
            r5 = 2
            r2 = 1
            if (r0 == 0) goto L_0x0032
            if (r0 == r2) goto L_0x002a
            if (r0 != r5) goto L_0x00b7
            X.AnonymousClass0OU.A00(r1)
        L_0x0027:
            kotlin.Unit r3 = kotlin.Unit.A00
        L_0x0029:
            return r3
        L_0x002a:
            java.lang.Object r6 = r4.A01
            com.instagram.fanclub.memberlist.repository.FanClubMemberListCategoryRepository r6 = (com.instagram.fanclub.memberlist.repository.FanClubMemberListCategoryRepository) r6
            X.AnonymousClass0OU.A00(r1)
            goto L_0x0056
        L_0x0032:
            X.AnonymousClass0OU.A00(r1)
            X.4wE r1 = r7.A01
            r0 = 0
            r1.CrC(r0)
            X.4wE r1 = r7.A0A
            java.lang.String r0 = ""
            r1.CrC(r0)
            X.4wE r1 = r7.A00
            X.0ZV r0 = X.AnonymousClass0ZV.A00
            r1.CrC(r0)
            com.instagram.fanclub.api.FanClubApi r0 = r7.A07
            r4.A01 = r7
            r4.A00 = r2
            java.lang.Object r1 = r0.A02(r8, r4, r10)
            if (r1 == r3) goto L_0x0029
            r6 = r7
        L_0x0056:
            X.3b6 r1 = (X.C62903b6) r1
            boolean r0 = r1 instanceof X.AnonymousClass1jA
            if (r0 == 0) goto L_0x00a7
            X.1jA r1 = (X.AnonymousClass1jA) r1
            java.lang.Object r2 = r1.A00
            X.4vm r2 = (X.C85794vm) r2
            X.4wE r1 = r6.A0A
            java.lang.Object r0 = r2.D7H()
            X.39a r0 = (X.C569139a) r0
            java.lang.String r0 = r0.A01
            r1.CrC(r0)
            X.4wE r1 = r6.A00
            java.lang.Object r0 = r2.D7H()
            X.39a r0 = (X.C569139a) r0
            java.util.List r0 = r0.A02
            r1.CrC(r0)
            X.4wE r1 = r6.A0B
            java.lang.Object r0 = r2.D7H()
            X.39a r0 = (X.C569139a) r0
            int r0 = r0.A00
            X.C86074wE.A00(r1, r0)
            X.1jA r1 = X.C62903b6.A03()
        L_0x008d:
            boolean r0 = r1 instanceof X.AnonymousClass1jA
            if (r0 != 0) goto L_0x0027
            boolean r0 = r1 instanceof X.AnonymousClass1jB
            if (r0 == 0) goto L_0x00bc
            X.1jB r1 = (X.AnonymousClass1jB) r1
            java.lang.Object r2 = r1.A00
            X.4wF r1 = r6.A09
            r0 = 0
            r4.A01 = r0
            r4.A00 = r5
            java.lang.Object r0 = r1.emit(r2, r4)
            if (r0 != r3) goto L_0x0027
            return r3
        L_0x00a7:
            boolean r0 = r1 instanceof X.AnonymousClass1jB
            if (r0 != 0) goto L_0x008d
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x00b0:
            kotlin.coroutines.jvm.internal.KtCImplShape3S0301000_I2_2 r4 = new kotlin.coroutines.jvm.internal.KtCImplShape3S0301000_I2_2
            r4.<init>(r7, r9, r3)
            goto L_0x0016
        L_0x00b7:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x00bc:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.memberlist.repository.FanClubMemberListCategoryRepository.A00(com.instagram.api.schemas.FanClubCategoryType, X.8n9, boolean):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(com.instagram.user.model.User r7, X.C146958n9 r8) {
        /*
            r6 = this;
            r3 = 34
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape1S0401000_I2_1.A00(r3, r8)
            if (r0 == 0) goto L_0x0080
            r5 = r8
            kotlin.coroutines.jvm.internal.KtCImplShape1S0401000_I2_1 r5 = (kotlin.coroutines.jvm.internal.KtCImplShape1S0401000_I2_1) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0080
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r2 = r5.A03
            X.D0E r4 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r5.A00
            r3 = 1
            if (r0 == 0) goto L_0x0058
            if (r0 != r3) goto L_0x008f
            java.lang.Object r7 = r5.A02
            java.lang.Object r1 = r5.A01
            com.instagram.fanclub.memberlist.repository.FanClubMemberListCategoryRepository r1 = (com.instagram.fanclub.memberlist.repository.FanClubMemberListCategoryRepository) r1
            X.AnonymousClass0OU.A00(r2)
        L_0x002a:
            r4 = r2
            boolean r0 = r2 instanceof X.AnonymousClass1jA
            if (r0 == 0) goto L_0x0086
            X.4wE r4 = r1.A00
            java.lang.Object r0 = r4.getValue()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r3 = X.AnonymousClass0wJ.A0v()
            java.util.Iterator r2 = r0.iterator()
        L_0x003f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0094
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1100000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1100000_I2) r0
            java.lang.Object r0 = r0.A00
            boolean r0 = X.C04220Ms.A0I(r0, r7)
            if (r0 != 0) goto L_0x003f
            r3.add(r1)
            goto L_0x003f
        L_0x0058:
            X.AnonymousClass0OU.A00(r2)
            com.instagram.fanclub.api.FanClubApi r2 = r6.A07
            X.0Ok r1 = X.C06810aP.A01
            com.instagram.service.session.UserSession r0 = r6.A08
            com.instagram.user.model.User r0 = r1.A01(r0)
            X.4tY r0 = r0.A0I()
            if (r0 == 0) goto L_0x009c
            java.lang.String r1 = r0.AhE()
            if (r1 == 0) goto L_0x009c
            java.lang.String r0 = r7.getId()
            X.C18240wQ.A1M(r6, r7, r5, r3)
            java.lang.Object r2 = r2.A04(r1, r0, r5)
            if (r2 == r4) goto L_0x009b
            r1 = r6
            goto L_0x002a
        L_0x0080:
            kotlin.coroutines.jvm.internal.KtCImplShape1S0401000_I2_1 r5 = new kotlin.coroutines.jvm.internal.KtCImplShape1S0401000_I2_1
            r5.<init>(r6, r8, r3)
            goto L_0x0016
        L_0x0086:
            boolean r0 = r2 instanceof X.AnonymousClass1jB
            if (r0 != 0) goto L_0x009b
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x008f:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x0094:
            r4.CrC(r3)
            X.1jA r4 = X.C62903b6.A03()
        L_0x009b:
            return r4
        L_0x009c:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0b()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.memberlist.repository.FanClubMemberListCategoryRepository.A01(com.instagram.user.model.User, X.8n9):java.lang.Object");
    }

    public final void onSessionWillEnd() {
        this.A0A.CrC("");
        this.A00.CrC(AnonymousClass0ZV.A00);
    }
}
