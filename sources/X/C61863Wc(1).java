package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.redex.IDxCListenerShape20S1100000_1_I2;
import com.facebook.redex.IDxCListenerShape32S1100000_1_I2;
import com.instagram.barcelona.R;
import com.instagram.modal.ModalActivity;
import com.instagram.service.session.UserSession;

/* renamed from: X.3Wc  reason: invalid class name and case insensitive filesystem */
public final class C61863Wc {
    public static void A00(FragmentActivity fragmentActivity, C11630kW r12, UserSession userSession, String str, String str2) {
        C13330nS A01 = C13330nS.A01(r12, userSession);
        FragmentActivity fragmentActivity2 = fragmentActivity;
        C25828Dsm A0W = C18190wL.A0W(fragmentActivity);
        C18230wP.A11(fragmentActivity, A0W, R.drawable.checkout_chevron_96);
        A0W.A0L(2131823268);
        A0W.A0p(AnonymousClass0wJ.A0l(fragmentActivity2, str2, 2131823264));
        A0W.A0P(new IDxCListenerShape20S1100000_1_I2(str, (Object) A01, 10), 2131831976);
        A0W.A0N(new C64033jN(fragmentActivity2, r12, userSession, str2, str), 2131829574);
        A0W.A0r(true);
        A0W.A0M(new IDxCListenerShape32S1100000_1_I2(A01, str, 0));
        AnonymousClass0wJ.A1K(A0W);
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(A01, "instagram_shopping_checkout_awareness_dialog_impression"), 2029);
        A0I.A0T("visual_style", "checkout_signaling_icon_dialog");
        A0I.A0T("shopping_session_id", str);
        A0I.Bb4();
        AnonymousClass0wJ.A13(C28161tl.A03(userSession), "has_shown_checkout_awareness_interstitial", true);
    }

    public static void A02(C13330nS r2, String str, String str2) {
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(r2, "instagram_shopping_checkout_awareness_dialog_closed"), 2028);
        A0I.A0T("visual_style", "checkout_signaling_icon_dialog");
        A0I.A0T("from", str);
        A0I.A0T("shopping_session_id", str2);
        A0I.Bb4();
    }

    public static void A01(FragmentActivity fragmentActivity, UserSession userSession, String str, String str2, String str3, String str4) {
        Bundle A06 = C18180wK.A06();
        A06.putString("merchant_username", str);
        A06.putString("prior_module_name", str2);
        A06.putString("prior_submodule_name", str3);
        A06.putString("shopping_session_id", str4);
        C63863iT.A08(fragmentActivity, A06, userSession, ModalActivity.class, "checkout_awareness");
    }
}
