package X;

import com.instagram.service.session.UserSession;

/* renamed from: X.6og  reason: invalid class name and case insensitive filesystem */
public final class C111936og {
    public final UserSession A00;

    public final C32165H8c A00(String str, String str2) {
        C04220Ms.A0B(str, 0);
        H1T h1t = new H1T(this.A00, 729);
        h1t.A0F(AnonymousClass006.A01);
        h1t.A0J("creators/partner_program/set_igtv_account_level_toggle/");
        h1t.A0O(AnonymousClass000.A00(1155), str);
        h1t.A0B(AnonymousClass5u0.class, AnonymousClass71T.class);
        if (str2 != null) {
            h1t.A0O("product_type", str2);
        }
        return h1t.A02();
    }

    public C111936og(UserSession userSession) {
        this.A00 = userSession;
    }
}
