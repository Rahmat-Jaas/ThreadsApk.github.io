package X;

import com.instagram.service.session.UserSession;

/* renamed from: X.2Qo  reason: invalid class name and case insensitive filesystem */
public final class C36242Qo {
    public static void A00(C11630kW r2, UserSession userSession, String str, String str2, boolean z) {
        C15730rn A00 = C15730rn.A00(r2, str);
        A00.A09("sso_enabled", Boolean.valueOf(z));
        A00.A0D("user_id", str2);
        A00.A0D("app_device_id", C18200wM.A0g());
        C18180wK.A1K(A00, userSession);
    }
}
