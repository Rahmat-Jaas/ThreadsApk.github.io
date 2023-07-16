package X;

import android.app.Activity;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.modal.ModalActivity;
import com.instagram.service.session.UserSession;

/* renamed from: X.3MY  reason: invalid class name */
public final class AnonymousClass3MY {
    public static final void A01(Activity activity, UserSession userSession, Integer num, boolean z) {
        String str;
        switch (C18240wQ.A06(num, 2)) {
            case 1:
                str = "not_interested";
                break;
            case 2:
                str = "settings";
                break;
            default:
                str = "overflow_menu";
                break;
        }
        C63743iE A02 = C63743iE.A02("com.instagram.transparency.products.content_controls.screen", C63203gz.A03("entry_point", str));
        IgBloksScreenConfig A0N = C18190wL.A0N(userSession);
        C18210wN.A0s(activity, A0N, 2131836376);
        if (z) {
            C63863iT.A08(activity, C62853b1.A00(A0N, A02), userSession, ModalActivity.class, "bloks");
            return;
        }
        A02.A0C(activity, A0N);
    }

    public static final void A00(Activity activity, BKU bku, UserSession userSession, String str, String str2) {
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A02(userSession), "ig_scc_upsell_event"), 1429);
        A0I.A0O(C314427q.ADJUST_SCC_CLICKED, "event_name");
        A0I.A0T("tab", str2);
        A0I.A0T("style", str);
        String str3 = bku.A0N;
        C04220Ms.A06(str3);
        A0I.A0S("ig_media_id", AnonymousClass4n2.A02(str3));
        A0I.Bb4();
        C63743iE A02 = C63743iE.A02("com.instagram.sensitive_content_control.sensitive_content_control_setting", AnonymousClass0wJ.A0y());
        IgBloksScreenConfig A0N = C18190wL.A0N(userSession);
        C18210wN.A0s(activity, A0N, 2131835498);
        C63863iT.A08(activity, C62853b1.A00(A0N, A02), userSession, ModalActivity.class, "bloks");
    }
}
