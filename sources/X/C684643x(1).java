package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.service.session.UserSession;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.43x  reason: invalid class name and case insensitive filesystem */
public final class C684643x implements C11630kW {
    public static final String __redex_internal_original_name = "AvatarProfilePictureLogger";
    public final C61023Ro A00;
    public final C13330nS A01;
    public final UserSession A02;

    public /* synthetic */ C684643x(UserSession userSession) {
        C61023Ro r0 = new C61023Ro((C03710Kk) null, (DefaultConstructorMarker) null, 1);
        C04220Ms.A0B(userSession, 1);
        this.A02 = userSession;
        this.A00 = r0;
        this.A01 = C13330nS.A01(this, userSession);
    }

    public final void A00(AnonymousClass24Z r4, Integer num) {
        C04220Ms.A0B(r4, 0);
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(this.A01, "edit_profile_pic_option_tap"), 570);
        A0I.A0T("ig_user_id", this.A02.getUserId());
        C18210wN.A1A(A0I, C33262Fa.A00(num));
        C18210wN.A1B(A0I, r4.A00);
        A0I.Bb4();
    }

    public final String getModuleName() {
        return "ig_edit_profile";
    }
}
