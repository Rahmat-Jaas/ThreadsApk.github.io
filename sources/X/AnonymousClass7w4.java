package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.common.dextricks.DexOptimization;
import com.instagram.service.session.UserSession;

/* renamed from: X.7w4  reason: invalid class name */
public final class AnonymousClass7w4 implements C21342Bsn {
    public final C11630kW A00;
    public final UserSession A01;
    public final Long A02;
    public final String A03;
    public final String A04;

    public AnonymousClass7w4(C11630kW r2, UserSession userSession, Long l, String str, String str2) {
        C18190wL.A1S(str, 4, str2);
        this.A01 = userSession;
        this.A00 = r2;
        this.A02 = l;
        this.A03 = str;
        this.A04 = str2;
    }

    public static final USLEBaseShape0S0000000 A00(AnonymousClass7w4 r4, String str, String str2) {
        UserSession userSession = r4.A01;
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A01(r4.A00, userSession), "ig_lead_gen_organic_consumer"), 1256);
        A0I.A0T("flow_name", "lead_gen_consumer");
        A0I.A0T("flow_step", str);
        A0I.A0T("event_name", str2);
        A0I.A0T("event_type", DexOptimization.OPT_KEY_CLIENT);
        A0I.A0S("consumer_ig_user_fbidv2", Long.valueOf(C86104wH.A0D(A0I, userSession, r4.A04)));
        A0I.A0S("business_ig_user_fbidv2", r4.A02);
        A0I.A0S("business_ig_user_id", AnonymousClass0wJ.A0d(r4.A03));
        return A0I;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0020, code lost:
        if (r2 == null) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void BbA(android.os.Bundle r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13) {
        /*
            r8 = this;
            X.AnonymousClass0wJ.A1O(r11, r12)
            r0 = 3
            X.C04220Ms.A0B(r13, r0)
            r4 = 0
            if (r9 == 0) goto L_0x007a
            java.lang.String r0 = "form_id"
            java.lang.String r7 = r9.getString(r0)
            r0 = 1291(0x50b, float:1.809E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r6 = r9.getBoolean(r0)
            java.lang.String r0 = "question_type"
            java.lang.String r2 = r9.getString(r0)
            if (r2 != 0) goto L_0x0024
        L_0x0022:
            java.lang.String r2 = ""
        L_0x0024:
            com.instagram.service.session.UserSession r5 = r8.A01
            X.0kW r0 = r8.A00
            X.0nS r1 = X.C13330nS.A01(r0, r5)
            java.lang.String r0 = "ig_lead_gen_organic_consumer"
            X.0A2 r1 = X.AnonymousClass0wJ.A0M(r1, r0)
            r0 = 1256(0x4e8, float:1.76E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r3 = X.C86104wH.A0L(r1, r11, r12, r13, r0)
            java.lang.String r0 = r8.A04
            long r0 = X.C86104wH.A0D(r3, r5, r0)
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "consumer_ig_user_fbidv2"
            r3.A0S(r0, r1)
            java.lang.Long r1 = r8.A02
            java.lang.String r0 = "business_ig_user_fbidv2"
            r3.A0S(r0, r1)
            java.lang.String r0 = r8.A03
            java.lang.Long r1 = X.AnonymousClass0wJ.A0d(r0)
            java.lang.String r0 = "business_ig_user_id"
            r3.A0S(r0, r1)
            if (r7 == 0) goto L_0x005f
            java.lang.Long r4 = X.AnonymousClass0wJ.A0d(r7)
        L_0x005f:
            java.lang.String r0 = "lead_form_id"
            r3.A0S(r0, r4)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r6)
            r0 = 1286(0x506, float:1.802E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r3.A0Q(r0, r1)
            java.lang.String r0 = "question_type"
            r3.A0T(r0, r2)
            r3.Bb4()
            return
        L_0x007a:
            r7 = r4
            r6 = 0
            goto L_0x0022
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7w4.BbA(android.os.Bundle, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }
}
