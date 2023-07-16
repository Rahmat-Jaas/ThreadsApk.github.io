package com.instagram.share.facebook.upsell.noticestate.internal;

import X.AnonymousClass0wJ;
import X.AnonymousClass3Ee;
import X.AnonymousClass3P4;
import X.C04220Ms;
import X.C18180wK;
import X.C18200wM;
import X.C207916c;
import X.C313425p;
import X.D2R;
import com.instagram.service.session.UserSession;

public final class CXPNoticeStateRepository {
    public final UserSession A00;
    public final CXPNoticeStateApi A01;
    public final AnonymousClass3Ee A02;

    public CXPNoticeStateRepository(UserSession userSession, Integer num) {
        D2R d2r;
        C04220Ms.A0B(userSession, 1);
        if (num.intValue() != 0) {
            d2r = D2R.A0j;
        } else {
            d2r = D2R.A0k;
        }
        AnonymousClass3Ee r1 = new AnonymousClass3Ee(d2r, userSession);
        CXPNoticeStateApi cXPNoticeStateApi = new CXPNoticeStateApi(userSession);
        this.A00 = userSession;
        this.A02 = r1;
        this.A01 = cXPNoticeStateApi;
    }

    public final C207916c A00(C313425p r4) {
        C207916c parseFromJson;
        String A0h = C18200wM.A0h(this.A02.A00, r4.toString());
        if (A0h == null || (parseFromJson = AnonymousClass3P4.parseFromJson(C18180wK.A0L(A0h))) == null) {
            return new C207916c(0, 0, 0, false);
        }
        return parseFromJson;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x007a, code lost:
        if (r10 < (r9.getLong("disclosure_states_last_synced_ms", 0) + X.C63803iN.A03(X.AnonymousClass0TJ.A05, r12.A00, 36607750020600570L))) goto L_0x0046;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(java.util.Map r13, X.C146958n9 r14) {
        /*
            r12 = this;
            r3 = 11
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape5S0301000_I2_4.A00(r3, r14)
            if (r0 == 0) goto L_0x008b
            r6 = r14
            kotlin.coroutines.jvm.internal.KtCImplShape5S0301000_I2_4 r6 = (kotlin.coroutines.jvm.internal.KtCImplShape5S0301000_I2_4) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x008b
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0016:
            java.lang.Object r2 = r6.A02
            X.D0E r5 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r6.A00
            r4 = 1
            if (r0 == 0) goto L_0x0049
            if (r0 != r4) goto L_0x0091
            java.lang.Object r1 = r6.A01
            com.instagram.share.facebook.upsell.noticestate.internal.CXPNoticeStateRepository r1 = (com.instagram.share.facebook.upsell.noticestate.internal.CXPNoticeStateRepository) r1
            X.AnonymousClass0OU.A00(r2)
        L_0x0028:
            java.util.Map r2 = (java.util.Map) r2
            boolean r0 = r2.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0046
            X.3Ee r0 = r1.A02
            r0.A00(r2)
            long r2 = java.lang.System.currentTimeMillis()
            android.content.SharedPreferences r0 = r0.A00
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r0 = "disclosure_states_last_synced_ms"
            X.AnonymousClass0wJ.A12(r1, r0, r2)
        L_0x0046:
            kotlin.Unit r5 = kotlin.Unit.A00
        L_0x0048:
            return r5
        L_0x0049:
            X.AnonymousClass0OU.A00(r2)
            boolean r0 = r13.isEmpty()
            if (r0 != 0) goto L_0x0046
            long r10 = java.lang.System.currentTimeMillis()
            X.3Ee r0 = r12.A02
            android.content.SharedPreferences r9 = r0.A00
            java.lang.String r3 = "disclosure_states_last_synced_ms"
            r0 = 0
            long r7 = r9.getLong(r3, r0)
            int r2 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r2 <= 0) goto L_0x007d
            long r7 = r9.getLong(r3, r0)
            com.instagram.service.session.UserSession r3 = r12.A00
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 36607750020600570(0x820e8e000112fa, double:3.214226748380822E-306)
            long r0 = X.C63803iN.A03(r2, r3, r0)
            long r7 = r7 + r0
            int r0 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x007d
            goto L_0x0046
        L_0x007d:
            com.instagram.share.facebook.upsell.noticestate.internal.CXPNoticeStateApi r0 = r12.A01
            r6.A01 = r12
            r6.A00 = r4
            java.lang.Object r2 = r0.A02(r13, r6)
            if (r2 == r5) goto L_0x0048
            r1 = r12
            goto L_0x0028
        L_0x008b:
            kotlin.coroutines.jvm.internal.KtCImplShape5S0301000_I2_4 r6 = new kotlin.coroutines.jvm.internal.KtCImplShape5S0301000_I2_4
            r6.<init>(r12, r14, r3)
            goto L_0x0016
        L_0x0091:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.share.facebook.upsell.noticestate.internal.CXPNoticeStateRepository.A01(java.util.Map, X.8n9):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A02(java.util.Map r7, X.C146958n9 r8) {
        /*
            r6 = this;
            r3 = 12
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape5S0301000_I2_4.A00(r3, r8)
            if (r0 == 0) goto L_0x005b
            r5 = r8
            kotlin.coroutines.jvm.internal.KtCImplShape5S0301000_I2_4 r5 = (kotlin.coroutines.jvm.internal.KtCImplShape5S0301000_I2_4) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x005b
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r5.A02
            X.D0E r4 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r5.A00
            r3 = 1
            if (r0 == 0) goto L_0x0034
            if (r0 != r3) goto L_0x0061
            java.lang.Object r0 = r5.A01
            com.instagram.share.facebook.upsell.noticestate.internal.CXPNoticeStateRepository r0 = (com.instagram.share.facebook.upsell.noticestate.internal.CXPNoticeStateRepository) r0
            X.AnonymousClass0OU.A00(r1)
        L_0x0028:
            java.util.Map r1 = (java.util.Map) r1
            X.3Ee r0 = r0.A02
            r0.A00(r1)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)
        L_0x0033:
            return r4
        L_0x0034:
            X.AnonymousClass0OU.A00(r1)
            r2 = 0
            X.C04220Ms.A0B(r7, r2)
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x0066
            X.3Ee r0 = r6.A02
            android.content.SharedPreferences r1 = r0.A00
            java.lang.String r0 = "has_synced_notice_states"
            boolean r0 = r1.getBoolean(r0, r2)
            if (r0 != 0) goto L_0x0066
            com.instagram.share.facebook.upsell.noticestate.internal.CXPNoticeStateApi r0 = r6.A01
            r5.A01 = r6
            r5.A00 = r3
            java.lang.Object r1 = r0.A02(r7, r5)
            if (r1 == r4) goto L_0x0033
            r0 = r6
            goto L_0x0028
        L_0x005b:
            kotlin.coroutines.jvm.internal.KtCImplShape5S0301000_I2_4 r5 = new kotlin.coroutines.jvm.internal.KtCImplShape5S0301000_I2_4
            r5.<init>(r6, r8, r3)
            goto L_0x0016
        L_0x0061:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x0066:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r2)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.share.facebook.upsell.noticestate.internal.CXPNoticeStateRepository.A02(java.util.Map, X.8n9):java.lang.Object");
    }

    public final void A03(C313425p r7, C207916c r8) {
        boolean A1Y = AnonymousClass0wJ.A1Y(r7, r8);
        AnonymousClass3Ee r4 = this.A02;
        C18180wK.A0v(r4.A00.edit(), r7.toString(), AnonymousClass3P4.A00(new C207916c(r8.A01, r8.A00, r8.A02, A1Y)));
    }
}
