package com.instagram.monetization.api;

import X.AnonymousClass000;
import X.AnonymousClass006;
import X.AnonymousClass00U;
import X.AnonymousClass0wJ;
import X.AnonymousClass1jA;
import X.AnonymousClass5sl;
import X.C04220Ms;
import X.C117326yV;
import X.C146578mT;
import X.C18180wK;
import X.C18200wM;
import X.C32165H8c;
import X.H1T;
import android.text.TextUtils;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.service.session.UserSession;
import java.util.List;

public final class MonetizationApi {
    public final UserSession A00;

    public MonetizationApi(UserSession userSession) {
        C04220Ms.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public static boolean A01(Object obj) {
        C146578mT r0 = (C146578mT) ((AnonymousClass1jA) obj).A00;
        return r0 != null && r0.isOk();
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A02(com.instagram.api.schemas.UserMonetizationProductType r8, X.C146958n9 r9) {
        /*
            r7 = this;
            r3 = 33
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape8S0201000_I2_6.A00(r3, r9)
            if (r0 == 0) goto L_0x0070
            r6 = r9
            kotlin.coroutines.jvm.internal.KtCImplShape8S0201000_I2_6 r6 = (kotlin.coroutines.jvm.internal.KtCImplShape8S0201000_I2_6) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0070
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r6.A01
            X.D0E r5 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r6.A00
            r4 = 0
            r3 = 1
            if (r0 == 0) goto L_0x004d
            if (r0 != r3) goto L_0x007a
            X.AnonymousClass0OU.A00(r1)
        L_0x0025:
            X.3b6 r1 = (X.C62903b6) r1
            boolean r0 = r1 instanceof X.AnonymousClass1jA
            if (r0 == 0) goto L_0x0044
            boolean r0 = A01(r1)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            X.1jA r1 = X.AnonymousClass1jA.A00(r0)
        L_0x0037:
            boolean r0 = r1 instanceof X.AnonymousClass1jA
            if (r0 != 0) goto L_0x0043
            boolean r0 = r1 instanceof X.AnonymousClass1jB
            if (r0 == 0) goto L_0x0075
            X.1jB r1 = X.AnonymousClass1jB.A01()
        L_0x0043:
            return r1
        L_0x0044:
            boolean r0 = r1 instanceof X.AnonymousClass1jB
            if (r0 != 0) goto L_0x0037
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x004d:
            X.AnonymousClass0OU.A00(r1)
            com.instagram.service.session.UserSession r0 = r7.A00
            X.H1T r2 = X.AnonymousClass0wJ.A0O(r0)
            java.lang.String r0 = "creators/onboarding/accept_tos/"
            r2.A0J(r0)
            java.lang.String r1 = r8.A00
            java.lang.String r0 = "product_type"
            X.H8c r2 = X.C86104wH.A0T(r2, r0, r1)
            r1 = 210(0xd2, float:2.94E-43)
            r0 = 14
            r6.A00 = r3
            java.lang.Object r1 = X.C63623hv.A01(r2, r6, r1, r4, r0)
            if (r1 != r5) goto L_0x0025
            return r5
        L_0x0070:
            kotlin.coroutines.jvm.internal.KtCImplShape8S0201000_I2_6 r6 = X.C86154wM.A0w(r7, r9, r3)
            goto L_0x0016
        L_0x0075:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x007a:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.monetization.api.MonetizationApi.A02(com.instagram.api.schemas.UserMonetizationProductType, X.8n9):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A03(com.instagram.api.schemas.UserMonetizationProductType r8, X.C146958n9 r9) {
        /*
            r7 = this;
            r3 = 36
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape8S0201000_I2_6.A00(r3, r9)
            if (r0 == 0) goto L_0x0071
            r6 = r9
            kotlin.coroutines.jvm.internal.KtCImplShape8S0201000_I2_6 r6 = (kotlin.coroutines.jvm.internal.KtCImplShape8S0201000_I2_6) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0071
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r6.A01
            X.D0E r5 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r6.A00
            r4 = 0
            r3 = 1
            if (r0 == 0) goto L_0x004d
            if (r0 != r3) goto L_0x007b
            X.AnonymousClass0OU.A00(r1)
        L_0x0025:
            X.3b6 r1 = (X.C62903b6) r1
            boolean r0 = r1 instanceof X.AnonymousClass1jA
            if (r0 == 0) goto L_0x0044
            boolean r0 = A01(r1)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            X.1jA r1 = X.AnonymousClass1jA.A00(r0)
        L_0x0037:
            boolean r0 = r1 instanceof X.AnonymousClass1jA
            if (r0 != 0) goto L_0x0043
            boolean r0 = r1 instanceof X.AnonymousClass1jB
            if (r0 == 0) goto L_0x0076
            X.1jB r1 = X.AnonymousClass1jB.A01()
        L_0x0043:
            return r1
        L_0x0044:
            boolean r0 = r1 instanceof X.AnonymousClass1jB
            if (r0 != 0) goto L_0x0037
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x004d:
            X.AnonymousClass0OU.A00(r1)
            com.instagram.service.session.UserSession r0 = r7.A00
            X.H1T r2 = X.AnonymousClass0wJ.A0O(r0)
            java.lang.String r0 = "creators/onboarding/mark_checklist_screen_seen/"
            r2.A0J(r0)
            java.lang.String r1 = r8.A00
            java.lang.String r0 = "product_type"
            X.H8c r2 = X.C86104wH.A0T(r2, r0, r1)
            r1 = 490845545(0x1d41b569, float:2.5637124E-21)
            r0 = 14
            r6.A00 = r3
            java.lang.Object r1 = X.C63623hv.A01(r2, r6, r1, r4, r0)
            if (r1 != r5) goto L_0x0025
            return r5
        L_0x0071:
            kotlin.coroutines.jvm.internal.KtCImplShape8S0201000_I2_6 r6 = X.C86154wM.A0w(r7, r9, r3)
            goto L_0x0016
        L_0x0076:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x007b:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.monetization.api.MonetizationApi.A03(com.instagram.api.schemas.UserMonetizationProductType, X.8n9):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A04(com.instagram.api.schemas.UserMonetizationProductType r8, X.C146958n9 r9) {
        /*
            r7 = this;
            r3 = 37
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape8S0201000_I2_6.A00(r3, r9)
            if (r0 == 0) goto L_0x0071
            r6 = r9
            kotlin.coroutines.jvm.internal.KtCImplShape8S0201000_I2_6 r6 = (kotlin.coroutines.jvm.internal.KtCImplShape8S0201000_I2_6) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0071
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r6.A01
            X.D0E r5 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r6.A00
            r4 = 0
            r3 = 1
            if (r0 == 0) goto L_0x004d
            if (r0 != r3) goto L_0x007b
            X.AnonymousClass0OU.A00(r1)
        L_0x0025:
            X.3b6 r1 = (X.C62903b6) r1
            boolean r0 = r1 instanceof X.AnonymousClass1jA
            if (r0 == 0) goto L_0x0044
            boolean r0 = A01(r1)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            X.1jA r1 = X.AnonymousClass1jA.A00(r0)
        L_0x0037:
            boolean r0 = r1 instanceof X.AnonymousClass1jA
            if (r0 != 0) goto L_0x0043
            boolean r0 = r1 instanceof X.AnonymousClass1jB
            if (r0 == 0) goto L_0x0076
            X.1jB r1 = X.AnonymousClass1jB.A01()
        L_0x0043:
            return r1
        L_0x0044:
            boolean r0 = r1 instanceof X.AnonymousClass1jB
            if (r0 != 0) goto L_0x0037
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x004d:
            X.AnonymousClass0OU.A00(r1)
            com.instagram.service.session.UserSession r0 = r7.A00
            X.H1T r2 = X.AnonymousClass0wJ.A0O(r0)
            java.lang.String r0 = "creators/onboarding/mark_confirmation_screen_done/"
            r2.A0J(r0)
            java.lang.String r1 = r8.A00
            java.lang.String r0 = "product_type"
            X.H8c r2 = X.C86104wH.A0T(r2, r0, r1)
            r1 = 490845545(0x1d41b569, float:2.5637124E-21)
            r0 = 14
            r6.A00 = r3
            java.lang.Object r1 = X.C63623hv.A01(r2, r6, r1, r4, r0)
            if (r1 != r5) goto L_0x0025
            return r5
        L_0x0071:
            kotlin.coroutines.jvm.internal.KtCImplShape8S0201000_I2_6 r6 = X.C86154wM.A0w(r7, r9, r3)
            goto L_0x0016
        L_0x0076:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x007b:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.monetization.api.MonetizationApi.A04(com.instagram.api.schemas.UserMonetizationProductType, X.8n9):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A05(com.instagram.api.schemas.UserMonetizationProductType r8, X.C146958n9 r9) {
        /*
            r7 = this;
            r3 = 38
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape8S0201000_I2_6.A00(r3, r9)
            if (r0 == 0) goto L_0x0071
            r6 = r9
            kotlin.coroutines.jvm.internal.KtCImplShape8S0201000_I2_6 r6 = (kotlin.coroutines.jvm.internal.KtCImplShape8S0201000_I2_6) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0071
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r6.A01
            X.D0E r5 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r6.A00
            r4 = 0
            r3 = 1
            if (r0 == 0) goto L_0x004d
            if (r0 != r3) goto L_0x007b
            X.AnonymousClass0OU.A00(r1)
        L_0x0025:
            X.3b6 r1 = (X.C62903b6) r1
            boolean r0 = r1 instanceof X.AnonymousClass1jA
            if (r0 == 0) goto L_0x0044
            boolean r0 = A01(r1)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            X.1jA r1 = X.AnonymousClass1jA.A00(r0)
        L_0x0037:
            boolean r0 = r1 instanceof X.AnonymousClass1jA
            if (r0 != 0) goto L_0x0043
            boolean r0 = r1 instanceof X.AnonymousClass1jB
            if (r0 == 0) goto L_0x0076
            X.1jB r1 = X.AnonymousClass1jB.A01()
        L_0x0043:
            return r1
        L_0x0044:
            boolean r0 = r1 instanceof X.AnonymousClass1jB
            if (r0 != 0) goto L_0x0037
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x004d:
            X.AnonymousClass0OU.A00(r1)
            com.instagram.service.session.UserSession r0 = r7.A00
            X.H1T r2 = X.AnonymousClass0wJ.A0O(r0)
            java.lang.String r0 = "creators/onboarding/mark_preview_screen_seen/"
            r2.A0J(r0)
            java.lang.String r1 = r8.A00
            java.lang.String r0 = "product_type"
            X.H8c r2 = X.C86104wH.A0T(r2, r0, r1)
            r1 = 490845545(0x1d41b569, float:2.5637124E-21)
            r0 = 14
            r6.A00 = r3
            java.lang.Object r1 = X.C63623hv.A01(r2, r6, r1, r4, r0)
            if (r1 != r5) goto L_0x0025
            return r5
        L_0x0071:
            kotlin.coroutines.jvm.internal.KtCImplShape8S0201000_I2_6 r6 = X.C86154wM.A0w(r7, r9, r3)
            goto L_0x0016
        L_0x0076:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x007b:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.monetization.api.MonetizationApi.A05(com.instagram.api.schemas.UserMonetizationProductType, X.8n9):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A06(java.lang.String r13, X.C146958n9 r14) {
        /*
            r12 = this;
            r3 = 35
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape8S0201000_I2_6.A00(r3, r14)
            if (r0 == 0) goto L_0x0090
            r5 = r14
            kotlin.coroutines.jvm.internal.KtCImplShape8S0201000_I2_6 r5 = (kotlin.coroutines.jvm.internal.KtCImplShape8S0201000_I2_6) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0090
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r5.A01
            X.D0E r6 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r5.A00
            r7 = 1
            if (r0 == 0) goto L_0x0048
            if (r0 != r7) goto L_0x009a
            X.AnonymousClass0OU.A00(r1)
        L_0x0024:
            X.3b6 r1 = (X.C62903b6) r1
            boolean r0 = r1 instanceof X.AnonymousClass1jA
            if (r0 == 0) goto L_0x003f
            java.lang.Object r0 = X.C62903b6.A05(r1)
            X.1jA r1 = X.AnonymousClass1jA.A00(r0)
        L_0x0032:
            boolean r0 = r1 instanceof X.AnonymousClass1jA
            if (r0 != 0) goto L_0x003e
            boolean r0 = r1 instanceof X.AnonymousClass1jB
            if (r0 == 0) goto L_0x0095
            X.1jB r1 = X.AnonymousClass1jB.A01()
        L_0x003e:
            return r1
        L_0x003f:
            boolean r0 = r1 instanceof X.AnonymousClass1jB
            if (r0 != 0) goto L_0x0032
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x0048:
            X.AnonymousClass0OU.A00(r1)
            com.instagram.service.session.UserSession r0 = r12.A00
            r4 = 0
            X.C04220Ms.A0B(r13, r7)
            X.H1T r10 = X.C18180wK.A0P(r0)
            java.lang.String r9 = "product_type"
            java.lang.String r11 = "api/"
            java.lang.String r8 = "v1/"
            java.lang.String r3 = "creators/"
            java.lang.String r2 = "onboarding/"
            java.lang.String r1 = "get_monetization_products_onboarding_data/"
            java.lang.Integer r0 = X.AnonymousClass006.A0N
            r10.A0F(r0)
            r10.A04()
            java.lang.String r0 = X.AnonymousClass00U.A0h(r11, r8, r3, r2, r1)
            X.C04220Ms.A06(r0)
            r10.A0J(r0)
            java.lang.Class<X.5t8> r1 = X.AnonymousClass5t8.class
            java.lang.Class<X.6yW> r0 = X.C117336yW.class
            r10.A0B(r1, r0)
            X.H8c r2 = X.C18200wM.A0T(r10, r9, r13)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.common.api.base.HttpRequestTask<com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.MonetizationProductsOnboardingData>>"
            X.C04220Ms.A0C(r2, r0)
            r1 = 14
            r5.A00 = r7
            r0 = 210(0xd2, float:2.94E-43)
            java.lang.Object r1 = X.C63623hv.A01(r2, r5, r0, r4, r1)
            if (r1 != r6) goto L_0x0024
            return r6
        L_0x0090:
            kotlin.coroutines.jvm.internal.KtCImplShape8S0201000_I2_6 r5 = X.C86154wM.A0w(r12, r14, r3)
            goto L_0x0016
        L_0x0095:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x009a:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.monetization.api.MonetizationApi.A06(java.lang.String, X.8n9):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A07(X.C146958n9 r8) {
        /*
            r7 = this;
            r3 = 34
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape8S0201000_I2_6.A00(r3, r8)
            if (r0 == 0) goto L_0x005c
            r6 = r8
            kotlin.coroutines.jvm.internal.KtCImplShape8S0201000_I2_6 r6 = (kotlin.coroutines.jvm.internal.KtCImplShape8S0201000_I2_6) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x005c
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r6.A01
            X.D0E r5 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r6.A00
            r4 = 1
            if (r0 == 0) goto L_0x0032
            if (r0 != r4) goto L_0x0066
            X.AnonymousClass0OU.A00(r1)
        L_0x0024:
            r5 = r1
            boolean r0 = r1 instanceof X.AnonymousClass1jA
            if (r0 != 0) goto L_0x0031
            boolean r0 = r1 instanceof X.AnonymousClass1jB
            if (r0 == 0) goto L_0x0061
            X.1jB r5 = X.AnonymousClass1jB.A01()
        L_0x0031:
            return r5
        L_0x0032:
            X.AnonymousClass0OU.A00(r1)
            com.instagram.service.session.UserSession r0 = r7.A00
            r3 = 210(0xd2, float:2.94E-43)
            X.H1T r2 = new X.H1T
            r2.<init>(r0, r3)
            java.lang.Integer r0 = X.AnonymousClass006.A0N
            r2.A0F(r0)
            java.lang.String r0 = "business/eligibility/get_monetization_products_onboarding_eligibility_data/"
            r2.A0J(r0)
            java.lang.Class<X.5te> r1 = X.C94035te.class
            java.lang.Class<X.71N> r0 = X.AnonymousClass71N.class
            X.H8c r2 = X.AnonymousClass0wJ.A0T(r2, r1, r0)
            r1 = 0
            r0 = 14
            r6.A00 = r4
            java.lang.Object r1 = X.C63623hv.A01(r2, r6, r3, r1, r0)
            if (r1 != r5) goto L_0x0024
            return r5
        L_0x005c:
            kotlin.coroutines.jvm.internal.KtCImplShape8S0201000_I2_6 r6 = X.C86154wM.A0w(r7, r8, r3)
            goto L_0x0016
        L_0x0061:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x0066:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.monetization.api.MonetizationApi.A07(X.8n9):java.lang.Object");
    }

    public static final C32165H8c A00(UserSession userSession, List list) {
        AnonymousClass0wJ.A1N(userSession, list);
        String join = TextUtils.join(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, list);
        C04220Ms.A06(join);
        H1T A0P = C18180wK.A0P(userSession);
        String A002 = AnonymousClass000.A00(1317);
        A0P.A0F(AnonymousClass006.A0N);
        A0P.A04();
        String A0h = AnonymousClass00U.A0h("api/", "v1/", "creators/", A002, "get_monetization_products_gating/");
        C04220Ms.A06(A0h);
        A0P.A0J(A0h);
        A0P.A0B(AnonymousClass5sl.class, C117326yV.class);
        C32165H8c A0T = C18200wM.A0T(A0P, "product_types", join);
        C04220Ms.A0C(A0T, "null cannot be cast to non-null type com.instagram.common.api.base.HttpRequestTask<com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.MonetizationProductGatingResponse>>");
        return A0T;
    }
}
