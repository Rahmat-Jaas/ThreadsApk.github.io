package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.service.session.UserSession;
import java.util.List;
import java.util.Map;

/* renamed from: X.3VI  reason: invalid class name */
public final class AnonymousClass3VI {
    public static final C11630kW A0B = new AnonymousClass43B();
    public C15680ri A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public List A08;
    public final AnonymousClass1o2 A09 = AnonymousClass1o2.A01("ig_local");
    public final UserSession A0A;

    public AnonymousClass3VI(UserSession userSession) {
        this.A0A = userSession;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x01d3, code lost:
        r2.Bb4();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00() {
        /*
            r10 = this;
            java.lang.String r3 = r10.A04
            if (r3 == 0) goto L_0x01d8
            int r0 = r3.hashCode()
            switch(r0) {
                case -1573164919: goto L_0x016e;
                case 120623625: goto L_0x00a7;
                case 305513999: goto L_0x001f;
                default: goto L_0x000b;
            }
        L_0x000b:
            r0 = 0
            r10.A04 = r0
            r10.A07 = r0
            r10.A01 = r0
            r10.A02 = r0
            r10.A03 = r0
            r10.A05 = r0
            r10.A06 = r0
            r10.A08 = r0
            r10.A00 = r0
            return
        L_0x001f:
            java.lang.String r0 = "fetch_data"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x000b
            com.instagram.service.session.UserSession r1 = r10.A0A
            X.0kW r0 = A0B
            X.0nS r1 = X.C13330nS.A01(r0, r1)
            java.lang.String r0 = "ig_local_fetch_data"
            X.0A2 r1 = X.AnonymousClass0wJ.A0M(r1, r0)
            r0 = 1327(0x52f, float:1.86E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r2 = X.C18180wK.A0I(r1, r0)
            long r7 = java.lang.System.currentTimeMillis()
            java.lang.Long r3 = java.lang.Long.valueOf(r7)
            X.1o2 r6 = r10.A09
            long r4 = r6.A02()
            boolean r0 = X.AnonymousClass0wJ.A1U(r2)
            if (r0 == 0) goto L_0x000b
            java.lang.String r1 = r10.A06
            java.lang.String r0 = "mLocationID cannot be null"
            X.AnonymousClass7Ko.A07(r1, r0)
            java.lang.Long r1 = X.AnonymousClass0wJ.A0d(r1)
            java.lang.String r0 = "location_id"
            r2.A0S(r0, r1)
            java.lang.String r1 = r10.A07
            java.lang.String r0 = "mStep cannot be null"
            X.AnonymousClass7Ko.A07(r1, r0)
            X.C18190wL.A1I(r2, r1)
            java.lang.String r0 = r6.A04()
            X.C18250wR.A0y(r2, r0)
            long r0 = r6.A02()
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "start_time"
            r2.A0S(r0, r1)
            long r7 = r7 - r4
            java.lang.Long r1 = java.lang.Long.valueOf(r7)
            java.lang.String r0 = "elapsed_time"
            r2.A0S(r0, r1)
            java.lang.String r0 = "current_time"
            r2.A0S(r0, r3)
            java.lang.String r1 = r10.A05
            if (r1 == 0) goto L_0x0095
            java.lang.String r0 = "fb_page_id"
            r2.A0T(r0, r1)
        L_0x0095:
            java.lang.String r0 = r10.A02
            if (r0 == 0) goto L_0x009c
            X.C18210wN.A1B(r2, r0)
        L_0x009c:
            java.lang.String r1 = r10.A01
            if (r1 == 0) goto L_0x01d3
            java.lang.String r0 = "component"
            r2.A0T(r0, r1)
            goto L_0x01d3
        L_0x00a7:
            java.lang.String r0 = "impression"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x000b
            com.instagram.service.session.UserSession r1 = r10.A0A
            X.0kW r0 = A0B
            X.0nS r1 = X.C13330nS.A01(r0, r1)
            java.lang.String r0 = "ig_local_impression"
            X.0A2 r1 = X.AnonymousClass0wJ.A0M(r1, r0)
            r0 = 1328(0x530, float:1.861E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r2 = X.C18180wK.A0I(r1, r0)
            boolean r0 = X.AnonymousClass0wJ.A1U(r2)
            if (r0 == 0) goto L_0x000b
            java.lang.String r1 = r10.A01
            java.lang.String r0 = "component"
            r2.A0T(r0, r1)
            java.lang.String r0 = r10.A07
            X.C18190wL.A1I(r2, r0)
            X.1o2 r4 = r10.A09
            java.lang.String r0 = r4.A04()
            X.C18250wR.A0y(r2, r0)
            java.lang.String r1 = r10.A06
            java.lang.String r0 = "location_id"
            r2.A0T(r0, r1)
            java.lang.String r1 = r10.A05
            java.lang.String r0 = "fb_page_id"
            r2.A0T(r0, r1)
            java.lang.String r0 = r10.A02
            X.C18210wN.A1B(r2, r0)
            X.0ri r0 = r10.A00
            if (r0 == 0) goto L_0x0140
            java.util.HashMap r6 = X.AnonymousClass0wJ.A0y()
            java.lang.String r5 = "available_media"
            java.util.List r9 = r0.A05(r5)
            if (r9 == 0) goto L_0x0120
            r7 = 0
            java.util.Iterator r3 = r9.iterator()
        L_0x0107:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0120
            java.lang.Object r0 = r3.next()
            java.lang.Long r1 = java.lang.Long.valueOf(r7)
            java.lang.String r0 = r0.toString()
            r6.put(r1, r0)
            r0 = 1
            long r7 = r7 + r0
            goto L_0x0107
        L_0x0120:
            X.0ri r0 = r10.A00
            java.lang.String r3 = "profile_id"
            java.lang.String r0 = r0.A04(r3)
            if (r9 == 0) goto L_0x0140
            if (r0 == 0) goto L_0x0140
            X.14L r1 = new X.14L
            r1.<init>()
            java.lang.Long r0 = X.AnonymousClass0wJ.A0d(r0)
            r1.A09(r3, r0)
            r1.A0C(r5, r6)
            java.lang.String r0 = "extra_data"
            r2.A0P(r1, r0)
        L_0x0140:
            long r6 = java.lang.System.currentTimeMillis()
            java.lang.Long r1 = java.lang.Long.valueOf(r6)
            long r4 = r4.A02()
            java.lang.Long r3 = java.lang.Long.valueOf(r4)
            java.lang.String r0 = "current_time"
            r2.A0S(r0, r1)
            long r6 = r6 - r4
            java.lang.Long r1 = java.lang.Long.valueOf(r6)
            java.lang.String r0 = "elapsed_time"
            r2.A0S(r0, r1)
            java.lang.String r0 = "start_time"
            r2.A0S(r0, r3)
            java.lang.Boolean r1 = X.C18180wK.A0X()
            java.lang.String r0 = "production_build"
            r2.A0Q(r0, r1)
            goto L_0x01d3
        L_0x016e:
            java.lang.String r0 = "start_step"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x000b
            com.instagram.service.session.UserSession r1 = r10.A0A
            X.0kW r0 = A0B
            X.0nS r1 = X.C13330nS.A01(r0, r1)
            java.lang.String r0 = "ig_local_start_step"
            X.0A2 r1 = X.AnonymousClass0wJ.A0M(r1, r0)
            r0 = 1329(0x531, float:1.862E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r2 = X.C18180wK.A0I(r1, r0)
            boolean r0 = X.AnonymousClass0wJ.A1U(r2)
            if (r0 == 0) goto L_0x000b
            java.lang.String r1 = r10.A06
            java.lang.String r0 = "mLocationID cannot be null"
            X.AnonymousClass7Ko.A07(r1, r0)
            java.lang.Long r1 = X.AnonymousClass0wJ.A0d(r1)
            java.lang.String r0 = "location_id"
            r2.A0S(r0, r1)
            java.lang.String r1 = r10.A07
            java.lang.String r0 = "mStep cannot be null"
            X.AnonymousClass7Ko.A07(r1, r0)
            X.C18190wL.A1I(r2, r1)
            X.1o2 r3 = r10.A09
            java.lang.String r0 = r3.A04()
            X.C18250wR.A0y(r2, r0)
            java.lang.String r1 = r10.A05
            java.lang.String r0 = "fb_page_id"
            r2.A0T(r0, r1)
            java.lang.String r0 = r10.A02
            X.C18210wN.A1B(r2, r0)
            long r0 = r3.A02()
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "start_time"
            r2.A0S(r0, r1)
            java.util.List r1 = r10.A08
            java.lang.String r0 = "available_options"
            r2.A0U(r0, r1)
        L_0x01d3:
            r2.Bb4()
            goto L_0x000b
        L_0x01d8:
            X.1o2 r2 = r10.A09
            java.lang.String r1 = "ig_local"
            java.lang.String r0 = "_"
            java.lang.String r0 = X.AnonymousClass00U.A0V(r1, r0, r3)
            X.0rn r2 = r2.A03(r0)
            java.lang.String r0 = r10.A07
            if (r0 == 0) goto L_0x01ed
            X.C18250wR.A19(r2, r0)
        L_0x01ed:
            java.lang.String r1 = r10.A01
            if (r1 == 0) goto L_0x01f6
            java.lang.String r0 = "component"
            r2.A0D(r0, r1)
        L_0x01f6:
            java.lang.String r1 = r10.A05
            if (r1 == 0) goto L_0x01ff
            java.lang.String r0 = "fb_page_id"
            r2.A0D(r0, r1)
        L_0x01ff:
            java.util.List r1 = r10.A08
            if (r1 == 0) goto L_0x0208
            java.lang.String r0 = "available_options"
            r2.A0E(r0, r1)
        L_0x0208:
            X.0ri r1 = r10.A00
            if (r1 == 0) goto L_0x0211
            java.lang.String r0 = "extra_data"
            r2.A05(r1, r0)
        L_0x0211:
            java.lang.String r1 = r10.A06
            if (r1 == 0) goto L_0x021a
            java.lang.String r0 = "location_id"
            r2.A0D(r0, r1)
        L_0x021a:
            java.lang.String r1 = r10.A03
            if (r1 == 0) goto L_0x0223
            java.lang.String r0 = "error_message"
            r2.A0D(r0, r1)
        L_0x0223:
            java.lang.String r1 = r10.A02
            if (r1 == 0) goto L_0x022c
            java.lang.String r0 = "entry_point"
            r2.A0D(r0, r1)
        L_0x022c:
            com.instagram.service.session.UserSession r0 = r10.A0A
            X.C18180wK.A1K(r2, r0)
            goto L_0x000b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3VI.A00():void");
    }

    public final void A01(C15680ri r5, String str, String str2, String str3, String str4, String str5, String str6, Map map) {
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A01(A0B, this.A0A), "ig_local_action"), 1325);
        if (AnonymousClass0wJ.A1U(A0I)) {
            A0I.A0T("location_id", str4);
            C18190wL.A1I(A0I, str);
            C18210wN.A1A(A0I, str2);
            if (str3 != null) {
                A0I.A0T("component", str3);
            }
            if (map != null) {
                A0I.A0V("available_options", map);
            }
            if (r5 != null) {
                AnonymousClass14K r2 = new AnonymousClass14K();
                r2.A0A("tab", r5.A04("tab"));
                A0I.A0P(r2, "selected_values");
            }
            if (str5 != null) {
                A0I.A0T("fb_page_id", str5);
            }
            if (str6 != null) {
                A0I.A0T("m_pk", str6);
            }
            A0I.Bb4();
        }
    }
}
