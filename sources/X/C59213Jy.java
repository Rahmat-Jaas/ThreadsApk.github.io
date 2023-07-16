package X;

import com.instagram.api.schemas.FanClubFanConsiderationPageFeatureEligibilityResponse;
import com.instagram.api.schemas.FanClubInfoDict;

/* renamed from: X.3Jy  reason: invalid class name and case insensitive filesystem */
public final class C59213Jy {
    public static FanClubInfoDict parseFromJson(MMo mMo) {
        return (FanClubInfoDict) AnonymousClass0wJ.A0f(mMo, 85);
    }

    public static void A00(MMp mMp, FanClubInfoDict fanClubInfoDict) {
        mMp.A0J();
        Boolean bool = fanClubInfoDict.A01;
        if (bool != null) {
            mMp.A0e("autosave_to_exclusive_highlight", bool.booleanValue());
        }
        Integer num = fanClubInfoDict.A04;
        if (num != null) {
            mMp.A0b("connected_member_count", num.intValue());
        }
        String str = fanClubInfoDict.A06;
        if (str != null) {
            mMp.A0d("fan_club_id", str);
        }
        String str2 = fanClubInfoDict.A07;
        if (str2 != null) {
            mMp.A0d("fan_club_name", str2);
        }
        FanClubFanConsiderationPageFeatureEligibilityResponse fanClubFanConsiderationPageFeatureEligibilityResponse = fanClubInfoDict.A00;
        if (fanClubFanConsiderationPageFeatureEligibilityResponse != null) {
            mMp.A0U("fan_consideration_page_revamp_eligiblity");
            mMp.A0J();
            mMp.A0e("should_show_content_preview", fanClubFanConsiderationPageFeatureEligibilityResponse.A00);
            mMp.A0e("should_show_social_context", fanClubFanConsiderationPageFeatureEligibilityResponse.A01);
            mMp.A0G();
        }
        Boolean bool2 = fanClubInfoDict.A02;
        if (bool2 != null) {
            mMp.A0e("is_fan_club_gifting_eligible", bool2.booleanValue());
        }
        Boolean bool3 = fanClubInfoDict.A03;
        if (bool3 != null) {
            mMp.A0e("is_fan_club_referral_eligible", bool3.booleanValue());
        }
        Integer num2 = fanClubInfoDict.A05;
        if (num2 != null) {
            mMp.A0b("subscriber_count", num2.intValue());
        }
        mMp.A0G();
    }
}
