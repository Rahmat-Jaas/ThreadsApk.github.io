package com.instagram.fanclub.memberlist.repository;

import X.AnonymousClass006;
import X.AnonymousClass0ZV;
import X.AnonymousClass0i4;
import X.C148838sG;
import X.C18180wK;
import X.C18190wL;
import X.C18200wM;
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

public final class CreatorMessagingSelectionScreenRepository implements AnonymousClass0i4 {
    public final C28172Ezi A00;
    public final C86094wG A01;
    public final C86094wG A02;
    public final C86094wG A03;
    public final C86094wG A04;
    public final C86094wG A05;
    public final C86094wG A06;
    public final FanClubApi A07;
    public final String A08;
    public final C86084wF A09;
    public final C86074wE A0A;
    public final C86074wE A0B;
    public final C86074wE A0C;
    public final C86074wE A0D;
    public final C86074wE A0E;
    public final C86074wE A0F;

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(java.lang.String r9, java.lang.String r10, X.C146958n9 r11) {
        /*
            r8 = this;
            r3 = 40
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape3S0301000_I2_2.A00(r3, r11)
            if (r0 == 0) goto L_0x00af
            r4 = r11
            kotlin.coroutines.jvm.internal.KtCImplShape3S0301000_I2_2 r4 = (kotlin.coroutines.jvm.internal.KtCImplShape3S0301000_I2_2) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00af
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r4.A02
            X.D0E r3 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r4.A00
            r5 = 2
            r2 = 1
            if (r0 == 0) goto L_0x002a
            if (r0 == r2) goto L_0x0044
            if (r0 != r5) goto L_0x00b6
            X.AnonymousClass0OU.A00(r1)
        L_0x0027:
            kotlin.Unit r3 = kotlin.Unit.A00
        L_0x0029:
            return r3
        L_0x002a:
            X.AnonymousClass0OU.A00(r1)
            if (r9 != 0) goto L_0x0036
            X.4wE r1 = r8.A0F
            X.0ZV r0 = X.AnonymousClass0ZV.A00
            r1.CrC(r0)
        L_0x0036:
            com.instagram.fanclub.api.FanClubApi r0 = r8.A07
            r4.A01 = r8
            r4.A00 = r2
            java.lang.Object r1 = r0.A05(r9, r10, r4)
            if (r1 == r3) goto L_0x0029
            r6 = r8
            goto L_0x004b
        L_0x0044:
            java.lang.Object r6 = r4.A01
            com.instagram.fanclub.memberlist.repository.CreatorMessagingSelectionScreenRepository r6 = (com.instagram.fanclub.memberlist.repository.CreatorMessagingSelectionScreenRepository) r6
            X.AnonymousClass0OU.A00(r1)
        L_0x004b:
            X.3b6 r1 = (X.C62903b6) r1
            boolean r0 = r1 instanceof X.AnonymousClass1jA
            if (r0 == 0) goto L_0x00a6
            X.1jA r1 = (X.AnonymousClass1jA) r1
            java.lang.Object r7 = r1.A00
            X.4vm r7 = (X.C85794vm) r7
            X.4wE r2 = r6.A0F
            java.lang.Object r1 = r2.getValue()
            java.util.Collection r1 = (java.util.Collection) r1
            java.lang.Object r0 = r7.D7H()
            X.3BD r0 = (X.AnonymousClass3BD) r0
            java.util.List r0 = r0.A01
            java.util.List r0 = X.AnonymousClass00J.A0V(r0, r1)
            r2.CrC(r0)
            X.4wE r1 = r6.A0D
            java.lang.Object r0 = r7.D7H()
            X.3BD r0 = (X.AnonymousClass3BD) r0
            java.lang.String r0 = r0.A00
            r1.CrC(r0)
            X.4wE r1 = r6.A0C
            java.lang.Object r0 = r7.D7H()
            X.3BD r0 = (X.AnonymousClass3BD) r0
            boolean r0 = r0.A02
            X.C86074wE.A01(r1, r0)
            X.1jA r1 = X.C62903b6.A03()
        L_0x008c:
            boolean r0 = r1 instanceof X.AnonymousClass1jA
            if (r0 != 0) goto L_0x0027
            boolean r0 = r1 instanceof X.AnonymousClass1jB
            if (r0 == 0) goto L_0x00bb
            X.1jB r1 = (X.AnonymousClass1jB) r1
            java.lang.Object r2 = r1.A00
            X.4wF r1 = r6.A09
            r0 = 0
            r4.A01 = r0
            r4.A00 = r5
            java.lang.Object r0 = r1.emit(r2, r4)
            if (r0 != r3) goto L_0x0027
            return r3
        L_0x00a6:
            boolean r0 = r1 instanceof X.AnonymousClass1jB
            if (r0 != 0) goto L_0x008c
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x00af:
            kotlin.coroutines.jvm.internal.KtCImplShape3S0301000_I2_2 r4 = new kotlin.coroutines.jvm.internal.KtCImplShape3S0301000_I2_2
            r4.<init>(r8, r11, r3)
            goto L_0x0016
        L_0x00b6:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x00bb:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.memberlist.repository.CreatorMessagingSelectionScreenRepository.A00(java.lang.String, java.lang.String, X.8n9):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(X.C146958n9 r7) {
        /*
            r6 = this;
            r3 = 38
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape3S0301000_I2_2.A00(r3, r7)
            if (r0 == 0) goto L_0x005f
            r5 = r7
            kotlin.coroutines.jvm.internal.KtCImplShape3S0301000_I2_2 r5 = (kotlin.coroutines.jvm.internal.KtCImplShape3S0301000_I2_2) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x005f
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r4 = r5.A02
            X.D0E r3 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r5.A00
            r2 = 1
            if (r0 == 0) goto L_0x004d
            if (r0 != r2) goto L_0x0065
            java.lang.Object r1 = r5.A01
            com.instagram.fanclub.memberlist.repository.CreatorMessagingSelectionScreenRepository r1 = (com.instagram.fanclub.memberlist.repository.CreatorMessagingSelectionScreenRepository) r1
            X.AnonymousClass0OU.A00(r4)
        L_0x0028:
            X.3b6 r4 = (X.C62903b6) r4
            boolean r0 = r4 instanceof X.AnonymousClass1jA
            if (r0 == 0) goto L_0x0044
            X.1jA r4 = (X.AnonymousClass1jA) r4
            java.lang.Object r0 = r4.A00
            X.4vm r0 = (X.C85794vm) r0
            X.4wE r1 = r1.A0A
            java.lang.Object r0 = r0.D7H()
            X.32v r0 = (X.C553532v) r0
            java.util.List r0 = r0.A00
            r1.CrC(r0)
        L_0x0041:
            kotlin.Unit r3 = kotlin.Unit.A00
        L_0x0043:
            return r3
        L_0x0044:
            boolean r0 = r4 instanceof X.AnonymousClass1jB
            if (r0 != 0) goto L_0x0041
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x004d:
            X.AnonymousClass0OU.A00(r4)
            com.instagram.fanclub.api.FanClubApi r1 = r6.A07
            r0 = 0
            r5.A01 = r6
            r5.A00 = r2
            java.lang.Object r4 = r1.A0K(r5, r0)
            if (r4 == r3) goto L_0x0043
            r1 = r6
            goto L_0x0028
        L_0x005f:
            kotlin.coroutines.jvm.internal.KtCImplShape3S0301000_I2_2 r5 = new kotlin.coroutines.jvm.internal.KtCImplShape3S0301000_I2_2
            r5.<init>(r6, r7, r3)
            goto L_0x0016
        L_0x0065:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.memberlist.repository.CreatorMessagingSelectionScreenRepository.A01(X.8n9):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A02(X.C146958n9 r12) {
        /*
            r11 = this;
            r3 = 39
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape3S0301000_I2_2.A00(r3, r12)
            if (r0 == 0) goto L_0x009d
            r4 = r12
            kotlin.coroutines.jvm.internal.KtCImplShape3S0301000_I2_2 r4 = (kotlin.coroutines.jvm.internal.KtCImplShape3S0301000_I2_2) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x009d
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r2 = r4.A02
            X.D0E r1 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r4.A00
            r6 = 1
            if (r0 == 0) goto L_0x0085
            if (r0 != r6) goto L_0x00a4
            java.lang.Object r5 = r4.A01
            com.instagram.fanclub.memberlist.repository.CreatorMessagingSelectionScreenRepository r5 = (com.instagram.fanclub.memberlist.repository.CreatorMessagingSelectionScreenRepository) r5
            X.AnonymousClass0OU.A00(r2)
        L_0x0028:
            X.3b6 r2 = (X.C62903b6) r2
            boolean r0 = r2 instanceof X.AnonymousClass1jA
            if (r0 == 0) goto L_0x007c
            X.1jA r2 = (X.AnonymousClass1jA) r2
            java.lang.Object r2 = r2.A00
            com.facebook.pando.TreeJNI r2 = (com.facebook.pando.TreeJNI) r2
            if (r2 == 0) goto L_0x007a
            java.lang.Class<com.instagram.fanclub.api.FanClubInfoForCreatorResponseImpl$XigUserByIgidV2> r1 = com.instagram.fanclub.api.FanClubInfoForCreatorResponseImpl.XigUserByIgidV2.class
            java.lang.String r0 = "xig_user_by_igid_v2(id:$user_id)"
            com.facebook.pando.TreeJNI r2 = r2.getTreeValue(r0, r1)
            if (r2 == 0) goto L_0x007a
            java.lang.Class<com.instagram.fanclub.api.FanClubInfoForCreatorResponseImpl$XigUserByIgidV2$FanClub> r1 = com.instagram.fanclub.api.FanClubInfoForCreatorResponseImpl.XigUserByIgidV2.FanClub.class
            java.lang.String r0 = "fan_club"
            com.facebook.pando.TreeJNI r0 = r2.getTreeValue(r0, r1)
            com.instagram.fanclub.api.FanClubInfoForCreatorResponseImpl$XigUserByIgidV2$FanClub r0 = (com.instagram.fanclub.api.FanClubInfoForCreatorResponseImpl.XigUserByIgidV2.FanClub) r0
            if (r0 == 0) goto L_0x007a
            com.instagram.fanclub.api.FanClubInfoForCreatorResponseImpl$XigUserByIgidV2$FanClub$Package r4 = r0.A00()
        L_0x0050:
            X.4wE r3 = r5.A0E
            r0 = 0
            if (r4 == 0) goto L_0x0078
            java.lang.Class<com.instagram.fanclub.api.FanClubInfoForCreatorResponseImpl$XigUserByIgidV2$FanClub$Package$Members> r2 = com.instagram.fanclub.api.FanClubInfoForCreatorResponseImpl.XigUserByIgidV2.FanClub.Package.Members.class
            java.lang.String r1 = "members"
            com.facebook.pando.TreeJNI r2 = r4.getTreeValue(r1, r2)
            if (r2 == 0) goto L_0x0078
            java.lang.String r1 = "count"
            int r1 = r2.getIntValue(r1)
        L_0x0065:
            X.C86074wE.A00(r3, r1)
            X.4wE r1 = r5.A0B
            if (r4 == 0) goto L_0x0072
            java.lang.String r0 = "connected_member_count"
            int r0 = r4.getIntValue(r0)
        L_0x0072:
            X.C86074wE.A00(r1, r0)
        L_0x0075:
            kotlin.Unit r1 = kotlin.Unit.A00
        L_0x0077:
            return r1
        L_0x0078:
            r1 = 0
            goto L_0x0065
        L_0x007a:
            r4 = 0
            goto L_0x0050
        L_0x007c:
            boolean r0 = r2 instanceof X.AnonymousClass1jB
            if (r0 != 0) goto L_0x0075
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x0085:
            X.AnonymousClass0OU.A00(r2)
            com.instagram.fanclub.api.FanClubApi r2 = r11.A07
            java.lang.String r3 = r11.A08
            r4.A01 = r11
            r4.A00 = r6
            r5 = 0
            r7 = r5
            r8 = r5
            r9 = r5
            r10 = r5
            java.lang.Object r2 = r2.A0B(r3, r4, r5, r6, r7, r8, r9, r10)
            if (r2 == r1) goto L_0x0077
            r5 = r11
            goto L_0x0028
        L_0x009d:
            kotlin.coroutines.jvm.internal.KtCImplShape3S0301000_I2_2 r4 = new kotlin.coroutines.jvm.internal.KtCImplShape3S0301000_I2_2
            r4.<init>(r11, r12, r3)
            goto L_0x0016
        L_0x00a4:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.memberlist.repository.CreatorMessagingSelectionScreenRepository.A02(X.8n9):java.lang.Object");
    }

    public final void onSessionWillEnd() {
        C86074wE r0 = this.A0A;
        AnonymousClass0ZV r1 = AnonymousClass0ZV.A00;
        r0.CrC(r1);
        this.A0F.CrC(r1);
        this.A0D.CrC((Object) null);
        this.A0C.CrC(C18180wK.A0Y());
    }

    public CreatorMessagingSelectionScreenRepository(FanClubApi fanClubApi, String str) {
        boolean A1Z = C18200wM.A1Z(str);
        this.A07 = fanClubApi;
        this.A08 = str;
        AnonymousClass0ZV r1 = AnonymousClass0ZV.A00;
        C27457Enn A0z = C18190wL.A0z(r1);
        this.A0A = A0z;
        C27457Enn A0z2 = C18190wL.A0z(0);
        this.A0E = A0z2;
        C27457Enn A0z3 = C18190wL.A0z(0);
        this.A0B = A0z3;
        C27457Enn A0z4 = C18190wL.A0z(r1);
        this.A0F = A0z4;
        C27457Enn A0z5 = C18190wL.A0z(DIV.A01);
        this.A0D = A0z5;
        C27457Enn A0z6 = C18190wL.A0z(Boolean.valueOf(A1Z));
        this.A0C = A0z6;
        C27456Enm enm = new C27456Enm(AnonymousClass006.A00, 0, 0);
        this.A09 = enm;
        this.A01 = C18230wP.A0x((C148838sG) null, A0z);
        this.A05 = C18230wP.A0x((C148838sG) null, A0z2);
        this.A02 = C18230wP.A0x((C148838sG) null, A0z3);
        this.A06 = C18230wP.A0x((C148838sG) null, A0z4);
        this.A04 = C18230wP.A0x((C148838sG) null, A0z5);
        this.A03 = C18230wP.A0x((C148838sG) null, A0z6);
        this.A00 = new C27198Efl((C148838sG) null, enm);
    }
}
