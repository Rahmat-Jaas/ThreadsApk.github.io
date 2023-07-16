package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* renamed from: X.3YH  reason: invalid class name */
public final class AnonymousClass3YH {
    public static final List A06 = Collections.synchronizedList(AnonymousClass0wJ.A0v());
    public final AnonymousClass37Q A00;
    public final AnonymousClass37R A01;
    public final C33302Fe A02;
    public final AnonymousClass33N A03;
    public final ExecutorService A04;
    public final AnonymousClass3Y2 A05;

    public final void A01(C306622k r5) {
        C04220Ms.A0B(r5, 0);
        ArrayList A14 = C06750aI.A14(r5);
        if (C63173fJ.A05(AnonymousClass0TJ.A05, 2324146373122854882L)) {
            AnonymousClass3Y2 r2 = this.A05;
            AnonymousClass3Y2.A01(AnonymousClass28H.INFO, AnonymousClass3Y2.A00("report_events", (String) null, (Throwable) null, A14), r2);
            this.A04.execute(new AnonymousClass4S6(A14, this));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0045  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(java.util.List r14, X.AnonymousClass3YH r15, boolean r16) {
        /*
            if (r16 != 0) goto L_0x007c
            X.33N r2 = r15.A03
            android.content.SharedPreferences r1 = X.C18200wM.A0C()
            java.lang.String r0 = "google_ad_id"
            java.lang.String r5 = X.C18200wM.A0h(r1, r0)
            if (r5 != 0) goto L_0x0023
            android.content.Context r0 = r2.A00
            X.3Sz r0 = X.C61383Sz.A00(r0)
            if (r0 == 0) goto L_0x007c
            java.lang.String r5 = r0.A01
            if (r5 == 0) goto L_0x0023
            X.0dD r0 = X.C08360dF.A00()
            r0.A00(r5)
        L_0x0023:
            X.37R r3 = r15.A01
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 2324146373122920419(0x204106d000010fe3, double:2.5398053756942766E-153)
            java.lang.Boolean r7 = X.C63173fJ.A01(r2, r0)
            X.4VK r2 = new X.4VK
            r4 = r14
            r2.<init>(r14, r15)
            r1 = 0
            java.util.ArrayList r8 = X.AnonymousClass0wJ.A0w(r14)
            java.util.Iterator r10 = r14.iterator()
        L_0x003f:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x007e
            java.lang.Object r6 = r10.next()
            X.22k r6 = (X.C306622k) r6
            com.facebook.graphql.calls.GQLCallInputCInputShape0S0000000 r9 = com.facebook.graphql.calls.GraphQlCallInput.A00()
            java.lang.String r0 = "adid"
            com.facebook.graphql.calls.GraphQlCallInput.A05(r9, r5, r0)
            int r6 = X.C18230wP.A04(r6, r1)
            if (r6 == r1) goto L_0x0079
            r0 = 1
            if (r6 == r0) goto L_0x0076
            r0 = 4
            if (r6 == r0) goto L_0x0073
            r6 = 0
        L_0x0061:
            java.lang.String r0 = "event_name"
            com.facebook.graphql.calls.GraphQlCallInput.A05(r9, r6, r0)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r16)
            java.lang.String r0 = "no_advertisement_id"
            com.facebook.graphql.calls.GraphQlCallInput.A05(r9, r6, r0)
            r8.add(r9)
            goto L_0x003f
        L_0x0073:
            java.lang.String r6 = "RESURRECTION"
            goto L_0x0061
        L_0x0076:
            java.lang.String r6 = "REGISTRATION"
            goto L_0x0061
        L_0x0079:
            java.lang.String r6 = "LOGIN"
            goto L_0x0061
        L_0x007c:
            r5 = 0
            goto L_0x0023
        L_0x007e:
            com.facebook.graphql.calls.GQLCallInputCInputShape1S0000000 r6 = new com.facebook.graphql.calls.GQLCallInputCInputShape1S0000000
            r6.<init>()
            java.lang.String r0 = "events"
            r6.A0A(r0, r8)
            java.lang.String r0 = "log_only"
            com.facebook.graphql.calls.GraphQlCallInput.A05(r6, r7, r0)
            java.lang.String r5 = X.C18180wK.A0e()
            java.lang.String r0 = "client_mutation_id"
            com.facebook.graphql.calls.GraphQlCallInput.A05(r6, r5, r0)
            com.instagram.service.session.UserSession r0 = r3.A01
            java.lang.String r5 = r0.getUserId()
            java.lang.String r0 = "actor_id"
            com.facebook.graphql.calls.GraphQlCallInput.A05(r6, r5, r0)
            r13 = 0
            X.3zb r5 = X.C67463zb.A00()
            X.3zb r0 = X.C67463zb.A00()
            X.C67463zb.A01(r6, r5)
            r12 = 1
            X.8l9 r7 = X.C63233h2.A04(r12)
            java.util.Map r9 = com.facebook.graphql.calls.GraphQlCallInput.A03(r5)
            java.util.Map r10 = com.facebook.graphql.calls.GraphQlCallInput.A03(r0)
            java.lang.Class<com.instagram.attribution.ReportAttributionEventsMutationResponseImpl> r11 = com.instagram.attribution.ReportAttributionEventsMutationResponseImpl.class
            java.lang.String r8 = "ReportAttributionEventsMutation"
            r14 = 96
            java.lang.String r16 = "report_attribution_events"
            com.facebook.pando.PandoGraphQLRequest r6 = new com.facebook.pando.PandoGraphQLRequest
            r15 = r13
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            X.Grx r5 = r3.A00
            com.facebook.redex.IDxFCallbackShape78S0300000_1_I2 r0 = new com.facebook.redex.IDxFCallbackShape78S0300000_1_I2
            r0.<init>(r1, r3, r4, r2)
            r5.AMA(r6, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3YH.A00(java.util.List, X.3YH, boolean):void");
    }

    public AnonymousClass3YH(AnonymousClass37Q r1, AnonymousClass37R r2, C33302Fe r3, AnonymousClass33N r4, ExecutorService executorService, AnonymousClass3Y2 r6) {
        this.A02 = r3;
        this.A03 = r4;
        this.A01 = r2;
        this.A00 = r1;
        this.A04 = executorService;
        this.A05 = r6;
    }
}
