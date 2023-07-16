package com.instagram.fanclub.preview.impl;

import X.AnonymousClass0A3;
import X.AnonymousClass0OY;
import X.AnonymousClass2SP;
import X.BKU;
import X.C04220Ms;
import X.C04530Oa;
import X.C106376ew;
import X.C11630kW;
import X.C148838sG;
import X.C18180wK;
import X.C18190wL;
import X.C18250wR;
import X.C27198Efl;
import X.C27457Enn;
import X.C28039ExT;
import X.C28172Ezi;
import X.C695148w;
import X.C86074wE;
import X.DIV;
import X.Lr0;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import java.util.Collections;
import java.util.List;

public final class FanClubContentPreviewInteractorImpl implements C28039ExT {
    public final C11630kW A00;
    public final C695148w A01;
    public final C106376ew A02;
    public final UserSession A03;
    public final C04530Oa A04 = AnonymousClass0OY.A02(C18250wR.A0g(this, 15));
    public final C86074wE A05;
    public final C86074wE A06;
    public final C86074wE A07;
    public final C28172Ezi A08;
    public final C28172Ezi A09;
    public final C28172Ezi A0A;

    public /* synthetic */ FanClubContentPreviewInteractorImpl(C11630kW r5, UserSession userSession) {
        C04220Ms.A0B(userSession, 0);
        C695148w r1 = (C695148w) userSession.A01(C695148w.class, C18250wR.A0g(userSession, 18));
        C106376ew A002 = AnonymousClass2SP.A00(userSession);
        C18180wK.A1R(r1, A002);
        this.A03 = userSession;
        this.A00 = r5;
        this.A01 = r1;
        this.A02 = A002;
        Lr0 lr0 = DIV.A01;
        C27457Enn A0z = C18190wL.A0z(lr0);
        this.A07 = A0z;
        this.A0A = new C27198Efl((C148838sG) null, A0z);
        C27457Enn A0z2 = C18190wL.A0z(lr0);
        this.A06 = A0z2;
        this.A09 = new C27198Efl((C148838sG) null, A0z2);
        C27457Enn A0z3 = C18190wL.A0z(lr0);
        this.A05 = A0z3;
        this.A08 = new C27198Efl((C148838sG) null, A0z3);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object AEY(X.BKU r12, X.C146958n9 r13, boolean r14) {
        /*
            r11 = this;
            r4 = 43
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape3S0301000_I2_2.A00(r4, r13)
            if (r0 == 0) goto L_0x008f
            r3 = r13
            kotlin.coroutines.jvm.internal.KtCImplShape3S0301000_I2_2 r3 = (kotlin.coroutines.jvm.internal.KtCImplShape3S0301000_I2_2) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x008f
            int r2 = r2 - r1
            r3.A00 = r2
        L_0x0016:
            java.lang.Object r0 = r3.A02
            X.D0E r4 = X.D0E.COROUTINE_SUSPENDED
            int r1 = r3.A00
            r5 = 1
            if (r1 == 0) goto L_0x002e
            if (r1 != r5) goto L_0x0095
            java.lang.Object r1 = r3.A01
            X.4wE r1 = (X.C86074wE) r1
            X.AnonymousClass0OU.A00(r0)
        L_0x0028:
            r1.CrC(r0)
        L_0x002b:
            kotlin.Unit r4 = kotlin.Unit.A00
            return r4
        L_0x002e:
            X.AnonymousClass0OU.A00(r0)
            X.0Oa r0 = r11.A04
            java.lang.Object r1 = X.C18190wL.A0f(r0)
            X.0nS r1 = (X.C13330nS) r1
            java.lang.String r0 = "subscription_exclusive_content_public_preview_select"
            X.0A2 r1 = X.AnonymousClass0wJ.A0M(r1, r0)
            r0 = 2749(0xabd, float:3.852E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r1 = X.C18180wK.A0I(r1, r0)
            X.0kW r0 = r11.A00
            java.lang.String r0 = r0.getModuleName()
            X.C18230wP.A1H(r1, r0)
            r7 = r12
            X.BKN r0 = r12.A0f
            com.instagram.user.model.User r0 = r0.A1i
            if (r0 == 0) goto L_0x009a
            A00(r1, r12, r0)
            X.6ew r0 = r11.A02
            android.content.SharedPreferences r2 = r0.A00
            java.lang.String r1 = "has_seen_exclusive_content_convert_to_preview_nux"
            boolean r0 = X.C18190wL.A1X(r2, r1)
            if (r0 != 0) goto L_0x0071
            android.content.SharedPreferences$Editor r0 = r2.edit()
            X.AnonymousClass0wJ.A13(r0, r1, r5)
            X.4wE r0 = r11.A07
            r0.CrC(r12)
            goto L_0x002b
        L_0x0071:
            X.4wE r1 = r11.A06
            X.48w r6 = r11.A01
            r3.A01 = r1
            r3.A00 = r5
            X.4qz r0 = r6.A01
            X.Ew2 r0 = r0.Aa1()
            r8 = 0
            r9 = 12
            kotlin.coroutines.jvm.internal.KtSLambdaShape0S0211000_I2 r5 = new kotlin.coroutines.jvm.internal.KtSLambdaShape0S0211000_I2
            r10 = r14
            r5.<init>(r6, r7, r8, r9, r10)
            java.lang.Object r0 = X.C25599DoZ.A00(r3, r0, r5)
            if (r0 != r4) goto L_0x0028
            return r4
        L_0x008f:
            kotlin.coroutines.jvm.internal.KtCImplShape3S0301000_I2_2 r3 = new kotlin.coroutines.jvm.internal.KtCImplShape3S0301000_I2_2
            r3.<init>(r11, r13, r4)
            goto L_0x0016
        L_0x0095:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x009a:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0b()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.preview.impl.FanClubContentPreviewInteractorImpl.AEY(X.BKU, X.8n9, boolean):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object AEZ(X.BKU r9, X.C146958n9 r10) {
        /*
            r8 = this;
            r3 = 35
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape1S0401000_I2_1.A00(r3, r10)
            if (r0 == 0) goto L_0x0079
            r5 = r10
            kotlin.coroutines.jvm.internal.KtCImplShape1S0401000_I2_1 r5 = (kotlin.coroutines.jvm.internal.KtCImplShape1S0401000_I2_1) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0079
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r0 = r5.A03
            X.D0E r6 = X.D0E.COROUTINE_SUSPENDED
            int r1 = r5.A00
            r2 = 1
            if (r1 == 0) goto L_0x0034
            if (r1 != r2) goto L_0x007f
            java.lang.Object r9 = r5.A02
            java.lang.Object r7 = r5.A01
            X.4wE r7 = (X.C86074wE) r7
            X.AnonymousClass0OU.A00(r0)
        L_0x002a:
            kotlin.Pair r0 = X.C18180wK.A0p(r9, r0)
            r7.CrC(r0)
            kotlin.Unit r0 = kotlin.Unit.A00
            return r0
        L_0x0034:
            X.AnonymousClass0OU.A00(r0)
            X.0Oa r0 = r8.A04
            java.lang.Object r1 = X.C18190wL.A0f(r0)
            X.0nS r1 = (X.C13330nS) r1
            java.lang.String r0 = "subscription_exclusive_content_public_preview_remove"
            X.0A2 r1 = X.AnonymousClass0wJ.A0M(r1, r0)
            r0 = 2748(0xabc, float:3.851E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r1 = X.C18180wK.A0I(r1, r0)
            X.0kW r0 = r8.A00
            java.lang.String r0 = r0.getModuleName()
            X.C18230wP.A1H(r1, r0)
            X.BKN r0 = r9.A0f
            com.instagram.user.model.User r0 = r0.A1i
            if (r0 == 0) goto L_0x0084
            A00(r1, r9, r0)
            X.4wE r7 = r8.A05
            X.48w r4 = r8.A01
            X.C18240wQ.A1M(r7, r9, r5, r2)
            X.4qz r0 = r4.A01
            X.Ew2 r3 = r0.Aa1()
            r2 = 0
            r1 = 14
            kotlin.coroutines.jvm.internal.KtSLambdaShape20S0201000_I2_6 r0 = new kotlin.coroutines.jvm.internal.KtSLambdaShape20S0201000_I2_6
            r0.<init>(r9, r4, r2, r1)
            java.lang.Object r0 = X.C25599DoZ.A00(r5, r3, r0)
            if (r0 != r6) goto L_0x002a
            return r6
        L_0x0079:
            kotlin.coroutines.jvm.internal.KtCImplShape1S0401000_I2_1 r5 = new kotlin.coroutines.jvm.internal.KtCImplShape1S0401000_I2_1
            r5.<init>(r8, r10, r3)
            goto L_0x0016
        L_0x007f:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x0084:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0b()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.preview.impl.FanClubContentPreviewInteractorImpl.AEZ(X.BKU, X.8n9):java.lang.Object");
    }

    public static void A00(AnonymousClass0A3 r4, BKU bku, User user) {
        r4.A0S("creator_igid", new Long(Long.parseLong(user.getId())));
        String str = bku.A0N;
        C04220Ms.A06(str);
        List singletonList = Collections.singletonList(new Long(Long.parseLong(str)));
        C04220Ms.A06(singletonList);
        r4.A0U("media_ids", singletonList);
        r4.A0T("origin", "media_menu");
        r4.Bb4();
    }
}
