package X;

import com.instagram.service.session.UserSession;

/* renamed from: X.4Fs  reason: invalid class name and case insensitive filesystem */
public final class C70684Fs implements C82884qQ {
    public final UserSession A00;

    public final boolean CW4(C58743Gz r6) {
        UserSession userSession = this.A00;
        if (AnonymousClass3MP.A01(userSession) || AnonymousClass3MP.A00(userSession)) {
            if (!AnonymousClass3MP.A01(userSession) && C28161tl.A04(userSession).getBoolean("seen_hw_secure_consent_nux", false)) {
                AnonymousClass0wJ.A13(C28161tl.A03(userSession), "seen_hw_secure_consent_nux", false);
            }
            if (C28161tl.A04(userSession).getBoolean("seen_hw_secure_consent_nux", false) || !AnonymousClass3MP.A01(userSession)) {
                if (!AnonymousClass3MP.A00(userSession) && C28161tl.A04(userSession).getBoolean("seen_hw_custom_list_secure_consent_nux", false)) {
                    AnonymousClass0wJ.A13(C28161tl.A03(userSession), "seen_hw_custom_list_secure_consent_nux", false);
                }
                if (C28161tl.A04(userSession).getBoolean("seen_hw_custom_list_secure_consent_nux", false) || !AnonymousClass3MP.A00(userSession)) {
                    return true;
                }
            }
        }
        return false;
    }

    public C70684Fs(UserSession userSession) {
        this.A00 = userSession;
    }
}
