package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.service.session.UserSession;
import java.util.Map;

/* renamed from: X.79D  reason: invalid class name */
public final class AnonymousClass79D {
    public final C13330nS A00;

    public AnonymousClass79D(C11630kW r2, UserSession userSession) {
        C04220Ms.A0B(userSession, 1);
        this.A00 = C13330nS.A01(r2, userSession);
    }

    public final void A01(C170759vW r4, C972868t r5, Integer num, Integer num2, String str, Map map) {
        String str2;
        String str3;
        String str4;
        C04220Ms.A0B(r5, 4);
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(this.A00, "ig_privacy_experience_upsells_event"), 1399);
        if (AnonymousClass0wJ.A1U(A0I)) {
            map.put("nav_chain", C103066Xr.A00.A02.A00);
            if (num.intValue() != 0) {
                str2 = "bottom_sheet";
            } else {
                str2 = "undo_snackbar";
            }
            A0I.A0T("surface", str2);
            switch (num2.intValue()) {
                case 0:
                    str3 = "display_bottomsheet";
                    break;
                case 1:
                    str3 = "dismiss_bottomsheet";
                    break;
                case 2:
                    str3 = "save_setting";
                    break;
                case 3:
                    str3 = "save_setting_success";
                    break;
                case 4:
                    str3 = "save_setting_failed";
                    break;
                case 5:
                    str3 = "display_undo_snackbar";
                    break;
                case 6:
                    str3 = "click_undo_snackbar";
                    break;
                case 7:
                    str3 = "undo_setting_success";
                    break;
                case 8:
                    str3 = "undo_setting_failed";
                    break;
                case 9:
                    str3 = "link_clicked";
                    break;
                case 10:
                    str3 = "remove_tag";
                    break;
                case 11:
                    str3 = "delete_message";
                    break;
                case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                    str3 = "null_view_model";
                    break;
                case 13:
                    str3 = "sync_setting";
                    break;
                case 14:
                    str3 = "sync_setting_failed";
                    break;
                default:
                    str3 = "do_not_show_bottomsheet";
                    break;
            }
            C18190wL.A1I(A0I, str3);
            A0I.A0T("type", r5.A00);
            if (r4 == null || (str4 = r4.A00) == null) {
                str4 = "";
            }
            A00(A0I, str4, str, map);
            A0I.Bb4();
        }
    }

    public final void A02(String str, String str2, String str3) {
        C04220Ms.A0B(str3, 2);
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(this.A00, "instagram_wellbeing_upsells_impression"), 2338);
        if (AnonymousClass0wJ.A1U(A0I)) {
            Map A0O = AnonymousClass4WK.A0O(C18180wK.A0p("nav_chain", C103066Xr.A00.A02.A00));
            A0I.A0T("surface", str);
            A00(A0I, str3, str2, A0O);
            A0I.Bb4();
        }
    }

    public final void A03(String str, String str2, String str3, String str4) {
        C04220Ms.A0B(str3, 2);
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(this.A00, "instagram_wellbeing_upsells_action"), 2337);
        if (AnonymousClass0wJ.A1U(A0I)) {
            Map A0O = AnonymousClass4WK.A0O(C18180wK.A0p("nav_chain", C103066Xr.A00.A02.A00));
            A0I.A0T("surface", str);
            C18190wL.A1I(A0I, str4);
            A00(A0I, str3, str2, A0O);
            A0I.Bb4();
        }
    }

    public static void A00(USLEBaseShape0S0000000 uSLEBaseShape0S0000000, String str, String str2, Map map) {
        uSLEBaseShape0S0000000.A0T("entrypoint", str);
        uSLEBaseShape0S0000000.A1h(map);
        if (str2 != null) {
            uSLEBaseShape0S0000000.A0T(C62983bG.A03(21, 10, 90), str2);
        }
    }
}
