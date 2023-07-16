package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.service.session.UserSession;

/* renamed from: X.3Di  reason: invalid class name and case insensitive filesystem */
public final class C57983Di {
    public final void A00(C11630kW r8, UserSession userSession, Integer num, String str, String str2, String str3, String str4, int i, boolean z) {
        C316728n r5;
        USLEBaseShape0S0000000 A0I;
        String str5;
        C13330nS A01 = C13330nS.A01(r8, userSession);
        String str6 = C103066Xr.A00.A02.A00;
        if (i == 0) {
            r5 = C316728n.INSTAGRAM;
        } else {
            r5 = C316728n.FACEBOOK;
        }
        if (z) {
            A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(A01, "ig_block"), 816);
            if (num == null) {
                str5 = "";
            } else if (num.intValue() == 0) {
                str5 = "single";
            } else if (C63803iN.A0E(AnonymousClass0TJ.A06, userSession, 36319832592881096L)) {
                str5 = "multi_future";
            } else {
                str5 = "multi";
            }
            A0I.A0T("action_type", str5);
            C18190wL.A1I(A0I, str);
            A0I.A0S("target_user_id", AnonymousClass0wJ.A0d(str2));
            A0I.A0O(r5, "target_user_type");
            A0I.A0T(TraceFieldType.RequestID, str3);
            A0I.A0T("click_point", str4);
            A0I.A0T("direct_thread_id", (String) null);
            A0I.A0O((C021109v) null, "direct_source");
            A0I.A0O((C021109v) null, "direct_source_type");
            A0I.A1U(str6);
        } else {
            A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(A01, "ig_unblock"), 1463);
            A0I.A0T("action_type", "");
            C18190wL.A1I(A0I, str);
            A0I.A0S("target_user_id", AnonymousClass0wJ.A0d(str2));
            A0I.A0O(r5, "target_user_type");
            A0I.A0T(TraceFieldType.RequestID, str3);
            A0I.A0T("click_point", str4);
            A0I.A0T("direct_thread_id", (String) null);
            A0I.A0O((C021109v) null, "direct_source");
            A0I.A0O((C021109v) null, "direct_source_type");
            A0I.A1U(str6);
        }
        A0I.Bb4();
    }
}
