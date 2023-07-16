package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.smartcapture.logging.SCEventNames;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.service.session.UserSession;

/* renamed from: X.3WQ  reason: invalid class name */
public final class AnonymousClass3WQ {
    public static final void A00(UserSession userSession, Integer num) {
        String A00;
        C04220Ms.A0B(userSession, 0);
        if (num == AnonymousClass006.A02 || num == AnonymousClass006.A03) {
            C60923Rc.A00 = C18180wK.A0e();
        }
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A01(C60923Rc.A01, userSession), "instagram_two_fac_setup_action"), 2315);
        switch (num.intValue()) {
            case 1:
                A00 = "copy_key";
                break;
            case 2:
                A00 = "copy_recovery_code";
                break;
            case 3:
                A00 = "enter_recovery_code";
                break;
            case 4:
                A00 = "get_new_recovery_code";
                break;
            case 5:
                A00 = "link";
                break;
            case 6:
                A00 = SCEventNames.Params.STEP_CHANGE_NEXT;
                break;
            case 7:
                A00 = "resend_code";
                break;
            case 8:
                A00 = "screenshot";
                break;
            case 9:
                A00 = "setup_manually";
                break;
            case 10:
            case 11:
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
            case 13:
                A00 = I17.A00(135);
                break;
            default:
                A00 = "change_phone_number";
                break;
        }
        C18210wN.A1A(A0I, A00);
        A0I.A0T("view", "");
        C63213h0.A03(A0I);
        A0I.Bb4();
    }

    public static final void A01(UserSession userSession, String str) {
        AnonymousClass0wJ.A1N(userSession, str);
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A01(C60923Rc.A01, userSession), "instagram_two_fac_setup_code_resend_failure"), 2316);
        A0I.A0T("reason", str);
        A0I.A0T("view", "enter_code");
        C63213h0.A03(A0I);
        A0I.Bb4();
    }

    public static final void A02(UserSession userSession, String str) {
        AnonymousClass0wJ.A1N(userSession, str);
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A01(C60923Rc.A01, userSession), "instagram_two_fac_setup_view"), 2320);
        C63213h0.A03(A0I);
        A0I.A0T("view", str);
        A0I.Bb4();
    }
}
