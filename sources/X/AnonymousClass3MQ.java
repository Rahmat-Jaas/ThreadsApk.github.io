package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.3MQ  reason: invalid class name */
public final class AnonymousClass3MQ {
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001e, code lost:
        if (r11 == 0) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0055, code lost:
        if (r11 == 0) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0058, code lost:
        r1 = X.C316728n.FACEBOOK;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(X.C35417Ium r3, X.C35400IuV r4, X.C35413Iui r5, X.C11630kW r6, com.instagram.service.session.UserSession r7, java.lang.String r8, java.lang.String r9, java.util.Map r10, int r11, boolean r12) {
        /*
            X.0nS r1 = X.C13330nS.A01(r6, r7)
            if (r12 == 0) goto L_0x003d
            java.lang.String r0 = "ig_block_action"
            X.0A2 r1 = X.AnonymousClass0wJ.A0M(r1, r0)
            r0 = 815(0x32f, float:1.142E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r2 = X.C18180wK.A0I(r1, r0)
            X.C18220wO.A1E(r3, r2)
            java.lang.Long r1 = X.AnonymousClass0wJ.A0d(r8)
            java.lang.String r0 = "target_user_id"
            r2.A0S(r0, r1)
            if (r11 != 0) goto L_0x0058
        L_0x0020:
            X.28n r1 = X.C316728n.INSTAGRAM
        L_0x0022:
            java.lang.String r0 = "target_user_type"
            r2.A0O(r1, r0)
            java.lang.String r0 = "request_id"
            r2.A0T(r0, r9)
            java.lang.String r0 = "entry_point"
            r2.A0O(r4, r0)
            X.C18240wQ.A13(r5, r2)
            java.lang.String r0 = "surface_data"
            r2.A0V(r0, r10)
            r2.Bb4()
            return
        L_0x003d:
            java.lang.String r0 = "ig_unblock_action"
            X.0A2 r1 = X.AnonymousClass0wJ.A0M(r1, r0)
            r0 = 1462(0x5b6, float:2.049E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r2 = X.C18180wK.A0I(r1, r0)
            X.C18220wO.A1E(r3, r2)
            java.lang.Long r1 = X.AnonymousClass0wJ.A0d(r8)
            java.lang.String r0 = "target_user_id"
            r2.A0S(r0, r1)
            if (r11 != 0) goto L_0x0058
            goto L_0x0020
        L_0x0058:
            X.28n r1 = X.C316728n.FACEBOOK
            goto L_0x0022
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3MQ.A00(X.Ium, X.IuV, X.Iui, X.0kW, com.instagram.service.session.UserSession, java.lang.String, java.lang.String, java.util.Map, int, boolean):void");
    }

    public static void A01(C35417Ium ium, C35400IuV iuV, C35413Iui iui, C11630kW r7, UserSession userSession, String str, List list, Map map) {
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A01(r7, userSession), "ig_bulk_block_action"), 831);
        C18220wO.A1E(ium, A0I);
        ArrayList A0t = C18200wM.A0t(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0t.add(AnonymousClass0wJ.A0d(C18180wK.A0k(it)));
        }
        A0I.A0U("target_user_id", A0t);
        A0I.A0T(TraceFieldType.RequestID, str);
        A0I.A0O(iuV, "entry_point");
        C18240wQ.A13(iui, A0I);
        A0I.A0V("target_user_type", map);
        A0I.Bb4();
    }
}
