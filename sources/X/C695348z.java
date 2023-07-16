package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.service.session.UserSession;

/* renamed from: X.48z  reason: invalid class name and case insensitive filesystem */
public final class C695348z implements AnonymousClass0i4 {
    public C13330nS A00;
    public final C11630kW A01;
    public final UserSession A02;

    public final void A00(Integer num, String str, String str2, String str3) {
        String str4;
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(this.A00, "ig_creator_incentive_platform_reels_bonus_tagging"), 1150);
        switch (num.intValue()) {
            case 0:
                str4 = "Entry impression";
                break;
            case 1:
                str4 = "Selection view impression";
                break;
            case 2:
                str4 = "Deal select";
                break;
            case 3:
                str4 = "Deal publish";
                break;
            case 4:
                str4 = "Self Reel Promo Impression";
                break;
            case 5:
                str4 = "Self Reel Promo Tap Primary Action";
                break;
            case 6:
                str4 = "Self Reel Promo Dismiss";
                break;
            case 7:
                str4 = "After Reel Creation Promo Impression";
                break;
            case 8:
                str4 = "After Reel Creation Promo Tap Primary Action";
                break;
            case 9:
                str4 = "After Reel Creation Promo Dismiss";
                break;
            default:
                str4 = "Promo Dialogs Request Error";
                break;
        }
        C18210wN.A1A(A0I, str4);
        C18230wP.A1H(A0I, this.A01.getModuleName());
        C18250wR.A10(A0I, "tagged_deal_program_name", str, str2);
        A0I.A0T("client_extra", str3);
        A0I.Bb4();
    }

    public final void onSessionWillEnd() {
        this.A02.A03(C695348z.class);
    }

    public C695348z(UserSession userSession) {
        this.A02 = userSession;
        C15720rm r0 = new C15720rm("IncentivePlatformLoggingHelper");
        this.A01 = r0;
        this.A00 = C13330nS.A01(r0, userSession);
    }
}
