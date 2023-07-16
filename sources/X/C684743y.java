package X;

import android.app.Activity;
import android.os.Bundle;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.service.session.UserSession;

/* renamed from: X.43y  reason: invalid class name and case insensitive filesystem */
public final class C684743y implements C11630kW {
    public static final String __redex_internal_original_name = "FbCommentBottomSheetNavigationController";
    public C37383Jqm A00;
    public final C13330nS A01;
    public final UserSession A02;

    public final void A00(Activity activity, C11630kW r8, BKU bku, String str, String str2, String str3) {
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(this.A01, "comments_from_facebook_exit_flow"), 426);
        String A33 = bku.A33();
        C04220Ms.A06(A33);
        C18210wN.A18(A0I, AnonymousClass4n2.A00(A33));
        A0I.A0Q("is_exit_to_fb", true);
        A0I.Bb4();
        UserSession userSession = this.A02;
        if (C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 2342159620581231844L)) {
            C37032Jj9 A0L = C18210wN.A0L(userSession);
            A0L.A0M = true;
            A0L.A0f = true;
            A0L.A00 = 0.7f;
            A0L.A0Z = false;
            AnonymousClass1YV r2 = new AnonymousClass1YV();
            Bundle A06 = C18180wK.A06();
            A06.putString("FbCommentMiniProfileContainerFragment.ARG_FACEBOOK_ID", str);
            A06.putString("FbCommentMiniProfileContainerFragment.ARG_FACEBOOK_NAME", str2);
            A06.putString("FbCommentMiniProfileContainerFragment.ARG_FACEBOOK_PROFILE_PICTURE_URI", str3);
            r2.setArguments(A06);
            this.A00.A09(r2, A0L);
            return;
        }
        C60853Qu.A00(activity, r8, userSession, AnonymousClass0wJ.A0d(str), "ig_comment_thread");
    }

    public final String getModuleName() {
        return "facebook_comments_bottom_sheet_navigation";
    }

    public C684743y(UserSession userSession) {
        this.A02 = userSession;
        this.A01 = C18230wP.A0U(this, userSession);
        this.A00 = C18210wN.A0L(userSession).A00();
    }
}
