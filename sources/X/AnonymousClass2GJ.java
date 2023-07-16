package X;

import com.instagram.service.session.UserSession;

/* renamed from: X.2GJ  reason: invalid class name */
public final class AnonymousClass2GJ {
    public static final Object A00(AnonymousClass601 r10, C63893iY r11) {
        Object A0B = C63893iY.A0B(r11, AnonymousClass0wJ.A1Z(r11, r10) ? 1 : 0);
        A0B.getClass();
        C04220Ms.A0C(A0B, "null cannot be cast to non-null type kotlin.String");
        String str = (String) A0B;
        Object A0C = C63893iY.A0C(r11, "null cannot be cast to non-null type kotlin.String", 2);
        boolean A01 = AnonymousClass3WF.A01(r11, 3);
        C109326jp A0R = C18190wL.A0R(r11.A00, 4);
        C10300i6 A0F = C63913ic.A0F(r10);
        C63533hk A02 = C63533hk.A02(A0F);
        C04220Ms.A06(A02);
        AnonymousClass0MJ r2 = new AnonymousClass0MJ();
        r2.A00 = "caa_login_save_credentials";
        if (C04220Ms.A0I(A0C, "new_to_family_ig_default") || C04220Ms.A0I(A0C, "new_to_app_ig_default")) {
            r2.A00 = "caa_registration_save_credentials";
        }
        if (str.length() == 0 || AnonymousClass8bQ.A0n(str)) {
            C18200wM.A1R(A0F);
            str = ((UserSession) A0F).getUserId();
        }
        A02.A0B(new AnonymousClass43G(r2), A0F, AnonymousClass006.A0j, str, A01);
        if (A0R == null) {
            return null;
        }
        C63893iY.A0G(r10, A0R);
        return null;
    }
}
