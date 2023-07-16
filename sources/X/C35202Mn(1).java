package X;

import com.instagram.service.session.UserSession;

/* renamed from: X.2Mn  reason: invalid class name and case insensitive filesystem */
public final class C35202Mn {
    public static void A00(C63873iU r3, AnonymousClass3DE r4, UserSession userSession, boolean z) {
        H1T A0N = AnonymousClass0wJ.A0N(userSession);
        A0N.A0J("direct_v2/update_has_interop_upgraded/");
        A0N.A0R("has_interop_upgraded", z);
        A0N.A0B(AnonymousClass1SA.class, AnonymousClass3MF.class);
        String str = r4.A07;
        if (str != null) {
            A0N.A0O("qp_source_upsell", str);
        }
        String str2 = r4.A08;
        if (str2 != null) {
            A0N.A0O("static_source_upsell", str2);
        }
        C32165H8c A02 = A0N.A02();
        A02.A00 = r3;
        C31155GhB.A03(A02);
    }
}
