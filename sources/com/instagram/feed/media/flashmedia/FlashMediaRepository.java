package com.instagram.feed.media.flashmedia;

import X.AnonymousClass006;
import X.AnonymousClass00J;
import X.AnonymousClass0OY;
import X.AnonymousClass0ZV;
import X.AnonymousClass0gN;
import X.AnonymousClass0i4;
import X.AnonymousClass0wJ;
import X.BKU;
import X.C04220Ms;
import X.C04530Oa;
import X.C09820gj;
import X.C10390iG;
import X.C11900kz;
import X.C14030oh;
import X.C146958n9;
import X.C170779vY;
import X.C18180wK;
import X.C18190wL;
import X.C18200wM;
import X.C18240wQ;
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
import X.C86074wE;
import X.E5N;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.jvm.internal.KtSLambdaShape11S0101000_I2_8;
import kotlin.coroutines.jvm.internal.KtSLambdaShape12S0301000_I2_4;
import kotlin.coroutines.jvm.internal.KtSLambdaShape5S0401000_I2_1;
import kotlin.jvm.internal.KtLambdaShape74S0100000_I2_54;

public final class FlashMediaRepository implements C2N, C10390iG, AnonymousClass0i4 {
    public boolean A00;
    public final C84874u0 A01;
    public final C691847d A02;
    public final C11900kz A03;
    public final FlashMediaLocalDataSource A04;
    public final UserSession A05;
    public final Set A06;
    public final Set A07;
    public final C04530Oa A08 = AnonymousClass0OY.A02(new KtLambdaShape74S0100000_I2_54(this, 12));
    public final C83224qz A09;
    public final C86064wD A0A;
    public final C86074wE A0B;

    public final void A6e(C170779vY r5, List list) {
        C04220Ms.A0B(list, 1);
        ArrayList A0s = C18200wM.A0s(list);
        C86074wE r2 = this.A0B;
        A0s.addAll((Collection) r2.getValue());
        do {
        } while (!r2.ADi(r2.getValue(), AnonymousClass00J.A0N(AnonymousClass00J.A0b(A0s))));
    }

    public final void Aia(C84324sx r12, C82544ps r13, C170779vY r14) {
        C04220Ms.A0B(r14, 0);
        C86064wD r2 = this.A0A;
        C83224qz r1 = this.A09;
        C82544ps r5 = r13;
        r2.D7w(C25237DiI.A00(AnonymousClass006.A01, (C27952Ew2) null, new KtSLambdaShape5S0401000_I2_1(r5, this, r14, r12, (C146958n9) null, 26), r1, 1));
    }

    public final void CZm(C170779vY r1, List list) {
    }

    public final void Cc1(BKU bku, C170779vY r7) {
        C04220Ms.A0B(bku, 1);
        if (this.A00) {
            C86074wE r4 = this.A0B;
            ArrayList A0v = AnonymousClass0wJ.A0v();
            for (Object next : (Iterable) r4.getValue()) {
                C18240wQ.A1N(next, A0v, C04220Ms.A0I(next, bku) ? 1 : 0);
            }
            do {
            } while (!r4.ADi(r4.getValue(), A0v));
            return;
        }
        this.A07.add(bku);
    }

