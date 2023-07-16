package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.api.schemas.FanClubNextStepsRecommendationsType;
import com.instagram.service.session.UserSession;

/* renamed from: X.3HY  reason: invalid class name */
public final class AnonymousClass3HY {
    public final Fragment A00;
    public final FragmentActivity A01;
    public final AnonymousClass495 A02;
    public final AnonymousClass3HA A03;
    public final UserSession A04;
    public final String A05;

    public /* synthetic */ AnonymousClass3HY(Fragment fragment, FragmentActivity fragmentActivity, UserSession userSession, String str, int i) {
        AnonymousClass3HA r1;
        AnonymousClass495 r2 = null;
        fragment = (i & 8) != 0 ? null : fragment;
        if ((i & 16) != 0) {
            r1 = new AnonymousClass3HA(fragmentActivity, userSession);
        } else {
            r1 = null;
        }
        r2 = (i & 32) != 0 ? AnonymousClass2O7.A00(userSession) : r2;
        AnonymousClass0wJ.A1P(userSession, str);
        C18230wP.A1R(r1, 5, r2);
        this.A04 = userSession;
        this.A01 = fragmentActivity;
        this.A05 = str;
        this.A00 = fragment;
        this.A03 = r1;
        this.A02 = r2;
    }

    public final void A00(Context context, AnonymousClass23Z r9, int i, int i2) {
        FanClubNextStepsRecommendationsType fanClubNextStepsRecommendationsType;
        if (i2 == -1 || i2 == 9683) {
            if (i == 2) {
                C63813iO.A03(context, (String) null, 2131827143, 0);
                fanClubNextStepsRecommendationsType = FanClubNextStepsRecommendationsType.SUBSCRIBER_STORY;
            } else if (i == 3) {
                C04220Ms.A0C((Object) null, "null cannot be cast to non-null type com.instagram.mainactivity.delegate.IgNavigator");
                throw C18210wN.A0W("scrollToTop");
            } else if (i == 5) {
                C63813iO.A03(context, (String) null, 2131827143, 0);
                fanClubNextStepsRecommendationsType = FanClubNextStepsRecommendationsType.SUBSCRIBER_CHAT_STORY_STICKER;
            } else if (i == 9587 && r9 != null) {
                int ordinal = r9.ordinal();
                if (ordinal == 0) {
                    fanClubNextStepsRecommendationsType = FanClubNextStepsRecommendationsType.PROMO_VIDEO;
                } else if (ordinal == 1) {
                    fanClubNextStepsRecommendationsType = FanClubNextStepsRecommendationsType.WELCOME_VIDEO;
                } else {
                    return;
                }
            } else {
                return;
            }
            String obj = fanClubNextStepsRecommendationsType.toString();
            AnonymousClass495 r4 = this.A02;
            String str = this.A05;
            C04220Ms.A0B(obj, 2);
            USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(r4.A00, "ig_fan_club_settings_recommendations_recommendation_completed"), 1204);
            C18230wP.A1H(A0I, "creator_management_settings");
            C18220wO.A1F(A0I, AnonymousClass0wJ.A0d(r4.A01.getUserId()), str, obj);
            A0I.A12((Long) null);
            A0I.Bb4();
        }
    }

    public final void A01(String str) {
        C25786Drz A0Q;
        Fragment A002;
        String str2;
        if (C63803iN.A0E(AnonymousClass0TJ.A05, this.A04, 36324286473970076L)) {
            AnonymousClass3HA r1 = this.A03;
            FragmentActivity fragmentActivity = r1.A00;
            UserSession userSession = r1.A02;
            A0Q = C18180wK.A0Q(fragmentActivity, userSession);
            if (C63803iN.A0E(C18250wR.A0D(str, 1), userSession, 36326884929251110L)) {
                str2 = "com.bloks.www.ig_subscriptions.creator_experience.special_deals";
            } else {
                str2 = "com.instagram.user_pay.fan_club.screens.creator_onboarding.special_deals";
            }
            A002 = C62853b1.A03(userSession, str2, C63203gz.A03("origin", str));
        } else {
            AnonymousClass3HA r0 = this.A03;
            FragmentActivity fragmentActivity2 = r0.A00;
            UserSession userSession2 = r0.A02;
            A0Q = C18180wK.A0Q(fragmentActivity2, userSession2);
            A002 = r0.A01.A00(fragmentActivity2, userSession2, (String) null);
        }
        C18180wK.A17(A002, A0Q);
    }
}
