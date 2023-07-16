package X;

import com.instagram.model.mediasize.AdditionalCandidates;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.model.mediasize.SpriteSheetInfoCandidates;
import com.instagram.model.mediasize.SpritesheetInfo;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.71C  reason: invalid class name */
public final class AnonymousClass71C {
    public static ImageInfo parseFromJson(MMo mMo) {
        return (ImageInfo) C86104wH.A0e(mMo, 103);
    }

    public static void A00(MMp mMp, ImageInfo imageInfo) {
        mMp.A0J();
        AdditionalCandidates additionalCandidates = imageInfo.A00;
        if (additionalCandidates != null) {
            mMp.A0U("additional_candidates");
            mMp.A0J();
            ExtendedImageUrl extendedImageUrl = additionalCandidates.A00;
            if (extendedImageUrl != null) {
                mMp.A0U("first_frame");
                AnonymousClass71B.A00(mMp, extendedImageUrl);
            }
            ExtendedImageUrl extendedImageUrl2 = additionalCandidates.A01;
            if (extendedImageUrl2 != null) {
                mMp.A0U("igtv_first_frame");
                AnonymousClass71B.A00(mMp, extendedImageUrl2);
            }
            ExtendedImageUrl extendedImageUrl3 = additionalCandidates.A02;
            if (extendedImageUrl3 != null) {
                mMp.A0U("smart_frame");
                AnonymousClass71B.A00(mMp, extendedImageUrl3);
            }
            mMp.A0G();
        }
        SpriteSheetInfoCandidates spriteSheetInfoCandidates = imageInfo.A01;
        if (spriteSheetInfoCandidates != null) {
            mMp.A0U("animated_thumbnail_spritesheet_info_candidates");
            mMp.A0J();
            SpritesheetInfo spritesheetInfo = spriteSheetInfoCandidates.A00;
            if (spritesheetInfo != null) {
                mMp.A0U(GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT);
                C18775AlB.A00(mMp, spritesheetInfo);
            }
            mMp.A0G();
        }
        List list = imageInfo.A05;
        if (list != null) {
            Iterator A0t = C18190wL.A0t(mMp, "candidates", list);
            while (A0t.hasNext()) {
                ExtendedImageUrl extendedImageUrl4 = (ExtendedImageUrl) A0t.next();
                if (extendedImageUrl4 != null) {
                    AnonymousClass71B.A00(mMp, extendedImageUrl4);
                }
            }
            mMp.A0F();
        }
        SpriteSheetInfoCandidates spriteSheetInfoCandidates2 = imageInfo.A02;
        if (spriteSheetInfoCandidates2 != null) {
            mMp.A0U("scrubber_spritesheet_info_candidates");
            mMp.A0J();
            SpritesheetInfo spritesheetInfo2 = spriteSheetInfoCandidates2.A00;
            if (spritesheetInfo2 != null) {
                mMp.A0U(GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT);
                C18775AlB.A00(mMp, spritesheetInfo2);
            }
            mMp.A0G();
        }
        Boolean bool = imageInfo.A03;
        if (bool != null) {
            mMp.A0e("smart_thumbnail_enabled", bool.booleanValue());
        }
        String str = imageInfo.A04;
        if (str != null) {
            mMp.A0d("trace_token", str);
        }
        mMp.A0G();
    }
}
