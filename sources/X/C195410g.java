package X;

import ch.boye.httpclientandroidlib.HttpStatus;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.service.session.UserSession;

/* renamed from: X.10g  reason: invalid class name and case insensitive filesystem */
public final class C195410g extends C62793ak implements C11630kW {
    public static final String __redex_internal_original_name = "AvatarCoinFlipNuxBottomSheetViewModel";
    public final C10680ik A00;

    public final void A00(Integer num) {
        String str;
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(this.A00.A00(), "coin_flip_nux_bottom_sheet_action"), HttpStatus.SC_INSUFFICIENT_SPACE_ON_RESOURCE);
        C18210wN.A1B(A0I, "ig_edit_profile");
        int intValue = num.intValue();
        if (intValue == 0) {
            str = "impression";
        } else if (intValue != 1) {
            str = "dismiss_click";
        } else {
            str = "turn_on_click";
        }
        A0I.A0V("extra_client_data", AnonymousClass4WJ.A0G(C18180wK.A0p("action_name", str), C18180wK.A0p("surface", "ig_external_profile")));
        A0I.Bb4();
    }

    public /* synthetic */ C195410g(UserSession userSession) {
        C10680ik r0 = new C10680ik(userSession);
        this.A00 = r0;
        r0.A00 = this;
    }

    public final String getModuleName() {
        return "avatar_coin_flip_mimicry";
    }
}
