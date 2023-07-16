package com.instagram.barcelona.profile.ui;

import X.AnonymousClass0OY;
import X.AnonymousClass0wJ;
import X.AnonymousClass1uO;
import X.AnonymousClass3J5;
import X.AnonymousClass3LY;
import X.AnonymousClass46R;
import X.AnonymousClass6NK;
import X.AnonymousClass6VR;
import X.AnonymousClass7E6;
import X.AnonymousClass7p1;
import X.BBZ;
import X.C04220Ms;
import X.C04530Oa;
import X.C06750aI;
import X.C105566dd;
import X.C1198477g;
import X.C134637y5;
import X.C145018jf;
import X.C146958n9;
import X.C148838sG;
import X.C18180wK;
import X.C18190wL;
import X.C18230wP;
import X.C19462Awj;
import X.C19508AxV;
import X.C21839C2o;
import X.C23415Crh;
import X.C24805DaJ;
import X.C25237DiI;
import X.C25550Dnj;
import X.C27457Enn;
import X.C27952Ew2;
import X.C38039KHq;
import X.C58213En;
import X.C62793ak;
import X.C86074wE;
import X.C86094wG;
import X.C86154wM;
import X.C86164wN;
import X.C963764p;
import X.C964664y;
import X.C968566y;
import X.DIV;
import X.JUP;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0510000_I2;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape5S1000000_I2;
import com.instagram.barcelona.share.data.PermalinkRepository;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import java.util.List;
import kotlin.coroutines.jvm.internal.KtSLambdaShape16S0201000_I2_2;
import kotlin.coroutines.jvm.internal.KtSLambdaShape6S0200000_I2_1;

public final class ProfileViewModel extends C62793ak {
    public String A00;
    public String A01;
    public final JUP A02;
    public final C24805DaJ A03;
    public final C58213En A04;
    public final C1198477g A05;
    public final C134637y5 A06;
    public final AnonymousClass7p1 A07;
    public final C105566dd A08 = new C105566dd();
    public final PermalinkRepository A09;
    public final C19508AxV A0A;
    public final C19462Awj A0B;
    public final C21839C2o A0C;
    public final UserSession A0D;
    public final User A0E;
    public final List A0F;
    public final C04530Oa A0G;
    public final C86074wE A0H;
    public final C86074wE A0I;
    public final C86094wG A0J;
    public final C86094wG A0K;
    public final C86094wG A0L;

