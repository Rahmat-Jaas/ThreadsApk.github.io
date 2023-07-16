package com.instagram.appreciation.giftfeed.repository;

import X.AnonymousClass5z2;
import X.AnonymousClass5z3;
import X.AnonymousClass764;
import X.C04220Ms;
import X.C100976Pk;
import X.C111856oX;
import X.C148838sG;
import X.C18190wL;
import X.C18230wP;
import X.C19554AyF;
import X.C27457Enn;
import X.C86074wE;
import X.C86094wG;
import X.C89875Hj;
import com.instagram.service.session.UserSession;

public final class AppreciationGiftFeedRepository {
    public long A00 = -1;
    public final C111856oX A01;
    public final AppreciationGiftFeedDataSource A02;
    public final AnonymousClass764 A03;
    public final C19554AyF A04;
    public final UserSession A05;
    public final String A06;
    public final C86074wE A07;
    public final C86094wG A08;

    public /* synthetic */ AppreciationGiftFeedRepository(UserSession userSession, String str) {
        AppreciationGiftFeedDataSource appreciationGiftFeedDataSource = new AppreciationGiftFeedDataSource(userSession);
        C111856oX r2 = new C111856oX(userSession);
        AnonymousClass764 r1 = new AnonymousClass764(userSession);
        C19554AyF A022 = C19554AyF.A02();
        C04220Ms.A06(A022);
        this.A05 = userSession;
        this.A06 = str;
        this.A02 = appreciationGiftFeedDataSource;
        this.A01 = r2;
        this.A03 = r1;
        this.A04 = A022;
        C27457Enn A0z = C18190wL.A0z(AnonymousClass5z3.A00);
        this.A07 = A0z;
        this.A08 = C18230wP.A0x((C148838sG) null, A0z);
    }

