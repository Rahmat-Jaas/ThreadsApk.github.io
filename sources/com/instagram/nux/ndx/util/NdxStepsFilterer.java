package com.instagram.nux.ndx.util;

import X.AnonymousClass006;
import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C18200wM;
import X.C18240wQ;
import X.C34832Lb;
import X.C58593Gj;
import android.app.Activity;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;

public final class NdxStepsFilterer {
    public final UserSession A00;
    public final ArrayList A01;
    public final Activity A02;
    public final C58593Gj A03;
    public final Integer A04;

    /* JADX WARNING: Removed duplicated region for block: B:13:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.C84874u0 r11, X.C82744qC r12, X.AnonymousClass3R9 r13, X.C09120et r14, X.AnonymousClass0BO r15, X.C146958n9 r16) {
        /*
            r10 = this;
            r8 = 1
            r3 = r16
            boolean r0 = r3 instanceof kotlin.coroutines.jvm.internal.KtCImplShape0S0501100_I2
            if (r0 == 0) goto L_0x00d9
            r7 = r3
            kotlin.coroutines.jvm.internal.KtCImplShape0S0501100_I2 r7 = (kotlin.coroutines.jvm.internal.KtCImplShape0S0501100_I2) r7
            int r0 = r7.A07
            if (r0 != r8) goto L_0x00d9
            int r2 = r7.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00d9
            int r2 = r2 - r1
            r7.A00 = r2
        L_0x0019:
            java.lang.Object r2 = r7.A05
            X.D0E r6 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r7.A00
            if (r0 == 0) goto L_0x007a
            if (r0 != r8) goto L_0x0163
            long r0 = r7.A01
            java.lang.Object r5 = r7.A04
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r7 = r7.A02
            com.instagram.nux.ndx.util.NdxStepsFilterer r7 = (com.instagram.nux.ndx.util.NdxStepsFilterer) r7
            X.AnonymousClass0OU.A00(r2)
        L_0x0030:
            com.instagram.service.session.UserSession r2 = r7.A00
            android.content.Context r4 = X.C60943Re.A00
            java.lang.String r3 = r2.getUserId()
            java.lang.String r2 = "_multiple_account_info"
            java.lang.String r2 = X.AnonymousClass00U.A0L(r3, r2)
            X.7M8 r8 = X.AnonymousClass3SL.A00(r4, r2)
            r2 = 0
            X.C04220Ms.A0B(r5, r2)
            boolean r2 = r5.isEmpty()
            if (r2 != 0) goto L_0x00ed
            java.util.ArrayList r6 = X.AnonymousClass0wJ.A0v()
            X.M4h r3 = new X.M4h
            r3.<init>()
            com.instagram.nux.aymh.accountprovider.AccountSerializer r2 = new com.instagram.nux.aymh.accountprovider.AccountSerializer
            r2.<init>()
            r3.A05(r2)
            com.google.gson.Gson r4 = r3.A03()
            java.util.Iterator r3 = r5.iterator()
        L_0x0065:
            boolean r2 = r3.hasNext()
            if (r2 == 0) goto L_0x00e0
            java.lang.Object r2 = r3.next()
            java.lang.String r2 = r4.A08(r2)
            X.C04220Ms.A06(r2)
            r6.add(r2)
            goto L_0x0065
        L_0x007a:
            X.AnonymousClass0OU.A00(r2)
            long r0 = java.lang.System.currentTimeMillis()
            java.util.List r2 = r15.A0F()
            java.util.ArrayList r4 = X.AnonymousClass0wJ.A0w(r2)
            java.util.Iterator r5 = r2.iterator()
        L_0x008d:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L_0x00a9
            java.lang.Object r2 = r5.next()
            X.4Mm r2 = (X.C72144Mm) r2
            java.lang.String r3 = r2.A01()
            java.lang.String r2 = r2.A02()
            kotlin.Pair r2 = X.C18180wK.A0p(r3, r2)
            r4.add(r2)
            goto L_0x008d
        L_0x00a9:
            java.util.Map r9 = X.AnonymousClass4WJ.A0B(r4)
            java.util.ArrayList r5 = X.AnonymousClass0wJ.A0v()
            android.app.Activity r3 = r10.A02
            com.instagram.service.session.UserSession r2 = r10.A00
            X.4tk r2 = r12.AOb(r3, r11, r2)
            X.4Ux r4 = new X.4Ux
            r4.<init>(r14, r9, r2)
            r3 = 29
            com.facebook.redex.IDxFlowShape250S0100000_1_I2 r2 = new com.facebook.redex.IDxFlowShape250S0100000_1_I2
            r2.<init>(r4, r3)
            r7.A02 = r10
            r7.A03 = r13
            r7.A04 = r5
            r7.A01 = r0
            r7.A00 = r8
            java.lang.Object r2 = X.DHE.A00(r5, r7, r2)
            if (r2 != r6) goto L_0x00d6
            return r6
        L_0x00d6:
            r7 = r10
            goto L_0x0030
        L_0x00d9:
            kotlin.coroutines.jvm.internal.KtCImplShape0S0501100_I2 r7 = new kotlin.coroutines.jvm.internal.KtCImplShape0S0501100_I2
            r7.<init>(r10, r3, r8)
            goto L_0x0019
        L_0x00e0:
            android.content.SharedPreferences$Editor r4 = r8.edit()
            java.util.Set r3 = X.AnonymousClass00J.A0c(r6)
            java.lang.String r2 = "additional_accounts"
            X.C18250wR.A0p(r4, r2, r3)
        L_0x00ed:
            X.3Gj r2 = r7.A03
            long r8 = X.C18240wQ.A09(r0)
            boolean r0 = X.C18190wL.A1a(r5)
            if (r0 == 0) goto L_0x014f
            java.lang.Integer r3 = X.AnonymousClass006.A00
        L_0x00fb:
            X.0nS r0 = r2.A00
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r7 = com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000.A02(r0)
            java.lang.String r1 = "multiple_account"
            java.lang.String r0 = "flow_name"
            int r0 = X.C18240wQ.A05(r7, r3, r0, r1)
            if (r0 == 0) goto L_0x014c
            java.lang.String r0 = "fail_client_filter"
        L_0x010d:
            X.C18200wM.A1I(r7, r0)
            java.lang.Integer r2 = X.AnonymousClass006.A00
            java.lang.String r1 = "NDX_IG4A_MA_FEATURE"
            java.lang.String r0 = "ig_ndx_source"
            r7.A0T(r0, r1)
            java.lang.String r1 = java.lang.String.valueOf(r8)
            java.lang.String r0 = "step_latency"
            r7.A0T(r0, r1)
            if (r3 != r2) goto L_0x0157
            java.util.LinkedHashMap r6 = X.C18220wO.A0y()
            java.util.Iterator r4 = r5.iterator()
        L_0x012c:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0152
            java.lang.Object r3 = r4.next()
            X.16q r3 = (X.C209216q) r3
            java.lang.String r2 = r3.A04
            r1 = 44
            java.lang.String r0 = r3.A03
            java.lang.String r1 = X.AnonymousClass00U.A0N(r2, r0, r1)
            java.lang.Integer r0 = r3.A01
            java.lang.String r0 = X.C59973Nd.A00(r0)
            r6.put(r1, r0)
            goto L_0x012c
        L_0x014c:
            java.lang.String r0 = "pass_client_filter"
            goto L_0x010d
        L_0x014f:
            java.lang.Integer r3 = X.AnonymousClass006.A01
            goto L_0x00fb
        L_0x0152:
            java.lang.String r0 = "aymh_info"
            r7.A0V(r0, r6)
        L_0x0157:
            r7.Bb4()
            boolean r0 = X.C18190wL.A1a(r5)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L_0x0163:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.nux.ndx.util.NdxStepsFilterer.A00(X.4u0, X.4qC, X.3R9, X.0et, X.0BO, X.8n9):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(X.C146958n9 r14) {
        /*
            r13 = this;
            r3 = 38
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape4S0301000_I2_3.A00(r3, r14)
            r6 = r13
            if (r0 == 0) goto L_0x008f
            r12 = r14
            kotlin.coroutines.jvm.internal.KtCImplShape4S0301000_I2_3 r12 = (kotlin.coroutines.jvm.internal.KtCImplShape4S0301000_I2_3) r12
            int r2 = r12.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x008f
            int r2 = r2 - r1
            r12.A00 = r2
        L_0x0017:
            java.lang.Object r0 = r12.A02
            X.D0E r3 = X.D0E.COROUTINE_SUSPENDED
            int r1 = r12.A00
            r4 = 1
            if (r1 == 0) goto L_0x0039
            if (r1 != r4) goto L_0x0095
            java.lang.Object r2 = r12.A01
            com.instagram.nux.ndx.util.NdxStepsFilterer r2 = (com.instagram.nux.ndx.util.NdxStepsFilterer) r2
            X.AnonymousClass0OU.A00(r0)
        L_0x0029:
            boolean r0 = X.AnonymousClass0wJ.A1X(r0)
            if (r0 != 0) goto L_0x0036
            java.util.ArrayList r1 = r2.A01
            java.lang.String r0 = "multiple_account"
            r1.remove(r0)
        L_0x0036:
            java.util.ArrayList r0 = r2.A01
            return r0
        L_0x0039:
            X.AnonymousClass0OU.A00(r0)
            java.util.ArrayList r2 = r13.A01
            java.lang.String r1 = "contact_importer"
            boolean r0 = r2.contains(r1)
            if (r0 == 0) goto L_0x004f
            boolean r0 = r13.A02()
            if (r0 != 0) goto L_0x004f
            r2.remove(r1)
        L_0x004f:
            java.lang.String r0 = "multiple_account"
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L_0x008d
            r5 = 0
            r12.A01 = r13
            r12.A00 = r4
            X.0et r10 = X.C18190wL.A0X()
            r4 = 3
            X.25t r2 = X.C313725t.GOOGLE
            X.25t r1 = X.C313725t.ONE_TAP
            X.25t r0 = X.C313725t.SMART_LOCK
            X.25t[] r0 = new X.C313725t[]{r2, r1, r0}
            java.util.Set r1 = X.AnonymousClass4WM.A08(r0)
            r0 = 0
            X.C04220Ms.A0B(r1, r0)
            X.4EZ r8 = new X.4EZ
            r8.<init>(r1)
            X.E5N r7 = X.C18250wR.A0J(r5, r4)
            com.instagram.service.session.UserSession r0 = r13.A00
            X.0BO r11 = X.C05030Qo.A01(r0)
            X.3R9 r9 = X.AnonymousClass3R9.A00
            java.lang.Object r0 = r6.A00(r7, r8, r9, r10, r11, r12)
            if (r0 != r3) goto L_0x008b
            return r3
        L_0x008b:
            r2 = r13
            goto L_0x0029
        L_0x008d:
            r2 = r13
            goto L_0x0036
        L_0x008f:
            kotlin.coroutines.jvm.internal.KtCImplShape4S0301000_I2_3 r12 = new kotlin.coroutines.jvm.internal.KtCImplShape4S0301000_I2_3
            r12.<init>(r13, r14, r3)
            goto L_0x0017
        L_0x0095:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.nux.ndx.util.NdxStepsFilterer.A01(X.8n9):java.lang.Object");
    }

    public final boolean A02() {
        Integer num;
        String str;
        String str2;
        boolean z = !C34832Lb.A00(this.A02, this.A00);
        C58593Gj r1 = this.A03;
        Integer num2 = this.A04;
        C04220Ms.A0B(num2, 0);
        if (z) {
            num = AnonymousClass006.A00;
        } else {
            num = AnonymousClass006.A01;
        }
        USLEBaseShape0S0000000 A022 = USLEBaseShape0S0000000.A02(r1.A00);
        if (C18240wQ.A05(A022, num, "flow_name", "contact_importer") != 0) {
            str = "fail_client_filter";
        } else {
            str = "pass_client_filter";
        }
        C18200wM.A1I(A022, str);
        if (num2.intValue() != 0) {
            str2 = "NDX_IG_IMMERSIVE";
        } else {
            str2 = "NDX_IG4A_MA_FEATURE";
        }
        A022.A0T("ig_ndx_source", str2);
        A022.Bb4();
        return z;
    }

    public NdxStepsFilterer(Activity activity, C58593Gj r2, UserSession userSession, Integer num, ArrayList arrayList) {
        AnonymousClass0wJ.A1Q(num, arrayList);
        this.A00 = userSession;
        this.A04 = num;
        this.A01 = arrayList;
        this.A02 = activity;
        this.A03 = r2;
    }
}
