package X;

import android.os.Build;
import com.instagram.service.session.UserSession;

/* renamed from: X.3Nq  reason: invalid class name and case insensitive filesystem */
public final class C60093Nq {
    public static final void A00(UserSession userSession, C81754oJ r2, Integer num) {
        C04220Ms.A0B(r2, 1);
        A01(userSession, num, r2.toString());
    }

    public static final void A01(UserSession userSession, Integer num, String str) {
        String str2;
        C04220Ms.A0B(userSession, 0);
        AnonymousClass1o2 A01 = AnonymousClass1o2.A01("profile_wizard");
        switch (num.intValue()) {
            case 0:
                str2 = "profile_wizard_launched";
                break;
            case 1:
                str2 = "profile_wizard_next_pressed";
                break;
            case 2:
                str2 = "profile_wizard_skip_pressed";
                break;
            case 3:
                str2 = "profile_wizard_soft_back_pressed";
                break;
            case 4:
                str2 = "profile_wizard_back_pressed";
                break;
            case 5:
                str2 = "profile_wizard_done_pressed";
                break;
            case 6:
                str2 = "profile_wizard_user_saved";
                break;
            case 7:
                str2 = "profile_wizard_user_save_failed";
                break;
            case 8:
                str2 = "profile_wizard_picture_saved";
                break;
            case 9:
                str2 = "profile_wizard_picture_save_failed";
                break;
            case 10:
                str2 = "profile_wizard_has_pending_changes";
                break;
            case 11:
                str2 = "profile_wizard_pending_changes_saved";
                break;
            default:
                str2 = "profile_wizard_pending_changes_discarded";
                break;
        }
        C15730rn A03 = A01.A03(str2);
        A03.A08(Integer.valueOf(Build.VERSION.SDK_INT), "os_version");
        A03.A0D("fb_family_device_id", C18190wL.A0l(userSession));
        A03.A0D("guid", C18200wM.A0g());
        A03.A0D(AnonymousClass3QB.A00(9, 10, 62), userSession.getUserId());
        if (str != null) {
            C18250wR.A19(A03, str);
        }
        C18180wK.A1K(A03, userSession);
    }
}
