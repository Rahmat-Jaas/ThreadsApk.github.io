package com.instagram.nux.ndx.util;

import X.AnonymousClass0YP;
import X.C146958n9;
import X.C18220wO;
import X.C39142Kno;
import X.C57473Be;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.nux.ndx.util.NdxStepsManager$updateEligibleStepsStore$1", f = "NdxStepsManager.kt", i = {0, 0}, l = {42, 48}, m = "invokeSuspend", n = {"steps", "start$iv"}, s = {"L$0", "J$0"})
public final class NdxStepsManager$updateEligibleStepsStore$1 extends C39142Kno implements AnonymousClass0YP {
    public int A00;
    public long A01;
    public Object A02;
    public Object A03;
    public final /* synthetic */ int A04;
    public final /* synthetic */ long A05;
    public final /* synthetic */ C57473Be A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NdxStepsManager$updateEligibleStepsStore$1(C57473Be r2, C146958n9 r3, int i, long j) {
        super(2, r3);
        this.A06 = r2;
        this.A05 = j;
        this.A04 = i;
    }

    public final C146958n9 create(Object obj, C146958n9 r8) {
        return new NdxStepsManager$updateEligibleStepsStore$1(this.A06, r8, this.A04, this.A05);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00ee, code lost:
        if (r14 == r5) goto L_0x00f0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x00d8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            X.D0E r5 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r13.A00
            r4 = 2
            r9 = 1
            if (r0 == 0) goto L_0x0099
            if (r0 == r9) goto L_0x008b
            java.lang.Object r6 = r13.A02
            X.3Be r6 = (X.C57473Be) r6
            X.AnonymousClass0OU.A00(r14)
        L_0x0011:
            java.util.AbstractCollection r14 = (java.util.AbstractCollection) r14
            r14.isEmpty()
            long r7 = java.lang.System.currentTimeMillis()
            com.instagram.service.session.UserSession r0 = r6.A02
            java.lang.Integer r2 = r6.A03
            X.49q r1 = X.AnonymousClass3Zs.A03(r0)
            X.D2R r0 = X.D2R.A1a
            android.content.SharedPreferences r0 = r1.A01(r0)
            r5 = 0
            X.C04220Ms.A0B(r2, r4)
            android.content.SharedPreferences$Editor r4 = r0.edit()
            java.util.Set r1 = X.AnonymousClass00J.A0c(r14)
            java.lang.String r0 = "ndx_ig4a_steps"
            android.content.SharedPreferences$Editor r3 = r4.putStringSet(r0, r1)
            long r1 = java.lang.System.currentTimeMillis()
            java.lang.String r0 = "written_timestamp"
            r3.putLong(r0, r1)
            java.lang.String r0 = "multiple_account"
            boolean r0 = r14.contains(r0)
            if (r0 == 0) goto L_0x0050
            java.lang.String r0 = "ma_impression_cnt"
            r4.putInt(r0, r5)
        L_0x0050:
            r4.apply()
            long r7 = X.C18240wQ.A09(r7)
            X.3Gj r4 = r6.A01
            java.util.Iterator r3 = r14.iterator()
        L_0x005d:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00f1
            java.lang.String r1 = X.C18180wK.A0k(r3)
            X.0nS r0 = r4.A00
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r2 = com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000.A02(r0)
            java.lang.String r0 = "flow_name"
            r2.A0T(r0, r1)
            java.lang.String r0 = "written"
            X.C18200wM.A1I(r2, r0)
            java.lang.String r1 = java.lang.String.valueOf(r7)
            java.lang.String r0 = "step_latency"
            r2.A0T(r0, r1)
            java.lang.String r1 = "NDX_IG4A_MA_FEATURE"
            java.lang.String r0 = "ig_ndx_source"
            r2.A0T(r0, r1)
            r2.Bb4()
            goto L_0x005d
        L_0x008b:
            long r0 = r13.A01
            java.lang.Object r2 = r13.A03
            X.0MJ r2 = (X.AnonymousClass0MJ) r2
            java.lang.Object r3 = r13.A02
            X.0MJ r3 = (X.AnonymousClass0MJ) r3
            X.AnonymousClass0OU.A00(r14)
            goto L_0x00c1
        L_0x0099:
            X.AnonymousClass0OU.A00(r14)
            X.0MJ r2 = new X.0MJ
            r2.<init>()
            X.3Be r3 = r13.A06
            int r8 = r13.A04
            long r0 = java.lang.System.currentTimeMillis()
            com.instagram.service.session.UserSession r7 = r3.A02
            java.lang.Integer r6 = r3.A03
            com.instagram.nux.ndx.util.NdxStepsFetcher r3 = new com.instagram.nux.ndx.util.NdxStepsFetcher
            r3.<init>(r7, r6)
            r13.A02 = r2
            r13.A03 = r2
            r13.A01 = r0
            r13.A00 = r9
            java.lang.Object r14 = r3.A00(r8, r13)
            if (r14 == r5) goto L_0x00f0
            r3 = r2
        L_0x00c1:
            r2.A00 = r14
            long r1 = X.C18240wQ.A09(r0)
            X.3Be r6 = r13.A06
            X.3Gj r9 = r6.A01
            java.lang.Integer r11 = r6.A03
            java.lang.Object r0 = r3.A00
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r9.A01(r11, r0, r1)
            java.lang.Object r12 = r3.A00
            if (r12 == 0) goto L_0x00f1
            com.instagram.service.session.UserSession r10 = r6.A02
            java.util.ArrayList r12 = (java.util.ArrayList) r12
            android.app.Activity r8 = r6.A00
            com.instagram.nux.ndx.util.NdxStepsFilterer r7 = new com.instagram.nux.ndx.util.NdxStepsFilterer
            r7.<init>(r8, r9, r10, r11, r12)
            r13.A02 = r6
            r0 = 0
            r13.A03 = r0
            r13.A00 = r4
            java.lang.Object r14 = r7.A01(r13)
            if (r14 != r5) goto L_0x0011
        L_0x00f0:
            return r5
        L_0x00f1:
            X.3Be r0 = r13.A06
            X.3Gj r5 = r0.A01
            java.lang.Integer r2 = r0.A03
            long r3 = java.lang.System.currentTimeMillis()
            long r0 = r13.A05
            long r3 = r3 - r0
            r0 = 0
            X.C04220Ms.A0B(r2, r0)
            X.0nS r0 = r5.A00
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r2 = com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000.A02(r0)
            java.lang.String r1 = "ig4a_ndx_request"
            java.lang.String r0 = "flow_name"
            r2.A0T(r0, r1)
            java.lang.String r0 = "finish"
            X.C18200wM.A1I(r2, r0)
            java.lang.String r1 = java.lang.String.valueOf(r3)
            java.lang.String r0 = "step_latency"
            r2.A0T(r0, r1)
            java.lang.String r1 = "NDX_IG4A_MA_FEATURE"
            java.lang.String r0 = "ig_ndx_source"
            r2.A0T(r0, r1)
            r2.Bb4()
            kotlin.Unit r5 = kotlin.Unit.A00
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.nux.ndx.util.NdxStepsManager$updateEligibleStepsStore$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((NdxStepsManager$updateEligibleStepsStore$1) C18220wO.A10(obj2, obj, this)).invokeSuspend(Unit.A00);
    }
}