    public /* synthetic */ ProfileViewModel(C24805DaJ daJ, C58213En r9, C134637y5 r10, AnonymousClass7p1 r11, C21839C2o c2o, UserSession userSession, String str, String str2) {
        PermalinkRepository permalinkRepository = new PermalinkRepository(userSession);
        AnonymousClass1uO r3 = new AnonymousClass1uO(userSession);
        C1198477g A002 = AnonymousClass6NK.A00(userSession);
        C19462Awj A012 = C19462Awj.A01(userSession);
        C04220Ms.A06(A012);
        C04220Ms.A0B(A002, 11);
        this.A0D = userSession;
        this.A0C = c2o;
        this.A00 = str;
        this.A01 = str2;
        this.A07 = r11;
        this.A03 = daJ;
        this.A06 = r10;
        this.A09 = permalinkRepository;
        this.A04 = r9;
        this.A05 = A002;
        this.A0B = A012;
        this.A0G = AnonymousClass0OY.A02(C86164wN.A0y(r3, new C963764p(r3.A00), 10));
        C968566y r4 = C968566y.Posts;
        List A17 = C06750aI.A17(r4, C968566y.Replies);
        this.A0F = A17;
        this.A0E = AnonymousClass0wJ.A0Y(userSession);
        this.A0A = new C19508AxV(userSession, (C145018jf) null);
        this.A02 = new JUP(c2o, userSession, r10.A06);
        C27457Enn A0z = C18190wL.A0z(DIV.A01);
        this.A0H = A0z;
        this.A0K = A0z;
        C27457Enn A0z2 = C18190wL.A0z(new KtCSuperShape0S0510000_I2(r4, A17));
        this.A0I = A0z2;
        this.A0L = C18230wP.A0x((C148838sG) null, A0z2);
        this.A0J = r10.A0B;
        addCloseable(r10);
        if (this.A00 != null) {
            User A032 = AnonymousClass6VR.A00(userSession).A03(this.A00);
            if (A032 != null) {
                A03(this, A032);
            }
        } else if (this.A01 != null) {
            C25550Dnj A003 = AnonymousClass6VR.A00(userSession);
            User user = (User) A003.A02.get(this.A01);
            if (user != null) {
                A03(this, user);
                String id = user.getId();
                r10.A00 = id;
                r10.A02.A01 = id;
                r10.A03.A01 = id;
                AnonymousClass7p1 r1 = this.A07;
                r1.A00 = user.getId();
                r1.A01 = user.BK7();
            }
        }
        C25237DiI.A00((Integer) null, (C27952Ew2) null, C86154wM.A0x(this, (C146958n9) null, 38), AnonymousClass3J5.A00(this), 3);
        C25237DiI.A00((Integer) null, (C27952Ew2) null, C86154wM.A0x(this, (C146958n9) null, 39), AnonymousClass3J5.A00(this), 3);
        C25237DiI.A00((Integer) null, (C27952Ew2) null, C86154wM.A0x(this, (C146958n9) null, 40), AnonymousClass3J5.A00(this), 3);
        C38039KHq A004 = AnonymousClass3LY.A00(userSession);
        AnonymousClass3J5.A01(this, new KtSLambdaShape16S0201000_I2_2(this, (C146958n9) null, 16), new AnonymousClass7E6(A004).A02(AnonymousClass46R.class), 34);
        AnonymousClass3J5.A01(this, new KtSLambdaShape6S0200000_I2_1(this, (C146958n9) null, 35), new AnonymousClass7E6(A004).A02(BBZ.class), 34);
        C25237DiI.A00((Integer) null, (C27952Ew2) null, C86154wM.A0x(this, (C146958n9) null, 41), AnonymousClass3J5.A00(this), 3);
        A02(this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0061 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.instagram.barcelona.profile.ui.ProfileViewModel r7, java.lang.String r8, X.C146958n9 r9) {
        /*
            r3 = 13
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape2S0301000_I2_1.A00(r3, r9)
            if (r0 == 0) goto L_0x0062
            r5 = r9
            kotlin.coroutines.jvm.internal.KtCImplShape2S0301000_I2_1 r5 = (kotlin.coroutines.jvm.internal.KtCImplShape2S0301000_I2_1) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0062
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r5.A02
            X.D0E r4 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r5.A00
            r6 = 0
            r3 = 2
            r2 = 1
            if (r0 == 0) goto L_0x002b
            if (r0 == r2) goto L_0x004b
            if (r0 != r3) goto L_0x0068
            X.AnonymousClass0OU.A00(r1)
        L_0x0028:
            kotlin.Unit r4 = kotlin.Unit.A00
            return r4
        L_0x002b:
            X.AnonymousClass0OU.A00(r1)
            X.7y5 r1 = r7.A06
            java.lang.String r0 = r1.A00
            if (r0 != 0) goto L_0x0028
            r1.A00 = r8
            com.instagram.barcelona.profile.data.ProfileFeedDataSource r0 = r1.A02
            r0.A01 = r8
            com.instagram.barcelona.profile.data.ProfileFeedDataSource r0 = r1.A03
            r0.A01 = r8
            X.66y r0 = X.C968566y.Posts
            r5.A01 = r7
            r5.A00 = r2
            java.lang.Object r0 = r1.A03(r0, r5, r6)
            if (r0 != r4) goto L_0x0052
            return r4
        L_0x004b:
            java.lang.Object r7 = r5.A01
            com.instagram.barcelona.profile.ui.ProfileViewModel r7 = (com.instagram.barcelona.profile.ui.ProfileViewModel) r7
            X.AnonymousClass0OU.A00(r1)
        L_0x0052:
            X.7y5 r2 = r7.A06
            X.66y r1 = X.C968566y.Replies
            r0 = 0
            r5.A01 = r0
            r5.A00 = r3
            java.lang.Object r0 = r2.A03(r1, r5, r6)
            if (r0 != r4) goto L_0x0028
            return r4
        L_0x0062:
            kotlin.coroutines.jvm.internal.KtCImplShape2S0301000_I2_1 r5 = new kotlin.coroutines.jvm.internal.KtCImplShape2S0301000_I2_1
            r5.<init>(r7, r9, r3)
            goto L_0x0016
        L_0x0068:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.barcelona.profile.ui.ProfileViewModel.A00(com.instagram.barcelona.profile.ui.ProfileViewModel, java.lang.String, X.8n9):java.lang.Object");
    }

    public static final void A02(ProfileViewModel profileViewModel) {
        int i;
        C23415Crh crh = (C23415Crh) profileViewModel.A0G.getValue();
        String str = profileViewModel.A00;
        if (str != null) {
            i = 0;
        } else {
            str = profileViewModel.A01;
            if (str != null) {
                i = 1;
            } else {
                throw C18180wK.A0a("userId and userName are both null");
            }
        }
        crh.A01(new KtCSuperShape5S1000000_I2(str, i), new C964664y());
    }

    /* JADX WARNING: type inference failed for: r18v2, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r8v5, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x01a4, code lost:
        if (r12.A0E == false) goto L_0x01a6;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A03(com.instagram.barcelona.profile.ui.ProfileViewModel r27, com.instagram.user.model.User r28) {
        /*
            r6 = r28
            java.lang.String r2 = r6.getId()
            r0 = r27
            java.lang.String r1 = r0.A00
            boolean r1 = X.C04220Ms.A0I(r2, r1)
            if (r1 != 0) goto L_0x001c
            java.lang.String r2 = r6.BK7()
            java.lang.String r1 = r0.A01
            boolean r1 = X.C04220Ms.A0I(r2, r1)
            if (r1 == 0) goto L_0x0181
        L_0x001c:
            X.4wE r5 = r0.A0H
            boolean r1 = r6.A37()
            r8 = 0
            if (r1 == 0) goto L_0x00ee
            java.util.List r1 = r6.A1Q()
            r7 = 1
            if (r1 == 0) goto L_0x00e0
            java.util.Iterator r4 = r1.iterator()
        L_0x0030:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x00dd
            java.lang.Object r3 = r4.next()
            r1 = r3
            X.8m2 r1 = (X.C146318m2) r1
            com.instagram.api.schemas.IgUserBioLinkTypeEnum r2 = r1.AsC()
            com.instagram.api.schemas.IgUserBioLinkTypeEnum r1 = com.instagram.api.schemas.IgUserBioLinkTypeEnum.EXTERNAL
            if (r2 != r1) goto L_0x0030
        L_0x0045:
            X.8m2 r3 = (X.C146318m2) r3
        L_0x0047:
            java.lang.String r12 = r6.getId()
            java.lang.String r13 = r6.BK7()
            java.lang.String r14 = r6.Ak1()
            com.instagram.common.typedurl.ImageUrl r9 = r6.B4M()
            java.lang.String r15 = r6.A0v()
            if (r3 == 0) goto L_0x00d8
            java.lang.String r16 = r3.getUrl()
            java.lang.String r17 = r3.AtF()
        L_0x0065:
            java.lang.Integer r11 = r6.A0n()
            boolean r19 = r6.BZi()
            X.D0g r10 = r6.A03
            boolean r20 = r6.A3Q()
            java.lang.Boolean r2 = r6.A0k()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r7)
            boolean r21 = X.C04220Ms.A0I(r2, r1)
            com.instagram.service.session.UserSession r4 = r0.A0D
            java.lang.String r3 = r4.getUserId()
            java.lang.String r2 = r6.getId()
            boolean r22 = X.C04220Ms.A0I(r3, r2)
            boolean r23 = r6.BRq()
            java.lang.Boolean r2 = r6.A0k()
            boolean r1 = X.C04220Ms.A0I(r2, r1)
            if (r1 == 0) goto L_0x00d5
            java.lang.String r1 = r6.getId()
            boolean r1 = X.C18250wR.A1J(r4, r1)
            if (r1 != 0) goto L_0x00d5
            X.D0g r1 = r6.A03
            X.D0g r2 = X.C23894D0g.FollowStatusRequested
            if (r1 == r2) goto L_0x00af
            X.D0g r2 = X.C23894D0g.FollowStatusNotFollowing
            if (r1 != r2) goto L_0x00d5
        L_0x00af:
            r24 = 1
        L_0x00b1:
            boolean r25 = r6.A3T()
            com.google.common.collect.ImmutableList r1 = r6.A06()
            if (r1 == 0) goto L_0x00e3
            r2 = 10
            java.util.List r1 = X.AnonymousClass00J.A0Q(r1, r2)
            if (r1 == 0) goto L_0x00e3
            java.util.ArrayList r8 = X.AnonymousClass0wJ.A0x(r1, r2)
            java.util.Iterator r1 = r1.iterator()
        L_0x00cb:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x00e3
            X.C86114wI.A1Q(r8, r1)
            goto L_0x00cb
        L_0x00d5:
            r24 = 0
            goto L_0x00b1
        L_0x00d8:
            r16 = r8
            r17 = r8
            goto L_0x0065
        L_0x00dd:
            r3 = r8
            goto L_0x0045
        L_0x00e0:
            r3 = r8
            goto L_0x0047
        L_0x00e3:
            r18 = r8
            boolean r26 = r6.A3M()
            X.5Hq r8 = new X.5Hq
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
        L_0x00ee:
            r5.CrC(r8)
            java.lang.String r1 = r6.getId()
            r0.A00 = r1
            java.lang.String r1 = r6.BK7()
            r0.A01 = r1
            X.4wE r8 = r0.A0I
        L_0x00ff:
            java.lang.Object r10 = r8.getValue()
            r1 = r10
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0510000_I2 r1 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0510000_I2) r1
            r28 = r1
            r7 = 0
            X.4wG r1 = r0.A0K
            r27 = r1
            java.lang.Object r12 = r27.getValue()
            X.5Hq r12 = (X.C89945Hq) r12
            if (r12 != 0) goto L_0x0182
            X.0ZV r14 = X.AnonymousClass0ZV.A00
        L_0x0117:
            r4 = 0
            r16 = 43
            r11 = r28
            r12 = r7
            r13 = r7
            r15 = r7
            r17 = r4
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0510000_I2 r1 = com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0510000_I2.A00(r11, r12, r13, r14, r15, r16, r17)
            boolean r1 = r8.ADi(r10, r1)
            if (r1 == 0) goto L_0x00ff
            java.lang.Object r1 = r27.getValue()
            X.5Hq r1 = (X.C89945Hq) r1
            r2 = 1
            if (r1 == 0) goto L_0x0181
            boolean r1 = r1.A0F
            if (r1 != r2) goto L_0x0181
        L_0x0138:
            java.lang.Object r2 = r8.getValue()
            r1 = r2
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0510000_I2 r1 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0510000_I2) r1
            java.util.Map r13 = X.AnonymousClass4WJ.A0A()
            r14 = 55
            r9 = r1
            r10 = r7
            r11 = r7
            r15 = r4
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0510000_I2 r1 = com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0510000_I2.A00(r9, r10, r11, r12, r13, r14, r15)
            boolean r1 = r8.ADi(r2, r1)
            if (r1 == 0) goto L_0x0138
            X.7y5 r5 = r0.A06
            com.instagram.barcelona.profile.data.ProfileFeedDataSource r2 = r5.A02
            X.4wE r1 = r2.A09
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0410000_I2 r0 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0410000_I2
            r0.<init>()
            r1.CrC(r0)
            X.4wE r0 = r2.A08
            X.0ZV r3 = X.AnonymousClass0ZV.A00
            r0.CrC(r3)
            r2.A02 = r4
            r2.A00 = r7
            com.instagram.barcelona.profile.data.ProfileFeedDataSource r2 = r5.A03
            X.4wE r1 = r2.A09
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0410000_I2 r0 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0410000_I2
            r0.<init>()
            r1.CrC(r0)
            X.4wE r0 = r2.A08
            r0.CrC(r3)
            r2.A02 = r4
            r2.A00 = r7
        L_0x0181:
            return
        L_0x0182:
            java.lang.String r14 = r12.A08
            com.instagram.common.typedurl.ImageUrl r13 = r12.A00
            java.lang.String r11 = r12.A04
            boolean r9 = r12.A0H
            java.lang.String r1 = r12.A07
            r20 = r1
            java.lang.String r6 = r12.A03
            java.lang.String r5 = r12.A06
            java.lang.String r4 = r12.A05
            java.lang.Integer r3 = r12.A02
            boolean r2 = r12.A0G
            if (r2 != 0) goto L_0x01a6
            X.D0g r15 = r12.A01
            X.D0g r1 = X.C23894D0g.FollowStatusFollowing
            if (r15 == r1) goto L_0x01a6
            boolean r1 = r12.A0E
            r26 = 0
            if (r1 != 0) goto L_0x01a8
        L_0x01a6:
            r26 = 1
        L_0x01a8:
            java.util.List r1 = r12.A09
            X.5Lz r15 = new X.5Lz
            r25 = r9
            r21 = r6
            r22 = r5
            r23 = r4
            r24 = r1
            r16 = r13
            r17 = r3
            r18 = r14
            r19 = r11
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r21 = r2 ^ 1
            X.D0g r4 = r12.A01
            boolean r3 = r12.A0B
            X.5Ly r1 = new X.5Ly
            r16 = r1
            r17 = r4
            r18 = r20
            r19 = r2
            r20 = r2
            r22 = r3
            r16.<init>(r17, r18, r19, r20, r21, r22)
            X.8iT[] r1 = new X.AnonymousClass8iT[]{r15, r1}
            java.util.List r14 = X.C06750aI.A17(r1)
            goto L_0x0117
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.barcelona.profile.ui.ProfileViewModel.A03(com.instagram.barcelona.profile.ui.ProfileViewModel, com.instagram.user.model.User):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b3, code lost:
        if (r6 == null) goto L_0x00b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00d2, code lost:
        if (X.C04220Ms.A0I(r8, r24.BK7()) == false) goto L_0x00d4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00aa A[LOOP:2: B:33:0x00a4->B:35:0x00aa, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00f8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.List A01(com.instagram.barcelona.profile.ui.ProfileViewModel r43, java.util.List r44) {
        /*
            java.util.ArrayList r4 = X.AnonymousClass0wJ.A0v()
            java.util.Iterator r18 = r44.iterator()
        L_0x0008:
            boolean r0 = r18.hasNext()
            r3 = 10
            if (r0 == 0) goto L_0x0138
            java.lang.Object r0 = r18.next()
            X.5I1 r0 = (X.AnonymousClass5I1) r0
            X.5HQ r2 = r0.A00
            java.util.List r0 = r2.A03
            r42 = r0
            java.util.ArrayList r1 = X.AnonymousClass0wJ.A0v()
            java.util.Iterator r17 = r42.iterator()
            r6 = 0
        L_0x0025:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x012e
            java.lang.Object r7 = r17.next()
            int r5 = r6 + 1
            if (r6 >= 0) goto L_0x0038
            X.C06750aI.A1A()
            r0 = 0
            throw r0
        L_0x0038:
            X.5IF r7 = (X.AnonymousClass5IF) r7
            boolean r14 = X.C18180wK.A1W(r6)
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape6S0100000_I2 r8 = r7.A00
            r0 = 0
            boolean r6 = com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape6S0100000_I2.A00(r0, r8)
            r13 = r43
            if (r6 == 0) goto L_0x00fa
            java.lang.Object r12 = r8.A00
            X.BKU r12 = (X.BKU) r12
            X.BKN r11 = r12.A0f
            X.5Ml r6 = r11.A1J
            if (r6 == 0) goto L_0x00b1
            X.5Mj r6 = r6.A03
            if (r6 == 0) goto L_0x00b1
            X.BKU r6 = r6.A02
            if (r6 == 0) goto L_0x00b2
            com.instagram.user.model.User r8 = r11.A1i
            if (r8 == 0) goto L_0x00b2
            java.lang.String r8 = r8.BK7()
        L_0x0063:
            X.BKN r9 = r6.A0f
            X.5Ml r9 = r9.A1J
            if (r9 == 0) goto L_0x00b6
            X.5Mj r9 = r9.A03
            if (r9 == 0) goto L_0x00b6
            boolean r10 = r9.A05
        L_0x006f:
            com.instagram.user.model.User r9 = r13.A0E
            r24 = r9
            com.instagram.service.session.UserSession r9 = r13.A0D
            r23 = r9
            java.lang.Boolean r25 = java.lang.Boolean.valueOf(r14)
            java.lang.String r9 = r2.A02
            r19 = r9
            java.lang.String r15 = r11.A4Y
            X.C04220Ms.A06(r15)
            r22 = r6
            if (r6 != 0) goto L_0x008a
            r22 = r12
        L_0x008a:
            X.67q r20 = X.C970267q.POST
            com.instagram.api.schemas.LineType r14 = r7.A01
            X.8em r13 = r7.A02
            boolean r9 = r7.A07
            com.instagram.user.model.User r12 = r7.A03
            if (r12 == 0) goto L_0x00ae
            java.lang.String r28 = r12.BK7()
        L_0x009a:
            java.util.List r12 = r7.A04
            java.util.ArrayList r7 = X.AnonymousClass0wJ.A0x(r12, r3)
            java.util.Iterator r12 = r12.iterator()
        L_0x00a4:
            boolean r16 = r12.hasNext()
            if (r16 == 0) goto L_0x00b8
            X.C86114wI.A1Q(r7, r12)
            goto L_0x00a4
        L_0x00ae:
            r28 = 0
            goto L_0x009a
        L_0x00b1:
            r6 = 0
        L_0x00b2:
            r8 = 0
            if (r6 == 0) goto L_0x00b6
            goto L_0x0063
        L_0x00b6:
            r10 = 0
            goto L_0x006f
        L_0x00b8:
            if (r6 == 0) goto L_0x00f8
            java.lang.String r6 = r11.A4Y
        L_0x00bc:
            int r11 = r42.size()
            boolean r35 = X.C18230wP.A1W(r5, r11)
            r36 = 1
            if (r10 != 0) goto L_0x00d4
            java.lang.String r10 = r24.BK7()
            boolean r10 = X.C04220Ms.A0I(r8, r10)
            r38 = 1
            if (r10 != 0) goto L_0x00d6
        L_0x00d4:
            r38 = 0
        L_0x00d6:
            r32 = 3686400(0x384000, float:5.165747E-39)
            r21 = r13
            r26 = r19
            r27 = r15
            r29 = r6
            r30 = r8
            r31 = r7
            r33 = r9
            r34 = r0
            r37 = r0
            r39 = r0
            r40 = r0
            r41 = r0
            r19 = r14
            java.util.List r0 = X.C121517Gn.A01(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41)
            goto L_0x0125
        L_0x00f8:
            r6 = 0
            goto L_0x00bc
        L_0x00fa:
            r6 = 1
            boolean r6 = com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape6S0100000_I2.A00(r6, r8)
            if (r6 == 0) goto L_0x0133
            X.7Dy r19 = X.C121067Dy.A00
            com.instagram.user.model.User r10 = r13.A0E
            java.lang.String r9 = r2.A02
            java.lang.Object r8 = r8.A00
            com.instagram.pendingmedia.model.PendingMedia r8 = (com.instagram.pendingmedia.model.PendingMedia) r8
            X.67q r20 = X.C970267q.POST
            com.instagram.user.model.User r6 = r7.A03
            if (r6 == 0) goto L_0x012b
            java.lang.String r25 = r6.BK7()
        L_0x0115:
            java.lang.Boolean r23 = java.lang.Boolean.valueOf(r14)
            r21 = r8
            r22 = r10
            r24 = r9
            r26 = r0
            java.util.List r0 = r19.A01(r20, r21, r22, r23, r24, r25, r26)
        L_0x0125:
            X.C000300e.A0r(r0, r1)
            r6 = r5
            goto L_0x0025
        L_0x012b:
            r25 = 0
            goto L_0x0115
        L_0x012e:
            X.C000300e.A0r(r1, r4)
            goto L_0x0008
        L_0x0133:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x0138:
            java.util.ArrayList r5 = X.AnonymousClass0wJ.A0x(r4, r3)
            java.util.Iterator r2 = r4.iterator()
        L_0x0140:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0155
            java.lang.Object r1 = r2.next()
            X.8mY r1 = (X.C146628mY) r1
            X.5HK r0 = new X.5HK
            r0.<init>(r1)
            r5.add(r0)
            goto L_0x0140
        L_0x0155:
            java.util.HashSet r4 = X.C18200wM.A0u()
            java.util.ArrayList r3 = X.AnonymousClass0wJ.A0v()
            java.util.Iterator r2 = r5.iterator()
        L_0x0161:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0178
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.5HK r0 = (X.AnonymousClass5HK) r0
            X.8mY r0 = r0.A00
            java.lang.Object r0 = r0.getKey()
            X.C86164wN.A1G(r0, r1, r4, r3)
            goto L_0x0161
        L_0x0178:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.barcelona.profile.ui.ProfileViewModel.A01(com.instagram.barcelona.profile.ui.ProfileViewModel, java.util.List):java.util.List");
    }
}
