package com.instagram.feed.media.flashmedia;

import X.AnonymousClass006;
import X.AnonymousClass00J;
import X.AnonymousClass0e5;
import X.AnonymousClass0gN;
import X.AnonymousClass0i4;
import X.AnonymousClass0wJ;
import X.AnonymousClass3FQ;
import X.AnonymousClass4V0;
import X.BKU;
import X.C04220Ms;
import X.C07960cV;
import X.C09820gj;
import X.C10390iG;
import X.C11900kz;
import X.C14030oh;
import X.C146958n9;
import X.C170779vY;
import X.C18210wN;
import X.C18220wO;
import X.C18250wR;
import X.C25237DiI;
import X.C27442EnY;
import X.C27952Ew2;
import X.C2N;
import X.C691847d;
import X.C82544ps;
import X.C83224qz;
import X.C84324sx;
import X.C84714tk;
import X.C84874u0;
import X.C86064wD;
import X.E5N;
import com.instagram.service.session.UserSession;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.jvm.internal.KtSLambdaShape11S0101000_I2_8;
import kotlin.coroutines.jvm.internal.KtSLambdaShape12S0301000_I2_4;
import kotlin.coroutines.jvm.internal.KtSLambdaShape5S0401000_I2_1;

public final class FlashMediaCacheImpl implements C2N, C10390iG, AnonymousClass0i4 {
    public long A00;
    public boolean A01;
    public final C84874u0 A02;
    public final C691847d A03;
    public final C11900kz A04;
    public final FlashMediaLocalDataSource A05;
    public final UserSession A06;
    public final Map A07 = C18220wO.A0y();
    public final Map A08 = C18220wO.A0y();
    public final Map A09 = C18220wO.A0y();
    public final C83224qz A0A;
    public final C86064wD A0B;

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x008b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00c4 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00ee A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A02(com.instagram.feed.media.flashmedia.FlashMediaCacheImpl r13, X.C84324sx r14, X.C170779vY r15, X.C146958n9 r16) {
        /*
            r9 = r13
            r13 = r14
            r2 = r15
            r4 = 14
            r5 = r16
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape0S0601000_I2.A00(r4, r5)
            if (r0 == 0) goto L_0x00ef
            r8 = r5
            kotlin.coroutines.jvm.internal.KtCImplShape0S0601000_I2 r8 = (kotlin.coroutines.jvm.internal.KtCImplShape0S0601000_I2) r8
            int r3 = r8.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L_0x00ef
            int r3 = r3 - r1
            r8.A00 = r3
        L_0x001b:
            java.lang.Object r3 = r8.A05
            X.D0E r7 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r8.A00
            r6 = 5
            r14 = 4
            r12 = 3
            r11 = 2
            r10 = 1
            r5 = 0
            if (r0 == 0) goto L_0x0039
            if (r0 == r10) goto L_0x0066
            if (r0 == r11) goto L_0x00c5
            if (r0 == r12) goto L_0x009f
            if (r0 == r14) goto L_0x00c5
            if (r0 != r6) goto L_0x00f6
            X.AnonymousClass0OU.A00(r3)
        L_0x0036:
            kotlin.Unit r7 = kotlin.Unit.A00
            return r7
        L_0x0039:
            X.AnonymousClass0OU.A00(r3)
            java.util.Map r0 = r9.A07
            boolean r0 = r0.containsKey(r15)
            if (r0 != 0) goto L_0x0036
            com.instagram.service.session.UserSession r0 = r9.A06
            X.3FQ r1 = new X.3FQ
            r1.<init>(r0)
            long r3 = r9.A00
            r15 = 0
            int r0 = (r3 > r15 ? 1 : (r3 == r15 ? 0 : -1))
            if (r0 <= 0) goto L_0x008c
            if (r13 == 0) goto L_0x0058
            r13.C5A()
        L_0x0058:
            com.instagram.feed.media.flashmedia.FlashMediaLocalDataSource r0 = r9.A05
            r8.A01 = r9
            X.C18250wR.A1D(r2, r13, r1, r8, r10)
            java.lang.Object r3 = r0.A03(r2, r8, r3)
            if (r3 != r7) goto L_0x0079
            return r7
        L_0x0066:
            java.lang.Object r1 = r8.A04
            X.3FQ r1 = (X.AnonymousClass3FQ) r1
            java.lang.Object r13 = r8.A03
            X.4sx r13 = (X.C84324sx) r13
            java.lang.Object r2 = r8.A02
            X.9vY r2 = (X.C170779vY) r2
            java.lang.Object r9 = r8.A01
            com.instagram.feed.media.flashmedia.FlashMediaCacheImpl r9 = (com.instagram.feed.media.flashmedia.FlashMediaCacheImpl) r9
            X.AnonymousClass0OU.A00(r3)
        L_0x0079:
            java.util.Collection r3 = (java.util.Collection) r3
            if (r13 == 0) goto L_0x0080
            r13.C59()
        L_0x0080:
            r8.A01 = r9
            X.C18250wR.A1D(r2, r1, r5, r8, r11)
            java.lang.Object r0 = r1.A00(r3)
            if (r0 != r7) goto L_0x00d2
            return r7
        L_0x008c:
            if (r13 == 0) goto L_0x0091
            r13.C5A()
        L_0x0091:
            com.instagram.feed.media.flashmedia.FlashMediaLocalDataSource r0 = r9.A05
            r8.A01 = r9
            X.C18250wR.A1D(r2, r13, r1, r8, r12)
            java.lang.Object r3 = r0.A02(r2, r8)
            if (r3 != r7) goto L_0x00b2
            return r7
        L_0x009f:
            java.lang.Object r1 = r8.A04
            X.3FQ r1 = (X.AnonymousClass3FQ) r1
            java.lang.Object r13 = r8.A03
            X.4sx r13 = (X.C84324sx) r13
            java.lang.Object r2 = r8.A02
            X.9vY r2 = (X.C170779vY) r2
            java.lang.Object r9 = r8.A01
            com.instagram.feed.media.flashmedia.FlashMediaCacheImpl r9 = (com.instagram.feed.media.flashmedia.FlashMediaCacheImpl) r9
            X.AnonymousClass0OU.A00(r3)
        L_0x00b2:
            java.util.Collection r3 = (java.util.Collection) r3
            if (r13 == 0) goto L_0x00b9
            r13.C59()
        L_0x00b9:
            r8.A01 = r9
            X.C18250wR.A1D(r2, r1, r5, r8, r14)
            java.lang.Object r0 = r1.A00(r3)
            if (r0 != r7) goto L_0x00d2
            return r7
        L_0x00c5:
            java.lang.Object r1 = r8.A03
            java.lang.Object r2 = r8.A02
            X.9vY r2 = (X.C170779vY) r2
            java.lang.Object r9 = r8.A01
            com.instagram.feed.media.flashmedia.FlashMediaCacheImpl r9 = (com.instagram.feed.media.flashmedia.FlashMediaCacheImpl) r9
            X.AnonymousClass0OU.A00(r3)
        L_0x00d2:
            java.util.Map r0 = r9.A07
            r0.put(r2, r1)
            java.util.Map r1 = r9.A08
            java.lang.Boolean r0 = X.C18180wK.A0X()
            r1.put(r2, r0)
            r8.A01 = r5
            r8.A02 = r5
            r8.A03 = r5
            r8.A00 = r6
            java.lang.Object r0 = A04(r9, r2, r8)
            if (r0 != r7) goto L_0x0036
            return r7
        L_0x00ef:
            kotlin.coroutines.jvm.internal.KtCImplShape0S0601000_I2 r8 = new kotlin.coroutines.jvm.internal.KtCImplShape0S0601000_I2
            r8.<init>(r9, r5, r4)
            goto L_0x001b
        L_0x00f6:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.feed.media.flashmedia.FlashMediaCacheImpl.A02(com.instagram.feed.media.flashmedia.FlashMediaCacheImpl, X.4sx, X.9vY, X.8n9):java.lang.Object");
    }

    public final void A6e(C170779vY r11, List list) {
        C170779vY r5 = r11;
        List list2 = list;
        boolean A1Z = AnonymousClass0wJ.A1Z(r11, list);
        if (this.A01) {
            this.A0B.D7w(C25237DiI.A00(AnonymousClass006.A01, (C27952Ew2) null, new KtSLambdaShape12S0301000_I2_4(r5, list2, this, (C146958n9) null, 3), this.A0A, A1Z ? 1 : 0));
            return;
        }
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape12S0301000_I2_4(r5, list2, this, (C146958n9) null, 4), this.A0A, 3);
    }

    public final void AiZ(C84324sx r12, C82544ps r13, C170779vY r14) {
        C170779vY r7 = r14;
        C04220Ms.A0B(r14, 0);
        C84324sx r8 = r12;
        C82544ps r5 = r13;
        if (this.A01) {
            this.A0B.D7w(C25237DiI.A00(AnonymousClass006.A01, (C27952Ew2) null, new KtSLambdaShape5S0401000_I2_1(r5, this, r7, r8, (C146958n9) null, 24), this.A0A, 1));
            return;
        }
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape5S0401000_I2_1(r5, this, r7, r8, (C146958n9) null, 25), this.A0A, 3);
    }

    public final void Aia(C84324sx r2, C82544ps r3, C170779vY r4) {
        C04220Ms.A0B(r4, 0);
        AiZ(r2, r3, r4);
    }

    public final BKU CWK(C170779vY r3) {
        C04220Ms.A0B(r3, 0);
        AnonymousClass3FQ r0 = (AnonymousClass3FQ) this.A07.get(r3);
        if (r0 != null) {
            return (BKU) AnonymousClass00J.A0G(AnonymousClass00J.A0N(r0.A01), 0);
        }
        return null;
    }

    public final void CZm(C170779vY r11, List list) {
        C170779vY r5 = r11;
        C04220Ms.A0B(r11, 0);
        List list2 = list;
        if (this.A01) {
            this.A0B.D7w(C25237DiI.A00(AnonymousClass006.A01, (C27952Ew2) null, new KtSLambdaShape12S0301000_I2_4(r5, list2, this, (C146958n9) null, 6), this.A0A, 1));
            return;
        }
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape12S0301000_I2_4(r5, list2, this, (C146958n9) null, 7), this.A0A, 3);
    }

    public final void Cc1(BKU bku, C170779vY r12) {
        BKU bku2 = bku;
        C170779vY r5 = r12;
        boolean A1Z = AnonymousClass0wJ.A1Z(r12, bku);
        if (this.A01) {
            this.A0B.D7w(C25237DiI.A00(AnonymousClass006.A01, (C27952Ew2) null, new KtSLambdaShape12S0301000_I2_4(r5, bku2, this, (C146958n9) null, 8), this.A0A, A1Z ? 1 : 0));
            return;
        }
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape12S0301000_I2_4(r5, bku2, this, (C146958n9) null, 9), this.A0A, 3);
    }

    public /* synthetic */ FlashMediaCacheImpl(UserSession userSession) {
        C11900kz r6 = new C11900kz(C09820gj.A00, AnonymousClass0gN.A00(), "FlashMediaCache");
        E5N A0J = C18250wR.A0J(r6, 2);
        FlashMediaLocalDataSource flashMediaLocalDataSource = new FlashMediaLocalDataSource(userSession);
        C691847d r1 = C691847d.A08;
        C04220Ms.A0B(userSession, 1);
        this.A06 = userSession;
        this.A04 = r6;
        this.A02 = A0J;
        this.A05 = flashMediaLocalDataSource;
        this.A03 = r1;
        C83224qz A002 = C84874u0.A00(A0J, 622567384, 3);
        this.A0A = A002;
        C27442EnY enY = new C27442EnY();
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape12S0301000_I2_4((C146958n9) null, (C86064wD) enY, 5), A002, 3);
        this.A0B = enY;
        C691847d.A0F.addIfAbsent(this);
        this.A01 = C18210wN.A1S(36322207709797624L);
        this.A00 = C07960cV.A00(AnonymousClass0e5.A00(36603682686570676L));
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(X.BKU r7, com.instagram.feed.media.flashmedia.FlashMediaCacheImpl r8, X.C170779vY r9, X.C146958n9 r10) {
        /*
            r3 = 40
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape1S0501000_I2.A00(r3, r10)
            if (r0 == 0) goto L_0x007a
            r6 = r10
            kotlin.coroutines.jvm.internal.KtCImplShape1S0501000_I2 r6 = (kotlin.coroutines.jvm.internal.KtCImplShape1S0501000_I2) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x007a
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r6.A04
            X.D0E r5 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r6.A00
            r4 = 2
            r3 = 1
            if (r0 == 0) goto L_0x0039
            if (r0 == r3) goto L_0x004c
            if (r0 != r4) goto L_0x0080
            java.lang.Object r9 = r6.A02
            java.lang.Object r2 = r6.A01
            com.instagram.feed.media.flashmedia.FlashMediaCacheImpl r2 = (com.instagram.feed.media.flashmedia.FlashMediaCacheImpl) r2
            X.AnonymousClass0OU.A00(r1)
        L_0x002d:
            java.util.Map r1 = r2.A08
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            r1.put(r9, r0)
        L_0x0036:
            kotlin.Unit r5 = kotlin.Unit.A00
            return r5
        L_0x0039:
            X.AnonymousClass0OU.A00(r1)
            r0 = 0
            r6.A01 = r8
            r6.A02 = r9
            r6.A03 = r7
            r6.A00 = r3
            java.lang.Object r0 = A02(r8, r0, r9, r6)
            if (r0 != r5) goto L_0x0057
            return r5
        L_0x004c:
            java.lang.Object r7 = r6.A03
            java.lang.Object r9 = r6.A02
            java.lang.Object r8 = r6.A01
            com.instagram.feed.media.flashmedia.FlashMediaCacheImpl r8 = (com.instagram.feed.media.flashmedia.FlashMediaCacheImpl) r8
            X.AnonymousClass0OU.A00(r1)
        L_0x0057:
            r2 = r8
            java.util.Map r0 = r8.A07
            java.lang.Object r1 = r0.get(r9)
            X.3FQ r1 = (X.AnonymousClass3FQ) r1
            if (r1 == 0) goto L_0x0036
            r6.A01 = r8
            r6.A02 = r9
            r0 = 0
            r6.A03 = r0
            r6.A00 = r4
            java.util.Set r0 = r1.A02
            r0.remove(r7)
            java.util.LinkedList r0 = r1.A01
            r0.remove(r7)
            kotlin.Unit r0 = kotlin.Unit.A00
            if (r0 != r5) goto L_0x002d
            return r5
        L_0x007a:
            kotlin.coroutines.jvm.internal.KtCImplShape1S0501000_I2 r6 = new kotlin.coroutines.jvm.internal.KtCImplShape1S0501000_I2
            r6.<init>(r8, r10, r3)
            goto L_0x0016
        L_0x0080:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.feed.media.flashmedia.FlashMediaCacheImpl.A00(X.BKU, com.instagram.feed.media.flashmedia.FlashMediaCacheImpl, X.9vY, X.8n9):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A01(com.instagram.feed.media.flashmedia.FlashMediaCacheImpl r8, X.C84324sx r9, X.C82544ps r10, X.C170779vY r11, X.C146958n9 r12) {
        /*
            r3 = 15
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape0S0601000_I2.A00(r3, r12)
            if (r0 == 0) goto L_0x00a1
            r6 = r12
            kotlin.coroutines.jvm.internal.KtCImplShape0S0601000_I2 r6 = (kotlin.coroutines.jvm.internal.KtCImplShape0S0601000_I2) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00a1
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0016:
            java.lang.Object r3 = r6.A05
            X.D0E r5 = X.D0E.COROUTINE_SUSPENDED
            int r2 = r6.A00
            r7 = 3
            r1 = 2
            r0 = 1
            r4 = 0
            if (r2 == 0) goto L_0x002e
            if (r2 == r0) goto L_0x0040
            if (r2 == r1) goto L_0x005d
            if (r2 != r7) goto L_0x00a8
            X.AnonymousClass0OU.A00(r3)
        L_0x002b:
            kotlin.Unit r5 = kotlin.Unit.A00
            return r5
        L_0x002e:
            X.AnonymousClass0OU.A00(r3)
            r9.C0h()
            r6.A01 = r8
            X.C18250wR.A1D(r11, r9, r10, r6, r0)
            java.lang.Object r0 = A02(r8, r9, r11, r6)
            if (r0 != r5) goto L_0x0051
            return r5
        L_0x0040:
            java.lang.Object r10 = r6.A04
            java.lang.Object r9 = r6.A03
            X.4sx r9 = (X.C84324sx) r9
            java.lang.Object r11 = r6.A02
            X.9vY r11 = (X.C170779vY) r11
            java.lang.Object r8 = r6.A01
            com.instagram.feed.media.flashmedia.FlashMediaCacheImpl r8 = (com.instagram.feed.media.flashmedia.FlashMediaCacheImpl) r8
            X.AnonymousClass0OU.A00(r3)
        L_0x0051:
            r6.A01 = r8
            X.C18250wR.A1D(r11, r9, r10, r6, r1)
            java.lang.Object r0 = A04(r8, r11, r6)
            if (r0 != r5) goto L_0x006c
            return r5
        L_0x005d:
            java.lang.Object r10 = r6.A04
            java.lang.Object r9 = r6.A03
            X.4sx r9 = (X.C84324sx) r9
            java.lang.Object r11 = r6.A02
            java.lang.Object r8 = r6.A01
            com.instagram.feed.media.flashmedia.FlashMediaCacheImpl r8 = (com.instagram.feed.media.flashmedia.FlashMediaCacheImpl) r8
            X.AnonymousClass0OU.A00(r3)
        L_0x006c:
            java.util.Map r0 = r8.A07
            java.lang.Object r0 = r0.get(r11)
            X.3FQ r0 = (X.AnonymousClass3FQ) r0
            if (r0 == 0) goto L_0x009d
            java.util.LinkedList r0 = r0.A01
            java.util.List r3 = X.AnonymousClass00J.A0N(r0)
            r9.C0g()
            X.4u0 r0 = r8.A02
            X.E5N r0 = (X.E5N) r0
            X.EgD r2 = r0.A03
            r1 = 23
            kotlin.coroutines.jvm.internal.KtSLambdaShape10S0200000_I2_5 r0 = new kotlin.coroutines.jvm.internal.KtSLambdaShape10S0200000_I2_5
            r0.<init>(r10, r3, r4, r1)
            r6.A01 = r9
            r6.A02 = r4
            r6.A03 = r4
            r6.A04 = r4
            r6.A00 = r7
            java.lang.Object r0 = X.C25599DoZ.A00(r6, r2, r0)
            if (r0 != r5) goto L_0x002b
            return r5
        L_0x009d:
            r9.C0g()
            goto L_0x002b
        L_0x00a1:
            kotlin.coroutines.jvm.internal.KtCImplShape0S0601000_I2 r6 = new kotlin.coroutines.jvm.internal.KtCImplShape0S0601000_I2
            r6.<init>(r8, r12, r3)
            goto L_0x0016
        L_0x00a8:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.feed.media.flashmedia.FlashMediaCacheImpl.A01(com.instagram.feed.media.flashmedia.FlashMediaCacheImpl, X.4sx, X.4ps, X.9vY, X.8n9):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A03(com.instagram.feed.media.flashmedia.FlashMediaCacheImpl r7, X.C170779vY r8, java.util.List r9, X.C146958n9 r10) {
        /*
            r3 = 38
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape1S0501000_I2.A00(r3, r10)
            if (r0 == 0) goto L_0x0074
            r6 = r10
            kotlin.coroutines.jvm.internal.KtCImplShape1S0501000_I2 r6 = (kotlin.coroutines.jvm.internal.KtCImplShape1S0501000_I2) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0074
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r6.A04
            X.D0E r5 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r6.A00
            r4 = 2
            r3 = 1
            if (r0 == 0) goto L_0x0039
            if (r0 == r3) goto L_0x004c
            if (r0 != r4) goto L_0x007a
            java.lang.Object r8 = r6.A02
            java.lang.Object r2 = r6.A01
            com.instagram.feed.media.flashmedia.FlashMediaCacheImpl r2 = (com.instagram.feed.media.flashmedia.FlashMediaCacheImpl) r2
            X.AnonymousClass0OU.A00(r1)
        L_0x002d:
            java.util.Map r1 = r2.A08
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            r1.put(r8, r0)
        L_0x0036:
            kotlin.Unit r5 = kotlin.Unit.A00
            return r5
        L_0x0039:
            X.AnonymousClass0OU.A00(r1)
            r0 = 0
            r6.A01 = r7
            r6.A02 = r8
            r6.A03 = r9
            r6.A00 = r3
            java.lang.Object r0 = A02(r7, r0, r8, r6)
            if (r0 != r5) goto L_0x0059
            return r5
        L_0x004c:
            java.lang.Object r9 = r6.A03
            java.util.Collection r9 = (java.util.Collection) r9
            java.lang.Object r8 = r6.A02
            java.lang.Object r7 = r6.A01
            com.instagram.feed.media.flashmedia.FlashMediaCacheImpl r7 = (com.instagram.feed.media.flashmedia.FlashMediaCacheImpl) r7
            X.AnonymousClass0OU.A00(r1)
        L_0x0059:
            r2 = r7
            java.util.Map r0 = r7.A07
            java.lang.Object r1 = r0.get(r8)
            X.3FQ r1 = (X.AnonymousClass3FQ) r1
            if (r1 == 0) goto L_0x0036
            r6.A01 = r7
            r6.A02 = r8
            r0 = 0
            r6.A03 = r0
            r6.A00 = r4
            java.lang.Object r0 = r1.A00(r9)
            if (r0 != r5) goto L_0x002d
            return r5
        L_0x0074:
            kotlin.coroutines.jvm.internal.KtCImplShape1S0501000_I2 r6 = new kotlin.coroutines.jvm.internal.KtCImplShape1S0501000_I2
            r6.<init>(r7, r10, r3)
            goto L_0x0016
        L_0x007a:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.feed.media.flashmedia.FlashMediaCacheImpl.A03(com.instagram.feed.media.flashmedia.FlashMediaCacheImpl, X.9vY, java.util.List, X.8n9):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A04(com.instagram.feed.media.flashmedia.FlashMediaCacheImpl r9, X.C170779vY r10, X.C146958n9 r11) {
        /*
            r4 = 36
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape1S0401000_I2_1.A00(r4, r11)
            if (r0 == 0) goto L_0x0098
            r3 = r11
            kotlin.coroutines.jvm.internal.KtCImplShape1S0401000_I2_1 r3 = (kotlin.coroutines.jvm.internal.KtCImplShape1S0401000_I2_1) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0098
            int r2 = r2 - r1
            r3.A00 = r2
        L_0x0016:
            java.lang.Object r0 = r3.A03
            int r1 = r3.A00
            r7 = 1
            if (r1 == 0) goto L_0x003a
            if (r1 != r7) goto L_0x009f
            java.lang.Object r10 = r3.A02
            java.lang.Object r9 = r3.A01
            com.instagram.feed.media.flashmedia.FlashMediaCacheImpl r9 = (com.instagram.feed.media.flashmedia.FlashMediaCacheImpl) r9
            X.AnonymousClass0OU.A00(r0)
        L_0x0028:
            boolean r0 = X.AnonymousClass0wJ.A1X(r0)
            if (r0 == 0) goto L_0x0037
            java.util.Map r1 = r9.A08
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
            r1.put(r10, r0)
        L_0x0037:
            kotlin.Unit r0 = kotlin.Unit.A00
            return r0
        L_0x003a:
            X.AnonymousClass0OU.A00(r0)
            java.util.Map r0 = r9.A07
            java.lang.Object r8 = r0.get(r10)
            java.util.Map r0 = r9.A09
            java.lang.Object r6 = r0.get(r10)
            if (r8 == 0) goto L_0x0037
            if (r6 == 0) goto L_0x0037
            java.util.Collection r6 = (java.util.Collection) r6
            X.3FQ r8 = (X.AnonymousClass3FQ) r8
            X.C18240wQ.A1M(r9, r10, r3, r7)
            java.util.LinkedList r5 = r8.A01
            java.util.ArrayList r4 = X.AnonymousClass0wJ.A0v()
            java.util.Iterator r3 = r5.iterator()
        L_0x005e:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x008b
            java.lang.Object r2 = r3.next()
            if (r6 == 0) goto L_0x0071
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L_0x0071
            goto L_0x005e
        L_0x0071:
            java.util.Iterator r1 = r6.iterator()
        L_0x0075:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x005e
            java.lang.Object r0 = r1.next()
            X.MeS r0 = (X.C41836MeS) r0
            boolean r0 = r0.apply(r2)
            if (r0 == 0) goto L_0x0075
            r4.add(r2)
            goto L_0x005e
        L_0x008b:
            java.util.Set r0 = r8.A02
            r0.removeAll(r4)
            r5.removeAll(r4)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
            goto L_0x0028
        L_0x0098:
            kotlin.coroutines.jvm.internal.KtCImplShape1S0401000_I2_1 r3 = new kotlin.coroutines.jvm.internal.KtCImplShape1S0401000_I2_1
            r3.<init>(r9, r11, r4)
            goto L_0x0016
        L_0x009f:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.feed.media.flashmedia.FlashMediaCacheImpl.A04(com.instagram.feed.media.flashmedia.FlashMediaCacheImpl, X.9vY, X.8n9):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A05(com.instagram.feed.media.flashmedia.FlashMediaCacheImpl r11, X.C146958n9 r12) {
        /*
            r3 = 39
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape1S0501000_I2.A00(r3, r12)
            if (r0 == 0) goto L_0x00a2
            r8 = r12
            kotlin.coroutines.jvm.internal.KtCImplShape1S0501000_I2 r8 = (kotlin.coroutines.jvm.internal.KtCImplShape1S0501000_I2) r8
            int r2 = r8.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00a2
            int r2 = r2 - r1
            r8.A00 = r2
        L_0x0016:
            java.lang.Object r5 = r8.A04
            X.D0E r3 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r8.A00
            r2 = 2
            r4 = 1
            if (r0 == 0) goto L_0x0075
            if (r0 == r4) goto L_0x0069
            if (r0 != r2) goto L_0x00ac
            java.lang.Object r6 = r8.A03
            java.lang.Object r1 = r8.A02
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r11 = r8.A01
            com.instagram.feed.media.flashmedia.FlashMediaCacheImpl r11 = (com.instagram.feed.media.flashmedia.FlashMediaCacheImpl) r11
            X.AnonymousClass0OU.A00(r5)
        L_0x0031:
            java.util.Map r4 = r11.A08
            java.lang.Boolean r0 = X.C18180wK.A0X()
            r4.put(r6, r0)
        L_0x003a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00a9
            java.util.Map$Entry r0 = X.C18180wK.A0o(r1)
            java.lang.Object r6 = r0.getKey()
            X.9vY r6 = (X.C170779vY) r6
            java.lang.Object r0 = r0.getValue()
            X.3FQ r0 = (X.AnonymousClass3FQ) r0
            com.instagram.feed.media.flashmedia.FlashMediaLocalDataSource r5 = r11.A05
            java.util.LinkedList r0 = r0.A01
            java.util.List r7 = X.AnonymousClass00J.A0N(r0)
            long r9 = r11.A00
            r8.A01 = r11
            r8.A02 = r1
            r8.A03 = r6
            r8.A00 = r2
            java.lang.Object r0 = r5.A00(r6, r7, r8, r9)
            if (r0 != r3) goto L_0x0031
            return r3
        L_0x0069:
            java.lang.Object r1 = r8.A02
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r11 = r8.A01
            com.instagram.feed.media.flashmedia.FlashMediaCacheImpl r11 = (com.instagram.feed.media.flashmedia.FlashMediaCacheImpl) r11
            X.AnonymousClass0OU.A00(r5)
            goto L_0x007e
        L_0x0075:
            X.AnonymousClass0OU.A00(r5)
            java.util.Map r0 = r11.A07
            java.util.Iterator r1 = X.AnonymousClass0wJ.A0z(r0)
        L_0x007e:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x009b
            java.util.Map$Entry r0 = X.C18180wK.A0o(r1)
            java.lang.Object r0 = r0.getKey()
            X.9vY r0 = (X.C170779vY) r0
            r8.A01 = r11
            r8.A02 = r1
            r8.A00 = r4
            java.lang.Object r0 = A04(r11, r0, r8)
            if (r0 != r3) goto L_0x007e
            return r3
        L_0x009b:
            java.util.Map r0 = r11.A07
            java.util.Iterator r1 = X.AnonymousClass0wJ.A0z(r0)
            goto L_0x003a
        L_0x00a2:
            kotlin.coroutines.jvm.internal.KtCImplShape1S0501000_I2 r8 = new kotlin.coroutines.jvm.internal.KtCImplShape1S0501000_I2
            r8.<init>(r11, r12, r3)
            goto L_0x0016
        L_0x00a9:
            kotlin.Unit r3 = kotlin.Unit.A00
            return r3
        L_0x00ac:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.feed.media.flashmedia.FlashMediaCacheImpl.A05(com.instagram.feed.media.flashmedia.FlashMediaCacheImpl, X.8n9):java.lang.Object");
    }

    public final C84714tk DB2() {
        return AnonymousClass4V0.A00;
    }

    public final void onAppBackgrounded() {
        int A032 = C14030oh.A03(-1396754146);
        if (this.A01) {
            this.A0B.D7w(C25237DiI.A00(AnonymousClass006.A01, (C27952Ew2) null, new KtSLambdaShape11S0101000_I2_8((Object) this, (C146958n9) null, 6), this.A0A, 1));
        } else {
            C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape11S0101000_I2_8((Object) this, (C146958n9) null, 7), this.A0A, 3);
        }
        C14030oh.A0A(454507660, A032);
    }

    public final void onAppForegrounded() {
        C14030oh.A0A(1679664985, C14030oh.A03(2147399967));
    }

    public final void onSessionWillEnd() {
        C691847d.A04(this);
    }
}