    public static final C89875Hj A00(AppreciationGiftFeedRepository appreciationGiftFeedRepository) {
        C100976Pk r1 = (C100976Pk) appreciationGiftFeedRepository.A07.getValue();
        if (r1 instanceof AnonymousClass5z2) {
            return (C89875Hj) ((AnonymousClass5z2) r1).A00;
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0118, code lost:
        if (r12 == false) goto L_0x011a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x013f  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(java.lang.Long r23, java.lang.String r24, X.C146958n9 r25, boolean r26) {
        /*
            r22 = this;
            r6 = r23
            r0 = r24
            r7 = 15
            r8 = r25
            boolean r1 = kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2.A00(r7, r8)
            r5 = r22
            if (r1 == 0) goto L_0x00d6
            r4 = r8
            kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2 r4 = (kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2) r4
            int r3 = r4.A00
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r3 & r2
            if (r1 == 0) goto L_0x00d6
            int r3 = r3 - r2
            r4.A00 = r3
        L_0x001e:
            java.lang.Object r8 = r4.A03
            X.D0E r3 = X.D0E.COROUTINE_SUSPENDED
            int r1 = r4.A00
            r7 = 1
            if (r1 == 0) goto L_0x007d
            if (r1 != r7) goto L_0x013a
            java.lang.Object r0 = r4.A02
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r2 = r4.A01
            com.instagram.appreciation.giftfeed.repository.AppreciationGiftFeedRepository r2 = (com.instagram.appreciation.giftfeed.repository.AppreciationGiftFeedRepository) r2
            X.AnonymousClass0OU.A00(r8)
        L_0x0034:
            X.3b6 r8 = (X.C62903b6) r8
            boolean r1 = r8 instanceof X.AnonymousClass1jA
            if (r1 == 0) goto L_0x013f
            X.4wE r5 = r2.A07
            X.764 r9 = r2.A03
            X.1jA r8 = (X.AnonymousClass1jA) r8
            java.lang.Object r8 = r8.A00
            X.3C1 r8 = (X.AnonymousClass3C1) r8
            X.6oX r4 = r2.A01
            r6 = 0
            X.C04220Ms.A0B(r0, r6)
            android.content.SharedPreferences r3 = r4.A00
            java.lang.String r2 = "gifts_feed_non_recorded_gifter_disclaimer"
            r1 = 95
            java.lang.String r1 = X.AnonymousClass00U.A0N(r2, r0, r1)
            boolean r1 = r3.getBoolean(r1, r6)
            r12 = r1 ^ 1
            X.C04220Ms.A0B(r8, r6)
            java.util.List r1 = r8.A02
            r3 = 10
            java.util.ArrayList r14 = X.AnonymousClass0wJ.A0x(r1, r3)
            java.util.Iterator r2 = r1.iterator()
        L_0x0069:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x00dd
            java.lang.Object r1 = r2.next()
            X.16m r1 = (X.C208816m) r1
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1321100_I2 r1 = X.AnonymousClass764.A00(r1, r9)
            r14.add(r1)
            goto L_0x0069
        L_0x007d:
            X.AnonymousClass0OU.A00(r8)
            if (r23 == 0) goto L_0x00d3
            long r1 = r6.longValue()
        L_0x0086:
            r5.A00 = r1
            X.5Hj r2 = A00(r5)
            X.4wE r1 = r5.A07
            if (r26 == 0) goto L_0x00d0
            if (r2 == 0) goto L_0x00d0
            X.0ZV r10 = X.AnonymousClass0ZV.A00
            java.util.List r11 = r2.A01
            boolean r12 = r2.A03
            java.lang.String r9 = r2.A00
            boolean r13 = r2.A04
            boolean r14 = r2.A07
            boolean r15 = r2.A06
            boolean r2 = r2.A05
            r17 = 0
            X.5Hj r8 = new X.5Hj
            r16 = r2
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            X.5z2 r2 = new X.5z2
            r2.<init>(r8)
        L_0x00b0:
            r1.CrC(r2)
            com.instagram.appreciation.giftfeed.repository.AppreciationGiftFeedDataSource r12 = r5.A02
            java.lang.String r2 = r5.A06
            if (r23 == 0) goto L_0x00c4
            long r10 = r6.longValue()
            r8 = -1
            int r1 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r1 != 0) goto L_0x00c4
            r6 = 0
        L_0x00c4:
            X.C86124wJ.A1S(r5, r0, r4, r7)
            java.lang.Object r8 = r12.A02(r6, r0, r2, r4)
            if (r8 == r3) goto L_0x0153
            r2 = r5
            goto L_0x0034
        L_0x00d0:
            X.5z3 r2 = X.AnonymousClass5z3.A00
            goto L_0x00b0
        L_0x00d3:
            r1 = -1
            goto L_0x0086
        L_0x00d6:
            kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2 r4 = new kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2
            r4.<init>(r5, r8, r7)
            goto L_0x001e
        L_0x00dd:
            java.util.List r1 = r8.A01
            java.util.ArrayList r15 = X.AnonymousClass0wJ.A0x(r1, r3)
            java.util.Iterator r11 = r1.iterator()
        L_0x00e7:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L_0x0106
            java.lang.Object r9 = r11.next()
            X.5HW r9 = (X.AnonymousClass5HW) r9
            long r1 = r9.A01
            java.lang.String r3 = r9.A04
            com.instagram.common.typedurl.SimpleImageUrl r10 = X.C18250wR.A0K(r3)
            java.lang.String r9 = r9.A02
            X.5HN r3 = new X.5HN
            r3.<init>(r10, r9, r1)
            r15.add(r3)
            goto L_0x00e7
        L_0x0106:
            X.16n r1 = r8.A00
            if (r1 == 0) goto L_0x0137
            boolean r3 = r1.A03
            java.lang.String r13 = r1.A00
        L_0x010e:
            boolean r1 = r8.A04
            r18 = r1 ^ 1
            boolean r2 = r8.A03
            if (r2 == 0) goto L_0x011a
            r19 = 1
            if (r12 != 0) goto L_0x011c
        L_0x011a:
            r19 = 0
        L_0x011c:
            X.5Hj r12 = new X.5Hj
            r20 = r6
            r21 = r7
            r16 = r3
            r17 = r1
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21)
            X.5z2 r1 = new X.5z2
            r1.<init>(r12)
            r5.CrC(r1)
            if (r2 == 0) goto L_0x0151
            r4.A00(r0)
            goto L_0x0151
        L_0x0137:
            r3 = 0
            r13 = 0
            goto L_0x010e
        L_0x013a:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x013f:
            boolean r0 = r8 instanceof X.AnonymousClass1jB
            if (r0 == 0) goto L_0x0151
            X.4wE r2 = r2.A07
            X.1jB r8 = (X.AnonymousClass1jB) r8
            java.lang.Object r1 = r8.A00
            X.5z1 r0 = new X.5z1
            r0.<init>(r1)
            r2.CrC(r0)
        L_0x0151:
            kotlin.Unit r3 = kotlin.Unit.A00
        L_0x0153:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.appreciation.giftfeed.repository.AppreciationGiftFeedRepository.A01(java.lang.Long, java.lang.String, X.8n9, boolean):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A02(java.lang.String r24, X.C146958n9 r25) {
        /*
            r23 = this;
            r3 = 16
            r4 = r25
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2.A00(r3, r4)
            r6 = r23
            if (r0 == 0) goto L_0x00d4
            r5 = r4
            kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2 r5 = (kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00d4
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x001a:
            java.lang.Object r8 = r5.A03
            X.D0E r4 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r5.A00
            r12 = 1
            if (r0 == 0) goto L_0x0064
            if (r0 != r12) goto L_0x0100
            java.lang.Object r1 = r5.A02
            X.5Hj r1 = (X.C89875Hj) r1
            java.lang.Object r3 = r5.A01
            com.instagram.appreciation.giftfeed.repository.AppreciationGiftFeedRepository r3 = (com.instagram.appreciation.giftfeed.repository.AppreciationGiftFeedRepository) r3
            X.AnonymousClass0OU.A00(r8)
        L_0x0030:
            X.3b6 r8 = (X.C62903b6) r8
            boolean r0 = r8 instanceof X.AnonymousClass1jA
            if (r0 == 0) goto L_0x0105
            X.4wE r2 = r3.A07
            X.764 r7 = r3.A03
            X.1jA r8 = (X.AnonymousClass1jA) r8
            java.lang.Object r6 = r8.A00
            X.37D r6 = (X.AnonymousClass37D) r6
            boolean r11 = X.C86154wM.A1Y(r12, r6, r1)
            java.util.List r5 = r1.A02
            java.util.List r0 = r6.A01
            java.util.ArrayList r4 = X.AnonymousClass0wJ.A0w(r0)
            java.util.Iterator r3 = r0.iterator()
        L_0x0050:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00db
            java.lang.Object r0 = r3.next()
            X.16m r0 = (X.C208816m) r0
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1321100_I2 r0 = X.AnonymousClass764.A00(r0, r7)
            r4.add(r0)
            goto L_0x0050
        L_0x0064:
            X.AnonymousClass0OU.A00(r8)
            X.5Hj r1 = A00(r6)
            if (r1 == 0) goto L_0x0117
            boolean r0 = r1.A05
            if (r0 != 0) goto L_0x0117
            boolean r9 = r1.A03
            if (r9 == 0) goto L_0x0117
            if (r9 != r12) goto L_0x0117
            java.lang.String r14 = r1.A00
            if (r14 == 0) goto L_0x0117
            boolean r0 = X.AnonymousClass8bQ.A0n(r14)
            if (r0 != 0) goto L_0x0117
            X.4wE r8 = r6.A07
            java.util.List r15 = r1.A02
            java.util.List r7 = r1.A01
            boolean r3 = r1.A04
            boolean r2 = r1.A07
            boolean r0 = r1.A06
            r22 = 0
            X.5Hj r13 = new X.5Hj
            r16 = r7
            r17 = r9
            r18 = r3
            r19 = r2
            r20 = r0
            r21 = r12
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22)
            X.5z2 r0 = new X.5z2
            r0.<init>(r13)
            r8.CrC(r0)
            com.instagram.appreciation.giftfeed.repository.AppreciationGiftFeedDataSource r15 = r6.A02
            java.lang.String r10 = r6.A06
            long r2 = r6.A00
            java.lang.Long r9 = new java.lang.Long
            r9.<init>(r2)
            long r7 = r9.longValue()
            r2 = -1
            int r0 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x00be
            r9 = 0
        L_0x00be:
            X.C86124wJ.A1S(r6, r1, r5, r12)
            r17 = r24
            r16 = r9
            r18 = r10
            r19 = r14
            r20 = r5
            java.lang.Object r8 = r15.A01(r16, r17, r18, r19, r20)
            if (r8 == r4) goto L_0x0119
            r3 = r6
            goto L_0x0030
        L_0x00d4:
            kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2 r5 = new kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2
            r5.<init>(r6, r4, r3)
            goto L_0x001a
        L_0x00db:
            java.util.ArrayList r5 = X.C18200wM.A0s(r5)
            r5.addAll(r4)
            X.16n r0 = r6.A00
            if (r0 == 0) goto L_0x00fd
            boolean r7 = r0.A03
            java.lang.String r4 = r0.A00
        L_0x00ea:
            java.util.List r6 = r1.A01
            boolean r8 = r1.A04
            boolean r9 = r1.A07
            boolean r10 = r1.A06
            X.5Hj r3 = new X.5Hj
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            X.5z2 r0 = new X.5z2
            r0.<init>(r3)
            goto L_0x0114
        L_0x00fd:
            r7 = 0
            r4 = 0
            goto L_0x00ea
        L_0x0100:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x0105:
            boolean r0 = r8 instanceof X.AnonymousClass1jB
            if (r0 == 0) goto L_0x0117
            X.4wE r2 = r3.A07
            X.1jB r8 = (X.AnonymousClass1jB) r8
            java.lang.Object r1 = r8.A00
            X.5z1 r0 = new X.5z1
            r0.<init>(r1)
        L_0x0114:
            r2.CrC(r0)
        L_0x0117:
            kotlin.Unit r4 = kotlin.Unit.A00
        L_0x0119:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.appreciation.giftfeed.repository.AppreciationGiftFeedRepository.A02(java.lang.String, X.8n9):java.lang.Object");
    }
}