    public /* synthetic */ FlashMediaRepository(UserSession userSession) {
        FlashMediaLocalDataSource flashMediaLocalDataSource = new FlashMediaLocalDataSource(userSession);
        C11900kz r6 = new C11900kz(C09820gj.A00, AnonymousClass0gN.A00(), "FlashMediaRepository");
        E5N A0J = C18250wR.A0J(r6, 2);
        C691847d r1 = C691847d.A08;
        C83224qz A002 = C84874u0.A00(A0J, 749047880, 3);
        C04220Ms.A0B(userSession, 1);
        this.A05 = userSession;
        this.A04 = flashMediaLocalDataSource;
        this.A03 = r6;
        this.A01 = A0J;
        this.A02 = r1;
        this.A09 = A002;
        C27442EnY enY = new C27442EnY();
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape12S0301000_I2_4((C146958n9) null, (C86064wD) enY, 10), A002, 3);
        this.A0A = enY;
        this.A0B = C18190wL.A0z(AnonymousClass0ZV.A00);
        this.A07 = new LinkedHashSet();
        this.A06 = new LinkedHashSet();
        C691847d.A0F.addIfAbsent(this);
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape11S0101000_I2_8((Object) this, (C146958n9) null, 8), A002, 3);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.instagram.feed.media.flashmedia.FlashMediaRepository r10, java.util.List r11, X.C146958n9 r12) {
        /*
            r3 = 37
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape1S0401000_I2_1.A00(r3, r12)
            if (r0 == 0) goto L_0x00af
            r7 = r12
            kotlin.coroutines.jvm.internal.KtCImplShape1S0401000_I2_1 r7 = (kotlin.coroutines.jvm.internal.KtCImplShape1S0401000_I2_1) r7
            int r2 = r7.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00af
            int r2 = r2 - r1
            r7.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r7.A03
            X.D0E r6 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r7.A00
            r9 = 1
            if (r0 == 0) goto L_0x003d
            if (r0 != r9) goto L_0x00b6
            java.lang.Object r5 = r7.A02
            X.0MJ r5 = (X.AnonymousClass0MJ) r5
            java.lang.Object r10 = r7.A01
            com.instagram.feed.media.flashmedia.FlashMediaRepository r10 = (com.instagram.feed.media.flashmedia.FlashMediaRepository) r10
            X.AnonymousClass0OU.A00(r1)
        L_0x002c:
            X.4wE r2 = r10.A0B
        L_0x002e:
            java.lang.Object r1 = r2.getValue()
            java.lang.Object r0 = r5.A00
            boolean r0 = r2.ADi(r1, r0)
            if (r0 == 0) goto L_0x002e
            kotlin.Unit r6 = kotlin.Unit.A00
            return r6
        L_0x003d:
            X.AnonymousClass0OU.A00(r1)
            X.0MJ r5 = new X.0MJ
            r5.<init>()
            r5.A00 = r11
            java.util.Set r4 = r10.A07
            boolean r0 = X.C18190wL.A1a(r4)
            if (r0 == 0) goto L_0x006e
            java.util.ArrayList r3 = X.AnonymousClass0wJ.A0v()
            java.util.Iterator r2 = r11.iterator()
        L_0x0057:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0069
            java.lang.Object r1 = r2.next()
            boolean r0 = r4.contains(r1)
            X.C18240wQ.A1N(r1, r3, r0)
            goto L_0x0057
        L_0x0069:
            r5.A00 = r3
            r4.clear()
        L_0x006e:
            r10.A00 = r9
            java.lang.Object r8 = r5.A00
            X.C18240wQ.A1M(r10, r5, r7, r9)
            java.util.Set r2 = r10.A06
            java.util.Iterator r1 = r2.iterator()
        L_0x007b:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x008f
            java.lang.Object r0 = r1.next()
            kotlin.Pair r0 = (kotlin.Pair) r0
            java.lang.Object r0 = r0.A00
            X.4sx r0 = (X.C84324sx) r0
            r0.C59()
            goto L_0x007b
        L_0x008f:
            java.util.ArrayList r4 = X.C18200wM.A0s(r2)
            r2.clear()
            X.4u0 r0 = r10.A01
            X.E5N r0 = (X.E5N) r0
            X.EgD r3 = r0.A03
            r2 = 0
            r1 = 24
            kotlin.coroutines.jvm.internal.KtSLambdaShape10S0200000_I2_5 r0 = new kotlin.coroutines.jvm.internal.KtSLambdaShape10S0200000_I2_5
            r0.<init>(r4, r8, r2, r1)
            java.lang.Object r0 = X.C25599DoZ.A00(r7, r3, r0)
            if (r0 == r6) goto L_0x00ac
            kotlin.Unit r0 = kotlin.Unit.A00
        L_0x00ac:
            if (r0 != r6) goto L_0x002c
            return r6
        L_0x00af:
            kotlin.coroutines.jvm.internal.KtCImplShape1S0401000_I2_1 r7 = new kotlin.coroutines.jvm.internal.KtCImplShape1S0401000_I2_1
            r7.<init>(r10, r12, r3)
            goto L_0x0016
        L_0x00b6:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.feed.media.flashmedia.FlashMediaRepository.A00(com.instagram.feed.media.flashmedia.FlashMediaRepository, java.util.List, X.8n9):java.lang.Object");
    }

    public final BKU CWK(C170779vY r3) {
        return (BKU) AnonymousClass00J.A0G((List) this.A0B.getValue(), 0);
    }

    public final C84714tk DB2() {
        return this.A0B;
    }

    public final void AiZ(C84324sx r3, C82544ps r4, C170779vY r5) {
        AnonymousClass0wJ.A1O(r3, r4);
        r3.C0h();
        if (!this.A00) {
            r3.C5A();
            this.A06.add(C18180wK.A0p(r3, r4));
            return;
        }
        r3.C0g();
        r4.CHI((Collection) this.A0B.getValue());
    }

    public final void onAppBackgrounded() {
        int A032 = C14030oh.A03(-1464402639);
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape11S0101000_I2_8((Object) this, (C146958n9) null, 9), this.A09, 3);
        C14030oh.A0A(953219976, A032);
    }

    public final void onAppForegrounded() {
        C14030oh.A0A(-1517158178, C14030oh.A03(-1203728563));
    }

    public final void onSessionWillEnd() {
        C691847d.A04(this);
    }
}
