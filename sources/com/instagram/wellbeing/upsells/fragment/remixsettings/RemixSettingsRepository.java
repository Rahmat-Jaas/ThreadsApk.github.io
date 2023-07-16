package com.instagram.wellbeing.upsells.fragment.remixsettings;

import X.AnonymousClass76U;
import X.AnonymousClass79D;
import X.C112766q9;
import X.C11630kW;
import X.C170759vW;
import com.instagram.service.session.UserSession;

public final class RemixSettingsRepository {
    public final UserSession A00;
    public final C170759vW A01;
    public final AnonymousClass79D A02;
    public final String A03;
    public final C11630kW A04;
    public final C112766q9 A05;
    public final AnonymousClass76U A06;

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.C310423z r9, X.C310423z r10, X.C146958n9 r11, boolean r12) {
        /*
            r8 = this;
            r3 = 5
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape0S0311000_I2.A00(r3, r11)
            if (r0 == 0) goto L_0x00d3
            r4 = r11
            kotlin.coroutines.jvm.internal.KtCImplShape0S0311000_I2 r4 = (kotlin.coroutines.jvm.internal.KtCImplShape0S0311000_I2) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00d3
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0015:
            java.lang.Object r1 = r4.A02
            X.D0E r5 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r4.A00
            r6 = 1
            if (r0 == 0) goto L_0x0071
            if (r0 != r6) goto L_0x00df
            boolean r12 = r4.A04
            java.lang.Object r3 = r4.A01
            com.instagram.wellbeing.upsells.fragment.remixsettings.RemixSettingsRepository r3 = (com.instagram.wellbeing.upsells.fragment.remixsettings.RemixSettingsRepository) r3
            X.AnonymousClass0OU.A00(r1)
        L_0x0029:
            boolean r0 = r1 instanceof X.AnonymousClass1jA
            if (r0 == 0) goto L_0x0068
            if (r12 == 0) goto L_0x005c
            X.76U r1 = r3.A06
            java.lang.Integer r0 = X.AnonymousClass006.A15
            X.AnonymousClass76U.A00(r1, r0)
        L_0x0036:
            X.1jA r1 = X.C62903b6.A03()
        L_0x003a:
            boolean r0 = r1 instanceof X.AnonymousClass1jA
            if (r0 != 0) goto L_0x004f
            boolean r0 = r1 instanceof X.AnonymousClass1jB
            if (r0 == 0) goto L_0x00da
            if (r12 == 0) goto L_0x0050
            X.76U r1 = r3.A06
            java.lang.Integer r0 = X.AnonymousClass006.A1C
            X.AnonymousClass76U.A00(r1, r0)
        L_0x004b:
            X.1jB r1 = X.AnonymousClass1jB.A01()
        L_0x004f:
            return r1
        L_0x0050:
            X.6q9 r2 = r3.A05
            java.lang.Integer r1 = X.AnonymousClass006.A0Y
            java.util.LinkedHashMap r0 = X.C18220wO.A0y()
            r2.A00(r1, r0)
            goto L_0x004b
        L_0x005c:
            X.6q9 r2 = r3.A05
            java.lang.Integer r1 = X.AnonymousClass006.A0N
            java.util.LinkedHashMap r0 = X.C18220wO.A0y()
            r2.A00(r1, r0)
            goto L_0x0036
        L_0x0068:
            boolean r0 = r1 instanceof X.AnonymousClass1jB
            if (r0 != 0) goto L_0x003a
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x0071:
            X.AnonymousClass0OU.A00(r1)
            if (r12 != 0) goto L_0x009c
            X.6q9 r7 = r8.A05
            java.lang.String r1 = r9.name()
            java.lang.String r3 = r10.name()
            X.C18210wN.A0n(r6, r1, r3)
            java.lang.Integer r2 = X.AnonymousClass006.A0C
            java.lang.String r0 = "original_value"
            kotlin.Pair r1 = X.C18180wK.A0p(r0, r1)
            java.lang.String r0 = "new_value"
            kotlin.Pair r0 = X.C18180wK.A0p(r0, r3)
            kotlin.Pair[] r0 = new kotlin.Pair[]{r1, r0}
            java.util.Map r0 = X.AnonymousClass4WJ.A0I(r0)
            r7.A00(r2, r0)
        L_0x009c:
            int r3 = r10.A00
            com.instagram.service.session.UserSession r1 = r8.A00
            X.0kW r0 = r8.A04
            java.lang.String r2 = X.C18230wP.A0n(r0)
            X.H1T r1 = X.AnonymousClass0wJ.A0O(r1)
            java.lang.String r0 = "clips/user/set_mashups_allowed_type/"
            r1.A0J(r0)
            java.lang.String r0 = "mashups_allowed_type"
            r1.A0K(r0, r3)
            java.lang.String r0 = "container_module"
            r1.A0O(r0, r2)
            X.H8c r3 = X.AnonymousClass0wJ.A0S(r1)
            r2 = 0
            r1 = 14
            r4.A01 = r8
            r4.A04 = r12
            r4.A00 = r6
            r0 = 1588772734(0x5eb2bf7e, float:6.440076E18)
            java.lang.Object r1 = X.C63623hv.A01(r3, r4, r0, r2, r1)
            if (r1 != r5) goto L_0x00d0
            return r5
        L_0x00d0:
            r3 = r8
            goto L_0x0029
        L_0x00d3:
            kotlin.coroutines.jvm.internal.KtCImplShape0S0311000_I2 r4 = new kotlin.coroutines.jvm.internal.KtCImplShape0S0311000_I2
            r4.<init>(r8, r11, r3)
            goto L_0x0015
        L_0x00da:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x00df:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.wellbeing.upsells.fragment.remixsettings.RemixSettingsRepository.A00(X.23z, X.23z, X.8n9, boolean):java.lang.Object");
    }

    public RemixSettingsRepository(C11630kW r1, UserSession userSession, C170759vW r3, C112766q9 r4, AnonymousClass79D r5, AnonymousClass76U r6, String str) {
        this.A00 = userSession;
        this.A03 = str;
        this.A01 = r3;
        this.A02 = r5;
        this.A05 = r4;
        this.A06 = r6;
        this.A04 = r1;
    }
}
