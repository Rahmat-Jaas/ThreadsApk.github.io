package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.service.session.UserSession;
import kotlin.jvm.internal.KtLambdaShape8S1000000_I2;

/* renamed from: X.3Ga  reason: invalid class name and case insensitive filesystem */
public final class C58533Ga {
    public final C13330nS A00;

    public C58533Ga(UserSession userSession, String str) {
        AnonymousClass43M r0;
        C04220Ms.A0B(userSession, 1);
        if (str != null) {
            r0 = new AnonymousClass43M(new KtLambdaShape8S1000000_I2(str, 8));
        } else {
            r0 = null;
        }
        this.A00 = C13330nS.A01(r0, userSession);
    }

    public final void A00(Integer num) {
        String str;
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(this.A00, "rage_shake_action"), 2553);
        if (AnonymousClass0wJ.A1U(A0I)) {
            switch (num.intValue()) {
                case 0:
                    str = "turn_on";
                    break;
                case 1:
                    str = "turn_off";
                    break;
                case 2:
                    str = "report_bug";
                    break;
                case 3:
                    str = "cancel";
                    break;
                case 4:
                    str = "cancel_navigation";
                    break;
                case 5:
                    str = "cancel_dont_send";
                    break;
                case 6:
                    str = "learn_more_abuse_or_spam";
                    break;
                case 7:
                    str = "learn_more_data_policy";
                    break;
                case 8:
                    str = "submit_clicked_success";
                    break;
                case 9:
                    str = "submit_clicked_failed_missing_description";
                    break;
                case 10:
                    str = "submit_clicked_failed_processing_logs";
                    break;
                case 11:
                    str = "submit_clicked_failed_processing_previous_submit";
                    break;
                case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                    str = "retry_launched";
                    break;
                default:
                    str = "bug_submit_failure_dismiss";
                    break;
            }
            C18210wN.A1A(A0I, str);
            A0I.Bb4();
        }
    }

    public final void A01(Integer num) {
        String str;
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(this.A00, "rage_shake_impression"), 2554);
        if (AnonymousClass0wJ.A1U(A0I)) {
            if (num.intValue() != 0) {
                str = "menu";
            } else {
                str = "shake";
            }
            C18210wN.A1A(A0I, str);
            A0I.Bb4();
        }
    }
}
