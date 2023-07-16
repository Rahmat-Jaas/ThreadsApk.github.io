package X;

import com.instagram.service.session.UserSession;

/* renamed from: X.4G1  reason: invalid class name */
public final class AnonymousClass4G1 implements C82884qQ {
    public final UserSession A00;

    public final boolean CW4(C58743Gz r5) {
        UserSession userSession = this.A00;
        if (!C28161tl.A04(userSession).getBoolean("has_used_shopping_bag", false) || C28161tl.A04(userSession).getBoolean("has_tapped_on_shopping_bag_menu_option", false)) {
            return false;
        }
        return true;
    }

    public AnonymousClass4G1(UserSession userSession) {
        this.A00 = userSession;
    }
}
