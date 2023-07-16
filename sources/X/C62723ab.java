package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import ch.boye.httpclientandroidlib.util.LangUtils;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0100000_I2;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S3200000_I2;
import com.facebook.redex.IDxCListenerShape41S0300000_1_I2;
import com.facebook.redex.IDxCListenerShape70S0200000_1_I2;
import com.instagram.api.schemas.FanClubNextStepsCompletionState;
import com.instagram.api.schemas.FanClubNextStepsRecommendationsType;
import com.instagram.api.schemas.FanClubSubscriptionSettingsRecommendationType;
import com.instagram.barcelona.R;
import com.instagram.modal.ModalActivity;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.service.session.UserSession;

/* renamed from: X.3ab  reason: invalid class name and case insensitive filesystem */
public final class C62723ab {
    public final AnonymousClass495 A00;
    public final AnonymousClass3HY A01;
    public final String A02;

    public final EK1 A03(KtCSuperShape0S0100000_I2 ktCSuperShape0S0100000_I2) {
        AnonymousClass1q4 r5;
        AnonymousClass1kC r4;
        AnonymousClass1kC r3;
        int i;
        C04220Ms.A0B(ktCSuperShape0S0100000_I2, 0);
        FanClubSubscriptionSettingsRecommendationType fanClubSubscriptionSettingsRecommendationType = (FanClubSubscriptionSettingsRecommendationType) ktCSuperShape0S0100000_I2.A00;
        String obj = fanClubSubscriptionSettingsRecommendationType.toString();
        AnonymousClass495 r52 = this.A00;
        String str = this.A02;
        C04220Ms.A0B(obj, 2);
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(r52.A00, "ig_fan_club_settings_recommendations_recommendation_impression"), 1205);
        C18230wP.A1H(A0I, "creator_management_settings");
        C18220wO.A1F(A0I, AnonymousClass0wJ.A0d(r52.A01.getUserId()), str, obj);
        A0I.Bb4();
        switch (fanClubSubscriptionSettingsRecommendationType.ordinal()) {
            case 0:
            case 8:
                return null;
            case 1:
                r3 = AnonymousClass1kC.A00(new Object[0], 2131827144);
                r4 = AnonymousClass1kC.A00(new Object[0], 2131827142);
                r5 = new AnonymousClass1q4(R.drawable.instagram_story_pano_outline_24);
                i = 105;
                break;
            case 2:
                r3 = AnonymousClass1kC.A00(new Object[0], 2131827141);
                r4 = AnonymousClass1kC.A00(new Object[0], 2131827140);
                r5 = new AnonymousClass1q4(R.drawable.instagram_app_messenger_pano_outline_24);
                i = 106;
                break;
            case 3:
                r3 = AnonymousClass1kC.A00(new Object[0], 2131827133);
                r4 = AnonymousClass1kC.A00(new Object[0], 2131827132);
                r5 = new AnonymousClass1q4(R.drawable.instagram_reels_pano_outline_24);
                i = 107;
                break;
            case 4:
                r3 = AnonymousClass1kC.A00(new Object[0], 2131827146);
                r4 = AnonymousClass1kC.A00(new Object[0], 2131827145);
                r5 = new AnonymousClass1q4(R.drawable.instagram_circle_play_pano_outline_24);
                i = 108;
                break;
            case 5:
                r3 = AnonymousClass1kC.A00(new Object[0], 2131827135);
                r4 = AnonymousClass1kC.A00(new Object[0], 2131827134);
                r5 = new AnonymousClass1q4(R.drawable.instagram_circle_play_pano_outline_24);
                i = 109;
                break;
            case 6:
                r3 = AnonymousClass1kC.A00(new Object[0], 2131827139);
                r4 = AnonymousClass1kC.A00(new Object[0], 2131827138);
                r5 = new AnonymousClass1q4(R.drawable.instagram_sticker_pano_outline_24);
                i = 110;
                break;
            case 7:
                r3 = AnonymousClass1kC.A00(new Object[0], 2131827137);
                r4 = AnonymousClass1kC.A00(new Object[0], 2131827136);
                r5 = new AnonymousClass1q4(R.drawable.instagram_sticker_pano_outline_24);
                i = 111;
                break;
            case 9:
                r3 = AnonymousClass1kC.A00(new Object[0], 2131827131);
                r4 = AnonymousClass1kC.A00(new Object[0], 2131827130);
                r5 = new AnonymousClass1q4(R.drawable.instagram_money_pano_outline_24);
                i = 112;
                break;
            default:
                throw AnonymousClass4VZ.A00();
        }
        return new EK1(C18200wM.A0R(this, ktCSuperShape0S0100000_I2, i), r3, r4, r5, R.color.fundraiser_sticker_consumption_sheet_donation_disclaimer_bold_text_color, false);
    }

    public final EK1 A04(KtCSuperShape0S3200000_I2 ktCSuperShape0S3200000_I2, Integer num) {
        String str;
        int i;
        C04220Ms.A0B(ktCSuperShape0S3200000_I2, 0);
        Object obj = ktCSuperShape0S3200000_I2.A01;
        if (obj == FanClubNextStepsRecommendationsType.UNRECOGNIZED) {
            return null;
        }
        String obj2 = obj.toString();
        AnonymousClass495 r7 = this.A00;
        String str2 = this.A02;
        C04220Ms.A0B(obj2, 2);
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(r7.A00, "ig_fan_club_settings_recommendations_recommendation_impression"), 1205);
        if (17 - num.intValue() != 0) {
            str = "fan_club_guided_activation";
        } else {
            str = "creator_settings_fan_club_guided_activation";
        }
        C18230wP.A1H(A0I, str);
        C18220wO.A1F(A0I, AnonymousClass0wJ.A0d(r7.A01.getUserId()), str2, obj2);
        A0I.Bb4();
        C57943Dd A002 = AnonymousClass2LU.A00(ktCSuperShape0S3200000_I2.A04);
        C57943Dd A003 = AnonymousClass2LU.A00(ktCSuperShape0S3200000_I2.A02);
        AnonymousClass1q5 r72 = new AnonymousClass1q5(ktCSuperShape0S3200000_I2.A03);
        FanClubNextStepsCompletionState fanClubNextStepsCompletionState = (FanClubNextStepsCompletionState) ktCSuperShape0S3200000_I2.A00;
        int ordinal = fanClubNextStepsCompletionState.ordinal();
        if (ordinal == 1) {
            i = R.color.igds_success;
        } else if (ordinal == 2 || ordinal == 0) {
            i = R.color.fundraiser_sticker_consumption_sheet_donation_disclaimer_bold_text_color;
        } else {
            throw AnonymousClass4VZ.A00();
        }
        return new EK1(new IDxCListenerShape41S0300000_1_I2(39, (Object) num, (Object) ktCSuperShape0S3200000_I2, (Object) this), A002, A003, r72, i, C18180wK.A1Z(fanClubNextStepsCompletionState, FanClubNextStepsCompletionState.COMPLETED));
    }

    public static final void A02(C62723ab r4, Integer num, String str) {
        String str2;
        AnonymousClass495 r3 = r4.A00;
        String str3 = r4.A02;
        AnonymousClass0wJ.A1M(num, 0, str);
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(r3.A00, "ig_fan_club_settings_recommendations_recommendation_tapped"), 1206);
        switch (num.intValue()) {
            case 10:
                str2 = "creator_management_settings";
                break;
            case 11:
                str2 = "subscriber_list";
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                str2 = "removed_subscriber_list";
                break;
            case 13:
                str2 = "feed";
                break;
            case 14:
                str2 = "reels_viewer";
                break;
            case 15:
                str2 = "direct_message";
                break;
            case 16:
                str2 = "live_audience_selector";
                break;
            case LangUtils.HASH_SEED /*17*/:
                str2 = "creator_settings_fan_club_guided_activation";
                break;
            default:
                str2 = "fan_club_guided_activation";
                break;
        }
        C18230wP.A1H(A0I, str2);
        C18220wO.A1F(A0I, AnonymousClass0wJ.A0d(r3.A01.getUserId()), str3, str);
        A0I.Bb4();
    }

    public /* synthetic */ C62723ab(AnonymousClass3HY r3, UserSession userSession, String str) {
        AnonymousClass495 A002 = AnonymousClass2O7.A00(userSession);
        C04220Ms.A0B(A002, 4);
        this.A02 = str;
        this.A01 = r3;
        this.A00 = A002;
    }

    public static int A00(IDxCListenerShape70S0200000_1_I2 iDxCListenerShape70S0200000_1_I2, int i) {
        int A05 = C14030oh.A05(i);
        A01((FanClubSubscriptionSettingsRecommendationType) ((KtCSuperShape0S0100000_I2) iDxCListenerShape70S0200000_1_I2.A00).A00, (C62723ab) iDxCListenerShape70S0200000_1_I2.A01);
        return A05;
    }

    public static final void A01(FanClubSubscriptionSettingsRecommendationType fanClubSubscriptionSettingsRecommendationType, C62723ab r6) {
        String str;
        int i;
        A02(r6, AnonymousClass006.A02, fanClubSubscriptionSettingsRecommendationType.toString());
        AnonymousClass3HY r62 = r6.A01;
        switch (fanClubSubscriptionSettingsRecommendationType.ordinal()) {
            case 1:
                str = "universal_creation_story_camera";
                i = 2;
                break;
            case 2:
                Bundle A09 = C18180wK.A09("entrypoint", AnonymousClass24R.SETTINGS_RECOMMENDATION);
                C63863iT.A08(r62.A01, A09, r62.A04, ModalActivity.class, "creator_messaging_selection_screen");
                return;
            case 3:
                str = "fan_club_exclusive_post_or_reel";
                i = 3;
                break;
            case 4:
                r62.A03.A01(true);
                return;
            case 5:
                r62.A03.A00(true);
                return;
            case 6:
                str = "REEL_USER_PAY_SUBSCRIBE_STORY_STICKER";
                i = 4;
                break;
            case 7:
                str = "reel_user_pay_subscriber_chat_story_sticker";
                i = 5;
                break;
            case 9:
                r62.A01("creator_settings");
                return;
            default:
                return;
        }
        Bundle A06 = C18180wK.A06();
        FragmentActivity fragmentActivity = r62.A01;
        C63863iT A03 = C63863iT.A03(fragmentActivity, A06, r62.A04, TransparentModalActivity.class, str);
        Fragment fragment = r62.A00;
        if (fragment != null) {
            A03.A0J(fragment, i);
        } else {
            A03.A0H(fragmentActivity, i);
        }
    }
}
