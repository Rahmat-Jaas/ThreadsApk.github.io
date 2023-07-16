package X;

import com.instagram.api.schemas.BrandedContentBrandTaggingRequestApprovalStatus;
import com.instagram.api.schemas.HasPasswordState;
import com.instagram.api.schemas.IGUserThirdPartyDownloads;
import com.instagram.api.schemas.ProfileTheme;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.FriendshipStatus;
import com.instagram.user.model.MicroUserDict;

/* renamed from: X.3PL  reason: invalid class name */
public final class AnonymousClass3PL {
    public static MicroUserDict parseFromJson(MMo mMo) {
        return (MicroUserDict) AnonymousClass0wJ.A0g(mMo, 55);
    }

    public static void A00(MMp mMp, MicroUserDict microUserDict) {
        mMp.A0J();
        BrandedContentBrandTaggingRequestApprovalStatus brandedContentBrandTaggingRequestApprovalStatus = microUserDict.A00;
        if (brandedContentBrandTaggingRequestApprovalStatus != null) {
            mMp.A0d("bc_approved_partner_status", brandedContentBrandTaggingRequestApprovalStatus.A00);
        }
        Float f = microUserDict.A0B;
        if (f != null) {
            mMp.A0a("closeness_score", f.floatValue());
        }
        String str = microUserDict.A0C;
        if (str != null) {
            mMp.A0d("fbid_v2", str);
        }
        FriendshipStatus friendshipStatus = microUserDict.A05;
        if (friendshipStatus != null) {
            mMp.A0U("friendship_status");
            C41065Lvn.A00(mMp, friendshipStatus);
        }
        String str2 = microUserDict.A0D;
        if (str2 != null) {
            mMp.A0d("full_name", str2);
        }
        ProfileTheme profileTheme = microUserDict.A03;
        if (profileTheme != null) {
            mMp.A0U("group_profile_theme");
            AnonymousClass3KO.A00(mMp, profileTheme);
        }
        Boolean bool = microUserDict.A06;
        if (bool != null) {
            mMp.A0e("has_onboarded_to_text_post_app", bool.booleanValue());
        }
        HasPasswordState hasPasswordState = microUserDict.A01;
        if (hasPasswordState != null) {
            mMp.A0d("has_password", hasPasswordState.A00);
        }
        Boolean bool2 = microUserDict.A07;
        if (bool2 != null) {
            mMp.A0e("is_approved", bool2.booleanValue());
        }
        Boolean bool3 = microUserDict.A08;
        if (bool3 != null) {
            mMp.A0e("is_verified", bool3.booleanValue());
        }
        Boolean bool4 = microUserDict.A09;
        if (bool4 != null) {
            mMp.A0e("live_invite_only_branding_enabled", bool4.booleanValue());
        }
        String str3 = microUserDict.A0E;
        if (str3 != null) {
            mMp.A0d("pk", str3);
        }
        ImageUrl imageUrl = microUserDict.A04;
        if (imageUrl != null) {
            mMp.A0U("profile_pic_url");
            C59533Le.A01(mMp, imageUrl);
        }
        Boolean bool5 = microUserDict.A0A;
        if (bool5 != null) {
            mMp.A0e("show_shoppable_feed", bool5.booleanValue());
        }
        IGUserThirdPartyDownloads iGUserThirdPartyDownloads = microUserDict.A02;
        if (iGUserThirdPartyDownloads != null) {
            mMp.A0d("third_party_downloads_enabled", iGUserThirdPartyDownloads.A00);
        }
        String str4 = microUserDict.A0F;
        if (str4 != null) {
            mMp.A0d(AnonymousClass3Q9.A00(31, 8, 58), str4);
        }
        mMp.A0G();
    }
}
