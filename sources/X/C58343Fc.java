package X;

import com.instagram.service.session.UserSession;

/* renamed from: X.3Fc  reason: invalid class name and case insensitive filesystem */
public final class C58343Fc {
    public String A00 = "";
    public boolean A01;
    public boolean A02 = true;
    public boolean A03 = true;

    public final void A00(C83414rL r6, C145538kf r7, UserSession userSession, String str) {
        AnonymousClass0wJ.A1P(userSession, str);
        this.A02 = false;
        C681942r r4 = new C681942r(r6, this);
        String str2 = this.A00;
        H1T A0P = AnonymousClass0wJ.A0P(userSession);
        A0P.A0J("business/discovery/suggest_business/");
        A0P.A0B(C22001Sz.class, AnonymousClass3L9.class);
        A0P.A0O("entry_point", str);
        C32165H8c A0T = C18200wM.A0T(A0P, "seen_ids", str2);
        C63873iU.A0E(A0T, r4, 34);
        r7.schedule(A0T);
    }
}
