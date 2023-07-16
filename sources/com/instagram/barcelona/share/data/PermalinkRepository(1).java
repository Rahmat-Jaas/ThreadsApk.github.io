package com.instagram.barcelona.share.data;

import X.AnonymousClass006;
import X.AnonymousClass00U;
import X.AnonymousClass0TJ;
import X.BKU;
import X.C11630kW;
import X.C146958n9;
import X.C18190wL;
import X.C63413hR;
import X.C63623hv;
import X.C63803iN;
import android.net.Uri;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;

public final class PermalinkRepository {
    public final UserSession A00;

    public final Object A00(C11630kW r4, BKU bku, C146958n9 r6) {
        return C63623hv.A00(C63413hR.A00(bku, this.A00, AnonymousClass006.A00, r4.getModuleName()), r6, 879282936, 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(X.C11630kW r6, X.BKU r7, X.C146958n9 r8) {
        /*
            r5 = this;
            r3 = 36
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2.A00(r3, r8)
            if (r0 == 0) goto L_0x006a
            r4 = r8
            kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2 r4 = (kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x006a
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r3 = r4.A03
            X.D0E r2 = X.D0E.COROUTINE_SUSPENDED
            int r1 = r4.A00
            r0 = 1
            if (r1 == 0) goto L_0x0058
            if (r1 != r0) goto L_0x0070
            java.lang.Object r7 = r4.A02
            X.BKU r7 = (X.BKU) r7
            java.lang.Object r2 = r4.A01
            com.instagram.barcelona.share.data.PermalinkRepository r2 = (com.instagram.barcelona.share.data.PermalinkRepository) r2
            X.AnonymousClass0OU.A00(r3)
        L_0x002c:
            X.3b6 r3 = (X.C62903b6) r3
            boolean r0 = r3 instanceof X.AnonymousClass1jA
            if (r0 == 0) goto L_0x004f
            X.1jA r3 = (X.AnonymousClass1jA) r3
            java.lang.Object r3 = r3.A00
            X.1Sb r3 = (X.C21761Sb) r3
            java.lang.String r1 = r3.A00
            com.instagram.service.session.UserSession r0 = r2.A00
            java.lang.String r2 = X.AnonymousClass3iG.A00(r7, r0, r1)
            java.lang.String r1 = r3.A00
            X.C04220Ms.A06(r2)
            X.18s r0 = new X.18s
            r0.<init>(r7, r1, r2)
            X.1jA r3 = X.AnonymousClass1jA.A00(r0)
        L_0x004e:
            return r3
        L_0x004f:
            boolean r0 = r3 instanceof X.AnonymousClass1jB
            if (r0 != 0) goto L_0x004e
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x0058:
            X.AnonymousClass0OU.A00(r3)
            r4.A01 = r5
            r4.A02 = r7
            r4.A00 = r0
            java.lang.Object r3 = r5.A00(r6, r7, r4)
            if (r3 != r2) goto L_0x0068
            return r2
        L_0x0068:
            r2 = r5
            goto L_0x002c
        L_0x006a:
            kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2 r4 = new kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2
            r4.<init>(r5, r8, r3)
            goto L_0x0016
        L_0x0070:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.barcelona.share.data.PermalinkRepository.A01(X.0kW, X.BKU, X.8n9):java.lang.Object");
    }

    public final String A02(User user) {
        String A0L = AnonymousClass00U.A0L("@", user.BK7());
        UserSession userSession = this.A00;
        AnonymousClass0TJ r2 = AnonymousClass0TJ.A05;
        String A0C = C63803iN.A0C(r2, userSession, 36890023861158423L);
        return C18190wL.A0n(new Uri.Builder().scheme("https").authority(A0C).path(C63803iN.A0C(r2, userSession, 36890023861223960L)).appendEncodedPath(A0L));
    }

    public PermalinkRepository(UserSession userSession) {
        this.A00 = userSession;
    }
}
